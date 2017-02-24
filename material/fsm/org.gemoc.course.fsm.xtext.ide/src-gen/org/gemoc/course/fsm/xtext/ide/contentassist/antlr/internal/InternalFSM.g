/*
 * generated by Xtext 2.10.0
 */
grammar InternalFSM;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.gemoc.course.fsm.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.gemoc.course.fsm.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.gemoc.course.fsm.xtext.services.FSMGrammarAccess;

}
@parser::members {
	private FSMGrammarAccess grammarAccess;

	public void setGrammarAccess(FSMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleFiniteStateMachine
entryRuleFiniteStateMachine
:
{ before(grammarAccess.getFiniteStateMachineRule()); }
	 ruleFiniteStateMachine
{ after(grammarAccess.getFiniteStateMachineRule()); } 
	 EOF 
;

// Rule FiniteStateMachine
ruleFiniteStateMachine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup()); }
		(rule__FiniteStateMachine__UnorderedGroup)
		{ after(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransition
entryRuleTransition
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionAccess().getGroup()); }
		(rule__Transition__Group__0)
		{ after(grammarAccess.getTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FiniteStateMachine__Group_0__0__Impl
	rule__FiniteStateMachine__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFiniteStateMachineAccess().getFiniteStateMachineKeyword_0_0()); }
	'FiniteStateMachine'
	{ after(grammarAccess.getFiniteStateMachineAccess().getFiniteStateMachineKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FiniteStateMachine__Group_0__1__Impl
	rule__FiniteStateMachine__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFiniteStateMachineAccess().getNameAssignment_0_1()); }
	(rule__FiniteStateMachine__NameAssignment_0_1)
	{ after(grammarAccess.getFiniteStateMachineAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FiniteStateMachine__Group_0__2__Impl
	rule__FiniteStateMachine__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFiniteStateMachineAccess().getLeftCurlyBracketKeyword_0_2()); }
	'{'
	{ after(grammarAccess.getFiniteStateMachineAccess().getLeftCurlyBracketKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FiniteStateMachine__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFiniteStateMachineAccess().getGroup_0_3()); }
	(rule__FiniteStateMachine__Group_0_3__0)?
	{ after(grammarAccess.getFiniteStateMachineAccess().getGroup_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FiniteStateMachine__Group_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FiniteStateMachine__Group_0_3__0__Impl
	rule__FiniteStateMachine__Group_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFiniteStateMachineAccess().getStatesAssignment_0_3_0()); }
	(rule__FiniteStateMachine__StatesAssignment_0_3_0)
	{ after(grammarAccess.getFiniteStateMachineAccess().getStatesAssignment_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FiniteStateMachine__Group_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__Group_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFiniteStateMachineAccess().getStatesAssignment_0_3_1()); }
	(rule__FiniteStateMachine__StatesAssignment_0_3_1)*
	{ after(grammarAccess.getFiniteStateMachineAccess().getStatesAssignment_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateAction_0()); }
	()
	{ after(grammarAccess.getStateAccess().getStateAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getIsInitialStateAssignment_1()); }
	(rule__State__IsInitialStateAssignment_1)?
	{ after(grammarAccess.getStateAccess().getIsInitialStateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
	rule__State__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_2()); }
	'state'
	{ after(grammarAccess.getStateAccess().getStateKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__3__Impl
	rule__State__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_3()); }
	(rule__State__NameAssignment_3)
	{ after(grammarAccess.getStateAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_4()); }
	(rule__State__Group_4__0)?
	{ after(grammarAccess.getStateAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__0__Impl
	rule__State__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_0()); }
	'{'
	{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__1__Impl
	rule__State__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_4_1()); }
	(rule__State__OutgoingTransitionsAssignment_4_1)
	{ after(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__2__Impl
	rule__State__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_4_2()); }
	(rule__State__OutgoingTransitionsAssignment_4_2)*
	{ after(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_3()); }
	'}'
	{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0()); }
	'->'
	{ after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTargetAssignment_1()); }
	(rule__Transition__TargetAssignment_1)
	{ after(grammarAccess.getTransitionAccess().getTargetAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__2__Impl
	rule__Transition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2()); }
	'['
	{ after(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__3__Impl
	rule__Transition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getInputAssignment_3()); }
	(rule__Transition__InputAssignment_3)
	{ after(grammarAccess.getTransitionAccess().getInputAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__4__Impl
	rule__Transition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_4()); }
	(rule__Transition__Group_4__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__5__Impl
	rule__Transition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_5()); }
	']'
	{ after(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__6__Impl
	rule__Transition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getColonKeyword_6()); }
	':'
	{ after(grammarAccess.getTransitionAccess().getColonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getNameAssignment_7()); }
	(rule__Transition__NameAssignment_7)
	{ after(grammarAccess.getTransitionAccess().getNameAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_4__0__Impl
	rule__Transition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getVerticalLineKeyword_4_0()); }
	'|'
	{ after(grammarAccess.getTransitionAccess().getVerticalLineKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getOutputAssignment_4_1()); }
	(rule__Transition__OutputAssignment_4_1)
	{ after(grammarAccess.getTransitionAccess().getOutputAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FiniteStateMachine__UnorderedGroup
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup());
	}
:
	rule__FiniteStateMachine__UnorderedGroup__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__UnorderedGroup__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getFiniteStateMachineAccess().getGroup_0()); }
					(rule__FiniteStateMachine__Group_0__0)
					{ after(grammarAccess.getFiniteStateMachineAccess().getGroup_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getFiniteStateMachineAccess().getRightCurlyBracketKeyword_1()); }
					('}')
					{ after(grammarAccess.getFiniteStateMachineAccess().getRightCurlyBracketKeyword_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__UnorderedGroup__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FiniteStateMachine__UnorderedGroup__Impl
	rule__FiniteStateMachine__UnorderedGroup__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__UnorderedGroup__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FiniteStateMachine__UnorderedGroup__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__FiniteStateMachine__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFiniteStateMachineAccess().getNameEStringParserRuleCall_0_1_0()); }
		ruleEString
		{ after(grammarAccess.getFiniteStateMachineAccess().getNameEStringParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__StatesAssignment_0_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_0_3_0_0()); }
		ruleState
		{ after(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_0_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FiniteStateMachine__StatesAssignment_0_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_0_3_1_0()); }
		ruleState
		{ after(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_0_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__IsInitialStateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getIsInitialStateInitialKeyword_1_0()); }
		(
			{ before(grammarAccess.getStateAccess().getIsInitialStateInitialKeyword_1_0()); }
			'initial'
			{ after(grammarAccess.getStateAccess().getIsInitialStateInitialKeyword_1_0()); }
		)
		{ after(grammarAccess.getStateAccess().getIsInitialStateInitialKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__OutgoingTransitionsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_1_0()); }
		ruleTransition
		{ after(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__OutgoingTransitionsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_2_0()); }
		ruleTransition
		{ after(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TargetAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__InputAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getInputEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getTransitionAccess().getInputEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__OutputAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getOutputEStringParserRuleCall_4_1_0()); }
		ruleEString
		{ after(grammarAccess.getTransitionAccess().getOutputEStringParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__NameAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_7_0()); }
		ruleEString
		{ after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;