/**
 */
package fsmTrace.States.impl;

import fsmTrace.States.FiniteStateMachine_consummedString_Value;
import fsmTrace.States.FiniteStateMachine_currentState_Value;
import fsmTrace.States.FiniteStateMachine_producedString_Value;
import fsmTrace.States.FiniteStateMachine_unprocessedString_Value;
import fsmTrace.States.State;
import fsmTrace.States.StatesPackage;

import fsmTrace.Steps.SpecificStep;
import fsmTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getFiniteStateMachine_consummedString_Values <em>Finite State Machine consummed String Values</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getFiniteStateMachine_currentState_Values <em>Finite State Machine current State Values</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getFiniteStateMachine_producedString_Values <em>Finite State Machine produced String Values</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getFiniteStateMachine_unprocessedString_Values <em>Finite State Machine unprocessed String Values</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> endedSteps;

	/**
	 * The cached value of the '{@link #getFiniteStateMachine_consummedString_Values() <em>Finite State Machine consummed String Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiniteStateMachine_consummedString_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FiniteStateMachine_consummedString_Value> finiteStateMachine_consummedString_Values;

	/**
	 * The cached value of the '{@link #getFiniteStateMachine_currentState_Values() <em>Finite State Machine current State Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiniteStateMachine_currentState_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FiniteStateMachine_currentState_Value> finiteStateMachine_currentState_Values;

	/**
	 * The cached value of the '{@link #getFiniteStateMachine_producedString_Values() <em>Finite State Machine produced String Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiniteStateMachine_producedString_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FiniteStateMachine_producedString_Value> finiteStateMachine_producedString_Values;

	/**
	 * The cached value of the '{@link #getFiniteStateMachine_unprocessedString_Values() <em>Finite State Machine unprocessed String Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiniteStateMachine_unprocessedString_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FiniteStateMachine_unprocessedString_Value> finiteStateMachine_unprocessedString_Values;

	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> startedSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.SPECIFIC_STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiniteStateMachine_consummedString_Value> getFiniteStateMachine_consummedString_Values() {
		if (finiteStateMachine_consummedString_Values == null) {
			finiteStateMachine_consummedString_Values = new EObjectWithInverseResolvingEList.ManyInverse<FiniteStateMachine_consummedString_Value>(FiniteStateMachine_consummedString_Value.class, this, StatesPackage.STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES, StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES);
		}
		return finiteStateMachine_consummedString_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiniteStateMachine_currentState_Value> getFiniteStateMachine_currentState_Values() {
		if (finiteStateMachine_currentState_Values == null) {
			finiteStateMachine_currentState_Values = new EObjectWithInverseResolvingEList.ManyInverse<FiniteStateMachine_currentState_Value>(FiniteStateMachine_currentState_Value.class, this, StatesPackage.STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES, StatesPackage.FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__STATES);
		}
		return finiteStateMachine_currentState_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiniteStateMachine_producedString_Value> getFiniteStateMachine_producedString_Values() {
		if (finiteStateMachine_producedString_Values == null) {
			finiteStateMachine_producedString_Values = new EObjectWithInverseResolvingEList.ManyInverse<FiniteStateMachine_producedString_Value>(FiniteStateMachine_producedString_Value.class, this, StatesPackage.STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES, StatesPackage.FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__STATES);
		}
		return finiteStateMachine_producedString_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiniteStateMachine_unprocessedString_Value> getFiniteStateMachine_unprocessedString_Values() {
		if (finiteStateMachine_unprocessedString_Values == null) {
			finiteStateMachine_unprocessedString_Values = new EObjectWithInverseResolvingEList.ManyInverse<FiniteStateMachine_unprocessedString_Value>(FiniteStateMachine_unprocessedString_Value.class, this, StatesPackage.STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES, StatesPackage.FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES);
		}
		return finiteStateMachine_unprocessedString_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.SPECIFIC_STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiniteStateMachine_consummedString_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiniteStateMachine_currentState_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiniteStateMachine_producedString_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiniteStateMachine_unprocessedString_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES:
				return ((InternalEList<?>)getFiniteStateMachine_consummedString_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES:
				return ((InternalEList<?>)getFiniteStateMachine_currentState_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES:
				return ((InternalEList<?>)getFiniteStateMachine_producedString_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				return ((InternalEList<?>)getFiniteStateMachine_unprocessedString_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES:
				return getFiniteStateMachine_consummedString_Values();
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES:
				return getFiniteStateMachine_currentState_Values();
			case StatesPackage.STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES:
				return getFiniteStateMachine_producedString_Values();
			case StatesPackage.STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				return getFiniteStateMachine_unprocessedString_Values();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
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
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES:
				getFiniteStateMachine_consummedString_Values().clear();
				getFiniteStateMachine_consummedString_Values().addAll((Collection<? extends FiniteStateMachine_consummedString_Value>)newValue);
				return;
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES:
				getFiniteStateMachine_currentState_Values().clear();
				getFiniteStateMachine_currentState_Values().addAll((Collection<? extends FiniteStateMachine_currentState_Value>)newValue);
				return;
			case StatesPackage.STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES:
				getFiniteStateMachine_producedString_Values().clear();
				getFiniteStateMachine_producedString_Values().addAll((Collection<? extends FiniteStateMachine_producedString_Value>)newValue);
				return;
			case StatesPackage.STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				getFiniteStateMachine_unprocessedString_Values().clear();
				getFiniteStateMachine_unprocessedString_Values().addAll((Collection<? extends FiniteStateMachine_unprocessedString_Value>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
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
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES:
				getFiniteStateMachine_consummedString_Values().clear();
				return;
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES:
				getFiniteStateMachine_currentState_Values().clear();
				return;
			case StatesPackage.STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES:
				getFiniteStateMachine_producedString_Values().clear();
				return;
			case StatesPackage.STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				getFiniteStateMachine_unprocessedString_Values().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
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
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES:
				return finiteStateMachine_consummedString_Values != null && !finiteStateMachine_consummedString_Values.isEmpty();
			case StatesPackage.STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES:
				return finiteStateMachine_currentState_Values != null && !finiteStateMachine_currentState_Values.isEmpty();
			case StatesPackage.STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES:
				return finiteStateMachine_producedString_Values != null && !finiteStateMachine_producedString_Values.isEmpty();
			case StatesPackage.STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				return finiteStateMachine_unprocessedString_Values != null && !finiteStateMachine_unprocessedString_Values.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
