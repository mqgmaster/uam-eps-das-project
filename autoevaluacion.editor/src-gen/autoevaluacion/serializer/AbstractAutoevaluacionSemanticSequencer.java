package autoevaluacion.serializer;

import Autoevaluacion.AutoevaluacionPackage;
import Autoevaluacion.Clasico;
import Autoevaluacion.Ejercicio;
import Autoevaluacion.Ordenacion;
import Autoevaluacion.RespuestaMultiple;
import Autoevaluacion.RespuestaUnica;
import Autoevaluacion.TextoLibre;
import Autoevaluacion.Wizard;
import Autoevaluacion.WizardAdaptativo;
import autoevaluacion.services.AutoevaluacionGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractAutoevaluacionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AutoevaluacionGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AutoevaluacionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AutoevaluacionPackage.CLASICO:
				if(context == grammarAccess.getClasicoRule() ||
				   context == grammarAccess.getHojaRule()) {
					sequence_Clasico(context, (Clasico) semanticObject); 
					return; 
				}
				else break;
			case AutoevaluacionPackage.EJERCICIO:
				if(context == grammarAccess.getEjercicioRule()) {
					sequence_Ejercicio(context, (Ejercicio) semanticObject); 
					return; 
				}
				else break;
			case AutoevaluacionPackage.ORDENACION:
				if(context == grammarAccess.getOrdenacionRule() ||
				   context == grammarAccess.getRespuestaRule()) {
					sequence_Ordenacion(context, (Ordenacion) semanticObject); 
					return; 
				}
				else break;
			case AutoevaluacionPackage.RESPUESTA_MULTIPLE:
				if(context == grammarAccess.getRespuestaRule() ||
				   context == grammarAccess.getRespuestaMultipleRule()) {
					sequence_RespuestaMultiple(context, (RespuestaMultiple) semanticObject); 
					return; 
				}
				else break;
			case AutoevaluacionPackage.RESPUESTA_UNICA:
				if(context == grammarAccess.getRespuestaRule() ||
				   context == grammarAccess.getRespuestaUnicaRule()) {
					sequence_RespuestaUnica(context, (RespuestaUnica) semanticObject); 
					return; 
				}
				else break;
			case AutoevaluacionPackage.TEXTO_LIBRE:
				if(context == grammarAccess.getRespuestaRule() ||
				   context == grammarAccess.getTextoLibreRule()) {
					sequence_TextoLibre(context, (TextoLibre) semanticObject); 
					return; 
				}
				else break;
			case AutoevaluacionPackage.WIZARD:
				if(context == grammarAccess.getHojaRule() ||
				   context == grammarAccess.getWizardRule()) {
					sequence_Wizard(context, (Wizard) semanticObject); 
					return; 
				}
				else break;
			case AutoevaluacionPackage.WIZARD_ADAPTATIVO:
				if(context == grammarAccess.getHojaRule() ||
				   context == grammarAccess.getWizardAdaptativoRule()) {
					sequence_WizardAdaptativo(context, (WizardAdaptativo) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (puntuacion=EDouble penalizacion=EDouble ejercicios+=Ejercicio ejercicios+=Ejercicio*)
	 */
	protected void sequence_Clasico(EObject context, Clasico semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         enunciado=EString 
	 *         puntuacionEj=EDouble? 
	 *         categoria=EString 
	 *         order=EInt 
	 *         respuesta=Respuesta
	 *     )
	 */
	protected void sequence_Ejercicio(EObject context, Ejercicio semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((correctas+=EString correctas+=EString*)? (alternativas+=EString alternativas+=EString*)?)
	 */
	protected void sequence_Ordenacion(EObject context, Ordenacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((correctas+=EString correctas+=EString*)? (alternativas+=EString alternativas+=EString*)?)
	 */
	protected void sequence_RespuestaMultiple(EObject context, RespuestaMultiple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((correctas+=EString correctas+=EString*)? (alternativas+=EString alternativas+=EString*)?)
	 */
	protected void sequence_RespuestaUnica(EObject context, RespuestaUnica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((correctas+=EString correctas+=EString*)? (alternativas+=EString alternativas+=EString*)?)
	 */
	protected void sequence_TextoLibre(EObject context, TextoLibre semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (puntuacion=EDouble penalizacion=EDouble ejercicios+=Ejercicio ejercicios+=Ejercicio*)
	 */
	protected void sequence_WizardAdaptativo(EObject context, WizardAdaptativo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (puntuacion=EDouble penalizacion=EDouble ejercicios+=Ejercicio ejercicios+=Ejercicio*)
	 */
	protected void sequence_Wizard(EObject context, Wizard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
