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
			if(!lista.contains(elem.categoria)){
				lista.add(elem.categoria);
			}
		]
			
		//Genera el Main
		fsa.generateFile("main/Main.java", Main(resource.contents.head as Hoja));
		
		//Genera Answer
		fsa.generateFile("autoevaluacion/answer/Answer.java", Answer());
		fsa.generateFile("autoevaluacion/answer/MultipleAnswer.java", MultipleAnswer());
		fsa.generateFile("autoevaluacion/answer/UniqueAnswer.java", UniqueAnswer());
		fsa.generateFile("autoevaluacion/answer/WrittenAnswer.java", WrittenAnswer());
		fsa.generateFile("autoevaluacion/answer/OrdinationAnswer.java", OrdinationAnswer());
		fsa.generateFile("autoevaluacion/answer/OrdinationItem.java", OrdinationItem());
		
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
	
	public boolean isAnswered() {
		if(seleccionadas.isEmpty())
			return false;
		return true;
	}
	
	public abstract JPanel createComponent();
	public abstract boolean corrige();
	public abstract JPanel muestraCorreccion();
}
'''

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
}
'''

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

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class WrittenAnswer extends Answer {
	
	private final JTextArea textArea = new JTextArea(2,2);

	public WrittenAnswer(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
	}

	@Override
	public JPanel createComponent(){
		JPanel panel = new JPanel(new GridLayout(getCorrectas().size(),1));
		panel.add(textArea);
		return panel;
	}
	
	@Override
	public boolean corrige(){
		return getCorrectas().contains(textArea.getText());
	}
	
	public boolean isAnswered() {
		return !textArea.getText().trim().isEmpty();
	}
	
	@Override
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(2,1));
		JLabel correcta = new JLabel(getCorrectas().get(0));
		correcta.setForeground(Color.green);
		panel.add(correcta);
		JLabel written = new JLabel(textArea.getText());
		written.setForeground(Color.red);
		panel.add(written);
		return panel;
	}
}'''

	def OrdinationAnswer()'''
