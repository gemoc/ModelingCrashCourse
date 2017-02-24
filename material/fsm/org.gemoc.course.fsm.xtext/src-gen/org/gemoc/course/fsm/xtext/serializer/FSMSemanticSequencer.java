/*
 * generated by Xtext 2.10.0
 */
package org.gemoc.course.fsm.xtext.serializer;

import com.google.inject.Inject;
import fsm.FiniteStateMachine;
import fsm.FsmPackage;
import fsm.State;
import fsm.Transition;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.gemoc.course.fsm.xtext.services.FSMGrammarAccess;

@SuppressWarnings("all")
public class FSMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FSMGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FsmPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FsmPackage.FINITE_STATE_MACHINE:
				sequence_FiniteStateMachine(context, (FiniteStateMachine) semanticObject); 
				return; 
			case FsmPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case FsmPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FiniteStateMachine returns FiniteStateMachine
	 *
	 * Constraint:
	 *     (name=EString initialState=[State|EString] (states+=State states+=State*)?)
	 */
	protected void sequence_FiniteStateMachine(ISerializationContext context, FiniteStateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=EString (outgoingTransitions+=Transition outgoingTransitions+=Transition*)?)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (name=EString input=EString? output=EString? target=[State|EString])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
