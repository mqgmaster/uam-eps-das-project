/**
 */
package Autoevaluacion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Autoevaluacion.AutoevaluacionPackage
 * @generated
 */
public interface AutoevaluacionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutoevaluacionFactory eINSTANCE = Autoevaluacion.impl.AutoevaluacionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ejercicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ejercicio</em>'.
	 * @generated
	 */
	Ejercicio createEjercicio();

	/**
	 * Returns a new object of class '<em>Respuesta Unica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respuesta Unica</em>'.
	 * @generated
	 */
	RespuestaUnica createRespuestaUnica();

	/**
	 * Returns a new object of class '<em>Respuesta Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respuesta Multiple</em>'.
	 * @generated
	 */
	RespuestaMultiple createRespuestaMultiple();

	/**
	 * Returns a new object of class '<em>Texto Libre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Texto Libre</em>'.
	 * @generated
	 */
	TextoLibre createTextoLibre();

	/**
	 * Returns a new object of class '<em>Ordenacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordenacion</em>'.
	 * @generated
	 */
	Ordenacion createOrdenacion();

	/**
	 * Returns a new object of class '<em>Clasico</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clasico</em>'.
	 * @generated
	 */
	Clasico createClasico();

	/**
	 * Returns a new object of class '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard</em>'.
	 * @generated
	 */
	Wizard createWizard();

	/**
	 * Returns a new object of class '<em>Wizard Adaptativo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard Adaptativo</em>'.
	 * @generated
	 */
	WizardAdaptativo createWizardAdaptativo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AutoevaluacionPackage getAutoevaluacionPackage();

} //AutoevaluacionFactory