package autoevaluacion.answer;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrdinationAnswer extends Answer {
	
	private final ArrayList<OrdinationItem> answersList = new ArrayList<>();

	public OrdinationAnswer(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
	}

	@Override
	public JPanel createComponent(){
		ArrayList<String> resp = new ArrayList<String>();
		resp.addAll(getCorrectas());
		Collections.shuffle(resp);
		
		OrdinationItem item;
		JPanel panel = new JPanel(new GridLayout(getCorrectas().size(),1));
		
		for(String r : resp){
			item = new OrdinationItem(r);
			answersList.add(item);
			panel.add(item);
		}
		
		return panel;
	}
	
	@Override
	public boolean corrige() {
		Collections.sort(answersList);
		Set<OrdinationItem> answersSet = new HashSet<>(answersList);
		if (answersSet.size() != answersList.size()) {
			return false;
		}
		for (int i=0;i<answersList.size();i++) {
			if (answersList.get(i).getAnswerPosition().isEmpty()) {
				return false;
			}
			if (!answersList.get(i).getAnswerText().equals(getCorrectas().get(i))) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean isAnswered() {
		for (OrdinationItem item : answersList) {
			if (!item.getAnswerPosition().isEmpty()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(getCorrectas().size(),1));
		for (int i=0;i<answersList.size();i++) {
			JLabel correcta = new JLabel(answersList.get(i).getAnswerText());
			correcta.setForeground(Color.green);
			panel.add(correcta);
			JLabel user = new JLabel(getCorrectas().get(i));
			if (answersList.get(i).getAnswerText().equals(getCorrectas().get(i))) {
				user.setForeground(Color.green);
			} else {
				user.setForeground(Color.red);
			}
			panel.add(user);
		}
		return panel;
	}
}'''

	def OrdinationItem()'''
package autoevaluacion.answer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class OrdinationItem extends JPanel implements Comparable<OrdinationItem> {
	
	private final JTextArea answerPosition = new JTextArea(1,2);
	private final JLabel answerLabel = new JLabel();
	
	public OrdinationItem(String answerText) {
		super();
		this.answerLabel.setText(answerText);
		this.add(answerPosition);
		this.add(answerLabel);
	}

	@Override
	public int compareTo(OrdinationItem another) {
		return this.getAnswerPosition().compareTo(another.getAnswerPosition());
	}
	
	@Override
	public boolean equals(Object another) {
		if (another instanceof OrdinationItem) {
			if (((OrdinationItem) another).getAnswerPosition().equals(this.getAnswerPosition())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getAnswerPosition().hashCode();
	}

	public String getAnswerPosition() {
		return answerPosition.getText();
	}
	
	public String getAnswerText() {
		return answerLabel.getText();
	}
}'''


	def Exercise()'''
package autoevaluacion;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import autoevaluacion.answer.Answer;
import autoevaluacion.answer.MultipleAnswer;
import autoevaluacion.answer.OrdinationAnswer;
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
		case ORDINATION:
			this.respuestas = new OrdinationAnswer(correctas, alternativas);
			break;
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
		return respuestas.isAnswered();
	}
	
	public boolean isCorrect() {
		return respuestas.corrige();
	}
}
'''

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
				showNewExercise();
		}
		
		super.setupView();
	}

	private void showAllExercises() {
		Collections.sort(exercises);
		for(Exercise e: exercises)
			exercisesContainer.add(e.createComponent());
	}
	
	private boolean showNewExercise() {
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
							if (!ExercisePanel.this.showNewExercise()) {
								action.actionPerformed(e);
							}
						}
					}
				});
		}
	}
}
'''

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

}'''	

	def compile(Hoja h, ArrayList<String> categoria)'''
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
				«IF e.puntuacionEj.equals(0.0)»
				«h.puntuacion»,
				«ELSE»
				«e.puntuacionEj»,
				«ENDIF» 
				"«e.categoria»",
				«e.order», 
				new String[]{
				«IF e.respuesta instanceof Ordenacion»
				«FOR s : e.respuesta.correctas.get(0).split("#")»
				«IF e.respuesta.correctas.get(0).split("#").indexOf(s) == e.respuesta.correctas.get(0).split("#").size-1»
				"«s»"
				«ELSE»
				"«s»",
				«ENDIF»
				«ENDFOR»
				«ELSE»
				«FOR c : e.respuesta.correctas»
				«IF e.respuesta.correctas.indexOf(c) == e.respuesta.correctas.size-1»
				"«c»"
				«ELSE»
				"«c»",
				«ENDIF»
				«ENDFOR»
				«ENDIF»
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
		pe.addNextButton("Corregir", new ActionListener() {
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
		// anadir panel a la ventana
		getContentPane().add(mainContainer);
		
		
		«ELSEIF h instanceof Wizard»
		//Crea pantallas
		«FOR c : categoria»		
		final ExercisePanel p«c» = new ExercisePanel("«c»", PanelType.WIZARD);
		«ENDFOR»
		
		//Anade ejercicios
		«FOR e : h.ejercicios»
		p«e.categoria».addExercise(new Exercise(
				"«e.name»", 
				"«e.enunciado»", 
				«IF e.puntuacionEj.equals(0.0)»
				«h.puntuacion»,
				«ELSE»
				«e.puntuacionEj»,
				«ENDIF»
				"«e.categoria»",
				«e.order»,
				new String[]{
				«IF e.respuesta instanceof Ordenacion»
				«FOR s : e.respuesta.correctas.get(0).split("#")»
				«IF e.respuesta.correctas.get(0).split("#").indexOf(s) == e.respuesta.correctas.get(0).split("#").size-1»
				"«s»"
				«ELSE»
				"«s»",
				«ENDIF»
				«ENDFOR»
				«ELSE»
				«FOR c : e.respuesta.correctas»
				«IF e.respuesta.correctas.indexOf(c) == e.respuesta.correctas.size-1»
				"«c»"
				«ELSE»
				"«c»",
				«ENDIF»
				«ENDFOR»
				«ENDIF»
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
		
		«FOR c : categoria»
		addExercisePanel(p«c»);
		«ENDFOR»
		
		//Comienza en la pantalla inicial
		showPanel(p«categoria.get(0)»);
		// anadir panel a la ventana
		getContentPane().add(mainContainer);
		
		«ELSEIF h instanceof WizardAdaptativo»
		//Crea pantallas
		«FOR c : categoria»		
		final ExercisePanel p«c» = new ExercisePanel("«c»", PanelType.WIZARD_ADAPTATIVE);
		«ENDFOR»
		
		//Anade ejercicios
		«FOR e : h.ejercicios»
		p«e.categoria».addExercise(new Exercise(
				"«e.name»", 
				"«e.enunciado»", 
				«IF e.puntuacionEj.equals(0.0)»
				«h.puntuacion»,
				«ELSE»
				«e.puntuacionEj»,
				«ENDIF»
				"«e.categoria»",
				«e.order»,
				new String[]{
				«IF e.respuesta instanceof Ordenacion»
				«FOR s : e.respuesta.correctas.get(0).split("#")»
				«IF e.respuesta.correctas.get(0).split("#").indexOf(s) == e.respuesta.correctas.get(0).split("#").size-1»
				"«s»"
				«ELSE»
				"«s»",
				«ENDIF»
				«ENDFOR»
				«ELSE»
				«FOR c : e.respuesta.correctas»
				«IF e.respuesta.correctas.indexOf(c) == e.respuesta.correctas.size-1»
				"«c»"
				«ELSE»
				"«c»",
				«ENDIF»
				«ENDFOR»
				«ENDIF»
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
		
		«FOR c : categoria»
		addExercisePanel(p«c»);
		«ENDFOR»
		
		//Comienza en la pantalla inicial
		showPanel(p«categoria.get(0)»);
		// anadir panel a la ventana
		getContentPane().add(mainContainer);
		
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
