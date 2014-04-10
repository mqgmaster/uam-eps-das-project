/**
 */
package Autoevaluacion.util;

import Autoevaluacion.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Autoevaluacion.AutoevaluacionPackage
 * @generated
 */
public class AutoevaluacionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AutoevaluacionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoevaluacionSwitch() {
		if (modelPackage == null) {
			modelPackage = AutoevaluacionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AutoevaluacionPackage.HOJA: {
				Hoja hoja = (Hoja)theEObject;
				T result = caseHoja(hoja);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AutoevaluacionPackage.EJERCICIO: {
				Ejercicio ejercicio = (Ejercicio)theEObject;
				T result = caseEjercicio(ejercicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AutoevaluacionPackage.RESPUESTAS: {
				Respuestas respuestas = (Respuestas)theEObject;
				T result = caseRespuestas(respuestas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AutoevaluacionPackage.RESPUESTA_UNICA: {
				RespuestaUnica respuestaUnica = (RespuestaUnica)theEObject;
				T result = caseRespuestaUnica(respuestaUnica);
				if (result == null) result = caseRespuestas(respuestaUnica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AutoevaluacionPackage.RESPUESTA_MULTIPLE: {
				RespuestaMultiple respuestaMultiple = (RespuestaMultiple)theEObject;
				T result = caseRespuestaMultiple(respuestaMultiple);
				if (result == null) result = caseRespuestas(respuestaMultiple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AutoevaluacionPackage.TEXTO_LIBRE: {
				TextoLibre textoLibre = (TextoLibre)theEObject;
				T result = caseTextoLibre(textoLibre);
				if (result == null) result = caseRespuestas(textoLibre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AutoevaluacionPackage.ORDENACION: {
				Ordenacion ordenacion = (Ordenacion)theEObject;
				T result = caseOrdenacion(ordenacion);
				if (result == null) result = caseRespuestas(ordenacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AutoevaluacionPackage.CLASICO: {
				Clasico clasico = (Clasico)theEObject;
				T result = caseClasico(clasico);
				if (result == null) result = caseHoja(clasico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AutoevaluacionPackage.WIZARD: {
				Wizard wizard = (Wizard)theEObject;
				T result = caseWizard(wizard);
				if (result == null) result = caseHoja(wizard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AutoevaluacionPackage.WIZARD_ADAPTATIVO: {
				WizardAdaptativo wizardAdaptativo = (WizardAdaptativo)theEObject;
				T result = caseWizardAdaptativo(wizardAdaptativo);
				if (result == null) result = caseHoja(wizardAdaptativo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoja</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoja</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoja(Hoja object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejercicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejercicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjercicio(Ejercicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Respuestas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respuestas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespuestas(Respuestas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Respuesta Unica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respuesta Unica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespuestaUnica(RespuestaUnica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Respuesta Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respuesta Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespuestaMultiple(RespuestaMultiple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texto Libre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texto Libre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextoLibre(TextoLibre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordenacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordenacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdenacion(Ordenacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clasico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clasico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasico(Clasico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wizard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWizard(Wizard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wizard Adaptativo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wizard Adaptativo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWizardAdaptativo(WizardAdaptativo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AutoevaluacionSwitch
