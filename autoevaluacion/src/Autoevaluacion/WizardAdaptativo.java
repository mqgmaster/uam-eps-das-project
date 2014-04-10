/**
 */
package Autoevaluacion;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard Adaptativo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Autoevaluacion.WizardAdaptativo#getEjerciciosRespondidos <em>Ejercicios Respondidos</em>}</li>
 * </ul>
 * </p>
 *
 * @see Autoevaluacion.AutoevaluacionPackage#getWizardAdaptativo()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='respOnce'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot respOnce='\n\t\t\tejerciciosRespondidos->isUnique(name)'"
 * @generated
 */
public interface WizardAdaptativo extends Hoja {
	/**
	 * Returns the value of the '<em><b>Ejercicios Respondidos</b></em>' reference list.
	 * The list contents are of type {@link Autoevaluacion.Ejercicio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejercicios Respondidos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejercicios Respondidos</em>' reference list.
	 * @see Autoevaluacion.AutoevaluacionPackage#getWizardAdaptativo_EjerciciosRespondidos()
	 * @model
	 * @generated
	 */
	EList<Ejercicio> getEjerciciosRespondidos();

} // WizardAdaptativo
