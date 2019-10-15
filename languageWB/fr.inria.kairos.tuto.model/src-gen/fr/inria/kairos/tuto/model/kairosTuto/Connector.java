/**
 */
package fr.inria.kairos.tuto.model.kairosTuto;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.Connector#getInputport <em>Inputport</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.model.kairosTuto.Connector#getOutputport <em>Outputport</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Inputport</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.kairos.tuto.model.kairosTuto.InputPort#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputport</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputport</em>' reference.
	 * @see #setInputport(InputPort)
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getConnector_Inputport()
	 * @see fr.inria.kairos.tuto.model.kairosTuto.InputPort#getConnector
	 * @model opposite="connector" required="true"
	 * @generated
	 */
	InputPort getInputport();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.model.kairosTuto.Connector#getInputport <em>Inputport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputport</em>' reference.
	 * @see #getInputport()
	 * @generated
	 */
	void setInputport(InputPort value);

	/**
	 * Returns the value of the '<em><b>Outputport</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.kairos.tuto.model.kairosTuto.OutputPort#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputport</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputport</em>' reference.
	 * @see #setOutputport(OutputPort)
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoPackage#getConnector_Outputport()
	 * @see fr.inria.kairos.tuto.model.kairosTuto.OutputPort#getConnector
	 * @model opposite="connector" required="true"
	 * @generated
	 */
	OutputPort getOutputport();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.model.kairosTuto.Connector#getOutputport <em>Outputport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputport</em>' reference.
	 * @see #getOutputport()
	 * @generated
	 */
	void setOutputport(OutputPort value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transfer();

} // Connector
