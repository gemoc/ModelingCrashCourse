/**
 */
package fsmTrace.States.fsm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fsmTrace.States.fsm.FsmFactory
 * @model kind="package"
 * @generated
 */
public interface FsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace_fsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmPackage eINSTANCE = fsmTrace.States.fsm.impl.FsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.States.fsm.impl.TracedFiniteStateMachineImpl <em>Traced Finite State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.fsm.impl.TracedFiniteStateMachineImpl
	 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedFiniteStateMachine()
	 * @generated
	 */
	int TRACED_FINITE_STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Consummed String Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Current State Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINITE_STATE_MACHINE__ORIGINAL_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Produced String Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Unprocessed String Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE = 4;

	/**
	 * The number of structural features of the '<em>Traced Finite State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINITE_STATE_MACHINE_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link fsmTrace.States.fsm.TracedFiniteStateMachine <em>Traced Finite State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Finite State Machine</em>'.
	 * @see fsmTrace.States.fsm.TracedFiniteStateMachine
	 * @generated
	 */
	EClass getTracedFiniteStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getConsummedStringSequence <em>Consummed String Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consummed String Sequence</em>'.
	 * @see fsmTrace.States.fsm.TracedFiniteStateMachine#getConsummedStringSequence()
	 * @see #getTracedFiniteStateMachine()
	 * @generated
	 */
	EReference getTracedFiniteStateMachine_ConsummedStringSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getCurrentStateSequence <em>Current State Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current State Sequence</em>'.
	 * @see fsmTrace.States.fsm.TracedFiniteStateMachine#getCurrentStateSequence()
	 * @see #getTracedFiniteStateMachine()
	 * @generated
	 */
	EReference getTracedFiniteStateMachine_CurrentStateSequence();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see fsmTrace.States.fsm.TracedFiniteStateMachine#getOriginalObject()
	 * @see #getTracedFiniteStateMachine()
	 * @generated
	 */
	EReference getTracedFiniteStateMachine_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getProducedStringSequence <em>Produced String Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Produced String Sequence</em>'.
	 * @see fsmTrace.States.fsm.TracedFiniteStateMachine#getProducedStringSequence()
	 * @see #getTracedFiniteStateMachine()
	 * @generated
	 */
	EReference getTracedFiniteStateMachine_ProducedStringSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getUnprocessedStringSequence <em>Unprocessed String Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unprocessed String Sequence</em>'.
	 * @see fsmTrace.States.fsm.TracedFiniteStateMachine#getUnprocessedStringSequence()
	 * @see #getTracedFiniteStateMachine()
	 * @generated
	 */
	EReference getTracedFiniteStateMachine_UnprocessedStringSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmFactory getFsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fsmTrace.States.fsm.impl.TracedFiniteStateMachineImpl <em>Traced Finite State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.fsm.impl.TracedFiniteStateMachineImpl
		 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedFiniteStateMachine()
		 * @generated
		 */
		EClass TRACED_FINITE_STATE_MACHINE = eINSTANCE.getTracedFiniteStateMachine();

		/**
		 * The meta object literal for the '<em><b>Consummed String Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE = eINSTANCE.getTracedFiniteStateMachine_ConsummedStringSequence();

		/**
		 * The meta object literal for the '<em><b>Current State Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE = eINSTANCE.getTracedFiniteStateMachine_CurrentStateSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FINITE_STATE_MACHINE__ORIGINAL_OBJECT = eINSTANCE.getTracedFiniteStateMachine_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Produced String Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE = eINSTANCE.getTracedFiniteStateMachine_ProducedStringSequence();

		/**
		 * The meta object literal for the '<em><b>Unprocessed String Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE = eINSTANCE.getTracedFiniteStateMachine_UnprocessedStringSequence();

	}

} //FsmPackage
