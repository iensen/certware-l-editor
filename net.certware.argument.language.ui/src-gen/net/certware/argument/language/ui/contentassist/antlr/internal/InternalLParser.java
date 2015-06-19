package net.certware.argument.language.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import net.certware.argument.language.services.LGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UID", "RULE_INT", "RULE_LID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'%'", "'\\\\'", "'set'", "'range'", "'set_constr'", "'every'", "'some'", "'>'", "'<'", "'>='", "'<='", "'='", "'!='", "'('", "')'", "','", "'.'", "'in'", "'or'", "'and'", "'not'", "'maybe'", "'|'", "'{'", "'}'", "'if'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int RULE_UID=5;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_LID=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLParser.tokenNames; }
    public String getGrammarFileName() { return "../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g"; }


     
     	private LGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProgram"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:61:1: ( ruleProgram EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:69:1: ruleProgram : ( ( rule__Program__StatementsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:73:2: ( ( ( rule__Program__StatementsAssignment )* ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:74:1: ( ( rule__Program__StatementsAssignment )* )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:74:1: ( ( rule__Program__StatementsAssignment )* )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:75:1: ( rule__Program__StatementsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:76:1: ( rule__Program__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=RULE_INT && LA1_0<=RULE_LID)||LA1_0==30||LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:76:2: rule__Program__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram94);
            	    rule__Program__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleBasicTerm"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:88:1: entryRuleBasicTerm : ruleBasicTerm EOF ;
    public final void entryRuleBasicTerm() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:89:1: ( ruleBasicTerm EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:90:1: ruleBasicTerm EOF
            {
             before(grammarAccess.getBasicTermRule()); 
            pushFollow(FOLLOW_ruleBasicTerm_in_entryRuleBasicTerm122);
            ruleBasicTerm();

            state._fsp--;

             after(grammarAccess.getBasicTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicTerm129); 

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
    // $ANTLR end "entryRuleBasicTerm"


    // $ANTLR start "ruleBasicTerm"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:97:1: ruleBasicTerm : ( ( rule__BasicTerm__Alternatives ) ) ;
    public final void ruleBasicTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:101:2: ( ( ( rule__BasicTerm__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:102:1: ( ( rule__BasicTerm__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:102:1: ( ( rule__BasicTerm__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:103:1: ( rule__BasicTerm__Alternatives )
            {
             before(grammarAccess.getBasicTermAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:104:1: ( rule__BasicTerm__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:104:2: rule__BasicTerm__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicTerm__Alternatives_in_ruleBasicTerm155);
            rule__BasicTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTermAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBasicTerm"


    // $ANTLR start "entryRuleVariable"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:118:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:119:1: ( ruleVariable EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:120:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable184);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable191); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:127:1: ruleVariable : ( ( rule__Variable__IdentifierAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:131:2: ( ( ( rule__Variable__IdentifierAssignment ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:132:1: ( ( rule__Variable__IdentifierAssignment ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:132:1: ( ( rule__Variable__IdentifierAssignment ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:133:1: ( rule__Variable__IdentifierAssignment )
            {
             before(grammarAccess.getVariableAccess().getIdentifierAssignment()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:134:1: ( rule__Variable__IdentifierAssignment )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:134:2: rule__Variable__IdentifierAssignment
            {
            pushFollow(FOLLOW_rule__Variable__IdentifierAssignment_in_ruleVariable217);
            rule__Variable__IdentifierAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getIdentifierAssignment()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTypedVariable"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:146:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:147:1: ( ruleTypedVariable EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:148:1: ruleTypedVariable EOF
            {
             before(grammarAccess.getTypedVariableRule()); 
            pushFollow(FOLLOW_ruleTypedVariable_in_entryRuleTypedVariable244);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getTypedVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedVariable251); 

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
    // $ANTLR end "entryRuleTypedVariable"


    // $ANTLR start "ruleTypedVariable"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:155:1: ruleTypedVariable : ( ( rule__TypedVariable__Group__0 ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:159:2: ( ( ( rule__TypedVariable__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:160:1: ( ( rule__TypedVariable__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:160:1: ( ( rule__TypedVariable__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:161:1: ( rule__TypedVariable__Group__0 )
            {
             before(grammarAccess.getTypedVariableAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:162:1: ( rule__TypedVariable__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:162:2: rule__TypedVariable__Group__0
            {
            pushFollow(FOLLOW_rule__TypedVariable__Group__0_in_ruleTypedVariable277);
            rule__TypedVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleTypedVariable"


    // $ANTLR start "entryRuleArithmeticTerm"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:174:1: entryRuleArithmeticTerm : ruleArithmeticTerm EOF ;
    public final void entryRuleArithmeticTerm() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:175:1: ( ruleArithmeticTerm EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:176:1: ruleArithmeticTerm EOF
            {
             before(grammarAccess.getArithmeticTermRule()); 
            pushFollow(FOLLOW_ruleArithmeticTerm_in_entryRuleArithmeticTerm304);
            ruleArithmeticTerm();

            state._fsp--;

             after(grammarAccess.getArithmeticTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticTerm311); 

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
    // $ANTLR end "entryRuleArithmeticTerm"


    // $ANTLR start "ruleArithmeticTerm"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:183:1: ruleArithmeticTerm : ( ruleAddition ) ;
    public final void ruleArithmeticTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:187:2: ( ( ruleAddition ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:188:1: ( ruleAddition )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:188:1: ( ruleAddition )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:189:1: ruleAddition
            {
             before(grammarAccess.getArithmeticTermAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_ruleAddition_in_ruleArithmeticTerm337);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getArithmeticTermAccess().getAdditionParserRuleCall()); 

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
    // $ANTLR end "ruleArithmeticTerm"


    // $ANTLR start "entryRuleAddition"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:202:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:203:1: ( ruleAddition EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:204:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition363);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition370); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:211:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:215:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:216:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:216:1: ( ( rule__Addition__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:217:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:218:1: ( rule__Addition__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:218:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition396);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:230:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:231:1: ( ruleMultiplication EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:232:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication423);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication430); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:239:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:243:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:244:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:244:1: ( ( rule__Multiplication__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:245:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:246:1: ( rule__Multiplication__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:246:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication456);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:258:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:259:1: ( rulePrimary EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:260:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary483);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary490); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:267:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:271:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:272:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:272:1: ( ( rule__Primary__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:273:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:274:1: ( rule__Primary__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:274:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary516);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleArithmeticLiteral"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:286:1: entryRuleArithmeticLiteral : ruleArithmeticLiteral EOF ;
    public final void entryRuleArithmeticLiteral() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:287:1: ( ruleArithmeticLiteral EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:288:1: ruleArithmeticLiteral EOF
            {
             before(grammarAccess.getArithmeticLiteralRule()); 
            pushFollow(FOLLOW_ruleArithmeticLiteral_in_entryRuleArithmeticLiteral543);
            ruleArithmeticLiteral();

            state._fsp--;

             after(grammarAccess.getArithmeticLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticLiteral550); 

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
    // $ANTLR end "entryRuleArithmeticLiteral"


    // $ANTLR start "ruleArithmeticLiteral"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:295:1: ruleArithmeticLiteral : ( ( rule__ArithmeticLiteral__Alternatives ) ) ;
    public final void ruleArithmeticLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:299:2: ( ( ( rule__ArithmeticLiteral__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:300:1: ( ( rule__ArithmeticLiteral__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:300:1: ( ( rule__ArithmeticLiteral__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:301:1: ( rule__ArithmeticLiteral__Alternatives )
            {
             before(grammarAccess.getArithmeticLiteralAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:302:1: ( rule__ArithmeticLiteral__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:302:2: rule__ArithmeticLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__ArithmeticLiteral__Alternatives_in_ruleArithmeticLiteral576);
            rule__ArithmeticLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArithmeticLiteral"


    // $ANTLR start "entryRuleFunctionalTerm"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:314:1: entryRuleFunctionalTerm : ruleFunctionalTerm EOF ;
    public final void entryRuleFunctionalTerm() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:315:1: ( ruleFunctionalTerm EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:316:1: ruleFunctionalTerm EOF
            {
             before(grammarAccess.getFunctionalTermRule()); 
            pushFollow(FOLLOW_ruleFunctionalTerm_in_entryRuleFunctionalTerm603);
            ruleFunctionalTerm();

            state._fsp--;

             after(grammarAccess.getFunctionalTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionalTerm610); 

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
    // $ANTLR end "entryRuleFunctionalTerm"


    // $ANTLR start "ruleFunctionalTerm"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:323:1: ruleFunctionalTerm : ( ( rule__FunctionalTerm__Group__0 ) ) ;
    public final void ruleFunctionalTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:327:2: ( ( ( rule__FunctionalTerm__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:328:1: ( ( rule__FunctionalTerm__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:328:1: ( ( rule__FunctionalTerm__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:329:1: ( rule__FunctionalTerm__Group__0 )
            {
             before(grammarAccess.getFunctionalTermAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:330:1: ( rule__FunctionalTerm__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:330:2: rule__FunctionalTerm__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionalTerm__Group__0_in_ruleFunctionalTerm636);
            rule__FunctionalTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalTermAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionalTerm"


    // $ANTLR start "entryRuleBasicTerms"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:342:1: entryRuleBasicTerms : ruleBasicTerms EOF ;
    public final void entryRuleBasicTerms() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:343:1: ( ruleBasicTerms EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:344:1: ruleBasicTerms EOF
            {
             before(grammarAccess.getBasicTermsRule()); 
            pushFollow(FOLLOW_ruleBasicTerms_in_entryRuleBasicTerms663);
            ruleBasicTerms();

            state._fsp--;

             after(grammarAccess.getBasicTermsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicTerms670); 

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
    // $ANTLR end "entryRuleBasicTerms"


    // $ANTLR start "ruleBasicTerms"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:351:1: ruleBasicTerms : ( ( rule__BasicTerms__Group__0 ) ) ;
    public final void ruleBasicTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:355:2: ( ( ( rule__BasicTerms__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:356:1: ( ( rule__BasicTerms__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:356:1: ( ( rule__BasicTerms__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:357:1: ( rule__BasicTerms__Group__0 )
            {
             before(grammarAccess.getBasicTermsAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:358:1: ( rule__BasicTerms__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:358:2: rule__BasicTerms__Group__0
            {
            pushFollow(FOLLOW_rule__BasicTerms__Group__0_in_ruleBasicTerms696);
            rule__BasicTerms__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTermsAccess().getGroup()); 

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
    // $ANTLR end "ruleBasicTerms"


    // $ANTLR start "entryRuleConstantDeclaration"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:370:1: entryRuleConstantDeclaration : ruleConstantDeclaration EOF ;
    public final void entryRuleConstantDeclaration() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:371:1: ( ruleConstantDeclaration EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:372:1: ruleConstantDeclaration EOF
            {
             before(grammarAccess.getConstantDeclarationRule()); 
            pushFollow(FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration723);
            ruleConstantDeclaration();

            state._fsp--;

             after(grammarAccess.getConstantDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDeclaration730); 

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
    // $ANTLR end "entryRuleConstantDeclaration"


    // $ANTLR start "ruleConstantDeclaration"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:379:1: ruleConstantDeclaration : ( ( rule__ConstantDeclaration__Group__0 ) ) ;
    public final void ruleConstantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:383:2: ( ( ( rule__ConstantDeclaration__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:384:1: ( ( rule__ConstantDeclaration__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:384:1: ( ( rule__ConstantDeclaration__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:385:1: ( rule__ConstantDeclaration__Group__0 )
            {
             before(grammarAccess.getConstantDeclarationAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:386:1: ( rule__ConstantDeclaration__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:386:2: rule__ConstantDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDeclaration__Group__0_in_ruleConstantDeclaration756);
            rule__ConstantDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleConstantDeclaration"


    // $ANTLR start "entryRuleTypeDeclaration"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:398:1: entryRuleTypeDeclaration : ruleTypeDeclaration EOF ;
    public final void entryRuleTypeDeclaration() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:399:1: ( ruleTypeDeclaration EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:400:1: ruleTypeDeclaration EOF
            {
             before(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration783);
            ruleTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDeclaration790); 

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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:407:1: ruleTypeDeclaration : ( ( rule__TypeDeclaration__Group__0 ) ) ;
    public final void ruleTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:411:2: ( ( ( rule__TypeDeclaration__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:412:1: ( ( rule__TypeDeclaration__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:412:1: ( ( rule__TypeDeclaration__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:413:1: ( rule__TypeDeclaration__Group__0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:414:1: ( rule__TypeDeclaration__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:414:2: rule__TypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__0_in_ruleTypeDeclaration816);
            rule__TypeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleLimit"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:426:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:427:1: ( ruleLimit EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:428:1: ruleLimit EOF
            {
             before(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_ruleLimit_in_entryRuleLimit843);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getLimitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimit850); 

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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:435:1: ruleLimit : ( ( rule__Limit__CvAssignment ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:439:2: ( ( ( rule__Limit__CvAssignment ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:440:1: ( ( rule__Limit__CvAssignment ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:440:1: ( ( rule__Limit__CvAssignment ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:441:1: ( rule__Limit__CvAssignment )
            {
             before(grammarAccess.getLimitAccess().getCvAssignment()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:442:1: ( rule__Limit__CvAssignment )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:442:2: rule__Limit__CvAssignment
            {
            pushFollow(FOLLOW_rule__Limit__CvAssignment_in_ruleLimit876);
            rule__Limit__CvAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getCvAssignment()); 

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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleSetExpression"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:458:1: entryRuleSetExpression : ruleSetExpression EOF ;
    public final void entryRuleSetExpression() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:459:1: ( ruleSetExpression EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:460:1: ruleSetExpression EOF
            {
             before(grammarAccess.getSetExpressionRule()); 
            pushFollow(FOLLOW_ruleSetExpression_in_entryRuleSetExpression907);
            ruleSetExpression();

            state._fsp--;

             after(grammarAccess.getSetExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetExpression914); 

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
    // $ANTLR end "entryRuleSetExpression"


    // $ANTLR start "ruleSetExpression"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:467:1: ruleSetExpression : ( ruleSetAddition ) ;
    public final void ruleSetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:471:2: ( ( ruleSetAddition ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:472:1: ( ruleSetAddition )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:472:1: ( ruleSetAddition )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:473:1: ruleSetAddition
            {
             before(grammarAccess.getSetExpressionAccess().getSetAdditionParserRuleCall()); 
            pushFollow(FOLLOW_ruleSetAddition_in_ruleSetExpression940);
            ruleSetAddition();

            state._fsp--;

             after(grammarAccess.getSetExpressionAccess().getSetAdditionParserRuleCall()); 

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
    // $ANTLR end "ruleSetExpression"


    // $ANTLR start "entryRuleTVars"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:488:1: entryRuleTVars : ruleTVars EOF ;
    public final void entryRuleTVars() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:489:1: ( ruleTVars EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:490:1: ruleTVars EOF
            {
             before(grammarAccess.getTVarsRule()); 
            pushFollow(FOLLOW_ruleTVars_in_entryRuleTVars968);
            ruleTVars();

            state._fsp--;

             after(grammarAccess.getTVarsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTVars975); 

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
    // $ANTLR end "entryRuleTVars"


    // $ANTLR start "ruleTVars"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:497:1: ruleTVars : ( ( rule__TVars__Group__0 ) ) ;
    public final void ruleTVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:501:2: ( ( ( rule__TVars__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:502:1: ( ( rule__TVars__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:502:1: ( ( rule__TVars__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:503:1: ( rule__TVars__Group__0 )
            {
             before(grammarAccess.getTVarsAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:504:1: ( rule__TVars__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:504:2: rule__TVars__Group__0
            {
            pushFollow(FOLLOW_rule__TVars__Group__0_in_ruleTVars1001);
            rule__TVars__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTVarsAccess().getGroup()); 

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
    // $ANTLR end "ruleTVars"


    // $ANTLR start "entryRuleTVar"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:516:1: entryRuleTVar : ruleTVar EOF ;
    public final void entryRuleTVar() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:517:1: ( ruleTVar EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:518:1: ruleTVar EOF
            {
             before(grammarAccess.getTVarRule()); 
            pushFollow(FOLLOW_ruleTVar_in_entryRuleTVar1028);
            ruleTVar();

            state._fsp--;

             after(grammarAccess.getTVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTVar1035); 

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
    // $ANTLR end "entryRuleTVar"


    // $ANTLR start "ruleTVar"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:525:1: ruleTVar : ( ( rule__TVar__Group__0 ) ) ;
    public final void ruleTVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:529:2: ( ( ( rule__TVar__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:530:1: ( ( rule__TVar__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:530:1: ( ( rule__TVar__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:531:1: ( rule__TVar__Group__0 )
            {
             before(grammarAccess.getTVarAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:532:1: ( rule__TVar__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:532:2: rule__TVar__Group__0
            {
            pushFollow(FOLLOW_rule__TVar__Group__0_in_ruleTVar1061);
            rule__TVar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTVarAccess().getGroup()); 

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
    // $ANTLR end "ruleTVar"


    // $ANTLR start "entryRuleSetAddition"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:544:1: entryRuleSetAddition : ruleSetAddition EOF ;
    public final void entryRuleSetAddition() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:545:1: ( ruleSetAddition EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:546:1: ruleSetAddition EOF
            {
             before(grammarAccess.getSetAdditionRule()); 
            pushFollow(FOLLOW_ruleSetAddition_in_entryRuleSetAddition1088);
            ruleSetAddition();

            state._fsp--;

             after(grammarAccess.getSetAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetAddition1095); 

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
    // $ANTLR end "entryRuleSetAddition"


    // $ANTLR start "ruleSetAddition"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:553:1: ruleSetAddition : ( ( rule__SetAddition__Group__0 ) ) ;
    public final void ruleSetAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:557:2: ( ( ( rule__SetAddition__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:558:1: ( ( rule__SetAddition__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:558:1: ( ( rule__SetAddition__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:559:1: ( rule__SetAddition__Group__0 )
            {
             before(grammarAccess.getSetAdditionAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:560:1: ( rule__SetAddition__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:560:2: rule__SetAddition__Group__0
            {
            pushFollow(FOLLOW_rule__SetAddition__Group__0_in_ruleSetAddition1121);
            rule__SetAddition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleSetAddition"


    // $ANTLR start "entryRuleSetMultiplication"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:572:1: entryRuleSetMultiplication : ruleSetMultiplication EOF ;
    public final void entryRuleSetMultiplication() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:573:1: ( ruleSetMultiplication EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:574:1: ruleSetMultiplication EOF
            {
             before(grammarAccess.getSetMultiplicationRule()); 
            pushFollow(FOLLOW_ruleSetMultiplication_in_entryRuleSetMultiplication1148);
            ruleSetMultiplication();

            state._fsp--;

             after(grammarAccess.getSetMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetMultiplication1155); 

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
    // $ANTLR end "entryRuleSetMultiplication"


    // $ANTLR start "ruleSetMultiplication"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:581:1: ruleSetMultiplication : ( ( rule__SetMultiplication__Group__0 ) ) ;
    public final void ruleSetMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:585:2: ( ( ( rule__SetMultiplication__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:586:1: ( ( rule__SetMultiplication__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:586:1: ( ( rule__SetMultiplication__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:587:1: ( rule__SetMultiplication__Group__0 )
            {
             before(grammarAccess.getSetMultiplicationAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:588:1: ( rule__SetMultiplication__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:588:2: rule__SetMultiplication__Group__0
            {
            pushFollow(FOLLOW_rule__SetMultiplication__Group__0_in_ruleSetMultiplication1181);
            rule__SetMultiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetMultiplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleSetMultiplication"


    // $ANTLR start "entryRuleSetPrimary"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:600:1: entryRuleSetPrimary : ruleSetPrimary EOF ;
    public final void entryRuleSetPrimary() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:601:1: ( ruleSetPrimary EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:602:1: ruleSetPrimary EOF
            {
             before(grammarAccess.getSetPrimaryRule()); 
            pushFollow(FOLLOW_ruleSetPrimary_in_entryRuleSetPrimary1208);
            ruleSetPrimary();

            state._fsp--;

             after(grammarAccess.getSetPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetPrimary1215); 

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
    // $ANTLR end "entryRuleSetPrimary"


    // $ANTLR start "ruleSetPrimary"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:609:1: ruleSetPrimary : ( ( rule__SetPrimary__Alternatives ) ) ;
    public final void ruleSetPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:613:2: ( ( ( rule__SetPrimary__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:614:1: ( ( rule__SetPrimary__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:614:1: ( ( rule__SetPrimary__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:615:1: ( rule__SetPrimary__Alternatives )
            {
             before(grammarAccess.getSetPrimaryAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:616:1: ( rule__SetPrimary__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:616:2: rule__SetPrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__SetPrimary__Alternatives_in_ruleSetPrimary1241);
            rule__SetPrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSetPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSetPrimary"


    // $ANTLR start "entryRuleSetLiteral"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:628:1: entryRuleSetLiteral : ruleSetLiteral EOF ;
    public final void entryRuleSetLiteral() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:629:1: ( ruleSetLiteral EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:630:1: ruleSetLiteral EOF
            {
             before(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral1268);
            ruleSetLiteral();

            state._fsp--;

             after(grammarAccess.getSetLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral1275); 

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
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:637:1: ruleSetLiteral : ( ( rule__SetLiteral__ValueAssignment ) ) ;
    public final void ruleSetLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:641:2: ( ( ( rule__SetLiteral__ValueAssignment ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:642:1: ( ( rule__SetLiteral__ValueAssignment ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:642:1: ( ( rule__SetLiteral__ValueAssignment ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:643:1: ( rule__SetLiteral__ValueAssignment )
            {
             before(grammarAccess.getSetLiteralAccess().getValueAssignment()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:644:1: ( rule__SetLiteral__ValueAssignment )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:644:2: rule__SetLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SetLiteral__ValueAssignment_in_ruleSetLiteral1301);
            rule__SetLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSetLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleQuantifiedTerm"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:656:1: entryRuleQuantifiedTerm : ruleQuantifiedTerm EOF ;
    public final void entryRuleQuantifiedTerm() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:657:1: ( ruleQuantifiedTerm EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:658:1: ruleQuantifiedTerm EOF
            {
             before(grammarAccess.getQuantifiedTermRule()); 
            pushFollow(FOLLOW_ruleQuantifiedTerm_in_entryRuleQuantifiedTerm1328);
            ruleQuantifiedTerm();

            state._fsp--;

             after(grammarAccess.getQuantifiedTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedTerm1335); 

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
    // $ANTLR end "entryRuleQuantifiedTerm"


    // $ANTLR start "ruleQuantifiedTerm"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:665:1: ruleQuantifiedTerm : ( ( rule__QuantifiedTerm__Group__0 ) ) ;
    public final void ruleQuantifiedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:669:2: ( ( ( rule__QuantifiedTerm__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:670:1: ( ( rule__QuantifiedTerm__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:670:1: ( ( rule__QuantifiedTerm__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:671:1: ( rule__QuantifiedTerm__Group__0 )
            {
             before(grammarAccess.getQuantifiedTermAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:672:1: ( rule__QuantifiedTerm__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:672:2: rule__QuantifiedTerm__Group__0
            {
            pushFollow(FOLLOW_rule__QuantifiedTerm__Group__0_in_ruleQuantifiedTerm1361);
            rule__QuantifiedTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiedTermAccess().getGroup()); 

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
    // $ANTLR end "ruleQuantifiedTerm"


    // $ANTLR start "entryRuleQuantifier"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:684:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:685:1: ( ruleQuantifier EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:686:1: ruleQuantifier EOF
            {
             before(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier1388);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getQuantifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier1395); 

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
    // $ANTLR end "entryRuleQuantifier"


    // $ANTLR start "ruleQuantifier"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:693:1: ruleQuantifier : ( ( rule__Quantifier__Alternatives ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:697:2: ( ( ( rule__Quantifier__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:698:1: ( ( rule__Quantifier__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:698:1: ( ( rule__Quantifier__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:699:1: ( rule__Quantifier__Alternatives )
            {
             before(grammarAccess.getQuantifierAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:700:1: ( rule__Quantifier__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:700:2: rule__Quantifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Quantifier__Alternatives_in_ruleQuantifier1421);
            rule__Quantifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRulePredicateAtom"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:716:1: entryRulePredicateAtom : rulePredicateAtom EOF ;
    public final void entryRulePredicateAtom() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:717:1: ( rulePredicateAtom EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:718:1: rulePredicateAtom EOF
            {
             before(grammarAccess.getPredicateAtomRule()); 
            pushFollow(FOLLOW_rulePredicateAtom_in_entryRulePredicateAtom1452);
            rulePredicateAtom();

            state._fsp--;

             after(grammarAccess.getPredicateAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAtom1459); 

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
    // $ANTLR end "entryRulePredicateAtom"


    // $ANTLR start "rulePredicateAtom"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:725:1: rulePredicateAtom : ( ( rule__PredicateAtom__Group__0 ) ) ;
    public final void rulePredicateAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:729:2: ( ( ( rule__PredicateAtom__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:730:1: ( ( rule__PredicateAtom__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:730:1: ( ( rule__PredicateAtom__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:731:1: ( rule__PredicateAtom__Group__0 )
            {
             before(grammarAccess.getPredicateAtomAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:732:1: ( rule__PredicateAtom__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:732:2: rule__PredicateAtom__Group__0
            {
            pushFollow(FOLLOW_rule__PredicateAtom__Group__0_in_rulePredicateAtom1485);
            rule__PredicateAtom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAtomAccess().getGroup()); 

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
    // $ANTLR end "rulePredicateAtom"


    // $ANTLR start "entryRuleBuiltInAtom"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:744:1: entryRuleBuiltInAtom : ruleBuiltInAtom EOF ;
    public final void entryRuleBuiltInAtom() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:745:1: ( ruleBuiltInAtom EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:746:1: ruleBuiltInAtom EOF
            {
             before(grammarAccess.getBuiltInAtomRule()); 
            pushFollow(FOLLOW_ruleBuiltInAtom_in_entryRuleBuiltInAtom1512);
            ruleBuiltInAtom();

            state._fsp--;

             after(grammarAccess.getBuiltInAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInAtom1519); 

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
    // $ANTLR end "entryRuleBuiltInAtom"


    // $ANTLR start "ruleBuiltInAtom"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:753:1: ruleBuiltInAtom : ( ( rule__BuiltInAtom__Group__0 ) ) ;
    public final void ruleBuiltInAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:757:2: ( ( ( rule__BuiltInAtom__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:758:1: ( ( rule__BuiltInAtom__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:758:1: ( ( rule__BuiltInAtom__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:759:1: ( rule__BuiltInAtom__Group__0 )
            {
             before(grammarAccess.getBuiltInAtomAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:760:1: ( rule__BuiltInAtom__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:760:2: rule__BuiltInAtom__Group__0
            {
            pushFollow(FOLLOW_rule__BuiltInAtom__Group__0_in_ruleBuiltInAtom1545);
            rule__BuiltInAtom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInAtomAccess().getGroup()); 

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
    // $ANTLR end "ruleBuiltInAtom"


    // $ANTLR start "entryRuleAtomOp"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:772:1: entryRuleAtomOp : ruleAtomOp EOF ;
    public final void entryRuleAtomOp() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:773:1: ( ruleAtomOp EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:774:1: ruleAtomOp EOF
            {
             before(grammarAccess.getAtomOpRule()); 
            pushFollow(FOLLOW_ruleAtomOp_in_entryRuleAtomOp1572);
            ruleAtomOp();

            state._fsp--;

             after(grammarAccess.getAtomOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomOp1579); 

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
    // $ANTLR end "entryRuleAtomOp"


    // $ANTLR start "ruleAtomOp"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:781:1: ruleAtomOp : ( ( rule__AtomOp__Alternatives ) ) ;
    public final void ruleAtomOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:785:2: ( ( ( rule__AtomOp__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:786:1: ( ( rule__AtomOp__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:786:1: ( ( rule__AtomOp__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:787:1: ( rule__AtomOp__Alternatives )
            {
             before(grammarAccess.getAtomOpAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:788:1: ( rule__AtomOp__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:788:2: rule__AtomOp__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomOp__Alternatives_in_ruleAtomOp1605);
            rule__AtomOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomOpAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomOp"


    // $ANTLR start "entryRuleSentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:800:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:801:1: ( ruleSentence EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:802:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence1632);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence1639); 

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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:809:1: ruleSentence : ( ruleOrSentence ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:813:2: ( ( ruleOrSentence ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:814:1: ( ruleOrSentence )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:814:1: ( ruleOrSentence )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:815:1: ruleOrSentence
            {
             before(grammarAccess.getSentenceAccess().getOrSentenceParserRuleCall()); 
            pushFollow(FOLLOW_ruleOrSentence_in_ruleSentence1665);
            ruleOrSentence();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getOrSentenceParserRuleCall()); 

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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleOrSentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:828:1: entryRuleOrSentence : ruleOrSentence EOF ;
    public final void entryRuleOrSentence() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:829:1: ( ruleOrSentence EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:830:1: ruleOrSentence EOF
            {
             before(grammarAccess.getOrSentenceRule()); 
            pushFollow(FOLLOW_ruleOrSentence_in_entryRuleOrSentence1691);
            ruleOrSentence();

            state._fsp--;

             after(grammarAccess.getOrSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrSentence1698); 

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
    // $ANTLR end "entryRuleOrSentence"


    // $ANTLR start "ruleOrSentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:837:1: ruleOrSentence : ( ( rule__OrSentence__Group__0 ) ) ;
    public final void ruleOrSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:841:2: ( ( ( rule__OrSentence__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:842:1: ( ( rule__OrSentence__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:842:1: ( ( rule__OrSentence__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:843:1: ( rule__OrSentence__Group__0 )
            {
             before(grammarAccess.getOrSentenceAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:844:1: ( rule__OrSentence__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:844:2: rule__OrSentence__Group__0
            {
            pushFollow(FOLLOW_rule__OrSentence__Group__0_in_ruleOrSentence1724);
            rule__OrSentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrSentenceAccess().getGroup()); 

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
    // $ANTLR end "ruleOrSentence"


    // $ANTLR start "entryRuleAndSentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:856:1: entryRuleAndSentence : ruleAndSentence EOF ;
    public final void entryRuleAndSentence() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:857:1: ( ruleAndSentence EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:858:1: ruleAndSentence EOF
            {
             before(grammarAccess.getAndSentenceRule()); 
            pushFollow(FOLLOW_ruleAndSentence_in_entryRuleAndSentence1751);
            ruleAndSentence();

            state._fsp--;

             after(grammarAccess.getAndSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndSentence1758); 

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
    // $ANTLR end "entryRuleAndSentence"


    // $ANTLR start "ruleAndSentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:865:1: ruleAndSentence : ( ( rule__AndSentence__Group__0 ) ) ;
    public final void ruleAndSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:869:2: ( ( ( rule__AndSentence__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:870:1: ( ( rule__AndSentence__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:870:1: ( ( rule__AndSentence__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:871:1: ( rule__AndSentence__Group__0 )
            {
             before(grammarAccess.getAndSentenceAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:872:1: ( rule__AndSentence__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:872:2: rule__AndSentence__Group__0
            {
            pushFollow(FOLLOW_rule__AndSentence__Group__0_in_ruleAndSentence1784);
            rule__AndSentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndSentenceAccess().getGroup()); 

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
    // $ANTLR end "ruleAndSentence"


    // $ANTLR start "entryRuleNotSentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:884:1: entryRuleNotSentence : ruleNotSentence EOF ;
    public final void entryRuleNotSentence() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:885:1: ( ruleNotSentence EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:886:1: ruleNotSentence EOF
            {
             before(grammarAccess.getNotSentenceRule()); 
            pushFollow(FOLLOW_ruleNotSentence_in_entryRuleNotSentence1811);
            ruleNotSentence();

            state._fsp--;

             after(grammarAccess.getNotSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotSentence1818); 

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
    // $ANTLR end "entryRuleNotSentence"


    // $ANTLR start "ruleNotSentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:893:1: ruleNotSentence : ( ( rule__NotSentence__Alternatives ) ) ;
    public final void ruleNotSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:897:2: ( ( ( rule__NotSentence__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:898:1: ( ( rule__NotSentence__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:898:1: ( ( rule__NotSentence__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:899:1: ( rule__NotSentence__Alternatives )
            {
             before(grammarAccess.getNotSentenceAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:900:1: ( rule__NotSentence__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:900:2: rule__NotSentence__Alternatives
            {
            pushFollow(FOLLOW_rule__NotSentence__Alternatives_in_ruleNotSentence1844);
            rule__NotSentence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotSentenceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNotSentence"


    // $ANTLR start "entryRulePrimarySentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:912:1: entryRulePrimarySentence : rulePrimarySentence EOF ;
    public final void entryRulePrimarySentence() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:913:1: ( rulePrimarySentence EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:914:1: rulePrimarySentence EOF
            {
             before(grammarAccess.getPrimarySentenceRule()); 
            pushFollow(FOLLOW_rulePrimarySentence_in_entryRulePrimarySentence1871);
            rulePrimarySentence();

            state._fsp--;

             after(grammarAccess.getPrimarySentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimarySentence1878); 

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
    // $ANTLR end "entryRulePrimarySentence"


    // $ANTLR start "rulePrimarySentence"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:921:1: rulePrimarySentence : ( ( rule__PrimarySentence__Alternatives ) ) ;
    public final void rulePrimarySentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:925:2: ( ( ( rule__PrimarySentence__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:926:1: ( ( rule__PrimarySentence__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:926:1: ( ( rule__PrimarySentence__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:927:1: ( rule__PrimarySentence__Alternatives )
            {
             before(grammarAccess.getPrimarySentenceAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:928:1: ( rule__PrimarySentence__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:928:2: rule__PrimarySentence__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimarySentence__Alternatives_in_rulePrimarySentence1904);
            rule__PrimarySentence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimarySentenceAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimarySentence"


    // $ANTLR start "entryRuleSentenceLiteral"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:940:1: entryRuleSentenceLiteral : ruleSentenceLiteral EOF ;
    public final void entryRuleSentenceLiteral() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:941:1: ( ruleSentenceLiteral EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:942:1: ruleSentenceLiteral EOF
            {
             before(grammarAccess.getSentenceLiteralRule()); 
            pushFollow(FOLLOW_ruleSentenceLiteral_in_entryRuleSentenceLiteral1931);
            ruleSentenceLiteral();

            state._fsp--;

             after(grammarAccess.getSentenceLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceLiteral1938); 

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
    // $ANTLR end "entryRuleSentenceLiteral"


    // $ANTLR start "ruleSentenceLiteral"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:949:1: ruleSentenceLiteral : ( rulePredicateAtom ) ;
    public final void ruleSentenceLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:953:2: ( ( rulePredicateAtom ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:954:1: ( rulePredicateAtom )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:954:1: ( rulePredicateAtom )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:955:1: rulePredicateAtom
            {
             before(grammarAccess.getSentenceLiteralAccess().getPredicateAtomParserRuleCall()); 
            pushFollow(FOLLOW_rulePredicateAtom_in_ruleSentenceLiteral1964);
            rulePredicateAtom();

            state._fsp--;

             after(grammarAccess.getSentenceLiteralAccess().getPredicateAtomParserRuleCall()); 

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
    // $ANTLR end "ruleSentenceLiteral"


    // $ANTLR start "entryRuleMaybeLiteral"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:968:1: entryRuleMaybeLiteral : ruleMaybeLiteral EOF ;
    public final void entryRuleMaybeLiteral() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:969:1: ( ruleMaybeLiteral EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:970:1: ruleMaybeLiteral EOF
            {
             before(grammarAccess.getMaybeLiteralRule()); 
            pushFollow(FOLLOW_ruleMaybeLiteral_in_entryRuleMaybeLiteral1990);
            ruleMaybeLiteral();

            state._fsp--;

             after(grammarAccess.getMaybeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaybeLiteral1997); 

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
    // $ANTLR end "entryRuleMaybeLiteral"


    // $ANTLR start "ruleMaybeLiteral"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:977:1: ruleMaybeLiteral : ( ( rule__MaybeLiteral__Group__0 ) ) ;
    public final void ruleMaybeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:981:2: ( ( ( rule__MaybeLiteral__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:982:1: ( ( rule__MaybeLiteral__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:982:1: ( ( rule__MaybeLiteral__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:983:1: ( rule__MaybeLiteral__Group__0 )
            {
             before(grammarAccess.getMaybeLiteralAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:984:1: ( rule__MaybeLiteral__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:984:2: rule__MaybeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__MaybeLiteral__Group__0_in_ruleMaybeLiteral2023);
            rule__MaybeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaybeLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleMaybeLiteral"


    // $ANTLR start "entryRuleCardinalityConstraint"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:996:1: entryRuleCardinalityConstraint : ruleCardinalityConstraint EOF ;
    public final void entryRuleCardinalityConstraint() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:997:1: ( ruleCardinalityConstraint EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:998:1: ruleCardinalityConstraint EOF
            {
             before(grammarAccess.getCardinalityConstraintRule()); 
            pushFollow(FOLLOW_ruleCardinalityConstraint_in_entryRuleCardinalityConstraint2050);
            ruleCardinalityConstraint();

            state._fsp--;

             after(grammarAccess.getCardinalityConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinalityConstraint2057); 

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
    // $ANTLR end "entryRuleCardinalityConstraint"


    // $ANTLR start "ruleCardinalityConstraint"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1005:1: ruleCardinalityConstraint : ( ( rule__CardinalityConstraint__Group__0 ) ) ;
    public final void ruleCardinalityConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1009:2: ( ( ( rule__CardinalityConstraint__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1010:1: ( ( rule__CardinalityConstraint__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1010:1: ( ( rule__CardinalityConstraint__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1011:1: ( rule__CardinalityConstraint__Group__0 )
            {
             before(grammarAccess.getCardinalityConstraintAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1012:1: ( rule__CardinalityConstraint__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1012:2: rule__CardinalityConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__0_in_ruleCardinalityConstraint2083);
            rule__CardinalityConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleCardinalityConstraint"


    // $ANTLR start "entryRuleBound"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1024:1: entryRuleBound : ruleBound EOF ;
    public final void entryRuleBound() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1025:1: ( ruleBound EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1026:1: ruleBound EOF
            {
             before(grammarAccess.getBoundRule()); 
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound2110);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getBoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound2117); 

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
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1033:1: ruleBound : ( ( rule__Bound__AvAssignment ) ) ;
    public final void ruleBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1037:2: ( ( ( rule__Bound__AvAssignment ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1038:1: ( ( rule__Bound__AvAssignment ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1038:1: ( ( rule__Bound__AvAssignment ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1039:1: ( rule__Bound__AvAssignment )
            {
             before(grammarAccess.getBoundAccess().getAvAssignment()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1040:1: ( rule__Bound__AvAssignment )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1040:2: rule__Bound__AvAssignment
            {
            pushFollow(FOLLOW_rule__Bound__AvAssignment_in_ruleBound2143);
            rule__Bound__AvAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBoundAccess().getAvAssignment()); 

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
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleRule"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1052:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1053:1: ( ruleRule EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1054:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule2170);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule2177); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1061:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1065:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1066:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1066:1: ( ( rule__Rule__Group__0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1067:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1068:1: ( rule__Rule__Group__0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1068:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule2203);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleHead"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1080:1: entryRuleHead : ruleHead EOF ;
    public final void entryRuleHead() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1081:1: ( ruleHead EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1082:1: ruleHead EOF
            {
             before(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead2230);
            ruleHead();

            state._fsp--;

             after(grammarAccess.getHeadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead2237); 

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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1089:1: ruleHead : ( ( rule__Head__Alternatives ) ) ;
    public final void ruleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1093:2: ( ( ( rule__Head__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1094:1: ( ( rule__Head__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1094:1: ( ( rule__Head__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1095:1: ( rule__Head__Alternatives )
            {
             before(grammarAccess.getHeadAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1096:1: ( rule__Head__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1096:2: rule__Head__Alternatives
            {
            pushFollow(FOLLOW_rule__Head__Alternatives_in_ruleHead2263);
            rule__Head__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleStatement"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1108:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1109:1: ( ruleStatement EOF )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1110:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2290);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2297); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1117:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1121:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1122:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1122:1: ( ( rule__Statement__Alternatives ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1123:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1124:1: ( rule__Statement__Alternatives )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1124:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement2323);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "rule__BasicTerm__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1136:1: rule__BasicTerm__Alternatives : ( ( ruleTypedVariable ) | ( ruleArithmeticTerm ) | ( ruleFunctionalTerm ) );
    public final void rule__BasicTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1140:1: ( ( ruleTypedVariable ) | ( ruleArithmeticTerm ) | ( ruleFunctionalTerm ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                case 32:
                    {
                    alt2=2;
                    }
                    break;
                case 30:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_UID:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA2_0==RULE_INT||LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1141:1: ( ruleTypedVariable )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1141:1: ( ruleTypedVariable )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1142:1: ruleTypedVariable
                    {
                     before(grammarAccess.getBasicTermAccess().getTypedVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypedVariable_in_rule__BasicTerm__Alternatives2359);
                    ruleTypedVariable();

                    state._fsp--;

                     after(grammarAccess.getBasicTermAccess().getTypedVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1147:6: ( ruleArithmeticTerm )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1147:6: ( ruleArithmeticTerm )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1148:1: ruleArithmeticTerm
                    {
                     before(grammarAccess.getBasicTermAccess().getArithmeticTermParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArithmeticTerm_in_rule__BasicTerm__Alternatives2376);
                    ruleArithmeticTerm();

                    state._fsp--;

                     after(grammarAccess.getBasicTermAccess().getArithmeticTermParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1153:6: ( ruleFunctionalTerm )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1153:6: ( ruleFunctionalTerm )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1154:1: ruleFunctionalTerm
                    {
                     before(grammarAccess.getBasicTermAccess().getFunctionalTermParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFunctionalTerm_in_rule__BasicTerm__Alternatives2393);
                    ruleFunctionalTerm();

                    state._fsp--;

                     after(grammarAccess.getBasicTermAccess().getFunctionalTermParserRuleCall_2()); 

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
    // $ANTLR end "rule__BasicTerm__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1164:1: rule__Addition__Alternatives_1_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1168:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1169:1: ( '+' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1169:1: ( '+' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1170:1: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__Addition__Alternatives_1_12426); 
                     after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1177:6: ( '-' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1177:6: ( '-' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1178:1: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__Addition__Alternatives_1_12446); 
                     after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Addition__Alternatives_1_1"


    // $ANTLR start "rule__Multiplication__Alternatives_1_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1190:1: rule__Multiplication__Alternatives_1_1 : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__Multiplication__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1194:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1195:1: ( '*' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1195:1: ( '*' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1196:1: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1_0()); 
                    match(input,15,FOLLOW_15_in_rule__Multiplication__Alternatives_1_12481); 
                     after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1203:6: ( '/' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1203:6: ( '/' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1204:1: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1()); 
                    match(input,16,FOLLOW_16_in_rule__Multiplication__Alternatives_1_12501); 
                     after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1211:6: ( '%' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1211:6: ( '%' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1212:1: '%'
                    {
                     before(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_1_2()); 
                    match(input,17,FOLLOW_17_in_rule__Multiplication__Alternatives_1_12521); 
                     after(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_1_2()); 

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
    // $ANTLR end "rule__Multiplication__Alternatives_1_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1224:1: rule__Primary__Alternatives : ( ( ruleArithmeticLiteral ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1228:1: ( ( ruleArithmeticLiteral ) | ( ( rule__Primary__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1229:1: ( ruleArithmeticLiteral )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1229:1: ( ruleArithmeticLiteral )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1230:1: ruleArithmeticLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getArithmeticLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleArithmeticLiteral_in_rule__Primary__Alternatives2555);
                    ruleArithmeticLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getArithmeticLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1235:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1235:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1236:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1237:1: ( rule__Primary__Group_1__0 )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1237:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives2572);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__ArithmeticLiteral__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1246:1: rule__ArithmeticLiteral__Alternatives : ( ( ( rule__ArithmeticLiteral__IdentifierAssignment_0 ) ) | ( ( rule__ArithmeticLiteral__ValueAssignment_1 ) ) );
    public final void rule__ArithmeticLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1250:1: ( ( ( rule__ArithmeticLiteral__IdentifierAssignment_0 ) ) | ( ( rule__ArithmeticLiteral__ValueAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1251:1: ( ( rule__ArithmeticLiteral__IdentifierAssignment_0 ) )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1251:1: ( ( rule__ArithmeticLiteral__IdentifierAssignment_0 ) )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1252:1: ( rule__ArithmeticLiteral__IdentifierAssignment_0 )
                    {
                     before(grammarAccess.getArithmeticLiteralAccess().getIdentifierAssignment_0()); 
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1253:1: ( rule__ArithmeticLiteral__IdentifierAssignment_0 )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1253:2: rule__ArithmeticLiteral__IdentifierAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ArithmeticLiteral__IdentifierAssignment_0_in_rule__ArithmeticLiteral__Alternatives2605);
                    rule__ArithmeticLiteral__IdentifierAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArithmeticLiteralAccess().getIdentifierAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1257:6: ( ( rule__ArithmeticLiteral__ValueAssignment_1 ) )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1257:6: ( ( rule__ArithmeticLiteral__ValueAssignment_1 ) )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1258:1: ( rule__ArithmeticLiteral__ValueAssignment_1 )
                    {
                     before(grammarAccess.getArithmeticLiteralAccess().getValueAssignment_1()); 
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1259:1: ( rule__ArithmeticLiteral__ValueAssignment_1 )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1259:2: rule__ArithmeticLiteral__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ArithmeticLiteral__ValueAssignment_1_in_rule__ArithmeticLiteral__Alternatives2623);
                    rule__ArithmeticLiteral__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getArithmeticLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__ArithmeticLiteral__Alternatives"


    // $ANTLR start "rule__SetMultiplication__Alternatives_1_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1268:1: rule__SetMultiplication__Alternatives_1_1 : ( ( '*' ) | ( '\\\\' ) );
    public final void rule__SetMultiplication__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1272:1: ( ( '*' ) | ( '\\\\' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1273:1: ( '*' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1273:1: ( '*' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1274:1: '*'
                    {
                     before(grammarAccess.getSetMultiplicationAccess().getAsteriskKeyword_1_1_0()); 
                    match(input,15,FOLLOW_15_in_rule__SetMultiplication__Alternatives_1_12657); 
                     after(grammarAccess.getSetMultiplicationAccess().getAsteriskKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1281:6: ( '\\\\' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1281:6: ( '\\\\' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1282:1: '\\\\'
                    {
                     before(grammarAccess.getSetMultiplicationAccess().getReverseSolidusKeyword_1_1_1()); 
                    match(input,18,FOLLOW_18_in_rule__SetMultiplication__Alternatives_1_12677); 
                     after(grammarAccess.getSetMultiplicationAccess().getReverseSolidusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__SetMultiplication__Alternatives_1_1"


    // $ANTLR start "rule__SetPrimary__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1294:1: rule__SetPrimary__Alternatives : ( ( ruleSetLiteral ) | ( ( rule__SetPrimary__Group_1__0 ) ) );
    public final void rule__SetPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1298:1: ( ( ruleSetLiteral ) | ( ( rule__SetPrimary__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=19 && LA8_0<=21)) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1299:1: ( ruleSetLiteral )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1299:1: ( ruleSetLiteral )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1300:1: ruleSetLiteral
                    {
                     before(grammarAccess.getSetPrimaryAccess().getSetLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSetLiteral_in_rule__SetPrimary__Alternatives2711);
                    ruleSetLiteral();

                    state._fsp--;

                     after(grammarAccess.getSetPrimaryAccess().getSetLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1305:6: ( ( rule__SetPrimary__Group_1__0 ) )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1305:6: ( ( rule__SetPrimary__Group_1__0 ) )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1306:1: ( rule__SetPrimary__Group_1__0 )
                    {
                     before(grammarAccess.getSetPrimaryAccess().getGroup_1()); 
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1307:1: ( rule__SetPrimary__Group_1__0 )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1307:2: rule__SetPrimary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SetPrimary__Group_1__0_in_rule__SetPrimary__Alternatives2728);
                    rule__SetPrimary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetPrimaryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SetPrimary__Alternatives"


    // $ANTLR start "rule__SetLiteral__ValueAlternatives_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1316:1: rule__SetLiteral__ValueAlternatives_0 : ( ( 'set' ) | ( 'range' ) | ( 'set_constr' ) );
    public final void rule__SetLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1320:1: ( ( 'set' ) | ( 'range' ) | ( 'set_constr' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1321:1: ( 'set' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1321:1: ( 'set' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1322:1: 'set'
                    {
                     before(grammarAccess.getSetLiteralAccess().getValueSetKeyword_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__SetLiteral__ValueAlternatives_02762); 
                     after(grammarAccess.getSetLiteralAccess().getValueSetKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1329:6: ( 'range' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1329:6: ( 'range' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1330:1: 'range'
                    {
                     before(grammarAccess.getSetLiteralAccess().getValueRangeKeyword_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__SetLiteral__ValueAlternatives_02782); 
                     after(grammarAccess.getSetLiteralAccess().getValueRangeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1337:6: ( 'set_constr' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1337:6: ( 'set_constr' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1338:1: 'set_constr'
                    {
                     before(grammarAccess.getSetLiteralAccess().getValueSet_constrKeyword_0_2()); 
                    match(input,21,FOLLOW_21_in_rule__SetLiteral__ValueAlternatives_02802); 
                     after(grammarAccess.getSetLiteralAccess().getValueSet_constrKeyword_0_2()); 

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
    // $ANTLR end "rule__SetLiteral__ValueAlternatives_0"


    // $ANTLR start "rule__Quantifier__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1350:1: rule__Quantifier__Alternatives : ( ( 'every' ) | ( 'some' ) );
    public final void rule__Quantifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1354:1: ( ( 'every' ) | ( 'some' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1355:1: ( 'every' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1355:1: ( 'every' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1356:1: 'every'
                    {
                     before(grammarAccess.getQuantifierAccess().getEveryKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__Quantifier__Alternatives2837); 
                     after(grammarAccess.getQuantifierAccess().getEveryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1363:6: ( 'some' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1363:6: ( 'some' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1364:1: 'some'
                    {
                     before(grammarAccess.getQuantifierAccess().getSomeKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__Quantifier__Alternatives2857); 
                     after(grammarAccess.getQuantifierAccess().getSomeKeyword_1()); 

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
    // $ANTLR end "rule__Quantifier__Alternatives"


    // $ANTLR start "rule__AtomOp__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1378:1: rule__AtomOp__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '!=' ) );
    public final void rule__AtomOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1382:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '!=' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            case 28:
                {
                alt11=5;
                }
                break;
            case 29:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1383:1: ( '>' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1383:1: ( '>' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1384:1: '>'
                    {
                     before(grammarAccess.getAtomOpAccess().getGreaterThanSignKeyword_0()); 
                    match(input,24,FOLLOW_24_in_rule__AtomOp__Alternatives2894); 
                     after(grammarAccess.getAtomOpAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1391:6: ( '<' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1391:6: ( '<' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1392:1: '<'
                    {
                     before(grammarAccess.getAtomOpAccess().getLessThanSignKeyword_1()); 
                    match(input,25,FOLLOW_25_in_rule__AtomOp__Alternatives2914); 
                     after(grammarAccess.getAtomOpAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1399:6: ( '>=' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1399:6: ( '>=' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1400:1: '>='
                    {
                     before(grammarAccess.getAtomOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    match(input,26,FOLLOW_26_in_rule__AtomOp__Alternatives2934); 
                     after(grammarAccess.getAtomOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1407:6: ( '<=' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1407:6: ( '<=' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1408:1: '<='
                    {
                     before(grammarAccess.getAtomOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,27,FOLLOW_27_in_rule__AtomOp__Alternatives2954); 
                     after(grammarAccess.getAtomOpAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1415:6: ( '=' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1415:6: ( '=' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1416:1: '='
                    {
                     before(grammarAccess.getAtomOpAccess().getEqualsSignKeyword_4()); 
                    match(input,28,FOLLOW_28_in_rule__AtomOp__Alternatives2974); 
                     after(grammarAccess.getAtomOpAccess().getEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1423:6: ( '!=' )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1423:6: ( '!=' )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1424:1: '!='
                    {
                     before(grammarAccess.getAtomOpAccess().getExclamationMarkEqualsSignKeyword_5()); 
                    match(input,29,FOLLOW_29_in_rule__AtomOp__Alternatives2994); 
                     after(grammarAccess.getAtomOpAccess().getExclamationMarkEqualsSignKeyword_5()); 

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
    // $ANTLR end "rule__AtomOp__Alternatives"


    // $ANTLR start "rule__NotSentence__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1436:1: rule__NotSentence__Alternatives : ( ( rulePrimarySentence ) | ( ( rule__NotSentence__Group_1__0 ) ) );
    public final void rule__NotSentence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1440:1: ( ( rulePrimarySentence ) | ( ( rule__NotSentence__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==37) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1441:1: ( rulePrimarySentence )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1441:1: ( rulePrimarySentence )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1442:1: rulePrimarySentence
                    {
                     before(grammarAccess.getNotSentenceAccess().getPrimarySentenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimarySentence_in_rule__NotSentence__Alternatives3028);
                    rulePrimarySentence();

                    state._fsp--;

                     after(grammarAccess.getNotSentenceAccess().getPrimarySentenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1447:6: ( ( rule__NotSentence__Group_1__0 ) )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1447:6: ( ( rule__NotSentence__Group_1__0 ) )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1448:1: ( rule__NotSentence__Group_1__0 )
                    {
                     before(grammarAccess.getNotSentenceAccess().getGroup_1()); 
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1449:1: ( rule__NotSentence__Group_1__0 )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1449:2: rule__NotSentence__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NotSentence__Group_1__0_in_rule__NotSentence__Alternatives3045);
                    rule__NotSentence__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotSentenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NotSentence__Alternatives"


    // $ANTLR start "rule__PrimarySentence__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1458:1: rule__PrimarySentence__Alternatives : ( ( ruleSentenceLiteral ) | ( ( rule__PrimarySentence__Group_1__0 ) ) );
    public final void rule__PrimarySentence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1462:1: ( ( ruleSentenceLiteral ) | ( ( rule__PrimarySentence__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1463:1: ( ruleSentenceLiteral )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1463:1: ( ruleSentenceLiteral )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1464:1: ruleSentenceLiteral
                    {
                     before(grammarAccess.getPrimarySentenceAccess().getSentenceLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSentenceLiteral_in_rule__PrimarySentence__Alternatives3078);
                    ruleSentenceLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimarySentenceAccess().getSentenceLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1469:6: ( ( rule__PrimarySentence__Group_1__0 ) )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1469:6: ( ( rule__PrimarySentence__Group_1__0 ) )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1470:1: ( rule__PrimarySentence__Group_1__0 )
                    {
                     before(grammarAccess.getPrimarySentenceAccess().getGroup_1()); 
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1471:1: ( rule__PrimarySentence__Group_1__0 )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1471:2: rule__PrimarySentence__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimarySentence__Group_1__0_in_rule__PrimarySentence__Alternatives3095);
                    rule__PrimarySentence__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimarySentenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PrimarySentence__Alternatives"


    // $ANTLR start "rule__Head__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1480:1: rule__Head__Alternatives : ( ( ruleMaybeLiteral ) | ( ruleCardinalityConstraint ) );
    public final void rule__Head__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1484:1: ( ( ruleMaybeLiteral ) | ( ruleCardinalityConstraint ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID||LA14_0==RULE_INT||LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1485:1: ( ruleMaybeLiteral )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1485:1: ( ruleMaybeLiteral )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1486:1: ruleMaybeLiteral
                    {
                     before(grammarAccess.getHeadAccess().getMaybeLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMaybeLiteral_in_rule__Head__Alternatives3128);
                    ruleMaybeLiteral();

                    state._fsp--;

                     after(grammarAccess.getHeadAccess().getMaybeLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1491:6: ( ruleCardinalityConstraint )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1491:6: ( ruleCardinalityConstraint )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1492:1: ruleCardinalityConstraint
                    {
                     before(grammarAccess.getHeadAccess().getCardinalityConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCardinalityConstraint_in_rule__Head__Alternatives3145);
                    ruleCardinalityConstraint();

                    state._fsp--;

                     after(grammarAccess.getHeadAccess().getCardinalityConstraintParserRuleCall_1()); 

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
    // $ANTLR end "rule__Head__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1502:1: rule__Statement__Alternatives : ( ( ruleRule ) | ( ruleTypeDeclaration ) | ( ruleConstantDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1506:1: ( ( ruleRule ) | ( ruleTypeDeclaration ) | ( ruleConstantDeclaration ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 30:
            case 38:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==28) ) {
                    alt15=2;
                }
                else if ( ((LA15_2>=13 && LA15_2<=17)||LA15_2==27) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LID:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1507:1: ( ruleRule )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1507:1: ( ruleRule )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1508:1: ruleRule
                    {
                     before(grammarAccess.getStatementAccess().getRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__Statement__Alternatives3177);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1513:6: ( ruleTypeDeclaration )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1513:6: ( ruleTypeDeclaration )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1514:1: ruleTypeDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getTypeDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTypeDeclaration_in_rule__Statement__Alternatives3194);
                    ruleTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTypeDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1519:6: ( ruleConstantDeclaration )
                    {
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1519:6: ( ruleConstantDeclaration )
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1520:1: ruleConstantDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getConstantDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstantDeclaration_in_rule__Statement__Alternatives3211);
                    ruleConstantDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConstantDeclarationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__TypedVariable__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1532:1: rule__TypedVariable__Group__0 : rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 ;
    public final void rule__TypedVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1536:1: ( rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1537:2: rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1
            {
            pushFollow(FOLLOW_rule__TypedVariable__Group__0__Impl_in_rule__TypedVariable__Group__03241);
            rule__TypedVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypedVariable__Group__1_in_rule__TypedVariable__Group__03244);
            rule__TypedVariable__Group__1();

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
    // $ANTLR end "rule__TypedVariable__Group__0"


    // $ANTLR start "rule__TypedVariable__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1544:1: rule__TypedVariable__Group__0__Impl : ( ( rule__TypedVariable__TypeAssignment_0 ) ) ;
    public final void rule__TypedVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1548:1: ( ( ( rule__TypedVariable__TypeAssignment_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1549:1: ( ( rule__TypedVariable__TypeAssignment_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1549:1: ( ( rule__TypedVariable__TypeAssignment_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1550:1: ( rule__TypedVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getTypedVariableAccess().getTypeAssignment_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1551:1: ( rule__TypedVariable__TypeAssignment_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1551:2: rule__TypedVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TypedVariable__TypeAssignment_0_in_rule__TypedVariable__Group__0__Impl3271);
            rule__TypedVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__TypedVariable__Group__0__Impl"


    // $ANTLR start "rule__TypedVariable__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1561:1: rule__TypedVariable__Group__1 : rule__TypedVariable__Group__1__Impl ;
    public final void rule__TypedVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1565:1: ( rule__TypedVariable__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1566:2: rule__TypedVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypedVariable__Group__1__Impl_in_rule__TypedVariable__Group__13301);
            rule__TypedVariable__Group__1__Impl();

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
    // $ANTLR end "rule__TypedVariable__Group__1"


    // $ANTLR start "rule__TypedVariable__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1572:1: rule__TypedVariable__Group__1__Impl : ( ( rule__TypedVariable__VarAssignment_1 ) ) ;
    public final void rule__TypedVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1576:1: ( ( ( rule__TypedVariable__VarAssignment_1 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1577:1: ( ( rule__TypedVariable__VarAssignment_1 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1577:1: ( ( rule__TypedVariable__VarAssignment_1 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1578:1: ( rule__TypedVariable__VarAssignment_1 )
            {
             before(grammarAccess.getTypedVariableAccess().getVarAssignment_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1579:1: ( rule__TypedVariable__VarAssignment_1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1579:2: rule__TypedVariable__VarAssignment_1
            {
            pushFollow(FOLLOW_rule__TypedVariable__VarAssignment_1_in_rule__TypedVariable__Group__1__Impl3328);
            rule__TypedVariable__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__TypedVariable__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1593:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1597:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1598:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__03362);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__03365);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1605:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1609:1: ( ( ruleMultiplication ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1610:1: ( ruleMultiplication )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1610:1: ( ruleMultiplication )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1611:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl3392);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1622:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1626:1: ( rule__Addition__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1627:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__13421);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1633:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1637:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1638:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1638:1: ( ( rule__Addition__Group_1__0 )* )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1639:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1640:1: ( rule__Addition__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=13 && LA16_0<=14)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1640:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl3448);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1654:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1658:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1659:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__03483);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__03486);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1666:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1670:1: ( ( () ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1671:1: ( () )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1671:1: ( () )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1672:1: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1673:1: ()
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1675:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1685:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1689:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1690:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__13544);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__13547);
            rule__Addition__Group_1__2();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1697:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__Alternatives_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1701:1: ( ( ( rule__Addition__Alternatives_1_1 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1702:1: ( ( rule__Addition__Alternatives_1_1 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1702:1: ( ( rule__Addition__Alternatives_1_1 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1703:1: ( rule__Addition__Alternatives_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1704:1: ( rule__Addition__Alternatives_1_1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1704:2: rule__Addition__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_1_in_rule__Addition__Group_1__1__Impl3574);
            rule__Addition__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1714:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1718:1: ( rule__Addition__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1719:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__23604);
            rule__Addition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1725:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RhsAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1729:1: ( ( ( rule__Addition__RhsAssignment_1_2 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1730:1: ( ( rule__Addition__RhsAssignment_1_2 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1730:1: ( ( rule__Addition__RhsAssignment_1_2 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1731:1: ( rule__Addition__RhsAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRhsAssignment_1_2()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1732:1: ( rule__Addition__RhsAssignment_1_2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1732:2: rule__Addition__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Addition__RhsAssignment_1_2_in_rule__Addition__Group_1__2__Impl3631);
            rule__Addition__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRhsAssignment_1_2()); 

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
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1748:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1752:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1753:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__03667);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__03670);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1760:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1764:1: ( ( rulePrimary ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1765:1: ( rulePrimary )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1765:1: ( rulePrimary )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1766:1: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Multiplication__Group__0__Impl3697);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1777:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1781:1: ( rule__Multiplication__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1782:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13726);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1788:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1792:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1793:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1793:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1794:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1795:1: ( rule__Multiplication__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=15 && LA17_0<=17)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1795:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3753);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1809:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1813:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1814:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03788);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__03791);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1821:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1825:1: ( ( () ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1826:1: ( () )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1826:1: ( () )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1827:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1828:1: ()
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1830:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1840:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1844:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1845:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__13849);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__13852);
            rule__Multiplication__Group_1__2();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1852:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__Alternatives_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1856:1: ( ( ( rule__Multiplication__Alternatives_1_1 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1857:1: ( ( rule__Multiplication__Alternatives_1_1 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1857:1: ( ( rule__Multiplication__Alternatives_1_1 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1858:1: ( rule__Multiplication__Alternatives_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1859:1: ( rule__Multiplication__Alternatives_1_1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1859:2: rule__Multiplication__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_1_in_rule__Multiplication__Group_1__1__Impl3879);
            rule__Multiplication__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1869:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1873:1: ( rule__Multiplication__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1874:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__23909);
            rule__Multiplication__Group_1__2__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1880:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RhsAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1884:1: ( ( ( rule__Multiplication__RhsAssignment_1_2 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1885:1: ( ( rule__Multiplication__RhsAssignment_1_2 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1885:1: ( ( rule__Multiplication__RhsAssignment_1_2 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1886:1: ( rule__Multiplication__RhsAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_2()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1887:1: ( rule__Multiplication__RhsAssignment_1_2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1887:2: rule__Multiplication__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RhsAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl3936);
            rule__Multiplication__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_2()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1903:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1907:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1908:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__03972);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__03975);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1915:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1919:1: ( ( '(' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1920:1: ( '(' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1920:1: ( '(' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1921:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Primary__Group_1__0__Impl4003); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1934:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1938:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1939:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__14034);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__14037);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1946:1: rule__Primary__Group_1__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1950:1: ( ( ruleAddition ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1951:1: ( ruleAddition )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1951:1: ( ruleAddition )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1952:1: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Primary__Group_1__1__Impl4064);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1963:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1967:1: ( rule__Primary__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1968:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__24093);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1974:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1978:1: ( ( ')' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1979:1: ( ')' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1979:1: ( ')' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1980:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,31,FOLLOW_31_in_rule__Primary__Group_1__2__Impl4121); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionalTerm__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:1999:1: rule__FunctionalTerm__Group__0 : rule__FunctionalTerm__Group__0__Impl rule__FunctionalTerm__Group__1 ;
    public final void rule__FunctionalTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2003:1: ( rule__FunctionalTerm__Group__0__Impl rule__FunctionalTerm__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2004:2: rule__FunctionalTerm__Group__0__Impl rule__FunctionalTerm__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionalTerm__Group__0__Impl_in_rule__FunctionalTerm__Group__04158);
            rule__FunctionalTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionalTerm__Group__1_in_rule__FunctionalTerm__Group__04161);
            rule__FunctionalTerm__Group__1();

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
    // $ANTLR end "rule__FunctionalTerm__Group__0"


    // $ANTLR start "rule__FunctionalTerm__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2011:1: rule__FunctionalTerm__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FunctionalTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2015:1: ( ( RULE_ID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2016:1: ( RULE_ID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2016:1: ( RULE_ID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2017:1: RULE_ID
            {
             before(grammarAccess.getFunctionalTermAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionalTerm__Group__0__Impl4188); 
             after(grammarAccess.getFunctionalTermAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FunctionalTerm__Group__0__Impl"


    // $ANTLR start "rule__FunctionalTerm__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2028:1: rule__FunctionalTerm__Group__1 : rule__FunctionalTerm__Group__1__Impl rule__FunctionalTerm__Group__2 ;
    public final void rule__FunctionalTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2032:1: ( rule__FunctionalTerm__Group__1__Impl rule__FunctionalTerm__Group__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2033:2: rule__FunctionalTerm__Group__1__Impl rule__FunctionalTerm__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionalTerm__Group__1__Impl_in_rule__FunctionalTerm__Group__14217);
            rule__FunctionalTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionalTerm__Group__2_in_rule__FunctionalTerm__Group__14220);
            rule__FunctionalTerm__Group__2();

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
    // $ANTLR end "rule__FunctionalTerm__Group__1"


    // $ANTLR start "rule__FunctionalTerm__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2040:1: rule__FunctionalTerm__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionalTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2044:1: ( ( '(' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2045:1: ( '(' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2045:1: ( '(' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2046:1: '('
            {
             before(grammarAccess.getFunctionalTermAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__FunctionalTerm__Group__1__Impl4248); 
             after(grammarAccess.getFunctionalTermAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FunctionalTerm__Group__1__Impl"


    // $ANTLR start "rule__FunctionalTerm__Group__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2059:1: rule__FunctionalTerm__Group__2 : rule__FunctionalTerm__Group__2__Impl rule__FunctionalTerm__Group__3 ;
    public final void rule__FunctionalTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2063:1: ( rule__FunctionalTerm__Group__2__Impl rule__FunctionalTerm__Group__3 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2064:2: rule__FunctionalTerm__Group__2__Impl rule__FunctionalTerm__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionalTerm__Group__2__Impl_in_rule__FunctionalTerm__Group__24279);
            rule__FunctionalTerm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionalTerm__Group__3_in_rule__FunctionalTerm__Group__24282);
            rule__FunctionalTerm__Group__3();

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
    // $ANTLR end "rule__FunctionalTerm__Group__2"


    // $ANTLR start "rule__FunctionalTerm__Group__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2071:1: rule__FunctionalTerm__Group__2__Impl : ( ruleBasicTerms ) ;
    public final void rule__FunctionalTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2075:1: ( ( ruleBasicTerms ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2076:1: ( ruleBasicTerms )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2076:1: ( ruleBasicTerms )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2077:1: ruleBasicTerms
            {
             before(grammarAccess.getFunctionalTermAccess().getBasicTermsParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleBasicTerms_in_rule__FunctionalTerm__Group__2__Impl4309);
            ruleBasicTerms();

            state._fsp--;

             after(grammarAccess.getFunctionalTermAccess().getBasicTermsParserRuleCall_2()); 

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
    // $ANTLR end "rule__FunctionalTerm__Group__2__Impl"


    // $ANTLR start "rule__FunctionalTerm__Group__3"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2088:1: rule__FunctionalTerm__Group__3 : rule__FunctionalTerm__Group__3__Impl ;
    public final void rule__FunctionalTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2092:1: ( rule__FunctionalTerm__Group__3__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2093:2: rule__FunctionalTerm__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionalTerm__Group__3__Impl_in_rule__FunctionalTerm__Group__34338);
            rule__FunctionalTerm__Group__3__Impl();

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
    // $ANTLR end "rule__FunctionalTerm__Group__3"


    // $ANTLR start "rule__FunctionalTerm__Group__3__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2099:1: rule__FunctionalTerm__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionalTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2103:1: ( ( ')' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2104:1: ( ')' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2104:1: ( ')' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2105:1: ')'
            {
             before(grammarAccess.getFunctionalTermAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__FunctionalTerm__Group__3__Impl4366); 
             after(grammarAccess.getFunctionalTermAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FunctionalTerm__Group__3__Impl"


    // $ANTLR start "rule__BasicTerms__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2126:1: rule__BasicTerms__Group__0 : rule__BasicTerms__Group__0__Impl rule__BasicTerms__Group__1 ;
    public final void rule__BasicTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2130:1: ( rule__BasicTerms__Group__0__Impl rule__BasicTerms__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2131:2: rule__BasicTerms__Group__0__Impl rule__BasicTerms__Group__1
            {
            pushFollow(FOLLOW_rule__BasicTerms__Group__0__Impl_in_rule__BasicTerms__Group__04405);
            rule__BasicTerms__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicTerms__Group__1_in_rule__BasicTerms__Group__04408);
            rule__BasicTerms__Group__1();

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
    // $ANTLR end "rule__BasicTerms__Group__0"


    // $ANTLR start "rule__BasicTerms__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2138:1: rule__BasicTerms__Group__0__Impl : ( ( rule__BasicTerms__CarAssignment_0 ) ) ;
    public final void rule__BasicTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2142:1: ( ( ( rule__BasicTerms__CarAssignment_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2143:1: ( ( rule__BasicTerms__CarAssignment_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2143:1: ( ( rule__BasicTerms__CarAssignment_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2144:1: ( rule__BasicTerms__CarAssignment_0 )
            {
             before(grammarAccess.getBasicTermsAccess().getCarAssignment_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2145:1: ( rule__BasicTerms__CarAssignment_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2145:2: rule__BasicTerms__CarAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicTerms__CarAssignment_0_in_rule__BasicTerms__Group__0__Impl4435);
            rule__BasicTerms__CarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTermsAccess().getCarAssignment_0()); 

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
    // $ANTLR end "rule__BasicTerms__Group__0__Impl"


    // $ANTLR start "rule__BasicTerms__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2155:1: rule__BasicTerms__Group__1 : rule__BasicTerms__Group__1__Impl ;
    public final void rule__BasicTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2159:1: ( rule__BasicTerms__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2160:2: rule__BasicTerms__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicTerms__Group__1__Impl_in_rule__BasicTerms__Group__14465);
            rule__BasicTerms__Group__1__Impl();

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
    // $ANTLR end "rule__BasicTerms__Group__1"


    // $ANTLR start "rule__BasicTerms__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2166:1: rule__BasicTerms__Group__1__Impl : ( ( rule__BasicTerms__Group_1__0 )* ) ;
    public final void rule__BasicTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2170:1: ( ( ( rule__BasicTerms__Group_1__0 )* ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2171:1: ( ( rule__BasicTerms__Group_1__0 )* )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2171:1: ( ( rule__BasicTerms__Group_1__0 )* )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2172:1: ( rule__BasicTerms__Group_1__0 )*
            {
             before(grammarAccess.getBasicTermsAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2173:1: ( rule__BasicTerms__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2173:2: rule__BasicTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BasicTerms__Group_1__0_in_rule__BasicTerms__Group__1__Impl4492);
            	    rule__BasicTerms__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBasicTermsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BasicTerms__Group__1__Impl"


    // $ANTLR start "rule__BasicTerms__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2187:1: rule__BasicTerms__Group_1__0 : rule__BasicTerms__Group_1__0__Impl rule__BasicTerms__Group_1__1 ;
    public final void rule__BasicTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2191:1: ( rule__BasicTerms__Group_1__0__Impl rule__BasicTerms__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2192:2: rule__BasicTerms__Group_1__0__Impl rule__BasicTerms__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicTerms__Group_1__0__Impl_in_rule__BasicTerms__Group_1__04527);
            rule__BasicTerms__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicTerms__Group_1__1_in_rule__BasicTerms__Group_1__04530);
            rule__BasicTerms__Group_1__1();

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
    // $ANTLR end "rule__BasicTerms__Group_1__0"


    // $ANTLR start "rule__BasicTerms__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2199:1: rule__BasicTerms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__BasicTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2203:1: ( ( ',' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2204:1: ( ',' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2204:1: ( ',' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2205:1: ','
            {
             before(grammarAccess.getBasicTermsAccess().getCommaKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__BasicTerms__Group_1__0__Impl4558); 
             after(grammarAccess.getBasicTermsAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__BasicTerms__Group_1__0__Impl"


    // $ANTLR start "rule__BasicTerms__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2218:1: rule__BasicTerms__Group_1__1 : rule__BasicTerms__Group_1__1__Impl ;
    public final void rule__BasicTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2222:1: ( rule__BasicTerms__Group_1__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2223:2: rule__BasicTerms__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicTerms__Group_1__1__Impl_in_rule__BasicTerms__Group_1__14589);
            rule__BasicTerms__Group_1__1__Impl();

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
    // $ANTLR end "rule__BasicTerms__Group_1__1"


    // $ANTLR start "rule__BasicTerms__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2229:1: rule__BasicTerms__Group_1__1__Impl : ( ( rule__BasicTerms__CdrAssignment_1_1 ) ) ;
    public final void rule__BasicTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2233:1: ( ( ( rule__BasicTerms__CdrAssignment_1_1 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2234:1: ( ( rule__BasicTerms__CdrAssignment_1_1 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2234:1: ( ( rule__BasicTerms__CdrAssignment_1_1 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2235:1: ( rule__BasicTerms__CdrAssignment_1_1 )
            {
             before(grammarAccess.getBasicTermsAccess().getCdrAssignment_1_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2236:1: ( rule__BasicTerms__CdrAssignment_1_1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2236:2: rule__BasicTerms__CdrAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BasicTerms__CdrAssignment_1_1_in_rule__BasicTerms__Group_1__1__Impl4616);
            rule__BasicTerms__CdrAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicTermsAccess().getCdrAssignment_1_1()); 

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
    // $ANTLR end "rule__BasicTerms__Group_1__1__Impl"


    // $ANTLR start "rule__ConstantDeclaration__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2250:1: rule__ConstantDeclaration__Group__0 : rule__ConstantDeclaration__Group__0__Impl rule__ConstantDeclaration__Group__1 ;
    public final void rule__ConstantDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2254:1: ( rule__ConstantDeclaration__Group__0__Impl rule__ConstantDeclaration__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2255:2: rule__ConstantDeclaration__Group__0__Impl rule__ConstantDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ConstantDeclaration__Group__0__Impl_in_rule__ConstantDeclaration__Group__04650);
            rule__ConstantDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantDeclaration__Group__1_in_rule__ConstantDeclaration__Group__04653);
            rule__ConstantDeclaration__Group__1();

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
    // $ANTLR end "rule__ConstantDeclaration__Group__0"


    // $ANTLR start "rule__ConstantDeclaration__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2262:1: rule__ConstantDeclaration__Group__0__Impl : ( ( rule__ConstantDeclaration__IdAssignment_0 ) ) ;
    public final void rule__ConstantDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2266:1: ( ( ( rule__ConstantDeclaration__IdAssignment_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2267:1: ( ( rule__ConstantDeclaration__IdAssignment_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2267:1: ( ( rule__ConstantDeclaration__IdAssignment_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2268:1: ( rule__ConstantDeclaration__IdAssignment_0 )
            {
             before(grammarAccess.getConstantDeclarationAccess().getIdAssignment_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2269:1: ( rule__ConstantDeclaration__IdAssignment_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2269:2: rule__ConstantDeclaration__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__ConstantDeclaration__IdAssignment_0_in_rule__ConstantDeclaration__Group__0__Impl4680);
            rule__ConstantDeclaration__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstantDeclarationAccess().getIdAssignment_0()); 

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
    // $ANTLR end "rule__ConstantDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ConstantDeclaration__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2279:1: rule__ConstantDeclaration__Group__1 : rule__ConstantDeclaration__Group__1__Impl rule__ConstantDeclaration__Group__2 ;
    public final void rule__ConstantDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2283:1: ( rule__ConstantDeclaration__Group__1__Impl rule__ConstantDeclaration__Group__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2284:2: rule__ConstantDeclaration__Group__1__Impl rule__ConstantDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ConstantDeclaration__Group__1__Impl_in_rule__ConstantDeclaration__Group__14710);
            rule__ConstantDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantDeclaration__Group__2_in_rule__ConstantDeclaration__Group__14713);
            rule__ConstantDeclaration__Group__2();

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
    // $ANTLR end "rule__ConstantDeclaration__Group__1"


    // $ANTLR start "rule__ConstantDeclaration__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2291:1: rule__ConstantDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__ConstantDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2295:1: ( ( '=' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2296:1: ( '=' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2296:1: ( '=' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2297:1: '='
            {
             before(grammarAccess.getConstantDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__ConstantDeclaration__Group__1__Impl4741); 
             after(grammarAccess.getConstantDeclarationAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__ConstantDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ConstantDeclaration__Group__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2310:1: rule__ConstantDeclaration__Group__2 : rule__ConstantDeclaration__Group__2__Impl rule__ConstantDeclaration__Group__3 ;
    public final void rule__ConstantDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2314:1: ( rule__ConstantDeclaration__Group__2__Impl rule__ConstantDeclaration__Group__3 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2315:2: rule__ConstantDeclaration__Group__2__Impl rule__ConstantDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ConstantDeclaration__Group__2__Impl_in_rule__ConstantDeclaration__Group__24772);
            rule__ConstantDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantDeclaration__Group__3_in_rule__ConstantDeclaration__Group__24775);
            rule__ConstantDeclaration__Group__3();

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
    // $ANTLR end "rule__ConstantDeclaration__Group__2"


    // $ANTLR start "rule__ConstantDeclaration__Group__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2322:1: rule__ConstantDeclaration__Group__2__Impl : ( ( rule__ConstantDeclaration__CvAssignment_2 ) ) ;
    public final void rule__ConstantDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2326:1: ( ( ( rule__ConstantDeclaration__CvAssignment_2 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2327:1: ( ( rule__ConstantDeclaration__CvAssignment_2 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2327:1: ( ( rule__ConstantDeclaration__CvAssignment_2 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2328:1: ( rule__ConstantDeclaration__CvAssignment_2 )
            {
             before(grammarAccess.getConstantDeclarationAccess().getCvAssignment_2()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2329:1: ( rule__ConstantDeclaration__CvAssignment_2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2329:2: rule__ConstantDeclaration__CvAssignment_2
            {
            pushFollow(FOLLOW_rule__ConstantDeclaration__CvAssignment_2_in_rule__ConstantDeclaration__Group__2__Impl4802);
            rule__ConstantDeclaration__CvAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstantDeclarationAccess().getCvAssignment_2()); 

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
    // $ANTLR end "rule__ConstantDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ConstantDeclaration__Group__3"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2339:1: rule__ConstantDeclaration__Group__3 : rule__ConstantDeclaration__Group__3__Impl ;
    public final void rule__ConstantDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2343:1: ( rule__ConstantDeclaration__Group__3__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2344:2: rule__ConstantDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstantDeclaration__Group__3__Impl_in_rule__ConstantDeclaration__Group__34832);
            rule__ConstantDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ConstantDeclaration__Group__3"


    // $ANTLR start "rule__ConstantDeclaration__Group__3__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2350:1: rule__ConstantDeclaration__Group__3__Impl : ( '.' ) ;
    public final void rule__ConstantDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2354:1: ( ( '.' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2355:1: ( '.' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2355:1: ( '.' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2356:1: '.'
            {
             before(grammarAccess.getConstantDeclarationAccess().getFullStopKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__ConstantDeclaration__Group__3__Impl4860); 
             after(grammarAccess.getConstantDeclarationAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__ConstantDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2377:1: rule__TypeDeclaration__Group__0 : rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 ;
    public final void rule__TypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2381:1: ( rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2382:2: rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__0__Impl_in_rule__TypeDeclaration__Group__04899);
            rule__TypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDeclaration__Group__1_in_rule__TypeDeclaration__Group__04902);
            rule__TypeDeclaration__Group__1();

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
    // $ANTLR end "rule__TypeDeclaration__Group__0"


    // $ANTLR start "rule__TypeDeclaration__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2389:1: rule__TypeDeclaration__Group__0__Impl : ( ( rule__TypeDeclaration__IdAssignment_0 ) ) ;
    public final void rule__TypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2393:1: ( ( ( rule__TypeDeclaration__IdAssignment_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2394:1: ( ( rule__TypeDeclaration__IdAssignment_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2394:1: ( ( rule__TypeDeclaration__IdAssignment_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2395:1: ( rule__TypeDeclaration__IdAssignment_0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getIdAssignment_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2396:1: ( rule__TypeDeclaration__IdAssignment_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2396:2: rule__TypeDeclaration__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__IdAssignment_0_in_rule__TypeDeclaration__Group__0__Impl4929);
            rule__TypeDeclaration__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getIdAssignment_0()); 

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
    // $ANTLR end "rule__TypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2406:1: rule__TypeDeclaration__Group__1 : rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 ;
    public final void rule__TypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2410:1: ( rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2411:2: rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__1__Impl_in_rule__TypeDeclaration__Group__14959);
            rule__TypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDeclaration__Group__2_in_rule__TypeDeclaration__Group__14962);
            rule__TypeDeclaration__Group__2();

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
    // $ANTLR end "rule__TypeDeclaration__Group__1"


    // $ANTLR start "rule__TypeDeclaration__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2418:1: rule__TypeDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__TypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2422:1: ( ( '=' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2423:1: ( '=' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2423:1: ( '=' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2424:1: '='
            {
             before(grammarAccess.getTypeDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__TypeDeclaration__Group__1__Impl4990); 
             after(grammarAccess.getTypeDeclarationAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__TypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2437:1: rule__TypeDeclaration__Group__2 : rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 ;
    public final void rule__TypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2441:1: ( rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2442:2: rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__2__Impl_in_rule__TypeDeclaration__Group__25021);
            rule__TypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDeclaration__Group__3_in_rule__TypeDeclaration__Group__25024);
            rule__TypeDeclaration__Group__3();

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
    // $ANTLR end "rule__TypeDeclaration__Group__2"


    // $ANTLR start "rule__TypeDeclaration__Group__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2449:1: rule__TypeDeclaration__Group__2__Impl : ( ( rule__TypeDeclaration__ExpAssignment_2 ) ) ;
    public final void rule__TypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2453:1: ( ( ( rule__TypeDeclaration__ExpAssignment_2 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2454:1: ( ( rule__TypeDeclaration__ExpAssignment_2 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2454:1: ( ( rule__TypeDeclaration__ExpAssignment_2 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2455:1: ( rule__TypeDeclaration__ExpAssignment_2 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getExpAssignment_2()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2456:1: ( rule__TypeDeclaration__ExpAssignment_2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2456:2: rule__TypeDeclaration__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__ExpAssignment_2_in_rule__TypeDeclaration__Group__2__Impl5051);
            rule__TypeDeclaration__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getExpAssignment_2()); 

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
    // $ANTLR end "rule__TypeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__3"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2466:1: rule__TypeDeclaration__Group__3 : rule__TypeDeclaration__Group__3__Impl ;
    public final void rule__TypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2470:1: ( rule__TypeDeclaration__Group__3__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2471:2: rule__TypeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__3__Impl_in_rule__TypeDeclaration__Group__35081);
            rule__TypeDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__TypeDeclaration__Group__3"


    // $ANTLR start "rule__TypeDeclaration__Group__3__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2477:1: rule__TypeDeclaration__Group__3__Impl : ( '.' ) ;
    public final void rule__TypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2481:1: ( ( '.' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2482:1: ( '.' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2482:1: ( '.' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2483:1: '.'
            {
             before(grammarAccess.getTypeDeclarationAccess().getFullStopKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__TypeDeclaration__Group__3__Impl5109); 
             after(grammarAccess.getTypeDeclarationAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__TypeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TVars__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2507:1: rule__TVars__Group__0 : rule__TVars__Group__0__Impl rule__TVars__Group__1 ;
    public final void rule__TVars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2511:1: ( rule__TVars__Group__0__Impl rule__TVars__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2512:2: rule__TVars__Group__0__Impl rule__TVars__Group__1
            {
            pushFollow(FOLLOW_rule__TVars__Group__0__Impl_in_rule__TVars__Group__05151);
            rule__TVars__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TVars__Group__1_in_rule__TVars__Group__05154);
            rule__TVars__Group__1();

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
    // $ANTLR end "rule__TVars__Group__0"


    // $ANTLR start "rule__TVars__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2519:1: rule__TVars__Group__0__Impl : ( ( rule__TVars__CarAssignment_0 ) ) ;
    public final void rule__TVars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2523:1: ( ( ( rule__TVars__CarAssignment_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2524:1: ( ( rule__TVars__CarAssignment_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2524:1: ( ( rule__TVars__CarAssignment_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2525:1: ( rule__TVars__CarAssignment_0 )
            {
             before(grammarAccess.getTVarsAccess().getCarAssignment_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2526:1: ( rule__TVars__CarAssignment_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2526:2: rule__TVars__CarAssignment_0
            {
            pushFollow(FOLLOW_rule__TVars__CarAssignment_0_in_rule__TVars__Group__0__Impl5181);
            rule__TVars__CarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTVarsAccess().getCarAssignment_0()); 

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
    // $ANTLR end "rule__TVars__Group__0__Impl"


    // $ANTLR start "rule__TVars__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2536:1: rule__TVars__Group__1 : rule__TVars__Group__1__Impl ;
    public final void rule__TVars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2540:1: ( rule__TVars__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2541:2: rule__TVars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TVars__Group__1__Impl_in_rule__TVars__Group__15211);
            rule__TVars__Group__1__Impl();

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
    // $ANTLR end "rule__TVars__Group__1"


    // $ANTLR start "rule__TVars__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2547:1: rule__TVars__Group__1__Impl : ( ( rule__TVars__Group_1__0 )* ) ;
    public final void rule__TVars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2551:1: ( ( ( rule__TVars__Group_1__0 )* ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2552:1: ( ( rule__TVars__Group_1__0 )* )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2552:1: ( ( rule__TVars__Group_1__0 )* )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2553:1: ( rule__TVars__Group_1__0 )*
            {
             before(grammarAccess.getTVarsAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2554:1: ( rule__TVars__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2554:2: rule__TVars__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TVars__Group_1__0_in_rule__TVars__Group__1__Impl5238);
            	    rule__TVars__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTVarsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TVars__Group__1__Impl"


    // $ANTLR start "rule__TVars__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2568:1: rule__TVars__Group_1__0 : rule__TVars__Group_1__0__Impl rule__TVars__Group_1__1 ;
    public final void rule__TVars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2572:1: ( rule__TVars__Group_1__0__Impl rule__TVars__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2573:2: rule__TVars__Group_1__0__Impl rule__TVars__Group_1__1
            {
            pushFollow(FOLLOW_rule__TVars__Group_1__0__Impl_in_rule__TVars__Group_1__05273);
            rule__TVars__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TVars__Group_1__1_in_rule__TVars__Group_1__05276);
            rule__TVars__Group_1__1();

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
    // $ANTLR end "rule__TVars__Group_1__0"


    // $ANTLR start "rule__TVars__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2580:1: rule__TVars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TVars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2584:1: ( ( ',' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2585:1: ( ',' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2585:1: ( ',' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2586:1: ','
            {
             before(grammarAccess.getTVarsAccess().getCommaKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__TVars__Group_1__0__Impl5304); 
             after(grammarAccess.getTVarsAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__TVars__Group_1__0__Impl"


    // $ANTLR start "rule__TVars__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2599:1: rule__TVars__Group_1__1 : rule__TVars__Group_1__1__Impl ;
    public final void rule__TVars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2603:1: ( rule__TVars__Group_1__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2604:2: rule__TVars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TVars__Group_1__1__Impl_in_rule__TVars__Group_1__15335);
            rule__TVars__Group_1__1__Impl();

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
    // $ANTLR end "rule__TVars__Group_1__1"


    // $ANTLR start "rule__TVars__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2610:1: rule__TVars__Group_1__1__Impl : ( ( rule__TVars__CdrAssignment_1_1 ) ) ;
    public final void rule__TVars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2614:1: ( ( ( rule__TVars__CdrAssignment_1_1 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2615:1: ( ( rule__TVars__CdrAssignment_1_1 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2615:1: ( ( rule__TVars__CdrAssignment_1_1 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2616:1: ( rule__TVars__CdrAssignment_1_1 )
            {
             before(grammarAccess.getTVarsAccess().getCdrAssignment_1_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2617:1: ( rule__TVars__CdrAssignment_1_1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2617:2: rule__TVars__CdrAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TVars__CdrAssignment_1_1_in_rule__TVars__Group_1__1__Impl5362);
            rule__TVars__CdrAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTVarsAccess().getCdrAssignment_1_1()); 

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
    // $ANTLR end "rule__TVars__Group_1__1__Impl"


    // $ANTLR start "rule__TVar__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2631:1: rule__TVar__Group__0 : rule__TVar__Group__0__Impl rule__TVar__Group__1 ;
    public final void rule__TVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2635:1: ( rule__TVar__Group__0__Impl rule__TVar__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2636:2: rule__TVar__Group__0__Impl rule__TVar__Group__1
            {
            pushFollow(FOLLOW_rule__TVar__Group__0__Impl_in_rule__TVar__Group__05396);
            rule__TVar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TVar__Group__1_in_rule__TVar__Group__05399);
            rule__TVar__Group__1();

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
    // $ANTLR end "rule__TVar__Group__0"


    // $ANTLR start "rule__TVar__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2643:1: rule__TVar__Group__0__Impl : ( ruleVariable ) ;
    public final void rule__TVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2647:1: ( ( ruleVariable ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2648:1: ( ruleVariable )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2648:1: ( ruleVariable )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2649:1: ruleVariable
            {
             before(grammarAccess.getTVarAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__TVar__Group__0__Impl5426);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getTVarAccess().getVariableParserRuleCall_0()); 

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
    // $ANTLR end "rule__TVar__Group__0__Impl"


    // $ANTLR start "rule__TVar__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2660:1: rule__TVar__Group__1 : rule__TVar__Group__1__Impl rule__TVar__Group__2 ;
    public final void rule__TVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2664:1: ( rule__TVar__Group__1__Impl rule__TVar__Group__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2665:2: rule__TVar__Group__1__Impl rule__TVar__Group__2
            {
            pushFollow(FOLLOW_rule__TVar__Group__1__Impl_in_rule__TVar__Group__15455);
            rule__TVar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TVar__Group__2_in_rule__TVar__Group__15458);
            rule__TVar__Group__2();

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
    // $ANTLR end "rule__TVar__Group__1"


    // $ANTLR start "rule__TVar__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2672:1: rule__TVar__Group__1__Impl : ( 'in' ) ;
    public final void rule__TVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2676:1: ( ( 'in' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2677:1: ( 'in' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2677:1: ( 'in' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2678:1: 'in'
            {
             before(grammarAccess.getTVarAccess().getInKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__TVar__Group__1__Impl5486); 
             after(grammarAccess.getTVarAccess().getInKeyword_1()); 

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
    // $ANTLR end "rule__TVar__Group__1__Impl"


    // $ANTLR start "rule__TVar__Group__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2691:1: rule__TVar__Group__2 : rule__TVar__Group__2__Impl ;
    public final void rule__TVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2695:1: ( rule__TVar__Group__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2696:2: rule__TVar__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TVar__Group__2__Impl_in_rule__TVar__Group__25517);
            rule__TVar__Group__2__Impl();

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
    // $ANTLR end "rule__TVar__Group__2"


    // $ANTLR start "rule__TVar__Group__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2702:1: rule__TVar__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__TVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2706:1: ( ( RULE_ID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2707:1: ( RULE_ID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2707:1: ( RULE_ID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2708:1: RULE_ID
            {
             before(grammarAccess.getTVarAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TVar__Group__2__Impl5544); 
             after(grammarAccess.getTVarAccess().getIDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__TVar__Group__2__Impl"


    // $ANTLR start "rule__SetAddition__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2725:1: rule__SetAddition__Group__0 : rule__SetAddition__Group__0__Impl rule__SetAddition__Group__1 ;
    public final void rule__SetAddition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2729:1: ( rule__SetAddition__Group__0__Impl rule__SetAddition__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2730:2: rule__SetAddition__Group__0__Impl rule__SetAddition__Group__1
            {
            pushFollow(FOLLOW_rule__SetAddition__Group__0__Impl_in_rule__SetAddition__Group__05579);
            rule__SetAddition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetAddition__Group__1_in_rule__SetAddition__Group__05582);
            rule__SetAddition__Group__1();

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
    // $ANTLR end "rule__SetAddition__Group__0"


    // $ANTLR start "rule__SetAddition__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2737:1: rule__SetAddition__Group__0__Impl : ( ruleSetMultiplication ) ;
    public final void rule__SetAddition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2741:1: ( ( ruleSetMultiplication ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2742:1: ( ruleSetMultiplication )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2742:1: ( ruleSetMultiplication )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2743:1: ruleSetMultiplication
            {
             before(grammarAccess.getSetAdditionAccess().getSetMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSetMultiplication_in_rule__SetAddition__Group__0__Impl5609);
            ruleSetMultiplication();

            state._fsp--;

             after(grammarAccess.getSetAdditionAccess().getSetMultiplicationParserRuleCall_0()); 

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
    // $ANTLR end "rule__SetAddition__Group__0__Impl"


    // $ANTLR start "rule__SetAddition__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2754:1: rule__SetAddition__Group__1 : rule__SetAddition__Group__1__Impl ;
    public final void rule__SetAddition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2758:1: ( rule__SetAddition__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2759:2: rule__SetAddition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SetAddition__Group__1__Impl_in_rule__SetAddition__Group__15638);
            rule__SetAddition__Group__1__Impl();

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
    // $ANTLR end "rule__SetAddition__Group__1"


    // $ANTLR start "rule__SetAddition__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2765:1: rule__SetAddition__Group__1__Impl : ( ( rule__SetAddition__Group_1__0 )* ) ;
    public final void rule__SetAddition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2769:1: ( ( ( rule__SetAddition__Group_1__0 )* ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2770:1: ( ( rule__SetAddition__Group_1__0 )* )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2770:1: ( ( rule__SetAddition__Group_1__0 )* )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2771:1: ( rule__SetAddition__Group_1__0 )*
            {
             before(grammarAccess.getSetAdditionAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2772:1: ( rule__SetAddition__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2772:2: rule__SetAddition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SetAddition__Group_1__0_in_rule__SetAddition__Group__1__Impl5665);
            	    rule__SetAddition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSetAdditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SetAddition__Group__1__Impl"


    // $ANTLR start "rule__SetAddition__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2786:1: rule__SetAddition__Group_1__0 : rule__SetAddition__Group_1__0__Impl rule__SetAddition__Group_1__1 ;
    public final void rule__SetAddition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2790:1: ( rule__SetAddition__Group_1__0__Impl rule__SetAddition__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2791:2: rule__SetAddition__Group_1__0__Impl rule__SetAddition__Group_1__1
            {
            pushFollow(FOLLOW_rule__SetAddition__Group_1__0__Impl_in_rule__SetAddition__Group_1__05700);
            rule__SetAddition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetAddition__Group_1__1_in_rule__SetAddition__Group_1__05703);
            rule__SetAddition__Group_1__1();

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
    // $ANTLR end "rule__SetAddition__Group_1__0"


    // $ANTLR start "rule__SetAddition__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2798:1: rule__SetAddition__Group_1__0__Impl : ( () ) ;
    public final void rule__SetAddition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2802:1: ( ( () ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2803:1: ( () )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2803:1: ( () )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2804:1: ()
            {
             before(grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2805:1: ()
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2807:1: 
            {
            }

             after(grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group_1__0__Impl"


    // $ANTLR start "rule__SetAddition__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2817:1: rule__SetAddition__Group_1__1 : rule__SetAddition__Group_1__1__Impl rule__SetAddition__Group_1__2 ;
    public final void rule__SetAddition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2821:1: ( rule__SetAddition__Group_1__1__Impl rule__SetAddition__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2822:2: rule__SetAddition__Group_1__1__Impl rule__SetAddition__Group_1__2
            {
            pushFollow(FOLLOW_rule__SetAddition__Group_1__1__Impl_in_rule__SetAddition__Group_1__15761);
            rule__SetAddition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetAddition__Group_1__2_in_rule__SetAddition__Group_1__15764);
            rule__SetAddition__Group_1__2();

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
    // $ANTLR end "rule__SetAddition__Group_1__1"


    // $ANTLR start "rule__SetAddition__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2829:1: rule__SetAddition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__SetAddition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2833:1: ( ( '+' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2834:1: ( '+' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2834:1: ( '+' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2835:1: '+'
            {
             before(grammarAccess.getSetAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,13,FOLLOW_13_in_rule__SetAddition__Group_1__1__Impl5792); 
             after(grammarAccess.getSetAdditionAccess().getPlusSignKeyword_1_1()); 

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
    // $ANTLR end "rule__SetAddition__Group_1__1__Impl"


    // $ANTLR start "rule__SetAddition__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2848:1: rule__SetAddition__Group_1__2 : rule__SetAddition__Group_1__2__Impl ;
    public final void rule__SetAddition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2852:1: ( rule__SetAddition__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2853:2: rule__SetAddition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SetAddition__Group_1__2__Impl_in_rule__SetAddition__Group_1__25823);
            rule__SetAddition__Group_1__2__Impl();

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
    // $ANTLR end "rule__SetAddition__Group_1__2"


    // $ANTLR start "rule__SetAddition__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2859:1: rule__SetAddition__Group_1__2__Impl : ( ( rule__SetAddition__RightAssignment_1_2 ) ) ;
    public final void rule__SetAddition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2863:1: ( ( ( rule__SetAddition__RightAssignment_1_2 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2864:1: ( ( rule__SetAddition__RightAssignment_1_2 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2864:1: ( ( rule__SetAddition__RightAssignment_1_2 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2865:1: ( rule__SetAddition__RightAssignment_1_2 )
            {
             before(grammarAccess.getSetAdditionAccess().getRightAssignment_1_2()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2866:1: ( rule__SetAddition__RightAssignment_1_2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2866:2: rule__SetAddition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SetAddition__RightAssignment_1_2_in_rule__SetAddition__Group_1__2__Impl5850);
            rule__SetAddition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSetAdditionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__SetAddition__Group_1__2__Impl"


    // $ANTLR start "rule__SetMultiplication__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2882:1: rule__SetMultiplication__Group__0 : rule__SetMultiplication__Group__0__Impl rule__SetMultiplication__Group__1 ;
    public final void rule__SetMultiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2886:1: ( rule__SetMultiplication__Group__0__Impl rule__SetMultiplication__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2887:2: rule__SetMultiplication__Group__0__Impl rule__SetMultiplication__Group__1
            {
            pushFollow(FOLLOW_rule__SetMultiplication__Group__0__Impl_in_rule__SetMultiplication__Group__05886);
            rule__SetMultiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetMultiplication__Group__1_in_rule__SetMultiplication__Group__05889);
            rule__SetMultiplication__Group__1();

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
    // $ANTLR end "rule__SetMultiplication__Group__0"


    // $ANTLR start "rule__SetMultiplication__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2894:1: rule__SetMultiplication__Group__0__Impl : ( ruleSetPrimary ) ;
    public final void rule__SetMultiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2898:1: ( ( ruleSetPrimary ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2899:1: ( ruleSetPrimary )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2899:1: ( ruleSetPrimary )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2900:1: ruleSetPrimary
            {
             before(grammarAccess.getSetMultiplicationAccess().getSetPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSetPrimary_in_rule__SetMultiplication__Group__0__Impl5916);
            ruleSetPrimary();

            state._fsp--;

             after(grammarAccess.getSetMultiplicationAccess().getSetPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__SetMultiplication__Group__0__Impl"


    // $ANTLR start "rule__SetMultiplication__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2911:1: rule__SetMultiplication__Group__1 : rule__SetMultiplication__Group__1__Impl ;
    public final void rule__SetMultiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2915:1: ( rule__SetMultiplication__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2916:2: rule__SetMultiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SetMultiplication__Group__1__Impl_in_rule__SetMultiplication__Group__15945);
            rule__SetMultiplication__Group__1__Impl();

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
    // $ANTLR end "rule__SetMultiplication__Group__1"


    // $ANTLR start "rule__SetMultiplication__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2922:1: rule__SetMultiplication__Group__1__Impl : ( ( rule__SetMultiplication__Group_1__0 )* ) ;
    public final void rule__SetMultiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2926:1: ( ( ( rule__SetMultiplication__Group_1__0 )* ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2927:1: ( ( rule__SetMultiplication__Group_1__0 )* )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2927:1: ( ( rule__SetMultiplication__Group_1__0 )* )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2928:1: ( rule__SetMultiplication__Group_1__0 )*
            {
             before(grammarAccess.getSetMultiplicationAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2929:1: ( rule__SetMultiplication__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15||LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2929:2: rule__SetMultiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SetMultiplication__Group_1__0_in_rule__SetMultiplication__Group__1__Impl5972);
            	    rule__SetMultiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSetMultiplicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SetMultiplication__Group__1__Impl"


    // $ANTLR start "rule__SetMultiplication__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2943:1: rule__SetMultiplication__Group_1__0 : rule__SetMultiplication__Group_1__0__Impl rule__SetMultiplication__Group_1__1 ;
    public final void rule__SetMultiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2947:1: ( rule__SetMultiplication__Group_1__0__Impl rule__SetMultiplication__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2948:2: rule__SetMultiplication__Group_1__0__Impl rule__SetMultiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__SetMultiplication__Group_1__0__Impl_in_rule__SetMultiplication__Group_1__06007);
            rule__SetMultiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetMultiplication__Group_1__1_in_rule__SetMultiplication__Group_1__06010);
            rule__SetMultiplication__Group_1__1();

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
    // $ANTLR end "rule__SetMultiplication__Group_1__0"


    // $ANTLR start "rule__SetMultiplication__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2955:1: rule__SetMultiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__SetMultiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2959:1: ( ( () ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2960:1: ( () )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2960:1: ( () )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2961:1: ()
            {
             before(grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2962:1: ()
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2964:1: 
            {
            }

             after(grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group_1__0__Impl"


    // $ANTLR start "rule__SetMultiplication__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2974:1: rule__SetMultiplication__Group_1__1 : rule__SetMultiplication__Group_1__1__Impl rule__SetMultiplication__Group_1__2 ;
    public final void rule__SetMultiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2978:1: ( rule__SetMultiplication__Group_1__1__Impl rule__SetMultiplication__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2979:2: rule__SetMultiplication__Group_1__1__Impl rule__SetMultiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__SetMultiplication__Group_1__1__Impl_in_rule__SetMultiplication__Group_1__16068);
            rule__SetMultiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetMultiplication__Group_1__2_in_rule__SetMultiplication__Group_1__16071);
            rule__SetMultiplication__Group_1__2();

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
    // $ANTLR end "rule__SetMultiplication__Group_1__1"


    // $ANTLR start "rule__SetMultiplication__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2986:1: rule__SetMultiplication__Group_1__1__Impl : ( ( rule__SetMultiplication__Alternatives_1_1 ) ) ;
    public final void rule__SetMultiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2990:1: ( ( ( rule__SetMultiplication__Alternatives_1_1 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2991:1: ( ( rule__SetMultiplication__Alternatives_1_1 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2991:1: ( ( rule__SetMultiplication__Alternatives_1_1 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2992:1: ( rule__SetMultiplication__Alternatives_1_1 )
            {
             before(grammarAccess.getSetMultiplicationAccess().getAlternatives_1_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2993:1: ( rule__SetMultiplication__Alternatives_1_1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:2993:2: rule__SetMultiplication__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__SetMultiplication__Alternatives_1_1_in_rule__SetMultiplication__Group_1__1__Impl6098);
            rule__SetMultiplication__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetMultiplicationAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__SetMultiplication__Group_1__1__Impl"


    // $ANTLR start "rule__SetMultiplication__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3003:1: rule__SetMultiplication__Group_1__2 : rule__SetMultiplication__Group_1__2__Impl ;
    public final void rule__SetMultiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3007:1: ( rule__SetMultiplication__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3008:2: rule__SetMultiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SetMultiplication__Group_1__2__Impl_in_rule__SetMultiplication__Group_1__26128);
            rule__SetMultiplication__Group_1__2__Impl();

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
    // $ANTLR end "rule__SetMultiplication__Group_1__2"


    // $ANTLR start "rule__SetMultiplication__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3014:1: rule__SetMultiplication__Group_1__2__Impl : ( ( rule__SetMultiplication__RightAssignment_1_2 ) ) ;
    public final void rule__SetMultiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3018:1: ( ( ( rule__SetMultiplication__RightAssignment_1_2 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3019:1: ( ( rule__SetMultiplication__RightAssignment_1_2 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3019:1: ( ( rule__SetMultiplication__RightAssignment_1_2 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3020:1: ( rule__SetMultiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getSetMultiplicationAccess().getRightAssignment_1_2()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3021:1: ( rule__SetMultiplication__RightAssignment_1_2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3021:2: rule__SetMultiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SetMultiplication__RightAssignment_1_2_in_rule__SetMultiplication__Group_1__2__Impl6155);
            rule__SetMultiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSetMultiplicationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__SetMultiplication__Group_1__2__Impl"


    // $ANTLR start "rule__SetPrimary__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3037:1: rule__SetPrimary__Group_1__0 : rule__SetPrimary__Group_1__0__Impl rule__SetPrimary__Group_1__1 ;
    public final void rule__SetPrimary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3041:1: ( rule__SetPrimary__Group_1__0__Impl rule__SetPrimary__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3042:2: rule__SetPrimary__Group_1__0__Impl rule__SetPrimary__Group_1__1
            {
            pushFollow(FOLLOW_rule__SetPrimary__Group_1__0__Impl_in_rule__SetPrimary__Group_1__06191);
            rule__SetPrimary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetPrimary__Group_1__1_in_rule__SetPrimary__Group_1__06194);
            rule__SetPrimary__Group_1__1();

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
    // $ANTLR end "rule__SetPrimary__Group_1__0"


    // $ANTLR start "rule__SetPrimary__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3049:1: rule__SetPrimary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SetPrimary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3053:1: ( ( '(' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3054:1: ( '(' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3054:1: ( '(' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3055:1: '('
            {
             before(grammarAccess.getSetPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__SetPrimary__Group_1__0__Impl6222); 
             after(grammarAccess.getSetPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__SetPrimary__Group_1__0__Impl"


    // $ANTLR start "rule__SetPrimary__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3068:1: rule__SetPrimary__Group_1__1 : rule__SetPrimary__Group_1__1__Impl rule__SetPrimary__Group_1__2 ;
    public final void rule__SetPrimary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3072:1: ( rule__SetPrimary__Group_1__1__Impl rule__SetPrimary__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3073:2: rule__SetPrimary__Group_1__1__Impl rule__SetPrimary__Group_1__2
            {
            pushFollow(FOLLOW_rule__SetPrimary__Group_1__1__Impl_in_rule__SetPrimary__Group_1__16253);
            rule__SetPrimary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetPrimary__Group_1__2_in_rule__SetPrimary__Group_1__16256);
            rule__SetPrimary__Group_1__2();

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
    // $ANTLR end "rule__SetPrimary__Group_1__1"


    // $ANTLR start "rule__SetPrimary__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3080:1: rule__SetPrimary__Group_1__1__Impl : ( ruleSetAddition ) ;
    public final void rule__SetPrimary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3084:1: ( ( ruleSetAddition ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3085:1: ( ruleSetAddition )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3085:1: ( ruleSetAddition )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3086:1: ruleSetAddition
            {
             before(grammarAccess.getSetPrimaryAccess().getSetAdditionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSetAddition_in_rule__SetPrimary__Group_1__1__Impl6283);
            ruleSetAddition();

            state._fsp--;

             after(grammarAccess.getSetPrimaryAccess().getSetAdditionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__SetPrimary__Group_1__1__Impl"


    // $ANTLR start "rule__SetPrimary__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3097:1: rule__SetPrimary__Group_1__2 : rule__SetPrimary__Group_1__2__Impl ;
    public final void rule__SetPrimary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3101:1: ( rule__SetPrimary__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3102:2: rule__SetPrimary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SetPrimary__Group_1__2__Impl_in_rule__SetPrimary__Group_1__26312);
            rule__SetPrimary__Group_1__2__Impl();

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
    // $ANTLR end "rule__SetPrimary__Group_1__2"


    // $ANTLR start "rule__SetPrimary__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3108:1: rule__SetPrimary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SetPrimary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3112:1: ( ( ')' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3113:1: ( ')' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3113:1: ( ')' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3114:1: ')'
            {
             before(grammarAccess.getSetPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,31,FOLLOW_31_in_rule__SetPrimary__Group_1__2__Impl6340); 
             after(grammarAccess.getSetPrimaryAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__SetPrimary__Group_1__2__Impl"


    // $ANTLR start "rule__QuantifiedTerm__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3133:1: rule__QuantifiedTerm__Group__0 : rule__QuantifiedTerm__Group__0__Impl rule__QuantifiedTerm__Group__1 ;
    public final void rule__QuantifiedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3137:1: ( rule__QuantifiedTerm__Group__0__Impl rule__QuantifiedTerm__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3138:2: rule__QuantifiedTerm__Group__0__Impl rule__QuantifiedTerm__Group__1
            {
            pushFollow(FOLLOW_rule__QuantifiedTerm__Group__0__Impl_in_rule__QuantifiedTerm__Group__06377);
            rule__QuantifiedTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedTerm__Group__1_in_rule__QuantifiedTerm__Group__06380);
            rule__QuantifiedTerm__Group__1();

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
    // $ANTLR end "rule__QuantifiedTerm__Group__0"


    // $ANTLR start "rule__QuantifiedTerm__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3145:1: rule__QuantifiedTerm__Group__0__Impl : ( ruleQuantifier ) ;
    public final void rule__QuantifiedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3149:1: ( ( ruleQuantifier ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3150:1: ( ruleQuantifier )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3150:1: ( ruleQuantifier )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3151:1: ruleQuantifier
            {
             before(grammarAccess.getQuantifiedTermAccess().getQuantifierParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQuantifier_in_rule__QuantifiedTerm__Group__0__Impl6407);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getQuantifiedTermAccess().getQuantifierParserRuleCall_0()); 

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
    // $ANTLR end "rule__QuantifiedTerm__Group__0__Impl"


    // $ANTLR start "rule__QuantifiedTerm__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3162:1: rule__QuantifiedTerm__Group__1 : rule__QuantifiedTerm__Group__1__Impl rule__QuantifiedTerm__Group__2 ;
    public final void rule__QuantifiedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3166:1: ( rule__QuantifiedTerm__Group__1__Impl rule__QuantifiedTerm__Group__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3167:2: rule__QuantifiedTerm__Group__1__Impl rule__QuantifiedTerm__Group__2
            {
            pushFollow(FOLLOW_rule__QuantifiedTerm__Group__1__Impl_in_rule__QuantifiedTerm__Group__16436);
            rule__QuantifiedTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedTerm__Group__2_in_rule__QuantifiedTerm__Group__16439);
            rule__QuantifiedTerm__Group__2();

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
    // $ANTLR end "rule__QuantifiedTerm__Group__1"


    // $ANTLR start "rule__QuantifiedTerm__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3174:1: rule__QuantifiedTerm__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QuantifiedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3178:1: ( ( RULE_ID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3179:1: ( RULE_ID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3179:1: ( RULE_ID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3180:1: RULE_ID
            {
             before(grammarAccess.getQuantifiedTermAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QuantifiedTerm__Group__1__Impl6466); 
             after(grammarAccess.getQuantifiedTermAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__QuantifiedTerm__Group__1__Impl"


    // $ANTLR start "rule__QuantifiedTerm__Group__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3191:1: rule__QuantifiedTerm__Group__2 : rule__QuantifiedTerm__Group__2__Impl ;
    public final void rule__QuantifiedTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3195:1: ( rule__QuantifiedTerm__Group__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3196:2: rule__QuantifiedTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QuantifiedTerm__Group__2__Impl_in_rule__QuantifiedTerm__Group__26495);
            rule__QuantifiedTerm__Group__2__Impl();

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
    // $ANTLR end "rule__QuantifiedTerm__Group__2"


    // $ANTLR start "rule__QuantifiedTerm__Group__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3202:1: rule__QuantifiedTerm__Group__2__Impl : ( ruleVariable ) ;
    public final void rule__QuantifiedTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3206:1: ( ( ruleVariable ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3207:1: ( ruleVariable )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3207:1: ( ruleVariable )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3208:1: ruleVariable
            {
             before(grammarAccess.getQuantifiedTermAccess().getVariableParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__QuantifiedTerm__Group__2__Impl6522);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getQuantifiedTermAccess().getVariableParserRuleCall_2()); 

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
    // $ANTLR end "rule__QuantifiedTerm__Group__2__Impl"


    // $ANTLR start "rule__PredicateAtom__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3225:1: rule__PredicateAtom__Group__0 : rule__PredicateAtom__Group__0__Impl rule__PredicateAtom__Group__1 ;
    public final void rule__PredicateAtom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3229:1: ( rule__PredicateAtom__Group__0__Impl rule__PredicateAtom__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3230:2: rule__PredicateAtom__Group__0__Impl rule__PredicateAtom__Group__1
            {
            pushFollow(FOLLOW_rule__PredicateAtom__Group__0__Impl_in_rule__PredicateAtom__Group__06557);
            rule__PredicateAtom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateAtom__Group__1_in_rule__PredicateAtom__Group__06560);
            rule__PredicateAtom__Group__1();

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
    // $ANTLR end "rule__PredicateAtom__Group__0"


    // $ANTLR start "rule__PredicateAtom__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3237:1: rule__PredicateAtom__Group__0__Impl : ( ( rule__PredicateAtom__FidAssignment_0 ) ) ;
    public final void rule__PredicateAtom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3241:1: ( ( ( rule__PredicateAtom__FidAssignment_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3242:1: ( ( rule__PredicateAtom__FidAssignment_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3242:1: ( ( rule__PredicateAtom__FidAssignment_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3243:1: ( rule__PredicateAtom__FidAssignment_0 )
            {
             before(grammarAccess.getPredicateAtomAccess().getFidAssignment_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3244:1: ( rule__PredicateAtom__FidAssignment_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3244:2: rule__PredicateAtom__FidAssignment_0
            {
            pushFollow(FOLLOW_rule__PredicateAtom__FidAssignment_0_in_rule__PredicateAtom__Group__0__Impl6587);
            rule__PredicateAtom__FidAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAtomAccess().getFidAssignment_0()); 

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
    // $ANTLR end "rule__PredicateAtom__Group__0__Impl"


    // $ANTLR start "rule__PredicateAtom__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3254:1: rule__PredicateAtom__Group__1 : rule__PredicateAtom__Group__1__Impl ;
    public final void rule__PredicateAtom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3258:1: ( rule__PredicateAtom__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3259:2: rule__PredicateAtom__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PredicateAtom__Group__1__Impl_in_rule__PredicateAtom__Group__16617);
            rule__PredicateAtom__Group__1__Impl();

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
    // $ANTLR end "rule__PredicateAtom__Group__1"


    // $ANTLR start "rule__PredicateAtom__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3265:1: rule__PredicateAtom__Group__1__Impl : ( ( rule__PredicateAtom__Group_1__0 )? ) ;
    public final void rule__PredicateAtom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3269:1: ( ( ( rule__PredicateAtom__Group_1__0 )? ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3270:1: ( ( rule__PredicateAtom__Group_1__0 )? )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3270:1: ( ( rule__PredicateAtom__Group_1__0 )? )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3271:1: ( rule__PredicateAtom__Group_1__0 )?
            {
             before(grammarAccess.getPredicateAtomAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3272:1: ( rule__PredicateAtom__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3272:2: rule__PredicateAtom__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PredicateAtom__Group_1__0_in_rule__PredicateAtom__Group__1__Impl6644);
                    rule__PredicateAtom__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicateAtomAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PredicateAtom__Group__1__Impl"


    // $ANTLR start "rule__PredicateAtom__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3286:1: rule__PredicateAtom__Group_1__0 : rule__PredicateAtom__Group_1__0__Impl rule__PredicateAtom__Group_1__1 ;
    public final void rule__PredicateAtom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3290:1: ( rule__PredicateAtom__Group_1__0__Impl rule__PredicateAtom__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3291:2: rule__PredicateAtom__Group_1__0__Impl rule__PredicateAtom__Group_1__1
            {
            pushFollow(FOLLOW_rule__PredicateAtom__Group_1__0__Impl_in_rule__PredicateAtom__Group_1__06679);
            rule__PredicateAtom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateAtom__Group_1__1_in_rule__PredicateAtom__Group_1__06682);
            rule__PredicateAtom__Group_1__1();

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
    // $ANTLR end "rule__PredicateAtom__Group_1__0"


    // $ANTLR start "rule__PredicateAtom__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3298:1: rule__PredicateAtom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PredicateAtom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3302:1: ( ( '(' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3303:1: ( '(' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3303:1: ( '(' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3304:1: '('
            {
             before(grammarAccess.getPredicateAtomAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__PredicateAtom__Group_1__0__Impl6710); 
             after(grammarAccess.getPredicateAtomAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__PredicateAtom__Group_1__0__Impl"


    // $ANTLR start "rule__PredicateAtom__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3317:1: rule__PredicateAtom__Group_1__1 : rule__PredicateAtom__Group_1__1__Impl rule__PredicateAtom__Group_1__2 ;
    public final void rule__PredicateAtom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3321:1: ( rule__PredicateAtom__Group_1__1__Impl rule__PredicateAtom__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3322:2: rule__PredicateAtom__Group_1__1__Impl rule__PredicateAtom__Group_1__2
            {
            pushFollow(FOLLOW_rule__PredicateAtom__Group_1__1__Impl_in_rule__PredicateAtom__Group_1__16741);
            rule__PredicateAtom__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PredicateAtom__Group_1__2_in_rule__PredicateAtom__Group_1__16744);
            rule__PredicateAtom__Group_1__2();

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
    // $ANTLR end "rule__PredicateAtom__Group_1__1"


    // $ANTLR start "rule__PredicateAtom__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3329:1: rule__PredicateAtom__Group_1__1__Impl : ( ( rule__PredicateAtom__TermsAssignment_1_1 ) ) ;
    public final void rule__PredicateAtom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3333:1: ( ( ( rule__PredicateAtom__TermsAssignment_1_1 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3334:1: ( ( rule__PredicateAtom__TermsAssignment_1_1 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3334:1: ( ( rule__PredicateAtom__TermsAssignment_1_1 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3335:1: ( rule__PredicateAtom__TermsAssignment_1_1 )
            {
             before(grammarAccess.getPredicateAtomAccess().getTermsAssignment_1_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3336:1: ( rule__PredicateAtom__TermsAssignment_1_1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3336:2: rule__PredicateAtom__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PredicateAtom__TermsAssignment_1_1_in_rule__PredicateAtom__Group_1__1__Impl6771);
            rule__PredicateAtom__TermsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAtomAccess().getTermsAssignment_1_1()); 

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
    // $ANTLR end "rule__PredicateAtom__Group_1__1__Impl"


    // $ANTLR start "rule__PredicateAtom__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3346:1: rule__PredicateAtom__Group_1__2 : rule__PredicateAtom__Group_1__2__Impl ;
    public final void rule__PredicateAtom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3350:1: ( rule__PredicateAtom__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3351:2: rule__PredicateAtom__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PredicateAtom__Group_1__2__Impl_in_rule__PredicateAtom__Group_1__26801);
            rule__PredicateAtom__Group_1__2__Impl();

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
    // $ANTLR end "rule__PredicateAtom__Group_1__2"


    // $ANTLR start "rule__PredicateAtom__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3357:1: rule__PredicateAtom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PredicateAtom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3361:1: ( ( ')' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3362:1: ( ')' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3362:1: ( ')' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3363:1: ')'
            {
             before(grammarAccess.getPredicateAtomAccess().getRightParenthesisKeyword_1_2()); 
            match(input,31,FOLLOW_31_in_rule__PredicateAtom__Group_1__2__Impl6829); 
             after(grammarAccess.getPredicateAtomAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__PredicateAtom__Group_1__2__Impl"


    // $ANTLR start "rule__BuiltInAtom__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3382:1: rule__BuiltInAtom__Group__0 : rule__BuiltInAtom__Group__0__Impl rule__BuiltInAtom__Group__1 ;
    public final void rule__BuiltInAtom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3386:1: ( rule__BuiltInAtom__Group__0__Impl rule__BuiltInAtom__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3387:2: rule__BuiltInAtom__Group__0__Impl rule__BuiltInAtom__Group__1
            {
            pushFollow(FOLLOW_rule__BuiltInAtom__Group__0__Impl_in_rule__BuiltInAtom__Group__06866);
            rule__BuiltInAtom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BuiltInAtom__Group__1_in_rule__BuiltInAtom__Group__06869);
            rule__BuiltInAtom__Group__1();

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
    // $ANTLR end "rule__BuiltInAtom__Group__0"


    // $ANTLR start "rule__BuiltInAtom__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3394:1: rule__BuiltInAtom__Group__0__Impl : ( ( rule__BuiltInAtom__LhsAssignment_0 ) ) ;
    public final void rule__BuiltInAtom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3398:1: ( ( ( rule__BuiltInAtom__LhsAssignment_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3399:1: ( ( rule__BuiltInAtom__LhsAssignment_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3399:1: ( ( rule__BuiltInAtom__LhsAssignment_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3400:1: ( rule__BuiltInAtom__LhsAssignment_0 )
            {
             before(grammarAccess.getBuiltInAtomAccess().getLhsAssignment_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3401:1: ( rule__BuiltInAtom__LhsAssignment_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3401:2: rule__BuiltInAtom__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__BuiltInAtom__LhsAssignment_0_in_rule__BuiltInAtom__Group__0__Impl6896);
            rule__BuiltInAtom__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInAtomAccess().getLhsAssignment_0()); 

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
    // $ANTLR end "rule__BuiltInAtom__Group__0__Impl"


    // $ANTLR start "rule__BuiltInAtom__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3411:1: rule__BuiltInAtom__Group__1 : rule__BuiltInAtom__Group__1__Impl rule__BuiltInAtom__Group__2 ;
    public final void rule__BuiltInAtom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3415:1: ( rule__BuiltInAtom__Group__1__Impl rule__BuiltInAtom__Group__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3416:2: rule__BuiltInAtom__Group__1__Impl rule__BuiltInAtom__Group__2
            {
            pushFollow(FOLLOW_rule__BuiltInAtom__Group__1__Impl_in_rule__BuiltInAtom__Group__16926);
            rule__BuiltInAtom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BuiltInAtom__Group__2_in_rule__BuiltInAtom__Group__16929);
            rule__BuiltInAtom__Group__2();

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
    // $ANTLR end "rule__BuiltInAtom__Group__1"


    // $ANTLR start "rule__BuiltInAtom__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3423:1: rule__BuiltInAtom__Group__1__Impl : ( ( rule__BuiltInAtom__OpAssignment_1 ) ) ;
    public final void rule__BuiltInAtom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3427:1: ( ( ( rule__BuiltInAtom__OpAssignment_1 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3428:1: ( ( rule__BuiltInAtom__OpAssignment_1 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3428:1: ( ( rule__BuiltInAtom__OpAssignment_1 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3429:1: ( rule__BuiltInAtom__OpAssignment_1 )
            {
             before(grammarAccess.getBuiltInAtomAccess().getOpAssignment_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3430:1: ( rule__BuiltInAtom__OpAssignment_1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3430:2: rule__BuiltInAtom__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__BuiltInAtom__OpAssignment_1_in_rule__BuiltInAtom__Group__1__Impl6956);
            rule__BuiltInAtom__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInAtomAccess().getOpAssignment_1()); 

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
    // $ANTLR end "rule__BuiltInAtom__Group__1__Impl"


    // $ANTLR start "rule__BuiltInAtom__Group__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3440:1: rule__BuiltInAtom__Group__2 : rule__BuiltInAtom__Group__2__Impl ;
    public final void rule__BuiltInAtom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3444:1: ( rule__BuiltInAtom__Group__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3445:2: rule__BuiltInAtom__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BuiltInAtom__Group__2__Impl_in_rule__BuiltInAtom__Group__26986);
            rule__BuiltInAtom__Group__2__Impl();

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
    // $ANTLR end "rule__BuiltInAtom__Group__2"


    // $ANTLR start "rule__BuiltInAtom__Group__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3451:1: rule__BuiltInAtom__Group__2__Impl : ( ( rule__BuiltInAtom__RhsAssignment_2 ) ) ;
    public final void rule__BuiltInAtom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3455:1: ( ( ( rule__BuiltInAtom__RhsAssignment_2 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3456:1: ( ( rule__BuiltInAtom__RhsAssignment_2 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3456:1: ( ( rule__BuiltInAtom__RhsAssignment_2 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3457:1: ( rule__BuiltInAtom__RhsAssignment_2 )
            {
             before(grammarAccess.getBuiltInAtomAccess().getRhsAssignment_2()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3458:1: ( rule__BuiltInAtom__RhsAssignment_2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3458:2: rule__BuiltInAtom__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__BuiltInAtom__RhsAssignment_2_in_rule__BuiltInAtom__Group__2__Impl7013);
            rule__BuiltInAtom__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInAtomAccess().getRhsAssignment_2()); 

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
    // $ANTLR end "rule__BuiltInAtom__Group__2__Impl"


    // $ANTLR start "rule__OrSentence__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3474:1: rule__OrSentence__Group__0 : rule__OrSentence__Group__0__Impl rule__OrSentence__Group__1 ;
    public final void rule__OrSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3478:1: ( rule__OrSentence__Group__0__Impl rule__OrSentence__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3479:2: rule__OrSentence__Group__0__Impl rule__OrSentence__Group__1
            {
            pushFollow(FOLLOW_rule__OrSentence__Group__0__Impl_in_rule__OrSentence__Group__07049);
            rule__OrSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrSentence__Group__1_in_rule__OrSentence__Group__07052);
            rule__OrSentence__Group__1();

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
    // $ANTLR end "rule__OrSentence__Group__0"


    // $ANTLR start "rule__OrSentence__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3486:1: rule__OrSentence__Group__0__Impl : ( ruleAndSentence ) ;
    public final void rule__OrSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3490:1: ( ( ruleAndSentence ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3491:1: ( ruleAndSentence )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3491:1: ( ruleAndSentence )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3492:1: ruleAndSentence
            {
             before(grammarAccess.getOrSentenceAccess().getAndSentenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndSentence_in_rule__OrSentence__Group__0__Impl7079);
            ruleAndSentence();

            state._fsp--;

             after(grammarAccess.getOrSentenceAccess().getAndSentenceParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrSentence__Group__0__Impl"


    // $ANTLR start "rule__OrSentence__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3503:1: rule__OrSentence__Group__1 : rule__OrSentence__Group__1__Impl ;
    public final void rule__OrSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3507:1: ( rule__OrSentence__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3508:2: rule__OrSentence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrSentence__Group__1__Impl_in_rule__OrSentence__Group__17108);
            rule__OrSentence__Group__1__Impl();

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
    // $ANTLR end "rule__OrSentence__Group__1"


    // $ANTLR start "rule__OrSentence__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3514:1: rule__OrSentence__Group__1__Impl : ( ( rule__OrSentence__Group_1__0 )* ) ;
    public final void rule__OrSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3518:1: ( ( ( rule__OrSentence__Group_1__0 )* ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3519:1: ( ( rule__OrSentence__Group_1__0 )* )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3519:1: ( ( rule__OrSentence__Group_1__0 )* )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3520:1: ( rule__OrSentence__Group_1__0 )*
            {
             before(grammarAccess.getOrSentenceAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3521:1: ( rule__OrSentence__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3521:2: rule__OrSentence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrSentence__Group_1__0_in_rule__OrSentence__Group__1__Impl7135);
            	    rule__OrSentence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getOrSentenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrSentence__Group__1__Impl"


    // $ANTLR start "rule__OrSentence__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3535:1: rule__OrSentence__Group_1__0 : rule__OrSentence__Group_1__0__Impl rule__OrSentence__Group_1__1 ;
    public final void rule__OrSentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3539:1: ( rule__OrSentence__Group_1__0__Impl rule__OrSentence__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3540:2: rule__OrSentence__Group_1__0__Impl rule__OrSentence__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrSentence__Group_1__0__Impl_in_rule__OrSentence__Group_1__07170);
            rule__OrSentence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrSentence__Group_1__1_in_rule__OrSentence__Group_1__07173);
            rule__OrSentence__Group_1__1();

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
    // $ANTLR end "rule__OrSentence__Group_1__0"


    // $ANTLR start "rule__OrSentence__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3547:1: rule__OrSentence__Group_1__0__Impl : ( () ) ;
    public final void rule__OrSentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3551:1: ( ( () ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3552:1: ( () )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3552:1: ( () )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3553:1: ()
            {
             before(grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3554:1: ()
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3556:1: 
            {
            }

             after(grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group_1__0__Impl"


    // $ANTLR start "rule__OrSentence__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3566:1: rule__OrSentence__Group_1__1 : rule__OrSentence__Group_1__1__Impl rule__OrSentence__Group_1__2 ;
    public final void rule__OrSentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3570:1: ( rule__OrSentence__Group_1__1__Impl rule__OrSentence__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3571:2: rule__OrSentence__Group_1__1__Impl rule__OrSentence__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrSentence__Group_1__1__Impl_in_rule__OrSentence__Group_1__17231);
            rule__OrSentence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrSentence__Group_1__2_in_rule__OrSentence__Group_1__17234);
            rule__OrSentence__Group_1__2();

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
    // $ANTLR end "rule__OrSentence__Group_1__1"


    // $ANTLR start "rule__OrSentence__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3578:1: rule__OrSentence__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrSentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3582:1: ( ( 'or' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3583:1: ( 'or' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3583:1: ( 'or' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3584:1: 'or'
            {
             before(grammarAccess.getOrSentenceAccess().getOrKeyword_1_1()); 
            match(input,35,FOLLOW_35_in_rule__OrSentence__Group_1__1__Impl7262); 
             after(grammarAccess.getOrSentenceAccess().getOrKeyword_1_1()); 

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
    // $ANTLR end "rule__OrSentence__Group_1__1__Impl"


    // $ANTLR start "rule__OrSentence__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3597:1: rule__OrSentence__Group_1__2 : rule__OrSentence__Group_1__2__Impl ;
    public final void rule__OrSentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3601:1: ( rule__OrSentence__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3602:2: rule__OrSentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrSentence__Group_1__2__Impl_in_rule__OrSentence__Group_1__27293);
            rule__OrSentence__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrSentence__Group_1__2"


    // $ANTLR start "rule__OrSentence__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3608:1: rule__OrSentence__Group_1__2__Impl : ( ( rule__OrSentence__RightAssignment_1_2 ) ) ;
    public final void rule__OrSentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3612:1: ( ( ( rule__OrSentence__RightAssignment_1_2 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3613:1: ( ( rule__OrSentence__RightAssignment_1_2 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3613:1: ( ( rule__OrSentence__RightAssignment_1_2 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3614:1: ( rule__OrSentence__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrSentenceAccess().getRightAssignment_1_2()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3615:1: ( rule__OrSentence__RightAssignment_1_2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3615:2: rule__OrSentence__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrSentence__RightAssignment_1_2_in_rule__OrSentence__Group_1__2__Impl7320);
            rule__OrSentence__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrSentenceAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__OrSentence__Group_1__2__Impl"


    // $ANTLR start "rule__AndSentence__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3631:1: rule__AndSentence__Group__0 : rule__AndSentence__Group__0__Impl rule__AndSentence__Group__1 ;
    public final void rule__AndSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3635:1: ( rule__AndSentence__Group__0__Impl rule__AndSentence__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3636:2: rule__AndSentence__Group__0__Impl rule__AndSentence__Group__1
            {
            pushFollow(FOLLOW_rule__AndSentence__Group__0__Impl_in_rule__AndSentence__Group__07356);
            rule__AndSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndSentence__Group__1_in_rule__AndSentence__Group__07359);
            rule__AndSentence__Group__1();

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
    // $ANTLR end "rule__AndSentence__Group__0"


    // $ANTLR start "rule__AndSentence__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3643:1: rule__AndSentence__Group__0__Impl : ( ruleNotSentence ) ;
    public final void rule__AndSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3647:1: ( ( ruleNotSentence ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3648:1: ( ruleNotSentence )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3648:1: ( ruleNotSentence )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3649:1: ruleNotSentence
            {
             before(grammarAccess.getAndSentenceAccess().getNotSentenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNotSentence_in_rule__AndSentence__Group__0__Impl7386);
            ruleNotSentence();

            state._fsp--;

             after(grammarAccess.getAndSentenceAccess().getNotSentenceParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndSentence__Group__0__Impl"


    // $ANTLR start "rule__AndSentence__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3660:1: rule__AndSentence__Group__1 : rule__AndSentence__Group__1__Impl ;
    public final void rule__AndSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3664:1: ( rule__AndSentence__Group__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3665:2: rule__AndSentence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndSentence__Group__1__Impl_in_rule__AndSentence__Group__17415);
            rule__AndSentence__Group__1__Impl();

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
    // $ANTLR end "rule__AndSentence__Group__1"


    // $ANTLR start "rule__AndSentence__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3671:1: rule__AndSentence__Group__1__Impl : ( ( rule__AndSentence__Group_1__0 )* ) ;
    public final void rule__AndSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3675:1: ( ( ( rule__AndSentence__Group_1__0 )* ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3676:1: ( ( rule__AndSentence__Group_1__0 )* )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3676:1: ( ( rule__AndSentence__Group_1__0 )* )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3677:1: ( rule__AndSentence__Group_1__0 )*
            {
             before(grammarAccess.getAndSentenceAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3678:1: ( rule__AndSentence__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3678:2: rule__AndSentence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndSentence__Group_1__0_in_rule__AndSentence__Group__1__Impl7442);
            	    rule__AndSentence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAndSentenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndSentence__Group__1__Impl"


    // $ANTLR start "rule__AndSentence__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3692:1: rule__AndSentence__Group_1__0 : rule__AndSentence__Group_1__0__Impl rule__AndSentence__Group_1__1 ;
    public final void rule__AndSentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3696:1: ( rule__AndSentence__Group_1__0__Impl rule__AndSentence__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3697:2: rule__AndSentence__Group_1__0__Impl rule__AndSentence__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndSentence__Group_1__0__Impl_in_rule__AndSentence__Group_1__07477);
            rule__AndSentence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndSentence__Group_1__1_in_rule__AndSentence__Group_1__07480);
            rule__AndSentence__Group_1__1();

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
    // $ANTLR end "rule__AndSentence__Group_1__0"


    // $ANTLR start "rule__AndSentence__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3704:1: rule__AndSentence__Group_1__0__Impl : ( () ) ;
    public final void rule__AndSentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3708:1: ( ( () ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3709:1: ( () )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3709:1: ( () )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3710:1: ()
            {
             before(grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3711:1: ()
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3713:1: 
            {
            }

             after(grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group_1__0__Impl"


    // $ANTLR start "rule__AndSentence__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3723:1: rule__AndSentence__Group_1__1 : rule__AndSentence__Group_1__1__Impl rule__AndSentence__Group_1__2 ;
    public final void rule__AndSentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3727:1: ( rule__AndSentence__Group_1__1__Impl rule__AndSentence__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3728:2: rule__AndSentence__Group_1__1__Impl rule__AndSentence__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndSentence__Group_1__1__Impl_in_rule__AndSentence__Group_1__17538);
            rule__AndSentence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndSentence__Group_1__2_in_rule__AndSentence__Group_1__17541);
            rule__AndSentence__Group_1__2();

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
    // $ANTLR end "rule__AndSentence__Group_1__1"


    // $ANTLR start "rule__AndSentence__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3735:1: rule__AndSentence__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndSentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3739:1: ( ( 'and' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3740:1: ( 'and' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3740:1: ( 'and' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3741:1: 'and'
            {
             before(grammarAccess.getAndSentenceAccess().getAndKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__AndSentence__Group_1__1__Impl7569); 
             after(grammarAccess.getAndSentenceAccess().getAndKeyword_1_1()); 

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
    // $ANTLR end "rule__AndSentence__Group_1__1__Impl"


    // $ANTLR start "rule__AndSentence__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3754:1: rule__AndSentence__Group_1__2 : rule__AndSentence__Group_1__2__Impl ;
    public final void rule__AndSentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3758:1: ( rule__AndSentence__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3759:2: rule__AndSentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndSentence__Group_1__2__Impl_in_rule__AndSentence__Group_1__27600);
            rule__AndSentence__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndSentence__Group_1__2"


    // $ANTLR start "rule__AndSentence__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3765:1: rule__AndSentence__Group_1__2__Impl : ( ( rule__AndSentence__RightAssignment_1_2 ) ) ;
    public final void rule__AndSentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3769:1: ( ( ( rule__AndSentence__RightAssignment_1_2 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3770:1: ( ( rule__AndSentence__RightAssignment_1_2 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3770:1: ( ( rule__AndSentence__RightAssignment_1_2 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3771:1: ( rule__AndSentence__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndSentenceAccess().getRightAssignment_1_2()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3772:1: ( rule__AndSentence__RightAssignment_1_2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3772:2: rule__AndSentence__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndSentence__RightAssignment_1_2_in_rule__AndSentence__Group_1__2__Impl7627);
            rule__AndSentence__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndSentenceAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndSentence__Group_1__2__Impl"


    // $ANTLR start "rule__NotSentence__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3788:1: rule__NotSentence__Group_1__0 : rule__NotSentence__Group_1__0__Impl rule__NotSentence__Group_1__1 ;
    public final void rule__NotSentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3792:1: ( rule__NotSentence__Group_1__0__Impl rule__NotSentence__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3793:2: rule__NotSentence__Group_1__0__Impl rule__NotSentence__Group_1__1
            {
            pushFollow(FOLLOW_rule__NotSentence__Group_1__0__Impl_in_rule__NotSentence__Group_1__07663);
            rule__NotSentence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotSentence__Group_1__1_in_rule__NotSentence__Group_1__07666);
            rule__NotSentence__Group_1__1();

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
    // $ANTLR end "rule__NotSentence__Group_1__0"


    // $ANTLR start "rule__NotSentence__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3800:1: rule__NotSentence__Group_1__0__Impl : ( 'not' ) ;
    public final void rule__NotSentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3804:1: ( ( 'not' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3805:1: ( 'not' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3805:1: ( 'not' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3806:1: 'not'
            {
             before(grammarAccess.getNotSentenceAccess().getNotKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__NotSentence__Group_1__0__Impl7694); 
             after(grammarAccess.getNotSentenceAccess().getNotKeyword_1_0()); 

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
    // $ANTLR end "rule__NotSentence__Group_1__0__Impl"


    // $ANTLR start "rule__NotSentence__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3819:1: rule__NotSentence__Group_1__1 : rule__NotSentence__Group_1__1__Impl ;
    public final void rule__NotSentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3823:1: ( rule__NotSentence__Group_1__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3824:2: rule__NotSentence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NotSentence__Group_1__1__Impl_in_rule__NotSentence__Group_1__17725);
            rule__NotSentence__Group_1__1__Impl();

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
    // $ANTLR end "rule__NotSentence__Group_1__1"


    // $ANTLR start "rule__NotSentence__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3830:1: rule__NotSentence__Group_1__1__Impl : ( rulePrimarySentence ) ;
    public final void rule__NotSentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3834:1: ( ( rulePrimarySentence ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3835:1: ( rulePrimarySentence )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3835:1: ( rulePrimarySentence )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3836:1: rulePrimarySentence
            {
             before(grammarAccess.getNotSentenceAccess().getPrimarySentenceParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulePrimarySentence_in_rule__NotSentence__Group_1__1__Impl7752);
            rulePrimarySentence();

            state._fsp--;

             after(grammarAccess.getNotSentenceAccess().getPrimarySentenceParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__NotSentence__Group_1__1__Impl"


    // $ANTLR start "rule__PrimarySentence__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3851:1: rule__PrimarySentence__Group_1__0 : rule__PrimarySentence__Group_1__0__Impl rule__PrimarySentence__Group_1__1 ;
    public final void rule__PrimarySentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3855:1: ( rule__PrimarySentence__Group_1__0__Impl rule__PrimarySentence__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3856:2: rule__PrimarySentence__Group_1__0__Impl rule__PrimarySentence__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimarySentence__Group_1__0__Impl_in_rule__PrimarySentence__Group_1__07785);
            rule__PrimarySentence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimarySentence__Group_1__1_in_rule__PrimarySentence__Group_1__07788);
            rule__PrimarySentence__Group_1__1();

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
    // $ANTLR end "rule__PrimarySentence__Group_1__0"


    // $ANTLR start "rule__PrimarySentence__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3863:1: rule__PrimarySentence__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimarySentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3867:1: ( ( '(' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3868:1: ( '(' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3868:1: ( '(' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3869:1: '('
            {
             before(grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__PrimarySentence__Group_1__0__Impl7816); 
             after(grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__PrimarySentence__Group_1__0__Impl"


    // $ANTLR start "rule__PrimarySentence__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3882:1: rule__PrimarySentence__Group_1__1 : rule__PrimarySentence__Group_1__1__Impl rule__PrimarySentence__Group_1__2 ;
    public final void rule__PrimarySentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3886:1: ( rule__PrimarySentence__Group_1__1__Impl rule__PrimarySentence__Group_1__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3887:2: rule__PrimarySentence__Group_1__1__Impl rule__PrimarySentence__Group_1__2
            {
            pushFollow(FOLLOW_rule__PrimarySentence__Group_1__1__Impl_in_rule__PrimarySentence__Group_1__17847);
            rule__PrimarySentence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimarySentence__Group_1__2_in_rule__PrimarySentence__Group_1__17850);
            rule__PrimarySentence__Group_1__2();

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
    // $ANTLR end "rule__PrimarySentence__Group_1__1"


    // $ANTLR start "rule__PrimarySentence__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3894:1: rule__PrimarySentence__Group_1__1__Impl : ( ruleOrSentence ) ;
    public final void rule__PrimarySentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3898:1: ( ( ruleOrSentence ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3899:1: ( ruleOrSentence )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3899:1: ( ruleOrSentence )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3900:1: ruleOrSentence
            {
             before(grammarAccess.getPrimarySentenceAccess().getOrSentenceParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleOrSentence_in_rule__PrimarySentence__Group_1__1__Impl7877);
            ruleOrSentence();

            state._fsp--;

             after(grammarAccess.getPrimarySentenceAccess().getOrSentenceParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__PrimarySentence__Group_1__1__Impl"


    // $ANTLR start "rule__PrimarySentence__Group_1__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3911:1: rule__PrimarySentence__Group_1__2 : rule__PrimarySentence__Group_1__2__Impl ;
    public final void rule__PrimarySentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3915:1: ( rule__PrimarySentence__Group_1__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3916:2: rule__PrimarySentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimarySentence__Group_1__2__Impl_in_rule__PrimarySentence__Group_1__27906);
            rule__PrimarySentence__Group_1__2__Impl();

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
    // $ANTLR end "rule__PrimarySentence__Group_1__2"


    // $ANTLR start "rule__PrimarySentence__Group_1__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3922:1: rule__PrimarySentence__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimarySentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3926:1: ( ( ')' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3927:1: ( ')' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3927:1: ( ')' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3928:1: ')'
            {
             before(grammarAccess.getPrimarySentenceAccess().getRightParenthesisKeyword_1_2()); 
            match(input,31,FOLLOW_31_in_rule__PrimarySentence__Group_1__2__Impl7934); 
             after(grammarAccess.getPrimarySentenceAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__PrimarySentence__Group_1__2__Impl"


    // $ANTLR start "rule__MaybeLiteral__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3947:1: rule__MaybeLiteral__Group__0 : rule__MaybeLiteral__Group__0__Impl rule__MaybeLiteral__Group__1 ;
    public final void rule__MaybeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3951:1: ( rule__MaybeLiteral__Group__0__Impl rule__MaybeLiteral__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3952:2: rule__MaybeLiteral__Group__0__Impl rule__MaybeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__MaybeLiteral__Group__0__Impl_in_rule__MaybeLiteral__Group__07971);
            rule__MaybeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaybeLiteral__Group__1_in_rule__MaybeLiteral__Group__07974);
            rule__MaybeLiteral__Group__1();

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
    // $ANTLR end "rule__MaybeLiteral__Group__0"


    // $ANTLR start "rule__MaybeLiteral__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3959:1: rule__MaybeLiteral__Group__0__Impl : ( 'maybe' ) ;
    public final void rule__MaybeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3963:1: ( ( 'maybe' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3964:1: ( 'maybe' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3964:1: ( 'maybe' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3965:1: 'maybe'
            {
             before(grammarAccess.getMaybeLiteralAccess().getMaybeKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__MaybeLiteral__Group__0__Impl8002); 
             after(grammarAccess.getMaybeLiteralAccess().getMaybeKeyword_0()); 

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
    // $ANTLR end "rule__MaybeLiteral__Group__0__Impl"


    // $ANTLR start "rule__MaybeLiteral__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3978:1: rule__MaybeLiteral__Group__1 : rule__MaybeLiteral__Group__1__Impl rule__MaybeLiteral__Group__2 ;
    public final void rule__MaybeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3982:1: ( rule__MaybeLiteral__Group__1__Impl rule__MaybeLiteral__Group__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3983:2: rule__MaybeLiteral__Group__1__Impl rule__MaybeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__MaybeLiteral__Group__1__Impl_in_rule__MaybeLiteral__Group__18033);
            rule__MaybeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaybeLiteral__Group__2_in_rule__MaybeLiteral__Group__18036);
            rule__MaybeLiteral__Group__2();

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
    // $ANTLR end "rule__MaybeLiteral__Group__1"


    // $ANTLR start "rule__MaybeLiteral__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3990:1: rule__MaybeLiteral__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__MaybeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3994:1: ( ( RULE_ID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3995:1: ( RULE_ID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3995:1: ( RULE_ID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:3996:1: RULE_ID
            {
             before(grammarAccess.getMaybeLiteralAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MaybeLiteral__Group__1__Impl8063); 
             after(grammarAccess.getMaybeLiteralAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__MaybeLiteral__Group__1__Impl"


    // $ANTLR start "rule__MaybeLiteral__Group__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4007:1: rule__MaybeLiteral__Group__2 : rule__MaybeLiteral__Group__2__Impl rule__MaybeLiteral__Group__3 ;
    public final void rule__MaybeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4011:1: ( rule__MaybeLiteral__Group__2__Impl rule__MaybeLiteral__Group__3 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4012:2: rule__MaybeLiteral__Group__2__Impl rule__MaybeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__MaybeLiteral__Group__2__Impl_in_rule__MaybeLiteral__Group__28092);
            rule__MaybeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaybeLiteral__Group__3_in_rule__MaybeLiteral__Group__28095);
            rule__MaybeLiteral__Group__3();

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
    // $ANTLR end "rule__MaybeLiteral__Group__2"


    // $ANTLR start "rule__MaybeLiteral__Group__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4019:1: rule__MaybeLiteral__Group__2__Impl : ( '(' ) ;
    public final void rule__MaybeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4023:1: ( ( '(' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4024:1: ( '(' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4024:1: ( '(' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4025:1: '('
            {
             before(grammarAccess.getMaybeLiteralAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__MaybeLiteral__Group__2__Impl8123); 
             after(grammarAccess.getMaybeLiteralAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__MaybeLiteral__Group__2__Impl"


    // $ANTLR start "rule__MaybeLiteral__Group__3"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4038:1: rule__MaybeLiteral__Group__3 : rule__MaybeLiteral__Group__3__Impl rule__MaybeLiteral__Group__4 ;
    public final void rule__MaybeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4042:1: ( rule__MaybeLiteral__Group__3__Impl rule__MaybeLiteral__Group__4 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4043:2: rule__MaybeLiteral__Group__3__Impl rule__MaybeLiteral__Group__4
            {
            pushFollow(FOLLOW_rule__MaybeLiteral__Group__3__Impl_in_rule__MaybeLiteral__Group__38154);
            rule__MaybeLiteral__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaybeLiteral__Group__4_in_rule__MaybeLiteral__Group__38157);
            rule__MaybeLiteral__Group__4();

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
    // $ANTLR end "rule__MaybeLiteral__Group__3"


    // $ANTLR start "rule__MaybeLiteral__Group__3__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4050:1: rule__MaybeLiteral__Group__3__Impl : ( ruleBasicTerms ) ;
    public final void rule__MaybeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4054:1: ( ( ruleBasicTerms ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4055:1: ( ruleBasicTerms )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4055:1: ( ruleBasicTerms )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4056:1: ruleBasicTerms
            {
             before(grammarAccess.getMaybeLiteralAccess().getBasicTermsParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleBasicTerms_in_rule__MaybeLiteral__Group__3__Impl8184);
            ruleBasicTerms();

            state._fsp--;

             after(grammarAccess.getMaybeLiteralAccess().getBasicTermsParserRuleCall_3()); 

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
    // $ANTLR end "rule__MaybeLiteral__Group__3__Impl"


    // $ANTLR start "rule__MaybeLiteral__Group__4"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4067:1: rule__MaybeLiteral__Group__4 : rule__MaybeLiteral__Group__4__Impl ;
    public final void rule__MaybeLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4071:1: ( rule__MaybeLiteral__Group__4__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4072:2: rule__MaybeLiteral__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MaybeLiteral__Group__4__Impl_in_rule__MaybeLiteral__Group__48213);
            rule__MaybeLiteral__Group__4__Impl();

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
    // $ANTLR end "rule__MaybeLiteral__Group__4"


    // $ANTLR start "rule__MaybeLiteral__Group__4__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4078:1: rule__MaybeLiteral__Group__4__Impl : ( ')' ) ;
    public final void rule__MaybeLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4082:1: ( ( ')' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4083:1: ( ')' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4083:1: ( ')' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4084:1: ')'
            {
             before(grammarAccess.getMaybeLiteralAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__MaybeLiteral__Group__4__Impl8241); 
             after(grammarAccess.getMaybeLiteralAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__MaybeLiteral__Group__4__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4107:1: rule__CardinalityConstraint__Group__0 : rule__CardinalityConstraint__Group__0__Impl rule__CardinalityConstraint__Group__1 ;
    public final void rule__CardinalityConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4111:1: ( rule__CardinalityConstraint__Group__0__Impl rule__CardinalityConstraint__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4112:2: rule__CardinalityConstraint__Group__0__Impl rule__CardinalityConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__0__Impl_in_rule__CardinalityConstraint__Group__08282);
            rule__CardinalityConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__1_in_rule__CardinalityConstraint__Group__08285);
            rule__CardinalityConstraint__Group__1();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__0"


    // $ANTLR start "rule__CardinalityConstraint__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4119:1: rule__CardinalityConstraint__Group__0__Impl : ( ( rule__CardinalityConstraint__LhsAssignment_0 ) ) ;
    public final void rule__CardinalityConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4123:1: ( ( ( rule__CardinalityConstraint__LhsAssignment_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4124:1: ( ( rule__CardinalityConstraint__LhsAssignment_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4124:1: ( ( rule__CardinalityConstraint__LhsAssignment_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4125:1: ( rule__CardinalityConstraint__LhsAssignment_0 )
            {
             before(grammarAccess.getCardinalityConstraintAccess().getLhsAssignment_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4126:1: ( rule__CardinalityConstraint__LhsAssignment_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4126:2: rule__CardinalityConstraint__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__LhsAssignment_0_in_rule__CardinalityConstraint__Group__0__Impl8312);
            rule__CardinalityConstraint__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityConstraintAccess().getLhsAssignment_0()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__0__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4136:1: rule__CardinalityConstraint__Group__1 : rule__CardinalityConstraint__Group__1__Impl rule__CardinalityConstraint__Group__2 ;
    public final void rule__CardinalityConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4140:1: ( rule__CardinalityConstraint__Group__1__Impl rule__CardinalityConstraint__Group__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4141:2: rule__CardinalityConstraint__Group__1__Impl rule__CardinalityConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__1__Impl_in_rule__CardinalityConstraint__Group__18342);
            rule__CardinalityConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__2_in_rule__CardinalityConstraint__Group__18345);
            rule__CardinalityConstraint__Group__2();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__1"


    // $ANTLR start "rule__CardinalityConstraint__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4148:1: rule__CardinalityConstraint__Group__1__Impl : ( '<=' ) ;
    public final void rule__CardinalityConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4152:1: ( ( '<=' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4153:1: ( '<=' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4153:1: ( '<=' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4154:1: '<='
            {
             before(grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__CardinalityConstraint__Group__1__Impl8373); 
             after(grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__1__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4167:1: rule__CardinalityConstraint__Group__2 : rule__CardinalityConstraint__Group__2__Impl rule__CardinalityConstraint__Group__3 ;
    public final void rule__CardinalityConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4171:1: ( rule__CardinalityConstraint__Group__2__Impl rule__CardinalityConstraint__Group__3 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4172:2: rule__CardinalityConstraint__Group__2__Impl rule__CardinalityConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__2__Impl_in_rule__CardinalityConstraint__Group__28404);
            rule__CardinalityConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__3_in_rule__CardinalityConstraint__Group__28407);
            rule__CardinalityConstraint__Group__3();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__2"


    // $ANTLR start "rule__CardinalityConstraint__Group__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4179:1: rule__CardinalityConstraint__Group__2__Impl : ( '|' ) ;
    public final void rule__CardinalityConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4183:1: ( ( '|' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4184:1: ( '|' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4184:1: ( '|' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4185:1: '|'
            {
             before(grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__CardinalityConstraint__Group__2__Impl8435); 
             after(grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_2()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__2__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__3"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4198:1: rule__CardinalityConstraint__Group__3 : rule__CardinalityConstraint__Group__3__Impl rule__CardinalityConstraint__Group__4 ;
    public final void rule__CardinalityConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4202:1: ( rule__CardinalityConstraint__Group__3__Impl rule__CardinalityConstraint__Group__4 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4203:2: rule__CardinalityConstraint__Group__3__Impl rule__CardinalityConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__3__Impl_in_rule__CardinalityConstraint__Group__38466);
            rule__CardinalityConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__4_in_rule__CardinalityConstraint__Group__38469);
            rule__CardinalityConstraint__Group__4();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__3"


    // $ANTLR start "rule__CardinalityConstraint__Group__3__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4210:1: rule__CardinalityConstraint__Group__3__Impl : ( '{' ) ;
    public final void rule__CardinalityConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4214:1: ( ( '{' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4215:1: ( '{' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4215:1: ( '{' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4216:1: '{'
            {
             before(grammarAccess.getCardinalityConstraintAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__CardinalityConstraint__Group__3__Impl8497); 
             after(grammarAccess.getCardinalityConstraintAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__3__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__4"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4229:1: rule__CardinalityConstraint__Group__4 : rule__CardinalityConstraint__Group__4__Impl rule__CardinalityConstraint__Group__5 ;
    public final void rule__CardinalityConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4233:1: ( rule__CardinalityConstraint__Group__4__Impl rule__CardinalityConstraint__Group__5 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4234:2: rule__CardinalityConstraint__Group__4__Impl rule__CardinalityConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__4__Impl_in_rule__CardinalityConstraint__Group__48528);
            rule__CardinalityConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__5_in_rule__CardinalityConstraint__Group__48531);
            rule__CardinalityConstraint__Group__5();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__4"


    // $ANTLR start "rule__CardinalityConstraint__Group__4__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4241:1: rule__CardinalityConstraint__Group__4__Impl : ( ( rule__CardinalityConstraint__IdAssignment_4 ) ) ;
    public final void rule__CardinalityConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4245:1: ( ( ( rule__CardinalityConstraint__IdAssignment_4 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4246:1: ( ( rule__CardinalityConstraint__IdAssignment_4 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4246:1: ( ( rule__CardinalityConstraint__IdAssignment_4 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4247:1: ( rule__CardinalityConstraint__IdAssignment_4 )
            {
             before(grammarAccess.getCardinalityConstraintAccess().getIdAssignment_4()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4248:1: ( rule__CardinalityConstraint__IdAssignment_4 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4248:2: rule__CardinalityConstraint__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__IdAssignment_4_in_rule__CardinalityConstraint__Group__4__Impl8558);
            rule__CardinalityConstraint__IdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityConstraintAccess().getIdAssignment_4()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__4__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__5"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4258:1: rule__CardinalityConstraint__Group__5 : rule__CardinalityConstraint__Group__5__Impl rule__CardinalityConstraint__Group__6 ;
    public final void rule__CardinalityConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4262:1: ( rule__CardinalityConstraint__Group__5__Impl rule__CardinalityConstraint__Group__6 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4263:2: rule__CardinalityConstraint__Group__5__Impl rule__CardinalityConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__5__Impl_in_rule__CardinalityConstraint__Group__58588);
            rule__CardinalityConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__6_in_rule__CardinalityConstraint__Group__58591);
            rule__CardinalityConstraint__Group__6();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__5"


    // $ANTLR start "rule__CardinalityConstraint__Group__5__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4270:1: rule__CardinalityConstraint__Group__5__Impl : ( '(' ) ;
    public final void rule__CardinalityConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4274:1: ( ( '(' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4275:1: ( '(' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4275:1: ( '(' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4276:1: '('
            {
             before(grammarAccess.getCardinalityConstraintAccess().getLeftParenthesisKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__CardinalityConstraint__Group__5__Impl8619); 
             after(grammarAccess.getCardinalityConstraintAccess().getLeftParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__5__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__6"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4289:1: rule__CardinalityConstraint__Group__6 : rule__CardinalityConstraint__Group__6__Impl rule__CardinalityConstraint__Group__7 ;
    public final void rule__CardinalityConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4293:1: ( rule__CardinalityConstraint__Group__6__Impl rule__CardinalityConstraint__Group__7 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4294:2: rule__CardinalityConstraint__Group__6__Impl rule__CardinalityConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__6__Impl_in_rule__CardinalityConstraint__Group__68650);
            rule__CardinalityConstraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__7_in_rule__CardinalityConstraint__Group__68653);
            rule__CardinalityConstraint__Group__7();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__6"


    // $ANTLR start "rule__CardinalityConstraint__Group__6__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4301:1: rule__CardinalityConstraint__Group__6__Impl : ( ( rule__CardinalityConstraint__TermsAssignment_6 ) ) ;
    public final void rule__CardinalityConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4305:1: ( ( ( rule__CardinalityConstraint__TermsAssignment_6 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4306:1: ( ( rule__CardinalityConstraint__TermsAssignment_6 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4306:1: ( ( rule__CardinalityConstraint__TermsAssignment_6 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4307:1: ( rule__CardinalityConstraint__TermsAssignment_6 )
            {
             before(grammarAccess.getCardinalityConstraintAccess().getTermsAssignment_6()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4308:1: ( rule__CardinalityConstraint__TermsAssignment_6 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4308:2: rule__CardinalityConstraint__TermsAssignment_6
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__TermsAssignment_6_in_rule__CardinalityConstraint__Group__6__Impl8680);
            rule__CardinalityConstraint__TermsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityConstraintAccess().getTermsAssignment_6()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__6__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__7"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4318:1: rule__CardinalityConstraint__Group__7 : rule__CardinalityConstraint__Group__7__Impl rule__CardinalityConstraint__Group__8 ;
    public final void rule__CardinalityConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4322:1: ( rule__CardinalityConstraint__Group__7__Impl rule__CardinalityConstraint__Group__8 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4323:2: rule__CardinalityConstraint__Group__7__Impl rule__CardinalityConstraint__Group__8
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__7__Impl_in_rule__CardinalityConstraint__Group__78710);
            rule__CardinalityConstraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__8_in_rule__CardinalityConstraint__Group__78713);
            rule__CardinalityConstraint__Group__8();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__7"


    // $ANTLR start "rule__CardinalityConstraint__Group__7__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4330:1: rule__CardinalityConstraint__Group__7__Impl : ( ')' ) ;
    public final void rule__CardinalityConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4334:1: ( ( ')' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4335:1: ( ')' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4335:1: ( ')' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4336:1: ')'
            {
             before(grammarAccess.getCardinalityConstraintAccess().getRightParenthesisKeyword_7()); 
            match(input,31,FOLLOW_31_in_rule__CardinalityConstraint__Group__7__Impl8741); 
             after(grammarAccess.getCardinalityConstraintAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__7__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__8"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4349:1: rule__CardinalityConstraint__Group__8 : rule__CardinalityConstraint__Group__8__Impl rule__CardinalityConstraint__Group__9 ;
    public final void rule__CardinalityConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4353:1: ( rule__CardinalityConstraint__Group__8__Impl rule__CardinalityConstraint__Group__9 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4354:2: rule__CardinalityConstraint__Group__8__Impl rule__CardinalityConstraint__Group__9
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__8__Impl_in_rule__CardinalityConstraint__Group__88772);
            rule__CardinalityConstraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__9_in_rule__CardinalityConstraint__Group__88775);
            rule__CardinalityConstraint__Group__9();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__8"


    // $ANTLR start "rule__CardinalityConstraint__Group__8__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4361:1: rule__CardinalityConstraint__Group__8__Impl : ( '}' ) ;
    public final void rule__CardinalityConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4365:1: ( ( '}' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4366:1: ( '}' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4366:1: ( '}' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4367:1: '}'
            {
             before(grammarAccess.getCardinalityConstraintAccess().getRightCurlyBracketKeyword_8()); 
            match(input,41,FOLLOW_41_in_rule__CardinalityConstraint__Group__8__Impl8803); 
             after(grammarAccess.getCardinalityConstraintAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__8__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__9"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4380:1: rule__CardinalityConstraint__Group__9 : rule__CardinalityConstraint__Group__9__Impl rule__CardinalityConstraint__Group__10 ;
    public final void rule__CardinalityConstraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4384:1: ( rule__CardinalityConstraint__Group__9__Impl rule__CardinalityConstraint__Group__10 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4385:2: rule__CardinalityConstraint__Group__9__Impl rule__CardinalityConstraint__Group__10
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__9__Impl_in_rule__CardinalityConstraint__Group__98834);
            rule__CardinalityConstraint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__10_in_rule__CardinalityConstraint__Group__98837);
            rule__CardinalityConstraint__Group__10();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__9"


    // $ANTLR start "rule__CardinalityConstraint__Group__9__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4392:1: rule__CardinalityConstraint__Group__9__Impl : ( '|' ) ;
    public final void rule__CardinalityConstraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4396:1: ( ( '|' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4397:1: ( '|' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4397:1: ( '|' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4398:1: '|'
            {
             before(grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_9()); 
            match(input,39,FOLLOW_39_in_rule__CardinalityConstraint__Group__9__Impl8865); 
             after(grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_9()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__9__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__10"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4411:1: rule__CardinalityConstraint__Group__10 : rule__CardinalityConstraint__Group__10__Impl rule__CardinalityConstraint__Group__11 ;
    public final void rule__CardinalityConstraint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4415:1: ( rule__CardinalityConstraint__Group__10__Impl rule__CardinalityConstraint__Group__11 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4416:2: rule__CardinalityConstraint__Group__10__Impl rule__CardinalityConstraint__Group__11
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__10__Impl_in_rule__CardinalityConstraint__Group__108896);
            rule__CardinalityConstraint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__11_in_rule__CardinalityConstraint__Group__108899);
            rule__CardinalityConstraint__Group__11();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__10"


    // $ANTLR start "rule__CardinalityConstraint__Group__10__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4423:1: rule__CardinalityConstraint__Group__10__Impl : ( '<=' ) ;
    public final void rule__CardinalityConstraint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4427:1: ( ( '<=' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4428:1: ( '<=' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4428:1: ( '<=' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4429:1: '<='
            {
             before(grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_10()); 
            match(input,27,FOLLOW_27_in_rule__CardinalityConstraint__Group__10__Impl8927); 
             after(grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_10()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__10__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__11"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4442:1: rule__CardinalityConstraint__Group__11 : rule__CardinalityConstraint__Group__11__Impl ;
    public final void rule__CardinalityConstraint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4446:1: ( rule__CardinalityConstraint__Group__11__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4447:2: rule__CardinalityConstraint__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__Group__11__Impl_in_rule__CardinalityConstraint__Group__118958);
            rule__CardinalityConstraint__Group__11__Impl();

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
    // $ANTLR end "rule__CardinalityConstraint__Group__11"


    // $ANTLR start "rule__CardinalityConstraint__Group__11__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4453:1: rule__CardinalityConstraint__Group__11__Impl : ( ( rule__CardinalityConstraint__RhsAssignment_11 ) ) ;
    public final void rule__CardinalityConstraint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4457:1: ( ( ( rule__CardinalityConstraint__RhsAssignment_11 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4458:1: ( ( rule__CardinalityConstraint__RhsAssignment_11 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4458:1: ( ( rule__CardinalityConstraint__RhsAssignment_11 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4459:1: ( rule__CardinalityConstraint__RhsAssignment_11 )
            {
             before(grammarAccess.getCardinalityConstraintAccess().getRhsAssignment_11()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4460:1: ( rule__CardinalityConstraint__RhsAssignment_11 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4460:2: rule__CardinalityConstraint__RhsAssignment_11
            {
            pushFollow(FOLLOW_rule__CardinalityConstraint__RhsAssignment_11_in_rule__CardinalityConstraint__Group__11__Impl8985);
            rule__CardinalityConstraint__RhsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityConstraintAccess().getRhsAssignment_11()); 

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
    // $ANTLR end "rule__CardinalityConstraint__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4494:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4498:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4499:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__09039);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__09042);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4506:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__HeadAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4510:1: ( ( ( rule__Rule__HeadAssignment_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4511:1: ( ( rule__Rule__HeadAssignment_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4511:1: ( ( rule__Rule__HeadAssignment_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4512:1: ( rule__Rule__HeadAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getHeadAssignment_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4513:1: ( rule__Rule__HeadAssignment_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4513:2: rule__Rule__HeadAssignment_0
            {
            pushFollow(FOLLOW_rule__Rule__HeadAssignment_0_in_rule__Rule__Group__0__Impl9069);
            rule__Rule__HeadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getHeadAssignment_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4523:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4527:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4528:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__19099);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__19102);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4535:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4539:1: ( ( ( rule__Rule__Group_1__0 )? ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4540:1: ( ( rule__Rule__Group_1__0 )? )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4540:1: ( ( rule__Rule__Group_1__0 )? )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4541:1: ( rule__Rule__Group_1__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4542:1: ( rule__Rule__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4542:2: rule__Rule__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl9129);
                    rule__Rule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4552:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4556:1: ( rule__Rule__Group__2__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4557:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__29160);
            rule__Rule__Group__2__Impl();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4563:1: rule__Rule__Group__2__Impl : ( '.' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4567:1: ( ( '.' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4568:1: ( '.' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4568:1: ( '.' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4569:1: '.'
            {
             before(grammarAccess.getRuleAccess().getFullStopKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Rule__Group__2__Impl9188); 
             after(grammarAccess.getRuleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group_1__0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4588:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4592:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4593:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__09225);
            rule__Rule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__09228);
            rule__Rule__Group_1__1();

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
    // $ANTLR end "rule__Rule__Group_1__0"


    // $ANTLR start "rule__Rule__Group_1__0__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4600:1: rule__Rule__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4604:1: ( ( 'if' ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4605:1: ( 'if' )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4605:1: ( 'if' )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4606:1: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Rule__Group_1__0__Impl9256); 
             after(grammarAccess.getRuleAccess().getIfKeyword_1_0()); 

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
    // $ANTLR end "rule__Rule__Group_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_1__1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4619:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4623:1: ( rule__Rule__Group_1__1__Impl )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4624:2: rule__Rule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__19287);
            rule__Rule__Group_1__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_1__1"


    // $ANTLR start "rule__Rule__Group_1__1__Impl"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4630:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__BodyAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4634:1: ( ( ( rule__Rule__BodyAssignment_1_1 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4635:1: ( ( rule__Rule__BodyAssignment_1_1 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4635:1: ( ( rule__Rule__BodyAssignment_1_1 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4636:1: ( rule__Rule__BodyAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getBodyAssignment_1_1()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4637:1: ( rule__Rule__BodyAssignment_1_1 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4637:2: rule__Rule__BodyAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Rule__BodyAssignment_1_1_in_rule__Rule__Group_1__1__Impl9314);
            rule__Rule__BodyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getBodyAssignment_1_1()); 

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
    // $ANTLR end "rule__Rule__Group_1__1__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4652:1: rule__Program__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4656:1: ( ( ruleStatement ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4657:1: ( ruleStatement )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4657:1: ( ruleStatement )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4658:1: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Program__StatementsAssignment9353);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__StatementsAssignment"


    // $ANTLR start "rule__Variable__IdentifierAssignment"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4668:1: rule__Variable__IdentifierAssignment : ( RULE_UID ) ;
    public final void rule__Variable__IdentifierAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4672:1: ( ( RULE_UID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4673:1: ( RULE_UID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4673:1: ( RULE_UID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4674:1: RULE_UID
            {
             before(grammarAccess.getVariableAccess().getIdentifierUIDTerminalRuleCall_0()); 
            match(input,RULE_UID,FOLLOW_RULE_UID_in_rule__Variable__IdentifierAssignment9385); 
             after(grammarAccess.getVariableAccess().getIdentifierUIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Variable__IdentifierAssignment"


    // $ANTLR start "rule__TypedVariable__TypeAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4683:1: rule__TypedVariable__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypedVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4687:1: ( ( RULE_ID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4688:1: ( RULE_ID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4688:1: ( RULE_ID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4689:1: RULE_ID
            {
             before(grammarAccess.getTypedVariableAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypedVariable__TypeAssignment_09416); 
             after(grammarAccess.getTypedVariableAccess().getTypeIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TypedVariable__TypeAssignment_0"


    // $ANTLR start "rule__TypedVariable__VarAssignment_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4698:1: rule__TypedVariable__VarAssignment_1 : ( ruleVariable ) ;
    public final void rule__TypedVariable__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4702:1: ( ( ruleVariable ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4703:1: ( ruleVariable )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4703:1: ( ruleVariable )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4704:1: ruleVariable
            {
             before(grammarAccess.getTypedVariableAccess().getVarVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__TypedVariable__VarAssignment_19447);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getTypedVariableAccess().getVarVariableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TypedVariable__VarAssignment_1"


    // $ANTLR start "rule__Addition__RhsAssignment_1_2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4713:1: rule__Addition__RhsAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4717:1: ( ( ruleMultiplication ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4718:1: ( ruleMultiplication )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4718:1: ( ruleMultiplication )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4719:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RhsAssignment_1_29478);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Addition__RhsAssignment_1_2"


    // $ANTLR start "rule__Multiplication__RhsAssignment_1_2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4728:1: rule__Multiplication__RhsAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4732:1: ( ( rulePrimary ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4733:1: ( rulePrimary )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4733:1: ( rulePrimary )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4734:1: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Multiplication__RhsAssignment_1_29509);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Multiplication__RhsAssignment_1_2"


    // $ANTLR start "rule__ArithmeticLiteral__IdentifierAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4743:1: rule__ArithmeticLiteral__IdentifierAssignment_0 : ( RULE_ID ) ;
    public final void rule__ArithmeticLiteral__IdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4747:1: ( ( RULE_ID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4748:1: ( RULE_ID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4748:1: ( RULE_ID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4749:1: RULE_ID
            {
             before(grammarAccess.getArithmeticLiteralAccess().getIdentifierIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArithmeticLiteral__IdentifierAssignment_09540); 
             after(grammarAccess.getArithmeticLiteralAccess().getIdentifierIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ArithmeticLiteral__IdentifierAssignment_0"


    // $ANTLR start "rule__ArithmeticLiteral__ValueAssignment_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4758:1: rule__ArithmeticLiteral__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__ArithmeticLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4762:1: ( ( RULE_INT ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4763:1: ( RULE_INT )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4763:1: ( RULE_INT )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4764:1: RULE_INT
            {
             before(grammarAccess.getArithmeticLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArithmeticLiteral__ValueAssignment_19571); 
             after(grammarAccess.getArithmeticLiteralAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ArithmeticLiteral__ValueAssignment_1"


    // $ANTLR start "rule__BasicTerms__CarAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4773:1: rule__BasicTerms__CarAssignment_0 : ( ruleBasicTerm ) ;
    public final void rule__BasicTerms__CarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4777:1: ( ( ruleBasicTerm ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4778:1: ( ruleBasicTerm )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4778:1: ( ruleBasicTerm )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4779:1: ruleBasicTerm
            {
             before(grammarAccess.getBasicTermsAccess().getCarBasicTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBasicTerm_in_rule__BasicTerms__CarAssignment_09602);
            ruleBasicTerm();

            state._fsp--;

             after(grammarAccess.getBasicTermsAccess().getCarBasicTermParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BasicTerms__CarAssignment_0"


    // $ANTLR start "rule__BasicTerms__CdrAssignment_1_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4788:1: rule__BasicTerms__CdrAssignment_1_1 : ( ruleBasicTerm ) ;
    public final void rule__BasicTerms__CdrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4792:1: ( ( ruleBasicTerm ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4793:1: ( ruleBasicTerm )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4793:1: ( ruleBasicTerm )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4794:1: ruleBasicTerm
            {
             before(grammarAccess.getBasicTermsAccess().getCdrBasicTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBasicTerm_in_rule__BasicTerms__CdrAssignment_1_19633);
            ruleBasicTerm();

            state._fsp--;

             after(grammarAccess.getBasicTermsAccess().getCdrBasicTermParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__BasicTerms__CdrAssignment_1_1"


    // $ANTLR start "rule__ConstantDeclaration__IdAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4803:1: rule__ConstantDeclaration__IdAssignment_0 : ( RULE_LID ) ;
    public final void rule__ConstantDeclaration__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4807:1: ( ( RULE_LID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4808:1: ( RULE_LID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4808:1: ( RULE_LID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4809:1: RULE_LID
            {
             before(grammarAccess.getConstantDeclarationAccess().getIdLIDTerminalRuleCall_0_0()); 
            match(input,RULE_LID,FOLLOW_RULE_LID_in_rule__ConstantDeclaration__IdAssignment_09664); 
             after(grammarAccess.getConstantDeclarationAccess().getIdLIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConstantDeclaration__IdAssignment_0"


    // $ANTLR start "rule__ConstantDeclaration__CvAssignment_2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4818:1: rule__ConstantDeclaration__CvAssignment_2 : ( ruleArithmeticTerm ) ;
    public final void rule__ConstantDeclaration__CvAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4822:1: ( ( ruleArithmeticTerm ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4823:1: ( ruleArithmeticTerm )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4823:1: ( ruleArithmeticTerm )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4824:1: ruleArithmeticTerm
            {
             before(grammarAccess.getConstantDeclarationAccess().getCvArithmeticTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArithmeticTerm_in_rule__ConstantDeclaration__CvAssignment_29695);
            ruleArithmeticTerm();

            state._fsp--;

             after(grammarAccess.getConstantDeclarationAccess().getCvArithmeticTermParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConstantDeclaration__CvAssignment_2"


    // $ANTLR start "rule__TypeDeclaration__IdAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4833:1: rule__TypeDeclaration__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypeDeclaration__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4837:1: ( ( RULE_ID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4838:1: ( RULE_ID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4838:1: ( RULE_ID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4839:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclarationAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDeclaration__IdAssignment_09726); 
             after(grammarAccess.getTypeDeclarationAccess().getIdIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TypeDeclaration__IdAssignment_0"


    // $ANTLR start "rule__TypeDeclaration__ExpAssignment_2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4848:1: rule__TypeDeclaration__ExpAssignment_2 : ( ruleSetExpression ) ;
    public final void rule__TypeDeclaration__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4852:1: ( ( ruleSetExpression ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4853:1: ( ruleSetExpression )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4853:1: ( ruleSetExpression )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4854:1: ruleSetExpression
            {
             before(grammarAccess.getTypeDeclarationAccess().getExpSetExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSetExpression_in_rule__TypeDeclaration__ExpAssignment_29757);
            ruleSetExpression();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationAccess().getExpSetExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TypeDeclaration__ExpAssignment_2"


    // $ANTLR start "rule__Limit__CvAssignment"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4863:1: rule__Limit__CvAssignment : ( ruleArithmeticTerm ) ;
    public final void rule__Limit__CvAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4867:1: ( ( ruleArithmeticTerm ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4868:1: ( ruleArithmeticTerm )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4868:1: ( ruleArithmeticTerm )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4869:1: ruleArithmeticTerm
            {
             before(grammarAccess.getLimitAccess().getCvArithmeticTermParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleArithmeticTerm_in_rule__Limit__CvAssignment9788);
            ruleArithmeticTerm();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getCvArithmeticTermParserRuleCall_0()); 

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
    // $ANTLR end "rule__Limit__CvAssignment"


    // $ANTLR start "rule__TVars__CarAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4884:1: rule__TVars__CarAssignment_0 : ( ruleTVar ) ;
    public final void rule__TVars__CarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4888:1: ( ( ruleTVar ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4889:1: ( ruleTVar )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4889:1: ( ruleTVar )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4890:1: ruleTVar
            {
             before(grammarAccess.getTVarsAccess().getCarTVarParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTVar_in_rule__TVars__CarAssignment_09825);
            ruleTVar();

            state._fsp--;

             after(grammarAccess.getTVarsAccess().getCarTVarParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TVars__CarAssignment_0"


    // $ANTLR start "rule__TVars__CdrAssignment_1_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4899:1: rule__TVars__CdrAssignment_1_1 : ( ruleTVar ) ;
    public final void rule__TVars__CdrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4903:1: ( ( ruleTVar ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4904:1: ( ruleTVar )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4904:1: ( ruleTVar )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4905:1: ruleTVar
            {
             before(grammarAccess.getTVarsAccess().getCdrTVarParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTVar_in_rule__TVars__CdrAssignment_1_19856);
            ruleTVar();

            state._fsp--;

             after(grammarAccess.getTVarsAccess().getCdrTVarParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__TVars__CdrAssignment_1_1"


    // $ANTLR start "rule__SetAddition__RightAssignment_1_2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4914:1: rule__SetAddition__RightAssignment_1_2 : ( ruleSetMultiplication ) ;
    public final void rule__SetAddition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4918:1: ( ( ruleSetMultiplication ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4919:1: ( ruleSetMultiplication )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4919:1: ( ruleSetMultiplication )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4920:1: ruleSetMultiplication
            {
             before(grammarAccess.getSetAdditionAccess().getRightSetMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSetMultiplication_in_rule__SetAddition__RightAssignment_1_29887);
            ruleSetMultiplication();

            state._fsp--;

             after(grammarAccess.getSetAdditionAccess().getRightSetMultiplicationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__SetAddition__RightAssignment_1_2"


    // $ANTLR start "rule__SetMultiplication__RightAssignment_1_2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4929:1: rule__SetMultiplication__RightAssignment_1_2 : ( ruleSetPrimary ) ;
    public final void rule__SetMultiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4933:1: ( ( ruleSetPrimary ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4934:1: ( ruleSetPrimary )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4934:1: ( ruleSetPrimary )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4935:1: ruleSetPrimary
            {
             before(grammarAccess.getSetMultiplicationAccess().getRightSetPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSetPrimary_in_rule__SetMultiplication__RightAssignment_1_29918);
            ruleSetPrimary();

            state._fsp--;

             after(grammarAccess.getSetMultiplicationAccess().getRightSetPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__SetMultiplication__RightAssignment_1_2"


    // $ANTLR start "rule__SetLiteral__ValueAssignment"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4944:1: rule__SetLiteral__ValueAssignment : ( ( rule__SetLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__SetLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4948:1: ( ( ( rule__SetLiteral__ValueAlternatives_0 ) ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4949:1: ( ( rule__SetLiteral__ValueAlternatives_0 ) )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4949:1: ( ( rule__SetLiteral__ValueAlternatives_0 ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4950:1: ( rule__SetLiteral__ValueAlternatives_0 )
            {
             before(grammarAccess.getSetLiteralAccess().getValueAlternatives_0()); 
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4951:1: ( rule__SetLiteral__ValueAlternatives_0 )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4951:2: rule__SetLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__SetLiteral__ValueAlternatives_0_in_rule__SetLiteral__ValueAssignment9949);
            rule__SetLiteral__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSetLiteralAccess().getValueAlternatives_0()); 

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
    // $ANTLR end "rule__SetLiteral__ValueAssignment"


    // $ANTLR start "rule__PredicateAtom__FidAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4960:1: rule__PredicateAtom__FidAssignment_0 : ( RULE_ID ) ;
    public final void rule__PredicateAtom__FidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4964:1: ( ( RULE_ID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4965:1: ( RULE_ID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4965:1: ( RULE_ID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4966:1: RULE_ID
            {
             before(grammarAccess.getPredicateAtomAccess().getFidIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PredicateAtom__FidAssignment_09982); 
             after(grammarAccess.getPredicateAtomAccess().getFidIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PredicateAtom__FidAssignment_0"


    // $ANTLR start "rule__PredicateAtom__TermsAssignment_1_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4975:1: rule__PredicateAtom__TermsAssignment_1_1 : ( ruleBasicTerms ) ;
    public final void rule__PredicateAtom__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4979:1: ( ( ruleBasicTerms ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4980:1: ( ruleBasicTerms )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4980:1: ( ruleBasicTerms )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4981:1: ruleBasicTerms
            {
             before(grammarAccess.getPredicateAtomAccess().getTermsBasicTermsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBasicTerms_in_rule__PredicateAtom__TermsAssignment_1_110013);
            ruleBasicTerms();

            state._fsp--;

             after(grammarAccess.getPredicateAtomAccess().getTermsBasicTermsParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PredicateAtom__TermsAssignment_1_1"


    // $ANTLR start "rule__BuiltInAtom__LhsAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4990:1: rule__BuiltInAtom__LhsAssignment_0 : ( ruleBasicTerm ) ;
    public final void rule__BuiltInAtom__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4994:1: ( ( ruleBasicTerm ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4995:1: ( ruleBasicTerm )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4995:1: ( ruleBasicTerm )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:4996:1: ruleBasicTerm
            {
             before(grammarAccess.getBuiltInAtomAccess().getLhsBasicTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBasicTerm_in_rule__BuiltInAtom__LhsAssignment_010044);
            ruleBasicTerm();

            state._fsp--;

             after(grammarAccess.getBuiltInAtomAccess().getLhsBasicTermParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BuiltInAtom__LhsAssignment_0"


    // $ANTLR start "rule__BuiltInAtom__OpAssignment_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5005:1: rule__BuiltInAtom__OpAssignment_1 : ( ruleAtomOp ) ;
    public final void rule__BuiltInAtom__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5009:1: ( ( ruleAtomOp ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5010:1: ( ruleAtomOp )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5010:1: ( ruleAtomOp )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5011:1: ruleAtomOp
            {
             before(grammarAccess.getBuiltInAtomAccess().getOpAtomOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAtomOp_in_rule__BuiltInAtom__OpAssignment_110075);
            ruleAtomOp();

            state._fsp--;

             after(grammarAccess.getBuiltInAtomAccess().getOpAtomOpParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BuiltInAtom__OpAssignment_1"


    // $ANTLR start "rule__BuiltInAtom__RhsAssignment_2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5020:1: rule__BuiltInAtom__RhsAssignment_2 : ( ruleBasicTerm ) ;
    public final void rule__BuiltInAtom__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5024:1: ( ( ruleBasicTerm ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5025:1: ( ruleBasicTerm )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5025:1: ( ruleBasicTerm )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5026:1: ruleBasicTerm
            {
             before(grammarAccess.getBuiltInAtomAccess().getRhsBasicTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBasicTerm_in_rule__BuiltInAtom__RhsAssignment_210106);
            ruleBasicTerm();

            state._fsp--;

             after(grammarAccess.getBuiltInAtomAccess().getRhsBasicTermParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BuiltInAtom__RhsAssignment_2"


    // $ANTLR start "rule__OrSentence__RightAssignment_1_2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5035:1: rule__OrSentence__RightAssignment_1_2 : ( ruleAndSentence ) ;
    public final void rule__OrSentence__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5039:1: ( ( ruleAndSentence ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5040:1: ( ruleAndSentence )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5040:1: ( ruleAndSentence )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5041:1: ruleAndSentence
            {
             before(grammarAccess.getOrSentenceAccess().getRightAndSentenceParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAndSentence_in_rule__OrSentence__RightAssignment_1_210137);
            ruleAndSentence();

            state._fsp--;

             after(grammarAccess.getOrSentenceAccess().getRightAndSentenceParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrSentence__RightAssignment_1_2"


    // $ANTLR start "rule__AndSentence__RightAssignment_1_2"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5050:1: rule__AndSentence__RightAssignment_1_2 : ( ruleNotSentence ) ;
    public final void rule__AndSentence__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5054:1: ( ( ruleNotSentence ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5055:1: ( ruleNotSentence )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5055:1: ( ruleNotSentence )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5056:1: ruleNotSentence
            {
             before(grammarAccess.getAndSentenceAccess().getRightNotSentenceParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleNotSentence_in_rule__AndSentence__RightAssignment_1_210168);
            ruleNotSentence();

            state._fsp--;

             after(grammarAccess.getAndSentenceAccess().getRightNotSentenceParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndSentence__RightAssignment_1_2"


    // $ANTLR start "rule__CardinalityConstraint__LhsAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5065:1: rule__CardinalityConstraint__LhsAssignment_0 : ( ruleBound ) ;
    public final void rule__CardinalityConstraint__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5069:1: ( ( ruleBound ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5070:1: ( ruleBound )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5070:1: ( ruleBound )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5071:1: ruleBound
            {
             before(grammarAccess.getCardinalityConstraintAccess().getLhsBoundParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBound_in_rule__CardinalityConstraint__LhsAssignment_010199);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getCardinalityConstraintAccess().getLhsBoundParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__CardinalityConstraint__LhsAssignment_0"


    // $ANTLR start "rule__CardinalityConstraint__IdAssignment_4"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5080:1: rule__CardinalityConstraint__IdAssignment_4 : ( RULE_ID ) ;
    public final void rule__CardinalityConstraint__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5084:1: ( ( RULE_ID ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5085:1: ( RULE_ID )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5085:1: ( RULE_ID )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5086:1: RULE_ID
            {
             before(grammarAccess.getCardinalityConstraintAccess().getIdIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CardinalityConstraint__IdAssignment_410230); 
             after(grammarAccess.getCardinalityConstraintAccess().getIdIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__CardinalityConstraint__IdAssignment_4"


    // $ANTLR start "rule__CardinalityConstraint__TermsAssignment_6"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5095:1: rule__CardinalityConstraint__TermsAssignment_6 : ( ruleBasicTerms ) ;
    public final void rule__CardinalityConstraint__TermsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5099:1: ( ( ruleBasicTerms ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5100:1: ( ruleBasicTerms )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5100:1: ( ruleBasicTerms )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5101:1: ruleBasicTerms
            {
             before(grammarAccess.getCardinalityConstraintAccess().getTermsBasicTermsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBasicTerms_in_rule__CardinalityConstraint__TermsAssignment_610261);
            ruleBasicTerms();

            state._fsp--;

             after(grammarAccess.getCardinalityConstraintAccess().getTermsBasicTermsParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__CardinalityConstraint__TermsAssignment_6"


    // $ANTLR start "rule__CardinalityConstraint__RhsAssignment_11"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5110:1: rule__CardinalityConstraint__RhsAssignment_11 : ( ruleBound ) ;
    public final void rule__CardinalityConstraint__RhsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5114:1: ( ( ruleBound ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5115:1: ( ruleBound )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5115:1: ( ruleBound )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5116:1: ruleBound
            {
             before(grammarAccess.getCardinalityConstraintAccess().getRhsBoundParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleBound_in_rule__CardinalityConstraint__RhsAssignment_1110292);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getCardinalityConstraintAccess().getRhsBoundParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__CardinalityConstraint__RhsAssignment_11"


    // $ANTLR start "rule__Bound__AvAssignment"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5125:1: rule__Bound__AvAssignment : ( ruleArithmeticTerm ) ;
    public final void rule__Bound__AvAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5129:1: ( ( ruleArithmeticTerm ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5130:1: ( ruleArithmeticTerm )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5130:1: ( ruleArithmeticTerm )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5131:1: ruleArithmeticTerm
            {
             before(grammarAccess.getBoundAccess().getAvArithmeticTermParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleArithmeticTerm_in_rule__Bound__AvAssignment10323);
            ruleArithmeticTerm();

            state._fsp--;

             after(grammarAccess.getBoundAccess().getAvArithmeticTermParserRuleCall_0()); 

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
    // $ANTLR end "rule__Bound__AvAssignment"


    // $ANTLR start "rule__Rule__HeadAssignment_0"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5140:1: rule__Rule__HeadAssignment_0 : ( ruleHead ) ;
    public final void rule__Rule__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5144:1: ( ( ruleHead ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5145:1: ( ruleHead )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5145:1: ( ruleHead )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5146:1: ruleHead
            {
             before(grammarAccess.getRuleAccess().getHeadHeadParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHead_in_rule__Rule__HeadAssignment_010354);
            ruleHead();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getHeadHeadParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rule__HeadAssignment_0"


    // $ANTLR start "rule__Rule__BodyAssignment_1_1"
    // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5155:1: rule__Rule__BodyAssignment_1_1 : ( ruleSentence ) ;
    public final void rule__Rule__BodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5159:1: ( ( ruleSentence ) )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5160:1: ( ruleSentence )
            {
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5160:1: ( ruleSentence )
            // ../net.certware.argument.language.ui/src-gen/net/certware/argument/language/ui/contentassist/antlr/internal/InternalL.g:5161:1: ruleSentence
            {
             before(grammarAccess.getRuleAccess().getBodySentenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSentence_in_rule__Rule__BodyAssignment_1_110385);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBodySentenceParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Rule__BodyAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram94 = new BitSet(new long[]{0x00000040400000D2L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_entryRuleBasicTerm122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicTerm129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicTerm__Alternatives_in_ruleBasicTerm155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__IdentifierAssignment_in_ruleVariable217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedVariable_in_entryRuleTypedVariable244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedVariable251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedVariable__Group__0_in_ruleTypedVariable277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_entryRuleArithmeticTerm304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticTerm311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleArithmeticTerm337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticLiteral_in_entryRuleArithmeticLiteral543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticLiteral550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithmeticLiteral__Alternatives_in_ruleArithmeticLiteral576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalTerm_in_entryRuleFunctionalTerm603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionalTerm610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalTerm__Group__0_in_ruleFunctionalTerm636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_entryRuleBasicTerms663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicTerms670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicTerms__Group__0_in_ruleBasicTerms696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDeclaration730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__Group__0_in_ruleConstantDeclaration756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__0_in_ruleTypeDeclaration816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimit_in_entryRuleLimit843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimit850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limit__CvAssignment_in_ruleLimit876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExpression_in_entryRuleSetExpression907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetExpression914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAddition_in_ruleSetExpression940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTVars_in_entryRuleTVars968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTVars975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVars__Group__0_in_ruleTVars1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTVar_in_entryRuleTVar1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTVar1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVar__Group__0_in_ruleTVar1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAddition_in_entryRuleSetAddition1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetAddition1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetAddition__Group__0_in_ruleSetAddition1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetMultiplication_in_entryRuleSetMultiplication1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetMultiplication1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group__0_in_ruleSetMultiplication1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPrimary_in_entryRuleSetPrimary1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetPrimary1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPrimary__Alternatives_in_ruleSetPrimary1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__ValueAssignment_in_ruleSetLiteral1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedTerm_in_entryRuleQuantifiedTerm1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedTerm1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedTerm__Group__0_in_ruleQuantifiedTerm1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Alternatives_in_ruleQuantifier1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtom_in_entryRulePredicateAtom1452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAtom1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group__0_in_rulePredicateAtom1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInAtom_in_entryRuleBuiltInAtom1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInAtom1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInAtom__Group__0_in_ruleBuiltInAtom1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomOp_in_entryRuleAtomOp1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomOp1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomOp__Alternatives_in_ruleAtomOp1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence1632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrSentence_in_ruleSentence1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrSentence_in_entryRuleOrSentence1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrSentence1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrSentence__Group__0_in_ruleOrSentence1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndSentence_in_entryRuleAndSentence1751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndSentence1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndSentence__Group__0_in_ruleAndSentence1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotSentence_in_entryRuleNotSentence1811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotSentence1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotSentence__Alternatives_in_ruleNotSentence1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimarySentence_in_entryRulePrimarySentence1871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimarySentence1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimarySentence__Alternatives_in_rulePrimarySentence1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceLiteral_in_entryRuleSentenceLiteral1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceLiteral1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtom_in_ruleSentenceLiteral1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaybeLiteral_in_entryRuleMaybeLiteral1990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaybeLiteral1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__0_in_ruleMaybeLiteral2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityConstraint_in_entryRuleCardinalityConstraint2050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinalityConstraint2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__0_in_ruleCardinalityConstraint2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__AvAssignment_in_ruleBound2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule2170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead2230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Alternatives_in_ruleHead2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedVariable_in_rule__BasicTerm__Alternatives2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_rule__BasicTerm__Alternatives2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalTerm_in_rule__BasicTerm__Alternatives2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Addition__Alternatives_1_12426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Addition__Alternatives_1_12446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Multiplication__Alternatives_1_12481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Multiplication__Alternatives_1_12501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Multiplication__Alternatives_1_12521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticLiteral_in_rule__Primary__Alternatives2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithmeticLiteral__IdentifierAssignment_0_in_rule__ArithmeticLiteral__Alternatives2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithmeticLiteral__ValueAssignment_1_in_rule__ArithmeticLiteral__Alternatives2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SetMultiplication__Alternatives_1_12657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SetMultiplication__Alternatives_1_12677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_rule__SetPrimary__Alternatives2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPrimary__Group_1__0_in_rule__SetPrimary__Alternatives2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SetLiteral__ValueAlternatives_02762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SetLiteral__ValueAlternatives_02782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SetLiteral__ValueAlternatives_02802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Quantifier__Alternatives2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Quantifier__Alternatives2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AtomOp__Alternatives2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AtomOp__Alternatives2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AtomOp__Alternatives2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AtomOp__Alternatives2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AtomOp__Alternatives2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AtomOp__Alternatives2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimarySentence_in_rule__NotSentence__Alternatives3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotSentence__Group_1__0_in_rule__NotSentence__Alternatives3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceLiteral_in_rule__PrimarySentence__Alternatives3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimarySentence__Group_1__0_in_rule__PrimarySentence__Alternatives3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaybeLiteral_in_rule__Head__Alternatives3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityConstraint_in_rule__Head__Alternatives3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Statement__Alternatives3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_rule__Statement__Alternatives3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_rule__Statement__Alternatives3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedVariable__Group__0__Impl_in_rule__TypedVariable__Group__03241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TypedVariable__Group__1_in_rule__TypedVariable__Group__03244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedVariable__TypeAssignment_0_in_rule__TypedVariable__Group__0__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedVariable__Group__1__Impl_in_rule__TypedVariable__Group__13301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedVariable__VarAssignment_1_in_rule__TypedVariable__Group__1__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__03362 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__03365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl3448 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__03483 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__03486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__13544 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__13547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_1_in_rule__Addition__Group_1__1__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__23604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RhsAssignment_1_2_in_rule__Addition__Group_1__2__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__03667 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__03670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Multiplication__Group__0__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3753 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03788 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__03791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__13849 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__13852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_1_in_rule__Multiplication__Group_1__1__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__23909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RhsAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__03972 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__03975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Primary__Group_1__0__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__14034 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__14037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Primary__Group_1__1__Impl4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__24093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Primary__Group_1__2__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalTerm__Group__0__Impl_in_rule__FunctionalTerm__Group__04158 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FunctionalTerm__Group__1_in_rule__FunctionalTerm__Group__04161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionalTerm__Group__0__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalTerm__Group__1__Impl_in_rule__FunctionalTerm__Group__14217 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__FunctionalTerm__Group__2_in_rule__FunctionalTerm__Group__14220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionalTerm__Group__1__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalTerm__Group__2__Impl_in_rule__FunctionalTerm__Group__24279 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FunctionalTerm__Group__3_in_rule__FunctionalTerm__Group__24282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_rule__FunctionalTerm__Group__2__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalTerm__Group__3__Impl_in_rule__FunctionalTerm__Group__34338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionalTerm__Group__3__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicTerms__Group__0__Impl_in_rule__BasicTerms__Group__04405 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BasicTerms__Group__1_in_rule__BasicTerms__Group__04408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicTerms__CarAssignment_0_in_rule__BasicTerms__Group__0__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicTerms__Group__1__Impl_in_rule__BasicTerms__Group__14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicTerms__Group_1__0_in_rule__BasicTerms__Group__1__Impl4492 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__BasicTerms__Group_1__0__Impl_in_rule__BasicTerms__Group_1__04527 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__BasicTerms__Group_1__1_in_rule__BasicTerms__Group_1__04530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BasicTerms__Group_1__0__Impl4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicTerms__Group_1__1__Impl_in_rule__BasicTerms__Group_1__14589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicTerms__CdrAssignment_1_1_in_rule__BasicTerms__Group_1__1__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__Group__0__Impl_in_rule__ConstantDeclaration__Group__04650 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__Group__1_in_rule__ConstantDeclaration__Group__04653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__IdAssignment_0_in_rule__ConstantDeclaration__Group__0__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__Group__1__Impl_in_rule__ConstantDeclaration__Group__14710 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__Group__2_in_rule__ConstantDeclaration__Group__14713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ConstantDeclaration__Group__1__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__Group__2__Impl_in_rule__ConstantDeclaration__Group__24772 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__Group__3_in_rule__ConstantDeclaration__Group__24775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__CvAssignment_2_in_rule__ConstantDeclaration__Group__2__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDeclaration__Group__3__Impl_in_rule__ConstantDeclaration__Group__34832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ConstantDeclaration__Group__3__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__0__Impl_in_rule__TypeDeclaration__Group__04899 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__1_in_rule__TypeDeclaration__Group__04902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__IdAssignment_0_in_rule__TypeDeclaration__Group__0__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__1__Impl_in_rule__TypeDeclaration__Group__14959 = new BitSet(new long[]{0x0000000040380000L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__2_in_rule__TypeDeclaration__Group__14962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TypeDeclaration__Group__1__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__2__Impl_in_rule__TypeDeclaration__Group__25021 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__3_in_rule__TypeDeclaration__Group__25024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__ExpAssignment_2_in_rule__TypeDeclaration__Group__2__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__3__Impl_in_rule__TypeDeclaration__Group__35081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TypeDeclaration__Group__3__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVars__Group__0__Impl_in_rule__TVars__Group__05151 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TVars__Group__1_in_rule__TVars__Group__05154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVars__CarAssignment_0_in_rule__TVars__Group__0__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVars__Group__1__Impl_in_rule__TVars__Group__15211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVars__Group_1__0_in_rule__TVars__Group__1__Impl5238 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__TVars__Group_1__0__Impl_in_rule__TVars__Group_1__05273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TVars__Group_1__1_in_rule__TVars__Group_1__05276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TVars__Group_1__0__Impl5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVars__Group_1__1__Impl_in_rule__TVars__Group_1__15335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVars__CdrAssignment_1_1_in_rule__TVars__Group_1__1__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVar__Group__0__Impl_in_rule__TVar__Group__05396 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__TVar__Group__1_in_rule__TVar__Group__05399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__TVar__Group__0__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVar__Group__1__Impl_in_rule__TVar__Group__15455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TVar__Group__2_in_rule__TVar__Group__15458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TVar__Group__1__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TVar__Group__2__Impl_in_rule__TVar__Group__25517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TVar__Group__2__Impl5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetAddition__Group__0__Impl_in_rule__SetAddition__Group__05579 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SetAddition__Group__1_in_rule__SetAddition__Group__05582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetMultiplication_in_rule__SetAddition__Group__0__Impl5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetAddition__Group__1__Impl_in_rule__SetAddition__Group__15638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetAddition__Group_1__0_in_rule__SetAddition__Group__1__Impl5665 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__SetAddition__Group_1__0__Impl_in_rule__SetAddition__Group_1__05700 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SetAddition__Group_1__1_in_rule__SetAddition__Group_1__05703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetAddition__Group_1__1__Impl_in_rule__SetAddition__Group_1__15761 = new BitSet(new long[]{0x0000000040380000L});
    public static final BitSet FOLLOW_rule__SetAddition__Group_1__2_in_rule__SetAddition__Group_1__15764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SetAddition__Group_1__1__Impl5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetAddition__Group_1__2__Impl_in_rule__SetAddition__Group_1__25823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetAddition__RightAssignment_1_2_in_rule__SetAddition__Group_1__2__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group__0__Impl_in_rule__SetMultiplication__Group__05886 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group__1_in_rule__SetMultiplication__Group__05889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPrimary_in_rule__SetMultiplication__Group__0__Impl5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group__1__Impl_in_rule__SetMultiplication__Group__15945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group_1__0_in_rule__SetMultiplication__Group__1__Impl5972 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group_1__0__Impl_in_rule__SetMultiplication__Group_1__06007 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group_1__1_in_rule__SetMultiplication__Group_1__06010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group_1__1__Impl_in_rule__SetMultiplication__Group_1__16068 = new BitSet(new long[]{0x0000000040380000L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group_1__2_in_rule__SetMultiplication__Group_1__16071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Alternatives_1_1_in_rule__SetMultiplication__Group_1__1__Impl6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetMultiplication__Group_1__2__Impl_in_rule__SetMultiplication__Group_1__26128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetMultiplication__RightAssignment_1_2_in_rule__SetMultiplication__Group_1__2__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPrimary__Group_1__0__Impl_in_rule__SetPrimary__Group_1__06191 = new BitSet(new long[]{0x0000000040380000L});
    public static final BitSet FOLLOW_rule__SetPrimary__Group_1__1_in_rule__SetPrimary__Group_1__06194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SetPrimary__Group_1__0__Impl6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPrimary__Group_1__1__Impl_in_rule__SetPrimary__Group_1__16253 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SetPrimary__Group_1__2_in_rule__SetPrimary__Group_1__16256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAddition_in_rule__SetPrimary__Group_1__1__Impl6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPrimary__Group_1__2__Impl_in_rule__SetPrimary__Group_1__26312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SetPrimary__Group_1__2__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedTerm__Group__0__Impl_in_rule__QuantifiedTerm__Group__06377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuantifiedTerm__Group__1_in_rule__QuantifiedTerm__Group__06380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rule__QuantifiedTerm__Group__0__Impl6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedTerm__Group__1__Impl_in_rule__QuantifiedTerm__Group__16436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QuantifiedTerm__Group__2_in_rule__QuantifiedTerm__Group__16439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QuantifiedTerm__Group__1__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedTerm__Group__2__Impl_in_rule__QuantifiedTerm__Group__26495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__QuantifiedTerm__Group__2__Impl6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group__0__Impl_in_rule__PredicateAtom__Group__06557 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group__1_in_rule__PredicateAtom__Group__06560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateAtom__FidAssignment_0_in_rule__PredicateAtom__Group__0__Impl6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group__1__Impl_in_rule__PredicateAtom__Group__16617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group_1__0_in_rule__PredicateAtom__Group__1__Impl6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group_1__0__Impl_in_rule__PredicateAtom__Group_1__06679 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group_1__1_in_rule__PredicateAtom__Group_1__06682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PredicateAtom__Group_1__0__Impl6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group_1__1__Impl_in_rule__PredicateAtom__Group_1__16741 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group_1__2_in_rule__PredicateAtom__Group_1__16744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateAtom__TermsAssignment_1_1_in_rule__PredicateAtom__Group_1__1__Impl6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateAtom__Group_1__2__Impl_in_rule__PredicateAtom__Group_1__26801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PredicateAtom__Group_1__2__Impl6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInAtom__Group__0__Impl_in_rule__BuiltInAtom__Group__06866 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__BuiltInAtom__Group__1_in_rule__BuiltInAtom__Group__06869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInAtom__LhsAssignment_0_in_rule__BuiltInAtom__Group__0__Impl6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInAtom__Group__1__Impl_in_rule__BuiltInAtom__Group__16926 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__BuiltInAtom__Group__2_in_rule__BuiltInAtom__Group__16929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInAtom__OpAssignment_1_in_rule__BuiltInAtom__Group__1__Impl6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInAtom__Group__2__Impl_in_rule__BuiltInAtom__Group__26986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInAtom__RhsAssignment_2_in_rule__BuiltInAtom__Group__2__Impl7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrSentence__Group__0__Impl_in_rule__OrSentence__Group__07049 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__OrSentence__Group__1_in_rule__OrSentence__Group__07052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndSentence_in_rule__OrSentence__Group__0__Impl7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrSentence__Group__1__Impl_in_rule__OrSentence__Group__17108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrSentence__Group_1__0_in_rule__OrSentence__Group__1__Impl7135 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__OrSentence__Group_1__0__Impl_in_rule__OrSentence__Group_1__07170 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__OrSentence__Group_1__1_in_rule__OrSentence__Group_1__07173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrSentence__Group_1__1__Impl_in_rule__OrSentence__Group_1__17231 = new BitSet(new long[]{0x0000002040000010L});
    public static final BitSet FOLLOW_rule__OrSentence__Group_1__2_in_rule__OrSentence__Group_1__17234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OrSentence__Group_1__1__Impl7262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrSentence__Group_1__2__Impl_in_rule__OrSentence__Group_1__27293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrSentence__RightAssignment_1_2_in_rule__OrSentence__Group_1__2__Impl7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndSentence__Group__0__Impl_in_rule__AndSentence__Group__07356 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AndSentence__Group__1_in_rule__AndSentence__Group__07359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotSentence_in_rule__AndSentence__Group__0__Impl7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndSentence__Group__1__Impl_in_rule__AndSentence__Group__17415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndSentence__Group_1__0_in_rule__AndSentence__Group__1__Impl7442 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__AndSentence__Group_1__0__Impl_in_rule__AndSentence__Group_1__07477 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AndSentence__Group_1__1_in_rule__AndSentence__Group_1__07480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndSentence__Group_1__1__Impl_in_rule__AndSentence__Group_1__17538 = new BitSet(new long[]{0x0000002040000010L});
    public static final BitSet FOLLOW_rule__AndSentence__Group_1__2_in_rule__AndSentence__Group_1__17541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AndSentence__Group_1__1__Impl7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndSentence__Group_1__2__Impl_in_rule__AndSentence__Group_1__27600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndSentence__RightAssignment_1_2_in_rule__AndSentence__Group_1__2__Impl7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotSentence__Group_1__0__Impl_in_rule__NotSentence__Group_1__07663 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__NotSentence__Group_1__1_in_rule__NotSentence__Group_1__07666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__NotSentence__Group_1__0__Impl7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotSentence__Group_1__1__Impl_in_rule__NotSentence__Group_1__17725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimarySentence_in_rule__NotSentence__Group_1__1__Impl7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimarySentence__Group_1__0__Impl_in_rule__PrimarySentence__Group_1__07785 = new BitSet(new long[]{0x0000002040000010L});
    public static final BitSet FOLLOW_rule__PrimarySentence__Group_1__1_in_rule__PrimarySentence__Group_1__07788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PrimarySentence__Group_1__0__Impl7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimarySentence__Group_1__1__Impl_in_rule__PrimarySentence__Group_1__17847 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PrimarySentence__Group_1__2_in_rule__PrimarySentence__Group_1__17850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrSentence_in_rule__PrimarySentence__Group_1__1__Impl7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimarySentence__Group_1__2__Impl_in_rule__PrimarySentence__Group_1__27906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PrimarySentence__Group_1__2__Impl7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__0__Impl_in_rule__MaybeLiteral__Group__07971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__1_in_rule__MaybeLiteral__Group__07974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MaybeLiteral__Group__0__Impl8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__1__Impl_in_rule__MaybeLiteral__Group__18033 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__2_in_rule__MaybeLiteral__Group__18036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MaybeLiteral__Group__1__Impl8063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__2__Impl_in_rule__MaybeLiteral__Group__28092 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__3_in_rule__MaybeLiteral__Group__28095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MaybeLiteral__Group__2__Impl8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__3__Impl_in_rule__MaybeLiteral__Group__38154 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__4_in_rule__MaybeLiteral__Group__38157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_rule__MaybeLiteral__Group__3__Impl8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaybeLiteral__Group__4__Impl_in_rule__MaybeLiteral__Group__48213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MaybeLiteral__Group__4__Impl8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__0__Impl_in_rule__CardinalityConstraint__Group__08282 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__1_in_rule__CardinalityConstraint__Group__08285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__LhsAssignment_0_in_rule__CardinalityConstraint__Group__0__Impl8312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__1__Impl_in_rule__CardinalityConstraint__Group__18342 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__2_in_rule__CardinalityConstraint__Group__18345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CardinalityConstraint__Group__1__Impl8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__2__Impl_in_rule__CardinalityConstraint__Group__28404 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__3_in_rule__CardinalityConstraint__Group__28407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CardinalityConstraint__Group__2__Impl8435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__3__Impl_in_rule__CardinalityConstraint__Group__38466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__4_in_rule__CardinalityConstraint__Group__38469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__CardinalityConstraint__Group__3__Impl8497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__4__Impl_in_rule__CardinalityConstraint__Group__48528 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__5_in_rule__CardinalityConstraint__Group__48531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__IdAssignment_4_in_rule__CardinalityConstraint__Group__4__Impl8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__5__Impl_in_rule__CardinalityConstraint__Group__58588 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__6_in_rule__CardinalityConstraint__Group__58591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CardinalityConstraint__Group__5__Impl8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__6__Impl_in_rule__CardinalityConstraint__Group__68650 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__7_in_rule__CardinalityConstraint__Group__68653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__TermsAssignment_6_in_rule__CardinalityConstraint__Group__6__Impl8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__7__Impl_in_rule__CardinalityConstraint__Group__78710 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__8_in_rule__CardinalityConstraint__Group__78713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CardinalityConstraint__Group__7__Impl8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__8__Impl_in_rule__CardinalityConstraint__Group__88772 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__9_in_rule__CardinalityConstraint__Group__88775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__CardinalityConstraint__Group__8__Impl8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__9__Impl_in_rule__CardinalityConstraint__Group__98834 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__10_in_rule__CardinalityConstraint__Group__98837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CardinalityConstraint__Group__9__Impl8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__10__Impl_in_rule__CardinalityConstraint__Group__108896 = new BitSet(new long[]{0x0000004040000050L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__11_in_rule__CardinalityConstraint__Group__108899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CardinalityConstraint__Group__10__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__Group__11__Impl_in_rule__CardinalityConstraint__Group__118958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityConstraint__RhsAssignment_11_in_rule__CardinalityConstraint__Group__11__Impl8985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__09039 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__09042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__HeadAssignment_0_in_rule__Rule__Group__0__Impl9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__19099 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__19102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl9129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__29160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Rule__Group__2__Impl9188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__09225 = new BitSet(new long[]{0x0000002040000010L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__09228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Rule__Group_1__0__Impl9256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__19287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__BodyAssignment_1_1_in_rule__Rule__Group_1__1__Impl9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Program__StatementsAssignment9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UID_in_rule__Variable__IdentifierAssignment9385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypedVariable__TypeAssignment_09416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__TypedVariable__VarAssignment_19447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RhsAssignment_1_29478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Multiplication__RhsAssignment_1_29509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArithmeticLiteral__IdentifierAssignment_09540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArithmeticLiteral__ValueAssignment_19571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_rule__BasicTerms__CarAssignment_09602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_rule__BasicTerms__CdrAssignment_1_19633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_rule__ConstantDeclaration__IdAssignment_09664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_rule__ConstantDeclaration__CvAssignment_29695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDeclaration__IdAssignment_09726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExpression_in_rule__TypeDeclaration__ExpAssignment_29757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_rule__Limit__CvAssignment9788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTVar_in_rule__TVars__CarAssignment_09825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTVar_in_rule__TVars__CdrAssignment_1_19856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetMultiplication_in_rule__SetAddition__RightAssignment_1_29887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPrimary_in_rule__SetMultiplication__RightAssignment_1_29918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__ValueAlternatives_0_in_rule__SetLiteral__ValueAssignment9949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PredicateAtom__FidAssignment_09982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_rule__PredicateAtom__TermsAssignment_1_110013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_rule__BuiltInAtom__LhsAssignment_010044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomOp_in_rule__BuiltInAtom__OpAssignment_110075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_rule__BuiltInAtom__RhsAssignment_210106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndSentence_in_rule__OrSentence__RightAssignment_1_210137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotSentence_in_rule__AndSentence__RightAssignment_1_210168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__CardinalityConstraint__LhsAssignment_010199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CardinalityConstraint__IdAssignment_410230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_rule__CardinalityConstraint__TermsAssignment_610261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__CardinalityConstraint__RhsAssignment_1110292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_rule__Bound__AvAssignment10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_rule__Rule__HeadAssignment_010354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_rule__Rule__BodyAssignment_1_110385 = new BitSet(new long[]{0x0000000000000002L});

}