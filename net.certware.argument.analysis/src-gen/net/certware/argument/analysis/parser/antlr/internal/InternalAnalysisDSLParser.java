package net.certware.argument.analysis.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.argument.analysis.services.AnalysisDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnalysisDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SATISFIABLE", "RULE_UNSATISFIABLE", "RULE_PREDICATE_NAME", "RULE_CONSTANT_SYMBOL", "RULE_NUMBER", "RULE_FUNCTIONAL_SYMBOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'('", "')'", "','"
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
    public String getGrammarFileName() { return "../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g"; }



     	private AnalysisDSLGrammarAccess grammarAccess;
     	
        public InternalAnalysisDSLParser(TokenStream input, AnalysisDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Output";	
       	}
       	
       	@Override
       	protected AnalysisDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleOutput"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:67:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:68:2: (iv_ruleOutput= ruleOutput EOF )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:69:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput75);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput85); 

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:76:1: ruleOutput returns [EObject current=null] : ( ( (lv_lines_0_0= ruleLine ) )+ (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token this_SATISFIABLE_1=null;
        Token this_UNSATISFIABLE_2=null;
        EObject lv_lines_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:79:28: ( ( ( (lv_lines_0_0= ruleLine ) )+ (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE ) ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:80:1: ( ( (lv_lines_0_0= ruleLine ) )+ (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE ) )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:80:1: ( ( (lv_lines_0_0= ruleLine ) )+ (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:80:2: ( (lv_lines_0_0= ruleLine ) )+ (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:80:2: ( (lv_lines_0_0= ruleLine ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_PREDICATE_NAME||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:81:1: (lv_lines_0_0= ruleLine )
            	    {
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:81:1: (lv_lines_0_0= ruleLine )
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:82:3: lv_lines_0_0= ruleLine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutputAccess().getLinesLineParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLine_in_ruleOutput131);
            	    lv_lines_0_0=ruleLine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOutputRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"lines",
            	            		lv_lines_0_0, 
            	            		"Line");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:98:3: (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE )
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
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:98:4: this_SATISFIABLE_1= RULE_SATISFIABLE
                    {
                    this_SATISFIABLE_1=(Token)match(input,RULE_SATISFIABLE,FOLLOW_RULE_SATISFIABLE_in_ruleOutput144); 
                     
                        newLeafNode(this_SATISFIABLE_1, grammarAccess.getOutputAccess().getSATISFIABLETerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:103:6: this_UNSATISFIABLE_2= RULE_UNSATISFIABLE
                    {
                    this_UNSATISFIABLE_2=(Token)match(input,RULE_UNSATISFIABLE,FOLLOW_RULE_UNSATISFIABLE_in_ruleOutput160); 
                     
                        newLeafNode(this_UNSATISFIABLE_2, grammarAccess.getOutputAccess().getUNSATISFIABLETerminalRuleCall_1_1()); 
                        

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleLine"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:115:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:116:2: (iv_ruleLine= ruleLine EOF )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:117:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine196);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine206); 

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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:124:1: ruleLine returns [EObject current=null] : ( (lv_items_0_0= ruleClassicLiteral ) )+ ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:127:28: ( ( (lv_items_0_0= ruleClassicLiteral ) )+ )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:128:1: ( (lv_items_0_0= ruleClassicLiteral ) )+
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:128:1: ( (lv_items_0_0= ruleClassicLiteral ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }
                else if ( (LA3_0==RULE_PREDICATE_NAME) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:129:1: (lv_items_0_0= ruleClassicLiteral )
            	    {
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:129:1: (lv_items_0_0= ruleClassicLiteral )
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:130:3: lv_items_0_0= ruleClassicLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLineAccess().getItemsClassicLiteralParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassicLiteral_in_ruleLine251);
            	    lv_items_0_0=ruleClassicLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_0_0, 
            	            		"ClassicLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleClassicLiteral"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:154:1: entryRuleClassicLiteral returns [EObject current=null] : iv_ruleClassicLiteral= ruleClassicLiteral EOF ;
    public final EObject entryRuleClassicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassicLiteral = null;


        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:155:2: (iv_ruleClassicLiteral= ruleClassicLiteral EOF )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:156:2: iv_ruleClassicLiteral= ruleClassicLiteral EOF
            {
             newCompositeNode(grammarAccess.getClassicLiteralRule()); 
            pushFollow(FOLLOW_ruleClassicLiteral_in_entryRuleClassicLiteral287);
            iv_ruleClassicLiteral=ruleClassicLiteral();

            state._fsp--;

             current =iv_ruleClassicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassicLiteral297); 

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
    // $ANTLR end "entryRuleClassicLiteral"


    // $ANTLR start "ruleClassicLiteral"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:163:1: ruleClassicLiteral returns [EObject current=null] : ( ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) ) ) ;
    public final EObject ruleClassicLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        EObject lv_atom_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:166:28: ( ( ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) ) ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:167:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) ) )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:167:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:167:2: ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:167:2: ( (lv_neg_0_0= '-' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:168:1: (lv_neg_0_0= '-' )
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:168:1: (lv_neg_0_0= '-' )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:169:3: lv_neg_0_0= '-'
                    {
                    lv_neg_0_0=(Token)match(input,17,FOLLOW_17_in_ruleClassicLiteral340); 

                            newLeafNode(lv_neg_0_0, grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassicLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "neg", lv_neg_0_0, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:182:3: ( (lv_atom_1_0= ruleAtom ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:183:1: (lv_atom_1_0= ruleAtom )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:183:1: (lv_atom_1_0= ruleAtom )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:184:3: lv_atom_1_0= ruleAtom
            {
             
            	        newCompositeNode(grammarAccess.getClassicLiteralAccess().getAtomAtomParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAtom_in_ruleClassicLiteral375);
            lv_atom_1_0=ruleAtom();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassicLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"atom",
                    		lv_atom_1_0, 
                    		"Atom");
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
    // $ANTLR end "ruleClassicLiteral"


    // $ANTLR start "entryRuleAtom"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:208:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:209:2: (iv_ruleAtom= ruleAtom EOF )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:210:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom411);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom421); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:217:1: ruleAtom returns [EObject current=null] : ( ( (lv_name_0_0= RULE_PREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )? ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:220:28: ( ( ( (lv_name_0_0= RULE_PREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )? ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:221:1: ( ( (lv_name_0_0= RULE_PREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )? )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:221:1: ( ( (lv_name_0_0= RULE_PREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )? )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:221:2: ( (lv_name_0_0= RULE_PREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )?
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:221:2: ( (lv_name_0_0= RULE_PREDICATE_NAME ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:222:1: (lv_name_0_0= RULE_PREDICATE_NAME )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:222:1: (lv_name_0_0= RULE_PREDICATE_NAME )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:223:3: lv_name_0_0= RULE_PREDICATE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_PREDICATE_NAME,FOLLOW_RULE_PREDICATE_NAME_in_ruleAtom463); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAtomAccess().getNamePREDICATE_NAMETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"PREDICATE_NAME");
            	    

            }


            }

            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:239:2: (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:239:4: otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAtom481); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:243:1: ( (lv_terms_2_0= ruleTerms ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=RULE_CONSTANT_SYMBOL && LA5_0<=RULE_FUNCTIONAL_SYMBOL)||LA5_0==17) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:244:1: (lv_terms_2_0= ruleTerms )
                            {
                            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:244:1: (lv_terms_2_0= ruleTerms )
                            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:245:3: lv_terms_2_0= ruleTerms
                            {
                             
                            	        newCompositeNode(grammarAccess.getAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTerms_in_ruleAtom502);
                            lv_terms_2_0=ruleTerms();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAtomRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"terms",
                                    		lv_terms_2_0, 
                                    		"Terms");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAtom515); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                        

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleTerms"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:273:1: entryRuleTerms returns [EObject current=null] : iv_ruleTerms= ruleTerms EOF ;
    public final EObject entryRuleTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerms = null;


        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:274:2: (iv_ruleTerms= ruleTerms EOF )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:275:2: iv_ruleTerms= ruleTerms EOF
            {
             newCompositeNode(grammarAccess.getTermsRule()); 
            pushFollow(FOLLOW_ruleTerms_in_entryRuleTerms553);
            iv_ruleTerms=ruleTerms();

            state._fsp--;

             current =iv_ruleTerms; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerms563); 

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
    // $ANTLR end "entryRuleTerms"


    // $ANTLR start "ruleTerms"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:282:1: ruleTerms returns [EObject current=null] : ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:285:28: ( ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:286:1: ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:286:1: ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:286:2: ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )*
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:286:2: ( (lv_car_0_0= ruleTerm ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:287:1: (lv_car_0_0= ruleTerm )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:287:1: (lv_car_0_0= ruleTerm )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:288:3: lv_car_0_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getTermsAccess().getCarTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleTerms609);
            lv_car_0_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermsRule());
            	        }
                   		set(
                   			current, 
                   			"car",
                    		lv_car_0_0, 
                    		"Term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:304:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:304:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleTerms622); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTermsAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:308:1: ( (lv_cdr_2_0= ruleTerm ) )
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:309:1: (lv_cdr_2_0= ruleTerm )
            	    {
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:309:1: (lv_cdr_2_0= ruleTerm )
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:310:3: lv_cdr_2_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermsAccess().getCdrTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleTerms643);
            	    lv_cdr_2_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cdr",
            	            		lv_cdr_2_0, 
            	            		"Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleTerms"


    // $ANTLR start "entryRuleTerm"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:334:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:335:2: (iv_ruleTerm= ruleTerm EOF )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:336:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm681);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm691); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:343:1: ruleTerm returns [EObject current=null] : ( ( (lv_cs_0_0= RULE_CONSTANT_SYMBOL ) ) | ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) ) | ( ( (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_cs_0_0=null;
        Token lv_sign_1_0=null;
        Token lv_n_2_0=null;
        Token lv_fs_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_terms_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:346:28: ( ( ( (lv_cs_0_0= RULE_CONSTANT_SYMBOL ) ) | ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) ) | ( ( (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' ) ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:347:1: ( ( (lv_cs_0_0= RULE_CONSTANT_SYMBOL ) ) | ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) ) | ( ( (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' ) )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:347:1: ( ( (lv_cs_0_0= RULE_CONSTANT_SYMBOL ) ) | ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) ) | ( ( (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_CONSTANT_SYMBOL:
                {
                alt9=1;
                }
                break;
            case RULE_NUMBER:
            case 17:
                {
                alt9=2;
                }
                break;
            case RULE_FUNCTIONAL_SYMBOL:
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
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:347:2: ( (lv_cs_0_0= RULE_CONSTANT_SYMBOL ) )
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:347:2: ( (lv_cs_0_0= RULE_CONSTANT_SYMBOL ) )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:348:1: (lv_cs_0_0= RULE_CONSTANT_SYMBOL )
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:348:1: (lv_cs_0_0= RULE_CONSTANT_SYMBOL )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:349:3: lv_cs_0_0= RULE_CONSTANT_SYMBOL
                    {
                    lv_cs_0_0=(Token)match(input,RULE_CONSTANT_SYMBOL,FOLLOW_RULE_CONSTANT_SYMBOL_in_ruleTerm733); 

                    			newLeafNode(lv_cs_0_0, grammarAccess.getTermAccess().getCsCONSTANT_SYMBOLTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cs",
                            		lv_cs_0_0, 
                            		"CONSTANT_SYMBOL");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:366:6: ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) )
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:366:6: ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:366:7: ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) )
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:366:7: ( (lv_sign_1_0= '-' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==17) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:367:1: (lv_sign_1_0= '-' )
                            {
                            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:367:1: (lv_sign_1_0= '-' )
                            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:368:3: lv_sign_1_0= '-'
                            {
                            lv_sign_1_0=(Token)match(input,17,FOLLOW_17_in_ruleTerm763); 

                                    newLeafNode(lv_sign_1_0, grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTermRule());
                            	        }
                                   		setWithLastConsumed(current, "sign", lv_sign_1_0, "-");
                            	    

                            }


                            }
                            break;

                    }

                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:381:3: ( (lv_n_2_0= RULE_NUMBER ) )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:382:1: (lv_n_2_0= RULE_NUMBER )
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:382:1: (lv_n_2_0= RULE_NUMBER )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:383:3: lv_n_2_0= RULE_NUMBER
                    {
                    lv_n_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleTerm794); 

                    			newLeafNode(lv_n_2_0, grammarAccess.getTermAccess().getNNUMBERTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"n",
                            		lv_n_2_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:400:6: ( ( (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:400:6: ( ( (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:400:7: ( (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')'
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:400:7: ( (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL ) )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:401:1: (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL )
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:401:1: (lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:402:3: lv_fs_3_0= RULE_FUNCTIONAL_SYMBOL
                    {
                    lv_fs_3_0=(Token)match(input,RULE_FUNCTIONAL_SYMBOL,FOLLOW_RULE_FUNCTIONAL_SYMBOL_in_ruleTerm824); 

                    			newLeafNode(lv_fs_3_0, grammarAccess.getTermAccess().getFsFUNCTIONAL_SYMBOLTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fs",
                            		lv_fs_3_0, 
                            		"FUNCTIONAL_SYMBOL");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTerm841); 

                        	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:422:1: ( (lv_terms_5_0= ruleTerms ) )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:423:1: (lv_terms_5_0= ruleTerms )
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:423:1: (lv_terms_5_0= ruleTerms )
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:424:3: lv_terms_5_0= ruleTerms
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getTermsTermsParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerms_in_ruleTerm862);
                    lv_terms_5_0=ruleTerms();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"terms",
                            		lv_terms_5_0, 
                            		"Terms");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleTerm874); 

                        	newLeafNode(otherlv_6, grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3());
                        

                    }


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
    // $ANTLR end "ruleTerm"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_ruleOutput131 = new BitSet(new long[]{0x0000000000020070L});
    public static final BitSet FOLLOW_RULE_SATISFIABLE_in_ruleOutput144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNSATISFIABLE_in_ruleOutput160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassicLiteral_in_ruleLine251 = new BitSet(new long[]{0x0000000000020072L});
    public static final BitSet FOLLOW_ruleClassicLiteral_in_entryRuleClassicLiteral287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassicLiteral297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleClassicLiteral340 = new BitSet(new long[]{0x0000000000020070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleClassicLiteral375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREDICATE_NAME_in_ruleAtom463 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleAtom481 = new BitSet(new long[]{0x00000000000A0380L});
    public static final BitSet FOLLOW_ruleTerms_in_ruleAtom502 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtom515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerms_in_entryRuleTerms553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerms563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerms609 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTerms622 = new BitSet(new long[]{0x0000000000020380L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerms643 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTANT_SYMBOL_in_ruleTerm733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTerm763 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleTerm794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FUNCTIONAL_SYMBOL_in_ruleTerm824 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTerm841 = new BitSet(new long[]{0x0000000000020380L});
    public static final BitSet FOLLOW_ruleTerms_in_ruleTerm862 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTerm874 = new BitSet(new long[]{0x0000000000000002L});

}