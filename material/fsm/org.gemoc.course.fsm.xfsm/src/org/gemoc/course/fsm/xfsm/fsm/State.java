/**
 */
package org.gemoc.course.fsm.xfsm.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.course.fsm.xfsm.fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.gemoc.course.fsm.xfsm.fsm.State#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.course.fsm.xfsm.fsm.State#isIsInitialState <em>Is Initial State</em>}</li>
 * </ul>
 *
 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueStateNameInFSM'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueStateNameInFSM='\n\t\t\tself.oclContainer.oclAsType(FiniteStateMachine).states\n\t\t\t\t->forAll(s1| s1 <> self implies s1.name <> self.name)'"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.course.fsm.xfsm.fsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getState_OutgoingTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

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
	 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.course.fsm.xfsm.fsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Initial State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial State</em>' attribute.
	 * @see #setIsInitialState(boolean)
	 * @see org.gemoc.course.fsm.xfsm.fsm.FsmPackage#getState_IsInitialState()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsInitialState();

	/**
	 * Sets the value of the '{@link org.gemoc.course.fsm.xfsm.fsm.State#isIsInitialState <em>Is Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial State</em>' attribute.
	 * @see #isIsInitialState()
	 * @generated
	 */
	void setIsInitialState(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void step(String inputString);

} // State
