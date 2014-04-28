/*
 * generated by Xtext
 */
package autoevaluacion.generator

import Autoevaluacion.Clasico
import Autoevaluacion.Hoja
import Autoevaluacion.Ordenacion
import Autoevaluacion.RespuestaMultiple
import Autoevaluacion.RespuestaUnica
import Autoevaluacion.TextoLibre
import Autoevaluacion.Wizard
import Autoevaluacion.WizardAdaptativo
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AutoevaluacionGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	
		val lista = newArrayList();
		var hoja = resource.contents.head as Hoja;
		hoja.ejercicios.forEach[elem,index|
			if(!lista.contains(elem)){
				lista.add(elem);
			}
		]
			
		//Genera el Main
		fsa.generateFile("main/Main.java", Main(resource.contents.head as Hoja));
		//Genera Answer
		fsa.generateFile("autoevaluacion/answer/Answer.java", Answer());
		fsa.generateFile("autoevaluacion/answer/MultipleAnswer.java", MultipleAnswer());
		fsa.generateFile("autoevaluacion/answer/UniqueAnswer.java", UniqueAnswer());
		fsa.generateFile("autoevaluacion/answer/WrittenAnswer.java", WrittenAnswer());
		//Genera Autoevaluacion
		fsa.generateFile("autoevaluacion/Exercise.java", Exercise());
		fsa.generateFile("autoevaluacion/ExercisePanel.java", ExercisePanel());
		fsa.generateFile("autoevaluacion/Panel.java", Panel());
		fsa.generateFile("autoevaluacion/Autoevaluacion.java", compile(resource.contents.head as Hoja, lista));
		
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
	
	def Main(Hoja h)'''
package main;

import autoevaluacion.Autoevaluacion;

public class Main {
	
	public static void main(String[] args){
		Autoevaluacion autoevaluacion = new Autoevaluacion(«h.puntuacion»,«h.penalizacion»);
		autoevaluacion.mostrar();
	}
}'''

	def Answer()'''
package autoevaluacion.answer;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JPanel;

public abstract class Answer {
	private ArrayList<String> correctas = new ArrayList<String>();
	private ArrayList<String> alternativas = new ArrayList<String>();
	private ArrayList<String> seleccionadas = new ArrayList<String>();
	
	public static enum AnswerType {
		UNIQUE,
		MULTIPLE,
		WRITTEN,
		ORDINATION};
	
	public Answer(String[] correctas,
			String[] alternativas) {
		super();
		this.correctas = new ArrayList<String>(Arrays.asList(correctas));
		this.alternativas = new ArrayList<String>(Arrays.asList(alternativas));
		this.seleccionadas = new ArrayList<String>();
	}
	public ArrayList<String> getCorrectas() {
		return correctas;
	}
	public void setCorrectas(ArrayList<String> correctas) {
		this.correctas = correctas;
	}
	public ArrayList<String> getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(ArrayList<String> alternativas) {
		this.alternativas = alternativas;
	}
	public ArrayList<String> getSeleccionadas() {
		return seleccionadas;
	}
	public void setSeleccionadas(ArrayList<String> seleccionadas) {
		this.seleccionadas = seleccionadas;
	}
	public abstract JPanel createComponent();
	public abstract boolean corrige();
	public abstract JPanel muestraCorreccion();
}'''

	def MultipleAnswer()'''
	package autoevaluacion.answer;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MultipleAnswer extends Answer implements ActionListener {
	private ArrayList<JCheckBox> group = new ArrayList<JCheckBox>();

	public MultipleAnswer(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
	}
	
	@Override
	public JPanel createComponent(){
		ArrayList<String> resp = new ArrayList<String>();
		resp.addAll(getCorrectas());
		resp.addAll(getAlternativas());
		Collections.shuffle(resp);
		
		group = new ArrayList<JCheckBox>();
		JPanel panel = new JPanel(new GridLayout(resp.size(),1));
		for(String r : resp){
			JCheckBox rb = new JCheckBox(r);
			rb.setActionCommand(r);
			rb.addActionListener((ActionListener) this);
			group.add(rb);
			panel.add(rb);
		}
		
		return panel;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(getSeleccionadas().contains(e.getActionCommand())){
			getSeleccionadas().remove(e.getActionCommand());
		}else{
			getSeleccionadas().add(e.getActionCommand());
		}
		/*
		ArrayList<String> selec = new ArrayList<>();
		for (int i = 0; i < group.size(); i++){
		    JCheckBox cb = group.get(i);
		    if (cb.isSelected()){
				selec.add(cb.getActionCommand());
		    }
		}
		setSeleccionadas(selec);
		*/
	}

	@Override
	public boolean corrige(){
		if(getSeleccionadas().isEmpty() || getCorrectas().isEmpty())
			return false;
		int flag = 0;
		for(String s : getSeleccionadas()){
			if(getCorrectas().contains(s)){
				flag++;
			}
		}
		if(flag==getCorrectas().size())
			return true;
		return false;
	}
	
	@Override
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(getCorrectas().size()+getSeleccionadas().size(),1));
		for(String c : getCorrectas()){
			JLabel correcta = new JLabel(c);
			correcta.setForeground(Color.green);
			panel.add(correcta);
		}
		for(String  s: getSeleccionadas()){
			if(!getCorrectas().contains(s)){
				JLabel seleccionada = new JLabel(s);
				seleccionada.setForeground(Color.red);
				panel.add(seleccionada);
			}
		}
		return panel;
	}
}'''

	def UniqueAnswer()'''
package autoevaluacion.answer;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class UniqueAnswer extends Answer implements ActionListener {
	
	public UniqueAnswer(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
	}

	@Override
	public JPanel createComponent(){
		ArrayList<String> resp = new ArrayList<String>();
		resp.addAll(getCorrectas());
		resp.addAll(getAlternativas());
		Collections.shuffle(resp);
		
		ButtonGroup group = new ButtonGroup();
		JPanel panel = new JPanel(new GridLayout(resp.size(),1));
		for(String r : resp){
			JRadioButton rb = new JRadioButton(r);
			rb.setActionCommand(r);
			rb.addActionListener((ActionListener) this);
			group.add(rb);
			panel.add(rb);
		}
		
		return panel;
	}
	
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> selec = new ArrayList<>();
		selec.add(e.getActionCommand());
		setSeleccionadas(selec);
		
		/*if(!getSeleccionadas().contains(e.getActionCommand())){
			getSeleccionadas().clear();
			getSeleccionadas().add(e.getActionCommand());
		}*/
	}
	
	@Override
	public boolean corrige(){
		if(getSeleccionadas().isEmpty() || getCorrectas().isEmpty())
			return false;
		
		if(getCorrectas().contains(getSeleccionadas().get(0))){
			return true;
		}
		return false;
	}
	
	@Override
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(2,1));
		JLabel correcta = new JLabel(getCorrectas().get(0));
		correcta.setForeground(Color.green);
		panel.add(correcta);
		JLabel seleccionada = new JLabel(getSeleccionadas().get(0));
		seleccionada.setForeground(Color.red);
		panel.add(seleccionada);
		return panel;
	}
}'''

	def WrittenAnswer()'''
package autoevaluacion.answer;

import javax.swing.JPanel;

public class WrittenAnswer extends Answer {

	

	public WrittenAnswer(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
	}

	@Override
	public JPanel createComponent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean corrige() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JPanel muestraCorreccion() {
		// TODO Auto-generated method stub
		return null;
	}
	
}'''

	def Exercise()'''
package autoevaluacion;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import autoevaluacion.answer.Answer;
import autoevaluacion.answer.MultipleAnswer;
import autoevaluacion.answer.UniqueAnswer;
import autoevaluacion.answer.WrittenAnswer;
import autoevaluacion.answer.Answer.AnswerType;

public class Exercise implements Comparable<Exercise> {
	
	private String name;
	private String enunciado;
	private double puntuacionEj;
	private String categoria;
	private Integer orden;
	private Answer respuestas;
	
	public Exercise(String name, String enunciado, double puntuacionEj,
			String categoria, int orden,String[] correctas,String[] alternativas, AnswerType tipo) {
		super();
		this.name = name;
		this.enunciado = enunciado;
		this.puntuacionEj = puntuacionEj;
		this.categoria = categoria;
		this.orden = orden;
		switch(tipo){
		case UNIQUE:
			this.respuestas = new UniqueAnswer(correctas, alternativas);
			break;
		case MULTIPLE:
			this.respuestas = new MultipleAnswer(correctas, alternativas);
			break;
		case WRITTEN:
			this.respuestas = new WrittenAnswer(correctas, alternativas);
			break;
		/*case Ordenacion:
			this.respuestas = new Ordenacion(correctas, alternativas);
			break;*/
		default:
			
		}
		
	}
	
	public JPanel createComponent(){
		JPanel panel = new JPanel(new GridLayout(2,1));
		JPanel enun = new JPanel(new GridLayout(2,1));
		JLabel n = new JLabel(name+" "+orden+" :");
		enun.add(n);
		JLabel e = new JLabel(enunciado);
		enun.add(e);
		panel.add(enun);
		panel.add(respuestas.createComponent());
		
		return panel;
	}
	
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(2,1));
		JPanel enun = new JPanel(new GridLayout(2,1));
		JLabel n = new JLabel(name+" "+orden+" :");
		enun.add(n);
		JLabel e = new JLabel(enunciado);
		enun.add(e);
		panel.add(enun);
		panel.add(respuestas.muestraCorreccion());
		
		return panel;
	}
	
	public double corrige(double penalizacion){
		if(respuestas.corrige())
			return puntuacionEj;
		return puntuacionEj*(-penalizacion);
	}

	@Override
	public int compareTo(Exercise o) {
		return orden.compareTo(o.orden);
	}
	
	public boolean isAnswered(){
		if(respuestas.getSeleccionadas().isEmpty())
			return false;
		return true;
	}
	
	public boolean isCorrect() {
		return respuestas.corrige();
	}
}'''

	def ExercisePanel()'''
package autoevaluacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ExercisePanel extends Panel {
	
	//private JScrollPane scrollP;
	private PanelType type;
	private JPanel exercisesContainer = new JPanel();
	
	public static enum PanelType {
		CLASSIC,
		WIZARD,
		WIZARD_ADAPTATIVE};
		
	private ArrayList<Exercise> exercises = new ArrayList<>();
	private ArrayList<Integer> answeredExercises = new ArrayList<>();

	public ExercisePanel(String name, PanelType type) {
		super(name);
		this.type = type;
	}
	
	public ArrayList<Exercise> getAllExercises() {
		return exercises;
	}
	
	public void addExercise(Exercise e){
		exercises.add(e);
	}
	
	@Override
	public void setupView(){
		this.add(exercisesContainer);
		switch(type){
			case CLASSIC :
			case WIZARD:
				showAllExercises();
				break;
			case WIZARD_ADAPTATIVE:
				showRamdomExercise();
		}
		
		super.setupView();
	}

	private void showAllExercises() {
		Collections.sort(exercises);
		for(Exercise e: exercises)
			exercisesContainer.add(e.createComponent());
	}
	
	private boolean showRamdomExercise() {
		for (int i=0; i<exercises.size(); i++) {
			if (!answeredExercises.contains(i)) {
				exercisesContainer.add(exercises.get(i).createComponent());
				answeredExercises.add(i);
				exercisesContainer.updateUI();
				return true;
			}
		}
		return false;
	}
	
	private void clearExercisesView() {
		exercisesContainer.removeAll();
	}

	public Exercise getLastAnswered() {
		return exercises.get(answeredExercises.get(answeredExercises.size()-1));
	}
	
	public void addNextButton(String label, final ActionListener action) {
		switch(type) {
			case CLASSIC :
			case WIZARD:
				super.addButton(label, action);
				break;
			case WIZARD_ADAPTATIVE:
				super.addButton(label, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (getLastAnswered().isCorrect()) {
							action.actionPerformed(e);
						} else {
							ExercisePanel.this.clearExercisesView();
							if (!ExercisePanel.this.showRamdomExercise()) {
								action.actionPerformed(e);
							}
						}
					}
				});
		}
	}
}'''

	def Panel()'''
package autoevaluacion;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	
	protected JPanel buttonContainer = new JPanel();
	
	public Panel(String name) {
		this.setName(name);
	}
	
	public void setupView() {
		this.add(buttonContainer);
	}
	
	public void addButton(String label, ActionListener action) {
		JButton button = new JButton(label);
		buttonContainer.add(button);
		button.addActionListener(action);
	}

}
'''	

	def compile(Hoja h, ArrayList categoria)'''
package autoevaluacion;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import autoevaluacion.ExercisePanel.PanelType;
import autoevaluacion.answer.Answer.AnswerType;

@SuppressWarnings("serial")
public class Autoevaluacion extends JFrame {
	private double nota;
	private double puntuacionStandard;
	private double penalizacion;
	private JPanel mainContainer = new JPanel(new CardLayout());
	private ArrayList<ExercisePanel> exercisePanels = new ArrayList<>();
	
	public Autoevaluacion (double puntuacionStandard, final double penalizacion) {
		super ("Autoevaluacion");
		this.puntuacionStandard = puntuacionStandard;
		this.penalizacion = penalizacion;
		«IF h instanceof Clasico»
		//Crea una pantalla
		final ExercisePanel pe = new ExercisePanel("clasico", PanelType.CLASSIC);
		
		//Anade ejercicios
		«FOR e : h.ejercicios»
		pe.addExercise(new Exercise(
				"«e.name»", 
				"«e.enunciado»", 
				«e.order», 
				"«e.categoria»",
				«IF e.puntuacionEj.naN»
				«h.puntuacion»,
				«ELSE»
				«e.puntuacionEj»,
				«ENDIF»
				
				new String[]{
				«FOR c : e.respuesta.correctas»
				«IF e.respuesta.correctas.indexOf(c) == e.respuesta.correctas.size-1»
				"«c»"
				«ELSE»
				"«c»",
				«ENDIF»
				«ENDFOR»
				},
				new String[]{
				«FOR a : e.respuesta.alternativas»
				«IF e.respuesta.alternativas.indexOf(a) == e.respuesta.alternativas.size-1»
				"«a»"
				«ELSE»
				"«a»",
				«ENDIF»
				«ENDFOR»
				},
				
				«IF e.respuesta instanceof RespuestaUnica»
				AnswerType.UNIQUE
				«ELSEIF e.respuesta instanceof RespuestaMultiple»
				AnswerType.MULTIPLE
				«ELSEIF e.respuesta instanceof TextoLibre»
				AnswerType.WRITTEN
				«ELSEIF e.respuesta instanceof Ordenacion»
				AnswerType.ORDINATION
				«ENDIF»
				));
		«ENDFOR»
		
		//Anade el boton de correccion
		pe2.addNextButton("Corregir", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Panel panel = createFinalPanel();
				addPanel(panel);
				showPanel(panel);
			}
		});
		
		addExercisePanel(pe);
		
		//Comienza en la pantalla inicial
		showPanel(pe);
		// añadir panel a la ventana
		getContentPane().add(mainContainer);
		
		
		«ELSEIF h instanceof Wizard»
		//Crea pantallas
		«FOR c : categoria»		
		final ExercisePanel p«c» = new ExercisePanel("«c»", PanelType.WIZARD);
		addExercisePanel(p«c»);
		«ENDFOR»
		
		//Anade ejercicios
		«FOR e : h.ejercicios»
		p«e.categoria».addExercise(new Exercise(
				"«e.name»", 
				"«e.enunciado»", 
				«e.order», 
				"«e.categoria»",
				«IF e.puntuacionEj.naN»
				«h.puntuacion»,
				«ELSE»
				«e.puntuacionEj»,
				«ENDIF»
				
				new String[]{
				«FOR c : e.respuesta.correctas»
				«IF e.respuesta.correctas.indexOf(c) == e.respuesta.correctas.size-1»
				"«c»"
				«ELSE»
				"«c»",
				«ENDIF»
				«ENDFOR»
				},
				new String[]{
				«FOR a : e.respuesta.alternativas»
				«IF e.respuesta.alternativas.indexOf(a) == e.respuesta.alternativas.size-1»
				"«a»"
				«ELSE»
				"«a»",
				«ENDIF»
				«ENDFOR»
				},
				
				«IF e.respuesta instanceof RespuestaUnica»
				AnswerType.UNIQUE
				«ELSEIF e.respuesta instanceof RespuestaMultiple»
				AnswerType.MULTIPLE
				«ELSEIF e.respuesta instanceof TextoLibre»
				AnswerType.WRITTEN
				«ELSEIF e.respuesta instanceof Ordenacion»
				AnswerType.ORDINATION
				«ENDIF»
				));
		«ENDFOR»
		
		//Anade boton siguiente
		«FOR c : categoria»
		«IF categoria.indexOf(c)==categoria.size-1»
		p«c».addNextButton("Corregir", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Panel panel = createFinalPanel();
				addPanel(panel);
				showPanel(panel);
			}
		});
		«ELSE»
		p«c».addNextButton("Proxima", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				showPanel(p«categoria.get(categoria.indexOf(c)+1)»);
			}
		});
		«ENDIF»
		«ENDFOR»
		
		
		//Comienza en la pantalla inicial
		showPanel(p«categoria.get(0)»);
		// añadir panel a la ventana
		getContentPane().add(mainContainer);
		
		«ELSEIF h instanceof WizardAdaptativo»
		«ENDIF»
		
	}
	
	public Panel createFinalPanel() {
		Panel panel = new Panel("Nota");
		calculaNota(panel);
		JLabel n = new JLabel("Nota : "+nota);
		panel.add(n);
		panel.addButton("Salir", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Autoevaluacion.this.setVisible(false);
				Autoevaluacion.this.dispose();
			}
		});
		return panel;
	}
	
	public void addExercisePanel(ExercisePanel ep) {
		exercisePanels.add(ep);
		addPanel(ep);
	}
	
	public void addPanel(Panel panel) {
		panel.setupView();
		mainContainer.add(panel, panel.getName());
	}
	
	public void showPanel(Panel panel) {
		((CardLayout)mainContainer.getLayout()).show(mainContainer, panel.getName());
	}

	public void mostrar() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	 
	public void calculaNota(Panel pantalla) {
		nota = 0.0;
		for (ExercisePanel pe : exercisePanels) {
			for (Exercise e : pe.getAllExercises()) {
				if(e.isAnswered()){
					double c = e.corrige(penalizacion);
					nota += c;
					if (c <= 0) {
						pantalla.add(e.muestraCorreccion());
					}
				}
			}
		}
	}
}
'''

}
