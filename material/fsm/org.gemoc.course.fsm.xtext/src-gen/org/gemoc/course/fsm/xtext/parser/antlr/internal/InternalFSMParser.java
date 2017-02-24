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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FiniteStateMachine'", "'{'", "'initialState'", "'states'", "','", "'}'", "'State'", "'outgoingTransitions'", "'Transition'", "'input'", "'output'", "'target'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFSMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFSMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFSMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFSM.g"; }



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




    // $ANTLR start "entryRuleFiniteStateMachine"
    // InternalFSM.g:64:1: entryRuleFiniteStateMachine returns [EObject current=null] : iv_ruleFiniteStateMachine= ruleFiniteStateMachine EOF ;
    public final EObject entryRuleFiniteStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFiniteStateMachine = null;


        try {
            // InternalFSM.g:64:59: (iv_ruleFiniteStateMachine= ruleFiniteStateMachine EOF )
            // InternalFSM.g:65:2: iv_ruleFiniteStateMachine= ruleFiniteStateMachine EOF
            {
             newCompositeNode(grammarAccess.getFiniteStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFiniteStateMachine=ruleFiniteStateMachine();

            state._fsp--;

             current =iv_ruleFiniteStateMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFiniteStateMachine"


    // $ANTLR start "ruleFiniteStateMachine"
    // InternalFSM.g:71:1: ruleFiniteStateMachine returns [EObject current=null] : (otherlv_0= 'FiniteStateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) (otherlv_5= 'states' otherlv_6= '{' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleFiniteStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_states_7_0 = null;

        EObject lv_states_9_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:77:2: ( (otherlv_0= 'FiniteStateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) (otherlv_5= 'states' otherlv_6= '{' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalFSM.g:78:2: (otherlv_0= 'FiniteStateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) (otherlv_5= 'states' otherlv_6= '{' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalFSM.g:78:2: (otherlv_0= 'FiniteStateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) (otherlv_5= 'states' otherlv_6= '{' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalFSM.g:79:3: otherlv_0= 'FiniteStateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) (otherlv_5= 'states' otherlv_6= '{' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFiniteStateMachineAccess().getFiniteStateMachineKeyword_0());
            		
            // InternalFSM.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFSM.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalFSM.g:84:4: (lv_name_1_0= ruleEString )
            // InternalFSM.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFiniteStateMachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.gemoc.course.fsm.xtext.FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFiniteStateMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFiniteStateMachineAccess().getInitialStateKeyword_3());
            		
            // InternalFSM.g:110:3: ( ( ruleEString ) )
            // InternalFSM.g:111:4: ( ruleEString )
            {
            // InternalFSM.g:111:4: ( ruleEString )
            // InternalFSM.g:112:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFiniteStateMachineRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getInitialStateStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFSM.g:126:3: (otherlv_5= 'states' otherlv_6= '{' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* otherlv_10= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFSM.g:127:4: otherlv_5= 'states' otherlv_6= '{' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getFiniteStateMachineAccess().getStatesKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getFiniteStateMachineAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalFSM.g:135:4: ( (lv_states_7_0= ruleState ) )
                    // InternalFSM.g:136:5: (lv_states_7_0= ruleState )
                    {
                    // InternalFSM.g:136:5: (lv_states_7_0= ruleState )
                    // InternalFSM.g:137:6: lv_states_7_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_states_7_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFiniteStateMachineRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_7_0,
                    							"org.gemoc.course.fsm.xtext.FSM.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFSM.g:154:4: (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalFSM.g:155:5: otherlv_8= ',' ( (lv_states_9_0= ruleState ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFiniteStateMachineAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalFSM.g:159:5: ( (lv_states_9_0= ruleState ) )
                    	    // InternalFSM.g:160:6: (lv_states_9_0= ruleState )
                    	    {
                    	    // InternalFSM.g:160:6: (lv_states_9_0= ruleState )
                    	    // InternalFSM.g:161:7: lv_states_9_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_states_9_0=ruleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFiniteStateMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"states",
                    	    								lv_states_9_0,
                    	    								"org.gemoc.course.fsm.xtext.FSM.State");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getFiniteStateMachineAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFiniteStateMachineAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFiniteStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalFSM.g:192:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalFSM.g:192:46: (iv_ruleState= ruleState EOF )
            // InternalFSM.g:193:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalFSM.g:199:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_outgoingTransitions_6_0 = null;

        EObject lv_outgoingTransitions_8_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:205:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalFSM.g:206:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalFSM.g:206:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalFSM.g:207:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalFSM.g:207:3: ()
            // InternalFSM.g:208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalFSM.g:218:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFSM.g:219:4: (lv_name_2_0= ruleEString )
            {
            // InternalFSM.g:219:4: (lv_name_2_0= ruleEString )
            // InternalFSM.g:220:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.course.fsm.xtext.FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFSM.g:241:3: (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFSM.g:242:4: otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getOutgoingTransitionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalFSM.g:250:4: ( (lv_outgoingTransitions_6_0= ruleTransition ) )
                    // InternalFSM.g:251:5: (lv_outgoingTransitions_6_0= ruleTransition )
                    {
                    // InternalFSM.g:251:5: (lv_outgoingTransitions_6_0= ruleTransition )
                    // InternalFSM.g:252:6: lv_outgoingTransitions_6_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_outgoingTransitions_6_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"outgoingTransitions",
                    							lv_outgoingTransitions_6_0,
                    							"org.gemoc.course.fsm.xtext.FSM.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFSM.g:269:4: (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalFSM.g:270:5: otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalFSM.g:274:5: ( (lv_outgoingTransitions_8_0= ruleTransition ) )
                    	    // InternalFSM.g:275:6: (lv_outgoingTransitions_8_0= ruleTransition )
                    	    {
                    	    // InternalFSM.g:275:6: (lv_outgoingTransitions_8_0= ruleTransition )
                    	    // InternalFSM.g:276:7: lv_outgoingTransitions_8_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_outgoingTransitions_8_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outgoingTransitions",
                    	    								lv_outgoingTransitions_8_0,
                    	    								"org.gemoc.course.fsm.xtext.FSM.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEString"
    // InternalFSM.g:307:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFSM.g:307:47: (iv_ruleEString= ruleEString EOF )
            // InternalFSM.g:308:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFSM.g:314:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFSM.g:320:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFSM.g:321:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFSM.g:321:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFSM.g:322:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFSM.g:330:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTransition"
    // InternalFSM.g:341:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalFSM.g:341:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalFSM.g:342:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalFSM.g:348:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_input_4_0 = null;

        AntlrDatatypeRuleToken lv_output_6_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:354:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalFSM.g:355:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalFSM.g:355:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalFSM.g:356:3: otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalFSM.g:360:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFSM.g:361:4: (lv_name_1_0= ruleEString )
            {
            // InternalFSM.g:361:4: (lv_name_1_0= ruleEString )
            // InternalFSM.g:362:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.gemoc.course.fsm.xtext.FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFSM.g:383:3: (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFSM.g:384:4: otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getInputKeyword_3_0());
                    			
                    // InternalFSM.g:388:4: ( (lv_input_4_0= ruleEString ) )
                    // InternalFSM.g:389:5: (lv_input_4_0= ruleEString )
                    {
                    // InternalFSM.g:389:5: (lv_input_4_0= ruleEString )
                    // InternalFSM.g:390:6: lv_input_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getInputEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_input_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"input",
                    							lv_input_4_0,
                    							"org.gemoc.course.fsm.xtext.FSM.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFSM.g:408:3: (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFSM.g:409:4: otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getOutputKeyword_4_0());
                    			
                    // InternalFSM.g:413:4: ( (lv_output_6_0= ruleEString ) )
                    // InternalFSM.g:414:5: (lv_output_6_0= ruleEString )
                    {
                    // InternalFSM.g:414:5: (lv_output_6_0= ruleEString )
                    // InternalFSM.g:415:6: lv_output_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getOutputEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_output_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"output",
                    							lv_output_6_0,
                    							"org.gemoc.course.fsm.xtext.FSM.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetKeyword_5());
            		
            // InternalFSM.g:437:3: ( ( ruleEString ) )
            // InternalFSM.g:438:4: ( ruleEString )
            {
            // InternalFSM.g:438:4: ( ruleEString )
            // InternalFSM.g:439:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}