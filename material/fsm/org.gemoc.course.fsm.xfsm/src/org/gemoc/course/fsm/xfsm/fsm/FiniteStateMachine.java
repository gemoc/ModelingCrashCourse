/**
 */
package org.gemoc.course.fsm.xfsm.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getStates <em>States</em>}</li>
 *   <li>{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getUnprocessedString <em>Unprocessed String</em>}</li>
 *   <li>{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getConsummedString <em>Consummed String</em>}</li>
 *   <li>{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getProducedString <em>Produced String</em>}</li>
 * </ul>
 *
 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getFiniteStateMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueStateNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueStateNames='self.states->forAll(s1, s2| s1 <> s2 implies s1.name <> s2.name)'"
 * @generated
 */
public interface FiniteStateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.course.fsm.xfsm.fsm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getFiniteStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getFiniteStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getFiniteStateMachine_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Unprocessed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unprocessed String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unprocessed String</em>' attribute.
	 * @see #setUnprocessedString(String)
	 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getFiniteStateMachine_UnprocessedString()
	 * @model unique="false"
	 * @generated
	 */
	String getUnprocessedString();

	/**
	 * Sets the value of the '{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getUnprocessedString <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unprocessed String</em>' attribute.
	 * @see #getUnprocessedString()
	 * @generated
	 */
	void setUnprocessedString(String value);

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
	 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getFiniteStateMachine_ConsummedString()
	 * @model unique="false"
	 * @generated
	 */
	String getConsummedString();

	/**
	 * Sets the value of the '{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getConsummedString <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consummed String</em>' attribute.
	 * @see #getConsummedString()
	 * @generated
	 */
	void setConsummedString(String value);

	/**
	 * Returns the value of the '<em><b>Produced String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced String</em>' attribute.
	 * @see #setProducedString(String)
	 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getFiniteStateMachine_ProducedString()
	 * @model unique="false"
	 * @generated
	 */
	String getProducedString();

	/**
	 * Sets the value of the '{@link org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine#getProducedString <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced String</em>' attribute.
	 * @see #getProducedString()
	 * @generated
	 */
	void setProducedString(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initializeModel(EList<String> args);

} // FiniteStateMachine
