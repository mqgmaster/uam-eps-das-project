/**
 */
package Autoevaluacion.impl;

import Autoevaluacion.AutoevaluacionPackage;
import Autoevaluacion.Ejercicio;
import Autoevaluacion.Hoja;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hoja</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Autoevaluacion.impl.HojaImpl#getNota <em>Nota</em>}</li>
 *   <li>{@link Autoevaluacion.impl.HojaImpl#getEjercicios <em>Ejercicios</em>}</li>
 *   <li>{@link Autoevaluacion.impl.HojaImpl#getPuntuacion <em>Puntuacion</em>}</li>
 *   <li>{@link Autoevaluacion.impl.HojaImpl#getPenalizacion <em>Penalizacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HojaImpl extends MinimalEObjectImpl.Container implements Hoja {
	/**
	 * The default value of the '{@link #getNota() <em>Nota</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNota()
	 * @generated
	 * @ordered
	 */
	protected static final double NOTA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNota() <em>Nota</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNota()
	 * @generated
	 * @ordered
	 */
	protected double nota = NOTA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEjercicios() <em>Ejercicios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjercicios()
	 * @generated
	 * @ordered
	 */
	protected EList<Ejercicio> ejercicios;

	/**
	 * The default value of the '{@link #getPuntuacion() <em>Puntuacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuntuacion()
	 * @generated
	 * @ordered
	 */
	protected static final double PUNTUACION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPuntuacion() <em>Puntuacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuntuacion()
	 * @generated
	 * @ordered
	 */
	protected double puntuacion = PUNTUACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalizacion() <em>Penalizacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalizacion()
	 * @generated
	 * @ordered
	 */
	protected static final double PENALIZACION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPenalizacion() <em>Penalizacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalizacion()
	 * @generated
	 * @ordered
	 */
	protected double penalizacion = PENALIZACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HojaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoevaluacionPackage.Literals.HOJA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNota() {
		return nota;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNota(double newNota) {
		double oldNota = nota;
		nota = newNota;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.HOJA__NOTA, oldNota, nota));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ejercicio> getEjercicios() {
		if (ejercicios == null) {
			ejercicios = new EObjectContainmentEList<Ejercicio>(Ejercicio.class, this, AutoevaluacionPackage.HOJA__EJERCICIOS);
		}
		return ejercicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPuntuacion() {
		return puntuacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuntuacion(double newPuntuacion) {
		double oldPuntuacion = puntuacion;
		puntuacion = newPuntuacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.HOJA__PUNTUACION, oldPuntuacion, puntuacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPenalizacion() {
		return penalizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenalizacion(double newPenalizacion) {
		double oldPenalizacion = penalizacion;
		penalizacion = newPenalizacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.HOJA__PENALIZACION, oldPenalizacion, penalizacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AutoevaluacionPackage.HOJA__EJERCICIOS:
				return ((InternalEList<?>)getEjercicios()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AutoevaluacionPackage.HOJA__NOTA:
				return getNota();
			case AutoevaluacionPackage.HOJA__EJERCICIOS:
				return getEjercicios();
			case AutoevaluacionPackage.HOJA__PUNTUACION:
				return getPuntuacion();
			case AutoevaluacionPackage.HOJA__PENALIZACION:
				return getPenalizacion();
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
			case AutoevaluacionPackage.HOJA__NOTA:
				setNota((Double)newValue);
				return;
			case AutoevaluacionPackage.HOJA__EJERCICIOS:
				getEjercicios().clear();
				getEjercicios().addAll((Collection<? extends Ejercicio>)newValue);
				return;
			case AutoevaluacionPackage.HOJA__PUNTUACION:
				setPuntuacion((Double)newValue);
				return;
			case AutoevaluacionPackage.HOJA__PENALIZACION:
				setPenalizacion((Double)newValue);
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
			case AutoevaluacionPackage.HOJA__NOTA:
				setNota(NOTA_EDEFAULT);
				return;
			case AutoevaluacionPackage.HOJA__EJERCICIOS:
				getEjercicios().clear();
				return;
			case AutoevaluacionPackage.HOJA__PUNTUACION:
				setPuntuacion(PUNTUACION_EDEFAULT);
				return;
			case AutoevaluacionPackage.HOJA__PENALIZACION:
				setPenalizacion(PENALIZACION_EDEFAULT);
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
			case AutoevaluacionPackage.HOJA__NOTA:
				return nota != NOTA_EDEFAULT;
			case AutoevaluacionPackage.HOJA__EJERCICIOS:
				return ejercicios != null && !ejercicios.isEmpty();
			case AutoevaluacionPackage.HOJA__PUNTUACION:
				return puntuacion != PUNTUACION_EDEFAULT;
			case AutoevaluacionPackage.HOJA__PENALIZACION:
				return penalizacion != PENALIZACION_EDEFAULT;
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
		result.append(" (nota: ");
		result.append(nota);
		result.append(", puntuacion: ");
		result.append(puntuacion);
		result.append(", penalizacion: ");
		result.append(penalizacion);
		result.append(')');
		return result.toString();
	}

} //HojaImpl
