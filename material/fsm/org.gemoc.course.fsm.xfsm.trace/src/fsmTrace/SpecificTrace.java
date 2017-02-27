/**
 */
package fsmTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import fsmTrace.States.State;

import fsmTrace.States.fsm.TracedFiniteStateMachine;

import fsmTrace.Steps.Fsm_FiniteStateMachine_InitializeModel;
import fsmTrace.Steps.Fsm_State_Step;
import fsmTrace.Steps.Fsm_Transition_Fire;
import fsmTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_FiniteStateMachine_InitializeModel_Sequence <em>Fsm Finite State Machine Initialize Model Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_State_Step_Sequence <em>Fsm State Step Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_Transition_Fire_Sequence <em>Fsm Transition Fire Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedFiniteStateMachines <em>Fsm traced Finite State Machines</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see fsmTrace.FsmTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Fsm Finite State Machine Initialize Model Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_FiniteStateMachine_InitializeModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Finite State Machine Initialize Model Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Finite State Machine Initialize Model Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_FiniteStateMachine_InitializeModel_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_FiniteStateMachine_InitializeModel> getFsm_FiniteStateMachine_InitializeModel_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm State Step Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_State_Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm State Step Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm State Step Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_State_Step_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_State_Step> getFsm_State_Step_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Transition Fire Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_Transition_Fire> getFsm_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm traced Finite State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedFiniteStateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced Finite State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced Finite State Machines</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedFiniteStateMachines()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedFiniteStateMachine> getFsm_tracedFiniteStateMachines();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
