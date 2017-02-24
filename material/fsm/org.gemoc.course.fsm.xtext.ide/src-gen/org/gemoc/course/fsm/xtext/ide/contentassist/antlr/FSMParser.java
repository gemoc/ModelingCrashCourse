/*
 * generated by Xtext 2.10.0
 */
package org.gemoc.course.fsm.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.gemoc.course.fsm.xtext.ide.contentassist.antlr.internal.InternalFSMParser;
import org.gemoc.course.fsm.xtext.services.FSMGrammarAccess;

public class FSMParser extends AbstractContentAssistParser {

	@Inject
	private FSMGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFSMParser createParser() {
		InternalFSMParser result = new InternalFSMParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getFiniteStateMachineAccess().getGroup(), "rule__FiniteStateMachine__Group__0");
					put(grammarAccess.getFiniteStateMachineAccess().getGroup_5(), "rule__FiniteStateMachine__Group_5__0");
					put(grammarAccess.getFiniteStateMachineAccess().getGroup_5_3(), "rule__FiniteStateMachine__Group_5_3__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateAccess().getGroup_4(), "rule__State__Group_4__0");
					put(grammarAccess.getStateAccess().getGroup_4_3(), "rule__State__Group_4_3__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_3(), "rule__Transition__Group_3__0");
					put(grammarAccess.getTransitionAccess().getGroup_4(), "rule__Transition__Group_4__0");
					put(grammarAccess.getFiniteStateMachineAccess().getNameAssignment_1(), "rule__FiniteStateMachine__NameAssignment_1");
					put(grammarAccess.getFiniteStateMachineAccess().getInitialStateAssignment_4(), "rule__FiniteStateMachine__InitialStateAssignment_4");
					put(grammarAccess.getFiniteStateMachineAccess().getStatesAssignment_5_2(), "rule__FiniteStateMachine__StatesAssignment_5_2");
					put(grammarAccess.getFiniteStateMachineAccess().getStatesAssignment_5_3_1(), "rule__FiniteStateMachine__StatesAssignment_5_3_1");
					put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
					put(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_4_2(), "rule__State__OutgoingTransitionsAssignment_4_2");
					put(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_4_3_1(), "rule__State__OutgoingTransitionsAssignment_4_3_1");
					put(grammarAccess.getTransitionAccess().getNameAssignment_1(), "rule__Transition__NameAssignment_1");
					put(grammarAccess.getTransitionAccess().getInputAssignment_3_1(), "rule__Transition__InputAssignment_3_1");
					put(grammarAccess.getTransitionAccess().getOutputAssignment_4_1(), "rule__Transition__OutputAssignment_4_1");
					put(grammarAccess.getTransitionAccess().getTargetAssignment_6(), "rule__Transition__TargetAssignment_6");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalFSMParser typedParser = (InternalFSMParser) parser;
			typedParser.entryRuleFiniteStateMachine();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FSMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FSMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
