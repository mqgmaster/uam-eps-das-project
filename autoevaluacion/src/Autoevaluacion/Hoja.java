/**
 */
package Autoevaluacion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hoja</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Autoevaluacion.Hoja#getEjercicios <em>Ejercicios</em>}</li>
 *   <li>{@link Autoevaluacion.Hoja#getPuntuacion <em>Puntuacion</em>}</li>
 *   <li>{@link Autoevaluacion.Hoja#getPenalizacion <em>Penalizacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see Autoevaluacion.AutoevaluacionPackage#getHoja()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueName uniqueOrder'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueName='\n\t\t\tejercicios->isUnique(name)' uniqueOrder='\n\t\t\tejercicios->isUnique(order)'"
 * @generated
 */
public interface Hoja extends EObject {
	/**
	 * Returns the value of the '<em><b>Ejercicios</b></em>' containment reference list.
	 * The list contents are of type {@link Autoevaluacion.Ejercicio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejercicios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejercicios</em>' containment reference list.
	 * @see Autoevaluacion.AutoevaluacionPackage#getHoja_Ejercicios()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ejercicio> getEjercicios();

	/**
	 * Returns the value of the '<em><b>Puntuacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puntuacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puntuacion</em>' attribute.
	 * @see #setPuntuacion(double)
	 * @see Autoevaluacion.AutoevaluacionPackage#getHoja_Puntuacion()
	 * @model required="true"
	 * @generated
	 */
	double getPuntuacion();

	/**
	 * Sets the value of the '{@link Autoevaluacion.Hoja#getPuntuacion <em>Puntuacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puntuacion</em>' attribute.
	 * @see #getPuntuacion()
	 * @generated
	 */
	void setPuntuacion(double value);

	/**
	 * Returns the value of the '<em><b>Penalizacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penalizacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalizacion</em>' attribute.
	 * @see #setPenalizacion(double)
	 * @see Autoevaluacion.AutoevaluacionPackage#getHoja_Penalizacion()
	 * @model required="true"
	 * @generated
	 */
	double getPenalizacion();

	/**
	 * Sets the value of the '{@link Autoevaluacion.Hoja#getPenalizacion <em>Penalizacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalizacion</em>' attribute.
	 * @see #getPenalizacion()
	 * @generated
	 */
	void setPenalizacion(double value);

} // Hoja
