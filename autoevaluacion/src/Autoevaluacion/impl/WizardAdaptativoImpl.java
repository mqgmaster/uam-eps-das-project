/**
 */
package Autoevaluacion.impl;

import Autoevaluacion.AutoevaluacionPackage;
import Autoevaluacion.Ejercicio;
import Autoevaluacion.WizardAdaptativo;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard Adaptativo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Autoevaluacion.impl.WizardAdaptativoImpl#getEjerciciosRespondidos <em>Ejercicios Respondidos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WizardAdaptativoImpl extends HojaImpl implements WizardAdaptativo {
	/**
	 * The cached value of the '{@link #getEjerciciosRespondidos() <em>Ejercicios Respondidos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjerciciosRespondidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Ejercicio> ejerciciosRespondidos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardAdaptativoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoevaluacionPackage.Literals.WIZARD_ADAPTATIVO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ejercicio> getEjerciciosRespondidos() {
		if (ejerciciosRespondidos == null) {
			ejerciciosRespondidos = new EObjectResolvingEList<Ejercicio>(Ejercicio.class, this, AutoevaluacionPackage.WIZARD_ADAPTATIVO__EJERCICIOS_RESPONDIDOS);
		}
		return ejerciciosRespondidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AutoevaluacionPackage.WIZARD_ADAPTATIVO__EJERCICIOS_RESPONDIDOS:
				return getEjerciciosRespondidos();
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
			case AutoevaluacionPackage.WIZARD_ADAPTATIVO__EJERCICIOS_RESPONDIDOS:
				getEjerciciosRespondidos().clear();
				getEjerciciosRespondidos().addAll((Collection<? extends Ejercicio>)newValue);
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
			case AutoevaluacionPackage.WIZARD_ADAPTATIVO__EJERCICIOS_RESPONDIDOS:
				getEjerciciosRespondidos().clear();
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
			case AutoevaluacionPackage.WIZARD_ADAPTATIVO__EJERCICIOS_RESPONDIDOS:
				return ejerciciosRespondidos != null && !ejerciciosRespondidos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WizardAdaptativoImpl
