/**
 */
package fsmTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import fsmTrace.FsmTracePackage;
import fsmTrace.SpecificTrace;

import fsmTrace.States.State;

import fsmTrace.States.fsm.TracedFiniteStateMachine;

import fsmTrace.Steps.Fsm_FiniteStateMachine_InitializeModel;
import fsmTrace.Steps.Fsm_State_Step;
import fsmTrace.Steps.Fsm_Transition_Fire;
import fsmTrace.Steps.SpecificStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_FiniteStateMachine_InitializeModel_Sequence <em>Fsm Finite State Machine Initialize Model Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_State_Step_Sequence <em>Fsm State Step Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_Transition_Fire_Sequence <em>Fsm Transition Fire Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_tracedFiniteStateMachines <em>Fsm traced Finite State Machines</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getFsm_FiniteStateMachine_InitializeModel_Sequence() <em>Fsm Finite State Machine Initialize Model Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_FiniteStateMachine_InitializeModel_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_FiniteStateMachine_InitializeModel> fsm_FiniteStateMachine_InitializeModel_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_State_Step_Sequence() <em>Fsm State Step Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_State_Step_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_State_Step> fsm_State_Step_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_Transition_Fire_Sequence() <em>Fsm Transition Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_Transition_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_Transition_Fire> fsm_Transition_Fire_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_tracedFiniteStateMachines() <em>Fsm traced Finite State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_tracedFiniteStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedFiniteStateMachine> fsm_tracedFiniteStateMachines;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_FiniteStateMachine_InitializeModel> getFsm_FiniteStateMachine_InitializeModel_Sequence() {
		if (fsm_FiniteStateMachine_InitializeModel_Sequence == null) {
			fsm_FiniteStateMachine_InitializeModel_Sequence = new EObjectResolvingEList<Fsm_FiniteStateMachine_InitializeModel>(Fsm_FiniteStateMachine_InitializeModel.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_FINITE_STATE_MACHINE_INITIALIZE_MODEL_SEQUENCE);
		}
		return fsm_FiniteStateMachine_InitializeModel_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_State_Step> getFsm_State_Step_Sequence() {
		if (fsm_State_Step_Sequence == null) {
			fsm_State_Step_Sequence = new EObjectResolvingEList<Fsm_State_Step>(Fsm_State_Step.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_STEP_SEQUENCE);
		}
		return fsm_State_Step_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_Transition_Fire> getFsm_Transition_Fire_Sequence() {
		if (fsm_Transition_Fire_Sequence == null) {
			fsm_Transition_Fire_Sequence = new EObjectResolvingEList<Fsm_Transition_Fire>(Fsm_Transition_Fire.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE);
		}
		return fsm_Transition_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedFiniteStateMachine> getFsm_tracedFiniteStateMachines() {
		if (fsm_tracedFiniteStateMachines == null) {
			fsm_tracedFiniteStateMachines = new EObjectContainmentEList<TracedFiniteStateMachine>(TracedFiniteStateMachine.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_FINITE_STATE_MACHINES);
		}
		return fsm_tracedFiniteStateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_FINITE_STATE_MACHINES:
				return ((InternalEList<?>)getFsm_tracedFiniteStateMachines()).basicRemove(otherEnd, msgs);
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmTracePackage.SPECIFIC_TRACE__FSM_FINITE_STATE_MACHINE_INITIALIZE_MODEL_SEQUENCE:
				return getFsm_FiniteStateMachine_InitializeModel_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_STEP_SEQUENCE:
				return getFsm_State_Step_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE:
				return getFsm_Transition_Fire_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_FINITE_STATE_MACHINES:
				return getFsm_tracedFiniteStateMachines();
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmTracePackage.SPECIFIC_TRACE__FSM_FINITE_STATE_MACHINE_INITIALIZE_MODEL_SEQUENCE:
				getFsm_FiniteStateMachine_InitializeModel_Sequence().clear();
				getFsm_FiniteStateMachine_InitializeModel_Sequence().addAll((Collection<? extends Fsm_FiniteStateMachine_InitializeModel>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_STEP_SEQUENCE:
				getFsm_State_Step_Sequence().clear();
				getFsm_State_Step_Sequence().addAll((Collection<? extends Fsm_State_Step>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE:
				getFsm_Transition_Fire_Sequence().clear();
				getFsm_Transition_Fire_Sequence().addAll((Collection<? extends Fsm_Transition_Fire>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_FINITE_STATE_MACHINES:
				getFsm_tracedFiniteStateMachines().clear();
				getFsm_tracedFiniteStateMachines().addAll((Collection<? extends TracedFiniteStateMachine>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FsmTracePackage.SPECIFIC_TRACE__FSM_FINITE_STATE_MACHINE_INITIALIZE_MODEL_SEQUENCE:
				getFsm_FiniteStateMachine_InitializeModel_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_STEP_SEQUENCE:
				getFsm_State_Step_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE:
				getFsm_Transition_Fire_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_FINITE_STATE_MACHINES:
				getFsm_tracedFiniteStateMachines().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FsmTracePackage.SPECIFIC_TRACE__FSM_FINITE_STATE_MACHINE_INITIALIZE_MODEL_SEQUENCE:
				return fsm_FiniteStateMachine_InitializeModel_Sequence != null && !fsm_FiniteStateMachine_InitializeModel_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_STEP_SEQUENCE:
				return fsm_State_Step_Sequence != null && !fsm_State_Step_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE:
				return fsm_Transition_Fire_Sequence != null && !fsm_Transition_Fire_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_FINITE_STATE_MACHINES:
				return fsm_tracedFiniteStateMachines != null && !fsm_tracedFiniteStateMachines.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
