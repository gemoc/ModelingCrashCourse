/**
 */
package fsmTrace.States;

import fsmTrace.States.fsm.TracedFiniteStateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite State Machine consummed String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getConsummedString <em>Consummed String</em>}</li>
 *   <li>{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.StatesPackage#getFiniteStateMachine_consummedString_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface FiniteStateMachine_consummedString_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Consummed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consummed String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consummed String</em>' attribute.
	 * @see #setConsummedString(String)
	 * @see fsmTrace.States.StatesPackage#getFiniteStateMachine_consummedString_Value_ConsummedString()
	 * @model unique="false"
	 * @generated
	 */
	String getConsummedString();

	/**
	 * Sets the value of the '{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getConsummedString <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consummed String</em>' attribute.
	 * @see #getConsummedString()
	 * @generated
	 */
	void setConsummedString(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.fsm.TracedFiniteStateMachine#getConsummedStringSequence <em>Consummed String Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedFiniteStateMachine)
	 * @see fsmTrace.States.StatesPackage#getFiniteStateMachine_consummedString_Value_Parent()
	 * @see fsmTrace.States.fsm.TracedFiniteStateMachine#getConsummedStringSequence
	 * @model opposite="consummedStringSequence" required="true" transient="false"
	 * @generated
	 */
	TracedFiniteStateMachine getParent();

	/**
	 * Sets the value of the '{@link fsmTrace.States.FiniteStateMachine_consummedString_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.State#getFiniteStateMachine_consummedString_Values <em>Finite State Machine consummed String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getFiniteStateMachine_consummedString_Value_States()
	 * @see fsmTrace.States.State#getFiniteStateMachine_consummedString_Values
	 * @model opposite="finiteStateMachine_consummedString_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // FiniteStateMachine_consummedString_Value
