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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FiniteStateMachine'", "'{'", "'}'", "'initial'", "'state'", "'->'", "'['", "'|'", "']'", "':'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // InternalFSM.g:71:1: ruleFiniteStateMachine returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleFiniteStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_states_4_0 = null;

        EObject lv_states_5_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalFSM.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalFSM.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+ {...}?) ) )
            // InternalFSM.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalFSM.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+ {...}?) )
            // InternalFSM.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup());
            			
            // InternalFSM.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+ {...}?)
            // InternalFSM.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+ {...}?
            {
            // InternalFSM.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFSM.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) )
            	    {
            	    // InternalFSM.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) ) )
            	    // InternalFSM.g:86:4: {...}? => ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFiniteStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalFSM.g:86:112: ( ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) ) )
            	    // InternalFSM.g:87:5: ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalFSM.g:90:8: ({...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? ) )
            	    // InternalFSM.g:90:9: {...}? => (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFiniteStateMachine", "true");
            	    }
            	    // InternalFSM.g:90:18: (otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )? )
            	    // InternalFSM.g:90:19: otherlv_1= 'FiniteStateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )?
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getFiniteStateMachineAccess().getFiniteStateMachineKeyword_0_0());
            	    							
            	    // InternalFSM.g:94:8: ( (lv_name_2_0= ruleEString ) )
            	    // InternalFSM.g:95:9: (lv_name_2_0= ruleEString )
            	    {
            	    // InternalFSM.g:95:9: (lv_name_2_0= ruleEString )
            	    // InternalFSM.g:96:10: lv_name_2_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getNameEStringParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_name_2_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFiniteStateMachineRule());
            	    										}
            	    										set(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.gemoc.course.fsm.xtext.FSM.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getFiniteStateMachineAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalFSM.g:117:8: ( ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( ((LA2_0>=14 && LA2_0<=15)) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalFSM.g:118:9: ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )*
            	            {
            	            // InternalFSM.g:118:9: ( (lv_states_4_0= ruleState ) )
            	            // InternalFSM.g:119:10: (lv_states_4_0= ruleState )
            	            {
            	            // InternalFSM.g:119:10: (lv_states_4_0= ruleState )
            	            // InternalFSM.g:120:11: lv_states_4_0= ruleState
            	            {

            	            											newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_0_3_0_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_states_4_0=ruleState();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getFiniteStateMachineRule());
            	            											}
            	            											add(
            	            												current,
            	            												"states",
            	            												lv_states_4_0,
            	            												"org.gemoc.course.fsm.xtext.FSM.State");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            // InternalFSM.g:137:9: ( (lv_states_5_0= ruleState ) )*
            	            loop1:
            	            do {
            	                int alt1=2;
            	                int LA1_0 = input.LA(1);

            	                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
            	                    alt1=1;
            	                }


            	                switch (alt1) {
            	            	case 1 :
            	            	    // InternalFSM.g:138:10: (lv_states_5_0= ruleState )
            	            	    {
            	            	    // InternalFSM.g:138:10: (lv_states_5_0= ruleState )
            	            	    // InternalFSM.g:139:11: lv_states_5_0= ruleState
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getFiniteStateMachineAccess().getStatesStateParserRuleCall_0_3_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_5);
            	            	    lv_states_5_0=ruleState();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getFiniteStateMachineRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"states",
            	            	    												lv_states_5_0,
            	            	    												"org.gemoc.course.fsm.xtext.FSM.State");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop1;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFSM.g:163:3: ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) )
            	    {
            	    // InternalFSM.g:163:3: ({...}? => ( ({...}? => (otherlv_6= '}' ) ) ) )
            	    // InternalFSM.g:164:4: {...}? => ( ({...}? => (otherlv_6= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFiniteStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalFSM.g:164:112: ( ({...}? => (otherlv_6= '}' ) ) )
            	    // InternalFSM.g:165:5: ({...}? => (otherlv_6= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalFSM.g:168:8: ({...}? => (otherlv_6= '}' ) )
            	    // InternalFSM.g:168:9: {...}? => (otherlv_6= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFiniteStateMachine", "true");
            	    }
            	    // InternalFSM.g:168:18: (otherlv_6= '}' )
            	    // InternalFSM.g:168:19: otherlv_6= '}'
            	    {
            	    otherlv_6=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_6, grammarAccess.getFiniteStateMachineAccess().getRightCurlyBracketKeyword_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleFiniteStateMachine", "getUnorderedGroupHelper().canLeave(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getFiniteStateMachineAccess().getUnorderedGroup());
            			

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
    // InternalFSM.g:189:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalFSM.g:189:46: (iv_ruleState= ruleState EOF )
            // InternalFSM.g:190:2: iv_ruleState= ruleState EOF
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
    // InternalFSM.g:196:1: ruleState returns [EObject current=null] : ( () ( (lv_isInitialState_1_0= 'initial' ) )? otherlv_2= 'state' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( (lv_outgoingTransitions_5_0= ruleTransition ) ) ( (lv_outgoingTransitions_6_0= ruleTransition ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitialState_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_outgoingTransitions_5_0 = null;

        EObject lv_outgoingTransitions_6_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:202:2: ( ( () ( (lv_isInitialState_1_0= 'initial' ) )? otherlv_2= 'state' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( (lv_outgoingTransitions_5_0= ruleTransition ) ) ( (lv_outgoingTransitions_6_0= ruleTransition ) )* otherlv_7= '}' )? ) )
            // InternalFSM.g:203:2: ( () ( (lv_isInitialState_1_0= 'initial' ) )? otherlv_2= 'state' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( (lv_outgoingTransitions_5_0= ruleTransition ) ) ( (lv_outgoingTransitions_6_0= ruleTransition ) )* otherlv_7= '}' )? )
            {
            // InternalFSM.g:203:2: ( () ( (lv_isInitialState_1_0= 'initial' ) )? otherlv_2= 'state' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( (lv_outgoingTransitions_5_0= ruleTransition ) ) ( (lv_outgoingTransitions_6_0= ruleTransition ) )* otherlv_7= '}' )? )
            // InternalFSM.g:204:3: () ( (lv_isInitialState_1_0= 'initial' ) )? otherlv_2= 'state' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( (lv_outgoingTransitions_5_0= ruleTransition ) ) ( (lv_outgoingTransitions_6_0= ruleTransition ) )* otherlv_7= '}' )?
            {
            // InternalFSM.g:204:3: ()
            // InternalFSM.g:205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalFSM.g:211:3: ( (lv_isInitialState_1_0= 'initial' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFSM.g:212:4: (lv_isInitialState_1_0= 'initial' )
                    {
                    // InternalFSM.g:212:4: (lv_isInitialState_1_0= 'initial' )
                    // InternalFSM.g:213:5: lv_isInitialState_1_0= 'initial'
                    {
                    lv_isInitialState_1_0=(Token)match(input,14,FOLLOW_7); 

                    					newLeafNode(lv_isInitialState_1_0, grammarAccess.getStateAccess().getIsInitialStateInitialKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "isInitialState", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_2());
            		
            // InternalFSM.g:229:3: ( (lv_name_3_0= ruleEString ) )
            // InternalFSM.g:230:4: (lv_name_3_0= ruleEString )
            {
            // InternalFSM.g:230:4: (lv_name_3_0= ruleEString )
            // InternalFSM.g:231:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.gemoc.course.fsm.xtext.FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFSM.g:248:3: (otherlv_4= '{' ( (lv_outgoingTransitions_5_0= ruleTransition ) ) ( (lv_outgoingTransitions_6_0= ruleTransition ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFSM.g:249:4: otherlv_4= '{' ( (lv_outgoingTransitions_5_0= ruleTransition ) ) ( (lv_outgoingTransitions_6_0= ruleTransition ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalFSM.g:253:4: ( (lv_outgoingTransitions_5_0= ruleTransition ) )
                    // InternalFSM.g:254:5: (lv_outgoingTransitions_5_0= ruleTransition )
                    {
                    // InternalFSM.g:254:5: (lv_outgoingTransitions_5_0= ruleTransition )
                    // InternalFSM.g:255:6: lv_outgoingTransitions_5_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_outgoingTransitions_5_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"outgoingTransitions",
                    							lv_outgoingTransitions_5_0,
                    							"org.gemoc.course.fsm.xtext.FSM.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFSM.g:272:4: ( (lv_outgoingTransitions_6_0= ruleTransition ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalFSM.g:273:5: (lv_outgoingTransitions_6_0= ruleTransition )
                    	    {
                    	    // InternalFSM.g:273:5: (lv_outgoingTransitions_6_0= ruleTransition )
                    	    // InternalFSM.g:274:6: lv_outgoingTransitions_6_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
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
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }


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


    // $ANTLR start "entryRuleTransition"
    // InternalFSM.g:300:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalFSM.g:300:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalFSM.g:301:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalFSM.g:307:1: ruleTransition returns [EObject current=null] : (otherlv_0= '->' ( ( ruleEString ) ) otherlv_2= '[' ( (lv_input_3_0= ruleEString ) ) (otherlv_4= '|' ( (lv_output_5_0= ruleEString ) ) )? otherlv_6= ']' otherlv_7= ':' ( (lv_name_8_0= ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_input_3_0 = null;

        AntlrDatatypeRuleToken lv_output_5_0 = null;

        AntlrDatatypeRuleToken lv_name_8_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:313:2: ( (otherlv_0= '->' ( ( ruleEString ) ) otherlv_2= '[' ( (lv_input_3_0= ruleEString ) ) (otherlv_4= '|' ( (lv_output_5_0= ruleEString ) ) )? otherlv_6= ']' otherlv_7= ':' ( (lv_name_8_0= ruleEString ) ) ) )
            // InternalFSM.g:314:2: (otherlv_0= '->' ( ( ruleEString ) ) otherlv_2= '[' ( (lv_input_3_0= ruleEString ) ) (otherlv_4= '|' ( (lv_output_5_0= ruleEString ) ) )? otherlv_6= ']' otherlv_7= ':' ( (lv_name_8_0= ruleEString ) ) )
            {
            // InternalFSM.g:314:2: (otherlv_0= '->' ( ( ruleEString ) ) otherlv_2= '[' ( (lv_input_3_0= ruleEString ) ) (otherlv_4= '|' ( (lv_output_5_0= ruleEString ) ) )? otherlv_6= ']' otherlv_7= ':' ( (lv_name_8_0= ruleEString ) ) )
            // InternalFSM.g:315:3: otherlv_0= '->' ( ( ruleEString ) ) otherlv_2= '[' ( (lv_input_3_0= ruleEString ) ) (otherlv_4= '|' ( (lv_output_5_0= ruleEString ) ) )? otherlv_6= ']' otherlv_7= ':' ( (lv_name_8_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalFSM.g:319:3: ( ( ruleEString ) )
            // InternalFSM.g:320:4: ( ruleEString )
            {
            // InternalFSM.g:320:4: ( ruleEString )
            // InternalFSM.g:321:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalFSM.g:339:3: ( (lv_input_3_0= ruleEString ) )
            // InternalFSM.g:340:4: (lv_input_3_0= ruleEString )
            {
            // InternalFSM.g:340:4: (lv_input_3_0= ruleEString )
            // InternalFSM.g:341:5: lv_input_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getInputEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_input_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_3_0,
            						"org.gemoc.course.fsm.xtext.FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFSM.g:358:3: (otherlv_4= '|' ( (lv_output_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFSM.g:359:4: otherlv_4= '|' ( (lv_output_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getVerticalLineKeyword_4_0());
                    			
                    // InternalFSM.g:363:4: ( (lv_output_5_0= ruleEString ) )
                    // InternalFSM.g:364:5: (lv_output_5_0= ruleEString )
                    {
                    // InternalFSM.g:364:5: (lv_output_5_0= ruleEString )
                    // InternalFSM.g:365:6: lv_output_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getOutputEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_output_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"output",
                    							lv_output_5_0,
                    							"org.gemoc.course.fsm.xtext.FSM.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getColonKeyword_6());
            		
            // InternalFSM.g:391:3: ( (lv_name_8_0= ruleEString ) )
            // InternalFSM.g:392:4: (lv_name_8_0= ruleEString )
            {
            // InternalFSM.g:392:4: (lv_name_8_0= ruleEString )
            // InternalFSM.g:393:5: lv_name_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_8_0,
            						"org.gemoc.course.fsm.xtext.FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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


    // $ANTLR start "entryRuleEString"
    // InternalFSM.g:414:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFSM.g:414:47: (iv_ruleEString= ruleEString EOF )
            // InternalFSM.g:415:2: iv_ruleEString= ruleEString EOF
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
    // InternalFSM.g:421:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFSM.g:427:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFSM.g:428:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFSM.g:428:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFSM.g:429:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFSM.g:437:3: this_ID_1= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});

}
