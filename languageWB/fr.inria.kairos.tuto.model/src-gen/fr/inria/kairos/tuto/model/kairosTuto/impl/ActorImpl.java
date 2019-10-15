/**
 */
package fr.inria.kairos.tuto.model.kairosTuto.impl;

import fr.inria.kairos.tuto.model.kairosTuto.Actor;
import fr.inria.kairos.tuto.model.kairosTuto.InputPort;
import fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage;
import fr.inria.kairos.tuto.model.kairosTuto.OutputPort;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.impl.ActorImpl#getOwnedInputPorts <em>Owned Input Ports</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.impl.ActorImpl#getOwnedOutputPorts <em>Owned Output Ports</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.impl.ActorImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends NamedElementImpl implements Actor {
	/**
	 * The cached value of the '{@link #getOwnedInputPorts() <em>Owned Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> ownedInputPorts;

	/**
	 * The cached value of the '{@link #getOwnedOutputPorts() <em>Owned Output Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> ownedOutputPorts;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KairosTutoPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getOwnedInputPorts() {
		if (ownedInputPorts == null) {
			ownedInputPorts = new EObjectContainmentEList<InputPort>(InputPort.class, this,
					KairosTutoPackage.ACTOR__OWNED_INPUT_PORTS);
		}
		return ownedInputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPort> getOwnedOutputPorts() {
		if (ownedOutputPorts == null) {
			ownedOutputPorts = new EObjectContainmentEList<OutputPort>(OutputPort.class, this,
					KairosTutoPackage.ACTOR__OWNED_OUTPUT_PORTS);
		}
		return ownedOutputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KairosTutoPackage.ACTOR__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void read() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void write() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transform() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KairosTutoPackage.ACTOR__OWNED_INPUT_PORTS:
			return ((InternalEList<?>) getOwnedInputPorts()).basicRemove(otherEnd, msgs);
		case KairosTutoPackage.ACTOR__OWNED_OUTPUT_PORTS:
			return ((InternalEList<?>) getOwnedOutputPorts()).basicRemove(otherEnd, msgs);
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
		case KairosTutoPackage.ACTOR__OWNED_INPUT_PORTS:
			return getOwnedInputPorts();
		case KairosTutoPackage.ACTOR__OWNED_OUTPUT_PORTS:
			return getOwnedOutputPorts();
		case KairosTutoPackage.ACTOR__PERIOD:
			return getPeriod();
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
		case KairosTutoPackage.ACTOR__OWNED_INPUT_PORTS:
			getOwnedInputPorts().clear();
			getOwnedInputPorts().addAll((Collection<? extends InputPort>) newValue);
			return;
		case KairosTutoPackage.ACTOR__OWNED_OUTPUT_PORTS:
			getOwnedOutputPorts().clear();
			getOwnedOutputPorts().addAll((Collection<? extends OutputPort>) newValue);
			return;
		case KairosTutoPackage.ACTOR__PERIOD:
			setPeriod((Integer) newValue);
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
		case KairosTutoPackage.ACTOR__OWNED_INPUT_PORTS:
			getOwnedInputPorts().clear();
			return;
		case KairosTutoPackage.ACTOR__OWNED_OUTPUT_PORTS:
			getOwnedOutputPorts().clear();
			return;
		case KairosTutoPackage.ACTOR__PERIOD:
			setPeriod(PERIOD_EDEFAULT);
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
		case KairosTutoPackage.ACTOR__OWNED_INPUT_PORTS:
			return ownedInputPorts != null && !ownedInputPorts.isEmpty();
		case KairosTutoPackage.ACTOR__OWNED_OUTPUT_PORTS:
			return ownedOutputPorts != null && !ownedOutputPorts.isEmpty();
		case KairosTutoPackage.ACTOR__PERIOD:
			return period != PERIOD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case KairosTutoPackage.ACTOR___START:
			start();
			return null;
		case KairosTutoPackage.ACTOR___STOP:
			stop();
			return null;
		case KairosTutoPackage.ACTOR___READ:
			read();
			return null;
		case KairosTutoPackage.ACTOR___WRITE:
			write();
			return null;
		case KairosTutoPackage.ACTOR___TRANSFORM:
			transform();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (period: ");
		result.append(period);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
