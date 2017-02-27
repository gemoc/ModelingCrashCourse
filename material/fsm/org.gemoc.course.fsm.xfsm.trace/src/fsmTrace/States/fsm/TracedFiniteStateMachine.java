/**
 */
package fsmTrace.States.fsm;

import fsmTrace.States.FiniteStateMachine_consummedString_Value;
import fsmTrace.States.FiniteStateMachine_currentState_Value;
import fsmTrace.States.FiniteStateMachine_producedString_Value;
import fsmTrace.States.FiniteStateMachine_unprocessedString_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getConsummedStringSequence <em>Consummed String Sequence</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getCurrentStateSequence <em>Current State Sequence</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getProducedStringSequence <em>Produced String Sequence</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getUnprocessedStringSequence <em>Unprocessed String Sequence</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.fsm.FsmPackage#getTracedFiniteStateMachine()
 * @model
 * @generated
 */
public interface TracedFiniteStateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Consummed String Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.FiniteStateMachine_consummedString_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consummed String Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consummed String Sequence</em>' containment reference list.
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedFiniteStateMachine_ConsummedStringSequence()
	 * @see fsmTrace.States.FiniteStateMachine_consummedString_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FiniteStateMachine_consummedString_Value> getConsummedStringSequence();

	/**
	 * Returns the value of the '<em><b>Current State Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.FiniteStateMachine_currentState_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.FiniteStateMachine_currentState_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State Sequence</em>' containment reference list.
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedFiniteStateMachine_CurrentStateSequence()
	 * @see fsmTrace.States.FiniteStateMachine_currentState_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FiniteStateMachine_currentState_Value> getCurrentStateSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(FiniteStateMachine)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedFiniteStateMachine_OriginalObject()
	 * @model
	 * @generated
	 */
	FiniteStateMachine getOriginalObject();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(FiniteStateMachine value);

	/**
	 * Returns the value of the '<em><b>Produced String Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.FiniteStateMachine_producedString_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.FiniteStateMachine_producedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced String Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced String Sequence</em>' containment reference list.
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedFiniteStateMachine_ProducedStringSequence()
	 * @see fsmTrace.States.FiniteStateMachine_producedString_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FiniteStateMachine_producedString_Value> getProducedStringSequence();

	/**
	 * Returns the value of the '<em><b>Unprocessed String Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.FiniteStateMachine_unprocessedString_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unprocessed String Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unprocessed String Sequence</em>' containment reference list.
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedFiniteStateMachine_UnprocessedStringSequence()
	 * @see fsmTrace.States.FiniteStateMachine_unprocessedString_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FiniteStateMachine_unprocessedString_Value> getUnprocessedStringSequence();

} // TracedFiniteStateMachine
