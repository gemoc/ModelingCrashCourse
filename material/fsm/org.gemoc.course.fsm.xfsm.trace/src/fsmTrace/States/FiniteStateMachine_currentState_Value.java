/**
 */
package fsmTrace.States;

import fsmTrace.States.fsm.TracedFiniteStateMachine;

import org.eclipse.emf.common.util.EList;

import org.gemoc.course.fsm.xfsm.fsm.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite State Machine current State Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.StatesPackage#getFiniteStateMachine_currentState_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface FiniteStateMachine_currentState_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see fsmTrace.States.StatesPackage#getFiniteStateMachine_currentState_Value_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getCurrentStateSequence <em>Current State Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedFiniteStateMachine)
	 * @see fsmTrace.States.StatesPackage#getFiniteStateMachine_currentState_Value_Parent()
	 * @see fsmTrace.States.fsm.TracedFiniteStateMachine#getCurrentStateSequence
	 * @model opposite="currentStateSequence" required="true" transient="false"
	 * @generated
	 */
	TracedFiniteStateMachine getParent();

	/**
	 * Sets the value of the '{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedFiniteStateMachine value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.State#getFiniteStateMachine_currentState_Values <em>Finite State Machine current State Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getFiniteStateMachine_currentState_Value_States()
	 * @see fsmTrace.States.State#getFiniteStateMachine_currentState_Values
	 * @model opposite="finiteStateMachine_currentState_Values" required="true"
	 * @generated
	 */
	EList<fsmTrace.States.State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<fsmTrace.States.State> getStatesNoOpposite();

} // FiniteStateMachine_currentState_Value
