/**
 */
package fr.inria.kairos.tuto.model.kairosTuto;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kairos System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.KairosSystem#getOwnedActors <em>Owned Actors</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.KairosSystem#getOwnedConnectors <em>Owned Connectors</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getKairosSystem()
 * @model
 * @generated
 */
public interface KairosSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Actors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.tuto.model.kairosTuto.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actors</em>' containment reference list.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getKairosSystem_OwnedActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getOwnedActors();

	/**
	 * Returns the value of the '<em><b>Owned Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.tuto.model.kairosTuto.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Connectors</em>' containment reference list.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getKairosSystem_OwnedConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getOwnedConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void incTime();

} // KairosSystem
