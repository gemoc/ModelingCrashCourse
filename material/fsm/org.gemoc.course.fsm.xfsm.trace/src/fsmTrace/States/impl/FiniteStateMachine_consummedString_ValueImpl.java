/**
 */
package fsmTrace.States.impl;

import fsmTrace.States.FiniteStateMachine_consummedString_Value;
import fsmTrace.States.State;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finite State Machine consummed String Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.impl.FiniteStateMachine_consummedString_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fsmTrace.States.impl.FiniteStateMachine_consummedString_ValueImpl#getConsummedString <em>Consummed String</em>}</li>
 *   <li>{@link fsmTrace.States.impl.FiniteStateMachine_consummedString_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fsmTrace.States.impl.FiniteStateMachine_consummedString_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FiniteStateMachine_consummedString_ValueImpl extends MinimalEObjectImpl.Container implements FiniteStateMachine_consummedString_Value {
	/**
	 * The default value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMMED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected String consummedString = CONSUMMED_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiniteStateMachine_consummedString_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsummedString() {
		return consummedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsummedString(String newConsummedString) {
		String oldConsummedString = consummedString;
		consummedString = newConsummedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING, oldConsummedString, consummedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFiniteStateMachine getParent() {
		if (eContainerFeatureID() != StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT) return null;
		return (TracedFiniteStateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedFiniteStateMachine newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedFiniteStateMachine newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FsmPackage.TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE, TracedFiniteStateMachine.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES, StatesPackage.STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES);
		}
		return states;
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
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedFiniteStateMachine)otherEnd, msgs);
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, FsmPackage.TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE, TracedFiniteStateMachine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING:
				return getConsummedString();
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT:
				return getParent();
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES:
				return getStates();
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
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING:
				setConsummedString((String)newValue);
				return;
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT:
				setParent((TracedFiniteStateMachine)newValue);
				return;
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING:
				setConsummedString(CONSUMMED_STRING_EDEFAULT);
				return;
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT:
				setParent((TracedFiniteStateMachine)null);
				return;
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING:
				return CONSUMMED_STRING_EDEFAULT == null ? consummedString != null : !CONSUMMED_STRING_EDEFAULT.equals(consummedString);
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (consummedString: ");
		result.append(consummedString);
		result.append(')');
		return result.toString();
	}

} //FiniteStateMachine_consummedString_ValueImpl
