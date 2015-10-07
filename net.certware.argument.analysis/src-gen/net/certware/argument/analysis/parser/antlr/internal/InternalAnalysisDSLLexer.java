package net.certware.argument.analysis.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnalysisDSLLexer extends Lexer {
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

    public InternalAnalysisDSLLexer() {;} 
    public InternalAnalysisDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAnalysisDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:11:7: ( '-' )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:11:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:12:7: ( '(' )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:13:7: ( ')' )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:14:7: ( ',' )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:451:13: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:451:15: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:451:15: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:451:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:451:20: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:451:29: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:451:30: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_PREDICATE_NAME"
    public final void mRULE_PREDICATE_NAME() throws RecognitionException {
        try {
            int _type = RULE_PREDICATE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:453:21: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:453:23: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:453:32: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREDICATE_NAME"

    // $ANTLR start "RULE_CONSTANT_SYMBOL"
    public final void mRULE_CONSTANT_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_CONSTANT_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:455:22: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:455:24: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:455:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONSTANT_SYMBOL"

    // $ANTLR start "RULE_FUNCTIONAL_SYMBOL"
    public final void mRULE_FUNCTIONAL_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_FUNCTIONAL_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:457:24: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:457:26: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:457:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FUNCTIONAL_SYMBOL"

    // $ANTLR start "RULE_SATISFIABLE"
    public final void mRULE_SATISFIABLE() throws RecognitionException {
        try {
            int _type = RULE_SATISFIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:459:18: ( 'SATISFIABLE' )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:459:20: 'SATISFIABLE'
            {
            match("SATISFIABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SATISFIABLE"

    // $ANTLR start "RULE_UNSATISFIABLE"
    public final void mRULE_UNSATISFIABLE() throws RecognitionException {
        try {
            int _type = RULE_UNSATISFIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:461:20: ( 'UNSATISFIABLE' )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:461:22: 'UNSATISFIABLE'
            {
            match("UNSATISFIABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSATISFIABLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:463:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:463:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:463:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:463:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:463:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:465:10: ( ( '0' .. '9' )+ )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:465:12: ( '0' .. '9' )+
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:465:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:465:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:467:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:469:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:469:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:469:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:469:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:471:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:471:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:471:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:471:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:471:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:471:41: ( '\\r' )? '\\n'
                    {
                    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:471:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:471:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:473:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:473:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:473:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:475:16: ( . )
            // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:475:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:8: ( T__17 | T__18 | T__19 | T__20 | RULE_NUMBER | RULE_PREDICATE_NAME | RULE_CONSTANT_SYMBOL | RULE_FUNCTIONAL_SYMBOL | RULE_SATISFIABLE | RULE_UNSATISFIABLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=17;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:34: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 6 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:46: RULE_PREDICATE_NAME
                {
                mRULE_PREDICATE_NAME(); 

                }
                break;
            case 7 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:66: RULE_CONSTANT_SYMBOL
                {
                mRULE_CONSTANT_SYMBOL(); 

                }
                break;
            case 8 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:87: RULE_FUNCTIONAL_SYMBOL
                {
                mRULE_FUNCTIONAL_SYMBOL(); 

                }
                break;
            case 9 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:110: RULE_SATISFIABLE
                {
                mRULE_SATISFIABLE(); 

                }
                break;
            case 10 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:127: RULE_UNSATISFIABLE
                {
                mRULE_UNSATISFIABLE(); 

                }
                break;
            case 11 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:146: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:154: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:163: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:175: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:191: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:207: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // ../net.certware.argument.analysis/src-gen/net/certware/argument/analysis/parser/antlr/internal/InternalAnalysisDSL.g:1:215: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\5\uffff\2\25\1\31\2\33\1\20\1\uffff\3\20\10\uffff\1\25\1\31\1\uffff\1\33\1\uffff\1\33\4\uffff\20\33\1\63\1\33\1\uffff\1\33\1\66\1\uffff";
    static final String DFA17_eofS =
        "\67\uffff";
    static final String DFA17_minS =
        "\1\0\4\uffff\3\60\1\101\1\116\1\101\1\uffff\2\0\1\52\10\uffff\2\60\1\uffff\1\124\1\uffff\1\123\4\uffff\1\111\1\101\1\123\1\124\1\106\2\111\1\123\1\101\1\106\1\102\1\111\1\114\1\101\1\105\1\102\1\60\1\114\1\uffff\1\105\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\4\uffff\2\71\1\172\1\101\1\116\1\172\1\uffff\2\uffff\1\57\10\uffff\1\71\1\172\1\uffff\1\124\1\uffff\1\123\4\uffff\1\111\1\101\1\123\1\124\1\106\2\111\1\123\1\101\1\106\1\102\1\111\1\114\1\101\1\105\1\102\1\172\1\114\1\uffff\1\105\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\6\uffff\1\13\3\uffff\1\20\1\21\1\1\1\2\1\3\1\4\1\5\1\14\2\uffff\1\6\1\uffff\1\13\1\uffff\1\15\1\16\1\17\1\20\22\uffff\1\11\2\uffff\1\12";
    static final String DFA17_specialS =
        "\1\2\13\uffff\1\0\1\1\51\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\4\20\1\15\1\2\1\3\2\20\1\4\1\1\1\20\1\16\1\5\11\6\7\20\22\13\1\10\1\13\1\11\5\13\3\20\1\12\1\13\1\20\32\7\uff85\20",
            "",
            "",
            "",
            "",
            "\12\26",
            "\12\27",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\32",
            "\1\34",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\35",
            "\0\35",
            "\1\36\4\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\27",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\41",
            "",
            "\1\42",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\64",
            "",
            "\1\65",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | RULE_NUMBER | RULE_PREDICATE_NAME | RULE_CONSTANT_SYMBOL | RULE_FUNCTIONAL_SYMBOL | RULE_SATISFIABLE | RULE_UNSATISFIABLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_12 = input.LA(1);

                        s = -1;
                        if ( ((LA17_12>='\u0000' && LA17_12<='\uFFFF')) ) {s = 29;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_13 = input.LA(1);

                        s = -1;
                        if ( ((LA17_13>='\u0000' && LA17_13<='\uFFFF')) ) {s = 29;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='-') ) {s = 1;}

                        else if ( (LA17_0=='(') ) {s = 2;}

                        else if ( (LA17_0==')') ) {s = 3;}

                        else if ( (LA17_0==',') ) {s = 4;}

                        else if ( (LA17_0=='0') ) {s = 5;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 6;}

                        else if ( ((LA17_0>='a' && LA17_0<='z')) ) {s = 7;}

                        else if ( (LA17_0=='S') ) {s = 8;}

                        else if ( (LA17_0=='U') ) {s = 9;}

                        else if ( (LA17_0=='^') ) {s = 10;}

                        else if ( ((LA17_0>='A' && LA17_0<='R')||LA17_0=='T'||(LA17_0>='V' && LA17_0<='Z')||LA17_0=='_') ) {s = 11;}

                        else if ( (LA17_0=='\"') ) {s = 12;}

                        else if ( (LA17_0=='\'') ) {s = 13;}

                        else if ( (LA17_0=='/') ) {s = 14;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 15;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='*' && LA17_0<='+')||LA17_0=='.'||(LA17_0>=':' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}