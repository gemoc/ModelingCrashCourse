/**
 */
package fsmTrace.States;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see fsmTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = fsmTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.Value
	 * @see fsmTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 5;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATES_NO_OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.FiniteStateMachine_consummedString_ValueImpl <em>Finite State Machine consummed String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.FiniteStateMachine_consummedString_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getFiniteStateMachine_consummedString_Value()
	 * @generated
	 */
	int FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Consummed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Finite State Machine consummed String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.FiniteStateMachine_currentState_ValueImpl <em>Finite State Machine current State Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.FiniteStateMachine_currentState_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getFiniteStateMachine_currentState_Value()
	 * @generated
	 */
	int FINITE_STATE_MACHINE_CURRENT_STATE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__CURRENT_STATE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Finite State Machine current State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_CURRENT_STATE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.FiniteStateMachine_producedString_ValueImpl <em>Finite State Machine produced String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.FiniteStateMachine_producedString_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getFiniteStateMachine_producedString_Value()
	 * @generated
	 */
	int FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Produced String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__PRODUCED_STRING = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Finite State Machine produced String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.FiniteStateMachine_unprocessedString_ValueImpl <em>Finite State Machine unprocessed String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.FiniteStateMachine_unprocessedString_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getFiniteStateMachine_unprocessedString_Value()
	 * @generated
	 */
	int FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unprocessed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Finite State Machine unprocessed String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 4;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Finite State Machine consummed String Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Finite State Machine current State Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Finite State Machine produced String Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Finite State Machine unprocessed String Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link fsmTrace.States.FiniteStateMachine_consummedString_Value <em>Finite State Machine consummed String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite State Machine consummed String Value</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_consummedString_Value
	 * @generated
	 */
	EClass getFiniteStateMachine_consummedString_Value();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getConsummedString <em>Consummed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consummed String</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_consummedString_Value#getConsummedString()
	 * @see #getFiniteStateMachine_consummedString_Value()
	 * @generated
	 */
	EAttribute getFiniteStateMachine_consummedString_Value_ConsummedString();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_consummedString_Value#getParent()
	 * @see #getFiniteStateMachine_consummedString_Value()
	 * @generated
	 */
	EReference getFiniteStateMachine_consummedString_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_consummedString_Value#getStates()
	 * @see #getFiniteStateMachine_consummedString_Value()
	 * @generated
	 */
	EReference getFiniteStateMachine_consummedString_Value_States();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.FiniteStateMachine_currentState_Value <em>Finite State Machine current State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite State Machine current State Value</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_currentState_Value
	 * @generated
	 */
	EClass getFiniteStateMachine_currentState_Value();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_currentState_Value#getCurrentState()
	 * @see #getFiniteStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getFiniteStateMachine_currentState_Value_CurrentState();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_currentState_Value#getParent()
	 * @see #getFiniteStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getFiniteStateMachine_currentState_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_currentState_Value#getStates()
	 * @see #getFiniteStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getFiniteStateMachine_currentState_Value_States();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.FiniteStateMachine_producedString_Value <em>Finite State Machine produced String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite State Machine produced String Value</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_producedString_Value
	 * @generated
	 */
	EClass getFiniteStateMachine_producedString_Value();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.FiniteStateMachine_producedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_producedString_Value#getParent()
	 * @see #getFiniteStateMachine_producedString_Value()
	 * @generated
	 */
	EReference getFiniteStateMachine_producedString_Value_Parent();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.FiniteStateMachine_producedString_Value#getProducedString <em>Produced String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produced String</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_producedString_Value#getProducedString()
	 * @see #getFiniteStateMachine_producedString_Value()
	 * @generated
	 */
	EAttribute getFiniteStateMachine_producedString_Value_ProducedString();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.FiniteStateMachine_producedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_producedString_Value#getStates()
	 * @see #getFiniteStateMachine_producedString_Value()
	 * @generated
	 */
	EReference getFiniteStateMachine_producedString_Value_States();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.FiniteStateMachine_unprocessedString_Value <em>Finite State Machine unprocessed String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite State Machine unprocessed String Value</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_unprocessedString_Value
	 * @generated
	 */
	EClass getFiniteStateMachine_unprocessedString_Value();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getParent()
	 * @see #getFiniteStateMachine_unprocessedString_Value()
	 * @generated
	 */
	EReference getFiniteStateMachine_unprocessedString_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getStates()
	 * @see #getFiniteStateMachine_unprocessedString_Value()
	 * @generated
	 */
	EReference getFiniteStateMachine_unprocessedString_Value_States();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getUnprocessedString <em>Unprocessed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unprocessed String</em>'.
	 * @see fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getUnprocessedString()
	 * @see #getFiniteStateMachine_unprocessedString_Value()
	 * @generated
	 */
	EAttribute getFiniteStateMachine_unprocessedString_Value_UnprocessedString();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fsmTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see fsmTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getFiniteStateMachine_consummedString_Values <em>Finite State Machine consummed String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Finite State Machine consummed String Values</em>'.
	 * @see fsmTrace.States.State#getFiniteStateMachine_consummedString_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FiniteStateMachine_consummedString_Values();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getFiniteStateMachine_currentState_Values <em>Finite State Machine current State Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Finite State Machine current State Values</em>'.
	 * @see fsmTrace.States.State#getFiniteStateMachine_currentState_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FiniteStateMachine_currentState_Values();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getFiniteStateMachine_producedString_Values <em>Finite State Machine produced String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Finite State Machine produced String Values</em>'.
	 * @see fsmTrace.States.State#getFiniteStateMachine_producedString_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FiniteStateMachine_producedString_Values();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getFiniteStateMachine_unprocessedString_Values <em>Finite State Machine unprocessed String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Finite State Machine unprocessed String Values</em>'.
	 * @see fsmTrace.States.State#getFiniteStateMachine_unprocessedString_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FiniteStateMachine_unprocessedString_Values();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see fsmTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see fsmTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see fsmTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link fsmTrace.States.impl.FiniteStateMachine_consummedString_ValueImpl <em>Finite State Machine consummed String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.FiniteStateMachine_consummedString_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getFiniteStateMachine_consummedString_Value()
		 * @generated
		 */
		EClass FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE = eINSTANCE.getFiniteStateMachine_consummedString_Value();

		/**
		 * The meta object literal for the '<em><b>Consummed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING = eINSTANCE.getFiniteStateMachine_consummedString_Value_ConsummedString();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT = eINSTANCE.getFiniteStateMachine_consummedString_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES = eINSTANCE.getFiniteStateMachine_consummedString_Value_States();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.FiniteStateMachine_currentState_ValueImpl <em>Finite State Machine current State Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.FiniteStateMachine_currentState_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getFiniteStateMachine_currentState_Value()
		 * @generated
		 */
		EClass FINITE_STATE_MACHINE_CURRENT_STATE_VALUE = eINSTANCE.getFiniteStateMachine_currentState_Value();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__CURRENT_STATE = eINSTANCE.getFiniteStateMachine_currentState_Value_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__PARENT = eINSTANCE.getFiniteStateMachine_currentState_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__STATES = eINSTANCE.getFiniteStateMachine_currentState_Value_States();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.FiniteStateMachine_producedString_ValueImpl <em>Finite State Machine produced String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.FiniteStateMachine_producedString_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getFiniteStateMachine_producedString_Value()
		 * @generated
		 */
		EClass FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE = eINSTANCE.getFiniteStateMachine_producedString_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__PARENT = eINSTANCE.getFiniteStateMachine_producedString_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Produced String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__PRODUCED_STRING = eINSTANCE.getFiniteStateMachine_producedString_Value_ProducedString();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__STATES = eINSTANCE.getFiniteStateMachine_producedString_Value_States();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.FiniteStateMachine_unprocessedString_ValueImpl <em>Finite State Machine unprocessed String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.FiniteStateMachine_unprocessedString_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getFiniteStateMachine_unprocessedString_Value()
		 * @generated
		 */
		EClass FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE = eINSTANCE.getFiniteStateMachine_unprocessedString_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__PARENT = eINSTANCE.getFiniteStateMachine_unprocessedString_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES = eINSTANCE.getFiniteStateMachine_unprocessedString_Value_States();

		/**
		 * The meta object literal for the '<em><b>Unprocessed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING = eINSTANCE.getFiniteStateMachine_unprocessedString_Value_UnprocessedString();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Finite State Machine consummed String Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES = eINSTANCE.getState_FiniteStateMachine_consummedString_Values();

		/**
		 * The meta object literal for the '<em><b>Finite State Machine current State Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES = eINSTANCE.getState_FiniteStateMachine_currentState_Values();

		/**
		 * The meta object literal for the '<em><b>Finite State Machine produced String Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES = eINSTANCE.getState_FiniteStateMachine_producedString_Values();

		/**
		 * The meta object literal for the '<em><b>Finite State Machine unprocessed String Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES = eINSTANCE.getState_FiniteStateMachine_unprocessedString_Values();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.Value
		 * @see fsmTrace.States.impl.StatesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>States No Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATES_NO_OPPOSITE = eINSTANCE.getValue_StatesNoOpposite();

	}

} //StatesPackage
