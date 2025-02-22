/*
 * generated by Xtext 2.10.0
 */
package org.gemoc.course.fsm.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.gemoc.course.fsm.xtext.parser.antlr.internal.InternalFSMParser;
import org.gemoc.course.fsm.xtext.services.FSMGrammarAccess;

public class FSMParser extends AbstractAntlrParser {

	@Inject
	private FSMGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFSMParser createParser(XtextTokenStream stream) {
		return new InternalFSMParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "FiniteStateMachine";
	}

	public FSMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FSMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
