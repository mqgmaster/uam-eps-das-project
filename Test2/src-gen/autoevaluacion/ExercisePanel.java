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
}