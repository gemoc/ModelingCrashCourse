/**
 */
package fsmTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = fsmTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Finite State Machine consummed String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite State Machine consummed String Value</em>'.
	 * @generated
	 */
	FiniteStateMachine_consummedString_Value createFiniteStateMachine_consummedString_Value();

	/**
	 * Returns a new object of class '<em>Finite State Machine current State Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite State Machine current State Value</em>'.
	 * @generated
	 */
	FiniteStateMachine_currentState_Value createFiniteStateMachine_currentState_Value();

	/**
	 * Returns a new object of class '<em>Finite State Machine produced String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite State Machine produced String Value</em>'.
	 * @generated
	 */
	FiniteStateMachine_producedString_Value createFiniteStateMachine_producedString_Value();

	/**
	 * Returns a new object of class '<em>Finite State Machine unprocessed String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite State Machine unprocessed String Value</em>'.
	 * @generated
	 */
	FiniteStateMachine_unprocessedString_Value createFiniteStateMachine_unprocessedString_Value();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
