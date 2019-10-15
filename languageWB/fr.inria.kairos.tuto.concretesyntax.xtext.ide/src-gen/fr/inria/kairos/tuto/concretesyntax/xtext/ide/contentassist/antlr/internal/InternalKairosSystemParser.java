package fr.inria.kairos.tuto.concretesyntax.xtext.ide.contentassist.antlr.internal;

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
import fr.inria.kairos.tuto.concretesyntax.xtext.services.KairosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKairosSystemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KairosSystem'", "'Actor'", "':'", "'{'", "'}'", "'every'", "'Connector'", "'('", "'from'", "'to'", "')'", "'In'", "'Port'", "'connector'", "'Out'"
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

    	public void setGrammarAccess(KairosSystemGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleKairosSystem"
    // InternalKairosSystem.g:53:1: entryRuleKairosSystem : ruleKairosSystem EOF ;
    public final void entryRuleKairosSystem() throws RecognitionException {
        try {
            // InternalKairosSystem.g:54:1: ( ruleKairosSystem EOF )
            // InternalKairosSystem.g:55:1: ruleKairosSystem EOF
            {
             before(grammarAccess.getKairosSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleKairosSystem();

            state._fsp--;

             after(grammarAccess.getKairosSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKairosSystem"


    // $ANTLR start "ruleKairosSystem"
    // InternalKairosSystem.g:62:1: ruleKairosSystem : ( ( rule__KairosSystem__Group__0 ) ) ;
    public final void ruleKairosSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:66:2: ( ( ( rule__KairosSystem__Group__0 ) ) )
            // InternalKairosSystem.g:67:2: ( ( rule__KairosSystem__Group__0 ) )
            {
            // InternalKairosSystem.g:67:2: ( ( rule__KairosSystem__Group__0 ) )
            // InternalKairosSystem.g:68:3: ( rule__KairosSystem__Group__0 )
            {
             before(grammarAccess.getKairosSystemAccess().getGroup()); 
            // InternalKairosSystem.g:69:3: ( rule__KairosSystem__Group__0 )
            // InternalKairosSystem.g:69:4: rule__KairosSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KairosSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKairosSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKairosSystem"


    // $ANTLR start "entryRuleEString"
    // InternalKairosSystem.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKairosSystem.g:79:1: ( ruleEString EOF )
            // InternalKairosSystem.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalKairosSystem.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKairosSystem.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalKairosSystem.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalKairosSystem.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalKairosSystem.g:94:3: ( rule__EString__Alternatives )
            // InternalKairosSystem.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleActor"
    // InternalKairosSystem.g:103:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalKairosSystem.g:104:1: ( ruleActor EOF )
            // InternalKairosSystem.g:105:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalKairosSystem.g:112:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:116:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalKairosSystem.g:117:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalKairosSystem.g:117:2: ( ( rule__Actor__Group__0 ) )
            // InternalKairosSystem.g:118:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalKairosSystem.g:119:3: ( rule__Actor__Group__0 )
            // InternalKairosSystem.g:119:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleConnector"
    // InternalKairosSystem.g:128:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalKairosSystem.g:129:1: ( ruleConnector EOF )
            // InternalKairosSystem.g:130:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalKairosSystem.g:137:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:141:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalKairosSystem.g:142:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalKairosSystem.g:142:2: ( ( rule__Connector__Group__0 ) )
            // InternalKairosSystem.g:143:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalKairosSystem.g:144:3: ( rule__Connector__Group__0 )
            // InternalKairosSystem.g:144:4: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleInputPort"
    // InternalKairosSystem.g:153:1: entryRuleInputPort : ruleInputPort EOF ;
    public final void entryRuleInputPort() throws RecognitionException {
        try {
            // InternalKairosSystem.g:154:1: ( ruleInputPort EOF )
            // InternalKairosSystem.g:155:1: ruleInputPort EOF
            {
             before(grammarAccess.getInputPortRule()); 
            pushFollow(FOLLOW_1);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getInputPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputPort"


    // $ANTLR start "ruleInputPort"
    // InternalKairosSystem.g:162:1: ruleInputPort : ( ( rule__InputPort__Group__0 ) ) ;
    public final void ruleInputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:166:2: ( ( ( rule__InputPort__Group__0 ) ) )
            // InternalKairosSystem.g:167:2: ( ( rule__InputPort__Group__0 ) )
            {
            // InternalKairosSystem.g:167:2: ( ( rule__InputPort__Group__0 ) )
            // InternalKairosSystem.g:168:3: ( rule__InputPort__Group__0 )
            {
             before(grammarAccess.getInputPortAccess().getGroup()); 
            // InternalKairosSystem.g:169:3: ( rule__InputPort__Group__0 )
            // InternalKairosSystem.g:169:4: rule__InputPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputPort"


    // $ANTLR start "entryRuleOutputPort"
    // InternalKairosSystem.g:178:1: entryRuleOutputPort : ruleOutputPort EOF ;
    public final void entryRuleOutputPort() throws RecognitionException {
        try {
            // InternalKairosSystem.g:179:1: ( ruleOutputPort EOF )
            // InternalKairosSystem.g:180:1: ruleOutputPort EOF
            {
             before(grammarAccess.getOutputPortRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getOutputPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputPort"


    // $ANTLR start "ruleOutputPort"
    // InternalKairosSystem.g:187:1: ruleOutputPort : ( ( rule__OutputPort__Group__0 ) ) ;
    public final void ruleOutputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:191:2: ( ( ( rule__OutputPort__Group__0 ) ) )
            // InternalKairosSystem.g:192:2: ( ( rule__OutputPort__Group__0 ) )
            {
            // InternalKairosSystem.g:192:2: ( ( rule__OutputPort__Group__0 ) )
            // InternalKairosSystem.g:193:3: ( rule__OutputPort__Group__0 )
            {
             before(grammarAccess.getOutputPortAccess().getGroup()); 
            // InternalKairosSystem.g:194:3: ( rule__OutputPort__Group__0 )
            // InternalKairosSystem.g:194:4: rule__OutputPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputPort"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalKairosSystem.g:202:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:206:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKairosSystem.g:207:2: ( RULE_STRING )
                    {
                    // InternalKairosSystem.g:207:2: ( RULE_STRING )
                    // InternalKairosSystem.g:208:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKairosSystem.g:213:2: ( RULE_ID )
                    {
                    // InternalKairosSystem.g:213:2: ( RULE_ID )
                    // InternalKairosSystem.g:214:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__KairosSystem__Group__0"
    // InternalKairosSystem.g:223:1: rule__KairosSystem__Group__0 : rule__KairosSystem__Group__0__Impl rule__KairosSystem__Group__1 ;
    public final void rule__KairosSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:227:1: ( rule__KairosSystem__Group__0__Impl rule__KairosSystem__Group__1 )
            // InternalKairosSystem.g:228:2: rule__KairosSystem__Group__0__Impl rule__KairosSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__KairosSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KairosSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__0"


    // $ANTLR start "rule__KairosSystem__Group__0__Impl"
    // InternalKairosSystem.g:235:1: rule__KairosSystem__Group__0__Impl : ( () ) ;
    public final void rule__KairosSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:239:1: ( ( () ) )
            // InternalKairosSystem.g:240:1: ( () )
            {
            // InternalKairosSystem.g:240:1: ( () )
            // InternalKairosSystem.g:241:2: ()
            {
             before(grammarAccess.getKairosSystemAccess().getKairosSystemAction_0()); 
            // InternalKairosSystem.g:242:2: ()
            // InternalKairosSystem.g:242:3: 
            {
            }

             after(grammarAccess.getKairosSystemAccess().getKairosSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__0__Impl"


    // $ANTLR start "rule__KairosSystem__Group__1"
    // InternalKairosSystem.g:250:1: rule__KairosSystem__Group__1 : rule__KairosSystem__Group__1__Impl rule__KairosSystem__Group__2 ;
    public final void rule__KairosSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:254:1: ( rule__KairosSystem__Group__1__Impl rule__KairosSystem__Group__2 )
            // InternalKairosSystem.g:255:2: rule__KairosSystem__Group__1__Impl rule__KairosSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__KairosSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KairosSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__1"


    // $ANTLR start "rule__KairosSystem__Group__1__Impl"
    // InternalKairosSystem.g:262:1: rule__KairosSystem__Group__1__Impl : ( 'KairosSystem' ) ;
    public final void rule__KairosSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:266:1: ( ( 'KairosSystem' ) )
            // InternalKairosSystem.g:267:1: ( 'KairosSystem' )
            {
            // InternalKairosSystem.g:267:1: ( 'KairosSystem' )
            // InternalKairosSystem.g:268:2: 'KairosSystem'
            {
             before(grammarAccess.getKairosSystemAccess().getKairosSystemKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getKairosSystemAccess().getKairosSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__1__Impl"


    // $ANTLR start "rule__KairosSystem__Group__2"
    // InternalKairosSystem.g:277:1: rule__KairosSystem__Group__2 : rule__KairosSystem__Group__2__Impl rule__KairosSystem__Group__3 ;
    public final void rule__KairosSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:281:1: ( rule__KairosSystem__Group__2__Impl rule__KairosSystem__Group__3 )
            // InternalKairosSystem.g:282:2: rule__KairosSystem__Group__2__Impl rule__KairosSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__KairosSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KairosSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__2"


    // $ANTLR start "rule__KairosSystem__Group__2__Impl"
    // InternalKairosSystem.g:289:1: rule__KairosSystem__Group__2__Impl : ( ( rule__KairosSystem__NameAssignment_2 ) ) ;
    public final void rule__KairosSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:293:1: ( ( ( rule__KairosSystem__NameAssignment_2 ) ) )
            // InternalKairosSystem.g:294:1: ( ( rule__KairosSystem__NameAssignment_2 ) )
            {
            // InternalKairosSystem.g:294:1: ( ( rule__KairosSystem__NameAssignment_2 ) )
            // InternalKairosSystem.g:295:2: ( rule__KairosSystem__NameAssignment_2 )
            {
             before(grammarAccess.getKairosSystemAccess().getNameAssignment_2()); 
            // InternalKairosSystem.g:296:2: ( rule__KairosSystem__NameAssignment_2 )
            // InternalKairosSystem.g:296:3: rule__KairosSystem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KairosSystem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKairosSystemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__2__Impl"


    // $ANTLR start "rule__KairosSystem__Group__3"
    // InternalKairosSystem.g:304:1: rule__KairosSystem__Group__3 : rule__KairosSystem__Group__3__Impl rule__KairosSystem__Group__4 ;
    public final void rule__KairosSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:308:1: ( rule__KairosSystem__Group__3__Impl rule__KairosSystem__Group__4 )
            // InternalKairosSystem.g:309:2: rule__KairosSystem__Group__3__Impl rule__KairosSystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__KairosSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KairosSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__3"


    // $ANTLR start "rule__KairosSystem__Group__3__Impl"
    // InternalKairosSystem.g:316:1: rule__KairosSystem__Group__3__Impl : ( ( rule__KairosSystem__OwnedActorsAssignment_3 )* ) ;
    public final void rule__KairosSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:320:1: ( ( ( rule__KairosSystem__OwnedActorsAssignment_3 )* ) )
            // InternalKairosSystem.g:321:1: ( ( rule__KairosSystem__OwnedActorsAssignment_3 )* )
            {
            // InternalKairosSystem.g:321:1: ( ( rule__KairosSystem__OwnedActorsAssignment_3 )* )
            // InternalKairosSystem.g:322:2: ( rule__KairosSystem__OwnedActorsAssignment_3 )*
            {
             before(grammarAccess.getKairosSystemAccess().getOwnedActorsAssignment_3()); 
            // InternalKairosSystem.g:323:2: ( rule__KairosSystem__OwnedActorsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKairosSystem.g:323:3: rule__KairosSystem__OwnedActorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__KairosSystem__OwnedActorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getKairosSystemAccess().getOwnedActorsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__3__Impl"


    // $ANTLR start "rule__KairosSystem__Group__4"
    // InternalKairosSystem.g:331:1: rule__KairosSystem__Group__4 : rule__KairosSystem__Group__4__Impl ;
    public final void rule__KairosSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:335:1: ( rule__KairosSystem__Group__4__Impl )
            // InternalKairosSystem.g:336:2: rule__KairosSystem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KairosSystem__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__4"


    // $ANTLR start "rule__KairosSystem__Group__4__Impl"
    // InternalKairosSystem.g:342:1: rule__KairosSystem__Group__4__Impl : ( ( rule__KairosSystem__OwnedConnectorsAssignment_4 )* ) ;
    public final void rule__KairosSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:346:1: ( ( ( rule__KairosSystem__OwnedConnectorsAssignment_4 )* ) )
            // InternalKairosSystem.g:347:1: ( ( rule__KairosSystem__OwnedConnectorsAssignment_4 )* )
            {
            // InternalKairosSystem.g:347:1: ( ( rule__KairosSystem__OwnedConnectorsAssignment_4 )* )
            // InternalKairosSystem.g:348:2: ( rule__KairosSystem__OwnedConnectorsAssignment_4 )*
            {
             before(grammarAccess.getKairosSystemAccess().getOwnedConnectorsAssignment_4()); 
            // InternalKairosSystem.g:349:2: ( rule__KairosSystem__OwnedConnectorsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKairosSystem.g:349:3: rule__KairosSystem__OwnedConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__KairosSystem__OwnedConnectorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getKairosSystemAccess().getOwnedConnectorsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalKairosSystem.g:358:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:362:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalKairosSystem.g:363:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalKairosSystem.g:370:1: rule__Actor__Group__0__Impl : ( () ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:374:1: ( ( () ) )
            // InternalKairosSystem.g:375:1: ( () )
            {
            // InternalKairosSystem.g:375:1: ( () )
            // InternalKairosSystem.g:376:2: ()
            {
             before(grammarAccess.getActorAccess().getActorAction_0()); 
            // InternalKairosSystem.g:377:2: ()
            // InternalKairosSystem.g:377:3: 
            {
            }

             after(grammarAccess.getActorAccess().getActorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalKairosSystem.g:385:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:389:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalKairosSystem.g:390:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalKairosSystem.g:397:1: rule__Actor__Group__1__Impl : ( 'Actor' ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:401:1: ( ( 'Actor' ) )
            // InternalKairosSystem.g:402:1: ( 'Actor' )
            {
            // InternalKairosSystem.g:402:1: ( 'Actor' )
            // InternalKairosSystem.g:403:2: 'Actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalKairosSystem.g:412:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:416:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalKairosSystem.g:417:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalKairosSystem.g:424:1: rule__Actor__Group__2__Impl : ( ':' ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:428:1: ( ( ':' ) )
            // InternalKairosSystem.g:429:1: ( ':' )
            {
            // InternalKairosSystem.g:429:1: ( ':' )
            // InternalKairosSystem.g:430:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalKairosSystem.g:439:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:443:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalKairosSystem.g:444:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Actor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalKairosSystem.g:451:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:455:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // InternalKairosSystem.g:456:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // InternalKairosSystem.g:456:1: ( ( rule__Actor__Group_3__0 )? )
            // InternalKairosSystem.g:457:2: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // InternalKairosSystem.g:458:2: ( rule__Actor__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKairosSystem.g:458:3: rule__Actor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Actor__Group__4"
    // InternalKairosSystem.g:466:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl rule__Actor__Group__5 ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:470:1: ( rule__Actor__Group__4__Impl rule__Actor__Group__5 )
            // InternalKairosSystem.g:471:2: rule__Actor__Group__4__Impl rule__Actor__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4"


    // $ANTLR start "rule__Actor__Group__4__Impl"
    // InternalKairosSystem.g:478:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__NameAssignment_4 ) ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:482:1: ( ( ( rule__Actor__NameAssignment_4 ) ) )
            // InternalKairosSystem.g:483:1: ( ( rule__Actor__NameAssignment_4 ) )
            {
            // InternalKairosSystem.g:483:1: ( ( rule__Actor__NameAssignment_4 ) )
            // InternalKairosSystem.g:484:2: ( rule__Actor__NameAssignment_4 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_4()); 
            // InternalKairosSystem.g:485:2: ( rule__Actor__NameAssignment_4 )
            // InternalKairosSystem.g:485:3: rule__Actor__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__5"
    // InternalKairosSystem.g:493:1: rule__Actor__Group__5 : rule__Actor__Group__5__Impl rule__Actor__Group__6 ;
    public final void rule__Actor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:497:1: ( rule__Actor__Group__5__Impl rule__Actor__Group__6 )
            // InternalKairosSystem.g:498:2: rule__Actor__Group__5__Impl rule__Actor__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__5"


    // $ANTLR start "rule__Actor__Group__5__Impl"
    // InternalKairosSystem.g:505:1: rule__Actor__Group__5__Impl : ( '{' ) ;
    public final void rule__Actor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:509:1: ( ( '{' ) )
            // InternalKairosSystem.g:510:1: ( '{' )
            {
            // InternalKairosSystem.g:510:1: ( '{' )
            // InternalKairosSystem.g:511:2: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__5__Impl"


    // $ANTLR start "rule__Actor__Group__6"
    // InternalKairosSystem.g:520:1: rule__Actor__Group__6 : rule__Actor__Group__6__Impl rule__Actor__Group__7 ;
    public final void rule__Actor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:524:1: ( rule__Actor__Group__6__Impl rule__Actor__Group__7 )
            // InternalKairosSystem.g:525:2: rule__Actor__Group__6__Impl rule__Actor__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__6"


    // $ANTLR start "rule__Actor__Group__6__Impl"
    // InternalKairosSystem.g:532:1: rule__Actor__Group__6__Impl : ( ( rule__Actor__OwnedInputPortsAssignment_6 )* ) ;
    public final void rule__Actor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:536:1: ( ( ( rule__Actor__OwnedInputPortsAssignment_6 )* ) )
            // InternalKairosSystem.g:537:1: ( ( rule__Actor__OwnedInputPortsAssignment_6 )* )
            {
            // InternalKairosSystem.g:537:1: ( ( rule__Actor__OwnedInputPortsAssignment_6 )* )
            // InternalKairosSystem.g:538:2: ( rule__Actor__OwnedInputPortsAssignment_6 )*
            {
             before(grammarAccess.getActorAccess().getOwnedInputPortsAssignment_6()); 
            // InternalKairosSystem.g:539:2: ( rule__Actor__OwnedInputPortsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKairosSystem.g:539:3: rule__Actor__OwnedInputPortsAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Actor__OwnedInputPortsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getOwnedInputPortsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__6__Impl"


    // $ANTLR start "rule__Actor__Group__7"
    // InternalKairosSystem.g:547:1: rule__Actor__Group__7 : rule__Actor__Group__7__Impl rule__Actor__Group__8 ;
    public final void rule__Actor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:551:1: ( rule__Actor__Group__7__Impl rule__Actor__Group__8 )
            // InternalKairosSystem.g:552:2: rule__Actor__Group__7__Impl rule__Actor__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__7"


    // $ANTLR start "rule__Actor__Group__7__Impl"
    // InternalKairosSystem.g:559:1: rule__Actor__Group__7__Impl : ( ( rule__Actor__OwnedOutputPortsAssignment_7 )* ) ;
    public final void rule__Actor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:563:1: ( ( ( rule__Actor__OwnedOutputPortsAssignment_7 )* ) )
            // InternalKairosSystem.g:564:1: ( ( rule__Actor__OwnedOutputPortsAssignment_7 )* )
            {
            // InternalKairosSystem.g:564:1: ( ( rule__Actor__OwnedOutputPortsAssignment_7 )* )
            // InternalKairosSystem.g:565:2: ( rule__Actor__OwnedOutputPortsAssignment_7 )*
            {
             before(grammarAccess.getActorAccess().getOwnedOutputPortsAssignment_7()); 
            // InternalKairosSystem.g:566:2: ( rule__Actor__OwnedOutputPortsAssignment_7 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKairosSystem.g:566:3: rule__Actor__OwnedOutputPortsAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Actor__OwnedOutputPortsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getOwnedOutputPortsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__7__Impl"


    // $ANTLR start "rule__Actor__Group__8"
    // InternalKairosSystem.g:574:1: rule__Actor__Group__8 : rule__Actor__Group__8__Impl ;
    public final void rule__Actor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:578:1: ( rule__Actor__Group__8__Impl )
            // InternalKairosSystem.g:579:2: rule__Actor__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__8"


    // $ANTLR start "rule__Actor__Group__8__Impl"
    // InternalKairosSystem.g:585:1: rule__Actor__Group__8__Impl : ( '}' ) ;
    public final void rule__Actor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:589:1: ( ( '}' ) )
            // InternalKairosSystem.g:590:1: ( '}' )
            {
            // InternalKairosSystem.g:590:1: ( '}' )
            // InternalKairosSystem.g:591:2: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__8__Impl"


    // $ANTLR start "rule__Actor__Group_3__0"
    // InternalKairosSystem.g:601:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:605:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // InternalKairosSystem.g:606:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Actor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_3__0"


    // $ANTLR start "rule__Actor__Group_3__0__Impl"
    // InternalKairosSystem.g:613:1: rule__Actor__Group_3__0__Impl : ( 'every' ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:617:1: ( ( 'every' ) )
            // InternalKairosSystem.g:618:1: ( 'every' )
            {
            // InternalKairosSystem.g:618:1: ( 'every' )
            // InternalKairosSystem.g:619:2: 'every'
            {
             before(grammarAccess.getActorAccess().getEveryKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getEveryKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_3__0__Impl"


    // $ANTLR start "rule__Actor__Group_3__1"
    // InternalKairosSystem.g:628:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:632:1: ( rule__Actor__Group_3__1__Impl )
            // InternalKairosSystem.g:633:2: rule__Actor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_3__1"


    // $ANTLR start "rule__Actor__Group_3__1__Impl"
    // InternalKairosSystem.g:639:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__PeriodAssignment_3_1 ) ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:643:1: ( ( ( rule__Actor__PeriodAssignment_3_1 ) ) )
            // InternalKairosSystem.g:644:1: ( ( rule__Actor__PeriodAssignment_3_1 ) )
            {
            // InternalKairosSystem.g:644:1: ( ( rule__Actor__PeriodAssignment_3_1 ) )
            // InternalKairosSystem.g:645:2: ( rule__Actor__PeriodAssignment_3_1 )
            {
             before(grammarAccess.getActorAccess().getPeriodAssignment_3_1()); 
            // InternalKairosSystem.g:646:2: ( rule__Actor__PeriodAssignment_3_1 )
            // InternalKairosSystem.g:646:3: rule__Actor__PeriodAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__PeriodAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getPeriodAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_3__1__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalKairosSystem.g:655:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:659:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalKairosSystem.g:660:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // InternalKairosSystem.g:667:1: rule__Connector__Group__0__Impl : ( 'Connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:671:1: ( ( 'Connector' ) )
            // InternalKairosSystem.g:672:1: ( 'Connector' )
            {
            // InternalKairosSystem.g:672:1: ( 'Connector' )
            // InternalKairosSystem.g:673:2: 'Connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // InternalKairosSystem.g:682:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:686:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalKairosSystem.g:687:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // InternalKairosSystem.g:694:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:698:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // InternalKairosSystem.g:699:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // InternalKairosSystem.g:699:1: ( ( rule__Connector__NameAssignment_1 ) )
            // InternalKairosSystem.g:700:2: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // InternalKairosSystem.g:701:2: ( rule__Connector__NameAssignment_1 )
            // InternalKairosSystem.g:701:3: rule__Connector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // InternalKairosSystem.g:709:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:713:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalKairosSystem.g:714:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // InternalKairosSystem.g:721:1: rule__Connector__Group__2__Impl : ( '(' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:725:1: ( ( '(' ) )
            // InternalKairosSystem.g:726:1: ( '(' )
            {
            // InternalKairosSystem.g:726:1: ( '(' )
            // InternalKairosSystem.g:727:2: '('
            {
             before(grammarAccess.getConnectorAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__3"
    // InternalKairosSystem.g:736:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:740:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalKairosSystem.g:741:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3"


    // $ANTLR start "rule__Connector__Group__3__Impl"
    // InternalKairosSystem.g:748:1: rule__Connector__Group__3__Impl : ( 'from' ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:752:1: ( ( 'from' ) )
            // InternalKairosSystem.g:753:1: ( 'from' )
            {
            // InternalKairosSystem.g:753:1: ( 'from' )
            // InternalKairosSystem.g:754:2: 'from'
            {
             before(grammarAccess.getConnectorAccess().getFromKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__4"
    // InternalKairosSystem.g:763:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl rule__Connector__Group__5 ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:767:1: ( rule__Connector__Group__4__Impl rule__Connector__Group__5 )
            // InternalKairosSystem.g:768:2: rule__Connector__Group__4__Impl rule__Connector__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Connector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4"


    // $ANTLR start "rule__Connector__Group__4__Impl"
    // InternalKairosSystem.g:775:1: rule__Connector__Group__4__Impl : ( ( rule__Connector__OutputportAssignment_4 ) ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:779:1: ( ( ( rule__Connector__OutputportAssignment_4 ) ) )
            // InternalKairosSystem.g:780:1: ( ( rule__Connector__OutputportAssignment_4 ) )
            {
            // InternalKairosSystem.g:780:1: ( ( rule__Connector__OutputportAssignment_4 ) )
            // InternalKairosSystem.g:781:2: ( rule__Connector__OutputportAssignment_4 )
            {
             before(grammarAccess.getConnectorAccess().getOutputportAssignment_4()); 
            // InternalKairosSystem.g:782:2: ( rule__Connector__OutputportAssignment_4 )
            // InternalKairosSystem.g:782:3: rule__Connector__OutputportAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Connector__OutputportAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getOutputportAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4__Impl"


    // $ANTLR start "rule__Connector__Group__5"
    // InternalKairosSystem.g:790:1: rule__Connector__Group__5 : rule__Connector__Group__5__Impl rule__Connector__Group__6 ;
    public final void rule__Connector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:794:1: ( rule__Connector__Group__5__Impl rule__Connector__Group__6 )
            // InternalKairosSystem.g:795:2: rule__Connector__Group__5__Impl rule__Connector__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Connector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__5"


    // $ANTLR start "rule__Connector__Group__5__Impl"
    // InternalKairosSystem.g:802:1: rule__Connector__Group__5__Impl : ( 'to' ) ;
    public final void rule__Connector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:806:1: ( ( 'to' ) )
            // InternalKairosSystem.g:807:1: ( 'to' )
            {
            // InternalKairosSystem.g:807:1: ( 'to' )
            // InternalKairosSystem.g:808:2: 'to'
            {
             before(grammarAccess.getConnectorAccess().getToKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__5__Impl"


    // $ANTLR start "rule__Connector__Group__6"
    // InternalKairosSystem.g:817:1: rule__Connector__Group__6 : rule__Connector__Group__6__Impl rule__Connector__Group__7 ;
    public final void rule__Connector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:821:1: ( rule__Connector__Group__6__Impl rule__Connector__Group__7 )
            // InternalKairosSystem.g:822:2: rule__Connector__Group__6__Impl rule__Connector__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Connector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__6"


    // $ANTLR start "rule__Connector__Group__6__Impl"
    // InternalKairosSystem.g:829:1: rule__Connector__Group__6__Impl : ( ( rule__Connector__InputportAssignment_6 ) ) ;
    public final void rule__Connector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:833:1: ( ( ( rule__Connector__InputportAssignment_6 ) ) )
            // InternalKairosSystem.g:834:1: ( ( rule__Connector__InputportAssignment_6 ) )
            {
            // InternalKairosSystem.g:834:1: ( ( rule__Connector__InputportAssignment_6 ) )
            // InternalKairosSystem.g:835:2: ( rule__Connector__InputportAssignment_6 )
            {
             before(grammarAccess.getConnectorAccess().getInputportAssignment_6()); 
            // InternalKairosSystem.g:836:2: ( rule__Connector__InputportAssignment_6 )
            // InternalKairosSystem.g:836:3: rule__Connector__InputportAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Connector__InputportAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getInputportAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__6__Impl"


    // $ANTLR start "rule__Connector__Group__7"
    // InternalKairosSystem.g:844:1: rule__Connector__Group__7 : rule__Connector__Group__7__Impl ;
    public final void rule__Connector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:848:1: ( rule__Connector__Group__7__Impl )
            // InternalKairosSystem.g:849:2: rule__Connector__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__7"


    // $ANTLR start "rule__Connector__Group__7__Impl"
    // InternalKairosSystem.g:855:1: rule__Connector__Group__7__Impl : ( ')' ) ;
    public final void rule__Connector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:859:1: ( ( ')' ) )
            // InternalKairosSystem.g:860:1: ( ')' )
            {
            // InternalKairosSystem.g:860:1: ( ')' )
            // InternalKairosSystem.g:861:2: ')'
            {
             before(grammarAccess.getConnectorAccess().getRightParenthesisKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__7__Impl"


    // $ANTLR start "rule__InputPort__Group__0"
    // InternalKairosSystem.g:871:1: rule__InputPort__Group__0 : rule__InputPort__Group__0__Impl rule__InputPort__Group__1 ;
    public final void rule__InputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:875:1: ( rule__InputPort__Group__0__Impl rule__InputPort__Group__1 )
            // InternalKairosSystem.g:876:2: rule__InputPort__Group__0__Impl rule__InputPort__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__InputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__0"


    // $ANTLR start "rule__InputPort__Group__0__Impl"
    // InternalKairosSystem.g:883:1: rule__InputPort__Group__0__Impl : ( () ) ;
    public final void rule__InputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:887:1: ( ( () ) )
            // InternalKairosSystem.g:888:1: ( () )
            {
            // InternalKairosSystem.g:888:1: ( () )
            // InternalKairosSystem.g:889:2: ()
            {
             before(grammarAccess.getInputPortAccess().getInputPortAction_0()); 
            // InternalKairosSystem.g:890:2: ()
            // InternalKairosSystem.g:890:3: 
            {
            }

             after(grammarAccess.getInputPortAccess().getInputPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__0__Impl"


    // $ANTLR start "rule__InputPort__Group__1"
    // InternalKairosSystem.g:898:1: rule__InputPort__Group__1 : rule__InputPort__Group__1__Impl rule__InputPort__Group__2 ;
    public final void rule__InputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:902:1: ( rule__InputPort__Group__1__Impl rule__InputPort__Group__2 )
            // InternalKairosSystem.g:903:2: rule__InputPort__Group__1__Impl rule__InputPort__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__InputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__1"


    // $ANTLR start "rule__InputPort__Group__1__Impl"
    // InternalKairosSystem.g:910:1: rule__InputPort__Group__1__Impl : ( 'In' ) ;
    public final void rule__InputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:914:1: ( ( 'In' ) )
            // InternalKairosSystem.g:915:1: ( 'In' )
            {
            // InternalKairosSystem.g:915:1: ( 'In' )
            // InternalKairosSystem.g:916:2: 'In'
            {
             before(grammarAccess.getInputPortAccess().getInKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__1__Impl"


    // $ANTLR start "rule__InputPort__Group__2"
    // InternalKairosSystem.g:925:1: rule__InputPort__Group__2 : rule__InputPort__Group__2__Impl rule__InputPort__Group__3 ;
    public final void rule__InputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:929:1: ( rule__InputPort__Group__2__Impl rule__InputPort__Group__3 )
            // InternalKairosSystem.g:930:2: rule__InputPort__Group__2__Impl rule__InputPort__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__InputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__2"


    // $ANTLR start "rule__InputPort__Group__2__Impl"
    // InternalKairosSystem.g:937:1: rule__InputPort__Group__2__Impl : ( 'Port' ) ;
    public final void rule__InputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:941:1: ( ( 'Port' ) )
            // InternalKairosSystem.g:942:1: ( 'Port' )
            {
            // InternalKairosSystem.g:942:1: ( 'Port' )
            // InternalKairosSystem.g:943:2: 'Port'
            {
             before(grammarAccess.getInputPortAccess().getPortKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getPortKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__2__Impl"


    // $ANTLR start "rule__InputPort__Group__3"
    // InternalKairosSystem.g:952:1: rule__InputPort__Group__3 : rule__InputPort__Group__3__Impl rule__InputPort__Group__4 ;
    public final void rule__InputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:956:1: ( rule__InputPort__Group__3__Impl rule__InputPort__Group__4 )
            // InternalKairosSystem.g:957:2: rule__InputPort__Group__3__Impl rule__InputPort__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__InputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__3"


    // $ANTLR start "rule__InputPort__Group__3__Impl"
    // InternalKairosSystem.g:964:1: rule__InputPort__Group__3__Impl : ( ( rule__InputPort__NameAssignment_3 ) ) ;
    public final void rule__InputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:968:1: ( ( ( rule__InputPort__NameAssignment_3 ) ) )
            // InternalKairosSystem.g:969:1: ( ( rule__InputPort__NameAssignment_3 ) )
            {
            // InternalKairosSystem.g:969:1: ( ( rule__InputPort__NameAssignment_3 ) )
            // InternalKairosSystem.g:970:2: ( rule__InputPort__NameAssignment_3 )
            {
             before(grammarAccess.getInputPortAccess().getNameAssignment_3()); 
            // InternalKairosSystem.g:971:2: ( rule__InputPort__NameAssignment_3 )
            // InternalKairosSystem.g:971:3: rule__InputPort__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__3__Impl"


    // $ANTLR start "rule__InputPort__Group__4"
    // InternalKairosSystem.g:979:1: rule__InputPort__Group__4 : rule__InputPort__Group__4__Impl rule__InputPort__Group__5 ;
    public final void rule__InputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:983:1: ( rule__InputPort__Group__4__Impl rule__InputPort__Group__5 )
            // InternalKairosSystem.g:984:2: rule__InputPort__Group__4__Impl rule__InputPort__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__InputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__4"


    // $ANTLR start "rule__InputPort__Group__4__Impl"
    // InternalKairosSystem.g:991:1: rule__InputPort__Group__4__Impl : ( '{' ) ;
    public final void rule__InputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:995:1: ( ( '{' ) )
            // InternalKairosSystem.g:996:1: ( '{' )
            {
            // InternalKairosSystem.g:996:1: ( '{' )
            // InternalKairosSystem.g:997:2: '{'
            {
             before(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__4__Impl"


    // $ANTLR start "rule__InputPort__Group__5"
    // InternalKairosSystem.g:1006:1: rule__InputPort__Group__5 : rule__InputPort__Group__5__Impl rule__InputPort__Group__6 ;
    public final void rule__InputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1010:1: ( rule__InputPort__Group__5__Impl rule__InputPort__Group__6 )
            // InternalKairosSystem.g:1011:2: rule__InputPort__Group__5__Impl rule__InputPort__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__InputPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__5"


    // $ANTLR start "rule__InputPort__Group__5__Impl"
    // InternalKairosSystem.g:1018:1: rule__InputPort__Group__5__Impl : ( ( rule__InputPort__Group_5__0 )? ) ;
    public final void rule__InputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1022:1: ( ( ( rule__InputPort__Group_5__0 )? ) )
            // InternalKairosSystem.g:1023:1: ( ( rule__InputPort__Group_5__0 )? )
            {
            // InternalKairosSystem.g:1023:1: ( ( rule__InputPort__Group_5__0 )? )
            // InternalKairosSystem.g:1024:2: ( rule__InputPort__Group_5__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_5()); 
            // InternalKairosSystem.g:1025:2: ( rule__InputPort__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKairosSystem.g:1025:3: rule__InputPort__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputPort__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputPortAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__5__Impl"


    // $ANTLR start "rule__InputPort__Group__6"
    // InternalKairosSystem.g:1033:1: rule__InputPort__Group__6 : rule__InputPort__Group__6__Impl ;
    public final void rule__InputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1037:1: ( rule__InputPort__Group__6__Impl )
            // InternalKairosSystem.g:1038:2: rule__InputPort__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__6"


    // $ANTLR start "rule__InputPort__Group__6__Impl"
    // InternalKairosSystem.g:1044:1: rule__InputPort__Group__6__Impl : ( '}' ) ;
    public final void rule__InputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1048:1: ( ( '}' ) )
            // InternalKairosSystem.g:1049:1: ( '}' )
            {
            // InternalKairosSystem.g:1049:1: ( '}' )
            // InternalKairosSystem.g:1050:2: '}'
            {
             before(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__6__Impl"


    // $ANTLR start "rule__InputPort__Group_5__0"
    // InternalKairosSystem.g:1060:1: rule__InputPort__Group_5__0 : rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 ;
    public final void rule__InputPort__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1064:1: ( rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 )
            // InternalKairosSystem.g:1065:2: rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__InputPort__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__0"


    // $ANTLR start "rule__InputPort__Group_5__0__Impl"
    // InternalKairosSystem.g:1072:1: rule__InputPort__Group_5__0__Impl : ( 'connector' ) ;
    public final void rule__InputPort__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1076:1: ( ( 'connector' ) )
            // InternalKairosSystem.g:1077:1: ( 'connector' )
            {
            // InternalKairosSystem.g:1077:1: ( 'connector' )
            // InternalKairosSystem.g:1078:2: 'connector'
            {
             before(grammarAccess.getInputPortAccess().getConnectorKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getConnectorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__0__Impl"


    // $ANTLR start "rule__InputPort__Group_5__1"
    // InternalKairosSystem.g:1087:1: rule__InputPort__Group_5__1 : rule__InputPort__Group_5__1__Impl ;
    public final void rule__InputPort__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1091:1: ( rule__InputPort__Group_5__1__Impl )
            // InternalKairosSystem.g:1092:2: rule__InputPort__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__1"


    // $ANTLR start "rule__InputPort__Group_5__1__Impl"
    // InternalKairosSystem.g:1098:1: rule__InputPort__Group_5__1__Impl : ( ( rule__InputPort__ConnectorAssignment_5_1 ) ) ;
    public final void rule__InputPort__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1102:1: ( ( ( rule__InputPort__ConnectorAssignment_5_1 ) ) )
            // InternalKairosSystem.g:1103:1: ( ( rule__InputPort__ConnectorAssignment_5_1 ) )
            {
            // InternalKairosSystem.g:1103:1: ( ( rule__InputPort__ConnectorAssignment_5_1 ) )
            // InternalKairosSystem.g:1104:2: ( rule__InputPort__ConnectorAssignment_5_1 )
            {
             before(grammarAccess.getInputPortAccess().getConnectorAssignment_5_1()); 
            // InternalKairosSystem.g:1105:2: ( rule__InputPort__ConnectorAssignment_5_1 )
            // InternalKairosSystem.g:1105:3: rule__InputPort__ConnectorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__ConnectorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getConnectorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__1__Impl"


    // $ANTLR start "rule__OutputPort__Group__0"
    // InternalKairosSystem.g:1114:1: rule__OutputPort__Group__0 : rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 ;
    public final void rule__OutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1118:1: ( rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 )
            // InternalKairosSystem.g:1119:2: rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__OutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__0"


    // $ANTLR start "rule__OutputPort__Group__0__Impl"
    // InternalKairosSystem.g:1126:1: rule__OutputPort__Group__0__Impl : ( () ) ;
    public final void rule__OutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1130:1: ( ( () ) )
            // InternalKairosSystem.g:1131:1: ( () )
            {
            // InternalKairosSystem.g:1131:1: ( () )
            // InternalKairosSystem.g:1132:2: ()
            {
             before(grammarAccess.getOutputPortAccess().getOutputPortAction_0()); 
            // InternalKairosSystem.g:1133:2: ()
            // InternalKairosSystem.g:1133:3: 
            {
            }

             after(grammarAccess.getOutputPortAccess().getOutputPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__0__Impl"


    // $ANTLR start "rule__OutputPort__Group__1"
    // InternalKairosSystem.g:1141:1: rule__OutputPort__Group__1 : rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 ;
    public final void rule__OutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1145:1: ( rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 )
            // InternalKairosSystem.g:1146:2: rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__OutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__1"


    // $ANTLR start "rule__OutputPort__Group__1__Impl"
    // InternalKairosSystem.g:1153:1: rule__OutputPort__Group__1__Impl : ( 'Out' ) ;
    public final void rule__OutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1157:1: ( ( 'Out' ) )
            // InternalKairosSystem.g:1158:1: ( 'Out' )
            {
            // InternalKairosSystem.g:1158:1: ( 'Out' )
            // InternalKairosSystem.g:1159:2: 'Out'
            {
             before(grammarAccess.getOutputPortAccess().getOutKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getOutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__1__Impl"


    // $ANTLR start "rule__OutputPort__Group__2"
    // InternalKairosSystem.g:1168:1: rule__OutputPort__Group__2 : rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 ;
    public final void rule__OutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1172:1: ( rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 )
            // InternalKairosSystem.g:1173:2: rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OutputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__2"


    // $ANTLR start "rule__OutputPort__Group__2__Impl"
    // InternalKairosSystem.g:1180:1: rule__OutputPort__Group__2__Impl : ( 'Port' ) ;
    public final void rule__OutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1184:1: ( ( 'Port' ) )
            // InternalKairosSystem.g:1185:1: ( 'Port' )
            {
            // InternalKairosSystem.g:1185:1: ( 'Port' )
            // InternalKairosSystem.g:1186:2: 'Port'
            {
             before(grammarAccess.getOutputPortAccess().getPortKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getPortKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__2__Impl"


    // $ANTLR start "rule__OutputPort__Group__3"
    // InternalKairosSystem.g:1195:1: rule__OutputPort__Group__3 : rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 ;
    public final void rule__OutputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1199:1: ( rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 )
            // InternalKairosSystem.g:1200:2: rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__OutputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__3"


    // $ANTLR start "rule__OutputPort__Group__3__Impl"
    // InternalKairosSystem.g:1207:1: rule__OutputPort__Group__3__Impl : ( ( rule__OutputPort__NameAssignment_3 ) ) ;
    public final void rule__OutputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1211:1: ( ( ( rule__OutputPort__NameAssignment_3 ) ) )
            // InternalKairosSystem.g:1212:1: ( ( rule__OutputPort__NameAssignment_3 ) )
            {
            // InternalKairosSystem.g:1212:1: ( ( rule__OutputPort__NameAssignment_3 ) )
            // InternalKairosSystem.g:1213:2: ( rule__OutputPort__NameAssignment_3 )
            {
             before(grammarAccess.getOutputPortAccess().getNameAssignment_3()); 
            // InternalKairosSystem.g:1214:2: ( rule__OutputPort__NameAssignment_3 )
            // InternalKairosSystem.g:1214:3: rule__OutputPort__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__3__Impl"


    // $ANTLR start "rule__OutputPort__Group__4"
    // InternalKairosSystem.g:1222:1: rule__OutputPort__Group__4 : rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 ;
    public final void rule__OutputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1226:1: ( rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 )
            // InternalKairosSystem.g:1227:2: rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__OutputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__4"


    // $ANTLR start "rule__OutputPort__Group__4__Impl"
    // InternalKairosSystem.g:1234:1: rule__OutputPort__Group__4__Impl : ( '{' ) ;
    public final void rule__OutputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1238:1: ( ( '{' ) )
            // InternalKairosSystem.g:1239:1: ( '{' )
            {
            // InternalKairosSystem.g:1239:1: ( '{' )
            // InternalKairosSystem.g:1240:2: '{'
            {
             before(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__4__Impl"


    // $ANTLR start "rule__OutputPort__Group__5"
    // InternalKairosSystem.g:1249:1: rule__OutputPort__Group__5 : rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6 ;
    public final void rule__OutputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1253:1: ( rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6 )
            // InternalKairosSystem.g:1254:2: rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__OutputPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__5"


    // $ANTLR start "rule__OutputPort__Group__5__Impl"
    // InternalKairosSystem.g:1261:1: rule__OutputPort__Group__5__Impl : ( ( rule__OutputPort__Group_5__0 )? ) ;
    public final void rule__OutputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1265:1: ( ( ( rule__OutputPort__Group_5__0 )? ) )
            // InternalKairosSystem.g:1266:1: ( ( rule__OutputPort__Group_5__0 )? )
            {
            // InternalKairosSystem.g:1266:1: ( ( rule__OutputPort__Group_5__0 )? )
            // InternalKairosSystem.g:1267:2: ( rule__OutputPort__Group_5__0 )?
            {
             before(grammarAccess.getOutputPortAccess().getGroup_5()); 
            // InternalKairosSystem.g:1268:2: ( rule__OutputPort__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKairosSystem.g:1268:3: rule__OutputPort__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputPort__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputPortAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__5__Impl"


    // $ANTLR start "rule__OutputPort__Group__6"
    // InternalKairosSystem.g:1276:1: rule__OutputPort__Group__6 : rule__OutputPort__Group__6__Impl ;
    public final void rule__OutputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1280:1: ( rule__OutputPort__Group__6__Impl )
            // InternalKairosSystem.g:1281:2: rule__OutputPort__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__6"


    // $ANTLR start "rule__OutputPort__Group__6__Impl"
    // InternalKairosSystem.g:1287:1: rule__OutputPort__Group__6__Impl : ( '}' ) ;
    public final void rule__OutputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1291:1: ( ( '}' ) )
            // InternalKairosSystem.g:1292:1: ( '}' )
            {
            // InternalKairosSystem.g:1292:1: ( '}' )
            // InternalKairosSystem.g:1293:2: '}'
            {
             before(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__6__Impl"


    // $ANTLR start "rule__OutputPort__Group_5__0"
    // InternalKairosSystem.g:1303:1: rule__OutputPort__Group_5__0 : rule__OutputPort__Group_5__0__Impl rule__OutputPort__Group_5__1 ;
    public final void rule__OutputPort__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1307:1: ( rule__OutputPort__Group_5__0__Impl rule__OutputPort__Group_5__1 )
            // InternalKairosSystem.g:1308:2: rule__OutputPort__Group_5__0__Impl rule__OutputPort__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__OutputPort__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__0"


    // $ANTLR start "rule__OutputPort__Group_5__0__Impl"
    // InternalKairosSystem.g:1315:1: rule__OutputPort__Group_5__0__Impl : ( 'connector' ) ;
    public final void rule__OutputPort__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1319:1: ( ( 'connector' ) )
            // InternalKairosSystem.g:1320:1: ( 'connector' )
            {
            // InternalKairosSystem.g:1320:1: ( 'connector' )
            // InternalKairosSystem.g:1321:2: 'connector'
            {
             before(grammarAccess.getOutputPortAccess().getConnectorKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getConnectorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__0__Impl"


    // $ANTLR start "rule__OutputPort__Group_5__1"
    // InternalKairosSystem.g:1330:1: rule__OutputPort__Group_5__1 : rule__OutputPort__Group_5__1__Impl ;
    public final void rule__OutputPort__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1334:1: ( rule__OutputPort__Group_5__1__Impl )
            // InternalKairosSystem.g:1335:2: rule__OutputPort__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__1"


    // $ANTLR start "rule__OutputPort__Group_5__1__Impl"
    // InternalKairosSystem.g:1341:1: rule__OutputPort__Group_5__1__Impl : ( ( rule__OutputPort__ConnectorAssignment_5_1 ) ) ;
    public final void rule__OutputPort__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1345:1: ( ( ( rule__OutputPort__ConnectorAssignment_5_1 ) ) )
            // InternalKairosSystem.g:1346:1: ( ( rule__OutputPort__ConnectorAssignment_5_1 ) )
            {
            // InternalKairosSystem.g:1346:1: ( ( rule__OutputPort__ConnectorAssignment_5_1 ) )
            // InternalKairosSystem.g:1347:2: ( rule__OutputPort__ConnectorAssignment_5_1 )
            {
             before(grammarAccess.getOutputPortAccess().getConnectorAssignment_5_1()); 
            // InternalKairosSystem.g:1348:2: ( rule__OutputPort__ConnectorAssignment_5_1 )
            // InternalKairosSystem.g:1348:3: rule__OutputPort__ConnectorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__ConnectorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getConnectorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__1__Impl"


    // $ANTLR start "rule__KairosSystem__NameAssignment_2"
    // InternalKairosSystem.g:1357:1: rule__KairosSystem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__KairosSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1361:1: ( ( ruleEString ) )
            // InternalKairosSystem.g:1362:2: ( ruleEString )
            {
            // InternalKairosSystem.g:1362:2: ( ruleEString )
            // InternalKairosSystem.g:1363:3: ruleEString
            {
             before(grammarAccess.getKairosSystemAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKairosSystemAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__NameAssignment_2"


    // $ANTLR start "rule__KairosSystem__OwnedActorsAssignment_3"
    // InternalKairosSystem.g:1372:1: rule__KairosSystem__OwnedActorsAssignment_3 : ( ruleActor ) ;
    public final void rule__KairosSystem__OwnedActorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1376:1: ( ( ruleActor ) )
            // InternalKairosSystem.g:1377:2: ( ruleActor )
            {
            // InternalKairosSystem.g:1377:2: ( ruleActor )
            // InternalKairosSystem.g:1378:3: ruleActor
            {
             before(grammarAccess.getKairosSystemAccess().getOwnedActorsActorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getKairosSystemAccess().getOwnedActorsActorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__OwnedActorsAssignment_3"


    // $ANTLR start "rule__KairosSystem__OwnedConnectorsAssignment_4"
    // InternalKairosSystem.g:1387:1: rule__KairosSystem__OwnedConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__KairosSystem__OwnedConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1391:1: ( ( ruleConnector ) )
            // InternalKairosSystem.g:1392:2: ( ruleConnector )
            {
            // InternalKairosSystem.g:1392:2: ( ruleConnector )
            // InternalKairosSystem.g:1393:3: ruleConnector
            {
             before(grammarAccess.getKairosSystemAccess().getOwnedConnectorsConnectorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getKairosSystemAccess().getOwnedConnectorsConnectorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KairosSystem__OwnedConnectorsAssignment_4"


    // $ANTLR start "rule__Actor__PeriodAssignment_3_1"
    // InternalKairosSystem.g:1402:1: rule__Actor__PeriodAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Actor__PeriodAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1406:1: ( ( RULE_INT ) )
            // InternalKairosSystem.g:1407:2: ( RULE_INT )
            {
            // InternalKairosSystem.g:1407:2: ( RULE_INT )
            // InternalKairosSystem.g:1408:3: RULE_INT
            {
             before(grammarAccess.getActorAccess().getPeriodINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getPeriodINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__PeriodAssignment_3_1"


    // $ANTLR start "rule__Actor__NameAssignment_4"
    // InternalKairosSystem.g:1417:1: rule__Actor__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Actor__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1421:1: ( ( ruleEString ) )
            // InternalKairosSystem.g:1422:2: ( ruleEString )
            {
            // InternalKairosSystem.g:1422:2: ( ruleEString )
            // InternalKairosSystem.g:1423:3: ruleEString
            {
             before(grammarAccess.getActorAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActorAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_4"


    // $ANTLR start "rule__Actor__OwnedInputPortsAssignment_6"
    // InternalKairosSystem.g:1432:1: rule__Actor__OwnedInputPortsAssignment_6 : ( ruleInputPort ) ;
    public final void rule__Actor__OwnedInputPortsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1436:1: ( ( ruleInputPort ) )
            // InternalKairosSystem.g:1437:2: ( ruleInputPort )
            {
            // InternalKairosSystem.g:1437:2: ( ruleInputPort )
            // InternalKairosSystem.g:1438:3: ruleInputPort
            {
             before(grammarAccess.getActorAccess().getOwnedInputPortsInputPortParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getActorAccess().getOwnedInputPortsInputPortParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__OwnedInputPortsAssignment_6"


    // $ANTLR start "rule__Actor__OwnedOutputPortsAssignment_7"
    // InternalKairosSystem.g:1447:1: rule__Actor__OwnedOutputPortsAssignment_7 : ( ruleOutputPort ) ;
    public final void rule__Actor__OwnedOutputPortsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1451:1: ( ( ruleOutputPort ) )
            // InternalKairosSystem.g:1452:2: ( ruleOutputPort )
            {
            // InternalKairosSystem.g:1452:2: ( ruleOutputPort )
            // InternalKairosSystem.g:1453:3: ruleOutputPort
            {
             before(grammarAccess.getActorAccess().getOwnedOutputPortsOutputPortParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getActorAccess().getOwnedOutputPortsOutputPortParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__OwnedOutputPortsAssignment_7"


    // $ANTLR start "rule__Connector__NameAssignment_1"
    // InternalKairosSystem.g:1462:1: rule__Connector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1466:1: ( ( ruleEString ) )
            // InternalKairosSystem.g:1467:2: ( ruleEString )
            {
            // InternalKairosSystem.g:1467:2: ( ruleEString )
            // InternalKairosSystem.g:1468:3: ruleEString
            {
             before(grammarAccess.getConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__NameAssignment_1"


    // $ANTLR start "rule__Connector__OutputportAssignment_4"
    // InternalKairosSystem.g:1477:1: rule__Connector__OutputportAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Connector__OutputportAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1481:1: ( ( ( ruleEString ) ) )
            // InternalKairosSystem.g:1482:2: ( ( ruleEString ) )
            {
            // InternalKairosSystem.g:1482:2: ( ( ruleEString ) )
            // InternalKairosSystem.g:1483:3: ( ruleEString )
            {
             before(grammarAccess.getConnectorAccess().getOutputportOutputPortCrossReference_4_0()); 
            // InternalKairosSystem.g:1484:3: ( ruleEString )
            // InternalKairosSystem.g:1485:4: ruleEString
            {
             before(grammarAccess.getConnectorAccess().getOutputportOutputPortEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getOutputportOutputPortEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConnectorAccess().getOutputportOutputPortCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__OutputportAssignment_4"


    // $ANTLR start "rule__Connector__InputportAssignment_6"
    // InternalKairosSystem.g:1496:1: rule__Connector__InputportAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Connector__InputportAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1500:1: ( ( ( ruleEString ) ) )
            // InternalKairosSystem.g:1501:2: ( ( ruleEString ) )
            {
            // InternalKairosSystem.g:1501:2: ( ( ruleEString ) )
            // InternalKairosSystem.g:1502:3: ( ruleEString )
            {
             before(grammarAccess.getConnectorAccess().getInputportInputPortCrossReference_6_0()); 
            // InternalKairosSystem.g:1503:3: ( ruleEString )
            // InternalKairosSystem.g:1504:4: ruleEString
            {
             before(grammarAccess.getConnectorAccess().getInputportInputPortEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getInputportInputPortEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getConnectorAccess().getInputportInputPortCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__InputportAssignment_6"


    // $ANTLR start "rule__InputPort__NameAssignment_3"
    // InternalKairosSystem.g:1515:1: rule__InputPort__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__InputPort__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1519:1: ( ( ruleEString ) )
            // InternalKairosSystem.g:1520:2: ( ruleEString )
            {
            // InternalKairosSystem.g:1520:2: ( ruleEString )
            // InternalKairosSystem.g:1521:3: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__NameAssignment_3"


    // $ANTLR start "rule__InputPort__ConnectorAssignment_5_1"
    // InternalKairosSystem.g:1530:1: rule__InputPort__ConnectorAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__InputPort__ConnectorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1534:1: ( ( ( ruleEString ) ) )
            // InternalKairosSystem.g:1535:2: ( ( ruleEString ) )
            {
            // InternalKairosSystem.g:1535:2: ( ( ruleEString ) )
            // InternalKairosSystem.g:1536:3: ( ruleEString )
            {
             before(grammarAccess.getInputPortAccess().getConnectorConnectorCrossReference_5_1_0()); 
            // InternalKairosSystem.g:1537:3: ( ruleEString )
            // InternalKairosSystem.g:1538:4: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getConnectorConnectorEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getConnectorConnectorEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getInputPortAccess().getConnectorConnectorCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__ConnectorAssignment_5_1"


    // $ANTLR start "rule__OutputPort__NameAssignment_3"
    // InternalKairosSystem.g:1549:1: rule__OutputPort__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OutputPort__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1553:1: ( ( ruleEString ) )
            // InternalKairosSystem.g:1554:2: ( ruleEString )
            {
            // InternalKairosSystem.g:1554:2: ( ruleEString )
            // InternalKairosSystem.g:1555:3: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__NameAssignment_3"


    // $ANTLR start "rule__OutputPort__ConnectorAssignment_5_1"
    // InternalKairosSystem.g:1564:1: rule__OutputPort__ConnectorAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__OutputPort__ConnectorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKairosSystem.g:1568:1: ( ( ( ruleEString ) ) )
            // InternalKairosSystem.g:1569:2: ( ( ruleEString ) )
            {
            // InternalKairosSystem.g:1569:2: ( ( ruleEString ) )
            // InternalKairosSystem.g:1570:3: ( ruleEString )
            {
             before(grammarAccess.getOutputPortAccess().getConnectorConnectorCrossReference_5_1_0()); 
            // InternalKairosSystem.g:1571:3: ( ruleEString )
            // InternalKairosSystem.g:1572:4: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getConnectorConnectorEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getConnectorConnectorEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getOutputPortAccess().getConnectorConnectorCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__ConnectorAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002408000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});

}