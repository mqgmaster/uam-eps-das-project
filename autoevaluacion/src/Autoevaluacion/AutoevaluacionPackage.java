/**
 */
package Autoevaluacion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Autoevaluacion.AutoevaluacionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface AutoevaluacionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Autoevaluacion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Autoevaluacion";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Autoevaluacion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutoevaluacionPackage eINSTANCE = Autoevaluacion.impl.AutoevaluacionPackageImpl.init();

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.HojaImpl <em>Hoja</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.HojaImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getHoja()
	 * @generated
	 */
	int HOJA = 0;

	/**
	 * The feature id for the '<em><b>Ejercicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOJA__EJERCICIOS = 0;

	/**
	 * The feature id for the '<em><b>Puntuacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOJA__PUNTUACION = 1;

	/**
	 * The feature id for the '<em><b>Penalizacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOJA__PENALIZACION = 2;

	/**
	 * The number of structural features of the '<em>Hoja</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOJA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hoja</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOJA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.EjercicioImpl <em>Ejercicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.EjercicioImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getEjercicio()
	 * @generated
	 */
	int EJERCICIO = 1;

	/**
	 * The feature id for the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJERCICIO__ENUNCIADO = 0;

	/**
	 * The feature id for the '<em><b>Puntuacion Ej</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJERCICIO__PUNTUACION_EJ = 1;

	/**
	 * The feature id for the '<em><b>Respuesta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJERCICIO__RESPUESTA = 2;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJERCICIO__CATEGORIA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJERCICIO__NAME = 4;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJERCICIO__ORDER = 5;

	/**
	 * The number of structural features of the '<em>Ejercicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJERCICIO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Ejercicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJERCICIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.RespuestaImpl <em>Respuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.RespuestaImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getRespuesta()
	 * @generated
	 */
	int RESPUESTA = 2;

	/**
	 * The feature id for the '<em><b>Correctas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__CORRECTAS = 0;

	/**
	 * The feature id for the '<em><b>Alternativas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__ALTERNATIVAS = 1;

	/**
	 * The feature id for the '<em><b>Seleccionadas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__SELECCIONADAS = 2;

	/**
	 * The number of structural features of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.RespuestaUnicaImpl <em>Respuesta Unica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.RespuestaUnicaImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getRespuestaUnica()
	 * @generated
	 */
	int RESPUESTA_UNICA = 3;

	/**
	 * The feature id for the '<em><b>Correctas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_UNICA__CORRECTAS = RESPUESTA__CORRECTAS;

	/**
	 * The feature id for the '<em><b>Alternativas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_UNICA__ALTERNATIVAS = RESPUESTA__ALTERNATIVAS;

	/**
	 * The feature id for the '<em><b>Seleccionadas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_UNICA__SELECCIONADAS = RESPUESTA__SELECCIONADAS;

	/**
	 * The number of structural features of the '<em>Respuesta Unica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_UNICA_FEATURE_COUNT = RESPUESTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Respuesta Unica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_UNICA_OPERATION_COUNT = RESPUESTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.RespuestaMultipleImpl <em>Respuesta Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.RespuestaMultipleImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getRespuestaMultiple()
	 * @generated
	 */
	int RESPUESTA_MULTIPLE = 4;

	/**
	 * The feature id for the '<em><b>Correctas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_MULTIPLE__CORRECTAS = RESPUESTA__CORRECTAS;

	/**
	 * The feature id for the '<em><b>Alternativas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_MULTIPLE__ALTERNATIVAS = RESPUESTA__ALTERNATIVAS;

	/**
	 * The feature id for the '<em><b>Seleccionadas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_MULTIPLE__SELECCIONADAS = RESPUESTA__SELECCIONADAS;

	/**
	 * The number of structural features of the '<em>Respuesta Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_MULTIPLE_FEATURE_COUNT = RESPUESTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Respuesta Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_MULTIPLE_OPERATION_COUNT = RESPUESTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.TextoLibreImpl <em>Texto Libre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.TextoLibreImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getTextoLibre()
	 * @generated
	 */
	int TEXTO_LIBRE = 5;

	/**
	 * The feature id for the '<em><b>Correctas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTO_LIBRE__CORRECTAS = RESPUESTA__CORRECTAS;

	/**
	 * The feature id for the '<em><b>Alternativas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTO_LIBRE__ALTERNATIVAS = RESPUESTA__ALTERNATIVAS;

	/**
	 * The feature id for the '<em><b>Seleccionadas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTO_LIBRE__SELECCIONADAS = RESPUESTA__SELECCIONADAS;

	/**
	 * The number of structural features of the '<em>Texto Libre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTO_LIBRE_FEATURE_COUNT = RESPUESTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Texto Libre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTO_LIBRE_OPERATION_COUNT = RESPUESTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.OrdenacionImpl <em>Ordenacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.OrdenacionImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getOrdenacion()
	 * @generated
	 */
	int ORDENACION = 6;

	/**
	 * The feature id for the '<em><b>Correctas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDENACION__CORRECTAS = RESPUESTA__CORRECTAS;

	/**
	 * The feature id for the '<em><b>Alternativas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDENACION__ALTERNATIVAS = RESPUESTA__ALTERNATIVAS;

	/**
	 * The feature id for the '<em><b>Seleccionadas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDENACION__SELECCIONADAS = RESPUESTA__SELECCIONADAS;

	/**
	 * The number of structural features of the '<em>Ordenacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDENACION_FEATURE_COUNT = RESPUESTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordenacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDENACION_OPERATION_COUNT = RESPUESTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.ClasicoImpl <em>Clasico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.ClasicoImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getClasico()
	 * @generated
	 */
	int CLASICO = 7;

	/**
	 * The feature id for the '<em><b>Ejercicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASICO__EJERCICIOS = HOJA__EJERCICIOS;

	/**
	 * The feature id for the '<em><b>Puntuacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASICO__PUNTUACION = HOJA__PUNTUACION;

	/**
	 * The feature id for the '<em><b>Penalizacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASICO__PENALIZACION = HOJA__PENALIZACION;

	/**
	 * The number of structural features of the '<em>Clasico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASICO_FEATURE_COUNT = HOJA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clasico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASICO_OPERATION_COUNT = HOJA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.WizardImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getWizard()
	 * @generated
	 */
	int WIZARD = 8;

	/**
	 * The feature id for the '<em><b>Ejercicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__EJERCICIOS = HOJA__EJERCICIOS;

	/**
	 * The feature id for the '<em><b>Puntuacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PUNTUACION = HOJA__PUNTUACION;

	/**
	 * The feature id for the '<em><b>Penalizacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PENALIZACION = HOJA__PENALIZACION;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = HOJA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_OPERATION_COUNT = HOJA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Autoevaluacion.impl.WizardAdaptativoImpl <em>Wizard Adaptativo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Autoevaluacion.impl.WizardAdaptativoImpl
	 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getWizardAdaptativo()
	 * @generated
	 */
	int WIZARD_ADAPTATIVO = 9;

	/**
	 * The feature id for the '<em><b>Ejercicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_ADAPTATIVO__EJERCICIOS = HOJA__EJERCICIOS;

	/**
	 * The feature id for the '<em><b>Puntuacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_ADAPTATIVO__PUNTUACION = HOJA__PUNTUACION;

	/**
	 * The feature id for the '<em><b>Penalizacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_ADAPTATIVO__PENALIZACION = HOJA__PENALIZACION;

	/**
	 * The feature id for the '<em><b>Ejercicios Respondidos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_ADAPTATIVO__EJERCICIOS_RESPONDIDOS = HOJA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wizard Adaptativo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_ADAPTATIVO_FEATURE_COUNT = HOJA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wizard Adaptativo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_ADAPTATIVO_OPERATION_COUNT = HOJA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Autoevaluacion.Hoja <em>Hoja</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoja</em>'.
	 * @see Autoevaluacion.Hoja
	 * @generated
	 */
	EClass getHoja();

	/**
	 * Returns the meta object for the containment reference list '{@link Autoevaluacion.Hoja#getEjercicios <em>Ejercicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejercicios</em>'.
	 * @see Autoevaluacion.Hoja#getEjercicios()
	 * @see #getHoja()
	 * @generated
	 */
	EReference getHoja_Ejercicios();

	/**
	 * Returns the meta object for the attribute '{@link Autoevaluacion.Hoja#getPuntuacion <em>Puntuacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puntuacion</em>'.
	 * @see Autoevaluacion.Hoja#getPuntuacion()
	 * @see #getHoja()
	 * @generated
	 */
	EAttribute getHoja_Puntuacion();

	/**
	 * Returns the meta object for the attribute '{@link Autoevaluacion.Hoja#getPenalizacion <em>Penalizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalizacion</em>'.
	 * @see Autoevaluacion.Hoja#getPenalizacion()
	 * @see #getHoja()
	 * @generated
	 */
	EAttribute getHoja_Penalizacion();

	/**
	 * Returns the meta object for class '{@link Autoevaluacion.Ejercicio <em>Ejercicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejercicio</em>'.
	 * @see Autoevaluacion.Ejercicio
	 * @generated
	 */
	EClass getEjercicio();

	/**
	 * Returns the meta object for the attribute '{@link Autoevaluacion.Ejercicio#getEnunciado <em>Enunciado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enunciado</em>'.
	 * @see Autoevaluacion.Ejercicio#getEnunciado()
	 * @see #getEjercicio()
	 * @generated
	 */
	EAttribute getEjercicio_Enunciado();

	/**
	 * Returns the meta object for the attribute '{@link Autoevaluacion.Ejercicio#getPuntuacionEj <em>Puntuacion Ej</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puntuacion Ej</em>'.
	 * @see Autoevaluacion.Ejercicio#getPuntuacionEj()
	 * @see #getEjercicio()
	 * @generated
	 */
	EAttribute getEjercicio_PuntuacionEj();

	/**
	 * Returns the meta object for the containment reference '{@link Autoevaluacion.Ejercicio#getRespuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Respuesta</em>'.
	 * @see Autoevaluacion.Ejercicio#getRespuesta()
	 * @see #getEjercicio()
	 * @generated
	 */
	EReference getEjercicio_Respuesta();

	/**
	 * Returns the meta object for the attribute '{@link Autoevaluacion.Ejercicio#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categoria</em>'.
	 * @see Autoevaluacion.Ejercicio#getCategoria()
	 * @see #getEjercicio()
	 * @generated
	 */
	EAttribute getEjercicio_Categoria();

	/**
	 * Returns the meta object for the attribute '{@link Autoevaluacion.Ejercicio#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Autoevaluacion.Ejercicio#getName()
	 * @see #getEjercicio()
	 * @generated
	 */
	EAttribute getEjercicio_Name();

	/**
	 * Returns the meta object for the attribute '{@link Autoevaluacion.Ejercicio#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see Autoevaluacion.Ejercicio#getOrder()
	 * @see #getEjercicio()
	 * @generated
	 */
	EAttribute getEjercicio_Order();

	/**
	 * Returns the meta object for class '{@link Autoevaluacion.Respuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respuesta</em>'.
	 * @see Autoevaluacion.Respuesta
	 * @generated
	 */
	EClass getRespuesta();

	/**
	 * Returns the meta object for the attribute list '{@link Autoevaluacion.Respuesta#getCorrectas <em>Correctas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Correctas</em>'.
	 * @see Autoevaluacion.Respuesta#getCorrectas()
	 * @see #getRespuesta()
	 * @generated
	 */
	EAttribute getRespuesta_Correctas();

	/**
	 * Returns the meta object for the attribute list '{@link Autoevaluacion.Respuesta#getAlternativas <em>Alternativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alternativas</em>'.
	 * @see Autoevaluacion.Respuesta#getAlternativas()
	 * @see #getRespuesta()
	 * @generated
	 */
	EAttribute getRespuesta_Alternativas();

	/**
	 * Returns the meta object for the attribute list '{@link Autoevaluacion.Respuesta#getSeleccionadas <em>Seleccionadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Seleccionadas</em>'.
	 * @see Autoevaluacion.Respuesta#getSeleccionadas()
	 * @see #getRespuesta()
	 * @generated
	 */
	EAttribute getRespuesta_Seleccionadas();

	/**
	 * Returns the meta object for class '{@link Autoevaluacion.RespuestaUnica <em>Respuesta Unica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respuesta Unica</em>'.
	 * @see Autoevaluacion.RespuestaUnica
	 * @generated
	 */
	EClass getRespuestaUnica();

	/**
	 * Returns the meta object for class '{@link Autoevaluacion.RespuestaMultiple <em>Respuesta Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respuesta Multiple</em>'.
	 * @see Autoevaluacion.RespuestaMultiple
	 * @generated
	 */
	EClass getRespuestaMultiple();

	/**
	 * Returns the meta object for class '{@link Autoevaluacion.TextoLibre <em>Texto Libre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texto Libre</em>'.
	 * @see Autoevaluacion.TextoLibre
	 * @generated
	 */
	EClass getTextoLibre();

	/**
	 * Returns the meta object for class '{@link Autoevaluacion.Ordenacion <em>Ordenacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordenacion</em>'.
	 * @see Autoevaluacion.Ordenacion
	 * @generated
	 */
	EClass getOrdenacion();

	/**
	 * Returns the meta object for class '{@link Autoevaluacion.Clasico <em>Clasico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clasico</em>'.
	 * @see Autoevaluacion.Clasico
	 * @generated
	 */
	EClass getClasico();

	/**
	 * Returns the meta object for class '{@link Autoevaluacion.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see Autoevaluacion.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for class '{@link Autoevaluacion.WizardAdaptativo <em>Wizard Adaptativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard Adaptativo</em>'.
	 * @see Autoevaluacion.WizardAdaptativo
	 * @generated
	 */
	EClass getWizardAdaptativo();

	/**
	 * Returns the meta object for the reference list '{@link Autoevaluacion.WizardAdaptativo#getEjerciciosRespondidos <em>Ejercicios Respondidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ejercicios Respondidos</em>'.
	 * @see Autoevaluacion.WizardAdaptativo#getEjerciciosRespondidos()
	 * @see #getWizardAdaptativo()
	 * @generated
	 */
	EReference getWizardAdaptativo_EjerciciosRespondidos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AutoevaluacionFactory getAutoevaluacionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.HojaImpl <em>Hoja</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.HojaImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getHoja()
		 * @generated
		 */
		EClass HOJA = eINSTANCE.getHoja();

		/**
		 * The meta object literal for the '<em><b>Ejercicios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOJA__EJERCICIOS = eINSTANCE.getHoja_Ejercicios();

		/**
		 * The meta object literal for the '<em><b>Puntuacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOJA__PUNTUACION = eINSTANCE.getHoja_Puntuacion();

		/**
		 * The meta object literal for the '<em><b>Penalizacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOJA__PENALIZACION = eINSTANCE.getHoja_Penalizacion();

		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.EjercicioImpl <em>Ejercicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.EjercicioImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getEjercicio()
		 * @generated
		 */
		EClass EJERCICIO = eINSTANCE.getEjercicio();

		/**
		 * The meta object literal for the '<em><b>Enunciado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJERCICIO__ENUNCIADO = eINSTANCE.getEjercicio_Enunciado();

		/**
		 * The meta object literal for the '<em><b>Puntuacion Ej</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJERCICIO__PUNTUACION_EJ = eINSTANCE.getEjercicio_PuntuacionEj();

		/**
		 * The meta object literal for the '<em><b>Respuesta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJERCICIO__RESPUESTA = eINSTANCE.getEjercicio_Respuesta();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJERCICIO__CATEGORIA = eINSTANCE.getEjercicio_Categoria();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJERCICIO__NAME = eINSTANCE.getEjercicio_Name();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJERCICIO__ORDER = eINSTANCE.getEjercicio_Order();

		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.RespuestaImpl <em>Respuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.RespuestaImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getRespuesta()
		 * @generated
		 */
		EClass RESPUESTA = eINSTANCE.getRespuesta();

		/**
		 * The meta object literal for the '<em><b>Correctas</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPUESTA__CORRECTAS = eINSTANCE.getRespuesta_Correctas();

		/**
		 * The meta object literal for the '<em><b>Alternativas</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPUESTA__ALTERNATIVAS = eINSTANCE.getRespuesta_Alternativas();

		/**
		 * The meta object literal for the '<em><b>Seleccionadas</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPUESTA__SELECCIONADAS = eINSTANCE.getRespuesta_Seleccionadas();

		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.RespuestaUnicaImpl <em>Respuesta Unica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.RespuestaUnicaImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getRespuestaUnica()
		 * @generated
		 */
		EClass RESPUESTA_UNICA = eINSTANCE.getRespuestaUnica();

		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.RespuestaMultipleImpl <em>Respuesta Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.RespuestaMultipleImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getRespuestaMultiple()
		 * @generated
		 */
		EClass RESPUESTA_MULTIPLE = eINSTANCE.getRespuestaMultiple();

		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.TextoLibreImpl <em>Texto Libre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.TextoLibreImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getTextoLibre()
		 * @generated
		 */
		EClass TEXTO_LIBRE = eINSTANCE.getTextoLibre();

		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.OrdenacionImpl <em>Ordenacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.OrdenacionImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getOrdenacion()
		 * @generated
		 */
		EClass ORDENACION = eINSTANCE.getOrdenacion();

		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.ClasicoImpl <em>Clasico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.ClasicoImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getClasico()
		 * @generated
		 */
		EClass CLASICO = eINSTANCE.getClasico();

		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.WizardImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getWizard()
		 * @generated
		 */
		EClass WIZARD = eINSTANCE.getWizard();

		/**
		 * The meta object literal for the '{@link Autoevaluacion.impl.WizardAdaptativoImpl <em>Wizard Adaptativo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Autoevaluacion.impl.WizardAdaptativoImpl
		 * @see Autoevaluacion.impl.AutoevaluacionPackageImpl#getWizardAdaptativo()
		 * @generated
		 */
		EClass WIZARD_ADAPTATIVO = eINSTANCE.getWizardAdaptativo();

		/**
		 * The meta object literal for the '<em><b>Ejercicios Respondidos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD_ADAPTATIVO__EJERCICIOS_RESPONDIDOS = eINSTANCE.getWizardAdaptativo_EjerciciosRespondidos();

	}

} //AutoevaluacionPackage
