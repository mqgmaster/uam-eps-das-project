/**
 */
package Autoevaluacion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Respuestas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Autoevaluacion.Respuestas#getCorrectas <em>Correctas</em>}</li>
 *   <li>{@link Autoevaluacion.Respuestas#getAlternativas <em>Alternativas</em>}</li>
 *   <li>{@link Autoevaluacion.Respuestas#getSeleccionadas <em>Seleccionadas</em>}</li>
 * </ul>
 * </p>
 *
 * @see Autoevaluacion.AutoevaluacionPackage#getRespuestas()
 * @model abstract="true"
 * @generated
 */
public interface Respuestas extends EObject {
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
	 * @see Autoevaluacion.AutoevaluacionPackage#getRespuestas_Correctas()
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
	 * @see Autoevaluacion.AutoevaluacionPackage#getRespuestas_Alternativas()
	 * @model
	 * @generated
	 */
	EList<String> getAlternativas();

	/**
	 * Returns the value of the '<em><b>Seleccionadas</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seleccionadas</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seleccionadas</em>' attribute list.
	 * @see Autoevaluacion.AutoevaluacionPackage#getRespuestas_Seleccionadas()
	 * @model
	 * @generated
	 */
	EList<String> getSeleccionadas();

} // Respuestas
