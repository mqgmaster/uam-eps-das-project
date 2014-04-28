/**
 */
package Autoevaluacion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Respuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Autoevaluacion.Respuesta#getCorrectas <em>Correctas</em>}</li>
 *   <li>{@link Autoevaluacion.Respuesta#getAlternativas <em>Alternativas</em>}</li>
 * </ul>
 * </p>
 *
 * @see Autoevaluacion.AutoevaluacionPackage#getRespuesta()
 * @model abstract="true"
 * @generated
 */
public interface Respuesta extends EObject {
	/**
	 * Returns the value of the '<em><b>Correctas</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correctas</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correctas</em>' attribute list.
	 * @see Autoevaluacion.AutoevaluacionPackage#getRespuesta_Correctas()
	 * @model
	 * @generated
	 */
	EList<String> getCorrectas();

	/**
	 * Returns the value of the '<em><b>Alternativas</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternativas</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternativas</em>' attribute list.
	 * @see Autoevaluacion.AutoevaluacionPackage#getRespuesta_Alternativas()
	 * @model
	 * @generated
	 */
	EList<String> getAlternativas();

} // Respuesta
