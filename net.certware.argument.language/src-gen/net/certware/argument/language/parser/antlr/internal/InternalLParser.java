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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UID", "RULE_ID", "RULE_INT", "RULE_LID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "','", "'='", "'.'", "'in'", "'\\\\'", "'set'", "'range'", "'set_constr'", "'every'", "'some'", "'>'", "'<'", "'>='", "'<='", "'!='", "'or'", "'and'", "'not'", "'maybe'", "'|'", "'{'", "'}'", "'if'"
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
    public static final int RULE_LID=7;
    public static final int RULE_ID=5;
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_LID)||LA1_0==18||LA1_0==38) ) {
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

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_UID:
                    {
                    alt2=1;
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
                case 21:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
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
            else if ( (LA2_0==RULE_INT||LA2_0==18) ) {
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:221:1: ruleTypedVariable returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_var_1_0= ruleVariable ) ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        EObject lv_var_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:224:28: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_var_1_0= ruleVariable ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:225:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_var_1_0= ruleVariable ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:225:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_var_1_0= ruleVariable ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:225:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_var_1_0= ruleVariable ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:225:2: ( (lv_type_0_0= RULE_ID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:226:1: (lv_type_0_0= RULE_ID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:226:1: (lv_type_0_0= RULE_ID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:227:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypedVariable472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_0_0, grammarAccess.getTypedVariableAccess().getTypeIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypedVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"ID");
              	    
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:454:1: rulePrimary returns [EObject current=null] : (this_ArithmeticLiteral_0= ruleArithmeticLiteral | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ArithmeticLiteral_0 = null;

        EObject this_Addition_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:457:28: ( (this_ArithmeticLiteral_0= ruleArithmeticLiteral | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:458:1: (this_ArithmeticLiteral_0= ruleArithmeticLiteral | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:458:1: (this_ArithmeticLiteral_0= ruleArithmeticLiteral | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:459:2: this_ArithmeticLiteral_0= ruleArithmeticLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getArithmeticLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticLiteral_in_rulePrimary1031);
                    this_ArithmeticLiteral_0=ruleArithmeticLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArithmeticLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:471:6: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:471:6: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:471:8: otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePrimary1049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAddition_in_rulePrimary1074);
                    this_Addition_2=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Addition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulePrimary1085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                          
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:499:1: entryRuleArithmeticLiteral returns [EObject current=null] : iv_ruleArithmeticLiteral= ruleArithmeticLiteral EOF ;
    public final EObject entryRuleArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:500:2: (iv_ruleArithmeticLiteral= ruleArithmeticLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:501:2: iv_ruleArithmeticLiteral= ruleArithmeticLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticLiteral_in_entryRuleArithmeticLiteral1122);
            iv_ruleArithmeticLiteral=ruleArithmeticLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticLiteral1132); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:508:1: ruleArithmeticLiteral returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:511:28: ( ( ( (lv_identifier_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:512:1: ( ( (lv_identifier_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:512:1: ( ( (lv_identifier_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:512:2: ( (lv_identifier_0_0= RULE_ID ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:512:2: ( (lv_identifier_0_0= RULE_ID ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:513:1: (lv_identifier_0_0= RULE_ID )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:513:1: (lv_identifier_0_0= RULE_ID )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:514:3: lv_identifier_0_0= RULE_ID
                    {
                    lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArithmeticLiteral1174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_0_0, grammarAccess.getArithmeticLiteralAccess().getIdentifierIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArithmeticLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:531:6: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:531:6: ( (lv_value_1_0= RULE_INT ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:532:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:532:1: (lv_value_1_0= RULE_INT )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:533:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArithmeticLiteral1202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getArithmeticLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArithmeticLiteralRule());
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
    // $ANTLR end "ruleArithmeticLiteral"


    // $ANTLR start "entryRuleFunctionalTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:557:1: entryRuleFunctionalTerm returns [EObject current=null] : iv_ruleFunctionalTerm= ruleFunctionalTerm EOF ;
    public final EObject entryRuleFunctionalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:558:2: (iv_ruleFunctionalTerm= ruleFunctionalTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:559:2: iv_ruleFunctionalTerm= ruleFunctionalTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionalTermRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionalTerm_in_entryRuleFunctionalTerm1243);
            iv_ruleFunctionalTerm=ruleFunctionalTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionalTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionalTerm1253); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:566:1: ruleFunctionalTerm returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= '(' this_BasicTerms_2= ruleBasicTerms otherlv_3= ')' ) ;
    public final EObject ruleFunctionalTerm() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_BasicTerms_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:569:28: ( (this_ID_0= RULE_ID otherlv_1= '(' this_BasicTerms_2= ruleBasicTerms otherlv_3= ')' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:570:1: (this_ID_0= RULE_ID otherlv_1= '(' this_BasicTerms_2= ruleBasicTerms otherlv_3= ')' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:570:1: (this_ID_0= RULE_ID otherlv_1= '(' this_BasicTerms_2= ruleBasicTerms otherlv_3= ')' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:570:2: this_ID_0= RULE_ID otherlv_1= '(' this_BasicTerms_2= ruleBasicTerms otherlv_3= ')'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionalTerm1289); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFunctionalTermAccess().getIDTerminalRuleCall_0()); 
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFunctionalTerm1300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionalTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionalTermAccess().getBasicTermsParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicTerms_in_ruleFunctionalTerm1325);
            this_BasicTerms_2=ruleBasicTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicTerms_2; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFunctionalTerm1336); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBasicTerms"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:602:1: entryRuleBasicTerms returns [EObject current=null] : iv_ruleBasicTerms= ruleBasicTerms EOF ;
    public final EObject entryRuleBasicTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicTerms = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:603:2: (iv_ruleBasicTerms= ruleBasicTerms EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:604:2: iv_ruleBasicTerms= ruleBasicTerms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTermsRule()); 
            }
            pushFollow(FOLLOW_ruleBasicTerms_in_entryRuleBasicTerms1372);
            iv_ruleBasicTerms=ruleBasicTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicTerms; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicTerms1382); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:611:1: ruleBasicTerms returns [EObject current=null] : ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* ) ;
    public final EObject ruleBasicTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:614:28: ( ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:615:1: ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:615:1: ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:615:2: ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )*
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:615:2: ( (lv_car_0_0= ruleBasicTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:616:1: (lv_car_0_0= ruleBasicTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:616:1: (lv_car_0_0= ruleBasicTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:617:3: lv_car_0_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicTermsAccess().getCarBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicTerm_in_ruleBasicTerms1428);
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

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:633:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:633:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleBasicTerms1441); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getBasicTermsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:637:1: ( (lv_cdr_2_0= ruleBasicTerm ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:638:1: (lv_cdr_2_0= ruleBasicTerm )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:638:1: (lv_cdr_2_0= ruleBasicTerm )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:639:3: lv_cdr_2_0= ruleBasicTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBasicTermsAccess().getCdrBasicTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBasicTerm_in_ruleBasicTerms1462);
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
            	    break loop9;
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


    // $ANTLR start "entryRuleConstantDeclaration"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:663:1: entryRuleConstantDeclaration returns [EObject current=null] : iv_ruleConstantDeclaration= ruleConstantDeclaration EOF ;
    public final EObject entryRuleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDeclaration = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:664:2: (iv_ruleConstantDeclaration= ruleConstantDeclaration EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:665:2: iv_ruleConstantDeclaration= ruleConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration1500);
            iv_ruleConstantDeclaration=ruleConstantDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDeclaration1510); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:672:1: ruleConstantDeclaration returns [EObject current=null] : ( ( (lv_id_0_0= RULE_LID ) ) otherlv_1= '=' ( (lv_cv_2_0= ruleArithmeticTerm ) ) otherlv_3= '.' ) ;
    public final EObject ruleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cv_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:675:28: ( ( ( (lv_id_0_0= RULE_LID ) ) otherlv_1= '=' ( (lv_cv_2_0= ruleArithmeticTerm ) ) otherlv_3= '.' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:676:1: ( ( (lv_id_0_0= RULE_LID ) ) otherlv_1= '=' ( (lv_cv_2_0= ruleArithmeticTerm ) ) otherlv_3= '.' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:676:1: ( ( (lv_id_0_0= RULE_LID ) ) otherlv_1= '=' ( (lv_cv_2_0= ruleArithmeticTerm ) ) otherlv_3= '.' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:676:2: ( (lv_id_0_0= RULE_LID ) ) otherlv_1= '=' ( (lv_cv_2_0= ruleArithmeticTerm ) ) otherlv_3= '.'
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:676:2: ( (lv_id_0_0= RULE_LID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:677:1: (lv_id_0_0= RULE_LID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:677:1: (lv_id_0_0= RULE_LID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:678:3: lv_id_0_0= RULE_LID
            {
            lv_id_0_0=(Token)match(input,RULE_LID,FOLLOW_RULE_LID_in_ruleConstantDeclaration1552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_0_0, grammarAccess.getConstantDeclarationAccess().getIdLIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"LID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleConstantDeclaration1569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstantDeclarationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:698:1: ( (lv_cv_2_0= ruleArithmeticTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:699:1: (lv_cv_2_0= ruleArithmeticTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:699:1: (lv_cv_2_0= ruleArithmeticTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:700:3: lv_cv_2_0= ruleArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getCvArithmeticTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithmeticTerm_in_ruleConstantDeclaration1590);
            lv_cv_2_0=ruleArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"cv",
                      		lv_cv_2_0, 
                      		"ArithmeticTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleConstantDeclaration1602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstantDeclarationAccess().getFullStopKeyword_3());
                  
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:728:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:729:2: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:730:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration1638);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDeclaration1648); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:737:1: ruleTypeDeclaration returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleSetExpression ) ) otherlv_3= '.' ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:740:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleSetExpression ) ) otherlv_3= '.' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:741:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleSetExpression ) ) otherlv_3= '.' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:741:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleSetExpression ) ) otherlv_3= '.' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:741:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleSetExpression ) ) otherlv_3= '.'
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:741:2: ( (lv_id_0_0= RULE_ID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:742:1: (lv_id_0_0= RULE_ID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:742:1: (lv_id_0_0= RULE_ID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:743:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDeclaration1690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_0_0, grammarAccess.getTypeDeclarationAccess().getIdIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTypeDeclaration1707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTypeDeclarationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:763:1: ( (lv_exp_2_0= ruleSetExpression ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:764:1: (lv_exp_2_0= ruleSetExpression )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:764:1: (lv_exp_2_0= ruleSetExpression )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:765:3: lv_exp_2_0= ruleSetExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getExpSetExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSetExpression_in_ruleTypeDeclaration1728);
            lv_exp_2_0=ruleSetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_2_0, 
                      		"SetExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTypeDeclaration1740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTypeDeclarationAccess().getFullStopKeyword_3());
                  
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:793:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:794:2: (iv_ruleLimit= ruleLimit EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:795:2: iv_ruleLimit= ruleLimit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLimitRule()); 
            }
            pushFollow(FOLLOW_ruleLimit_in_entryRuleLimit1776);
            iv_ruleLimit=ruleLimit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLimit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimit1786); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:802:1: ruleLimit returns [EObject current=null] : ( (lv_cv_0_0= ruleArithmeticTerm ) ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        EObject lv_cv_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:805:28: ( ( (lv_cv_0_0= ruleArithmeticTerm ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:806:1: ( (lv_cv_0_0= ruleArithmeticTerm ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:806:1: ( (lv_cv_0_0= ruleArithmeticTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:807:1: (lv_cv_0_0= ruleArithmeticTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:807:1: (lv_cv_0_0= ruleArithmeticTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:808:3: lv_cv_0_0= ruleArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLimitAccess().getCvArithmeticTermParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithmeticTerm_in_ruleLimit1831);
            lv_cv_0_0=ruleArithmeticTerm();

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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleSetExpression"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:836:1: entryRuleSetExpression returns [EObject current=null] : iv_ruleSetExpression= ruleSetExpression EOF ;
    public final EObject entryRuleSetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExpression = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:837:2: (iv_ruleSetExpression= ruleSetExpression EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:838:2: iv_ruleSetExpression= ruleSetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSetExpression_in_entryRuleSetExpression1870);
            iv_ruleSetExpression=ruleSetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetExpression1880); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:845:1: ruleSetExpression returns [EObject current=null] : this_SetAddition_0= ruleSetAddition ;
    public final EObject ruleSetExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SetAddition_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:848:28: (this_SetAddition_0= ruleSetAddition )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:850:2: this_SetAddition_0= ruleSetAddition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSetExpressionAccess().getSetAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSetAddition_in_ruleSetExpression1929);
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


    // $ANTLR start "entryRuleTVars"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:871:1: entryRuleTVars returns [EObject current=null] : iv_ruleTVars= ruleTVars EOF ;
    public final EObject entryRuleTVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTVars = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:872:2: (iv_ruleTVars= ruleTVars EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:873:2: iv_ruleTVars= ruleTVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTVarsRule()); 
            }
            pushFollow(FOLLOW_ruleTVars_in_entryRuleTVars1965);
            iv_ruleTVars=ruleTVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTVars; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTVars1975); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:880:1: ruleTVars returns [EObject current=null] : ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* ) ;
    public final EObject ruleTVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:883:28: ( ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:884:1: ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:884:1: ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:884:2: ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )*
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:884:2: ( (lv_car_0_0= ruleTVar ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:885:1: (lv_car_0_0= ruleTVar )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:885:1: (lv_car_0_0= ruleTVar )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:886:3: lv_car_0_0= ruleTVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTVarsAccess().getCarTVarParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTVar_in_ruleTVars2021);
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

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:902:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:902:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleTVars2034); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTVarsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:906:1: ( (lv_cdr_2_0= ruleTVar ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:907:1: (lv_cdr_2_0= ruleTVar )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:907:1: (lv_cdr_2_0= ruleTVar )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:908:3: lv_cdr_2_0= ruleTVar
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTVarsAccess().getCdrTVarParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTVar_in_ruleTVars2055);
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
            	    break loop10;
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:932:1: entryRuleTVar returns [EObject current=null] : iv_ruleTVar= ruleTVar EOF ;
    public final EObject entryRuleTVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTVar = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:933:2: (iv_ruleTVar= ruleTVar EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:934:2: iv_ruleTVar= ruleTVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTVarRule()); 
            }
            pushFollow(FOLLOW_ruleTVar_in_entryRuleTVar2093);
            iv_ruleTVar=ruleTVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTVar2103); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:941:1: ruleTVar returns [EObject current=null] : (this_Variable_0= ruleVariable otherlv_1= 'in' this_ID_2= RULE_ID ) ;
    public final EObject ruleTVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        EObject this_Variable_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:944:28: ( (this_Variable_0= ruleVariable otherlv_1= 'in' this_ID_2= RULE_ID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:945:1: (this_Variable_0= ruleVariable otherlv_1= 'in' this_ID_2= RULE_ID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:945:1: (this_Variable_0= ruleVariable otherlv_1= 'in' this_ID_2= RULE_ID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:946:2: this_Variable_0= ruleVariable otherlv_1= 'in' this_ID_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTVarAccess().getVariableParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleTVar2153);
            this_Variable_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Variable_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleTVar2164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTVarAccess().getInKeyword_1());
                  
            }
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTVar2175); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getTVarAccess().getIDTerminalRuleCall_2()); 
                  
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:973:1: entryRuleSetAddition returns [EObject current=null] : iv_ruleSetAddition= ruleSetAddition EOF ;
    public final EObject entryRuleSetAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAddition = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:974:2: (iv_ruleSetAddition= ruleSetAddition EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:975:2: iv_ruleSetAddition= ruleSetAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleSetAddition_in_entryRuleSetAddition2210);
            iv_ruleSetAddition=ruleSetAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetAddition2220); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:982:1: ruleSetAddition returns [EObject current=null] : (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* ) ;
    public final EObject ruleSetAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SetMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:985:28: ( (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:986:1: (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:986:1: (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:987:2: this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSetAdditionAccess().getSetMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSetMultiplication_in_ruleSetAddition2270);
            this_SetMultiplication_0=ruleSetMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SetMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:998:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:998:2: () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:998:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:999:2: 
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

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSetAddition2294); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSetAdditionAccess().getPlusSignKeyword_1_1());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1011:1: ( (lv_right_3_0= ruleSetMultiplication ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1012:1: (lv_right_3_0= ruleSetMultiplication )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1012:1: (lv_right_3_0= ruleSetMultiplication )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1013:3: lv_right_3_0= ruleSetMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetAdditionAccess().getRightSetMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSetMultiplication_in_ruleSetAddition2315);
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
            	    break loop11;
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1037:1: entryRuleSetMultiplication returns [EObject current=null] : iv_ruleSetMultiplication= ruleSetMultiplication EOF ;
    public final EObject entryRuleSetMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetMultiplication = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1038:2: (iv_ruleSetMultiplication= ruleSetMultiplication EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1039:2: iv_ruleSetMultiplication= ruleSetMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleSetMultiplication_in_entryRuleSetMultiplication2353);
            iv_ruleSetMultiplication=ruleSetMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetMultiplication2363); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1046:1: ruleSetMultiplication returns [EObject current=null] : (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* ) ;
    public final EObject ruleSetMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SetPrimary_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1049:28: ( (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1050:1: (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1050:1: (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1051:2: this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSetMultiplicationAccess().getSetPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSetPrimary_in_ruleSetMultiplication2413);
            this_SetPrimary_0=ruleSetPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SetPrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1062:1: ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15||LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1062:2: () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1062:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1063:2: 
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

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1071:2: (otherlv_2= '*' | otherlv_3= '\\\\' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==15) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==24) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1071:4: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSetMultiplication2438); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getSetMultiplicationAccess().getAsteriskKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1076:7: otherlv_3= '\\\\'
            	            {
            	            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleSetMultiplication2456); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getSetMultiplicationAccess().getReverseSolidusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1080:2: ( (lv_right_4_0= ruleSetPrimary ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1081:1: (lv_right_4_0= ruleSetPrimary )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1081:1: (lv_right_4_0= ruleSetPrimary )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1082:3: lv_right_4_0= ruleSetPrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetMultiplicationAccess().getRightSetPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSetPrimary_in_ruleSetMultiplication2478);
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
            	    break loop13;
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1106:1: entryRuleSetPrimary returns [EObject current=null] : iv_ruleSetPrimary= ruleSetPrimary EOF ;
    public final EObject entryRuleSetPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetPrimary = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1107:2: (iv_ruleSetPrimary= ruleSetPrimary EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1108:2: iv_ruleSetPrimary= ruleSetPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetPrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleSetPrimary_in_entryRuleSetPrimary2516);
            iv_ruleSetPrimary=ruleSetPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetPrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetPrimary2526); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1115:1: ruleSetPrimary returns [EObject current=null] : (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) ) ;
    public final EObject ruleSetPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SetLiteral_0 = null;

        EObject this_SetAddition_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1118:28: ( (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1119:1: (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1119:1: (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=25 && LA14_0<=27)) ) {
                alt14=1;
            }
            else if ( (LA14_0==18) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1120:2: this_SetLiteral_0= ruleSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetPrimaryAccess().getSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleSetPrimary2576);
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
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1132:6: (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1132:6: (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1132:8: otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSetPrimary2594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSetPrimaryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetPrimaryAccess().getSetAdditionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetAddition_in_ruleSetPrimary2619);
                    this_SetAddition_2=ruleSetAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetAddition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSetPrimary2630); if (state.failed) return current;
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1160:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1161:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1162:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral2667);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral2677); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1169:1: ruleSetLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'set' | lv_value_0_2= 'range' | lv_value_0_3= 'set_constr' ) ) ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1172:28: ( ( ( (lv_value_0_1= 'set' | lv_value_0_2= 'range' | lv_value_0_3= 'set_constr' ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1173:1: ( ( (lv_value_0_1= 'set' | lv_value_0_2= 'range' | lv_value_0_3= 'set_constr' ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1173:1: ( ( (lv_value_0_1= 'set' | lv_value_0_2= 'range' | lv_value_0_3= 'set_constr' ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1174:1: ( (lv_value_0_1= 'set' | lv_value_0_2= 'range' | lv_value_0_3= 'set_constr' ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1174:1: ( (lv_value_0_1= 'set' | lv_value_0_2= 'range' | lv_value_0_3= 'set_constr' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1175:1: (lv_value_0_1= 'set' | lv_value_0_2= 'range' | lv_value_0_3= 'set_constr' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1175:1: (lv_value_0_1= 'set' | lv_value_0_2= 'range' | lv_value_0_3= 'set_constr' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1176:3: lv_value_0_1= 'set'
                    {
                    lv_value_0_1=(Token)match(input,25,FOLLOW_25_in_ruleSetLiteral2721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_1, grammarAccess.getSetLiteralAccess().getValueSetKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSetLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1188:8: lv_value_0_2= 'range'
                    {
                    lv_value_0_2=(Token)match(input,26,FOLLOW_26_in_ruleSetLiteral2750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_2, grammarAccess.getSetLiteralAccess().getValueRangeKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSetLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1200:8: lv_value_0_3= 'set_constr'
                    {
                    lv_value_0_3=(Token)match(input,27,FOLLOW_27_in_ruleSetLiteral2779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_3, grammarAccess.getSetLiteralAccess().getValueSet_constrKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSetLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_3, null);
                      	    
                    }

                    }
                    break;

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
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleQuantifiedTerm"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1223:1: entryRuleQuantifiedTerm returns [EObject current=null] : iv_ruleQuantifiedTerm= ruleQuantifiedTerm EOF ;
    public final EObject entryRuleQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedTerm = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1224:2: (iv_ruleQuantifiedTerm= ruleQuantifiedTerm EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1225:2: iv_ruleQuantifiedTerm= ruleQuantifiedTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantifiedTermRule()); 
            }
            pushFollow(FOLLOW_ruleQuantifiedTerm_in_entryRuleQuantifiedTerm2830);
            iv_ruleQuantifiedTerm=ruleQuantifiedTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantifiedTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedTerm2840); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1232:1: ruleQuantifiedTerm returns [EObject current=null] : ( ruleQuantifier this_ID_1= RULE_ID this_Variable_2= ruleVariable ) ;
    public final EObject ruleQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1235:28: ( ( ruleQuantifier this_ID_1= RULE_ID this_Variable_2= ruleVariable ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1236:1: ( ruleQuantifier this_ID_1= RULE_ID this_Variable_2= ruleVariable )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1236:1: ( ruleQuantifier this_ID_1= RULE_ID this_Variable_2= ruleVariable )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1237:2: ruleQuantifier this_ID_1= RULE_ID this_Variable_2= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQuantifiedTermAccess().getQuantifierParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQuantifier_in_ruleQuantifiedTerm2884);
            ruleQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuantifiedTerm2894); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getQuantifiedTermAccess().getIDTerminalRuleCall_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQuantifiedTermAccess().getVariableParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleQuantifiedTerm2918);
            this_Variable_2=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Variable_2; 
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
    // $ANTLR end "ruleQuantifiedTerm"


    // $ANTLR start "entryRuleQuantifier"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1271:1: entryRuleQuantifier returns [String current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final String entryRuleQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuantifier = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1272:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1273:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantifierRule()); 
            }
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier2954);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier2965); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1280:1: ruleQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'every' | kw= 'some' ) ;
    public final AntlrDatatypeRuleToken ruleQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1283:28: ( (kw= 'every' | kw= 'some' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1284:1: (kw= 'every' | kw= 'some' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1284:1: (kw= 'every' | kw= 'some' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1285:2: kw= 'every'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleQuantifier3003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuantifierAccess().getEveryKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1292:2: kw= 'some'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleQuantifier3022); if (state.failed) return current;
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


    // $ANTLR start "entryRulePredicateAtom"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1309:1: entryRulePredicateAtom returns [EObject current=null] : iv_rulePredicateAtom= rulePredicateAtom EOF ;
    public final EObject entryRulePredicateAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAtom = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1310:2: (iv_rulePredicateAtom= rulePredicateAtom EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1311:2: iv_rulePredicateAtom= rulePredicateAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateAtomRule()); 
            }
            pushFollow(FOLLOW_rulePredicateAtom_in_entryRulePredicateAtom3066);
            iv_rulePredicateAtom=rulePredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicateAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAtom3076); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1318:1: rulePredicateAtom returns [EObject current=null] : ( ( (lv_fid_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? ) ;
    public final EObject rulePredicateAtom() throws RecognitionException {
        EObject current = null;

        Token lv_fid_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1321:28: ( ( ( (lv_fid_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1322:1: ( ( (lv_fid_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1322:1: ( ( (lv_fid_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1322:2: ( (lv_fid_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )?
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1322:2: ( (lv_fid_0_0= RULE_ID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1323:1: (lv_fid_0_0= RULE_ID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1323:1: (lv_fid_0_0= RULE_ID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1324:3: lv_fid_0_0= RULE_ID
            {
            lv_fid_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePredicateAtom3118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fid_0_0, grammarAccess.getPredicateAtomAccess().getFidIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPredicateAtomRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fid",
                      		lv_fid_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1340:2: (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1340:4: otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePredicateAtom3136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPredicateAtomAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1344:1: ( (lv_terms_2_0= ruleBasicTerms ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1345:1: (lv_terms_2_0= ruleBasicTerms )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1345:1: (lv_terms_2_0= ruleBasicTerms )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1346:3: lv_terms_2_0= ruleBasicTerms
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPredicateAtomAccess().getTermsBasicTermsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBasicTerms_in_rulePredicateAtom3157);
                    lv_terms_2_0=ruleBasicTerms();

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
                              		"BasicTerms");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulePredicateAtom3169); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBuiltInAtom"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1374:1: entryRuleBuiltInAtom returns [EObject current=null] : iv_ruleBuiltInAtom= ruleBuiltInAtom EOF ;
    public final EObject entryRuleBuiltInAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInAtom = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1375:2: (iv_ruleBuiltInAtom= ruleBuiltInAtom EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1376:2: iv_ruleBuiltInAtom= ruleBuiltInAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInAtomRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInAtom_in_entryRuleBuiltInAtom3207);
            iv_ruleBuiltInAtom=ruleBuiltInAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInAtom3217); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1383:1: ruleBuiltInAtom returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) ) ;
    public final EObject ruleBuiltInAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1386:28: ( ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1387:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1387:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1387:2: ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1387:2: ( (lv_lhs_0_0= ruleBasicTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1388:1: (lv_lhs_0_0= ruleBasicTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1388:1: (lv_lhs_0_0= ruleBasicTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1389:3: lv_lhs_0_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuiltInAtomAccess().getLhsBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicTerm_in_ruleBuiltInAtom3263);
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

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1405:2: ( (lv_op_1_0= ruleAtomOp ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1406:1: (lv_op_1_0= ruleAtomOp )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1406:1: (lv_op_1_0= ruleAtomOp )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1407:3: lv_op_1_0= ruleAtomOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuiltInAtomAccess().getOpAtomOpParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAtomOp_in_ruleBuiltInAtom3284);
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

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1423:2: ( (lv_rhs_2_0= ruleBasicTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1424:1: (lv_rhs_2_0= ruleBasicTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1424:1: (lv_rhs_2_0= ruleBasicTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1425:3: lv_rhs_2_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuiltInAtomAccess().getRhsBasicTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicTerm_in_ruleBuiltInAtom3305);
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1449:1: entryRuleAtomOp returns [String current=null] : iv_ruleAtomOp= ruleAtomOp EOF ;
    public final String entryRuleAtomOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtomOp = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1450:2: (iv_ruleAtomOp= ruleAtomOp EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1451:2: iv_ruleAtomOp= ruleAtomOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomOpRule()); 
            }
            pushFollow(FOLLOW_ruleAtomOp_in_entryRuleAtomOp3342);
            iv_ruleAtomOp=ruleAtomOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomOp3353); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1458:1: ruleAtomOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleAtomOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1461:28: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1462:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1462:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            case 33:
                {
                alt18=4;
                }
                break;
            case 21:
                {
                alt18=5;
                }
                break;
            case 34:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1463:2: kw= '>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleAtomOp3391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1470:2: kw= '<'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleAtomOp3410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1477:2: kw= '>='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleAtomOp3429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1484:2: kw= '<='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleAtomOp3448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1491:2: kw= '='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleAtomOp3467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1498:2: kw= '!='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleAtomOp3486); if (state.failed) return current;
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1511:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1512:2: (iv_ruleSentence= ruleSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1513:2: iv_ruleSentence= ruleSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSentenceRule()); 
            }
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence3526);
            iv_ruleSentence=ruleSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence3536); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1520:1: ruleSentence returns [EObject current=null] : this_OrSentence_0= ruleOrSentence ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        EObject this_OrSentence_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1523:28: (this_OrSentence_0= ruleOrSentence )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1525:2: this_OrSentence_0= ruleOrSentence
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSentenceAccess().getOrSentenceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrSentence_in_ruleSentence3585);
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1544:1: entryRuleOrSentence returns [EObject current=null] : iv_ruleOrSentence= ruleOrSentence EOF ;
    public final EObject entryRuleOrSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1545:2: (iv_ruleOrSentence= ruleOrSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1546:2: iv_ruleOrSentence= ruleOrSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrSentenceRule()); 
            }
            pushFollow(FOLLOW_ruleOrSentence_in_entryRuleOrSentence3619);
            iv_ruleOrSentence=ruleOrSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrSentence3629); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1553:1: ruleOrSentence returns [EObject current=null] : (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* ) ;
    public final EObject ruleOrSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndSentence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1556:28: ( (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1557:1: (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1557:1: (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1558:2: this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrSentenceAccess().getAndSentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndSentence_in_ruleOrSentence3679);
            this_AndSentence_0=ruleAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1569:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1569:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1569:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1570:2: 
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

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleOrSentence3703); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrSentenceAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1582:1: ( (lv_right_3_0= ruleAndSentence ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1583:1: (lv_right_3_0= ruleAndSentence )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1583:1: (lv_right_3_0= ruleAndSentence )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1584:3: lv_right_3_0= ruleAndSentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrSentenceAccess().getRightAndSentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndSentence_in_ruleOrSentence3724);
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
    // $ANTLR end "ruleOrSentence"


    // $ANTLR start "entryRuleAndSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1608:1: entryRuleAndSentence returns [EObject current=null] : iv_ruleAndSentence= ruleAndSentence EOF ;
    public final EObject entryRuleAndSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1609:2: (iv_ruleAndSentence= ruleAndSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1610:2: iv_ruleAndSentence= ruleAndSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndSentenceRule()); 
            }
            pushFollow(FOLLOW_ruleAndSentence_in_entryRuleAndSentence3762);
            iv_ruleAndSentence=ruleAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndSentence3772); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1617:1: ruleAndSentence returns [EObject current=null] : (this_NotSentence_0= ruleNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNotSentence ) ) )* ) ;
    public final EObject ruleAndSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NotSentence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1620:28: ( (this_NotSentence_0= ruleNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNotSentence ) ) )* ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1621:1: (this_NotSentence_0= ruleNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNotSentence ) ) )* )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1621:1: (this_NotSentence_0= ruleNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNotSentence ) ) )* )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1622:2: this_NotSentence_0= ruleNotSentence ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNotSentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndSentenceAccess().getNotSentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNotSentence_in_ruleAndSentence3822);
            this_NotSentence_0=ruleNotSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1633:1: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNotSentence ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1633:2: () otherlv_2= 'and' ( (lv_right_3_0= ruleNotSentence ) )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1633:2: ()
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1634:2: 
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

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleAndSentence3846); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAndSentenceAccess().getAndKeyword_1_1());
            	          
            	    }
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1646:1: ( (lv_right_3_0= ruleNotSentence ) )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1647:1: (lv_right_3_0= ruleNotSentence )
            	    {
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1647:1: (lv_right_3_0= ruleNotSentence )
            	    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1648:3: lv_right_3_0= ruleNotSentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndSentenceAccess().getRightNotSentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNotSentence_in_ruleAndSentence3867);
            	    lv_right_3_0=ruleNotSentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndSentenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"NotSentence");
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
    // $ANTLR end "ruleAndSentence"


    // $ANTLR start "entryRuleNotSentence"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1672:1: entryRuleNotSentence returns [EObject current=null] : iv_ruleNotSentence= ruleNotSentence EOF ;
    public final EObject entryRuleNotSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotSentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1673:2: (iv_ruleNotSentence= ruleNotSentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1674:2: iv_ruleNotSentence= ruleNotSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotSentenceRule()); 
            }
            pushFollow(FOLLOW_ruleNotSentence_in_entryRuleNotSentence3905);
            iv_ruleNotSentence=ruleNotSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotSentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotSentence3915); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1681:1: ruleNotSentence returns [EObject current=null] : (this_PrimarySentence_0= rulePrimarySentence | (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence ) ) ;
    public final EObject ruleNotSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimarySentence_0 = null;

        EObject this_PrimarySentence_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1684:28: ( (this_PrimarySentence_0= rulePrimarySentence | (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1685:1: (this_PrimarySentence_0= rulePrimarySentence | (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1685:1: (this_PrimarySentence_0= rulePrimarySentence | (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==18) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1686:2: this_PrimarySentence_0= rulePrimarySentence
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotSentenceAccess().getPrimarySentenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimarySentence_in_ruleNotSentence3965);
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
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1698:6: (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1698:6: (otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1698:8: otherlv_1= 'not' this_PrimarySentence_2= rulePrimarySentence
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleNotSentence3983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotSentenceAccess().getNotKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotSentenceAccess().getPrimarySentenceParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimarySentence_in_ruleNotSentence4008);
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1722:1: entryRulePrimarySentence returns [EObject current=null] : iv_rulePrimarySentence= rulePrimarySentence EOF ;
    public final EObject entryRulePrimarySentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimarySentence = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1723:2: (iv_rulePrimarySentence= rulePrimarySentence EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1724:2: iv_rulePrimarySentence= rulePrimarySentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimarySentenceRule()); 
            }
            pushFollow(FOLLOW_rulePrimarySentence_in_entryRulePrimarySentence4044);
            iv_rulePrimarySentence=rulePrimarySentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimarySentence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimarySentence4054); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1731:1: rulePrimarySentence returns [EObject current=null] : (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) ) ;
    public final EObject rulePrimarySentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SentenceLiteral_0 = null;

        EObject this_OrSentence_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1734:28: ( (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1735:1: (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1735:1: (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==18) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1736:2: this_SentenceLiteral_0= ruleSentenceLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimarySentenceAccess().getSentenceLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSentenceLiteral_in_rulePrimarySentence4104);
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
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1748:6: (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1748:6: (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1748:8: otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePrimarySentence4122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimarySentenceAccess().getOrSentenceParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrSentence_in_rulePrimarySentence4147);
                    this_OrSentence_2=ruleOrSentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrSentence_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulePrimarySentence4158); if (state.failed) return current;
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1776:1: entryRuleSentenceLiteral returns [EObject current=null] : iv_ruleSentenceLiteral= ruleSentenceLiteral EOF ;
    public final EObject entryRuleSentenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1777:2: (iv_ruleSentenceLiteral= ruleSentenceLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1778:2: iv_ruleSentenceLiteral= ruleSentenceLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSentenceLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleSentenceLiteral_in_entryRuleSentenceLiteral4195);
            iv_ruleSentenceLiteral=ruleSentenceLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSentenceLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceLiteral4205); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1785:1: ruleSentenceLiteral returns [EObject current=null] : this_PredicateAtom_0= rulePredicateAtom ;
    public final EObject ruleSentenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_PredicateAtom_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1788:28: (this_PredicateAtom_0= rulePredicateAtom )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1790:2: this_PredicateAtom_0= rulePredicateAtom
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSentenceLiteralAccess().getPredicateAtomParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePredicateAtom_in_ruleSentenceLiteral4254);
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
    // $ANTLR end "ruleSentenceLiteral"


    // $ANTLR start "entryRuleMaybeLiteral"
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1809:1: entryRuleMaybeLiteral returns [EObject current=null] : iv_ruleMaybeLiteral= ruleMaybeLiteral EOF ;
    public final EObject entryRuleMaybeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaybeLiteral = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1810:2: (iv_ruleMaybeLiteral= ruleMaybeLiteral EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1811:2: iv_ruleMaybeLiteral= ruleMaybeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaybeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleMaybeLiteral_in_entryRuleMaybeLiteral4288);
            iv_ruleMaybeLiteral=ruleMaybeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaybeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaybeLiteral4298); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1818:1: ruleMaybeLiteral returns [EObject current=null] : (otherlv_0= 'maybe' this_ID_1= RULE_ID otherlv_2= '(' this_BasicTerms_3= ruleBasicTerms otherlv_4= ')' ) ;
    public final EObject ruleMaybeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BasicTerms_3 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1821:28: ( (otherlv_0= 'maybe' this_ID_1= RULE_ID otherlv_2= '(' this_BasicTerms_3= ruleBasicTerms otherlv_4= ')' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1822:1: (otherlv_0= 'maybe' this_ID_1= RULE_ID otherlv_2= '(' this_BasicTerms_3= ruleBasicTerms otherlv_4= ')' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1822:1: (otherlv_0= 'maybe' this_ID_1= RULE_ID otherlv_2= '(' this_BasicTerms_3= ruleBasicTerms otherlv_4= ')' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1822:3: otherlv_0= 'maybe' this_ID_1= RULE_ID otherlv_2= '(' this_BasicTerms_3= ruleBasicTerms otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleMaybeLiteral4335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaybeLiteralAccess().getMaybeKeyword_0());
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMaybeLiteral4346); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getMaybeLiteralAccess().getIDTerminalRuleCall_1()); 
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMaybeLiteral4357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMaybeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMaybeLiteralAccess().getBasicTermsParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicTerms_in_ruleMaybeLiteral4382);
            this_BasicTerms_3=ruleBasicTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicTerms_3; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMaybeLiteral4393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMaybeLiteralAccess().getRightParenthesisKeyword_4());
                  
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1858:1: entryRuleCardinalityConstraint returns [EObject current=null] : iv_ruleCardinalityConstraint= ruleCardinalityConstraint EOF ;
    public final EObject entryRuleCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalityConstraint = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1859:2: (iv_ruleCardinalityConstraint= ruleCardinalityConstraint EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1860:2: iv_ruleCardinalityConstraint= ruleCardinalityConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCardinalityConstraint_in_entryRuleCardinalityConstraint4429);
            iv_ruleCardinalityConstraint=ruleCardinalityConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinalityConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinalityConstraint4439); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1867:1: ruleCardinalityConstraint returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_terms_6_0= ruleBasicTerms ) ) otherlv_7= ')' otherlv_8= '}' otherlv_9= '|' otherlv_10= '<=' ( (lv_rhs_11_0= ruleBound ) ) ) ;
    public final EObject ruleCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_terms_6_0 = null;

        EObject lv_rhs_11_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1870:28: ( ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_terms_6_0= ruleBasicTerms ) ) otherlv_7= ')' otherlv_8= '}' otherlv_9= '|' otherlv_10= '<=' ( (lv_rhs_11_0= ruleBound ) ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1871:1: ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_terms_6_0= ruleBasicTerms ) ) otherlv_7= ')' otherlv_8= '}' otherlv_9= '|' otherlv_10= '<=' ( (lv_rhs_11_0= ruleBound ) ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1871:1: ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_terms_6_0= ruleBasicTerms ) ) otherlv_7= ')' otherlv_8= '}' otherlv_9= '|' otherlv_10= '<=' ( (lv_rhs_11_0= ruleBound ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1871:2: ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_terms_6_0= ruleBasicTerms ) ) otherlv_7= ')' otherlv_8= '}' otherlv_9= '|' otherlv_10= '<=' ( (lv_rhs_11_0= ruleBound ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1871:2: ( (lv_lhs_0_0= ruleBound ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1872:1: (lv_lhs_0_0= ruleBound )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1872:1: (lv_lhs_0_0= ruleBound )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1873:3: lv_lhs_0_0= ruleBound
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityConstraintAccess().getLhsBoundParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBound_in_ruleCardinalityConstraint4485);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleCardinalityConstraint4497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleCardinalityConstraint4509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleCardinalityConstraint4521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCardinalityConstraintAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1901:1: ( (lv_id_4_0= RULE_ID ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1902:1: (lv_id_4_0= RULE_ID )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1902:1: (lv_id_4_0= RULE_ID )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1903:3: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCardinalityConstraint4538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_4_0, grammarAccess.getCardinalityConstraintAccess().getIdIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCardinalityConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleCardinalityConstraint4555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCardinalityConstraintAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1923:1: ( (lv_terms_6_0= ruleBasicTerms ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1924:1: (lv_terms_6_0= ruleBasicTerms )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1924:1: (lv_terms_6_0= ruleBasicTerms )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1925:3: lv_terms_6_0= ruleBasicTerms
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityConstraintAccess().getTermsBasicTermsParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicTerms_in_ruleCardinalityConstraint4576);
            lv_terms_6_0=ruleBasicTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"terms",
                      		lv_terms_6_0, 
                      		"BasicTerms");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleCardinalityConstraint4588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCardinalityConstraintAccess().getRightParenthesisKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleCardinalityConstraint4600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCardinalityConstraintAccess().getRightCurlyBracketKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleCardinalityConstraint4612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_9());
                  
            }
            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleCardinalityConstraint4624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_10());
                  
            }
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1957:1: ( (lv_rhs_11_0= ruleBound ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1958:1: (lv_rhs_11_0= ruleBound )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1958:1: (lv_rhs_11_0= ruleBound )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1959:3: lv_rhs_11_0= ruleBound
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityConstraintAccess().getRhsBoundParserRuleCall_11_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBound_in_ruleCardinalityConstraint4645);
            lv_rhs_11_0=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_11_0, 
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1983:1: entryRuleBound returns [EObject current=null] : iv_ruleBound= ruleBound EOF ;
    public final EObject entryRuleBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1984:2: (iv_ruleBound= ruleBound EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1985:2: iv_ruleBound= ruleBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundRule()); 
            }
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound4681);
            iv_ruleBound=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound4691); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1992:1: ruleBound returns [EObject current=null] : ( (lv_av_0_0= ruleArithmeticTerm ) ) ;
    public final EObject ruleBound() throws RecognitionException {
        EObject current = null;

        EObject lv_av_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1995:28: ( ( (lv_av_0_0= ruleArithmeticTerm ) ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1996:1: ( (lv_av_0_0= ruleArithmeticTerm ) )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1996:1: ( (lv_av_0_0= ruleArithmeticTerm ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1997:1: (lv_av_0_0= ruleArithmeticTerm )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1997:1: (lv_av_0_0= ruleArithmeticTerm )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:1998:3: lv_av_0_0= ruleArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBoundAccess().getAvArithmeticTermParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithmeticTerm_in_ruleBound4736);
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2022:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2023:2: (iv_ruleRule= ruleRule EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2024:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule4771);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule4781); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2031:1: ruleRule returns [EObject current=null] : ( ( (lv_head_0_0= ruleHead ) ) (otherlv_1= 'if' ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_head_0_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2034:28: ( ( ( (lv_head_0_0= ruleHead ) ) (otherlv_1= 'if' ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2035:1: ( ( (lv_head_0_0= ruleHead ) ) (otherlv_1= 'if' ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2035:1: ( ( (lv_head_0_0= ruleHead ) ) (otherlv_1= 'if' ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2035:2: ( (lv_head_0_0= ruleHead ) ) (otherlv_1= 'if' ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.'
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2035:2: ( (lv_head_0_0= ruleHead ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2036:1: (lv_head_0_0= ruleHead )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2036:1: (lv_head_0_0= ruleHead )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2037:3: lv_head_0_0= ruleHead
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getHeadHeadParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHead_in_ruleRule4827);
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

            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2053:2: (otherlv_1= 'if' ( (lv_body_2_0= ruleSentence ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2053:4: otherlv_1= 'if' ( (lv_body_2_0= ruleSentence ) )
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleRule4840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getIfKeyword_1_0());
                          
                    }
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2057:1: ( (lv_body_2_0= ruleSentence ) )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2058:1: (lv_body_2_0= ruleSentence )
                    {
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2058:1: (lv_body_2_0= ruleSentence )
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2059:3: lv_body_2_0= ruleSentence
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleAccess().getBodySentenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSentence_in_ruleRule4861);
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleRule4875); if (state.failed) return current;
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2087:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2088:2: (iv_ruleHead= ruleHead EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2089:2: iv_ruleHead= ruleHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeadRule()); 
            }
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead4911);
            iv_ruleHead=ruleHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHead; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead4921); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2096:1: ruleHead returns [EObject current=null] : (this_MaybeLiteral_0= ruleMaybeLiteral | this_CardinalityConstraint_1= ruleCardinalityConstraint ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        EObject this_MaybeLiteral_0 = null;

        EObject this_CardinalityConstraint_1 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2099:28: ( (this_MaybeLiteral_0= ruleMaybeLiteral | this_CardinalityConstraint_1= ruleCardinalityConstraint ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2100:1: (this_MaybeLiteral_0= ruleMaybeLiteral | this_CardinalityConstraint_1= ruleCardinalityConstraint )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2100:1: (this_MaybeLiteral_0= ruleMaybeLiteral | this_CardinalityConstraint_1= ruleCardinalityConstraint )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)||LA24_0==18) ) {
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
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2101:2: this_MaybeLiteral_0= ruleMaybeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHeadAccess().getMaybeLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaybeLiteral_in_ruleHead4971);
                    this_MaybeLiteral_0=ruleMaybeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MaybeLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2114:2: this_CardinalityConstraint_1= ruleCardinalityConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHeadAccess().getCardinalityConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCardinalityConstraint_in_ruleHead5001);
                    this_CardinalityConstraint_1=ruleCardinalityConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CardinalityConstraint_1; 
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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2133:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2134:2: (iv_ruleStatement= ruleStatement EOF )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2135:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement5036);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement5046); if (state.failed) return current;

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
    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2142:1: ruleStatement returns [EObject current=null] : (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Rule_0 = null;

        EObject this_TypeDeclaration_1 = null;

        EObject this_ConstantDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2145:28: ( (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration ) )
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2146:1: (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration )
            {
            // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2146:1: (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 18:
            case 38:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                int LA25_2 = input.LA(2);

                if ( ((LA25_2>=13 && LA25_2<=17)||LA25_2==33) ) {
                    alt25=1;
                }
                else if ( (LA25_2==21) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LID:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2147:2: this_Rule_0= ruleRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getRuleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRule_in_ruleStatement5096);
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
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2160:2: this_TypeDeclaration_1= ruleTypeDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTypeDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDeclaration_in_ruleStatement5126);
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
                    // ../net.certware.argument.language/src-gen/net/certware/argument/language/parser/antlr/internal/InternalL.g:2173:2: this_ConstantDeclaration_2= ruleConstantDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getConstantDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantDeclaration_in_ruleStatement5156);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProgram136 = new BitSet(new long[]{0x00000040000400E2L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypedVariable472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTypedVariable498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_entryRuleArithmeticTerm534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticTerm544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleArithmeticTerm593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition687 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_ruleAddition712 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_14_in_ruleAddition730 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition752 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultiplication850 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_15_in_ruleMultiplication875 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_16_in_ruleMultiplication893 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_17_in_ruleMultiplication911 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultiplication933 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticLiteral_in_rulePrimary1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimary1049 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleAddition_in_rulePrimary1074 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrimary1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticLiteral_in_entryRuleArithmeticLiteral1122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticLiteral1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArithmeticLiteral1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArithmeticLiteral1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalTerm_in_entryRuleFunctionalTerm1243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionalTerm1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionalTerm1289 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionalTerm1300 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_ruleFunctionalTerm1325 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionalTerm1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_entryRuleBasicTerms1372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicTerms1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleBasicTerms1428 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleBasicTerms1441 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleBasicTerms1462 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDeclaration1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LID_in_ruleConstantDeclaration1552 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstantDeclaration1569 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_ruleConstantDeclaration1590 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleConstantDeclaration1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDeclaration1690 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTypeDeclaration1707 = new BitSet(new long[]{0x000000000E040000L});
    public static final BitSet FOLLOW_ruleSetExpression_in_ruleTypeDeclaration1728 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTypeDeclaration1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimit_in_entryRuleLimit1776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimit1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_ruleLimit1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExpression_in_entryRuleSetExpression1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetExpression1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAddition_in_ruleSetExpression1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTVars_in_entryRuleTVars1965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTVars1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTVar_in_ruleTVars2021 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTVars2034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTVar_in_ruleTVars2055 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleTVar_in_entryRuleTVar2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTVar2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTVar2153 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTVar2164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTVar2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAddition_in_entryRuleSetAddition2210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetAddition2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetMultiplication_in_ruleSetAddition2270 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleSetAddition2294 = new BitSet(new long[]{0x000000000E040000L});
    public static final BitSet FOLLOW_ruleSetMultiplication_in_ruleSetAddition2315 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleSetMultiplication_in_entryRuleSetMultiplication2353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetMultiplication2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPrimary_in_ruleSetMultiplication2413 = new BitSet(new long[]{0x0000000001008002L});
    public static final BitSet FOLLOW_15_in_ruleSetMultiplication2438 = new BitSet(new long[]{0x000000000E040000L});
    public static final BitSet FOLLOW_24_in_ruleSetMultiplication2456 = new BitSet(new long[]{0x000000000E040000L});
    public static final BitSet FOLLOW_ruleSetPrimary_in_ruleSetMultiplication2478 = new BitSet(new long[]{0x0000000001008002L});
    public static final BitSet FOLLOW_ruleSetPrimary_in_entryRuleSetPrimary2516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetPrimary2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleSetPrimary2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSetPrimary2594 = new BitSet(new long[]{0x000000000E040000L});
    public static final BitSet FOLLOW_ruleSetAddition_in_ruleSetPrimary2619 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSetPrimary2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral2667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSetLiteral2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSetLiteral2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSetLiteral2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedTerm_in_entryRuleQuantifiedTerm2830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedTerm2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_ruleQuantifiedTerm2884 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuantifiedTerm2894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleQuantifiedTerm2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQuantifier3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleQuantifier3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtom_in_entryRulePredicateAtom3066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAtom3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePredicateAtom3118 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_rulePredicateAtom3136 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_rulePredicateAtom3157 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePredicateAtom3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInAtom_in_entryRuleBuiltInAtom3207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInAtom3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleBuiltInAtom3263 = new BitSet(new long[]{0x00000007C0200000L});
    public static final BitSet FOLLOW_ruleAtomOp_in_ruleBuiltInAtom3284 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleBasicTerm_in_ruleBuiltInAtom3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomOp_in_entryRuleAtomOp3342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomOp3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAtomOp3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAtomOp3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAtomOp3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAtomOp3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAtomOp3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAtomOp3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence3526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrSentence_in_ruleSentence3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrSentence_in_entryRuleOrSentence3619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrSentence3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndSentence_in_ruleOrSentence3679 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleOrSentence3703 = new BitSet(new long[]{0x0000002000040020L});
    public static final BitSet FOLLOW_ruleAndSentence_in_ruleOrSentence3724 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleAndSentence_in_entryRuleAndSentence3762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndSentence3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotSentence_in_ruleAndSentence3822 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleAndSentence3846 = new BitSet(new long[]{0x0000002000040020L});
    public static final BitSet FOLLOW_ruleNotSentence_in_ruleAndSentence3867 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleNotSentence_in_entryRuleNotSentence3905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotSentence3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimarySentence_in_ruleNotSentence3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNotSentence3983 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rulePrimarySentence_in_ruleNotSentence4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimarySentence_in_entryRulePrimarySentence4044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimarySentence4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceLiteral_in_rulePrimarySentence4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimarySentence4122 = new BitSet(new long[]{0x0000002000040020L});
    public static final BitSet FOLLOW_ruleOrSentence_in_rulePrimarySentence4147 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrimarySentence4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceLiteral_in_entryRuleSentenceLiteral4195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceLiteral4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtom_in_ruleSentenceLiteral4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaybeLiteral_in_entryRuleMaybeLiteral4288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaybeLiteral4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMaybeLiteral4335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMaybeLiteral4346 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMaybeLiteral4357 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_ruleMaybeLiteral4382 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMaybeLiteral4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityConstraint_in_entryRuleCardinalityConstraint4429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinalityConstraint4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_ruleCardinalityConstraint4485 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCardinalityConstraint4497 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCardinalityConstraint4509 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCardinalityConstraint4521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCardinalityConstraint4538 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCardinalityConstraint4555 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleBasicTerms_in_ruleCardinalityConstraint4576 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCardinalityConstraint4588 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleCardinalityConstraint4600 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCardinalityConstraint4612 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCardinalityConstraint4624 = new BitSet(new long[]{0x0000004000040060L});
    public static final BitSet FOLLOW_ruleBound_in_ruleCardinalityConstraint4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound4681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticTerm_in_ruleBound4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule4771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_ruleRule4827 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_ruleRule4840 = new BitSet(new long[]{0x0000002000040020L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleRule4861 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRule4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead4911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaybeLiteral_in_ruleHead4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityConstraint_in_ruleHead5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement5036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleStatement5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_ruleStatement5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_ruleStatement5156 = new BitSet(new long[]{0x0000000000000002L});

}