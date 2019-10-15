/**
 */
package fr.inria.kairos.tuto.model.kairosTuto.impl;

import fr.inria.kairos.tuto.model.kairosTuto.Actor;
import fr.inria.kairos.tuto.model.kairosTuto.Connector;
import fr.inria.kairos.tuto.model.kairosTuto.KairosSystem;
import fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kairos System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.impl.KairosSystemImpl#getOwnedActors <em>Owned Actors</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.impl.KairosSystemImpl#getOwnedConnectors <em>Owned Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KairosSystemImpl extends NamedElementImpl implements KairosSystem {
	/**
	 * The cached value of the '{@link #getOwnedActors() <em>Owned Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> ownedActors;

	/**
	 * The cached value of the '{@link #getOwnedConnectors() <em>Owned Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KairosSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KairosTutoPackage.Literals.KAIROS_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getOwnedActors() {
		if (ownedActors == null) {
			ownedActors = new EObjectContainmentEList<Actor>(Actor.class, this,
					KairosTutoPackage.KAIROS_SYSTEM__OWNED_ACTORS);
		}
		return ownedActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnectors() {
		if (ownedConnectors == null) {
			ownedConnectors = new EObjectContainmentEList<Connector>(Connector.class, this,
					KairosTutoPackage.KAIROS_SYSTEM__OWNED_CONNECTORS);
		}
		return ownedConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void incTime() {
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
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_ACTORS:
			return ((InternalEList<?>) getOwnedActors()).basicRemove(otherEnd, msgs);
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_CONNECTORS:
			return ((InternalEList<?>) getOwnedConnectors()).basicRemove(otherEnd, msgs);
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
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_ACTORS:
			return getOwnedActors();
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_CONNECTORS:
			return getOwnedConnectors();
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
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_ACTORS:
			getOwnedActors().clear();
			getOwnedActors().addAll((Collection<? extends Actor>) newValue);
			return;
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_CONNECTORS:
			getOwnedConnectors().clear();
			getOwnedConnectors().addAll((Collection<? extends Connector>) newValue);
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
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_ACTORS:
			getOwnedActors().clear();
			return;
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_CONNECTORS:
			getOwnedConnectors().clear();
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
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_ACTORS:
			return ownedActors != null && !ownedActors.isEmpty();
		case KairosTutoPackage.KAIROS_SYSTEM__OWNED_CONNECTORS:
			return ownedConnectors != null && !ownedConnectors.isEmpty();
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
		case KairosTutoPackage.KAIROS_SYSTEM___INC_TIME:
			incTime();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //KairosSystemImpl
