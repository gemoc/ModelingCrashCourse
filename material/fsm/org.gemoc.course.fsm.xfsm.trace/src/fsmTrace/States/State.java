/**
 */
package fsmTrace.States;

import fsmTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link fsmTrace.States.State#getFiniteStateMachine_consummedString_Values <em>Finite State Machine consummed String Values</em>}</li>
 *   <li>{@link fsmTrace.States.State#getFiniteStateMachine_currentState_Values <em>Finite State Machine current State Values</em>}</li>
 *   <li>{@link fsmTrace.States.State#getFiniteStateMachine_producedString_Values <em>Finite State Machine produced String Values</em>}</li>
 *   <li>{@link fsmTrace.States.State#getFiniteStateMachine_unprocessedString_Values <em>Finite State Machine unprocessed String Values</em>}</li>
 *   <li>{@link fsmTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_EndedSteps()
	 * @see fsmTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Finite State Machine consummed String Values</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.States.FiniteStateMachine_consummedString_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finite State Machine consummed String Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finite State Machine consummed String Values</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_FiniteStateMachine_consummedString_Values()
	 * @see fsmTrace.States.FiniteStateMachine_consummedString_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FiniteStateMachine_consummedString_Value> getFiniteStateMachine_consummedString_Values();

	/**
	 * Returns the value of the '<em><b>Finite State Machine current State Values</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.States.FiniteStateMachine_currentState_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finite State Machine current State Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finite State Machine current State Values</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_FiniteStateMachine_currentState_Values()
	 * @see fsmTrace.States.FiniteStateMachine_currentState_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FiniteStateMachine_currentState_Value> getFiniteStateMachine_currentState_Values();

	/**
	 * Returns the value of the '<em><b>Finite State Machine produced String Values</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.States.FiniteStateMachine_producedString_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.FiniteStateMachine_producedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finite State Machine produced String Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finite State Machine produced String Values</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_FiniteStateMachine_producedString_Values()
	 * @see fsmTrace.States.FiniteStateMachine_producedString_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FiniteStateMachine_producedString_Value> getFiniteStateMachine_producedString_Values();

	/**
	 * Returns the value of the '<em><b>Finite State Machine unprocessed String Values</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.States.FiniteStateMachine_unprocessedString_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finite State Machine unprocessed String Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finite State Machine unprocessed String Values</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_FiniteStateMachine_unprocessedString_Values()
	 * @see fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FiniteStateMachine_unprocessedString_Value> getFiniteStateMachine_unprocessedString_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_StartedSteps()
	 * @see fsmTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

} // State
