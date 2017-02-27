/**
 */
package fsmTrace.States.fsm.impl;

import fsmTrace.States.FiniteStateMachine_consummedString_Value;
import fsmTrace.States.FiniteStateMachine_currentState_Value;
import fsmTrace.States.FiniteStateMachine_producedString_Value;
import fsmTrace.States.FiniteStateMachine_unprocessedString_Value;
import fsmTrace.States.StatesPackage;

import fsmTrace.States.fsm.FsmPackage;
import fsmTrace.States.fsm.TracedFiniteStateMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedFiniteStateMachineImpl#getConsummedStringSequence <em>Consummed String Sequence</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedFiniteStateMachineImpl#getCurrentStateSequence <em>Current State Sequence</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedFiniteStateMachineImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedFiniteStateMachineImpl#getProducedStringSequence <em>Produced String Sequence</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedFiniteStateMachineImpl#getUnprocessedStringSequence <em>Unprocessed String Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedFiniteStateMachineImpl extends MinimalEObjectImpl.Container implements TracedFiniteStateMachine {
	/**
	 * The cached value of the '{@link #getConsummedStringSequence() <em>Consummed String Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedStringSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FiniteStateMachine_consummedString_Value> consummedStringSequence;

	/**
	 * The cached value of the '{@link #getCurrentStateSequence() <em>Current State Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStateSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FiniteStateMachine_currentState_Value> currentStateSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected FiniteStateMachine originalObject;

	/**
	 * The cached value of the '{@link #getProducedStringSequence() <em>Produced String Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedStringSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FiniteStateMachine_producedString_Value> producedStringSequence;

	/**
	 * The cached value of the '{@link #getUnprocessedStringSequence() <em>Unprocessed String Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnprocessedStringSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FiniteStateMachine_unprocessedString_Value> unprocessedStringSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedFiniteStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.TRACED_FINITE_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiniteStateMachine_consummedString_Value> getConsummedStringSequence() {
		if (consummedStringSequence == null) {
			consummedStringSequence = new EObjectContainmentWithInverseEList<FiniteStateMachine_consummedString_Value>(FiniteStateMachine_consummedString_Value.class, this, FsmPackage.TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE, StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT);
		}
		return consummedStringSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiniteStateMachine_currentState_Value> getCurrentStateSequence() {
		if (currentStateSequence == null) {
			currentStateSequence = new EObjectContainmentWithInverseEList<FiniteStateMachine_currentState_Value>(FiniteStateMachine_currentState_Value.class, this, FsmPackage.TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE, StatesPackage.FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__PARENT);
		}
		return currentStateSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteStateMachine getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (FiniteStateMachine)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRACED_FINITE_STATE_MACHINE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteStateMachine basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(FiniteStateMachine newOriginalObject) {
		FiniteStateMachine oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_FINITE_STATE_MACHINE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiniteStateMachine_producedString_Value> getProducedStringSequence() {
		if (producedStringSequence == null) {
			producedStringSequence = new EObjectContainmentWithInverseEList<FiniteStateMachine_producedString_Value>(FiniteStateMachine_producedString_Value.class, this, FsmPackage.TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE, StatesPackage.FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__PARENT);
		}
		return producedStringSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiniteStateMachine_unprocessedString_Value> getUnprocessedStringSequence() {
		if (unprocessedStringSequence == null) {
			unprocessedStringSequence = new EObjectContainmentWithInverseEList<FiniteStateMachine_unprocessedString_Value>(FiniteStateMachine_unprocessedString_Value.class, this, FsmPackage.TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE, StatesPackage.FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__PARENT);
		}
		return unprocessedStringSequence;
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
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsummedStringSequence()).basicAdd(otherEnd, msgs);
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentStateSequence()).basicAdd(otherEnd, msgs);
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducedStringSequence()).basicAdd(otherEnd, msgs);
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnprocessedStringSequence()).basicAdd(otherEnd, msgs);
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
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE:
				return ((InternalEList<?>)getConsummedStringSequence()).basicRemove(otherEnd, msgs);
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				return ((InternalEList<?>)getCurrentStateSequence()).basicRemove(otherEnd, msgs);
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE:
				return ((InternalEList<?>)getProducedStringSequence()).basicRemove(otherEnd, msgs);
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE:
				return ((InternalEList<?>)getUnprocessedStringSequence()).basicRemove(otherEnd, msgs);
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
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE:
				return getConsummedStringSequence();
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				return getCurrentStateSequence();
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE:
				return getProducedStringSequence();
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE:
				return getUnprocessedStringSequence();
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
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE:
				getConsummedStringSequence().clear();
				getConsummedStringSequence().addAll((Collection<? extends FiniteStateMachine_consummedString_Value>)newValue);
				return;
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				getCurrentStateSequence().clear();
				getCurrentStateSequence().addAll((Collection<? extends FiniteStateMachine_currentState_Value>)newValue);
				return;
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__ORIGINAL_OBJECT:
				setOriginalObject((FiniteStateMachine)newValue);
				return;
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE:
				getProducedStringSequence().clear();
				getProducedStringSequence().addAll((Collection<? extends FiniteStateMachine_producedString_Value>)newValue);
				return;
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE:
				getUnprocessedStringSequence().clear();
				getUnprocessedStringSequence().addAll((Collection<? extends FiniteStateMachine_unprocessedString_Value>)newValue);
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
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE:
				getConsummedStringSequence().clear();
				return;
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				getCurrentStateSequence().clear();
				return;
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__ORIGINAL_OBJECT:
				setOriginalObject((FiniteStateMachine)null);
				return;
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE:
				getProducedStringSequence().clear();
				return;
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE:
				getUnprocessedStringSequence().clear();
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
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE:
				return consummedStringSequence != null && !consummedStringSequence.isEmpty();
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				return currentStateSequence != null && !currentStateSequence.isEmpty();
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__ORIGINAL_OBJECT:
				return originalObject != null;
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE:
				return producedStringSequence != null && !producedStringSequence.isEmpty();
			case FsmPackage.TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE:
				return unprocessedStringSequence != null && !unprocessedStringSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedFiniteStateMachineImpl
