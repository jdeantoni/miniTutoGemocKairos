package fr.inria.kairos.tuto.concretesyntax.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.kairos.tuto.concretesyntax.xtext.services.KairosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKairosSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KairosSystem'", "'Actor'", "':'", "'every'", "'{'", "'}'", "'Connector'", "'('", "'from'", "'to'", "')'", "'In'", "'Port'", "'connector'", "'Out'"
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
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKairosSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKairosSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKairosSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKairosSystem.g"; }



     	private KairosSystemGrammarAccess grammarAccess;

        public InternalKairosSystemParser(TokenStream input, KairosSystemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "KairosSystem";
       	}

       	@Override
       	protected KairosSystemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleKairosSystem"
    // InternalKairosSystem.g:64:1: entryRuleKairosSystem returns [EObject current=null] : iv_ruleKairosSystem= ruleKairosSystem EOF ;
    public final EObject entryRuleKairosSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKairosSystem = null;


        try {
            // InternalKairosSystem.g:64:53: (iv_ruleKairosSystem= ruleKairosSystem EOF )
            // InternalKairosSystem.g:65:2: iv_ruleKairosSystem= ruleKairosSystem EOF
            {
             newCompositeNode(grammarAccess.getKairosSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKairosSystem=ruleKairosSystem();

            state._fsp--;

             current =iv_ruleKairosSystem; 
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
    // $ANTLR end "entryRuleKairosSystem"


    // $ANTLR start "ruleKairosSystem"
    // InternalKairosSystem.g:71:1: ruleKairosSystem returns [EObject current=null] : ( () otherlv_1= 'KairosSystem' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedActors_3_0= ruleActor ) )* ( (lv_ownedConnectors_4_0= ruleConnector ) )* ) ;
    public final EObject ruleKairosSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedActors_3_0 = null;

        EObject lv_ownedConnectors_4_0 = null;



        	enterRule();

        try {
            // InternalKairosSystem.g:77:2: ( ( () otherlv_1= 'KairosSystem' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedActors_3_0= ruleActor ) )* ( (lv_ownedConnectors_4_0= ruleConnector ) )* ) )
            // InternalKairosSystem.g:78:2: ( () otherlv_1= 'KairosSystem' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedActors_3_0= ruleActor ) )* ( (lv_ownedConnectors_4_0= ruleConnector ) )* )
            {
            // InternalKairosSystem.g:78:2: ( () otherlv_1= 'KairosSystem' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedActors_3_0= ruleActor ) )* ( (lv_ownedConnectors_4_0= ruleConnector ) )* )
            // InternalKairosSystem.g:79:3: () otherlv_1= 'KairosSystem' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedActors_3_0= ruleActor ) )* ( (lv_ownedConnectors_4_0= ruleConnector ) )*
            {
            // InternalKairosSystem.g:79:3: ()
            // InternalKairosSystem.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKairosSystemAccess().getKairosSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getKairosSystemAccess().getKairosSystemKeyword_1());
            		
            // InternalKairosSystem.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKairosSystem.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalKairosSystem.g:91:4: (lv_name_2_0= ruleEString )
            // InternalKairosSystem.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKairosSystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKairosSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKairosSystem.g:109:3: ( (lv_ownedActors_3_0= ruleActor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKairosSystem.g:110:4: (lv_ownedActors_3_0= ruleActor )
            	    {
            	    // InternalKairosSystem.g:110:4: (lv_ownedActors_3_0= ruleActor )
            	    // InternalKairosSystem.g:111:5: lv_ownedActors_3_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getKairosSystemAccess().getOwnedActorsActorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_ownedActors_3_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKairosSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedActors",
            	    						lv_ownedActors_3_0,
            	    						"fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalKairosSystem.g:128:3: ( (lv_ownedConnectors_4_0= ruleConnector ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKairosSystem.g:129:4: (lv_ownedConnectors_4_0= ruleConnector )
            	    {
            	    // InternalKairosSystem.g:129:4: (lv_ownedConnectors_4_0= ruleConnector )
            	    // InternalKairosSystem.g:130:5: lv_ownedConnectors_4_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getKairosSystemAccess().getOwnedConnectorsConnectorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedConnectors_4_0=ruleConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKairosSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedConnectors",
            	    						lv_ownedConnectors_4_0,
            	    						"fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.Connector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleKairosSystem"


    // $ANTLR start "entryRuleEString"
    // InternalKairosSystem.g:151:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKairosSystem.g:151:47: (iv_ruleEString= ruleEString EOF )
            // InternalKairosSystem.g:152:2: iv_ruleEString= ruleEString EOF
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
    // InternalKairosSystem.g:158:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalKairosSystem.g:164:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalKairosSystem.g:165:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalKairosSystem.g:165:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKairosSystem.g:166:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKairosSystem.g:174:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleActor"
    // InternalKairosSystem.g:185:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalKairosSystem.g:185:46: (iv_ruleActor= ruleActor EOF )
            // InternalKairosSystem.g:186:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalKairosSystem.g:192:1: ruleActor returns [EObject current=null] : ( () otherlv_1= 'Actor' otherlv_2= ':' (otherlv_3= 'every' ( (lv_period_4_0= RULE_INT ) ) )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( (lv_ownedInputPorts_7_0= ruleInputPort ) )* ( (lv_ownedOutputPorts_8_0= ruleOutputPort ) )* otherlv_9= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_period_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_ownedInputPorts_7_0 = null;

        EObject lv_ownedOutputPorts_8_0 = null;



        	enterRule();

        try {
            // InternalKairosSystem.g:198:2: ( ( () otherlv_1= 'Actor' otherlv_2= ':' (otherlv_3= 'every' ( (lv_period_4_0= RULE_INT ) ) )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( (lv_ownedInputPorts_7_0= ruleInputPort ) )* ( (lv_ownedOutputPorts_8_0= ruleOutputPort ) )* otherlv_9= '}' ) )
            // InternalKairosSystem.g:199:2: ( () otherlv_1= 'Actor' otherlv_2= ':' (otherlv_3= 'every' ( (lv_period_4_0= RULE_INT ) ) )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( (lv_ownedInputPorts_7_0= ruleInputPort ) )* ( (lv_ownedOutputPorts_8_0= ruleOutputPort ) )* otherlv_9= '}' )
            {
            // InternalKairosSystem.g:199:2: ( () otherlv_1= 'Actor' otherlv_2= ':' (otherlv_3= 'every' ( (lv_period_4_0= RULE_INT ) ) )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( (lv_ownedInputPorts_7_0= ruleInputPort ) )* ( (lv_ownedOutputPorts_8_0= ruleOutputPort ) )* otherlv_9= '}' )
            // InternalKairosSystem.g:200:3: () otherlv_1= 'Actor' otherlv_2= ':' (otherlv_3= 'every' ( (lv_period_4_0= RULE_INT ) ) )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( (lv_ownedInputPorts_7_0= ruleInputPort ) )* ( (lv_ownedOutputPorts_8_0= ruleOutputPort ) )* otherlv_9= '}'
            {
            // InternalKairosSystem.g:200:3: ()
            // InternalKairosSystem.g:201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActorAccess().getActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getActorAccess().getActorKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getColonKeyword_2());
            		
            // InternalKairosSystem.g:215:3: (otherlv_3= 'every' ( (lv_period_4_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKairosSystem.g:216:4: otherlv_3= 'every' ( (lv_period_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getActorAccess().getEveryKeyword_3_0());
                    			
                    // InternalKairosSystem.g:220:4: ( (lv_period_4_0= RULE_INT ) )
                    // InternalKairosSystem.g:221:5: (lv_period_4_0= RULE_INT )
                    {
                    // InternalKairosSystem.g:221:5: (lv_period_4_0= RULE_INT )
                    // InternalKairosSystem.g:222:6: lv_period_4_0= RULE_INT
                    {
                    lv_period_4_0=(Token)match(input,RULE_INT,FOLLOW_3); 

                    						newLeafNode(lv_period_4_0, grammarAccess.getActorAccess().getPeriodINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"period",
                    							lv_period_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKairosSystem.g:239:3: ( (lv_name_5_0= ruleEString ) )
            // InternalKairosSystem.g:240:4: (lv_name_5_0= ruleEString )
            {
            // InternalKairosSystem.g:240:4: (lv_name_5_0= ruleEString )
            // InternalKairosSystem.g:241:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActorAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalKairosSystem.g:262:3: ( (lv_ownedInputPorts_7_0= ruleInputPort ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKairosSystem.g:263:4: (lv_ownedInputPorts_7_0= ruleInputPort )
            	    {
            	    // InternalKairosSystem.g:263:4: (lv_ownedInputPorts_7_0= ruleInputPort )
            	    // InternalKairosSystem.g:264:5: lv_ownedInputPorts_7_0= ruleInputPort
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getOwnedInputPortsInputPortParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_ownedInputPorts_7_0=ruleInputPort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedInputPorts",
            	    						lv_ownedInputPorts_7_0,
            	    						"fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.InputPort");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalKairosSystem.g:281:3: ( (lv_ownedOutputPorts_8_0= ruleOutputPort ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKairosSystem.g:282:4: (lv_ownedOutputPorts_8_0= ruleOutputPort )
            	    {
            	    // InternalKairosSystem.g:282:4: (lv_ownedOutputPorts_8_0= ruleOutputPort )
            	    // InternalKairosSystem.g:283:5: lv_ownedOutputPorts_8_0= ruleOutputPort
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getOwnedOutputPortsOutputPortParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ownedOutputPorts_8_0=ruleOutputPort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedOutputPorts",
            	    						lv_ownedOutputPorts_8_0,
            	    						"fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.OutputPort");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleConnector"
    // InternalKairosSystem.g:308:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalKairosSystem.g:308:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalKairosSystem.g:309:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalKairosSystem.g:315:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKairosSystem.g:321:2: ( (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= ')' ) )
            // InternalKairosSystem.g:322:2: (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= ')' )
            {
            // InternalKairosSystem.g:322:2: (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= ')' )
            // InternalKairosSystem.g:323:3: otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
            		
            // InternalKairosSystem.g:327:3: ( (lv_name_1_0= ruleEString ) )
            // InternalKairosSystem.g:328:4: (lv_name_1_0= ruleEString )
            {
            // InternalKairosSystem.g:328:4: (lv_name_1_0= ruleEString )
            // InternalKairosSystem.g:329:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getFromKeyword_3());
            		
            // InternalKairosSystem.g:354:3: ( ( ruleEString ) )
            // InternalKairosSystem.g:355:4: ( ruleEString )
            {
            // InternalKairosSystem.g:355:4: ( ruleEString )
            // InternalKairosSystem.g:356:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorAccess().getOutputportOutputPortCrossReference_4_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getToKeyword_5());
            		
            // InternalKairosSystem.g:374:3: ( ( ruleEString ) )
            // InternalKairosSystem.g:375:4: ( ruleEString )
            {
            // InternalKairosSystem.g:375:4: ( ruleEString )
            // InternalKairosSystem.g:376:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorAccess().getInputportInputPortCrossReference_6_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleInputPort"
    // InternalKairosSystem.g:398:1: entryRuleInputPort returns [EObject current=null] : iv_ruleInputPort= ruleInputPort EOF ;
    public final EObject entryRuleInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPort = null;


        try {
            // InternalKairosSystem.g:398:50: (iv_ruleInputPort= ruleInputPort EOF )
            // InternalKairosSystem.g:399:2: iv_ruleInputPort= ruleInputPort EOF
            {
             newCompositeNode(grammarAccess.getInputPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputPort=ruleInputPort();

            state._fsp--;

             current =iv_ruleInputPort; 
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
    // $ANTLR end "entryRuleInputPort"


    // $ANTLR start "ruleInputPort"
    // InternalKairosSystem.g:405:1: ruleInputPort returns [EObject current=null] : ( () otherlv_1= 'In' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleInputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalKairosSystem.g:411:2: ( ( () otherlv_1= 'In' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalKairosSystem.g:412:2: ( () otherlv_1= 'In' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalKairosSystem.g:412:2: ( () otherlv_1= 'In' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalKairosSystem.g:413:3: () otherlv_1= 'In' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalKairosSystem.g:413:3: ()
            // InternalKairosSystem.g:414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputPortAccess().getInputPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getInputPortAccess().getInKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInputPortAccess().getPortKeyword_2());
            		
            // InternalKairosSystem.g:428:3: ( (lv_name_3_0= ruleEString ) )
            // InternalKairosSystem.g:429:4: (lv_name_3_0= ruleEString )
            {
            // InternalKairosSystem.g:429:4: (lv_name_3_0= ruleEString )
            // InternalKairosSystem.g:430:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalKairosSystem.g:451:3: (otherlv_5= 'connector' ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKairosSystem.g:452:4: otherlv_5= 'connector' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputPortAccess().getConnectorKeyword_5_0());
                    			
                    // InternalKairosSystem.g:456:4: ( ( ruleEString ) )
                    // InternalKairosSystem.g:457:5: ( ruleEString )
                    {
                    // InternalKairosSystem.g:457:5: ( ruleEString )
                    // InternalKairosSystem.g:458:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputPortRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInputPortAccess().getConnectorConnectorCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInputPort"


    // $ANTLR start "entryRuleOutputPort"
    // InternalKairosSystem.g:481:1: entryRuleOutputPort returns [EObject current=null] : iv_ruleOutputPort= ruleOutputPort EOF ;
    public final EObject entryRuleOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPort = null;


        try {
            // InternalKairosSystem.g:481:51: (iv_ruleOutputPort= ruleOutputPort EOF )
            // InternalKairosSystem.g:482:2: iv_ruleOutputPort= ruleOutputPort EOF
            {
             newCompositeNode(grammarAccess.getOutputPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputPort=ruleOutputPort();

            state._fsp--;

             current =iv_ruleOutputPort; 
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
    // $ANTLR end "entryRuleOutputPort"


    // $ANTLR start "ruleOutputPort"
    // InternalKairosSystem.g:488:1: ruleOutputPort returns [EObject current=null] : ( () otherlv_1= 'Out' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleOutputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalKairosSystem.g:494:2: ( ( () otherlv_1= 'Out' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalKairosSystem.g:495:2: ( () otherlv_1= 'Out' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalKairosSystem.g:495:2: ( () otherlv_1= 'Out' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalKairosSystem.g:496:3: () otherlv_1= 'Out' otherlv_2= 'Port' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'connector' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalKairosSystem.g:496:3: ()
            // InternalKairosSystem.g:497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputPortAccess().getOutputPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputPortAccess().getOutKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputPortAccess().getPortKeyword_2());
            		
            // InternalKairosSystem.g:511:3: ( (lv_name_3_0= ruleEString ) )
            // InternalKairosSystem.g:512:4: (lv_name_3_0= ruleEString )
            {
            // InternalKairosSystem.g:512:4: (lv_name_3_0= ruleEString )
            // InternalKairosSystem.g:513:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.kairos.tuto.concretesyntax.xtext.KairosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalKairosSystem.g:534:3: (otherlv_5= 'connector' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKairosSystem.g:535:4: otherlv_5= 'connector' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutputPortAccess().getConnectorKeyword_5_0());
                    			
                    // InternalKairosSystem.g:539:4: ( ( ruleEString ) )
                    // InternalKairosSystem.g:540:5: ( ruleEString )
                    {
                    // InternalKairosSystem.g:540:5: ( ruleEString )
                    // InternalKairosSystem.g:541:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputPortRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOutputPortAccess().getConnectorConnectorCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleOutputPort"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002410000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});

}