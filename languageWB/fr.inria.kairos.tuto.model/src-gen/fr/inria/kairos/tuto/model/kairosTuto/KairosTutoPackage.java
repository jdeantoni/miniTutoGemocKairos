/**
 */
package fr.inria.kairos.tuto.model.kairosTuto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosTutoFactory
 * @model kind="package"
 * @generated
 */
public interface KairosTutoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kairosTuto";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://team.inria.fr/kairos/kairosTuto";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kairosTuto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KairosTutoPackage eINSTANCE = fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.NamedElementImpl
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.KairosSystemImpl <em>Kairos System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosSystemImpl
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getKairosSystem()
	 * @generated
	 */
	int KAIROS_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAIROS_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAIROS_SYSTEM__OWNED_ACTORS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAIROS_SYSTEM__OWNED_CONNECTORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kairos System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAIROS_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Inc Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAIROS_SYSTEM___INC_TIME = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Kairos System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAIROS_SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.ActorImpl
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_INPUT_PORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_OUTPUT_PORTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PERIOD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___START = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___STOP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___READ = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___WRITE = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___TRANSFORM = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.PortImpl
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.InputPortImpl
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CONNECTOR = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.OutputPortImpl
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CONNECTOR = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.ConnectorImpl
	 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INPUTPORT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUTPUTPORT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___TRANSFER = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.tuto.model.kairosTuto.KairosSystem <em>Kairos System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kairos System</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosSystem
	 * @generated
	 */
	EClass getKairosSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.tuto.model.kairosTuto.KairosSystem#getOwnedActors <em>Owned Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Actors</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosSystem#getOwnedActors()
	 * @see #getKairosSystem()
	 * @generated
	 */
	EReference getKairosSystem_OwnedActors();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.tuto.model.kairosTuto.KairosSystem#getOwnedConnectors <em>Owned Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Connectors</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosSystem#getOwnedConnectors()
	 * @see #getKairosSystem()
	 * @generated
	 */
	EReference getKairosSystem_OwnedConnectors();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.tuto.model.kairosTuto.KairosSystem#incTime() <em>Inc Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inc Time</em>' operation.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.KairosSystem#incTime()
	 * @generated
	 */
	EOperation getKairosSystem__IncTime();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.tuto.model.kairosTuto.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.tuto.model.kairosTuto.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#getOwnedInputPorts <em>Owned Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Input Ports</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Actor#getOwnedInputPorts()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_OwnedInputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#getOwnedOutputPorts <em>Owned Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Output Ports</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Actor#getOwnedOutputPorts()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_OwnedOutputPorts();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Actor#getPeriod()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Period();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Actor#start()
	 * @generated
	 */
	EOperation getActor__Start();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Actor#stop()
	 * @generated
	 */
	EOperation getActor__Stop();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#read() <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Actor#read()
	 * @generated
	 */
	EOperation getActor__Read();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#write() <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Actor#write()
	 * @generated
	 */
	EOperation getActor__Write();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.tuto.model.kairosTuto.Actor#transform() <em>Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform</em>' operation.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Actor#transform()
	 * @generated
	 */
	EOperation getActor__Transform();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.tuto.model.kairosTuto.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.tuto.model.kairosTuto.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.tuto.model.kairosTuto.InputPort#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.InputPort#getConnector()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Connector();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.tuto.model.kairosTuto.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.tuto.model.kairosTuto.OutputPort#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.OutputPort#getConnector()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Connector();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.tuto.model.kairosTuto.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.tuto.model.kairosTuto.Connector#getInputport <em>Inputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputport</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Connector#getInputport()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Inputport();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.tuto.model.kairosTuto.Connector#getOutputport <em>Outputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputport</em>'.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Connector#getOutputport()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Outputport();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.tuto.model.kairosTuto.Connector#transfer() <em>Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer</em>' operation.
	 * @see fr.inria.kairos.tuto.model.kairosTuto.Connector#transfer()
	 * @generated
	 */
	EOperation getConnector__Transfer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KairosTutoFactory getKairosTutoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.KairosSystemImpl <em>Kairos System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosSystemImpl
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getKairosSystem()
		 * @generated
		 */
		EClass KAIROS_SYSTEM = eINSTANCE.getKairosSystem();

		/**
		 * The meta object literal for the '<em><b>Owned Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAIROS_SYSTEM__OWNED_ACTORS = eINSTANCE.getKairosSystem_OwnedActors();

		/**
		 * The meta object literal for the '<em><b>Owned Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAIROS_SYSTEM__OWNED_CONNECTORS = eINSTANCE.getKairosSystem_OwnedConnectors();

		/**
		 * The meta object literal for the '<em><b>Inc Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KAIROS_SYSTEM___INC_TIME = eINSTANCE.getKairosSystem__IncTime();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.NamedElementImpl
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.ActorImpl
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Owned Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__OWNED_INPUT_PORTS = eINSTANCE.getActor_OwnedInputPorts();

		/**
		 * The meta object literal for the '<em><b>Owned Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__OWNED_OUTPUT_PORTS = eINSTANCE.getActor_OwnedOutputPorts();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__PERIOD = eINSTANCE.getActor_Period();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___START = eINSTANCE.getActor__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___STOP = eINSTANCE.getActor__Stop();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___READ = eINSTANCE.getActor__Read();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___WRITE = eINSTANCE.getActor__Write();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___TRANSFORM = eINSTANCE.getActor__Transform();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.PortImpl
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.InputPortImpl
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__CONNECTOR = eINSTANCE.getInputPort_Connector();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.OutputPortImpl
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__CONNECTOR = eINSTANCE.getOutputPort_Connector();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.tuto.model.kairosTuto.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.ConnectorImpl
		 * @see fr.inria.kairos.tuto.model.kairosTuto.impl.KairosTutoPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Inputport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__INPUTPORT = eINSTANCE.getConnector_Inputport();

		/**
		 * The meta object literal for the '<em><b>Outputport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__OUTPUTPORT = eINSTANCE.getConnector_Outputport();

		/**
		 * The meta object literal for the '<em><b>Transfer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___TRANSFER = eINSTANCE.getConnector__Transfer();

	}

} //KairosTutoPackage
