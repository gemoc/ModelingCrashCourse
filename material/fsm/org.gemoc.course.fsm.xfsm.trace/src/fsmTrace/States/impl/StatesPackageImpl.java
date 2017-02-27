/**
 */
package fsmTrace.States.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fsmTrace.FsmTracePackage;

import fsmTrace.States.FiniteStateMachine_consummedString_Value;
import fsmTrace.States.FiniteStateMachine_currentState_Value;
import fsmTrace.States.FiniteStateMachine_producedString_Value;
import fsmTrace.States.FiniteStateMachine_unprocessedString_Value;
import fsmTrace.States.State;
import fsmTrace.States.StatesFactory;
import fsmTrace.States.StatesPackage;
import fsmTrace.States.Value;

import fsmTrace.States.fsm.impl.FsmPackageImpl;

import fsmTrace.Steps.StepsPackage;

import fsmTrace.Steps.impl.StepsPackageImpl;

import fsmTrace.impl.FsmTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.course.fsm.xfsm.fsm.FsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteStateMachine_consummedString_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteStateMachine_currentState_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteStateMachine_producedString_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteStateMachine_unprocessedString_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fsmTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		FsmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FsmTracePackageImpl theFsmTracePackage = (FsmTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmTracePackage.eNS_URI) instanceof FsmTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmTracePackage.eNS_URI) : FsmTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		FsmPackageImpl theFsmPackage_1 = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fsmTrace.States.fsm.FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fsmTrace.States.fsm.FsmPackage.eNS_URI) : fsmTrace.States.fsm.FsmPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theFsmTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theFsmPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theFsmTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theFsmPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiniteStateMachine_consummedString_Value() {
		return finiteStateMachine_consummedString_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiniteStateMachine_consummedString_Value_ConsummedString() {
		return (EAttribute)finiteStateMachine_consummedString_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteStateMachine_consummedString_Value_Parent() {
		return (EReference)finiteStateMachine_consummedString_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteStateMachine_consummedString_Value_States() {
		return (EReference)finiteStateMachine_consummedString_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiniteStateMachine_currentState_Value() {
		return finiteStateMachine_currentState_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteStateMachine_currentState_Value_CurrentState() {
		return (EReference)finiteStateMachine_currentState_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteStateMachine_currentState_Value_Parent() {
		return (EReference)finiteStateMachine_currentState_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteStateMachine_currentState_Value_States() {
		return (EReference)finiteStateMachine_currentState_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiniteStateMachine_producedString_Value() {
		return finiteStateMachine_producedString_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteStateMachine_producedString_Value_Parent() {
		return (EReference)finiteStateMachine_producedString_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiniteStateMachine_producedString_Value_ProducedString() {
		return (EAttribute)finiteStateMachine_producedString_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteStateMachine_producedString_Value_States() {
		return (EReference)finiteStateMachine_producedString_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiniteStateMachine_unprocessedString_Value() {
		return finiteStateMachine_unprocessedString_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteStateMachine_unprocessedString_Value_Parent() {
		return (EReference)finiteStateMachine_unprocessedString_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteStateMachine_unprocessedString_Value_States() {
		return (EReference)finiteStateMachine_unprocessedString_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiniteStateMachine_unprocessedString_Value_UnprocessedString() {
		return (EAttribute)finiteStateMachine_unprocessedString_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FiniteStateMachine_consummedString_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FiniteStateMachine_currentState_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FiniteStateMachine_producedString_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FiniteStateMachine_unprocessedString_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_StatesNoOpposite() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		finiteStateMachine_consummedString_ValueEClass = createEClass(FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE);
		createEAttribute(finiteStateMachine_consummedString_ValueEClass, FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING);
		createEReference(finiteStateMachine_consummedString_ValueEClass, FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT);
		createEReference(finiteStateMachine_consummedString_ValueEClass, FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES);

		finiteStateMachine_currentState_ValueEClass = createEClass(FINITE_STATE_MACHINE_CURRENT_STATE_VALUE);
		createEReference(finiteStateMachine_currentState_ValueEClass, FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__CURRENT_STATE);
		createEReference(finiteStateMachine_currentState_ValueEClass, FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__PARENT);
		createEReference(finiteStateMachine_currentState_ValueEClass, FINITE_STATE_MACHINE_CURRENT_STATE_VALUE__STATES);

		finiteStateMachine_producedString_ValueEClass = createEClass(FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE);
		createEReference(finiteStateMachine_producedString_ValueEClass, FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__PARENT);
		createEAttribute(finiteStateMachine_producedString_ValueEClass, FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__PRODUCED_STRING);
		createEReference(finiteStateMachine_producedString_ValueEClass, FINITE_STATE_MACHINE_PRODUCED_STRING_VALUE__STATES);

		finiteStateMachine_unprocessedString_ValueEClass = createEClass(FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE);
		createEReference(finiteStateMachine_unprocessedString_ValueEClass, FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__PARENT);
		createEReference(finiteStateMachine_unprocessedString_ValueEClass, FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES);
		createEAttribute(finiteStateMachine_unprocessedString_ValueEClass, FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ENDED_STEPS);
		createEReference(stateEClass, STATE__FINITE_STATE_MACHINE_CONSUMMED_STRING_VALUES);
		createEReference(stateEClass, STATE__FINITE_STATE_MACHINE_CURRENT_STATE_VALUES);
		createEReference(stateEClass, STATE__FINITE_STATE_MACHINE_PRODUCED_STRING_VALUES);
		createEReference(stateEClass, STATE__FINITE_STATE_MACHINE_UNPROCESSED_STRING_VALUES);
		createEReference(stateEClass, STATE__STARTED_STEPS);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__STATES_NO_OPPOSITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		fsmTrace.States.fsm.FsmPackage theFsmPackage_1 = (fsmTrace.States.fsm.FsmPackage)EPackage.Registry.INSTANCE.getEPackage(fsmTrace.States.fsm.FsmPackage.eNS_URI);
		FsmPackage theFsmPackage = (FsmPackage)EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFsmPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		finiteStateMachine_consummedString_ValueEClass.getESuperTypes().add(this.getValue());
		finiteStateMachine_currentState_ValueEClass.getESuperTypes().add(this.getValue());
		finiteStateMachine_producedString_ValueEClass.getESuperTypes().add(this.getValue());
		finiteStateMachine_unprocessedString_ValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes and features; add operations and parameters
		initEClass(finiteStateMachine_consummedString_ValueEClass, FiniteStateMachine_consummedString_Value.class, "FiniteStateMachine_consummedString_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiniteStateMachine_consummedString_Value_ConsummedString(), ecorePackage.getEString(), "consummedString", null, 0, 1, FiniteStateMachine_consummedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiniteStateMachine_consummedString_Value_Parent(), theFsmPackage_1.getTracedFiniteStateMachine(), theFsmPackage_1.getTracedFiniteStateMachine_ConsummedStringSequence(), "parent", null, 1, 1, FiniteStateMachine_consummedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiniteStateMachine_consummedString_Value_States(), this.getState(), this.getState_FiniteStateMachine_consummedString_Values(), "states", null, 1, -1, FiniteStateMachine_consummedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(finiteStateMachine_consummedString_ValueEClass, this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(finiteStateMachine_currentState_ValueEClass, FiniteStateMachine_currentState_Value.class, "FiniteStateMachine_currentState_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFiniteStateMachine_currentState_Value_CurrentState(), theFsmPackage.getState(), null, "currentState", null, 0, 1, FiniteStateMachine_currentState_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiniteStateMachine_currentState_Value_Parent(), theFsmPackage_1.getTracedFiniteStateMachine(), theFsmPackage_1.getTracedFiniteStateMachine_CurrentStateSequence(), "parent", null, 1, 1, FiniteStateMachine_currentState_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiniteStateMachine_currentState_Value_States(), this.getState(), this.getState_FiniteStateMachine_currentState_Values(), "states", null, 1, -1, FiniteStateMachine_currentState_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(finiteStateMachine_currentState_ValueEClass, this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(finiteStateMachine_producedString_ValueEClass, FiniteStateMachine_producedString_Value.class, "FiniteStateMachine_producedString_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFiniteStateMachine_producedString_Value_Parent(), theFsmPackage_1.getTracedFiniteStateMachine(), theFsmPackage_1.getTracedFiniteStateMachine_ProducedStringSequence(), "parent", null, 1, 1, FiniteStateMachine_producedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiniteStateMachine_producedString_Value_ProducedString(), ecorePackage.getEString(), "producedString", null, 0, 1, FiniteStateMachine_producedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiniteStateMachine_producedString_Value_States(), this.getState(), this.getState_FiniteStateMachine_producedString_Values(), "states", null, 1, -1, FiniteStateMachine_producedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(finiteStateMachine_producedString_ValueEClass, this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(finiteStateMachine_unprocessedString_ValueEClass, FiniteStateMachine_unprocessedString_Value.class, "FiniteStateMachine_unprocessedString_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFiniteStateMachine_unprocessedString_Value_Parent(), theFsmPackage_1.getTracedFiniteStateMachine(), theFsmPackage_1.getTracedFiniteStateMachine_UnprocessedStringSequence(), "parent", null, 1, 1, FiniteStateMachine_unprocessedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiniteStateMachine_unprocessedString_Value_States(), this.getState(), this.getState_FiniteStateMachine_unprocessedString_Values(), "states", null, 1, -1, FiniteStateMachine_unprocessedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiniteStateMachine_unprocessedString_Value_UnprocessedString(), ecorePackage.getEString(), "unprocessedString", null, 0, 1, FiniteStateMachine_unprocessedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(finiteStateMachine_unprocessedString_ValueEClass, this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_EndedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_EndingState(), "endedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_FiniteStateMachine_consummedString_Values(), this.getFiniteStateMachine_consummedString_Value(), this.getFiniteStateMachine_consummedString_Value_States(), "finiteStateMachine_consummedString_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_FiniteStateMachine_currentState_Values(), this.getFiniteStateMachine_currentState_Value(), this.getFiniteStateMachine_currentState_Value_States(), "finiteStateMachine_currentState_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_FiniteStateMachine_producedString_Values(), this.getFiniteStateMachine_producedString_Value(), this.getFiniteStateMachine_producedString_Value_States(), "finiteStateMachine_producedString_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_FiniteStateMachine_unprocessedString_Values(), this.getFiniteStateMachine_unprocessedString_Value(), this.getFiniteStateMachine_unprocessedString_Value_States(), "finiteStateMachine_unprocessedString_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StartedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_StartingState(), "startedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_StatesNoOpposite(), this.getState(), null, "statesNoOpposite", null, 1, -1, Value.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (finiteStateMachine_consummedString_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (finiteStateMachine_currentState_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (finiteStateMachine_producedString_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (finiteStateMachine_unprocessedString_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getFiniteStateMachine_consummedString_Value_ConsummedString(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFiniteStateMachine_currentState_Value_CurrentState(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFiniteStateMachine_producedString_Value_ProducedString(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFiniteStateMachine_unprocessedString_Value_UnprocessedString(), 
		   source, 
		   new String[] {
		   });
	}

} //StatesPackageImpl
