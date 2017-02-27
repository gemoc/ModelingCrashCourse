/**
 */
package fsmTrace.States.impl;

import fsmTrace.States.*;

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
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
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
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE: return createFiniteStateMachine_consummedString_Value();
			case StatesPackage.FINITE_STATE_MACHINE_CURRENT_STATE_VALUE: return createFiniteStateMachine_currentState_Value();
			case StatesPackage.FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE: return createFiniteStateMachine_producedString_Value();
			case StatesPackage.FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE: return createFiniteStateMachine_unprocessedString_Value();
			case StatesPackage.STATE: return createState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteStateMachine_consummedString_Value createFiniteStateMachine_consummedString_Value() {
		FiniteStateMachine_consummedString_ValueImpl finiteStateMachine_consummedString_Value = new FiniteStateMachine_consummedString_ValueImpl();
		return finiteStateMachine_consummedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteStateMachine_currentState_Value createFiniteStateMachine_currentState_Value() {
		FiniteStateMachine_currentState_ValueImpl finiteStateMachine_currentState_Value = new FiniteStateMachine_currentState_ValueImpl();
		return finiteStateMachine_currentState_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteStateMachine_producedString_Value createFiniteStateMachine_producedString_Value() {
		FiniteStateMachine_producedString_ValueImpl finiteStateMachine_producedString_Value = new FiniteStateMachine_producedString_ValueImpl();
		return finiteStateMachine_producedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteStateMachine_unprocessedString_Value createFiniteStateMachine_unprocessedString_Value() {
		FiniteStateMachine_unprocessedString_ValueImpl finiteStateMachine_unprocessedString_Value = new FiniteStateMachine_unprocessedString_ValueImpl();
		return finiteStateMachine_unprocessedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
