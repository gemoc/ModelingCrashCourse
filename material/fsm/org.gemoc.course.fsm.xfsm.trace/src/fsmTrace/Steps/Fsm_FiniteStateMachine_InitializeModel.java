/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import fsmTrace.States.fsm.TracedFiniteStateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Finite State Machine Initialize Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_FiniteStateMachine_InitializeModel()
 * @model
 * @generated
 */
public interface Fsm_FiniteStateMachine_InitializeModel extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fsmTrace.States.fsm.TracedFiniteStateMachine) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedFiniteStateMachine getCaller();

} // Fsm_FiniteStateMachine_InitializeModel
