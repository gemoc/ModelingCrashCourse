/*
 * generated by Xtext 2.10.0
 */
grammar InternalFSM;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.gemoc.course.fsm.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.gemoc.course.fsm.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.course.fsm.xtext.services.FSMGrammarAccess;

}

@parser::members {

 	private FSMGrammarAccess grammarAccess;

    public InternalFSMParser(TokenStream input, FSMGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FiniteStateMachine";
   	}

   	@Override
   	protected FSMGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFiniteStateMachine
entryRuleFiniteStateMachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFiniteStateMachineRule()); }
	iv_ruleFiniteStateMachine=ruleFiniteStateMachine
	{ $current=$iv_ruleFiniteStateMachine.current; }
	EOF;

// Rule FiniteStateMachine
ruleFiniteStateMachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FiniteStateMachine'
		{
			newLeafNode(otherlv_0, grammarAccess.getFiniteStateMachineAccess().getFiniteStateMachineKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFiniteStateMachineRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.gemoc.course.fsm.xtext.FSM.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFiniteStateMachineAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='initialState'
		{
			newLeafNode(otherlv_3, grammarAccess.getFiniteStateMachineAccess().getInitialStateKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFiniteStateMachineRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getInitialStateStateCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='states'
			{
				newLeafNode(otherlv_5, grammarAccess.getFiniteStateMachineAccess().getStatesKeyword_5_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getFiniteStateMachineAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_5_2_0());
					}
					lv_states_7_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFiniteStateMachineRule());
						}
						add(
							$current,
							"states",
							lv_states_7_0,
							"org.gemoc.course.fsm.xtext.FSM.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getFiniteStateMachineAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_5_3_1_0());
						}
						lv_states_9_0=ruleState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFiniteStateMachineRule());
							}
							add(
								$current,
								"states",
								lv_states_9_0,
								"org.gemoc.course.fsm.xtext.FSM.State");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getFiniteStateMachineAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getFiniteStateMachineAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStateAccess().getStateAction_0(),
					$current);
			}
		)
		otherlv_1='State'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.gemoc.course.fsm.xtext.FSM.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='outgoingTransitions'
			{
				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getOutgoingTransitionsKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_2_0());
					}
					lv_outgoingTransitions_6_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"outgoingTransitions",
							lv_outgoingTransitions_6_0,
							"org.gemoc.course.fsm.xtext.FSM.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_3_1_0());
						}
						lv_outgoingTransitions_8_0=ruleTransition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStateRule());
							}
							add(
								$current,
								"outgoingTransitions",
								lv_outgoingTransitions_8_0,
								"org.gemoc.course.fsm.xtext.FSM.Transition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.gemoc.course.fsm.xtext.FSM.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='input'
			{
				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getInputKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getInputEStringParserRuleCall_3_1_0());
					}
					lv_input_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"input",
							lv_input_4_0,
							"org.gemoc.course.fsm.xtext.FSM.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='output'
			{
				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getOutputKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getOutputEStringParserRuleCall_4_1_0());
					}
					lv_output_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"output",
							lv_output_6_0,
							"org.gemoc.course.fsm.xtext.FSM.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='target'
		{
			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
