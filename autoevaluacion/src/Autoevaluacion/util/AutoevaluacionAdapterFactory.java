/**
 */
package Autoevaluacion.util;

import Autoevaluacion.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Autoevaluacion.AutoevaluacionPackage
 * @generated
 */
public class AutoevaluacionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AutoevaluacionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoevaluacionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AutoevaluacionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoevaluacionSwitch<Adapter> modelSwitch =
		new AutoevaluacionSwitch<Adapter>() {
			@Override
			public Adapter caseHoja(Hoja object) {
				return createHojaAdapter();
			}
			@Override
			public Adapter caseEjercicio(Ejercicio object) {
				return createEjercicioAdapter();
			}
			@Override
			public Adapter caseRespuestas(Respuestas object) {
				return createRespuestasAdapter();
			}
			@Override
			public Adapter caseRespuestaUnica(RespuestaUnica object) {
				return createRespuestaUnicaAdapter();
			}
			@Override
			public Adapter caseRespuestaMultiple(RespuestaMultiple object) {
				return createRespuestaMultipleAdapter();
			}
			@Override
			public Adapter caseTextoLibre(TextoLibre object) {
				return createTextoLibreAdapter();
			}
			@Override
			public Adapter caseOrdenacion(Ordenacion object) {
				return createOrdenacionAdapter();
			}
			@Override
			public Adapter caseClasico(Clasico object) {
				return createClasicoAdapter();
			}
			@Override
			public Adapter caseWizard(Wizard object) {
				return createWizardAdapter();
			}
			@Override
			public Adapter caseWizardAdaptativo(WizardAdaptativo object) {
				return createWizardAdaptativoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.Hoja <em>Hoja</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.Hoja
	 * @generated
	 */
	public Adapter createHojaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.Ejercicio <em>Ejercicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.Ejercicio
	 * @generated
	 */
	public Adapter createEjercicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.Respuestas <em>Respuestas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.Respuestas
	 * @generated
	 */
	public Adapter createRespuestasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.RespuestaUnica <em>Respuesta Unica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.RespuestaUnica
	 * @generated
	 */
	public Adapter createRespuestaUnicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.RespuestaMultiple <em>Respuesta Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.RespuestaMultiple
	 * @generated
	 */
	public Adapter createRespuestaMultipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.TextoLibre <em>Texto Libre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.TextoLibre
	 * @generated
	 */
	public Adapter createTextoLibreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.Ordenacion <em>Ordenacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.Ordenacion
	 * @generated
	 */
	public Adapter createOrdenacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.Clasico <em>Clasico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.Clasico
	 * @generated
	 */
	public Adapter createClasicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.Wizard
	 * @generated
	 */
	public Adapter createWizardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Autoevaluacion.WizardAdaptativo <em>Wizard Adaptativo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Autoevaluacion.WizardAdaptativo
	 * @generated
	 */
	public Adapter createWizardAdaptativoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AutoevaluacionAdapterFactory
