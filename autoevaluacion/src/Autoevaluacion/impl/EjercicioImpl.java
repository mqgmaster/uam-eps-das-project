/**
 */
package Autoevaluacion.impl;

import Autoevaluacion.AutoevaluacionPackage;
import Autoevaluacion.Ejercicio;
import Autoevaluacion.Respuestas;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ejercicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Autoevaluacion.impl.EjercicioImpl#getEnunciado <em>Enunciado</em>}</li>
 *   <li>{@link Autoevaluacion.impl.EjercicioImpl#getPuntuacionEj <em>Puntuacion Ej</em>}</li>
 *   <li>{@link Autoevaluacion.impl.EjercicioImpl#getRespuestas <em>Respuestas</em>}</li>
 *   <li>{@link Autoevaluacion.impl.EjercicioImpl#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link Autoevaluacion.impl.EjercicioImpl#getName <em>Name</em>}</li>
 *   <li>{@link Autoevaluacion.impl.EjercicioImpl#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EjercicioImpl extends MinimalEObjectImpl.Container implements Ejercicio {
	/**
	 * The default value of the '{@link #getEnunciado() <em>Enunciado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnunciado()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUNCIADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnunciado() <em>Enunciado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnunciado()
	 * @generated
	 * @ordered
	 */
	protected String enunciado = ENUNCIADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPuntuacionEj() <em>Puntuacion Ej</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuntuacionEj()
	 * @generated
	 * @ordered
	 */
	protected static final double PUNTUACION_EJ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPuntuacionEj() <em>Puntuacion Ej</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuntuacionEj()
	 * @generated
	 * @ordered
	 */
	protected double puntuacionEj = PUNTUACION_EJ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRespuestas() <em>Respuestas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespuestas()
	 * @generated
	 * @ordered
	 */
	protected Respuestas respuestas;

	/**
	 * The default value of the '{@link #getCategoria() <em>Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoria()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoria() <em>Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoria()
	 * @generated
	 * @ordered
	 */
	protected String categoria = CATEGORIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EjercicioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoevaluacionPackage.Literals.EJERCICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnunciado() {
		return enunciado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnunciado(String newEnunciado) {
		String oldEnunciado = enunciado;
		enunciado = newEnunciado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.EJERCICIO__ENUNCIADO, oldEnunciado, enunciado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPuntuacionEj() {
		return puntuacionEj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuntuacionEj(double newPuntuacionEj) {
		double oldPuntuacionEj = puntuacionEj;
		puntuacionEj = newPuntuacionEj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.EJERCICIO__PUNTUACION_EJ, oldPuntuacionEj, puntuacionEj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Respuestas getRespuestas() {
		return respuestas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRespuestas(Respuestas newRespuestas, NotificationChain msgs) {
		Respuestas oldRespuestas = respuestas;
		respuestas = newRespuestas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.EJERCICIO__RESPUESTAS, oldRespuestas, newRespuestas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespuestas(Respuestas newRespuestas) {
		if (newRespuestas != respuestas) {
			NotificationChain msgs = null;
			if (respuestas != null)
				msgs = ((InternalEObject)respuestas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AutoevaluacionPackage.EJERCICIO__RESPUESTAS, null, msgs);
			if (newRespuestas != null)
				msgs = ((InternalEObject)newRespuestas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AutoevaluacionPackage.EJERCICIO__RESPUESTAS, null, msgs);
			msgs = basicSetRespuestas(newRespuestas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.EJERCICIO__RESPUESTAS, newRespuestas, newRespuestas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoria(String newCategoria) {
		String oldCategoria = categoria;
		categoria = newCategoria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.EJERCICIO__CATEGORIA, oldCategoria, categoria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.EJERCICIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoevaluacionPackage.EJERCICIO__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AutoevaluacionPackage.EJERCICIO__RESPUESTAS:
				return basicSetRespuestas(null, msgs);
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
			case AutoevaluacionPackage.EJERCICIO__ENUNCIADO:
				return getEnunciado();
			case AutoevaluacionPackage.EJERCICIO__PUNTUACION_EJ:
				return getPuntuacionEj();
			case AutoevaluacionPackage.EJERCICIO__RESPUESTAS:
				return getRespuestas();
			case AutoevaluacionPackage.EJERCICIO__CATEGORIA:
				return getCategoria();
			case AutoevaluacionPackage.EJERCICIO__NAME:
				return getName();
			case AutoevaluacionPackage.EJERCICIO__ORDER:
				return getOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AutoevaluacionPackage.EJERCICIO__ENUNCIADO:
				setEnunciado((String)newValue);
				return;
			case AutoevaluacionPackage.EJERCICIO__PUNTUACION_EJ:
				setPuntuacionEj((Double)newValue);
				return;
			case AutoevaluacionPackage.EJERCICIO__RESPUESTAS:
				setRespuestas((Respuestas)newValue);
				return;
			case AutoevaluacionPackage.EJERCICIO__CATEGORIA:
				setCategoria((String)newValue);
				return;
			case AutoevaluacionPackage.EJERCICIO__NAME:
				setName((String)newValue);
				return;
			case AutoevaluacionPackage.EJERCICIO__ORDER:
				setOrder((Integer)newValue);
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
			case AutoevaluacionPackage.EJERCICIO__ENUNCIADO:
				setEnunciado(ENUNCIADO_EDEFAULT);
				return;
			case AutoevaluacionPackage.EJERCICIO__PUNTUACION_EJ:
				setPuntuacionEj(PUNTUACION_EJ_EDEFAULT);
				return;
			case AutoevaluacionPackage.EJERCICIO__RESPUESTAS:
				setRespuestas((Respuestas)null);
				return;
			case AutoevaluacionPackage.EJERCICIO__CATEGORIA:
				setCategoria(CATEGORIA_EDEFAULT);
				return;
			case AutoevaluacionPackage.EJERCICIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AutoevaluacionPackage.EJERCICIO__ORDER:
				setOrder(ORDER_EDEFAULT);
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
			case AutoevaluacionPackage.EJERCICIO__ENUNCIADO:
				return ENUNCIADO_EDEFAULT == null ? enunciado != null : !ENUNCIADO_EDEFAULT.equals(enunciado);
			case AutoevaluacionPackage.EJERCICIO__PUNTUACION_EJ:
				return puntuacionEj != PUNTUACION_EJ_EDEFAULT;
			case AutoevaluacionPackage.EJERCICIO__RESPUESTAS:
				return respuestas != null;
			case AutoevaluacionPackage.EJERCICIO__CATEGORIA:
				return CATEGORIA_EDEFAULT == null ? categoria != null : !CATEGORIA_EDEFAULT.equals(categoria);
			case AutoevaluacionPackage.EJERCICIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AutoevaluacionPackage.EJERCICIO__ORDER:
				return order != ORDER_EDEFAULT;
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
		result.append(" (enunciado: ");
		result.append(enunciado);
		result.append(", puntuacionEj: ");
		result.append(puntuacionEj);
		result.append(", categoria: ");
		result.append(categoria);
		result.append(", name: ");
		result.append(name);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //EjercicioImpl
