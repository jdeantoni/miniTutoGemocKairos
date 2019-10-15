/**
 */
package fr.inria.kairos.tuto.model.kairosTuto;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.InputPort#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.kairos.tuto.model.kairosTuto.Connector#getInputport <em>Inputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getInputPort_Connector()
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Connector#getInputport
	 * @model opposite="inputport"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.model.kairosTuto.InputPort#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // InputPort
