/**
 */
package fr.inria.kairos.tuto.model.kairosTuto.impl;

import fr.inria.kairos.tuto.model.kairosTuto.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KairosTutoFactoryImpl extends EFactoryImpl implements KairosTutoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KairosTutoFactory init() {
		try {
			KairosTutoFactory theKairosTutoFactory = (KairosTutoFactory) EPackage.Registry.INSTANCE
					.getEFactory(KairosTutoPackage.eNS_URI);
			if (theKairosTutoFactory != null) {
				return theKairosTutoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KairosTutoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KairosTutoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case KairosTutoPackage.KAIROS_SYSTEM:
			return createKairosSystem();
		case KairosTutoPackage.ACTOR:
			return createActor();
		case KairosTutoPackage.INPUT_PORT:
			return createInputPort();
		case KairosTutoPackage.OUTPUT_PORT:
			return createOutputPort();
		case KairosTutoPackage.CONNECTOR:
			return createConnector();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KairosSystem createKairosSystem() {
		KairosSystemImpl kairosSystem = new KairosSystemImpl();
		return kairosSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KairosTutoPackage getKairosTutoPackage() {
		return (KairosTutoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KairosTutoPackage getPackage() {
		return KairosTutoPackage.eINSTANCE;
	}

} //KairosTutoFactoryImpl
