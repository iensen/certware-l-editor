package net.certware.argument.analysis.ui.contentassist.antlr.internal; 

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
import net.certware.argument.analysis.services.AnalysisDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnalysisDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SATISFIABLE", "RULE_UNSATISFIABLE", "RULE_PREDICATE_NAME", "RULE_CONSTANT_SYMBOL", "RULE_NUMBER", "RULE_FUNCTIONAL_SYMBOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "','", "'-'"
    };
    public static final int RULE_STRING=12;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int RULE_PREDICATE_NAME=6;
    public static final int RULE_SATISFIABLE=4;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_CONSTANT_SYMBOL=7;
    public static final int RULE_FUNCTIONAL_SYMBOL=9;
    public static final int RULE_UNSATISFIABLE=5;
    public static final int RULE_ID=10;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=8;
    public static final int RULE_INT=11;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalAnalysisDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnalysisDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnalysisDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g"; }


     
     	private AnalysisDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AnalysisDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleOutput"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:60:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:61:1: ( ruleOutput EOF )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:62:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput61);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput68); 

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:69:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:73:2: ( ( ( rule__Output__Group__0 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:74:1: ( ( rule__Output__Group__0 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:74:1: ( ( rule__Output__Group__0 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:75:1: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:76:1: ( rule__Output__Group__0 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:76:2: rule__Output__Group__0
            {
            pushFollow(FOLLOW_rule__Output__Group__0_in_ruleOutput94);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleLine"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:88:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:89:1: ( ruleLine EOF )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:90:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine121);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine128); 

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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:97:1: ruleLine : ( ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:101:2: ( ( ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:102:1: ( ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:102:1: ( ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:103:1: ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:103:1: ( ( rule__Line__ItemsAssignment ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:104:1: ( rule__Line__ItemsAssignment )
            {
             before(grammarAccess.getLineAccess().getItemsAssignment()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:105:1: ( rule__Line__ItemsAssignment )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:105:2: rule__Line__ItemsAssignment
            {
            pushFollow(FOLLOW_rule__Line__ItemsAssignment_in_ruleLine156);
            rule__Line__ItemsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getItemsAssignment()); 

            }

            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:108:1: ( ( rule__Line__ItemsAssignment )* )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:109:1: ( rule__Line__ItemsAssignment )*
            {
             before(grammarAccess.getLineAccess().getItemsAssignment()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:110:1: ( rule__Line__ItemsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_PREDICATE_NAME) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==RULE_PREDICATE_NAME) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:110:2: rule__Line__ItemsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Line__ItemsAssignment_in_ruleLine168);
            	    rule__Line__ItemsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getItemsAssignment()); 

            }


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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleClassicLiteral"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:123:1: entryRuleClassicLiteral : ruleClassicLiteral EOF ;
    public final void entryRuleClassicLiteral() throws RecognitionException {
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:124:1: ( ruleClassicLiteral EOF )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:125:1: ruleClassicLiteral EOF
            {
             before(grammarAccess.getClassicLiteralRule()); 
            pushFollow(FOLLOW_ruleClassicLiteral_in_entryRuleClassicLiteral198);
            ruleClassicLiteral();

            state._fsp--;

             after(grammarAccess.getClassicLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassicLiteral205); 

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
    // $ANTLR end "entryRuleClassicLiteral"


    // $ANTLR start "ruleClassicLiteral"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:132:1: ruleClassicLiteral : ( ( rule__ClassicLiteral__Group__0 ) ) ;
    public final void ruleClassicLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:136:2: ( ( ( rule__ClassicLiteral__Group__0 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:137:1: ( ( rule__ClassicLiteral__Group__0 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:137:1: ( ( rule__ClassicLiteral__Group__0 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:138:1: ( rule__ClassicLiteral__Group__0 )
            {
             before(grammarAccess.getClassicLiteralAccess().getGroup()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:139:1: ( rule__ClassicLiteral__Group__0 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:139:2: rule__ClassicLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ClassicLiteral__Group__0_in_ruleClassicLiteral231);
            rule__ClassicLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassicLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleClassicLiteral"


    // $ANTLR start "entryRuleAtom"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:151:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:152:1: ( ruleAtom EOF )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:153:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom258);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom265); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:160:1: ruleAtom : ( ( rule__Atom__Group__0 ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:164:2: ( ( ( rule__Atom__Group__0 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:165:1: ( ( rule__Atom__Group__0 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:165:1: ( ( rule__Atom__Group__0 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:166:1: ( rule__Atom__Group__0 )
            {
             before(grammarAccess.getAtomAccess().getGroup()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:167:1: ( rule__Atom__Group__0 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:167:2: rule__Atom__Group__0
            {
            pushFollow(FOLLOW_rule__Atom__Group__0_in_ruleAtom291);
            rule__Atom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getGroup()); 

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleTerms"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:179:1: entryRuleTerms : ruleTerms EOF ;
    public final void entryRuleTerms() throws RecognitionException {
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:180:1: ( ruleTerms EOF )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:181:1: ruleTerms EOF
            {
             before(grammarAccess.getTermsRule()); 
            pushFollow(FOLLOW_ruleTerms_in_entryRuleTerms318);
            ruleTerms();

            state._fsp--;

             after(grammarAccess.getTermsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerms325); 

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
    // $ANTLR end "entryRuleTerms"


    // $ANTLR start "ruleTerms"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:188:1: ruleTerms : ( ( rule__Terms__Group__0 ) ) ;
    public final void ruleTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:192:2: ( ( ( rule__Terms__Group__0 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:193:1: ( ( rule__Terms__Group__0 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:193:1: ( ( rule__Terms__Group__0 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:194:1: ( rule__Terms__Group__0 )
            {
             before(grammarAccess.getTermsAccess().getGroup()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:195:1: ( rule__Terms__Group__0 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:195:2: rule__Terms__Group__0
            {
            pushFollow(FOLLOW_rule__Terms__Group__0_in_ruleTerms351);
            rule__Terms__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermsAccess().getGroup()); 

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
    // $ANTLR end "ruleTerms"


    // $ANTLR start "entryRuleTerm"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:207:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:208:1: ( ruleTerm EOF )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:209:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm378);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm385); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:216:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:220:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:221:1: ( ( rule__Term__Alternatives ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:221:1: ( ( rule__Term__Alternatives ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:222:1: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:223:1: ( rule__Term__Alternatives )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:223:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm411);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "rule__Output__Alternatives_1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:235:1: rule__Output__Alternatives_1 : ( ( RULE_SATISFIABLE ) | ( RULE_UNSATISFIABLE ) );
    public final void rule__Output__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:239:1: ( ( RULE_SATISFIABLE ) | ( RULE_UNSATISFIABLE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SATISFIABLE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_UNSATISFIABLE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:240:1: ( RULE_SATISFIABLE )
                    {
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:240:1: ( RULE_SATISFIABLE )
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:241:1: RULE_SATISFIABLE
                    {
                     before(grammarAccess.getOutputAccess().getSATISFIABLETerminalRuleCall_1_0()); 
                    match(input,RULE_SATISFIABLE,FOLLOW_RULE_SATISFIABLE_in_rule__Output__Alternatives_1447); 
                     after(grammarAccess.getOutputAccess().getSATISFIABLETerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:246:6: ( RULE_UNSATISFIABLE )
                    {
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:246:6: ( RULE_UNSATISFIABLE )
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:247:1: RULE_UNSATISFIABLE
                    {
                     before(grammarAccess.getOutputAccess().getUNSATISFIABLETerminalRuleCall_1_1()); 
                    match(input,RULE_UNSATISFIABLE,FOLLOW_RULE_UNSATISFIABLE_in_rule__Output__Alternatives_1464); 
                     after(grammarAccess.getOutputAccess().getUNSATISFIABLETerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Output__Alternatives_1"


    // $ANTLR start "rule__Term__Alternatives"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:257:1: rule__Term__Alternatives : ( ( ( rule__Term__CsAssignment_0 ) ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:261:1: ( ( ( rule__Term__CsAssignment_0 ) ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_CONSTANT_SYMBOL:
                {
                alt3=1;
                }
                break;
            case RULE_NUMBER:
            case 20:
                {
                alt3=2;
                }
                break;
            case RULE_FUNCTIONAL_SYMBOL:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:262:1: ( ( rule__Term__CsAssignment_0 ) )
                    {
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:262:1: ( ( rule__Term__CsAssignment_0 ) )
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:263:1: ( rule__Term__CsAssignment_0 )
                    {
                     before(grammarAccess.getTermAccess().getCsAssignment_0()); 
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:264:1: ( rule__Term__CsAssignment_0 )
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:264:2: rule__Term__CsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Term__CsAssignment_0_in_rule__Term__Alternatives496);
                    rule__Term__CsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getCsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:268:6: ( ( rule__Term__Group_1__0 ) )
                    {
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:268:6: ( ( rule__Term__Group_1__0 ) )
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:269:1: ( rule__Term__Group_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1()); 
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:270:1: ( rule__Term__Group_1__0 )
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:270:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives514);
                    rule__Term__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:274:6: ( ( rule__Term__Group_2__0 ) )
                    {
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:274:6: ( ( rule__Term__Group_2__0 ) )
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:275:1: ( rule__Term__Group_2__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_2()); 
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:276:1: ( rule__Term__Group_2__0 )
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:276:2: rule__Term__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives532);
                    rule__Term__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__Output__Group__0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:287:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:291:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:292:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__0563);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__0566);
            rule__Output__Group__1();

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
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:299:1: rule__Output__Group__0__Impl : ( ( ( rule__Output__LinesAssignment_0 ) ) ( ( rule__Output__LinesAssignment_0 )* ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:303:1: ( ( ( ( rule__Output__LinesAssignment_0 ) ) ( ( rule__Output__LinesAssignment_0 )* ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:304:1: ( ( ( rule__Output__LinesAssignment_0 ) ) ( ( rule__Output__LinesAssignment_0 )* ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:304:1: ( ( ( rule__Output__LinesAssignment_0 ) ) ( ( rule__Output__LinesAssignment_0 )* ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:305:1: ( ( rule__Output__LinesAssignment_0 ) ) ( ( rule__Output__LinesAssignment_0 )* )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:305:1: ( ( rule__Output__LinesAssignment_0 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:306:1: ( rule__Output__LinesAssignment_0 )
            {
             before(grammarAccess.getOutputAccess().getLinesAssignment_0()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:307:1: ( rule__Output__LinesAssignment_0 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:307:2: rule__Output__LinesAssignment_0
            {
            pushFollow(FOLLOW_rule__Output__LinesAssignment_0_in_rule__Output__Group__0__Impl595);
            rule__Output__LinesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getLinesAssignment_0()); 

            }

            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:310:1: ( ( rule__Output__LinesAssignment_0 )* )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:311:1: ( rule__Output__LinesAssignment_0 )*
            {
             before(grammarAccess.getOutputAccess().getLinesAssignment_0()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:312:1: ( rule__Output__LinesAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_PREDICATE_NAME||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:312:2: rule__Output__LinesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Output__LinesAssignment_0_in_rule__Output__Group__0__Impl607);
            	    rule__Output__LinesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getOutputAccess().getLinesAssignment_0()); 

            }


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
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:323:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:327:1: ( rule__Output__Group__1__Impl )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:328:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__1640);
            rule__Output__Group__1__Impl();

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
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:334:1: rule__Output__Group__1__Impl : ( ( rule__Output__Alternatives_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:338:1: ( ( ( rule__Output__Alternatives_1 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:339:1: ( ( rule__Output__Alternatives_1 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:339:1: ( ( rule__Output__Alternatives_1 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:340:1: ( rule__Output__Alternatives_1 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_1()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:341:1: ( rule__Output__Alternatives_1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:341:2: rule__Output__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Output__Alternatives_1_in_rule__Output__Group__1__Impl667);
            rule__Output__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__ClassicLiteral__Group__0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:355:1: rule__ClassicLiteral__Group__0 : rule__ClassicLiteral__Group__0__Impl rule__ClassicLiteral__Group__1 ;
    public final void rule__ClassicLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:359:1: ( rule__ClassicLiteral__Group__0__Impl rule__ClassicLiteral__Group__1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:360:2: rule__ClassicLiteral__Group__0__Impl rule__ClassicLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ClassicLiteral__Group__0__Impl_in_rule__ClassicLiteral__Group__0701);
            rule__ClassicLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassicLiteral__Group__1_in_rule__ClassicLiteral__Group__0704);
            rule__ClassicLiteral__Group__1();

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
    // $ANTLR end "rule__ClassicLiteral__Group__0"


    // $ANTLR start "rule__ClassicLiteral__Group__0__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:367:1: rule__ClassicLiteral__Group__0__Impl : ( ( rule__ClassicLiteral__NegAssignment_0 )? ) ;
    public final void rule__ClassicLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:371:1: ( ( ( rule__ClassicLiteral__NegAssignment_0 )? ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:372:1: ( ( rule__ClassicLiteral__NegAssignment_0 )? )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:372:1: ( ( rule__ClassicLiteral__NegAssignment_0 )? )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:373:1: ( rule__ClassicLiteral__NegAssignment_0 )?
            {
             before(grammarAccess.getClassicLiteralAccess().getNegAssignment_0()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:374:1: ( rule__ClassicLiteral__NegAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:374:2: rule__ClassicLiteral__NegAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ClassicLiteral__NegAssignment_0_in_rule__ClassicLiteral__Group__0__Impl731);
                    rule__ClassicLiteral__NegAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassicLiteralAccess().getNegAssignment_0()); 

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
    // $ANTLR end "rule__ClassicLiteral__Group__0__Impl"


    // $ANTLR start "rule__ClassicLiteral__Group__1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:384:1: rule__ClassicLiteral__Group__1 : rule__ClassicLiteral__Group__1__Impl ;
    public final void rule__ClassicLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:388:1: ( rule__ClassicLiteral__Group__1__Impl )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:389:2: rule__ClassicLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassicLiteral__Group__1__Impl_in_rule__ClassicLiteral__Group__1762);
            rule__ClassicLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__ClassicLiteral__Group__1"


    // $ANTLR start "rule__ClassicLiteral__Group__1__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:395:1: rule__ClassicLiteral__Group__1__Impl : ( ( rule__ClassicLiteral__AtomAssignment_1 ) ) ;
    public final void rule__ClassicLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:399:1: ( ( ( rule__ClassicLiteral__AtomAssignment_1 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:400:1: ( ( rule__ClassicLiteral__AtomAssignment_1 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:400:1: ( ( rule__ClassicLiteral__AtomAssignment_1 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:401:1: ( rule__ClassicLiteral__AtomAssignment_1 )
            {
             before(grammarAccess.getClassicLiteralAccess().getAtomAssignment_1()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:402:1: ( rule__ClassicLiteral__AtomAssignment_1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:402:2: rule__ClassicLiteral__AtomAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassicLiteral__AtomAssignment_1_in_rule__ClassicLiteral__Group__1__Impl789);
            rule__ClassicLiteral__AtomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassicLiteralAccess().getAtomAssignment_1()); 

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
    // $ANTLR end "rule__ClassicLiteral__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group__0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:416:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:420:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:421:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
            {
            pushFollow(FOLLOW_rule__Atom__Group__0__Impl_in_rule__Atom__Group__0823);
            rule__Atom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group__1_in_rule__Atom__Group__0826);
            rule__Atom__Group__1();

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
    // $ANTLR end "rule__Atom__Group__0"


    // $ANTLR start "rule__Atom__Group__0__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:428:1: rule__Atom__Group__0__Impl : ( ( rule__Atom__NameAssignment_0 ) ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:432:1: ( ( ( rule__Atom__NameAssignment_0 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:433:1: ( ( rule__Atom__NameAssignment_0 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:433:1: ( ( rule__Atom__NameAssignment_0 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:434:1: ( rule__Atom__NameAssignment_0 )
            {
             before(grammarAccess.getAtomAccess().getNameAssignment_0()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:435:1: ( rule__Atom__NameAssignment_0 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:435:2: rule__Atom__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Atom__NameAssignment_0_in_rule__Atom__Group__0__Impl853);
            rule__Atom__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Atom__Group__0__Impl"


    // $ANTLR start "rule__Atom__Group__1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:445:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:449:1: ( rule__Atom__Group__1__Impl )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:450:2: rule__Atom__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group__1__Impl_in_rule__Atom__Group__1883);
            rule__Atom__Group__1__Impl();

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
    // $ANTLR end "rule__Atom__Group__1"


    // $ANTLR start "rule__Atom__Group__1__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:456:1: rule__Atom__Group__1__Impl : ( ( rule__Atom__Group_1__0 )? ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:460:1: ( ( ( rule__Atom__Group_1__0 )? ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:461:1: ( ( rule__Atom__Group_1__0 )? )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:461:1: ( ( rule__Atom__Group_1__0 )? )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:462:1: ( rule__Atom__Group_1__0 )?
            {
             before(grammarAccess.getAtomAccess().getGroup_1()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:463:1: ( rule__Atom__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:463:2: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Group__1__Impl910);
                    rule__Atom__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Atom__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:477:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:481:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:482:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__0945);
            rule__Atom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__0948);
            rule__Atom__Group_1__1();

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
    // $ANTLR end "rule__Atom__Group_1__0"


    // $ANTLR start "rule__Atom__Group_1__0__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:489:1: rule__Atom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:493:1: ( ( '(' ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:494:1: ( '(' )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:494:1: ( '(' )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:495:1: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Atom__Group_1__0__Impl976); 
             after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Atom__Group_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1__1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:508:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:512:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:513:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__11007);
            rule__Atom__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__11010);
            rule__Atom__Group_1__2();

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
    // $ANTLR end "rule__Atom__Group_1__1"


    // $ANTLR start "rule__Atom__Group_1__1__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:520:1: rule__Atom__Group_1__1__Impl : ( ( rule__Atom__TermsAssignment_1_1 )? ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:524:1: ( ( ( rule__Atom__TermsAssignment_1_1 )? ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:525:1: ( ( rule__Atom__TermsAssignment_1_1 )? )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:525:1: ( ( rule__Atom__TermsAssignment_1_1 )? )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:526:1: ( rule__Atom__TermsAssignment_1_1 )?
            {
             before(grammarAccess.getAtomAccess().getTermsAssignment_1_1()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:527:1: ( rule__Atom__TermsAssignment_1_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_CONSTANT_SYMBOL && LA7_0<=RULE_FUNCTIONAL_SYMBOL)||LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:527:2: rule__Atom__TermsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Atom__TermsAssignment_1_1_in_rule__Atom__Group_1__1__Impl1037);
                    rule__Atom__TermsAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomAccess().getTermsAssignment_1_1()); 

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
    // $ANTLR end "rule__Atom__Group_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__2"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:537:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:541:1: ( rule__Atom__Group_1__2__Impl )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:542:2: rule__Atom__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__21068);
            rule__Atom__Group_1__2__Impl();

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
    // $ANTLR end "rule__Atom__Group_1__2"


    // $ANTLR start "rule__Atom__Group_1__2__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:548:1: rule__Atom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:552:1: ( ( ')' ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:553:1: ( ')' )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:553:1: ( ')' )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:554:1: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 
            match(input,18,FOLLOW_18_in_rule__Atom__Group_1__2__Impl1096); 
             after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Atom__Group_1__2__Impl"


    // $ANTLR start "rule__Terms__Group__0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:573:1: rule__Terms__Group__0 : rule__Terms__Group__0__Impl rule__Terms__Group__1 ;
    public final void rule__Terms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:577:1: ( rule__Terms__Group__0__Impl rule__Terms__Group__1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:578:2: rule__Terms__Group__0__Impl rule__Terms__Group__1
            {
            pushFollow(FOLLOW_rule__Terms__Group__0__Impl_in_rule__Terms__Group__01133);
            rule__Terms__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terms__Group__1_in_rule__Terms__Group__01136);
            rule__Terms__Group__1();

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
    // $ANTLR end "rule__Terms__Group__0"


    // $ANTLR start "rule__Terms__Group__0__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:585:1: rule__Terms__Group__0__Impl : ( ( rule__Terms__CarAssignment_0 ) ) ;
    public final void rule__Terms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:589:1: ( ( ( rule__Terms__CarAssignment_0 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:590:1: ( ( rule__Terms__CarAssignment_0 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:590:1: ( ( rule__Terms__CarAssignment_0 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:591:1: ( rule__Terms__CarAssignment_0 )
            {
             before(grammarAccess.getTermsAccess().getCarAssignment_0()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:592:1: ( rule__Terms__CarAssignment_0 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:592:2: rule__Terms__CarAssignment_0
            {
            pushFollow(FOLLOW_rule__Terms__CarAssignment_0_in_rule__Terms__Group__0__Impl1163);
            rule__Terms__CarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermsAccess().getCarAssignment_0()); 

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
    // $ANTLR end "rule__Terms__Group__0__Impl"


    // $ANTLR start "rule__Terms__Group__1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:602:1: rule__Terms__Group__1 : rule__Terms__Group__1__Impl ;
    public final void rule__Terms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:606:1: ( rule__Terms__Group__1__Impl )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:607:2: rule__Terms__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Terms__Group__1__Impl_in_rule__Terms__Group__11193);
            rule__Terms__Group__1__Impl();

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
    // $ANTLR end "rule__Terms__Group__1"


    // $ANTLR start "rule__Terms__Group__1__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:613:1: rule__Terms__Group__1__Impl : ( ( rule__Terms__Group_1__0 )* ) ;
    public final void rule__Terms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:617:1: ( ( ( rule__Terms__Group_1__0 )* ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:618:1: ( ( rule__Terms__Group_1__0 )* )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:618:1: ( ( rule__Terms__Group_1__0 )* )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:619:1: ( rule__Terms__Group_1__0 )*
            {
             before(grammarAccess.getTermsAccess().getGroup_1()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:620:1: ( rule__Terms__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:620:2: rule__Terms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Terms__Group_1__0_in_rule__Terms__Group__1__Impl1220);
            	    rule__Terms__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTermsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Terms__Group__1__Impl"


    // $ANTLR start "rule__Terms__Group_1__0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:634:1: rule__Terms__Group_1__0 : rule__Terms__Group_1__0__Impl rule__Terms__Group_1__1 ;
    public final void rule__Terms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:638:1: ( rule__Terms__Group_1__0__Impl rule__Terms__Group_1__1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:639:2: rule__Terms__Group_1__0__Impl rule__Terms__Group_1__1
            {
            pushFollow(FOLLOW_rule__Terms__Group_1__0__Impl_in_rule__Terms__Group_1__01255);
            rule__Terms__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terms__Group_1__1_in_rule__Terms__Group_1__01258);
            rule__Terms__Group_1__1();

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
    // $ANTLR end "rule__Terms__Group_1__0"


    // $ANTLR start "rule__Terms__Group_1__0__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:646:1: rule__Terms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Terms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:650:1: ( ( ',' ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:651:1: ( ',' )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:651:1: ( ',' )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:652:1: ','
            {
             before(grammarAccess.getTermsAccess().getCommaKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Terms__Group_1__0__Impl1286); 
             after(grammarAccess.getTermsAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Terms__Group_1__0__Impl"


    // $ANTLR start "rule__Terms__Group_1__1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:665:1: rule__Terms__Group_1__1 : rule__Terms__Group_1__1__Impl ;
    public final void rule__Terms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:669:1: ( rule__Terms__Group_1__1__Impl )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:670:2: rule__Terms__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Terms__Group_1__1__Impl_in_rule__Terms__Group_1__11317);
            rule__Terms__Group_1__1__Impl();

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
    // $ANTLR end "rule__Terms__Group_1__1"


    // $ANTLR start "rule__Terms__Group_1__1__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:676:1: rule__Terms__Group_1__1__Impl : ( ( rule__Terms__CdrAssignment_1_1 ) ) ;
    public final void rule__Terms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:680:1: ( ( ( rule__Terms__CdrAssignment_1_1 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:681:1: ( ( rule__Terms__CdrAssignment_1_1 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:681:1: ( ( rule__Terms__CdrAssignment_1_1 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:682:1: ( rule__Terms__CdrAssignment_1_1 )
            {
             before(grammarAccess.getTermsAccess().getCdrAssignment_1_1()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:683:1: ( rule__Terms__CdrAssignment_1_1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:683:2: rule__Terms__CdrAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Terms__CdrAssignment_1_1_in_rule__Terms__Group_1__1__Impl1344);
            rule__Terms__CdrAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermsAccess().getCdrAssignment_1_1()); 

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
    // $ANTLR end "rule__Terms__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:697:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:701:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:702:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__01378);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__01381);
            rule__Term__Group_1__1();

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
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:709:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__SignAssignment_1_0 )? ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:713:1: ( ( ( rule__Term__SignAssignment_1_0 )? ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:714:1: ( ( rule__Term__SignAssignment_1_0 )? )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:714:1: ( ( rule__Term__SignAssignment_1_0 )? )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:715:1: ( rule__Term__SignAssignment_1_0 )?
            {
             before(grammarAccess.getTermAccess().getSignAssignment_1_0()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:716:1: ( rule__Term__SignAssignment_1_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:716:2: rule__Term__SignAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Term__SignAssignment_1_0_in_rule__Term__Group_1__0__Impl1408);
                    rule__Term__SignAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getSignAssignment_1_0()); 

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
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:726:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:730:1: ( rule__Term__Group_1__1__Impl )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:731:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__11439);
            rule__Term__Group_1__1__Impl();

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
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:737:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__NAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:741:1: ( ( ( rule__Term__NAssignment_1_1 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:742:1: ( ( rule__Term__NAssignment_1_1 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:742:1: ( ( rule__Term__NAssignment_1_1 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:743:1: ( rule__Term__NAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getNAssignment_1_1()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:744:1: ( rule__Term__NAssignment_1_1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:744:2: rule__Term__NAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Term__NAssignment_1_1_in_rule__Term__Group_1__1__Impl1466);
            rule__Term__NAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getNAssignment_1_1()); 

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
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_2__0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:758:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:762:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:763:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__01500);
            rule__Term__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__01503);
            rule__Term__Group_2__1();

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
    // $ANTLR end "rule__Term__Group_2__0"


    // $ANTLR start "rule__Term__Group_2__0__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:770:1: rule__Term__Group_2__0__Impl : ( ( rule__Term__FsAssignment_2_0 ) ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:774:1: ( ( ( rule__Term__FsAssignment_2_0 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:775:1: ( ( rule__Term__FsAssignment_2_0 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:775:1: ( ( rule__Term__FsAssignment_2_0 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:776:1: ( rule__Term__FsAssignment_2_0 )
            {
             before(grammarAccess.getTermAccess().getFsAssignment_2_0()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:777:1: ( rule__Term__FsAssignment_2_0 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:777:2: rule__Term__FsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Term__FsAssignment_2_0_in_rule__Term__Group_2__0__Impl1530);
            rule__Term__FsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getFsAssignment_2_0()); 

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
    // $ANTLR end "rule__Term__Group_2__0__Impl"


    // $ANTLR start "rule__Term__Group_2__1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:787:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl rule__Term__Group_2__2 ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:791:1: ( rule__Term__Group_2__1__Impl rule__Term__Group_2__2 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:792:2: rule__Term__Group_2__1__Impl rule__Term__Group_2__2
            {
            pushFollow(FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__11560);
            rule__Term__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_2__2_in_rule__Term__Group_2__11563);
            rule__Term__Group_2__2();

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
    // $ANTLR end "rule__Term__Group_2__1"


    // $ANTLR start "rule__Term__Group_2__1__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:799:1: rule__Term__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:803:1: ( ( '(' ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:804:1: ( '(' )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:804:1: ( '(' )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:805:1: '('
            {
             before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,17,FOLLOW_17_in_rule__Term__Group_2__1__Impl1591); 
             after(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_1()); 

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
    // $ANTLR end "rule__Term__Group_2__1__Impl"


    // $ANTLR start "rule__Term__Group_2__2"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:818:1: rule__Term__Group_2__2 : rule__Term__Group_2__2__Impl rule__Term__Group_2__3 ;
    public final void rule__Term__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:822:1: ( rule__Term__Group_2__2__Impl rule__Term__Group_2__3 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:823:2: rule__Term__Group_2__2__Impl rule__Term__Group_2__3
            {
            pushFollow(FOLLOW_rule__Term__Group_2__2__Impl_in_rule__Term__Group_2__21622);
            rule__Term__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_2__3_in_rule__Term__Group_2__21625);
            rule__Term__Group_2__3();

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
    // $ANTLR end "rule__Term__Group_2__2"


    // $ANTLR start "rule__Term__Group_2__2__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:830:1: rule__Term__Group_2__2__Impl : ( ( rule__Term__TermsAssignment_2_2 ) ) ;
    public final void rule__Term__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:834:1: ( ( ( rule__Term__TermsAssignment_2_2 ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:835:1: ( ( rule__Term__TermsAssignment_2_2 ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:835:1: ( ( rule__Term__TermsAssignment_2_2 ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:836:1: ( rule__Term__TermsAssignment_2_2 )
            {
             before(grammarAccess.getTermAccess().getTermsAssignment_2_2()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:837:1: ( rule__Term__TermsAssignment_2_2 )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:837:2: rule__Term__TermsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Term__TermsAssignment_2_2_in_rule__Term__Group_2__2__Impl1652);
            rule__Term__TermsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getTermsAssignment_2_2()); 

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
    // $ANTLR end "rule__Term__Group_2__2__Impl"


    // $ANTLR start "rule__Term__Group_2__3"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:847:1: rule__Term__Group_2__3 : rule__Term__Group_2__3__Impl ;
    public final void rule__Term__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:851:1: ( rule__Term__Group_2__3__Impl )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:852:2: rule__Term__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_2__3__Impl_in_rule__Term__Group_2__31682);
            rule__Term__Group_2__3__Impl();

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
    // $ANTLR end "rule__Term__Group_2__3"


    // $ANTLR start "rule__Term__Group_2__3__Impl"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:858:1: rule__Term__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Term__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:862:1: ( ( ')' ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:863:1: ( ')' )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:863:1: ( ')' )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:864:1: ')'
            {
             before(grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3()); 
            match(input,18,FOLLOW_18_in_rule__Term__Group_2__3__Impl1710); 
             after(grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__Term__Group_2__3__Impl"


    // $ANTLR start "rule__Output__LinesAssignment_0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:886:1: rule__Output__LinesAssignment_0 : ( ruleLine ) ;
    public final void rule__Output__LinesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:890:1: ( ( ruleLine ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:891:1: ( ruleLine )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:891:1: ( ruleLine )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:892:1: ruleLine
            {
             before(grammarAccess.getOutputAccess().getLinesLineParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLine_in_rule__Output__LinesAssignment_01754);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getLinesLineParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Output__LinesAssignment_0"


    // $ANTLR start "rule__Line__ItemsAssignment"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:901:1: rule__Line__ItemsAssignment : ( ruleClassicLiteral ) ;
    public final void rule__Line__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:905:1: ( ( ruleClassicLiteral ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:906:1: ( ruleClassicLiteral )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:906:1: ( ruleClassicLiteral )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:907:1: ruleClassicLiteral
            {
             before(grammarAccess.getLineAccess().getItemsClassicLiteralParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassicLiteral_in_rule__Line__ItemsAssignment1785);
            ruleClassicLiteral();

            state._fsp--;

             after(grammarAccess.getLineAccess().getItemsClassicLiteralParserRuleCall_0()); 

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
    // $ANTLR end "rule__Line__ItemsAssignment"


    // $ANTLR start "rule__ClassicLiteral__NegAssignment_0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:916:1: rule__ClassicLiteral__NegAssignment_0 : ( ( '-' ) ) ;
    public final void rule__ClassicLiteral__NegAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:920:1: ( ( ( '-' ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:921:1: ( ( '-' ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:921:1: ( ( '-' ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:922:1: ( '-' )
            {
             before(grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:923:1: ( '-' )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:924:1: '-'
            {
             before(grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            match(input,20,FOLLOW_20_in_rule__ClassicLiteral__NegAssignment_01821); 
             after(grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0()); 

            }

             after(grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0()); 

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
    // $ANTLR end "rule__ClassicLiteral__NegAssignment_0"


    // $ANTLR start "rule__ClassicLiteral__AtomAssignment_1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:939:1: rule__ClassicLiteral__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__ClassicLiteral__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:943:1: ( ( ruleAtom ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:944:1: ( ruleAtom )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:944:1: ( ruleAtom )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:945:1: ruleAtom
            {
             before(grammarAccess.getClassicLiteralAccess().getAtomAtomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAtom_in_rule__ClassicLiteral__AtomAssignment_11860);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getClassicLiteralAccess().getAtomAtomParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ClassicLiteral__AtomAssignment_1"


    // $ANTLR start "rule__Atom__NameAssignment_0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:954:1: rule__Atom__NameAssignment_0 : ( RULE_PREDICATE_NAME ) ;
    public final void rule__Atom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:958:1: ( ( RULE_PREDICATE_NAME ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:959:1: ( RULE_PREDICATE_NAME )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:959:1: ( RULE_PREDICATE_NAME )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:960:1: RULE_PREDICATE_NAME
            {
             before(grammarAccess.getAtomAccess().getNamePREDICATE_NAMETerminalRuleCall_0_0()); 
            match(input,RULE_PREDICATE_NAME,FOLLOW_RULE_PREDICATE_NAME_in_rule__Atom__NameAssignment_01891); 
             after(grammarAccess.getAtomAccess().getNamePREDICATE_NAMETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Atom__NameAssignment_0"


    // $ANTLR start "rule__Atom__TermsAssignment_1_1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:969:1: rule__Atom__TermsAssignment_1_1 : ( ruleTerms ) ;
    public final void rule__Atom__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:973:1: ( ( ruleTerms ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:974:1: ( ruleTerms )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:974:1: ( ruleTerms )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:975:1: ruleTerms
            {
             before(grammarAccess.getAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTerms_in_rule__Atom__TermsAssignment_1_11922);
            ruleTerms();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Atom__TermsAssignment_1_1"


    // $ANTLR start "rule__Terms__CarAssignment_0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:984:1: rule__Terms__CarAssignment_0 : ( ruleTerm ) ;
    public final void rule__Terms__CarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:988:1: ( ( ruleTerm ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:989:1: ( ruleTerm )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:989:1: ( ruleTerm )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:990:1: ruleTerm
            {
             before(grammarAccess.getTermsAccess().getCarTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Terms__CarAssignment_01953);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermsAccess().getCarTermParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Terms__CarAssignment_0"


    // $ANTLR start "rule__Terms__CdrAssignment_1_1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:999:1: rule__Terms__CdrAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__Terms__CdrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1003:1: ( ( ruleTerm ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1004:1: ( ruleTerm )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1004:1: ( ruleTerm )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1005:1: ruleTerm
            {
             before(grammarAccess.getTermsAccess().getCdrTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Terms__CdrAssignment_1_11984);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermsAccess().getCdrTermParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Terms__CdrAssignment_1_1"


    // $ANTLR start "rule__Term__CsAssignment_0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1014:1: rule__Term__CsAssignment_0 : ( RULE_CONSTANT_SYMBOL ) ;
    public final void rule__Term__CsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1018:1: ( ( RULE_CONSTANT_SYMBOL ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1019:1: ( RULE_CONSTANT_SYMBOL )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1019:1: ( RULE_CONSTANT_SYMBOL )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1020:1: RULE_CONSTANT_SYMBOL
            {
             before(grammarAccess.getTermAccess().getCsCONSTANT_SYMBOLTerminalRuleCall_0_0()); 
            match(input,RULE_CONSTANT_SYMBOL,FOLLOW_RULE_CONSTANT_SYMBOL_in_rule__Term__CsAssignment_02015); 
             after(grammarAccess.getTermAccess().getCsCONSTANT_SYMBOLTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Term__CsAssignment_0"


    // $ANTLR start "rule__Term__SignAssignment_1_0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1029:1: rule__Term__SignAssignment_1_0 : ( ( '-' ) ) ;
    public final void rule__Term__SignAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1033:1: ( ( ( '-' ) ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1034:1: ( ( '-' ) )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1034:1: ( ( '-' ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1035:1: ( '-' )
            {
             before(grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0()); 
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1036:1: ( '-' )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1037:1: '-'
            {
             before(grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Term__SignAssignment_1_02051); 
             after(grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0()); 

            }

             after(grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Term__SignAssignment_1_0"


    // $ANTLR start "rule__Term__NAssignment_1_1"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1052:1: rule__Term__NAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Term__NAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1056:1: ( ( RULE_NUMBER ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1057:1: ( RULE_NUMBER )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1057:1: ( RULE_NUMBER )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1058:1: RULE_NUMBER
            {
             before(grammarAccess.getTermAccess().getNNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Term__NAssignment_1_12090); 
             after(grammarAccess.getTermAccess().getNNUMBERTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Term__NAssignment_1_1"


    // $ANTLR start "rule__Term__FsAssignment_2_0"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1067:1: rule__Term__FsAssignment_2_0 : ( RULE_FUNCTIONAL_SYMBOL ) ;
    public final void rule__Term__FsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1071:1: ( ( RULE_FUNCTIONAL_SYMBOL ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1072:1: ( RULE_FUNCTIONAL_SYMBOL )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1072:1: ( RULE_FUNCTIONAL_SYMBOL )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1073:1: RULE_FUNCTIONAL_SYMBOL
            {
             before(grammarAccess.getTermAccess().getFsFUNCTIONAL_SYMBOLTerminalRuleCall_2_0_0()); 
            match(input,RULE_FUNCTIONAL_SYMBOL,FOLLOW_RULE_FUNCTIONAL_SYMBOL_in_rule__Term__FsAssignment_2_02121); 
             after(grammarAccess.getTermAccess().getFsFUNCTIONAL_SYMBOLTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Term__FsAssignment_2_0"


    // $ANTLR start "rule__Term__TermsAssignment_2_2"
    // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1082:1: rule__Term__TermsAssignment_2_2 : ( ruleTerms ) ;
    public final void rule__Term__TermsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1086:1: ( ( ruleTerms ) )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1087:1: ( ruleTerms )
            {
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1087:1: ( ruleTerms )
            // ../net.certware.argument.analysis.ui/src-gen/net/certware/argument/analysis/ui/contentassist/antlr/internal/InternalAnalysisDSL.g:1088:1: ruleTerms
            {
             before(grammarAccess.getTermAccess().getTermsTermsParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleTerms_in_rule__Term__TermsAssignment_2_22152);
            ruleTerms();

            state._fsp--;

             after(grammarAccess.getTermAccess().getTermsTermsParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Term__TermsAssignment_2_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0_in_ruleOutput94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__ItemsAssignment_in_ruleLine156 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_rule__Line__ItemsAssignment_in_ruleLine168 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_ruleClassicLiteral_in_entryRuleClassicLiteral198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassicLiteral205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicLiteral__Group__0_in_ruleClassicLiteral231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group__0_in_ruleAtom291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerms_in_entryRuleTerms318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerms325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terms__Group__0_in_ruleTerms351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SATISFIABLE_in_rule__Output__Alternatives_1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNSATISFIABLE_in_rule__Output__Alternatives_1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__CsAssignment_0_in_rule__Term__Alternatives496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__0563 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__0566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__LinesAssignment_0_in_rule__Output__Group__0__Impl595 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_rule__Output__LinesAssignment_0_in_rule__Output__Group__0__Impl607 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Alternatives_1_in_rule__Output__Group__1__Impl667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicLiteral__Group__0__Impl_in_rule__ClassicLiteral__Group__0701 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_rule__ClassicLiteral__Group__1_in_rule__ClassicLiteral__Group__0704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicLiteral__NegAssignment_0_in_rule__ClassicLiteral__Group__0__Impl731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicLiteral__Group__1__Impl_in_rule__ClassicLiteral__Group__1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicLiteral__AtomAssignment_1_in_rule__ClassicLiteral__Group__1__Impl789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group__0__Impl_in_rule__Atom__Group__0823 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Atom__Group__1_in_rule__Atom__Group__0826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__NameAssignment_0_in_rule__Atom__Group__0__Impl853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group__1__Impl_in_rule__Atom__Group__1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Group__1__Impl910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__0945 = new BitSet(new long[]{0x0000000000140380L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__0948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Atom__Group_1__0__Impl976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__11007 = new BitSet(new long[]{0x0000000000140380L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__TermsAssignment_1_1_in_rule__Atom__Group_1__1__Impl1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__21068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Atom__Group_1__2__Impl1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terms__Group__0__Impl_in_rule__Terms__Group__01133 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Terms__Group__1_in_rule__Terms__Group__01136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terms__CarAssignment_0_in_rule__Terms__Group__0__Impl1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terms__Group__1__Impl_in_rule__Terms__Group__11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terms__Group_1__0_in_rule__Terms__Group__1__Impl1220 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Terms__Group_1__0__Impl_in_rule__Terms__Group_1__01255 = new BitSet(new long[]{0x0000000000100380L});
    public static final BitSet FOLLOW_rule__Terms__Group_1__1_in_rule__Terms__Group_1__01258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Terms__Group_1__0__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terms__Group_1__1__Impl_in_rule__Terms__Group_1__11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terms__CdrAssignment_1_1_in_rule__Terms__Group_1__1__Impl1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__01378 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__01381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__SignAssignment_1_0_in_rule__Term__Group_1__0__Impl1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__11439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NAssignment_1_1_in_rule__Term__Group_1__1__Impl1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__01500 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__01503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__FsAssignment_2_0_in_rule__Term__Group_2__0__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__11560 = new BitSet(new long[]{0x0000000000100380L});
    public static final BitSet FOLLOW_rule__Term__Group_2__2_in_rule__Term__Group_2__11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Term__Group_2__1__Impl1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__2__Impl_in_rule__Term__Group_2__21622 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Term__Group_2__3_in_rule__Term__Group_2__21625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__TermsAssignment_2_2_in_rule__Term__Group_2__2__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__3__Impl_in_rule__Term__Group_2__31682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Term__Group_2__3__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_rule__Output__LinesAssignment_01754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassicLiteral_in_rule__Line__ItemsAssignment1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ClassicLiteral__NegAssignment_01821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__ClassicLiteral__AtomAssignment_11860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREDICATE_NAME_in_rule__Atom__NameAssignment_01891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerms_in_rule__Atom__TermsAssignment_1_11922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Terms__CarAssignment_01953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Terms__CdrAssignment_1_11984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTANT_SYMBOL_in_rule__Term__CsAssignment_02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Term__SignAssignment_1_02051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Term__NAssignment_1_12090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FUNCTIONAL_SYMBOL_in_rule__Term__FsAssignment_2_02121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerms_in_rule__Term__TermsAssignment_2_22152 = new BitSet(new long[]{0x0000000000000002L});

}