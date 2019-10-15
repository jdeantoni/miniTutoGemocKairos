/**
 */
package fr.inria.kairos.tuto.model.kairosTuto.impl;

import fr.inria.kairos.tuto.model.kairosTuto.Connector;
import fr.inria.kairos.tuto.model.kairosTuto.InputPort;
import fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage;
import fr.inria.kairos.tuto.model.kairosTuto.OutputPort;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.impl.ConnectorImpl#getInputport <em>Inputport</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.impl.ConnectorImpl#getOutputport <em>Outputport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends NamedElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getInputport() <em>Inputport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputport()
	 * @generated
	 * @ordered
	 */
	protected InputPort inputport;

	/**
	 * The cached value of the '{@link #getOutputport() <em>Outputport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputport()
	 * @generated
	 * @ordered
	 */
	protected OutputPort outputport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KairosTutoPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getInputport() {
		if (inputport != null && inputport.eIsProxy()) {
			InternalEObject oldInputport = (InternalEObject) inputport;
			inputport = (InputPort) eResolveProxy(oldInputport);
			if (inputport != oldInputport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KairosTutoPackage.CONNECTOR__INPUTPORT,
							oldInputport, inputport));
			}
		}
		return inputport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort basicGetInputport() {
		return inputport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputport(InputPort newInputport, NotificationChain msgs) {
		InputPort oldInputport = inputport;
		inputport = newInputport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					KairosTutoPackage.CONNECTOR__INPUTPORT, oldInputport, newInputport);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputport(InputPort newInputport) {
		if (newInputport != inputport) {
			NotificationChain msgs = null;
			if (inputport != null)
				msgs = ((InternalEObject) inputport).eInverseRemove(this, KairosTutoPackage.INPUT_PORT__CONNECTOR,
						InputPort.class, msgs);
			if (newInputport != null)
				msgs = ((InternalEObject) newInputport).eInverseAdd(this, KairosTutoPackage.INPUT_PORT__CONNECTOR,
						InputPort.class, msgs);
			msgs = basicSetInputport(newInputport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KairosTutoPackage.CONNECTOR__INPUTPORT, newInputport,
					newInputport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getOutputport() {
		if (outputport != null && outputport.eIsProxy()) {
			InternalEObject oldOutputport = (InternalEObject) outputport;
			outputport = (OutputPort) eResolveProxy(oldOutputport);
			if (outputport != oldOutputport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KairosTutoPackage.CONNECTOR__OUTPUTPORT,
							oldOutputport, outputport));
			}
		}
		return outputport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort basicGetOutputport() {
		return outputport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputport(OutputPort newOutputport, NotificationChain msgs) {
		OutputPort oldOutputport = outputport;
		outputport = newOutputport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					KairosTutoPackage.CONNECTOR__OUTPUTPORT, oldOutputport, newOutputport);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputport(OutputPort newOutputport) {
		if (newOutputport != outputport) {
			NotificationChain msgs = null;
			if (outputport != null)
				msgs = ((InternalEObject) outputport).eInverseRemove(this, KairosTutoPackage.OUTPUT_PORT__CONNECTOR,
						OutputPort.class, msgs);
			if (newOutputport != null)
				msgs = ((InternalEObject) newOutputport).eInverseAdd(this, KairosTutoPackage.OUTPUT_PORT__CONNECTOR,
						OutputPort.class, msgs);
			msgs = basicSetOutputport(newOutputport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KairosTutoPackage.CONNECTOR__OUTPUTPORT,
					newOutputport, newOutputport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transfer() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KairosTutoPackage.CONNECTOR__INPUTPORT:
			if (inputport != null)
				msgs = ((InternalEObject) inputport).eInverseRemove(this, KairosTutoPackage.INPUT_PORT__CONNECTOR,
						InputPort.class, msgs);
			return basicSetInputport((InputPort) otherEnd, msgs);
		case KairosTutoPackage.CONNECTOR__OUTPUTPORT:
			if (outputport != null)
				msgs = ((InternalEObject) outputport).eInverseRemove(this, KairosTutoPackage.OUTPUT_PORT__CONNECTOR,
						OutputPort.class, msgs);
			return basicSetOutputport((OutputPort) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KairosTutoPackage.CONNECTOR__INPUTPORT:
			return basicSetInputport(null, msgs);
		case KairosTutoPackage.CONNECTOR__OUTPUTPORT:
			return basicSetOutputport(null, msgs);
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
		case KairosTutoPackage.CONNECTOR__INPUTPORT:
			if (resolve)
				return getInputport();
			return basicGetInputport();
		case KairosTutoPackage.CONNECTOR__OUTPUTPORT:
			if (resolve)
				return getOutputport();
			return basicGetOutputport();
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
		case KairosTutoPackage.CONNECTOR__INPUTPORT:
			setInputport((InputPort) newValue);
			return;
		case KairosTutoPackage.CONNECTOR__OUTPUTPORT:
			setOutputport((OutputPort) newValue);
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
		case KairosTutoPackage.CONNECTOR__INPUTPORT:
			setInputport((InputPort) null);
			return;
		case KairosTutoPackage.CONNECTOR__OUTPUTPORT:
			setOutputport((OutputPort) null);
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
		case KairosTutoPackage.CONNECTOR__INPUTPORT:
			return inputport != null;
		case KairosTutoPackage.CONNECTOR__OUTPUTPORT:
			return outputport != null;
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
		case KairosTutoPackage.CONNECTOR___TRANSFER:
			transfer();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConnectorImpl
