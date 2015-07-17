package net.certware.argument.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.argument.language.services.LGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UID", "RULE_LID", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "','", "'every'", "'some'", "'const'", "'='", "'.'", "'type'", "'{'", "'}'", "'where'", "'in'", "'\\\\'", "'>'", "'<'", "'>='", "'<='", "'!='", "'or'", "'and'", "'not'", "'maybe'", "'|'", "'if'"
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
    public static final int RULE_UID=4;
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
    public static final int RULE_LID=5;
    public static final int RULE_ID=7;
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
    public String getGrammarFileName() { return "../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private LGrammarAccess grammarAccess;
     	
        public InternalLParser(TokenStream input, LGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected LGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:73:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:74:2: (iv_ruleProgram= ruleProgram EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:75:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram81);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:82:1: ruleProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:85:28: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:86:1: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:86:1: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_UID && LA1_0<=RULE_INT)||LA1_0==14||LA1_0==18||LA1_0==23||LA1_0==26||(LA1_0>=39 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:87:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:87:1: (lv_statements_0_0= ruleStatement )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:88:3: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleProgram136);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_0_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleBasicTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:112:1: entryRuleBasicTerm returns [EObject current=null] : iv_ruleBasicTerm= ruleBasicTerm EOF ;
    public final EObject entryRuleBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:113:2: (iv_ruleBasicTerm= ruleBasicTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:114:2: iv_ruleBasicTerm= ruleBasicTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTermRule()); 
            }
            pushFollow(FOLLOW_ruleBasicTerm_in_entryRuleBasicTerm172);
            iv_ruleBasicTerm=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicTerm182); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicTerm"


    // $ANTLR start "ruleBasicTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:121:1: ruleBasicTerm returns [EObject current=null] : (this_TypedVariable_0= ruleTypedVariable | this_ArithmeticTerm_1= ruleArithmeticTerm | this_FunctionalTerm_2= ruleFunctionalTerm ) ;
    public final EObject ruleBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject this_TypedVariable_0 = null;

        EObject this_ArithmeticTerm_1 = null;

        EObject this_FunctionalTerm_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:124:28: ( (this_TypedVariable_0= ruleTypedVariable | this_ArithmeticTerm_1= ruleArithmeticTerm | this_FunctionalTerm_2= ruleFunctionalTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:125:1: (this_TypedVariable_0= ruleTypedVariable | this_ArithmeticTerm_1= ruleArithmeticTerm | this_FunctionalTerm_2= ruleFunctionalTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:125:1: (this_TypedVariable_0= ruleTypedVariable | this_ArithmeticTerm_1= ruleArithmeticTerm | this_FunctionalTerm_2= ruleFunctionalTerm )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LID) ) {
                switch ( input.LA(2) ) {
                case RULE_UID:
                    {
                    int LA2_3 = input.LA(3);

                    if ( (synpred2_InternalL()) ) {
                        alt2=1;
                    }
                    else if ( (synpred3_InternalL()) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 18:
                    {
                    alt2=3;
                    }
                    break;
                case EOF:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 19:
                case 20:
                case 24:
                case 25:
                case 29:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA2_0==RULE_UID||LA2_0==RULE_INT||LA2_0==14||LA2_0==18) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:126:2: this_TypedVariable_0= ruleTypedVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicTermAccess().getTypedVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedVariable_in_ruleBasicTerm232);
                    this_TypedVariable_0=ruleTypedVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedVariable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:139:2: this_ArithmeticTerm_1= ruleArithmeticTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicTermAccess().getArithmeticTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticTerm_in_ruleBasicTerm262);
                    this_ArithmeticTerm_1=ruleArithmeticTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArithmeticTerm_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:152:2: this_FunctionalTerm_2= ruleFunctionalTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicTermAccess().getFunctionalTermParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionalTerm_in_ruleBasicTerm292);
                    this_FunctionalTerm_2=ruleFunctionalTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionalTerm_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicTerm"


    // $ANTLR start "entryRuleVariable"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:173:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:174:2: (iv_ruleVariable= ruleVariable EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:175:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable329);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable339); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:182:1: ruleVariable returns [EObject current=null] : ( (lv_identifier_0_0= RULE_UID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:185:28: ( ( (lv_identifier_0_0= RULE_UID ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:186:1: ( (lv_identifier_0_0= RULE_UID ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:186:1: ( (lv_identifier_0_0= RULE_UID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:187:1: (lv_identifier_0_0= RULE_UID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:187:1: (lv_identifier_0_0= RULE_UID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:188:3: lv_identifier_0_0= RULE_UID
            {
            lv_identifier_0_0=(Token)match(input,RULE_UID,FOLLOW_RULE_UID_in_ruleVariable380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_0_0, grammarAccess.getVariableAccess().getIdentifierUIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_0_0, 
                      		"UID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTypedVariable"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:212:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:213:2: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:214:2: iv_ruleTypedVariable= ruleTypedVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedVariableRule()); 
            }
            pushFollow(FOLLOW_ruleTypedVariable_in_entryRuleTypedVariable420);
            iv_ruleTypedVariable=ruleTypedVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedVariable430); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedVariable"


    // $ANTLR start "ruleTypedVariable"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:221:1: ruleTypedVariable returns [EObject current=null] : ( ( (lv_type_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        EObject lv_var_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:224:28: ( ( ( (lv_type_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:225:1: ( ( (lv_type_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:225:1: ( ( (lv_type_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:225:2: ( (lv_type_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:225:2: ( (lv_type_0_0= RULE_LID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:226:1: (lv_type_0_0= RULE_LID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:226:1: (lv_type_0_0= RULE_LID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:227:3: lv_type_0_0= RULE_LID
            {
            lv_type_0_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleTypedVariable472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_0_0, grammarAccess.getTypedVariableAccess().getTypeLIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypedVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"LID");
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:243:2: ( (lv_var_1_0= ruleVariable ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:244:1: (lv_var_1_0= ruleVariable )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:244:1: (lv_var_1_0= ruleVariable )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:245:3: lv_var_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedVariableAccess().getVarVariableParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleTypedVariable498);
            lv_var_1_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedVariableRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_1_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypedVariable"


    // $ANTLR start "entryRuleArithmeticTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:269:1: entryRuleArithmeticTerm returns [EObject current=null] : iv_ruleArithmeticTerm= ruleArithmeticTerm EOF ;
    public final EObject entryRuleArithmeticTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:270:2: (iv_ruleArithmeticTerm= ruleArithmeticTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:271:2: iv_ruleArithmeticTerm= ruleArithmeticTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticTermRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticTerm_in_entryRuleArithmeticTerm534);
            iv_ruleArithmeticTerm=ruleArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticTerm544); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmeticTerm"


    // $ANTLR start "ruleArithmeticTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:278:1: ruleArithmeticTerm returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleArithmeticTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:281:28: (this_Addition_0= ruleAddition )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:283:2: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticTermAccess().getAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleArithmeticTerm593);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArithmeticTerm"


    // $ANTLR start "entryRuleAddition"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:302:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:303:2: (iv_ruleAddition= ruleAddition EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:304:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition627);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition637); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:311:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Multiplication_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:314:28: ( (this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:315:1: (this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:315:1: (this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:316:2: this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition687);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:327:1: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:327:2: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:327:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:328:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:336:2: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==13) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==14) ) {
            	        alt3=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:336:4: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAddition712); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:341:7: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAddition730); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:345:2: ( (lv_rhs_4_0= ruleMultiplication ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:346:1: (lv_rhs_4_0= ruleMultiplication )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:346:1: (lv_rhs_4_0= ruleMultiplication )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:347:3: lv_rhs_4_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition752);
            	    lv_rhs_4_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rhs",
            	              		lv_rhs_4_0, 
            	              		"Multiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:371:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:372:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:373:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication790);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication800); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:380:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:383:28: ( (this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:384:1: (this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:384:1: (this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:385:2: this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimary_in_ruleMultiplication850);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Primary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:396:1: ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:396:2: () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:396:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:397:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:405:2: (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' )
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case 15:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:405:4: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMultiplication875); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:410:7: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMultiplication893); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:415:7: otherlv_4= '%'
            	            {
            	            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleMultiplication911); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_1_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:419:2: ( (lv_rhs_5_0= rulePrimary ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:420:1: (lv_rhs_5_0= rulePrimary )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:420:1: (lv_rhs_5_0= rulePrimary )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:421:3: lv_rhs_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMultiplication933);
            	    lv_rhs_5_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rhs",
            	              		lv_rhs_5_0, 
            	              		"Primary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:445:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:446:2: (iv_rulePrimary= rulePrimary EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:447:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary971);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary981); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:454:1: rulePrimary returns [EObject current=null] : ( ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleArithmeticLiteral ) ) ) | ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_minus_0_0=null;
        Token lv_minus_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_term_1_0 = null;

        EObject lv_term_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:457:28: ( ( ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleArithmeticLiteral ) ) ) | ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:458:1: ( ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleArithmeticLiteral ) ) ) | ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:458:1: ( ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleArithmeticLiteral ) ) ) | ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==18) ) {
                    alt9=2;
                }
                else if ( ((LA9_1>=RULE_UID && LA9_1<=RULE_INT)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UID:
            case RULE_LID:
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:458:2: ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleArithmeticLiteral ) ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:458:2: ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleArithmeticLiteral ) ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:458:3: ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleArithmeticLiteral ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:458:3: ( (lv_minus_0_0= '-' ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==14) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:459:1: (lv_minus_0_0= '-' )
                            {
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:459:1: (lv_minus_0_0= '-' )
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:460:3: lv_minus_0_0= '-'
                            {
                            lv_minus_0_0=(Token)match(input,14,FOLLOW_14_in_rulePrimary1025); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_minus_0_0, grammarAccess.getPrimaryAccess().getMinusHyphenMinusKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryRule());
                              	        }
                                     		setWithLastConsumed(current, "minus", lv_minus_0_0, "-");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:473:3: ( (lv_term_1_0= ruleArithmeticLiteral ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:474:1: (lv_term_1_0= ruleArithmeticLiteral )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:474:1: (lv_term_1_0= ruleArithmeticLiteral )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:475:3: lv_term_1_0= ruleArithmeticLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getTermArithmeticLiteralParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArithmeticLiteral_in_rulePrimary1060);
                    lv_term_1_0=ruleArithmeticLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_1_0, 
                              		"ArithmeticLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:492:6: ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:492:6: ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:492:7: ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')'
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:492:7: ( (lv_minus_2_0= '-' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==14) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:493:1: (lv_minus_2_0= '-' )
                            {
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:493:1: (lv_minus_2_0= '-' )
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:494:3: lv_minus_2_0= '-'
                            {
                            lv_minus_2_0=(Token)match(input,14,FOLLOW_14_in_rulePrimary1086); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_minus_2_0, grammarAccess.getPrimaryAccess().getMinusHyphenMinusKeyword_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryRule());
                              	        }
                                     		setWithLastConsumed(current, "minus", lv_minus_2_0, "-");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePrimary1112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:511:1: ( (lv_term_4_0= ruleAddition ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:512:1: (lv_term_4_0= ruleAddition )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:512:1: (lv_term_4_0= ruleAddition )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:513:3: lv_term_4_0= ruleAddition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getTermAdditionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAddition_in_rulePrimary1133);
                    lv_term_4_0=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_4_0, 
                              		"Addition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePrimary1145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleArithmeticLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:541:1: entryRuleArithmeticLiteral returns [EObject current=null] : iv_ruleArithmeticLiteral= ruleArithmeticLiteral EOF ;
    public final EObject entryRuleArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:542:2: (iv_ruleArithmeticLiteral= ruleArithmeticLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:543:2: iv_ruleArithmeticLiteral= ruleArithmeticLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticLiteral_in_entryRuleArithmeticLiteral1182);
            iv_ruleArithmeticLiteral=ruleArithmeticLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticLiteral1192); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmeticLiteral"


    // $ANTLR start "ruleArithmeticLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:550:1: ruleArithmeticLiteral returns [EObject current=null] : ( ( (lv_v_0_0= ruleVariable ) ) | ( (lv_tv_1_0= ruleTypedVariable ) ) | ( (lv_const_2_0= RULE_LID ) ) | ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_const_2_0=null;
        Token lv_value_3_0=null;
        EObject lv_v_0_0 = null;

        EObject lv_tv_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:553:28: ( ( ( (lv_v_0_0= ruleVariable ) ) | ( (lv_tv_1_0= ruleTypedVariable ) ) | ( (lv_const_2_0= RULE_LID ) ) | ( (lv_value_3_0= RULE_INT ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:554:1: ( ( (lv_v_0_0= ruleVariable ) ) | ( (lv_tv_1_0= ruleTypedVariable ) ) | ( (lv_const_2_0= RULE_LID ) ) | ( (lv_value_3_0= RULE_INT ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:554:1: ( ( (lv_v_0_0= ruleVariable ) ) | ( (lv_tv_1_0= ruleTypedVariable ) ) | ( (lv_const_2_0= RULE_LID ) ) | ( (lv_value_3_0= RULE_INT ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_UID:
                {
                alt10=1;
                }
                break;
            case RULE_LID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==EOF||(LA10_2>=13 && LA10_2<=17)||(LA10_2>=19 && LA10_2<=20)||(LA10_2>=24 && LA10_2<=25)||(LA10_2>=28 && LA10_2<=29)||(LA10_2>=32 && LA10_2<=38)||LA10_2==42) ) {
                    alt10=3;
                }
                else if ( (LA10_2==RULE_UID) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:554:2: ( (lv_v_0_0= ruleVariable ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:554:2: ( (lv_v_0_0= ruleVariable ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:555:1: (lv_v_0_0= ruleVariable )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:555:1: (lv_v_0_0= ruleVariable )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:556:3: lv_v_0_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithmeticLiteralAccess().getVVariableParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleArithmeticLiteral1238);
                    lv_v_0_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArithmeticLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"v",
                              		lv_v_0_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:573:6: ( (lv_tv_1_0= ruleTypedVariable ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:573:6: ( (lv_tv_1_0= ruleTypedVariable ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:574:1: (lv_tv_1_0= ruleTypedVariable )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:574:1: (lv_tv_1_0= ruleTypedVariable )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:575:3: lv_tv_1_0= ruleTypedVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithmeticLiteralAccess().getTvTypedVariableParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypedVariable_in_ruleArithmeticLiteral1265);
                    lv_tv_1_0=ruleTypedVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArithmeticLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"tv",
                              		lv_tv_1_0, 
                              		"TypedVariable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:592:6: ( (lv_const_2_0= RULE_LID ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:592:6: ( (lv_const_2_0= RULE_LID ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:593:1: (lv_const_2_0= RULE_LID )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:593:1: (lv_const_2_0= RULE_LID )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:594:3: lv_const_2_0= RULE_LID
                    {
                    lv_const_2_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleArithmeticLiteral1288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_const_2_0, grammarAccess.getArithmeticLiteralAccess().getConstLIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArithmeticLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"const",
                              		lv_const_2_0, 
                              		"LID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:611:6: ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:611:6: ( (lv_value_3_0= RULE_INT ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:612:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:612:1: (lv_value_3_0= RULE_INT )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:613:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArithmeticLiteral1316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getArithmeticLiteralAccess().getValueINTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArithmeticLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArithmeticLiteral"


    // $ANTLR start "entryRuleGroundArithmeticTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:637:1: entryRuleGroundArithmeticTerm returns [EObject current=null] : iv_ruleGroundArithmeticTerm= ruleGroundArithmeticTerm EOF ;
    public final EObject entryRuleGroundArithmeticTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundArithmeticTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:638:2: (iv_ruleGroundArithmeticTerm= ruleGroundArithmeticTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:639:2: iv_ruleGroundArithmeticTerm= ruleGroundArithmeticTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundArithmeticTermRule()); 
            }
            pushFollow(FOLLOW_ruleGroundArithmeticTerm_in_entryRuleGroundArithmeticTerm1357);
            iv_ruleGroundArithmeticTerm=ruleGroundArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundArithmeticTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroundArithmeticTerm1367); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroundArithmeticTerm"


    // $ANTLR start "ruleGroundArithmeticTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:646:1: ruleGroundArithmeticTerm returns [EObject current=null] : this_GroundAddition_0= ruleGroundAddition ;
    public final EObject ruleGroundArithmeticTerm() throws RecognitionException {
        EObject current = null;

        EObject this_GroundAddition_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:649:28: (this_GroundAddition_0= ruleGroundAddition )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:651:2: this_GroundAddition_0= ruleGroundAddition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGroundArithmeticTermAccess().getGroundAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGroundAddition_in_ruleGroundArithmeticTerm1416);
            this_GroundAddition_0=ruleGroundAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GroundAddition_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroundArithmeticTerm"


    // $ANTLR start "entryRuleGroundAddition"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:670:1: entryRuleGroundAddition returns [EObject current=null] : iv_ruleGroundAddition= ruleGroundAddition EOF ;
    public final EObject entryRuleGroundAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundAddition = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:671:2: (iv_ruleGroundAddition= ruleGroundAddition EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:672:2: iv_ruleGroundAddition= ruleGroundAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleGroundAddition_in_entryRuleGroundAddition1450);
            iv_ruleGroundAddition=ruleGroundAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroundAddition1460); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroundAddition"


    // $ANTLR start "ruleGroundAddition"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:679:1: ruleGroundAddition returns [EObject current=null] : (this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )* ) ;
    public final EObject ruleGroundAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_GroundMultiplication_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:682:28: ( (this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:683:1: (this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:683:1: (this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:684:2: this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGroundAdditionAccess().getGroundMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGroundMultiplication_in_ruleGroundAddition1510);
            this_GroundMultiplication_0=ruleGroundMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GroundMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:695:1: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:695:2: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:695:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:696:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGroundAdditionAccess().getGroundAdditionLhsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:704:2: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==13) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==14) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:704:4: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleGroundAddition1535); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getGroundAdditionAccess().getPlusSignKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:709:7: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGroundAddition1553); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getGroundAdditionAccess().getHyphenMinusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:713:2: ( (lv_rhs_4_0= ruleGroundMultiplication ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:714:1: (lv_rhs_4_0= ruleGroundMultiplication )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:714:1: (lv_rhs_4_0= ruleGroundMultiplication )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:715:3: lv_rhs_4_0= ruleGroundMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroundAdditionAccess().getRhsGroundMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGroundMultiplication_in_ruleGroundAddition1575);
            	    lv_rhs_4_0=ruleGroundMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroundAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rhs",
            	              		lv_rhs_4_0, 
            	              		"GroundMultiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroundAddition"


    // $ANTLR start "entryRuleGroundMultiplication"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:739:1: entryRuleGroundMultiplication returns [EObject current=null] : iv_ruleGroundMultiplication= ruleGroundMultiplication EOF ;
    public final EObject entryRuleGroundMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundMultiplication = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:740:2: (iv_ruleGroundMultiplication= ruleGroundMultiplication EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:741:2: iv_ruleGroundMultiplication= ruleGroundMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleGroundMultiplication_in_entryRuleGroundMultiplication1613);
            iv_ruleGroundMultiplication=ruleGroundMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroundMultiplication1623); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroundMultiplication"


    // $ANTLR start "ruleGroundMultiplication"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:748:1: ruleGroundMultiplication returns [EObject current=null] : (this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleGroundMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_GroundPrimary_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:751:28: ( (this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:752:1: (this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:752:1: (this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:753:2: this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGroundMultiplicationAccess().getGroundPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGroundPrimary_in_ruleGroundMultiplication1673);
            this_GroundPrimary_0=ruleGroundPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GroundPrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:764:1: ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=15 && LA14_0<=17)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:764:2: () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:764:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:765:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGroundMultiplicationAccess().getGroundMultiplicationLhsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:773:2: (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' )
            	    int alt13=3;
            	    switch ( input.LA(1) ) {
            	    case 15:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:773:4: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleGroundMultiplication1698); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getGroundMultiplicationAccess().getAsteriskKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:778:7: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleGroundMultiplication1716); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getGroundMultiplicationAccess().getSolidusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:783:7: otherlv_4= '%'
            	            {
            	            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGroundMultiplication1734); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getGroundMultiplicationAccess().getPercentSignKeyword_1_1_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:787:2: ( (lv_rhs_5_0= rulePrimary ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:788:1: (lv_rhs_5_0= rulePrimary )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:788:1: (lv_rhs_5_0= rulePrimary )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:789:3: lv_rhs_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroundMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimary_in_ruleGroundMultiplication1756);
            	    lv_rhs_5_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroundMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rhs",
            	              		lv_rhs_5_0, 
            	              		"Primary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroundMultiplication"


    // $ANTLR start "entryRuleGroundPrimary"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:813:1: entryRuleGroundPrimary returns [EObject current=null] : iv_ruleGroundPrimary= ruleGroundPrimary EOF ;
    public final EObject entryRuleGroundPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundPrimary = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:814:2: (iv_ruleGroundPrimary= ruleGroundPrimary EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:815:2: iv_ruleGroundPrimary= ruleGroundPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundPrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleGroundPrimary_in_entryRuleGroundPrimary1794);
            iv_ruleGroundPrimary=ruleGroundPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundPrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroundPrimary1804); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroundPrimary"


    // $ANTLR start "ruleGroundPrimary"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:822:1: ruleGroundPrimary returns [EObject current=null] : ( ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleGroundArithmeticLiteral ) ) ) | ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleGroundPrimary() throws RecognitionException {
        EObject current = null;

        Token lv_minus_0_0=null;
        Token lv_minus_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_term_1_0 = null;

        EObject lv_term_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:825:28: ( ( ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleGroundArithmeticLiteral ) ) ) | ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:826:1: ( ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleGroundArithmeticLiteral ) ) ) | ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:826:1: ( ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleGroundArithmeticLiteral ) ) ) | ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' ) )
            int alt17=2;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>=RULE_LID && LA17_1<=RULE_INT)) ) {
                    alt17=1;
                }
                else if ( (LA17_1==18) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LID:
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case 18:
                {
                alt17=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:826:2: ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleGroundArithmeticLiteral ) ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:826:2: ( ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleGroundArithmeticLiteral ) ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:826:3: ( (lv_minus_0_0= '-' ) )? ( (lv_term_1_0= ruleGroundArithmeticLiteral ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:826:3: ( (lv_minus_0_0= '-' ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==14) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:827:1: (lv_minus_0_0= '-' )
                            {
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:827:1: (lv_minus_0_0= '-' )
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:828:3: lv_minus_0_0= '-'
                            {
                            lv_minus_0_0=(Token)match(input,14,FOLLOW_14_in_ruleGroundPrimary1848); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_minus_0_0, grammarAccess.getGroundPrimaryAccess().getMinusHyphenMinusKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGroundPrimaryRule());
                              	        }
                                     		setWithLastConsumed(current, "minus", lv_minus_0_0, "-");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:841:3: ( (lv_term_1_0= ruleGroundArithmeticLiteral ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:842:1: (lv_term_1_0= ruleGroundArithmeticLiteral )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:842:1: (lv_term_1_0= ruleGroundArithmeticLiteral )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:843:3: lv_term_1_0= ruleGroundArithmeticLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGroundPrimaryAccess().getTermGroundArithmeticLiteralParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroundArithmeticLiteral_in_ruleGroundPrimary1883);
                    lv_term_1_0=ruleGroundArithmeticLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGroundPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_1_0, 
                              		"GroundArithmeticLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:860:6: ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:860:6: ( ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')' )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:860:7: ( (lv_minus_2_0= '-' ) )? otherlv_3= '(' ( (lv_term_4_0= ruleAddition ) ) otherlv_5= ')'
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:860:7: ( (lv_minus_2_0= '-' ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==14) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:861:1: (lv_minus_2_0= '-' )
                            {
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:861:1: (lv_minus_2_0= '-' )
                            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:862:3: lv_minus_2_0= '-'
                            {
                            lv_minus_2_0=(Token)match(input,14,FOLLOW_14_in_ruleGroundPrimary1909); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_minus_2_0, grammarAccess.getGroundPrimaryAccess().getMinusHyphenMinusKeyword_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGroundPrimaryRule());
                              	        }
                                     		setWithLastConsumed(current, "minus", lv_minus_2_0, "-");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleGroundPrimary1935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGroundPrimaryAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:879:1: ( (lv_term_4_0= ruleAddition ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:880:1: (lv_term_4_0= ruleAddition )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:880:1: (lv_term_4_0= ruleAddition )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:881:3: lv_term_4_0= ruleAddition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGroundPrimaryAccess().getTermAdditionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAddition_in_ruleGroundPrimary1956);
                    lv_term_4_0=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGroundPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_4_0, 
                              		"Addition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleGroundPrimary1968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getGroundPrimaryAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroundPrimary"


    // $ANTLR start "entryRuleGroundArithmeticLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:909:1: entryRuleGroundArithmeticLiteral returns [EObject current=null] : iv_ruleGroundArithmeticLiteral= ruleGroundArithmeticLiteral EOF ;
    public final EObject entryRuleGroundArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundArithmeticLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:910:2: (iv_ruleGroundArithmeticLiteral= ruleGroundArithmeticLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:911:2: iv_ruleGroundArithmeticLiteral= ruleGroundArithmeticLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundArithmeticLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleGroundArithmeticLiteral_in_entryRuleGroundArithmeticLiteral2005);
            iv_ruleGroundArithmeticLiteral=ruleGroundArithmeticLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundArithmeticLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroundArithmeticLiteral2015); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroundArithmeticLiteral"


    // $ANTLR start "ruleGroundArithmeticLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:918:1: ruleGroundArithmeticLiteral returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_LID ) ) | ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGroundArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:921:28: ( ( ( (lv_identifier_0_0= RULE_LID ) ) | ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:922:1: ( ( (lv_identifier_0_0= RULE_LID ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:922:1: ( ( (lv_identifier_0_0= RULE_LID ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_LID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INT) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:922:2: ( (lv_identifier_0_0= RULE_LID ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:922:2: ( (lv_identifier_0_0= RULE_LID ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:923:1: (lv_identifier_0_0= RULE_LID )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:923:1: (lv_identifier_0_0= RULE_LID )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:924:3: lv_identifier_0_0= RULE_LID
                    {
                    lv_identifier_0_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleGroundArithmeticLiteral2057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_0_0, grammarAccess.getGroundArithmeticLiteralAccess().getIdentifierLIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGroundArithmeticLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_0_0, 
                              		"LID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:941:6: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:941:6: ( (lv_value_1_0= RULE_INT ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:942:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:942:1: (lv_value_1_0= RULE_INT )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:943:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGroundArithmeticLiteral2085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getGroundArithmeticLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGroundArithmeticLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroundArithmeticLiteral"


    // $ANTLR start "entryRuleFunctionalTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:967:1: entryRuleFunctionalTerm returns [EObject current=null] : iv_ruleFunctionalTerm= ruleFunctionalTerm EOF ;
    public final EObject entryRuleFunctionalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:968:2: (iv_ruleFunctionalTerm= ruleFunctionalTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:969:2: iv_ruleFunctionalTerm= ruleFunctionalTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionalTermRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionalTerm_in_entryRuleFunctionalTerm2126);
            iv_ruleFunctionalTerm=ruleFunctionalTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionalTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionalTerm2136); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionalTerm"


    // $ANTLR start "ruleFunctionalTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:976:1: ruleFunctionalTerm returns [EObject current=null] : (this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')' ) ;
    public final EObject ruleFunctionalTerm() throws RecognitionException {
        EObject current = null;

        Token this_LID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Terms_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:979:28: ( (this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:980:1: (this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:980:1: (this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:980:2: this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')'
            {
            this_LID_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleFunctionalTerm2172); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LID_0, grammarAccess.getFunctionalTermAccess().getLIDTerminalRuleCall_0()); 
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFunctionalTerm2183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionalTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionalTermAccess().getTermsParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleTerms_in_ruleFunctionalTerm2208);
            this_Terms_2=ruleTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Terms_2; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFunctionalTerm2219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionalTermAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionalTerm"


    // $ANTLR start "entryRuleGroundFunctionalTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1012:1: entryRuleGroundFunctionalTerm returns [EObject current=null] : iv_ruleGroundFunctionalTerm= ruleGroundFunctionalTerm EOF ;
    public final EObject entryRuleGroundFunctionalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundFunctionalTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1013:2: (iv_ruleGroundFunctionalTerm= ruleGroundFunctionalTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1014:2: iv_ruleGroundFunctionalTerm= ruleGroundFunctionalTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundFunctionalTermRule()); 
            }
            pushFollow(FOLLOW_ruleGroundFunctionalTerm_in_entryRuleGroundFunctionalTerm2255);
            iv_ruleGroundFunctionalTerm=ruleGroundFunctionalTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundFunctionalTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroundFunctionalTerm2265); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroundFunctionalTerm"


    // $ANTLR start "ruleGroundFunctionalTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1021:1: ruleGroundFunctionalTerm returns [EObject current=null] : (this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')' ) ;
    public final EObject ruleGroundFunctionalTerm() throws RecognitionException {
        EObject current = null;

        Token this_LID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_GroundTerms_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1024:28: ( (this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1025:1: (this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1025:1: (this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1025:2: this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')'
            {
            this_LID_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleGroundFunctionalTerm2301); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LID_0, grammarAccess.getGroundFunctionalTermAccess().getLIDTerminalRuleCall_0()); 
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGroundFunctionalTerm2312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroundFunctionalTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGroundFunctionalTermAccess().getGroundTermsParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleGroundTerms_in_ruleGroundFunctionalTerm2337);
            this_GroundTerms_2=ruleGroundTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GroundTerms_2; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleGroundFunctionalTerm2348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGroundFunctionalTermAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroundFunctionalTerm"


    // $ANTLR start "entryRuleBasicTerms"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1057:1: entryRuleBasicTerms returns [EObject current=null] : iv_ruleBasicTerms= ruleBasicTerms EOF ;
    public final EObject entryRuleBasicTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicTerms = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1058:2: (iv_ruleBasicTerms= ruleBasicTerms EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1059:2: iv_ruleBasicTerms= ruleBasicTerms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTermsRule()); 
            }
            pushFollow(FOLLOW_ruleBasicTerms_in_entryRuleBasicTerms2384);
            iv_ruleBasicTerms=ruleBasicTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicTerms; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicTerms2394); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicTerms"


    // $ANTLR start "ruleBasicTerms"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1066:1: ruleBasicTerms returns [EObject current=null] : ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* ) ;
    public final EObject ruleBasicTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1069:28: ( ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1070:1: ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1070:1: ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1070:2: ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )*
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1070:2: ( (lv_car_0_0= ruleBasicTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1071:1: (lv_car_0_0= ruleBasicTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1071:1: (lv_car_0_0= ruleBasicTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1072:3: lv_car_0_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicTermsAccess().getCarBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicTerm_in_ruleBasicTerms2440);
            lv_car_0_0=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBasicTermsRule());
              	        }
                     		set(
                     			current, 
                     			"car",
                      		lv_car_0_0, 
                      		"BasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1088:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1088:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleBasicTerms2453); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getBasicTermsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1092:1: ( (lv_cdr_2_0= ruleBasicTerm ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1093:1: (lv_cdr_2_0= ruleBasicTerm )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1093:1: (lv_cdr_2_0= ruleBasicTerm )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1094:3: lv_cdr_2_0= ruleBasicTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBasicTermsAccess().getCdrBasicTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBasicTerm_in_ruleBasicTerms2474);
            	    lv_cdr_2_0=ruleBasicTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBasicTermsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cdr",
            	              		lv_cdr_2_0, 
            	              		"BasicTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicTerms"


    // $ANTLR start "entryRuleGroundTerms"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1118:1: entryRuleGroundTerms returns [EObject current=null] : iv_ruleGroundTerms= ruleGroundTerms EOF ;
    public final EObject entryRuleGroundTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundTerms = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1119:2: (iv_ruleGroundTerms= ruleGroundTerms EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1120:2: iv_ruleGroundTerms= ruleGroundTerms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundTermsRule()); 
            }
            pushFollow(FOLLOW_ruleGroundTerms_in_entryRuleGroundTerms2512);
            iv_ruleGroundTerms=ruleGroundTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundTerms; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroundTerms2522); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroundTerms"


    // $ANTLR start "ruleGroundTerms"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1127:1: ruleGroundTerms returns [EObject current=null] : ( ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )* ) ;
    public final EObject ruleGroundTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1130:28: ( ( ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1131:1: ( ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1131:1: ( ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1131:2: ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )*
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1131:2: ( (lv_car_0_0= ruleGroundTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1132:1: (lv_car_0_0= ruleGroundTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1132:1: (lv_car_0_0= ruleGroundTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1133:3: lv_car_0_0= ruleGroundTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroundTermsAccess().getCarGroundTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGroundTerm_in_ruleGroundTerms2568);
            lv_car_0_0=ruleGroundTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroundTermsRule());
              	        }
                     		set(
                     			current, 
                     			"car",
                      		lv_car_0_0, 
                      		"GroundTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1149:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1149:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleGroundTerms2581); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroundTermsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1153:1: ( (lv_cdr_2_0= ruleGroundTerm ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1154:1: (lv_cdr_2_0= ruleGroundTerm )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1154:1: (lv_cdr_2_0= ruleGroundTerm )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1155:3: lv_cdr_2_0= ruleGroundTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroundTermsAccess().getCdrGroundTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGroundTerm_in_ruleGroundTerms2602);
            	    lv_cdr_2_0=ruleGroundTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroundTermsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cdr",
            	              		lv_cdr_2_0, 
            	              		"GroundTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroundTerms"


    // $ANTLR start "entryRuleGroundTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1179:1: entryRuleGroundTerm returns [EObject current=null] : iv_ruleGroundTerm= ruleGroundTerm EOF ;
    public final EObject entryRuleGroundTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1180:2: (iv_ruleGroundTerm= ruleGroundTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1181:2: iv_ruleGroundTerm= ruleGroundTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundTermRule()); 
            }
            pushFollow(FOLLOW_ruleGroundTerm_in_entryRuleGroundTerm2640);
            iv_ruleGroundTerm=ruleGroundTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroundTerm2650); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroundTerm"


    // $ANTLR start "ruleGroundTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1188:1: ruleGroundTerm returns [EObject current=null] : (this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm | this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm ) ;
    public final EObject ruleGroundTerm() throws RecognitionException {
        EObject current = null;

        EObject this_GroundArithmeticTerm_0 = null;

        EObject this_GroundFunctionalTerm_1 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1191:28: ( (this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm | this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1192:1: (this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm | this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1192:1: (this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm | this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||LA21_0==14||LA21_0==18) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_LID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==18) ) {
                    alt21=2;
                }
                else if ( (LA21_2==EOF||(LA21_2>=13 && LA21_2<=17)||(LA21_2>=19 && LA21_2<=20)||LA21_2==28) ) {
                    alt21=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1193:2: this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGroundTermAccess().getGroundArithmeticTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroundArithmeticTerm_in_ruleGroundTerm2700);
                    this_GroundArithmeticTerm_0=ruleGroundArithmeticTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GroundArithmeticTerm_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1206:2: this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGroundTermAccess().getGroundFunctionalTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroundFunctionalTerm_in_ruleGroundTerm2730);
                    this_GroundFunctionalTerm_1=ruleGroundFunctionalTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GroundFunctionalTerm_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroundTerm"


    // $ANTLR start "entryRuleQuantifiedTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1225:1: entryRuleQuantifiedTerm returns [EObject current=null] : iv_ruleQuantifiedTerm= ruleQuantifiedTerm EOF ;
    public final EObject entryRuleQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1226:2: (iv_ruleQuantifiedTerm= ruleQuantifiedTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1227:2: iv_ruleQuantifiedTerm= ruleQuantifiedTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantifiedTermRule()); 
            }
            pushFollow(FOLLOW_ruleQuantifiedTerm_in_entryRuleQuantifiedTerm2765);
            iv_ruleQuantifiedTerm=ruleQuantifiedTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantifiedTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedTerm2775); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuantifiedTerm"


    // $ANTLR start "ruleQuantifiedTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1234:1: ruleQuantifiedTerm returns [EObject current=null] : ( ruleQuantifier this_LID_1= RULE_LID (this_Variable_2= ruleVariable )? ) ;
    public final EObject ruleQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        Token this_LID_1=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1237:28: ( ( ruleQuantifier this_LID_1= RULE_LID (this_Variable_2= ruleVariable )? ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1238:1: ( ruleQuantifier this_LID_1= RULE_LID (this_Variable_2= ruleVariable )? )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1238:1: ( ruleQuantifier this_LID_1= RULE_LID (this_Variable_2= ruleVariable )? )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1239:2: ruleQuantifier this_LID_1= RULE_LID (this_Variable_2= ruleVariable )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQuantifiedTermAccess().getQuantifierParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQuantifier_in_ruleQuantifiedTerm2819);
            ruleQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            this_LID_1=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleQuantifiedTerm2829); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LID_1, grammarAccess.getQuantifiedTermAccess().getLIDTerminalRuleCall_1()); 
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1253:1: (this_Variable_2= ruleVariable )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_UID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1254:2: this_Variable_2= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantifiedTermAccess().getVariableParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleQuantifiedTerm2854);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQuantifiedTerm"


    // $ANTLR start "entryRuleQuantifier"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1273:1: entryRuleQuantifier returns [String current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final String entryRuleQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuantifier = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1274:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1275:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantifierRule()); 
            }
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier2892);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier2903); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuantifier"


    // $ANTLR start "ruleQuantifier"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1282:1: ruleQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'every' | kw= 'some' ) ;
    public final AntlrDatatypeRuleToken ruleQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1285:28: ( (kw= 'every' | kw= 'some' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1286:1: (kw= 'every' | kw= 'some' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1286:1: (kw= 'every' | kw= 'some' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            else if ( (LA23_0==22) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1287:2: kw= 'every'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleQuantifier2941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuantifierAccess().getEveryKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1294:2: kw= 'some'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleQuantifier2960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuantifierAccess().getSomeKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRuleTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1307:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1308:2: (iv_ruleTerm= ruleTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1309:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm3000);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm3010); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1316:1: ruleTerm returns [EObject current=null] : (this_BasicTerm_0= ruleBasicTerm | this_QuantifiedTerm_1= ruleQuantifiedTerm ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_BasicTerm_0 = null;

        EObject this_QuantifiedTerm_1 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1319:28: ( (this_BasicTerm_0= ruleBasicTerm | this_QuantifiedTerm_1= ruleQuantifiedTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1320:1: (this_BasicTerm_0= ruleBasicTerm | this_QuantifiedTerm_1= ruleQuantifiedTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1320:1: (this_BasicTerm_0= ruleBasicTerm | this_QuantifiedTerm_1= ruleQuantifiedTerm )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_UID && LA24_0<=RULE_INT)||LA24_0==14||LA24_0==18) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=21 && LA24_0<=22)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1321:2: this_BasicTerm_0= ruleBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getBasicTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicTerm_in_ruleTerm3060);
                    this_BasicTerm_0=ruleBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicTerm_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1334:2: this_QuantifiedTerm_1= ruleQuantifiedTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getQuantifiedTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuantifiedTerm_in_ruleTerm3090);
                    this_QuantifiedTerm_1=ruleQuantifiedTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuantifiedTerm_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleTerms"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1353:1: entryRuleTerms returns [EObject current=null] : iv_ruleTerms= ruleTerms EOF ;
    public final EObject entryRuleTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerms = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1354:2: (iv_ruleTerms= ruleTerms EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1355:2: iv_ruleTerms= ruleTerms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermsRule()); 
            }
            pushFollow(FOLLOW_ruleTerms_in_entryRuleTerms3125);
            iv_ruleTerms=ruleTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerms; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerms3135); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1362:1: ruleTerms returns [EObject current=null] : ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1365:28: ( ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1366:1: ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1366:1: ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1366:2: ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )*
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1366:2: ( (lv_car_0_0= ruleTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1367:1: (lv_car_0_0= ruleTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1367:1: (lv_car_0_0= ruleTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1368:3: lv_car_0_0= ruleTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTermsAccess().getCarTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTerm_in_ruleTerms3181);
            lv_car_0_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1384:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1384:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleTerms3194); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTermsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1388:1: ( (lv_cdr_2_0= ruleTerm ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1389:1: (lv_cdr_2_0= ruleTerm )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1389:1: (lv_cdr_2_0= ruleTerm )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1390:3: lv_cdr_2_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTermsAccess().getCdrTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTerm_in_ruleTerms3215);
            	    lv_cdr_2_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerms"


    // $ANTLR start "entryRuleConstantDeclaration"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1414:1: entryRuleConstantDeclaration returns [EObject current=null] : iv_ruleConstantDeclaration= ruleConstantDeclaration EOF ;
    public final EObject entryRuleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDeclaration = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1415:2: (iv_ruleConstantDeclaration= ruleConstantDeclaration EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1416:2: iv_ruleConstantDeclaration= ruleConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration3253);
            iv_ruleConstantDeclaration=ruleConstantDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDeclaration3263); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantDeclaration"


    // $ANTLR start "ruleConstantDeclaration"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1423:1: ruleConstantDeclaration returns [EObject current=null] : (otherlv_0= 'const' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.' ) ;
    public final EObject ruleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cv_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1426:28: ( (otherlv_0= 'const' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1427:1: (otherlv_0= 'const' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1427:1: (otherlv_0= 'const' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1427:3: otherlv_0= 'const' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleConstantDeclaration3300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDeclarationAccess().getConstKeyword_0());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1431:1: ( (lv_id_1_0= RULE_LID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1432:1: (lv_id_1_0= RULE_LID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1432:1: (lv_id_1_0= RULE_LID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1433:3: lv_id_1_0= RULE_LID
            {
            lv_id_1_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleConstantDeclaration3317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getConstantDeclarationAccess().getIdLIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"LID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleConstantDeclaration3334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1453:1: ( (lv_cv_3_0= ruleGroundArithmeticTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1454:1: (lv_cv_3_0= ruleGroundArithmeticTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1454:1: (lv_cv_3_0= ruleGroundArithmeticTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1455:3: lv_cv_3_0= ruleGroundArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getCvGroundArithmeticTermParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGroundArithmeticTerm_in_ruleConstantDeclaration3355);
            lv_cv_3_0=ruleGroundArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"cv",
                      		lv_cv_3_0, 
                      		"GroundArithmeticTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleConstantDeclaration3367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantDeclarationAccess().getFullStopKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstantDeclaration"


    // $ANTLR start "entryRuleTypeDeclaration"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1483:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1484:2: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1485:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration3403);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDeclaration3413); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1492:1: ruleTypeDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.' ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1495:28: ( (otherlv_0= 'type' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1496:1: (otherlv_0= 'type' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1496:1: (otherlv_0= 'type' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1496:3: otherlv_0= 'type' ( (lv_id_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTypeDeclaration3450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1500:1: ( (lv_id_1_0= RULE_LID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1501:1: (lv_id_1_0= RULE_LID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1501:1: (lv_id_1_0= RULE_LID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1502:3: lv_id_1_0= RULE_LID
            {
            lv_id_1_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleTypeDeclaration3467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getTypeDeclarationAccess().getIdLIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"LID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTypeDeclaration3484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1522:1: ( (lv_exp_3_0= ruleSetExpression ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1523:1: (lv_exp_3_0= ruleSetExpression )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1523:1: (lv_exp_3_0= ruleSetExpression )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1524:3: lv_exp_3_0= ruleSetExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getExpSetExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSetExpression_in_ruleTypeDeclaration3505);
            lv_exp_3_0=ruleSetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_3_0, 
                      		"SetExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleTypeDeclaration3517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypeDeclarationAccess().getFullStopKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleLimit"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1552:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1553:2: (iv_ruleLimit= ruleLimit EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1554:2: iv_ruleLimit= ruleLimit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLimitRule()); 
            }
            pushFollow(FOLLOW_ruleLimit_in_entryRuleLimit3553);
            iv_ruleLimit=ruleLimit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLimit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimit3563); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1561:1: ruleLimit returns [EObject current=null] : ( (lv_cv_0_0= ruleGroundArithmeticTerm ) ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        EObject lv_cv_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1564:28: ( ( (lv_cv_0_0= ruleGroundArithmeticTerm ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1565:1: ( (lv_cv_0_0= ruleGroundArithmeticTerm ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1565:1: ( (lv_cv_0_0= ruleGroundArithmeticTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1566:1: (lv_cv_0_0= ruleGroundArithmeticTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1566:1: (lv_cv_0_0= ruleGroundArithmeticTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1567:3: lv_cv_0_0= ruleGroundArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLimitAccess().getCvGroundArithmeticTermParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGroundArithmeticTerm_in_ruleLimit3608);
            lv_cv_0_0=ruleGroundArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLimitRule());
              	        }
                     		set(
                     			current, 
                     			"cv",
                      		lv_cv_0_0, 
                      		"GroundArithmeticTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleSet"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1591:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1592:2: (iv_ruleSet= ruleSet EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1593:2: iv_ruleSet= ruleSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetRule()); 
            }
            pushFollow(FOLLOW_ruleSet_in_entryRuleSet3643);
            iv_ruleSet=ruleSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSet3653); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1600:1: ruleSet returns [EObject current=null] : ( ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) )? otherlv_2= '}' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token lv_lhs_0_0=null;
        Token otherlv_2=null;
        EObject lv_terms_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1603:28: ( ( ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) )? otherlv_2= '}' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1604:1: ( ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) )? otherlv_2= '}' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1604:1: ( ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) )? otherlv_2= '}' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1604:2: ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) )? otherlv_2= '}'
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1604:2: ( (lv_lhs_0_0= '{' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1605:1: (lv_lhs_0_0= '{' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1605:1: (lv_lhs_0_0= '{' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1606:3: lv_lhs_0_0= '{'
            {
            lv_lhs_0_0=(Token)match(input,27,FOLLOW_27_in_ruleSet3696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_lhs_0_0, grammarAccess.getSetAccess().getLhsLeftCurlyBracketKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSetRule());
              	        }
                     		setWithLastConsumed(current, "lhs", lv_lhs_0_0, "{");
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1619:2: ( (lv_terms_1_0= ruleGroundTerms ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_LID && LA26_0<=RULE_INT)||LA26_0==14||LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1620:1: (lv_terms_1_0= ruleGroundTerms )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1620:1: (lv_terms_1_0= ruleGroundTerms )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1621:3: lv_terms_1_0= ruleGroundTerms
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSetAccess().getTermsGroundTermsParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroundTerms_in_ruleSet3730);
                    lv_terms_1_0=ruleGroundTerms();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSetRule());
                      	        }
                             		set(
                             			current, 
                             			"terms",
                              		lv_terms_1_0, 
                              		"GroundTerms");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSet3743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleRange"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1649:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1650:2: (iv_ruleRange= ruleRange EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1651:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange3779);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange3789); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1658:1: ruleRange returns [EObject current=null] : (otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1661:28: ( (otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1662:1: (otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1662:1: (otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1662:3: otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleRange3826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1666:1: ( (lv_lhs_1_0= ruleLimit ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1667:1: (lv_lhs_1_0= ruleLimit )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1667:1: (lv_lhs_1_0= ruleLimit )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1668:3: lv_lhs_1_0= ruleLimit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getLhsLimitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLimit_in_ruleRange3847);
            lv_lhs_1_0=ruleLimit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_1_0, 
                      		"Limit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleRange3859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getFullStopKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleRange3871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRangeAccess().getFullStopKeyword_3());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1692:1: ( (lv_rhs_4_0= ruleLimit ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1693:1: (lv_rhs_4_0= ruleLimit )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1693:1: (lv_rhs_4_0= ruleLimit )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1694:3: lv_rhs_4_0= ruleLimit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getRhsLimitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLimit_in_ruleRange3892);
            lv_rhs_4_0=ruleLimit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_4_0, 
                      		"Limit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleRange3904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRangeAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleSetExpression"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1722:1: entryRuleSetExpression returns [EObject current=null] : iv_ruleSetExpression= ruleSetExpression EOF ;
    public final EObject entryRuleSetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExpression = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1723:2: (iv_ruleSetExpression= ruleSetExpression EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1724:2: iv_ruleSetExpression= ruleSetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSetExpression_in_entryRuleSetExpression3940);
            iv_ruleSetExpression=ruleSetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetExpression3950); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetExpression"


    // $ANTLR start "ruleSetExpression"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1731:1: ruleSetExpression returns [EObject current=null] : this_SetAddition_0= ruleSetAddition ;
    public final EObject ruleSetExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SetAddition_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1734:28: (this_SetAddition_0= ruleSetAddition )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1736:2: this_SetAddition_0= ruleSetAddition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSetExpressionAccess().getSetAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSetAddition_in_ruleSetExpression3999);
            this_SetAddition_0=ruleSetAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SetAddition_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSetExpression"


    // $ANTLR start "entryRuleSetConstruct"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1755:1: entryRuleSetConstruct returns [EObject current=null] : iv_ruleSetConstruct= ruleSetConstruct EOF ;
    public final EObject entryRuleSetConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetConstruct = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1756:2: (iv_ruleSetConstruct= ruleSetConstruct EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1757:2: iv_ruleSetConstruct= ruleSetConstruct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetConstructRule()); 
            }
            pushFollow(FOLLOW_ruleSetConstruct_in_entryRuleSetConstruct4033);
            iv_ruleSetConstruct=ruleSetConstruct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetConstruct; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetConstruct4043); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetConstruct"


    // $ANTLR start "ruleSetConstruct"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1764:1: ruleSetConstruct returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) ) ) ;
    public final EObject ruleSetConstruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1767:28: ( ( ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1768:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1768:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1768:2: ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1768:2: ( (lv_lhs_0_0= ruleBasicTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1769:1: (lv_lhs_0_0= ruleBasicTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1769:1: (lv_lhs_0_0= ruleBasicTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1770:3: lv_lhs_0_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetConstructAccess().getLhsBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicTerm_in_ruleSetConstruct4089);
            lv_lhs_0_0=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetConstructRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"BasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleSetConstruct4101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSetConstructAccess().getWhereKeyword_1());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1790:1: ( (lv_rhs_2_0= ruleTVars ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1791:1: (lv_rhs_2_0= ruleTVars )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1791:1: (lv_rhs_2_0= ruleTVars )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1792:3: lv_rhs_2_0= ruleTVars
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetConstructAccess().getRhsTVarsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTVars_in_ruleSetConstruct4122);
            lv_rhs_2_0=ruleTVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetConstructRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
                      		"TVars");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSetConstruct"


    // $ANTLR start "entryRuleTVars"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1816:1: entryRuleTVars returns [EObject current=null] : iv_ruleTVars= ruleTVars EOF ;
    public final EObject entryRuleTVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTVars = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1817:2: (iv_ruleTVars= ruleTVars EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1818:2: iv_ruleTVars= ruleTVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTVarsRule()); 
            }
            pushFollow(FOLLOW_ruleTVars_in_entryRuleTVars4158);
            iv_ruleTVars=ruleTVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTVars; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTVars4168); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTVars"


    // $ANTLR start "ruleTVars"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1825:1: ruleTVars returns [EObject current=null] : ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* ) ;
    public final EObject ruleTVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1828:28: ( ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1829:1: ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1829:1: ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1829:2: ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )*
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1829:2: ( (lv_car_0_0= ruleTVar ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1830:1: (lv_car_0_0= ruleTVar )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1830:1: (lv_car_0_0= ruleTVar )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1831:3: lv_car_0_0= ruleTVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTVarsAccess().getCarTVarParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTVar_in_ruleTVars4214);
            lv_car_0_0=ruleTVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTVarsRule());
              	        }
                     		set(
                     			current, 
                     			"car",
                      		lv_car_0_0, 
                      		"TVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1847:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==20) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1847:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleTVars4227); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTVarsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1851:1: ( (lv_cdr_2_0= ruleTVar ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1852:1: (lv_cdr_2_0= ruleTVar )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1852:1: (lv_cdr_2_0= ruleTVar )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1853:3: lv_cdr_2_0= ruleTVar
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTVarsAccess().getCdrTVarParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTVar_in_ruleTVars4248);
            	    lv_cdr_2_0=ruleTVar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTVarsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cdr",
            	              		lv_cdr_2_0, 
            	              		"TVar");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTVars"


    // $ANTLR start "entryRuleTVar"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1877:1: entryRuleTVar returns [EObject current=null] : iv_ruleTVar= ruleTVar EOF ;
    public final EObject entryRuleTVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTVar = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1878:2: (iv_ruleTVar= ruleTVar EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1879:2: iv_ruleTVar= ruleTVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTVarRule()); 
            }
            pushFollow(FOLLOW_ruleTVar_in_entryRuleTVar4286);
            iv_ruleTVar=ruleTVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTVar4296); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTVar"


    // $ANTLR start "ruleTVar"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1886:1: ruleTVar returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= RULE_LID ) ) ) ;
    public final EObject ruleTVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_var_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1889:28: ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= RULE_LID ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1890:1: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= RULE_LID ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1890:1: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= RULE_LID ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1890:2: ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= RULE_LID ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1890:2: ( (lv_var_0_0= ruleVariable ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1891:1: (lv_var_0_0= ruleVariable )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1891:1: (lv_var_0_0= ruleVariable )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1892:3: lv_var_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTVarAccess().getVarVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleTVar4342);
            lv_var_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTVarRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleTVar4354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTVarAccess().getInKeyword_1());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1912:1: ( (lv_id_2_0= RULE_LID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1913:1: (lv_id_2_0= RULE_LID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1913:1: (lv_id_2_0= RULE_LID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1914:3: lv_id_2_0= RULE_LID
            {
            lv_id_2_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleTVar4371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_2_0, grammarAccess.getTVarAccess().getIdLIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTVarRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_2_0, 
                      		"LID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTVar"


    // $ANTLR start "entryRuleSetAddition"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1938:1: entryRuleSetAddition returns [EObject current=null] : iv_ruleSetAddition= ruleSetAddition EOF ;
    public final EObject entryRuleSetAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAddition = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1939:2: (iv_ruleSetAddition= ruleSetAddition EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1940:2: iv_ruleSetAddition= ruleSetAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleSetAddition_in_entryRuleSetAddition4412);
            iv_ruleSetAddition=ruleSetAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetAddition4422); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetAddition"


    // $ANTLR start "ruleSetAddition"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1947:1: ruleSetAddition returns [EObject current=null] : (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* ) ;
    public final EObject ruleSetAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SetMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1950:28: ( (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1951:1: (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1951:1: (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1952:2: this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSetAdditionAccess().getSetMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSetMultiplication_in_ruleSetAddition4472);
            this_SetMultiplication_0=ruleSetMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SetMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1963:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==13) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1963:2: () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1963:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1964:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSetAddition4496); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSetAdditionAccess().getPlusSignKeyword_1_1());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1976:1: ( (lv_right_3_0= ruleSetMultiplication ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1977:1: (lv_right_3_0= ruleSetMultiplication )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1977:1: (lv_right_3_0= ruleSetMultiplication )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1978:3: lv_right_3_0= ruleSetMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetAdditionAccess().getRightSetMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSetMultiplication_in_ruleSetAddition4517);
            	    lv_right_3_0=ruleSetMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSetAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SetMultiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSetAddition"


    // $ANTLR start "entryRuleSetMultiplication"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2002:1: entryRuleSetMultiplication returns [EObject current=null] : iv_ruleSetMultiplication= ruleSetMultiplication EOF ;
    public final EObject entryRuleSetMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetMultiplication = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2003:2: (iv_ruleSetMultiplication= ruleSetMultiplication EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2004:2: iv_ruleSetMultiplication= ruleSetMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleSetMultiplication_in_entryRuleSetMultiplication4555);
            iv_ruleSetMultiplication=ruleSetMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetMultiplication4565); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetMultiplication"


    // $ANTLR start "ruleSetMultiplication"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2011:1: ruleSetMultiplication returns [EObject current=null] : (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* ) ;
    public final EObject ruleSetMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SetPrimary_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2014:28: ( (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2015:1: (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2015:1: (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2016:2: this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSetMultiplicationAccess().getSetPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSetPrimary_in_ruleSetMultiplication4615);
            this_SetPrimary_0=ruleSetPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SetPrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2027:1: ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15||LA30_0==31) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2027:2: () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2027:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2028:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2036:2: (otherlv_2= '*' | otherlv_3= '\\\\' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==15) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==31) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2036:4: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSetMultiplication4640); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getSetMultiplicationAccess().getAsteriskKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2041:7: otherlv_3= '\\\\'
            	            {
            	            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSetMultiplication4658); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getSetMultiplicationAccess().getReverseSolidusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2045:2: ( (lv_right_4_0= ruleSetPrimary ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2046:1: (lv_right_4_0= ruleSetPrimary )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2046:1: (lv_right_4_0= ruleSetPrimary )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2047:3: lv_right_4_0= ruleSetPrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetMultiplicationAccess().getRightSetPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSetPrimary_in_ruleSetMultiplication4680);
            	    lv_right_4_0=ruleSetPrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSetMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"SetPrimary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSetMultiplication"


    // $ANTLR start "entryRuleSetPrimary"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2071:1: entryRuleSetPrimary returns [EObject current=null] : iv_ruleSetPrimary= ruleSetPrimary EOF ;
    public final EObject entryRuleSetPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetPrimary = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2072:2: (iv_ruleSetPrimary= ruleSetPrimary EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2073:2: iv_ruleSetPrimary= ruleSetPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetPrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleSetPrimary_in_entryRuleSetPrimary4718);
            iv_ruleSetPrimary=ruleSetPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetPrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetPrimary4728); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetPrimary"


    // $ANTLR start "ruleSetPrimary"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2080:1: ruleSetPrimary returns [EObject current=null] : (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) ) ;
    public final EObject ruleSetPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SetLiteral_0 = null;

        EObject this_SetAddition_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2083:28: ( (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2084:1: (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2084:1: (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_UID && LA31_0<=RULE_INT)||LA31_0==14||LA31_0==27) ) {
                alt31=1;
            }
            else if ( (LA31_0==18) ) {
                int LA31_6 = input.LA(2);

                if ( (synpred36_InternalL()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 6, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2085:2: this_SetLiteral_0= ruleSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetPrimaryAccess().getSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleSetPrimary4778);
                    this_SetLiteral_0=ruleSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2097:6: (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2097:6: (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2097:8: otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSetPrimary4796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSetPrimaryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetPrimaryAccess().getSetAdditionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetAddition_in_ruleSetPrimary4821);
                    this_SetAddition_2=ruleSetAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetAddition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSetPrimary4832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSetPrimaryAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSetPrimary"


    // $ANTLR start "entryRuleSetLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2125:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2126:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2127:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral4869);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral4879); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2134:1: ruleSetLiteral returns [EObject current=null] : (this_Set_0= ruleSet | this_Range_1= ruleRange | this_SetConstruct_2= ruleSetConstruct | this_LID_3= RULE_LID ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token this_LID_3=null;
        EObject this_Set_0 = null;

        EObject this_Range_1 = null;

        EObject this_SetConstruct_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2137:28: ( (this_Set_0= ruleSet | this_Range_1= ruleRange | this_SetConstruct_2= ruleSetConstruct | this_LID_3= RULE_LID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2138:1: (this_Set_0= ruleSet | this_Range_1= ruleRange | this_SetConstruct_2= ruleSetConstruct | this_LID_3= RULE_LID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2138:1: (this_Set_0= ruleSet | this_Range_1= ruleRange | this_SetConstruct_2= ruleSetConstruct | this_LID_3= RULE_LID )
            int alt32=4;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2139:2: this_Set_0= ruleSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetLiteralAccess().getSetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSet_in_ruleSetLiteral4929);
                    this_Set_0=ruleSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Set_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2152:2: this_Range_1= ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetLiteralAccess().getRangeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRange_in_ruleSetLiteral4959);
                    this_Range_1=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Range_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2165:2: this_SetConstruct_2= ruleSetConstruct
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetLiteralAccess().getSetConstructParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetConstruct_in_ruleSetLiteral4989);
                    this_SetConstruct_2=ruleSetConstruct();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetConstruct_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2177:6: this_LID_3= RULE_LID
                    {
                    this_LID_3=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleSetLiteral5005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LID_3, grammarAccess.getSetLiteralAccess().getLIDTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleAtom"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2189:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2190:2: (iv_ruleAtom= ruleAtom EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2191:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom5040);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom5050); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2198:1: ruleAtom returns [EObject current=null] : (this_PredicateAtom_0= rulePredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject this_PredicateAtom_0 = null;

        EObject this_BuiltInAtom_1 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2201:28: ( (this_PredicateAtom_0= rulePredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2202:1: (this_PredicateAtom_0= rulePredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2202:1: (this_PredicateAtom_0= rulePredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_LID) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred40_InternalL()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==RULE_UID||LA33_0==RULE_INT||LA33_0==14||LA33_0==18) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2203:2: this_PredicateAtom_0= rulePredicateAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getPredicateAtomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePredicateAtom_in_ruleAtom5100);
                    this_PredicateAtom_0=rulePredicateAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PredicateAtom_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2216:2: this_BuiltInAtom_1= ruleBuiltInAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getBuiltInAtomParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltInAtom_in_ruleAtom5130);
                    this_BuiltInAtom_1=ruleBuiltInAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BuiltInAtom_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRulePredicateAtom"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2235:1: entryRulePredicateAtom returns [EObject current=null] : iv_rulePredicateAtom= rulePredicateAtom EOF ;
    public final EObject entryRulePredicateAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAtom = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2236:2: (iv_rulePredicateAtom= rulePredicateAtom EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2237:2: iv_rulePredicateAtom= rulePredicateAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateAtomRule()); 
            }
            pushFollow(FOLLOW_rulePredicateAtom_in_entryRulePredicateAtom5165);
            iv_rulePredicateAtom=rulePredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicateAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAtom5175); if (state.failed) return current;

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
    // $ANTLR end "entryRulePredicateAtom"


    // $ANTLR start "rulePredicateAtom"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2244:1: rulePredicateAtom returns [EObject current=null] : ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )? ) ;
    public final EObject rulePredicateAtom() throws RecognitionException {
        EObject current = null;

        Token lv_fid_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2247:28: ( ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )? ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2248:1: ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )? )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2248:1: ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )? )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2248:2: ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )?
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2248:2: ( (lv_fid_0_0= RULE_LID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2249:1: (lv_fid_0_0= RULE_LID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2249:1: (lv_fid_0_0= RULE_LID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2250:3: lv_fid_0_0= RULE_LID
            {
            lv_fid_0_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_rulePredicateAtom5217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fid_0_0, grammarAccess.getPredicateAtomAccess().getFidLIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPredicateAtomRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fid",
                      		lv_fid_0_0, 
                      		"LID");
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2266:2: (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2266:4: otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePredicateAtom5235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPredicateAtomAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2270:1: ( (lv_terms_2_0= ruleTerms ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2271:1: (lv_terms_2_0= ruleTerms )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2271:1: (lv_terms_2_0= ruleTerms )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2272:3: lv_terms_2_0= ruleTerms
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPredicateAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTerms_in_rulePredicateAtom5256);
                    lv_terms_2_0=ruleTerms();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPredicateAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"terms",
                              		lv_terms_2_0, 
                              		"Terms");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulePredicateAtom5268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPredicateAtomAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePredicateAtom"


    // $ANTLR start "entryRuleBasicPredicateAtom"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2300:1: entryRuleBasicPredicateAtom returns [EObject current=null] : iv_ruleBasicPredicateAtom= ruleBasicPredicateAtom EOF ;
    public final EObject entryRuleBasicPredicateAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicPredicateAtom = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2301:2: (iv_ruleBasicPredicateAtom= ruleBasicPredicateAtom EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2302:2: iv_ruleBasicPredicateAtom= ruleBasicPredicateAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicPredicateAtomRule()); 
            }
            pushFollow(FOLLOW_ruleBasicPredicateAtom_in_entryRuleBasicPredicateAtom5306);
            iv_ruleBasicPredicateAtom=ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicPredicateAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicPredicateAtom5316); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicPredicateAtom"


    // $ANTLR start "ruleBasicPredicateAtom"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2309:1: ruleBasicPredicateAtom returns [EObject current=null] : ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleBasicPredicateAtom() throws RecognitionException {
        EObject current = null;

        Token lv_fid_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2312:28: ( ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2313:1: ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2313:1: ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2313:2: ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )?
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2313:2: ( (lv_fid_0_0= RULE_LID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2314:1: (lv_fid_0_0= RULE_LID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2314:1: (lv_fid_0_0= RULE_LID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2315:3: lv_fid_0_0= RULE_LID
            {
            lv_fid_0_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleBasicPredicateAtom5358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fid_0_0, grammarAccess.getBasicPredicateAtomAccess().getFidLIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBasicPredicateAtomRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fid",
                      		lv_fid_0_0, 
                      		"LID");
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2331:2: (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2331:4: otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBasicPredicateAtom5376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBasicPredicateAtomAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2335:1: ( (lv_terms_2_0= ruleBasicTerms ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2336:1: (lv_terms_2_0= ruleBasicTerms )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2336:1: (lv_terms_2_0= ruleBasicTerms )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2337:3: lv_terms_2_0= ruleBasicTerms
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicPredicateAtomAccess().getTermsBasicTermsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBasicTerms_in_ruleBasicPredicateAtom5397);
                    lv_terms_2_0=ruleBasicTerms();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasicPredicateAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"terms",
                              		lv_terms_2_0, 
                              		"BasicTerms");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBasicPredicateAtom5409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBasicPredicateAtomAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicPredicateAtom"


    // $ANTLR start "entryRuleBuiltInAtom"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2365:1: entryRuleBuiltInAtom returns [EObject current=null] : iv_ruleBuiltInAtom= ruleBuiltInAtom EOF ;
    public final EObject entryRuleBuiltInAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInAtom = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2366:2: (iv_ruleBuiltInAtom= ruleBuiltInAtom EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2367:2: iv_ruleBuiltInAtom= ruleBuiltInAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInAtomRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInAtom_in_entryRuleBuiltInAtom5447);
            iv_ruleBuiltInAtom=ruleBuiltInAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInAtom5457); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBuiltInAtom"


    // $ANTLR start "ruleBuiltInAtom"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2374:1: ruleBuiltInAtom returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) ) ;
    public final EObject ruleBuiltInAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2377:28: ( ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2378:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2378:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2378:2: ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2378:2: ( (lv_lhs_0_0= ruleBasicTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2379:1: (lv_lhs_0_0= ruleBasicTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2379:1: (lv_lhs_0_0= ruleBasicTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2380:3: lv_lhs_0_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuiltInAtomAccess().getLhsBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicTerm_in_ruleBuiltInAtom5503);
            lv_lhs_0_0=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuiltInAtomRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"BasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2396:2: ( (lv_op_1_0= ruleAtomOp ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2397:1: (lv_op_1_0= ruleAtomOp )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2397:1: (lv_op_1_0= ruleAtomOp )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2398:3: lv_op_1_0= ruleAtomOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuiltInAtomAccess().getOpAtomOpParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAtomOp_in_ruleBuiltInAtom5524);
            lv_op_1_0=ruleAtomOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuiltInAtomRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_1_0, 
                      		"AtomOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2414:2: ( (lv_rhs_2_0= ruleBasicTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2415:1: (lv_rhs_2_0= ruleBasicTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2415:1: (lv_rhs_2_0= ruleBasicTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2416:3: lv_rhs_2_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuiltInAtomAccess().getRhsBasicTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicTerm_in_ruleBuiltInAtom5545);
            lv_rhs_2_0=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuiltInAtomRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
                      		"BasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBuiltInAtom"


    // $ANTLR start "entryRuleAtomOp"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2440:1: entryRuleAtomOp returns [String current=null] : iv_ruleAtomOp= ruleAtomOp EOF ;
    public final String entryRuleAtomOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtomOp = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2441:2: (iv_ruleAtomOp= ruleAtomOp EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2442:2: iv_ruleAtomOp= ruleAtomOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomOpRule()); 
            }
            pushFollow(FOLLOW_ruleAtomOp_in_entryRuleAtomOp5582);
            iv_ruleAtomOp=ruleAtomOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomOp5593); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomOp"


    // $ANTLR start "ruleAtomOp"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2449:1: ruleAtomOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleAtomOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2452:28: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2453:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2453:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' )
            int alt36=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt36=1;
                }
                break;
            case 33:
                {
                alt36=2;
                }
                break;
            case 34:
                {
                alt36=3;
                }
                break;
            case 35:
                {
                alt36=4;
                }
                break;
            case 24:
                {
                alt36=5;
                }
                break;
            case 36:
                {
                alt36=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2454:2: kw= '>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleAtomOp5631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2461:2: kw= '<'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleAtomOp5650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2468:2: kw= '>='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleAtomOp5669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2475:2: kw= '<='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleAtomOp5688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2482:2: kw= '='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleAtomOp5707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2489:2: kw= '!='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleAtomOp5726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getExclamationMarkEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtomOp"


    // $ANTLR start "entryRuleSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2502:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2503:2: (iv_ruleSentence= ruleSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2504:2: iv_ruleSentence= ruleSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSentenceRule()); 
            }
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence5766);
            iv_ruleSentence=ruleSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence5776); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2511:1: ruleSentence returns [EObject current=null] : this_OrSentence_0= ruleOrSentence ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        EObject this_OrSentence_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2514:28: (this_OrSentence_0= ruleOrSentence )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2516:2: this_OrSentence_0= ruleOrSentence
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSentenceAccess().getOrSentenceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrSentence_in_ruleSentence5825);
            this_OrSentence_0=ruleOrSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleOrSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2535:1: entryRuleOrSentence returns [EObject current=null] : iv_ruleOrSentence= ruleOrSentence EOF ;
    public final EObject entryRuleOrSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2536:2: (iv_ruleOrSentence= ruleOrSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2537:2: iv_ruleOrSentence= ruleOrSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrSentenceRule()); 
            }
            pushFollow(FOLLOW_ruleOrSentence_in_entryRuleOrSentence5859);
            iv_ruleOrSentence=ruleOrSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrSentence5869); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrSentence"


    // $ANTLR start "ruleOrSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2544:1: ruleOrSentence returns [EObject current=null] : (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* ) ;
    public final EObject ruleOrSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndSentence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2547:28: ( (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2548:1: (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2548:1: (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2549:2: this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrSentenceAccess().getAndSentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndSentence_in_ruleOrSentence5919);
            this_AndSentence_0=ruleAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2560:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==37) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2560:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2560:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2561:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleOrSentence5943); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrSentenceAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2573:1: ( (lv_right_3_0= ruleAndSentence ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2574:1: (lv_right_3_0= ruleAndSentence )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2574:1: (lv_right_3_0= ruleAndSentence )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2575:3: lv_right_3_0= ruleAndSentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrSentenceAccess().getRightAndSentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndSentence_in_ruleOrSentence5964);
            	    lv_right_3_0=ruleAndSentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrSentenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndSentence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrSentence"


    // $ANTLR start "entryRuleAndSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2599:1: entryRuleAndSentence returns [EObject current=null] : iv_ruleAndSentence= ruleAndSentence EOF ;
    public final EObject entryRuleAndSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2600:2: (iv_ruleAndSentence= ruleAndSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2601:2: iv_ruleAndSentence= ruleAndSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndSentenceRule()); 
            }
            pushFollow(FOLLOW_ruleAndSentence_in_entryRuleAndSentence6002);
            iv_ruleAndSentence=ruleAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndSentence6012); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndSentence"


    // $ANTLR start "ruleAndSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2608:1: ruleAndSentence returns [EObject current=null] : (this_NotSentence_0= ruleNotSentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= ruleNotSentence ) ) )* ) ;
    public final EObject ruleAndSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_NotSentence_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2611:28: ( (this_NotSentence_0= ruleNotSentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= ruleNotSentence ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2612:1: (this_NotSentence_0= ruleNotSentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= ruleNotSentence ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2612:1: (this_NotSentence_0= ruleNotSentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= ruleNotSentence ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2613:2: this_NotSentence_0= ruleNotSentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= ruleNotSentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndSentenceAccess().getNotSentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNotSentence_in_ruleAndSentence6062);
            this_NotSentence_0=ruleNotSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2624:1: ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= ruleNotSentence ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==20||LA39_0==38) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2624:2: () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= ruleNotSentence ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2624:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2625:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2633:2: (otherlv_2= 'and' | otherlv_3= ',' )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==38) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==20) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2633:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleAndSentence6087); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAndSentenceAccess().getAndKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2638:7: otherlv_3= ','
            	            {
            	            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAndSentence6105); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAndSentenceAccess().getCommaKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2642:2: ( (lv_right_4_0= ruleNotSentence ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2643:1: (lv_right_4_0= ruleNotSentence )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2643:1: (lv_right_4_0= ruleNotSentence )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2644:3: lv_right_4_0= ruleNotSentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndSentenceAccess().getRightNotSentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNotSentence_in_ruleAndSentence6127);
            	    lv_right_4_0=ruleNotSentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndSentenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"NotSentence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndSentence"


    // $ANTLR start "entryRuleNotSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2668:1: entryRuleNotSentence returns [EObject current=null] : iv_ruleNotSentence= ruleNotSentence EOF ;
    public final EObject entryRuleNotSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2669:2: (iv_ruleNotSentence= ruleNotSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2670:2: iv_ruleNotSentence= ruleNotSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotSentenceRule()); 
            }
            pushFollow(FOLLOW_ruleNotSentence_in_entryRuleNotSentence6165);
            iv_ruleNotSentence=ruleNotSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotSentence6175); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotSentence"


    // $ANTLR start "ruleNotSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2677:1: ruleNotSentence returns [EObject current=null] : (this_PrimarySentence_0= rulePrimarySentence | (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence ) ) ;
    public final EObject ruleNotSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimarySentence_0 = null;

        EObject this_PrimarySentence_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2680:28: ( (this_PrimarySentence_0= rulePrimarySentence | (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2681:1: (this_PrimarySentence_0= rulePrimarySentence | (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2681:1: (this_PrimarySentence_0= rulePrimarySentence | (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_UID && LA40_0<=RULE_INT)||LA40_0==14||LA40_0==18) ) {
                alt40=1;
            }
            else if ( (LA40_0==39) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2682:2: this_PrimarySentence_0= rulePrimarySentence
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotSentenceAccess().getPrimarySentenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimarySentence_in_ruleNotSentence6225);
                    this_PrimarySentence_0=rulePrimarySentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimarySentence_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2694:6: (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2694:6: (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2694:8: otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleNotSentence6243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotSentenceAccess().getNotKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotSentenceAccess().getPrimarySentenceParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimarySentence_in_ruleNotSentence6268);
                    this_PrimarySentence_2=rulePrimarySentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimarySentence_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotSentence"


    // $ANTLR start "entryRulePrimarySentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2718:1: entryRulePrimarySentence returns [EObject current=null] : iv_rulePrimarySentence= rulePrimarySentence EOF ;
    public final EObject entryRulePrimarySentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimarySentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2719:2: (iv_rulePrimarySentence= rulePrimarySentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2720:2: iv_rulePrimarySentence= rulePrimarySentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimarySentenceRule()); 
            }
            pushFollow(FOLLOW_rulePrimarySentence_in_entryRulePrimarySentence6304);
            iv_rulePrimarySentence=rulePrimarySentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimarySentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimarySentence6314); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimarySentence"


    // $ANTLR start "rulePrimarySentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2727:1: rulePrimarySentence returns [EObject current=null] : (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) ) ;
    public final EObject rulePrimarySentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SentenceLiteral_0 = null;

        EObject this_OrSentence_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2730:28: ( (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2731:1: (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2731:1: (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_UID && LA41_0<=RULE_INT)||LA41_0==14) ) {
                alt41=1;
            }
            else if ( (LA41_0==18) ) {
                int LA41_5 = input.LA(2);

                if ( (synpred52_InternalL()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2732:2: this_SentenceLiteral_0= ruleSentenceLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimarySentenceAccess().getSentenceLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSentenceLiteral_in_rulePrimarySentence6364);
                    this_SentenceLiteral_0=ruleSentenceLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SentenceLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2744:6: (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2744:6: (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2744:8: otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePrimarySentence6382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimarySentenceAccess().getOrSentenceParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrSentence_in_rulePrimarySentence6407);
                    this_OrSentence_2=ruleOrSentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrSentence_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulePrimarySentence6418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimarySentenceAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimarySentence"


    // $ANTLR start "entryRuleSentenceLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2772:1: entryRuleSentenceLiteral returns [EObject current=null] : iv_ruleSentenceLiteral= ruleSentenceLiteral EOF ;
    public final EObject entryRuleSentenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2773:2: (iv_ruleSentenceLiteral= ruleSentenceLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2774:2: iv_ruleSentenceLiteral= ruleSentenceLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSentenceLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleSentenceLiteral_in_entryRuleSentenceLiteral6455);
            iv_ruleSentenceLiteral=ruleSentenceLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSentenceLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceLiteral6465); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSentenceLiteral"


    // $ANTLR start "ruleSentenceLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2781:1: ruleSentenceLiteral returns [EObject current=null] : this_Atom_0= ruleAtom ;
    public final EObject ruleSentenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2784:28: (this_Atom_0= ruleAtom )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2786:2: this_Atom_0= ruleAtom
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSentenceLiteralAccess().getAtomParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAtom_in_ruleSentenceLiteral6514);
            this_Atom_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Atom_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSentenceLiteral"


    // $ANTLR start "entryRulepSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2805:1: entryRulepSentence returns [EObject current=null] : iv_rulepSentence= rulepSentence EOF ;
    public final EObject entryRulepSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2806:2: (iv_rulepSentence= rulepSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2807:2: iv_rulepSentence= rulepSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPSentenceRule()); 
            }
            pushFollow(FOLLOW_rulepSentence_in_entryRulepSentence6548);
            iv_rulepSentence=rulepSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepSentence6558); if (state.failed) return current;

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
    // $ANTLR end "entryRulepSentence"


    // $ANTLR start "rulepSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2814:1: rulepSentence returns [EObject current=null] : this_pOrSentence_0= rulepOrSentence ;
    public final EObject rulepSentence() throws RecognitionException {
        EObject current = null;

        EObject this_pOrSentence_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2817:28: (this_pOrSentence_0= rulepOrSentence )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2819:2: this_pOrSentence_0= rulepOrSentence
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPSentenceAccess().getPOrSentenceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulepOrSentence_in_rulepSentence6607);
            this_pOrSentence_0=rulepOrSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_pOrSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulepSentence"


    // $ANTLR start "entryRulepOrSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2838:1: entryRulepOrSentence returns [EObject current=null] : iv_rulepOrSentence= rulepOrSentence EOF ;
    public final EObject entryRulepOrSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepOrSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2839:2: (iv_rulepOrSentence= rulepOrSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2840:2: iv_rulepOrSentence= rulepOrSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPOrSentenceRule()); 
            }
            pushFollow(FOLLOW_rulepOrSentence_in_entryRulepOrSentence6641);
            iv_rulepOrSentence=rulepOrSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepOrSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepOrSentence6651); if (state.failed) return current;

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
    // $ANTLR end "entryRulepOrSentence"


    // $ANTLR start "rulepOrSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2847:1: rulepOrSentence returns [EObject current=null] : (this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )* ) ;
    public final EObject rulepOrSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_pAndSentence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2850:28: ( (this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2851:1: (this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2851:1: (this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2852:2: this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPOrSentenceAccess().getPAndSentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulepAndSentence_in_rulepOrSentence6701);
            this_pAndSentence_0=rulepAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_pAndSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2863:1: ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==37) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2863:2: () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2863:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2864:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_rulepOrSentence6725); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPOrSentenceAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2876:1: ( (lv_right_3_0= rulepAndSentence ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2877:1: (lv_right_3_0= rulepAndSentence )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2877:1: (lv_right_3_0= rulepAndSentence )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2878:3: lv_right_3_0= rulepAndSentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOrSentenceAccess().getRightPAndSentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulepAndSentence_in_rulepOrSentence6746);
            	    lv_right_3_0=rulepAndSentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOrSentenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"pAndSentence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulepOrSentence"


    // $ANTLR start "entryRulepAndSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2902:1: entryRulepAndSentence returns [EObject current=null] : iv_rulepAndSentence= rulepAndSentence EOF ;
    public final EObject entryRulepAndSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepAndSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2903:2: (iv_rulepAndSentence= rulepAndSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2904:2: iv_rulepAndSentence= rulepAndSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPAndSentenceRule()); 
            }
            pushFollow(FOLLOW_rulepAndSentence_in_entryRulepAndSentence6784);
            iv_rulepAndSentence=rulepAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepAndSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepAndSentence6794); if (state.failed) return current;

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
    // $ANTLR end "entryRulepAndSentence"


    // $ANTLR start "rulepAndSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2911:1: rulepAndSentence returns [EObject current=null] : (this_pNotSentence_0= rulepNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepNotSentence ) ) )* ) ;
    public final EObject rulepAndSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_pNotSentence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2914:28: ( (this_pNotSentence_0= rulepNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepNotSentence ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2915:1: (this_pNotSentence_0= rulepNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepNotSentence ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2915:1: (this_pNotSentence_0= rulepNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepNotSentence ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2916:2: this_pNotSentence_0= rulepNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepNotSentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPAndSentenceAccess().getPNotSentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulepNotSentence_in_rulepAndSentence6844);
            this_pNotSentence_0=rulepNotSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_pNotSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2927:1: ( () otherlv_2= 'and' ( (lv_right_3_0= rulepNotSentence ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==38) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2927:2: () otherlv_2= 'and' ( (lv_right_3_0= rulepNotSentence ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2927:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2928:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_rulepAndSentence6868); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPAndSentenceAccess().getAndKeyword_1_1());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2940:1: ( (lv_right_3_0= rulepNotSentence ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2941:1: (lv_right_3_0= rulepNotSentence )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2941:1: (lv_right_3_0= rulepNotSentence )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2942:3: lv_right_3_0= rulepNotSentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPAndSentenceAccess().getRightPNotSentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulepNotSentence_in_rulepAndSentence6889);
            	    lv_right_3_0=rulepNotSentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPAndSentenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"pNotSentence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulepAndSentence"


    // $ANTLR start "entryRulepNotSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2966:1: entryRulepNotSentence returns [EObject current=null] : iv_rulepNotSentence= rulepNotSentence EOF ;
    public final EObject entryRulepNotSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepNotSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2967:2: (iv_rulepNotSentence= rulepNotSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2968:2: iv_rulepNotSentence= rulepNotSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPNotSentenceRule()); 
            }
            pushFollow(FOLLOW_rulepNotSentence_in_entryRulepNotSentence6927);
            iv_rulepNotSentence=rulepNotSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepNotSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepNotSentence6937); if (state.failed) return current;

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
    // $ANTLR end "entryRulepNotSentence"


    // $ANTLR start "rulepNotSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2975:1: rulepNotSentence returns [EObject current=null] : (this_pPrimarySentence_0= rulepPrimarySentence | (otherlv_1= 'not' this_pPrimarySentence_2= rulepPrimarySentence ) ) ;
    public final EObject rulepNotSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_pPrimarySentence_0 = null;

        EObject this_pPrimarySentence_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2978:28: ( (this_pPrimarySentence_0= rulepPrimarySentence | (otherlv_1= 'not' this_pPrimarySentence_2= rulepPrimarySentence ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2979:1: (this_pPrimarySentence_0= rulepPrimarySentence | (otherlv_1= 'not' this_pPrimarySentence_2= rulepPrimarySentence ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2979:1: (this_pPrimarySentence_0= rulepPrimarySentence | (otherlv_1= 'not' this_pPrimarySentence_2= rulepPrimarySentence ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_LID||LA44_0==18) ) {
                alt44=1;
            }
            else if ( (LA44_0==39) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2980:2: this_pPrimarySentence_0= rulepPrimarySentence
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPNotSentenceAccess().getPPrimarySentenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulepPrimarySentence_in_rulepNotSentence6987);
                    this_pPrimarySentence_0=rulepPrimarySentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_pPrimarySentence_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2992:6: (otherlv_1= 'not' this_pPrimarySentence_2= rulepPrimarySentence )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2992:6: (otherlv_1= 'not' this_pPrimarySentence_2= rulepPrimarySentence )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2992:8: otherlv_1= 'not' this_pPrimarySentence_2= rulepPrimarySentence
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulepNotSentence7005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPNotSentenceAccess().getNotKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPNotSentenceAccess().getPPrimarySentenceParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulepPrimarySentence_in_rulepNotSentence7030);
                    this_pPrimarySentence_2=rulepPrimarySentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_pPrimarySentence_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulepNotSentence"


    // $ANTLR start "entryRulepPrimarySentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3016:1: entryRulepPrimarySentence returns [EObject current=null] : iv_rulepPrimarySentence= rulepPrimarySentence EOF ;
    public final EObject entryRulepPrimarySentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepPrimarySentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3017:2: (iv_rulepPrimarySentence= rulepPrimarySentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3018:2: iv_rulepPrimarySentence= rulepPrimarySentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPPrimarySentenceRule()); 
            }
            pushFollow(FOLLOW_rulepPrimarySentence_in_entryRulepPrimarySentence7066);
            iv_rulepPrimarySentence=rulepPrimarySentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepPrimarySentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepPrimarySentence7076); if (state.failed) return current;

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
    // $ANTLR end "entryRulepPrimarySentence"


    // $ANTLR start "rulepPrimarySentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3025:1: rulepPrimarySentence returns [EObject current=null] : (this_pSentenceLiteral_0= rulepSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) ) ;
    public final EObject rulepPrimarySentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_pSentenceLiteral_0 = null;

        EObject this_OrSentence_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3028:28: ( (this_pSentenceLiteral_0= rulepSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3029:1: (this_pSentenceLiteral_0= rulepSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3029:1: (this_pSentenceLiteral_0= rulepSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_LID) ) {
                alt45=1;
            }
            else if ( (LA45_0==18) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3030:2: this_pSentenceLiteral_0= rulepSentenceLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPPrimarySentenceAccess().getPSentenceLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulepSentenceLiteral_in_rulepPrimarySentence7126);
                    this_pSentenceLiteral_0=rulepSentenceLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_pSentenceLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3042:6: (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3042:6: (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3042:8: otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulepPrimarySentence7144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPPrimarySentenceAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPPrimarySentenceAccess().getOrSentenceParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrSentence_in_rulepPrimarySentence7169);
                    this_OrSentence_2=ruleOrSentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrSentence_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulepPrimarySentence7180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPPrimarySentenceAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulepPrimarySentence"


    // $ANTLR start "entryRulepSentenceLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3070:1: entryRulepSentenceLiteral returns [EObject current=null] : iv_rulepSentenceLiteral= rulepSentenceLiteral EOF ;
    public final EObject entryRulepSentenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepSentenceLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3071:2: (iv_rulepSentenceLiteral= rulepSentenceLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3072:2: iv_rulepSentenceLiteral= rulepSentenceLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPSentenceLiteralRule()); 
            }
            pushFollow(FOLLOW_rulepSentenceLiteral_in_entryRulepSentenceLiteral7217);
            iv_rulepSentenceLiteral=rulepSentenceLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepSentenceLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepSentenceLiteral7227); if (state.failed) return current;

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
    // $ANTLR end "entryRulepSentenceLiteral"


    // $ANTLR start "rulepSentenceLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3079:1: rulepSentenceLiteral returns [EObject current=null] : this_PredicateAtom_0= rulePredicateAtom ;
    public final EObject rulepSentenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_PredicateAtom_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3082:28: (this_PredicateAtom_0= rulePredicateAtom )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3084:2: this_PredicateAtom_0= rulePredicateAtom
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPSentenceLiteralAccess().getPredicateAtomParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePredicateAtom_in_rulepSentenceLiteral7276);
            this_PredicateAtom_0=rulePredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PredicateAtom_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulepSentenceLiteral"


    // $ANTLR start "entryRuleMaybeLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3103:1: entryRuleMaybeLiteral returns [EObject current=null] : iv_ruleMaybeLiteral= ruleMaybeLiteral EOF ;
    public final EObject entryRuleMaybeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaybeLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3104:2: (iv_ruleMaybeLiteral= ruleMaybeLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3105:2: iv_ruleMaybeLiteral= ruleMaybeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaybeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleMaybeLiteral_in_entryRuleMaybeLiteral7310);
            iv_ruleMaybeLiteral=ruleMaybeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaybeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaybeLiteral7320); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMaybeLiteral"


    // $ANTLR start "ruleMaybeLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3112:1: ruleMaybeLiteral returns [EObject current=null] : (otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom ) ;
    public final EObject ruleMaybeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_BasicPredicateAtom_1 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3115:28: ( (otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3116:1: (otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3116:1: (otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3116:3: otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleMaybeLiteral7357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaybeLiteralAccess().getMaybeKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMaybeLiteralAccess().getBasicPredicateAtomParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicPredicateAtom_in_ruleMaybeLiteral7382);
            this_BasicPredicateAtom_1=ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicPredicateAtom_1; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMaybeLiteral"


    // $ANTLR start "entryRuleCardinalityConstraint"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3140:1: entryRuleCardinalityConstraint returns [EObject current=null] : iv_ruleCardinalityConstraint= ruleCardinalityConstraint EOF ;
    public final EObject entryRuleCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalityConstraint = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3141:2: (iv_ruleCardinalityConstraint= ruleCardinalityConstraint EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3142:2: iv_ruleCardinalityConstraint= ruleCardinalityConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCardinalityConstraint_in_entryRuleCardinalityConstraint7417);
            iv_ruleCardinalityConstraint=ruleCardinalityConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinalityConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinalityConstraint7427); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCardinalityConstraint"


    // $ANTLR start "ruleCardinalityConstraint"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3149:1: ruleCardinalityConstraint returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) ) ) ;
    public final EObject ruleCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_atom_4_0 = null;

        EObject lv_rhs_8_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3152:28: ( ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3153:1: ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3153:1: ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3153:2: ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3153:2: ( (lv_lhs_0_0= ruleBound ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3154:1: (lv_lhs_0_0= ruleBound )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3154:1: (lv_lhs_0_0= ruleBound )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3155:3: lv_lhs_0_0= ruleBound
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityConstraintAccess().getLhsBoundParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBound_in_ruleCardinalityConstraint7473);
            lv_lhs_0_0=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Bound");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleCardinalityConstraint7485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleCardinalityConstraint7497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleCardinalityConstraint7509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCardinalityConstraintAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3183:1: ( (lv_atom_4_0= ruleBasicPredicateAtom ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3184:1: (lv_atom_4_0= ruleBasicPredicateAtom )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3184:1: (lv_atom_4_0= ruleBasicPredicateAtom )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3185:3: lv_atom_4_0= ruleBasicPredicateAtom
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityConstraintAccess().getAtomBasicPredicateAtomParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicPredicateAtom_in_ruleCardinalityConstraint7530);
            lv_atom_4_0=ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"atom",
                      		lv_atom_4_0, 
                      		"BasicPredicateAtom");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleCardinalityConstraint7542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCardinalityConstraintAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleCardinalityConstraint7554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleCardinalityConstraint7566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_7());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3213:1: ( (lv_rhs_8_0= ruleBound ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3214:1: (lv_rhs_8_0= ruleBound )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3214:1: (lv_rhs_8_0= ruleBound )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3215:3: lv_rhs_8_0= ruleBound
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityConstraintAccess().getRhsBoundParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBound_in_ruleCardinalityConstraint7587);
            lv_rhs_8_0=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_8_0, 
                      		"Bound");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCardinalityConstraint"


    // $ANTLR start "entryRuleBound"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3239:1: entryRuleBound returns [EObject current=null] : iv_ruleBound= ruleBound EOF ;
    public final EObject entryRuleBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3240:2: (iv_ruleBound= ruleBound EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3241:2: iv_ruleBound= ruleBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundRule()); 
            }
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound7623);
            iv_ruleBound=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound7633); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3248:1: ruleBound returns [EObject current=null] : ( (lv_av_0_0= ruleArithmeticTerm ) ) ;
    public final EObject ruleBound() throws RecognitionException {
        EObject current = null;

        EObject lv_av_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3251:28: ( ( (lv_av_0_0= ruleArithmeticTerm ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3252:1: ( (lv_av_0_0= ruleArithmeticTerm ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3252:1: ( (lv_av_0_0= ruleArithmeticTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3253:1: (lv_av_0_0= ruleArithmeticTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3253:1: (lv_av_0_0= ruleArithmeticTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3254:3: lv_av_0_0= ruleArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBoundAccess().getAvArithmeticTermParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithmeticTerm_in_ruleBound7678);
            lv_av_0_0=ruleArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBoundRule());
              	        }
                     		set(
                     			current, 
                     			"av",
                      		lv_av_0_0, 
                      		"ArithmeticTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleRule"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3278:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3279:2: (iv_ruleRule= ruleRule EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3280:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule7713);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule7723); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3287:1: ruleRule returns [EObject current=null] : ( ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_condition_1_0=null;
        Token otherlv_3=null;
        EObject lv_head_0_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3290:28: ( ( ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3291:1: ( ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3291:1: ( ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3291:2: ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.'
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3291:2: ( (lv_head_0_0= ruleHead ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3292:1: (lv_head_0_0= ruleHead )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3292:1: (lv_head_0_0= ruleHead )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3293:3: lv_head_0_0= ruleHead
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getHeadHeadParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHead_in_ruleRule7769);
            lv_head_0_0=ruleHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleRule());
              	        }
                     		set(
                     			current, 
                     			"head",
                      		lv_head_0_0, 
                      		"Head");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3309:2: ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3309:3: ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3309:3: ( (lv_condition_1_0= 'if' ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3310:1: (lv_condition_1_0= 'if' )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3310:1: (lv_condition_1_0= 'if' )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3311:3: lv_condition_1_0= 'if'
                    {
                    lv_condition_1_0=(Token)match(input,42,FOLLOW_42_in_ruleRule7788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_condition_1_0, grammarAccess.getRuleAccess().getConditionIfKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRuleRule());
                      	        }
                             		setWithLastConsumed(current, "condition", lv_condition_1_0, "if");
                      	    
                    }

                    }


                    }

                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3324:2: ( (lv_body_2_0= ruleSentence ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3325:1: (lv_body_2_0= ruleSentence )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3325:1: (lv_body_2_0= ruleSentence )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3326:3: lv_body_2_0= ruleSentence
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleAccess().getBodySentenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSentence_in_ruleRule7822);
                    lv_body_2_0=ruleSentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_2_0, 
                              		"Sentence");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleRule7836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getFullStopKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleHead"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3354:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3355:2: (iv_ruleHead= ruleHead EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3356:2: iv_ruleHead= ruleHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeadRule()); 
            }
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead7872);
            iv_ruleHead=ruleHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHead; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead7882); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3363:1: ruleHead returns [EObject current=null] : (this_pSentence_0= rulepSentence | this_MaybeLiteral_1= ruleMaybeLiteral | this_CardinalityConstraint_2= ruleCardinalityConstraint ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        EObject this_pSentence_0 = null;

        EObject this_MaybeLiteral_1 = null;

        EObject this_CardinalityConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3366:28: ( (this_pSentence_0= rulepSentence | this_MaybeLiteral_1= ruleMaybeLiteral | this_CardinalityConstraint_2= ruleCardinalityConstraint ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3367:1: (this_pSentence_0= rulepSentence | this_MaybeLiteral_1= ruleMaybeLiteral | this_CardinalityConstraint_2= ruleCardinalityConstraint )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3367:1: (this_pSentence_0= rulepSentence | this_MaybeLiteral_1= ruleMaybeLiteral | this_CardinalityConstraint_2= ruleCardinalityConstraint )
            int alt47=3;
            switch ( input.LA(1) ) {
            case RULE_LID:
                {
                int LA47_1 = input.LA(2);

                if ( (synpred58_InternalL()) ) {
                    alt47=1;
                }
                else if ( (true) ) {
                    alt47=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA47_2 = input.LA(2);

                if ( (synpred58_InternalL()) ) {
                    alt47=1;
                }
                else if ( (true) ) {
                    alt47=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt47=1;
                }
                break;
            case 40:
                {
                alt47=2;
                }
                break;
            case RULE_UID:
            case RULE_INT:
            case 14:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3368:2: this_pSentence_0= rulepSentence
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHeadAccess().getPSentenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulepSentence_in_ruleHead7932);
                    this_pSentence_0=rulepSentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_pSentence_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3381:2: this_MaybeLiteral_1= ruleMaybeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHeadAccess().getMaybeLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaybeLiteral_in_ruleHead7962);
                    this_MaybeLiteral_1=ruleMaybeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MaybeLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3394:2: this_CardinalityConstraint_2= ruleCardinalityConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHeadAccess().getCardinalityConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCardinalityConstraint_in_ruleHead7992);
                    this_CardinalityConstraint_2=ruleCardinalityConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CardinalityConstraint_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleStatement"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3413:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3414:2: (iv_ruleStatement= ruleStatement EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3415:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement8027);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement8037); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3422:1: ruleStatement returns [EObject current=null] : (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Rule_0 = null;

        EObject this_TypeDeclaration_1 = null;

        EObject this_ConstantDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3425:28: ( (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3426:1: (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3426:1: (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration )
            int alt48=3;
            switch ( input.LA(1) ) {
            case RULE_UID:
            case RULE_LID:
            case RULE_INT:
            case 14:
            case 18:
            case 39:
            case 40:
                {
                alt48=1;
                }
                break;
            case 26:
                {
                alt48=2;
                }
                break;
            case 23:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3427:2: this_Rule_0= ruleRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getRuleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRule_in_ruleStatement8087);
                    this_Rule_0=ruleRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Rule_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3440:2: this_TypeDeclaration_1= ruleTypeDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTypeDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDeclaration_in_ruleStatement8117);
                    this_TypeDeclaration_1=ruleTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3453:2: this_ConstantDeclaration_2= ruleConstantDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getConstantDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantDeclaration_in_ruleStatement8147);
                    this_ConstantDeclaration_2=ruleConstantDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"

    // $ANTLR start synpred2_InternalL
    public final void synpred2_InternalL_fragment() throws RecognitionException {   
        EObject this_TypedVariable_0 = null;


        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:126:2: (this_TypedVariable_0= ruleTypedVariable )
        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:126:2: this_TypedVariable_0= ruleTypedVariable
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleTypedVariable_in_synpred2_InternalL232);
        this_TypedVariable_0=ruleTypedVariable();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalL

    // $ANTLR start synpred3_InternalL
    public final void synpred3_InternalL_fragment() throws RecognitionException {   
        EObject this_ArithmeticTerm_1 = null;


        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:139:2: (this_ArithmeticTerm_1= ruleArithmeticTerm )
        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:139:2: this_ArithmeticTerm_1= ruleArithmeticTerm
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleArithmeticTerm_in_synpred3_InternalL262);
        this_ArithmeticTerm_1=ruleArithmeticTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalL

    // $ANTLR start synpred36_InternalL
    public final void synpred36_InternalL_fragment() throws RecognitionException {   
        EObject this_SetLiteral_0 = null;


        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2085:2: (this_SetLiteral_0= ruleSetLiteral )
        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2085:2: this_SetLiteral_0= ruleSetLiteral
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSetLiteral_in_synpred36_InternalL4778);
        this_SetLiteral_0=ruleSetLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalL

    // $ANTLR start synpred37_InternalL
    public final void synpred37_InternalL_fragment() throws RecognitionException {   
        EObject this_Set_0 = null;


        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2139:2: (this_Set_0= ruleSet )
        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2139:2: this_Set_0= ruleSet
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSet_in_synpred37_InternalL4929);
        this_Set_0=ruleSet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalL

    // $ANTLR start synpred38_InternalL
    public final void synpred38_InternalL_fragment() throws RecognitionException {   
        EObject this_Range_1 = null;


        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2152:2: (this_Range_1= ruleRange )
        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2152:2: this_Range_1= ruleRange
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleRange_in_synpred38_InternalL4959);
        this_Range_1=ruleRange();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalL

    // $ANTLR start synpred39_InternalL
    public final void synpred39_InternalL_fragment() throws RecognitionException {   
        EObject this_SetConstruct_2 = null;


        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2165:2: (this_SetConstruct_2= ruleSetConstruct )
        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2165:2: this_SetConstruct_2= ruleSetConstruct
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSetConstruct_in_synpred39_InternalL4989);
        this_SetConstruct_2=ruleSetConstruct();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalL

    // $ANTLR start synpred40_InternalL
    public final void synpred40_InternalL_fragment() throws RecognitionException {   
        EObject this_PredicateAtom_0 = null;


        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2203:2: (this_PredicateAtom_0= rulePredicateAtom )
        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2203:2: this_PredicateAtom_0= rulePredicateAtom
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePredicateAtom_in_synpred40_InternalL5100);
        this_PredicateAtom_0=rulePredicateAtom();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalL

    // $ANTLR start synpred52_InternalL
    public final void synpred52_InternalL_fragment() throws RecognitionException {   
        EObject this_SentenceLiteral_0 = null;


        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2732:2: (this_SentenceLiteral_0= ruleSentenceLiteral )
        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2732:2: this_SentenceLiteral_0= ruleSentenceLiteral
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSentenceLiteral_in_synpred52_InternalL6364);
        this_SentenceLiteral_0=ruleSentenceLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalL

    // $ANTLR start synpred58_InternalL
    public final void synpred58_InternalL_fragment() throws RecognitionException {   
        EObject this_pSentence_0 = null;


        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3368:2: (this_pSentence_0= rulepSentence )
        // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:3368:2: this_pSentence_0= rulepSentence
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulepSentence_in_synpred58_InternalL7932);
        this_pSentence_0=rulepSentence();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalL

    // Delegated rules

    public final boolean synpred36_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA32_eotS =
        "\12\uffff";
    static final String DFA32_eofS =
        "\12\uffff";
    static final String DFA32_minS =
        "\1\4\2\0\7\uffff";
    static final String DFA32_maxS =
        "\1\33\2\0\7\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\1\3\3\uffff\1\1\1\2\1\4";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\1\7\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\3\1\2\1\3\7\uffff\1\3\3\uffff\1\3\10\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2138:1: (this_Set_0= ruleSet | this_Range_1= ruleRange | this_SetConstruct_2= ruleSetConstruct | this_LID_3= RULE_LID )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalL()) ) {s = 7;}

                        else if ( (synpred38_InternalL()) ) {s = 8;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalL()) ) {s = 3;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProgram136 = new BitSet(new long[]{0x0000018004844072L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_entryRuleBasicTerm172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicTerm182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedVariable_in_ruleBasicTerm232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_ruleBasicTerm262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalTerm_in_ruleBasicTerm292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UID_in_ruleVariable380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedVariable_in_entryRuleTypedVariable420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedVariable430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleTypedVariable472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTypedVariable498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_entryRuleArithmeticTerm534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticTerm544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleArithmeticTerm593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition687 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_ruleAddition712 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_14_in_ruleAddition730 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition752 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultiplication850 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_15_in_ruleMultiplication875 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_16_in_ruleMultiplication893 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_17_in_ruleMultiplication911 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultiplication933 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimary1025 = new BitSet(new long[]{0x0000000000004070L});
    public static final BitSet FOLLOW_ruleArithmeticLiteral_in_rulePrimary1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimary1086 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePrimary1112 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleAddition_in_rulePrimary1133 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrimary1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticLiteral_in_entryRuleArithmeticLiteral1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticLiteral1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleArithmeticLiteral1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedVariable_in_ruleArithmeticLiteral1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleArithmeticLiteral1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArithmeticLiteral1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundArithmeticTerm_in_entryRuleGroundArithmeticTerm1357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroundArithmeticTerm1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundAddition_in_ruleGroundArithmeticTerm1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundAddition_in_entryRuleGroundAddition1450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroundAddition1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundMultiplication_in_ruleGroundAddition1510 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_ruleGroundAddition1535 = new BitSet(new long[]{0x0000000000044060L});
    public static final BitSet FOLLOW_14_in_ruleGroundAddition1553 = new BitSet(new long[]{0x0000000000044060L});
    public static final BitSet FOLLOW_ruleGroundMultiplication_in_ruleGroundAddition1575 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleGroundMultiplication_in_entryRuleGroundMultiplication1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroundMultiplication1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundPrimary_in_ruleGroundMultiplication1673 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_15_in_ruleGroundMultiplication1698 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_16_in_ruleGroundMultiplication1716 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_17_in_ruleGroundMultiplication1734 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleGroundMultiplication1756 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_ruleGroundPrimary_in_entryRuleGroundPrimary1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroundPrimary1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGroundPrimary1848 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_ruleGroundArithmeticLiteral_in_ruleGroundPrimary1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGroundPrimary1909 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGroundPrimary1935 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleGroundPrimary1956 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGroundPrimary1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundArithmeticLiteral_in_entryRuleGroundArithmeticLiteral2005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroundArithmeticLiteral2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleGroundArithmeticLiteral2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGroundArithmeticLiteral2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalTerm_in_entryRuleFunctionalTerm2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionalTerm2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleFunctionalTerm2172 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionalTerm2183 = new BitSet(new long[]{0x0000018000644070L});
    public static final BitSet FOLLOW_ruleTerms_in_ruleFunctionalTerm2208 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionalTerm2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundFunctionalTerm_in_entryRuleGroundFunctionalTerm2255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroundFunctionalTerm2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleGroundFunctionalTerm2301 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGroundFunctionalTerm2312 = new BitSet(new long[]{0x0000000000044060L});
    public static final BitSet FOLLOW_ruleGroundTerms_in_ruleGroundFunctionalTerm2337 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGroundFunctionalTerm2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_entryRuleBasicTerms2384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicTerms2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleBasicTerms2440 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleBasicTerms2453 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleBasicTerms2474 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleGroundTerms_in_entryRuleGroundTerms2512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroundTerms2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundTerm_in_ruleGroundTerms2568 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleGroundTerms2581 = new BitSet(new long[]{0x0000000000044060L});
    public static final BitSet FOLLOW_ruleGroundTerm_in_ruleGroundTerms2602 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleGroundTerm_in_entryRuleGroundTerm2640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroundTerm2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundArithmeticTerm_in_ruleGroundTerm2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundFunctionalTerm_in_ruleGroundTerm2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedTerm_in_entryRuleQuantifiedTerm2765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedTerm2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_ruleQuantifiedTerm2819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleQuantifiedTerm2829 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleQuantifiedTerm2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier2892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleQuantifier2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleQuantifier2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleTerm3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedTerm_in_ruleTerm3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerms_in_entryRuleTerms3125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerms3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerms3181 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTerms3194 = new BitSet(new long[]{0x0000018000644070L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerms3215 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration3253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDeclaration3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleConstantDeclaration3300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleConstantDeclaration3317 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstantDeclaration3334 = new BitSet(new long[]{0x0000000000044060L});
    public static final BitSet FOLLOW_ruleGroundArithmeticTerm_in_ruleConstantDeclaration3355 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConstantDeclaration3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration3403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeDeclaration3450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleTypeDeclaration3467 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTypeDeclaration3484 = new BitSet(new long[]{0x0000018008044070L});
    public static final BitSet FOLLOW_ruleSetExpression_in_ruleTypeDeclaration3505 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTypeDeclaration3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimit_in_entryRuleLimit3553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimit3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroundArithmeticTerm_in_ruleLimit3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_entryRuleSet3643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSet3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSet3696 = new BitSet(new long[]{0x0000000010044060L});
    public static final BitSet FOLLOW_ruleGroundTerms_in_ruleSet3730 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSet3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange3779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRange3826 = new BitSet(new long[]{0x0000000000044060L});
    public static final BitSet FOLLOW_ruleLimit_in_ruleRange3847 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRange3859 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRange3871 = new BitSet(new long[]{0x0000000000044060L});
    public static final BitSet FOLLOW_ruleLimit_in_ruleRange3892 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRange3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExpression_in_entryRuleSetExpression3940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetExpression3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAddition_in_ruleSetExpression3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetConstruct_in_entryRuleSetConstruct4033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetConstruct4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleSetConstruct4089 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSetConstruct4101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTVars_in_ruleSetConstruct4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTVars_in_entryRuleTVars4158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTVars4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTVar_in_ruleTVars4214 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTVars4227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTVar_in_ruleTVars4248 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleTVar_in_entryRuleTVar4286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTVar4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTVar4342 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTVar4354 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleTVar4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAddition_in_entryRuleSetAddition4412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetAddition4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetMultiplication_in_ruleSetAddition4472 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleSetAddition4496 = new BitSet(new long[]{0x0000018008044070L});
    public static final BitSet FOLLOW_ruleSetMultiplication_in_ruleSetAddition4517 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleSetMultiplication_in_entryRuleSetMultiplication4555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetMultiplication4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPrimary_in_ruleSetMultiplication4615 = new BitSet(new long[]{0x0000000080008002L});
    public static final BitSet FOLLOW_15_in_ruleSetMultiplication4640 = new BitSet(new long[]{0x0000018008044070L});
    public static final BitSet FOLLOW_31_in_ruleSetMultiplication4658 = new BitSet(new long[]{0x0000018008044070L});
    public static final BitSet FOLLOW_ruleSetPrimary_in_ruleSetMultiplication4680 = new BitSet(new long[]{0x0000000080008002L});
    public static final BitSet FOLLOW_ruleSetPrimary_in_entryRuleSetPrimary4718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetPrimary4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleSetPrimary4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSetPrimary4796 = new BitSet(new long[]{0x0000018008044070L});
    public static final BitSet FOLLOW_ruleSetAddition_in_ruleSetPrimary4821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSetPrimary4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral4869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_ruleSetLiteral4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_ruleSetLiteral4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetConstruct_in_ruleSetLiteral4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleSetLiteral5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom5040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtom_in_ruleAtom5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInAtom_in_ruleAtom5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtom_in_entryRulePredicateAtom5165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAtom5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_rulePredicateAtom5217 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_rulePredicateAtom5235 = new BitSet(new long[]{0x0000018000644070L});
    public static final BitSet FOLLOW_ruleTerms_in_rulePredicateAtom5256 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePredicateAtom5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicPredicateAtom_in_entryRuleBasicPredicateAtom5306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicPredicateAtom5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleBasicPredicateAtom5358 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleBasicPredicateAtom5376 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_ruleBasicPredicateAtom5397 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBasicPredicateAtom5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInAtom_in_entryRuleBuiltInAtom5447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInAtom5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleBuiltInAtom5503 = new BitSet(new long[]{0x0000001F01000000L});
    public static final BitSet FOLLOW_ruleAtomOp_in_ruleBuiltInAtom5524 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleBuiltInAtom5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomOp_in_entryRuleAtomOp5582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomOp5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAtomOp5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAtomOp5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAtomOp5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAtomOp5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAtomOp5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAtomOp5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence5766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrSentence_in_ruleSentence5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrSentence_in_entryRuleOrSentence5859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrSentence5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndSentence_in_ruleOrSentence5919 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleOrSentence5943 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleAndSentence_in_ruleOrSentence5964 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleAndSentence_in_entryRuleAndSentence6002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndSentence6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotSentence_in_ruleAndSentence6062 = new BitSet(new long[]{0x0000004000100002L});
    public static final BitSet FOLLOW_38_in_ruleAndSentence6087 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_20_in_ruleAndSentence6105 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleNotSentence_in_ruleAndSentence6127 = new BitSet(new long[]{0x0000004000100002L});
    public static final BitSet FOLLOW_ruleNotSentence_in_entryRuleNotSentence6165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotSentence6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimarySentence_in_ruleNotSentence6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNotSentence6243 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_rulePrimarySentence_in_ruleNotSentence6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimarySentence_in_entryRulePrimarySentence6304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimarySentence6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceLiteral_in_rulePrimarySentence6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimarySentence6382 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleOrSentence_in_rulePrimarySentence6407 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrimarySentence6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceLiteral_in_entryRuleSentenceLiteral6455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceLiteral6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleSentenceLiteral6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepSentence_in_entryRulepSentence6548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepSentence6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepOrSentence_in_rulepSentence6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepOrSentence_in_entryRulepOrSentence6641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepOrSentence6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepAndSentence_in_rulepOrSentence6701 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_rulepOrSentence6725 = new BitSet(new long[]{0x0000008000040020L});
    public static final BitSet FOLLOW_rulepAndSentence_in_rulepOrSentence6746 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rulepAndSentence_in_entryRulepAndSentence6784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepAndSentence6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepNotSentence_in_rulepAndSentence6844 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_rulepAndSentence6868 = new BitSet(new long[]{0x0000008000040020L});
    public static final BitSet FOLLOW_rulepNotSentence_in_rulepAndSentence6889 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rulepNotSentence_in_entryRulepNotSentence6927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepNotSentence6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepPrimarySentence_in_rulepNotSentence6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulepNotSentence7005 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rulepPrimarySentence_in_rulepNotSentence7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepPrimarySentence_in_entryRulepPrimarySentence7066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepPrimarySentence7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepSentenceLiteral_in_rulepPrimarySentence7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulepPrimarySentence7144 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleOrSentence_in_rulepPrimarySentence7169 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulepPrimarySentence7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepSentenceLiteral_in_entryRulepSentenceLiteral7217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepSentenceLiteral7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtom_in_rulepSentenceLiteral7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaybeLiteral_in_entryRuleMaybeLiteral7310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaybeLiteral7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMaybeLiteral7357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBasicPredicateAtom_in_ruleMaybeLiteral7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityConstraint_in_entryRuleCardinalityConstraint7417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinalityConstraint7427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_ruleCardinalityConstraint7473 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCardinalityConstraint7485 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleCardinalityConstraint7497 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCardinalityConstraint7509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBasicPredicateAtom_in_ruleCardinalityConstraint7530 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCardinalityConstraint7542 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleCardinalityConstraint7554 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCardinalityConstraint7566 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleBound_in_ruleCardinalityConstraint7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound7623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_ruleBound7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule7713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_ruleRule7769 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_42_in_ruleRule7788 = new BitSet(new long[]{0x0000018000044070L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleRule7822 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRule7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead7872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepSentence_in_ruleHead7932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaybeLiteral_in_ruleHead7962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityConstraint_in_ruleHead7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement8027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleStatement8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_ruleStatement8117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_ruleStatement8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedVariable_in_synpred2_InternalL232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_synpred3_InternalL262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_synpred36_InternalL4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_synpred37_InternalL4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_synpred38_InternalL4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetConstruct_in_synpred39_InternalL4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtom_in_synpred40_InternalL5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceLiteral_in_synpred52_InternalL6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepSentence_in_synpred58_InternalL7932 = new BitSet(new long[]{0x0000000000000002L});

}