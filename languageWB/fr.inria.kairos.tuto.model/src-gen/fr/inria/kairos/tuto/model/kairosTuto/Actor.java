/**
 */
package fr.inria.kairos.tuto.model.kairosTuto;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#getOwnedInputPorts <em>Owned Input Ports</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#getOwnedOutputPorts <em>Owned Output Ports</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.tuto.model.kairosTuto.InputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Input Ports</em>' containment reference list.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getActor_OwnedInputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPort> getOwnedInputPorts();

	/**
	 * Returns the value of the '<em><b>Owned Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.tuto.model.kairosTuto.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Output Ports</em>' containment reference list.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getActor_OwnedOutputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPort> getOwnedOutputPorts();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getActor_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void read();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void write();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transform();

} // Actor
