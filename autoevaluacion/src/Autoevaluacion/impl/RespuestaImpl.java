/**
 */
package Autoevaluacion.impl;

import Autoevaluacion.AutoevaluacionPackage;
import Autoevaluacion.Respuesta;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Respuesta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Autoevaluacion.impl.RespuestaImpl#getCorrectas <em>Correctas</em>}</li>
 *   <li>{@link Autoevaluacion.impl.RespuestaImpl#getAlternativas <em>Alternativas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RespuestaImpl extends MinimalEObjectImpl.Container implements Respuesta {
	/**
	 * The cached value of the '{@link #getCorrectas() <em>Correctas</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectas()
	 * @generated
	 * @ordered
	 */
	protected EList<String> correctas;

	/**
	 * The cached value of the '{@link #getAlternativas() <em>Alternativas</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativas()
	 * @generated
	 * @ordered
	 */
	protected EList<String> alternativas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespuestaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoevaluacionPackage.Literals.RESPUESTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCorrectas() {
		if (correctas == null) {
			correctas = new EDataTypeUniqueEList<String>(String.class, this, AutoevaluacionPackage.RESPUESTA__CORRECTAS);
		}
		return correctas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAlternativas() {
		if (alternativas == null) {
			alternativas = new EDataTypeUniqueEList<String>(String.class, this, AutoevaluacionPackage.RESPUESTA__ALTERNATIVAS);
		}
		return alternativas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AutoevaluacionPackage.RESPUESTA__CORRECTAS:
				return getCorrectas();
			case AutoevaluacionPackage.RESPUESTA__ALTERNATIVAS:
				return getAlternativas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AutoevaluacionPackage.RESPUESTA__CORRECTAS:
				getCorrectas().clear();
				getCorrectas().addAll((Collection<? extends String>)newValue);
				return;
			case AutoevaluacionPackage.RESPUESTA__ALTERNATIVAS:
				getAlternativas().clear();
				getAlternativas().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AutoevaluacionPackage.RESPUESTA__CORRECTAS:
				getCorrectas().clear();
				return;
			case AutoevaluacionPackage.RESPUESTA__ALTERNATIVAS:
				getAlternativas().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AutoevaluacionPackage.RESPUESTA__CORRECTAS:
				return correctas != null && !correctas.isEmpty();
			case AutoevaluacionPackage.RESPUESTA__ALTERNATIVAS:
				return alternativas != null && !alternativas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (correctas: ");
		result.append(correctas);
		result.append(", alternativas: ");
		result.append(alternativas);
		result.append(')');
		return result.toString();
	}

} //RespuestaImpl
