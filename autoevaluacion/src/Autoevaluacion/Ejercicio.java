/**
 */
package Autoevaluacion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ejercicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Autoevaluacion.Ejercicio#getEnunciado <em>Enunciado</em>}</li>
 *   <li>{@link Autoevaluacion.Ejercicio#getPuntuacionEj <em>Puntuacion Ej</em>}</li>
 *   <li>{@link Autoevaluacion.Ejercicio#getRespuestas <em>Respuestas</em>}</li>
 *   <li>{@link Autoevaluacion.Ejercicio#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link Autoevaluacion.Ejercicio#getName <em>Name</em>}</li>
 *   <li>{@link Autoevaluacion.Ejercicio#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see Autoevaluacion.AutoevaluacionPackage#getEjercicio()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonEmptyName nonEmptyEnunciado'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nonEmptyName='\n\t\t    not name.oclIsUndefined() \n\t\t    and name <> \'\'' nonEmptyEnunciado='\n\t\t    not enunciado.oclIsUndefined()\n\t\t    and enunciado <> \'\''"
 * @generated
 */
public interface Ejercicio extends EObject {
	/**
	 * Returns the value of the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enunciado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enunciado</em>' attribute.
	 * @see #setEnunciado(String)
	 * @see Autoevaluacion.AutoevaluacionPackage#getEjercicio_Enunciado()
	 * @model required="true"
	 * @generated
	 */
	String getEnunciado();

	/**
	 * Sets the value of the '{@link Autoevaluacion.Ejercicio#getEnunciado <em>Enunciado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enunciado</em>' attribute.
	 * @see #getEnunciado()
	 * @generated
	 */
	void setEnunciado(String value);

	/**
	 * Returns the value of the '<em><b>Puntuacion Ej</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puntuacion Ej</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puntuacion Ej</em>' attribute.
	 * @see #setPuntuacionEj(double)
	 * @see Autoevaluacion.AutoevaluacionPackage#getEjercicio_PuntuacionEj()
	 * @model
	 * @generated
	 */
	double getPuntuacionEj();

	/**
	 * Sets the value of the '{@link Autoevaluacion.Ejercicio#getPuntuacionEj <em>Puntuacion Ej</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puntuacion Ej</em>' attribute.
	 * @see #getPuntuacionEj()
	 * @generated
	 */
	void setPuntuacionEj(double value);

	/**
	 * Returns the value of the '<em><b>Respuestas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Respuestas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Respuestas</em>' containment reference.
	 * @see #setRespuestas(Respuestas)
	 * @see Autoevaluacion.AutoevaluacionPackage#getEjercicio_Respuestas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Respuestas getRespuestas();

	/**
	 * Sets the value of the '{@link Autoevaluacion.Ejercicio#getRespuestas <em>Respuestas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Respuestas</em>' containment reference.
	 * @see #getRespuestas()
	 * @generated
	 */
	void setRespuestas(Respuestas value);

	/**
	 * Returns the value of the '<em><b>Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categoria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria</em>' attribute.
	 * @see #setCategoria(String)
	 * @see Autoevaluacion.AutoevaluacionPackage#getEjercicio_Categoria()
	 * @model required="true"
	 * @generated
	 */
	String getCategoria();

	/**
	 * Sets the value of the '{@link Autoevaluacion.Ejercicio#getCategoria <em>Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categoria</em>' attribute.
	 * @see #getCategoria()
	 * @generated
	 */
	void setCategoria(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Autoevaluacion.AutoevaluacionPackage#getEjercicio_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Autoevaluacion.Ejercicio#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see Autoevaluacion.AutoevaluacionPackage#getEjercicio_Order()
	 * @model required="true"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link Autoevaluacion.Ejercicio#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

} // Ejercicio
