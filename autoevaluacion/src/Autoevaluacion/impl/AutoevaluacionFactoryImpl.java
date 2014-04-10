/**
 */
package Autoevaluacion.impl;

import Autoevaluacion.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutoevaluacionFactoryImpl extends EFactoryImpl implements AutoevaluacionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AutoevaluacionFactory init() {
		try {
			AutoevaluacionFactory theAutoevaluacionFactory = (AutoevaluacionFactory)EPackage.Registry.INSTANCE.getEFactory(AutoevaluacionPackage.eNS_URI);
			if (theAutoevaluacionFactory != null) {
				return theAutoevaluacionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AutoevaluacionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoevaluacionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AutoevaluacionPackage.EJERCICIO: return createEjercicio();
			case AutoevaluacionPackage.RESPUESTA_UNICA: return createRespuestaUnica();
			case AutoevaluacionPackage.RESPUESTA_MULTIPLE: return createRespuestaMultiple();
			case AutoevaluacionPackage.TEXTO_LIBRE: return createTextoLibre();
			case AutoevaluacionPackage.ORDENACION: return createOrdenacion();
			case AutoevaluacionPackage.CLASICO: return createClasico();
			case AutoevaluacionPackage.WIZARD: return createWizard();
			case AutoevaluacionPackage.WIZARD_ADAPTATIVO: return createWizardAdaptativo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ejercicio createEjercicio() {
		EjercicioImpl ejercicio = new EjercicioImpl();
		return ejercicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespuestaUnica createRespuestaUnica() {
		RespuestaUnicaImpl respuestaUnica = new RespuestaUnicaImpl();
		return respuestaUnica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespuestaMultiple createRespuestaMultiple() {
		RespuestaMultipleImpl respuestaMultiple = new RespuestaMultipleImpl();
		return respuestaMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextoLibre createTextoLibre() {
		TextoLibreImpl textoLibre = new TextoLibreImpl();
		return textoLibre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ordenacion createOrdenacion() {
		OrdenacionImpl ordenacion = new OrdenacionImpl();
		return ordenacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasico createClasico() {
		ClasicoImpl clasico = new ClasicoImpl();
		return clasico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wizard createWizard() {
		WizardImpl wizard = new WizardImpl();
		return wizard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardAdaptativo createWizardAdaptativo() {
		WizardAdaptativoImpl wizardAdaptativo = new WizardAdaptativoImpl();
		return wizardAdaptativo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoevaluacionPackage getAutoevaluacionPackage() {
		return (AutoevaluacionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AutoevaluacionPackage getPackage() {
		return AutoevaluacionPackage.eINSTANCE;
	}

} //AutoevaluacionFactoryImpl
