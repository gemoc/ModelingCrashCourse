/**
 */
package fsmTrace.States.fsm.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fsmTrace.FsmTracePackage;

import fsmTrace.States.StatesPackage;

import fsmTrace.States.fsm.FsmFactory;
import fsmTrace.States.fsm.FsmPackage;
import fsmTrace.States.fsm.TracedFiniteStateMachine;

import fsmTrace.States.impl.StatesPackageImpl;

import fsmTrace.Steps.StepsPackage;

import fsmTrace.Steps.impl.StepsPackageImpl;

import fsmTrace.impl.FsmTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmPackageImpl extends EPackageImpl implements FsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFiniteStateMachineEClass = null;

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
	 * @see fsmTrace.States.fsm.FsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FsmPackageImpl() {
		super(eNS_URI, FsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FsmPackage init() {
		if (isInited) return (FsmPackage)EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI);

		// Obtain or create and register package
		FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		org.gemoc.course.fsm.xfsm.fsm.FsmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FsmTracePackageImpl theFsmTracePackage = (FsmTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmTracePackage.eNS_URI) instanceof FsmTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmTracePackage.eNS_URI) : FsmTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theFsmPackage.createPackageContents();
		theFsmTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theFsmPackage.initializePackageContents();
		theFsmTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FsmPackage.eNS_URI, theFsmPackage);
		return theFsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFiniteStateMachine() {
		return tracedFiniteStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFiniteStateMachine_ConsummedStringSequence() {
		return (EReference)tracedFiniteStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFiniteStateMachine_CurrentStateSequence() {
		return (EReference)tracedFiniteStateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFiniteStateMachine_OriginalObject() {
		return (EReference)tracedFiniteStateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFiniteStateMachine_ProducedStringSequence() {
		return (EReference)tracedFiniteStateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFiniteStateMachine_UnprocessedStringSequence() {
		return (EReference)tracedFiniteStateMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmFactory getFsmFactory() {
		return (FsmFactory)getEFactoryInstance();
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
		tracedFiniteStateMachineEClass = createEClass(TRACED_FINITE_STATE_MACHINE);
		createEReference(tracedFiniteStateMachineEClass, TRACED_FINITE_STATE_MACHINE__CONSUMMED_STRING_SEQUENCE);
		createEReference(tracedFiniteStateMachineEClass, TRACED_FINITE_STATE_MACHINE__CURRENT_STATE_SEQUENCE);
		createEReference(tracedFiniteStateMachineEClass, TRACED_FINITE_STATE_MACHINE__ORIGINAL_OBJECT);
		createEReference(tracedFiniteStateMachineEClass, TRACED_FINITE_STATE_MACHINE__PRODUCED_STRING_SEQUENCE);
		createEReference(tracedFiniteStateMachineEClass, TRACED_FINITE_STATE_MACHINE__UNPROCESSED_STRING_SEQUENCE);
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
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		org.gemoc.course.fsm.xfsm.fsm.FsmPackage theFsmPackage_1 = (org.gemoc.course.fsm.xfsm.fsm.FsmPackage)EPackage.Registry.INSTANCE.getEPackage(org.gemoc.course.fsm.xfsm.fsm.FsmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(tracedFiniteStateMachineEClass, TracedFiniteStateMachine.class, "TracedFiniteStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedFiniteStateMachine_ConsummedStringSequence(), theStatesPackage.getFiniteStateMachine_consummedString_Value(), theStatesPackage.getFiniteStateMachine_consummedString_Value_Parent(), "consummedStringSequence", null, 0, -1, TracedFiniteStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedFiniteStateMachine_CurrentStateSequence(), theStatesPackage.getFiniteStateMachine_currentState_Value(), theStatesPackage.getFiniteStateMachine_currentState_Value_Parent(), "currentStateSequence", null, 0, -1, TracedFiniteStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedFiniteStateMachine_OriginalObject(), theFsmPackage_1.getFiniteStateMachine(), null, "originalObject", null, 0, 1, TracedFiniteStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedFiniteStateMachine_ProducedStringSequence(), theStatesPackage.getFiniteStateMachine_producedString_Value(), theStatesPackage.getFiniteStateMachine_producedString_Value_Parent(), "producedStringSequence", null, 0, -1, TracedFiniteStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedFiniteStateMachine_UnprocessedStringSequence(), theStatesPackage.getFiniteStateMachine_unprocessedString_Value(), theStatesPackage.getFiniteStateMachine_unprocessedString_Value_Parent(), "unprocessedStringSequence", null, 0, -1, TracedFiniteStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //FsmPackageImpl
