// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g 2010-01-20 19:12:52
 package com.nattyparse.date; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int DAY=12;
    public static final int EOF=-1;
    public static final int MONTH=11;
    public static final int DATE_TIME=4;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int QUOTE=20;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int AM_PM=7;
    public static final int T__90=90;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RELATIVE_DATE=5;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int DAY_OF_WEEK=13;
    public static final int EXPLICIT_DATE=6;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int EXPLICIT_TIME=8;
    public static final int TIME_FRAME=17;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int FORWARD=9;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int YEAR=15;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int WHITE_SPACE=19;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int TWO_DIGIT=16;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int QUOTED_STRING=21;
    public static final int DIGIT=18;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int INTEGER=14;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int BACKWARD=10;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;

    // delegates
    // delegators

    public DateLexer() {;} 
    public DateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:5:7: ( 'on' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:5:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:6:7: ( 'at' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:6:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:7:7: ( 'tom' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:7:9: 'tom'
            {
            match("tom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:8:7: ( 'm' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:8:9: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:9:7: ( 'or' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:9:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:10:7: ( 'r' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:10:9: 'r'
            {
            match('r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:11:7: ( 'ow' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:11:9: 'ow'
            {
            match("ow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:12:7: ( 'yesterday' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:12:9: 'yesterday'
            {
            match("yesterday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:13:7: ( 'the' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:13:9: 'the'
            {
            match("the"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:14:7: ( 'day after tomorrow' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:14:9: 'day after tomorrow'
            {
            match("day after tomorrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:15:7: ( 'day before yesterday' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:15:9: 'day before yesterday'
            {
            match("day before yesterday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:16:7: ( 'this' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:16:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:17:7: ( ',' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:18:7: ( 'of' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:18:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:19:7: ( ':' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:20:7: ( 'am' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:20:9: 'am'
            {
            match("am"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:21:7: ( 'a' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:21:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:22:7: ( 'pm' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:22:9: 'pm'
            {
            match("pm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:23:7: ( 'p' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:23:9: 'p'
            {
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:24:7: ( '-' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:24:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:25:7: ( '/' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:25:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:26:7: ( 'last' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:26:9: 'last'
            {
            match("last"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:27:7: ( 'next' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:27:9: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:28:7: ( 'first' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:28:9: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:29:7: ( '1st' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:29:9: '1st'
            {
            match("1st"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:30:7: ( 'second' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:30:9: 'second'
            {
            match("second"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:31:7: ( '2nd' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:31:9: '2nd'
            {
            match("2nd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:32:7: ( 'third' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:32:9: 'third'
            {
            match("third"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:33:7: ( '3rd' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:33:9: '3rd'
            {
            match("3rd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:34:7: ( 'fourth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:34:9: 'fourth'
            {
            match("fourth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:35:7: ( '4th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:35:9: '4th'
            {
            match("4th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:36:7: ( 'fifth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:36:9: 'fifth'
            {
            match("fifth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:37:7: ( '5th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:37:9: '5th'
            {
            match("5th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:38:7: ( 'sixth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:38:9: 'sixth'
            {
            match("sixth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:39:7: ( '6th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:39:9: '6th'
            {
            match("6th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:40:7: ( 'seventh' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:40:9: 'seventh'
            {
            match("seventh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:41:7: ( '7th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:41:9: '7th'
            {
            match("7th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:42:7: ( 'eighth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:42:9: 'eighth'
            {
            match("eighth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:43:7: ( '8th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:43:9: '8th'
            {
            match("8th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:44:7: ( 'ninth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:44:9: 'ninth'
            {
            match("ninth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:45:7: ( '9th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:45:9: '9th'
            {
            match("9th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:46:7: ( 'tenth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:46:9: 'tenth'
            {
            match("tenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:47:7: ( '10th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:47:9: '10th'
            {
            match("10th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:48:7: ( 'eleventh' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:48:9: 'eleventh'
            {
            match("eleventh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:49:7: ( '11th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:49:9: '11th'
            {
            match("11th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:50:7: ( 'twelfth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:50:9: 'twelfth'
            {
            match("twelfth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:51:7: ( '12th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:51:9: '12th'
            {
            match("12th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:52:7: ( 'thirteenth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:52:9: 'thirteenth'
            {
            match("thirteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:53:7: ( '13th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:53:9: '13th'
            {
            match("13th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:54:7: ( 'fourteenth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:54:9: 'fourteenth'
            {
            match("fourteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:55:7: ( '14th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:55:9: '14th'
            {
            match("14th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:56:7: ( 'fifteenth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:56:9: 'fifteenth'
            {
            match("fifteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:57:7: ( '15th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:57:9: '15th'
            {
            match("15th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:58:7: ( 'sixteenth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:58:9: 'sixteenth'
            {
            match("sixteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:59:7: ( '16th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:59:9: '16th'
            {
            match("16th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:60:7: ( 'seventeenth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:60:9: 'seventeenth'
            {
            match("seventeenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:61:7: ( '17th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:61:9: '17th'
            {
            match("17th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:62:7: ( 'eighteenth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:62:9: 'eighteenth'
            {
            match("eighteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:63:7: ( '18th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:63:9: '18th'
            {
            match("18th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:64:7: ( 'nineteenth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:64:9: 'nineteenth'
            {
            match("nineteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:65:7: ( '19th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:65:9: '19th'
            {
            match("19th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:66:7: ( 'twentieth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:66:9: 'twentieth'
            {
            match("twentieth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:67:7: ( '20th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:67:9: '20th'
            {
            match("20th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:68:7: ( 'twenty' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:68:9: 'twenty'
            {
            match("twenty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:69:7: ( '21st' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:69:9: '21st'
            {
            match("21st"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:70:7: ( '22nd' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:70:9: '22nd'
            {
            match("22nd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:71:7: ( '23rd' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:71:9: '23rd'
            {
            match("23rd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:72:7: ( '24th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:72:9: '24th'
            {
            match("24th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:73:7: ( '25th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:73:9: '25th'
            {
            match("25th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:74:7: ( '26th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:74:9: '26th'
            {
            match("26th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:75:7: ( '27th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:75:9: '27th'
            {
            match("27th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:76:7: ( '28th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:76:9: '28th'
            {
            match("28th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:77:7: ( '29th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:77:9: '29th'
            {
            match("29th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:78:7: ( 'thirtieth' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:78:9: 'thirtieth'
            {
            match("thirtieth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:79:7: ( '30th' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:79:9: '30th'
            {
            match("30th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:80:7: ( 'thirty' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:80:9: 'thirty'
            {
            match("thirty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:81:7: ( '31st' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:81:9: '31st'
            {
            match("31st"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:82:7: ( 'january' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:82:9: 'january'
            {
            match("january"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:83:8: ( 'jan' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:83:10: 'jan'
            {
            match("jan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:84:8: ( 'february' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:84:10: 'february'
            {
            match("february"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:85:8: ( 'feb' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:85:10: 'feb'
            {
            match("feb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:86:8: ( 'march' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:86:10: 'march'
            {
            match("march"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:87:8: ( 'mar' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:87:10: 'mar'
            {
            match("mar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:88:8: ( 'april' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:88:10: 'april'
            {
            match("april"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:89:8: ( 'apr' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:89:10: 'apr'
            {
            match("apr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:90:8: ( 'may' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:90:10: 'may'
            {
            match("may"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:91:8: ( 'june' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:91:10: 'june'
            {
            match("june"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:92:8: ( 'jun' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:92:10: 'jun'
            {
            match("jun"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:93:8: ( 'july' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:93:10: 'july'
            {
            match("july"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:94:8: ( 'jul' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:94:10: 'jul'
            {
            match("jul"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:95:8: ( 'august' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:95:10: 'august'
            {
            match("august"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:96:8: ( 'aug' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:96:10: 'aug'
            {
            match("aug"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:97:8: ( 'september' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:97:10: 'september'
            {
            match("september"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:98:8: ( 'sep' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:98:10: 'sep'
            {
            match("sep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:99:8: ( 'october' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:99:10: 'october'
            {
            match("october"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:100:8: ( 'oct' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:100:10: 'oct'
            {
            match("oct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:101:8: ( 'november' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:101:10: 'november'
            {
            match("november"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:102:8: ( 'nov' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:102:10: 'nov'
            {
            match("nov"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:103:8: ( 'december' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:103:10: 'december'
            {
            match("december"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:104:8: ( 'dec' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:104:10: 'dec'
            {
            match("dec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:105:8: ( 'monday' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:105:10: 'monday'
            {
            match("monday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:106:8: ( 'mon' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:106:10: 'mon'
            {
            match("mon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:107:8: ( 'tuesday' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:107:10: 'tuesday'
            {
            match("tuesday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:108:8: ( 'tue' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:108:10: 'tue'
            {
            match("tue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:109:8: ( 'tues' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:109:10: 'tues'
            {
            match("tues"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:110:8: ( 'wednesday' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:110:10: 'wednesday'
            {
            match("wednesday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:111:8: ( 'wed' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:111:10: 'wed'
            {
            match("wed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:112:8: ( 'thursday' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:112:10: 'thursday'
            {
            match("thursday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:113:8: ( 'thur' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:113:10: 'thur'
            {
            match("thur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:114:8: ( 'thurs' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:114:10: 'thurs'
            {
            match("thurs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:115:8: ( 'friday' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:115:10: 'friday'
            {
            match("friday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:116:8: ( 'fri' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:116:10: 'fri'
            {
            match("fri"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:117:8: ( 'saturday' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:117:10: 'saturday'
            {
            match("saturday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:118:8: ( 'sat' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:118:10: 'sat'
            {
            match("sat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:119:8: ( 'sunday' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:119:10: 'sunday'
            {
            match("sunday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:120:8: ( 'sun' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:120:10: 'sun'
            {
            match("sun"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "TIME_FRAME"
    public final void mTIME_FRAME() throws RecognitionException {
        try {
            int _type = TIME_FRAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:217:3: ( 'week' | 'month' | 'year' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'w':
                {
                alt1=1;
                }
                break;
            case 'm':
                {
                alt1=2;
                }
                break;
            case 'y':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:217:5: 'week'
                    {
                    match("week"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:218:5: 'month'
                    {
                    match("month"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:219:5: 'year'
                    {
                    match("year"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME_FRAME"

    // $ANTLR start "TWO_DIGIT"
    public final void mTWO_DIGIT() throws RecognitionException {
        try {
            int _type = TWO_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:223:3: ( ( '0' )? DIGIT | '1' .. '9' DIGIT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>='0' && LA3_2<='9')) ) {
                    alt3=2;
                }
                else {
                    alt3=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:223:5: ( '0' )? DIGIT
                    {
                    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:223:5: ( '0' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='0') ) {
                        int LA2_1 = input.LA(2);

                        if ( ((LA2_1>='0' && LA2_1<='9')) ) {
                            alt2=1;
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:223:5: '0'
                            {
                            match('0'); 

                            }
                            break;

                    }

                    mDIGIT(); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:224:5: '1' .. '9' DIGIT
                    {
                    matchRange('1','9'); 
                    mDIGIT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWO_DIGIT"

    // $ANTLR start "YEAR"
    public final void mYEAR() throws RecognitionException {
        try {
            int _type = YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:228:3: ( '1' .. '2' DIGIT DIGIT DIGIT | DIGIT DIGIT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='1' && LA4_0<='2')) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>='0' && LA4_1<='9')) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>='0' && LA4_3<='9')) ) {
                        alt4=1;
                    }
                    else {
                        alt4=2;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0=='0'||(LA4_0>='3' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:228:5: '1' .. '2' DIGIT DIGIT DIGIT
                    {
                    matchRange('1','2'); 
                    mDIGIT(); 
                    mDIGIT(); 
                    mDIGIT(); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:229:5: DIGIT DIGIT
                    {
                    mDIGIT(); 
                    mDIGIT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YEAR"

    // $ANTLR start "WHITE_SPACE"
    public final void mWHITE_SPACE() throws RecognitionException {
        try {
            int _type = WHITE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:233:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:233:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:233:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITE_SPACE"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:237:3: ( QUOTE (~ ( QUOTE | '\\n' | '\\r' ) )* QUOTE )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:237:5: QUOTE (~ ( QUOTE | '\\n' | '\\r' ) )* QUOTE
            {
            mQUOTE(); 
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:237:11: (~ ( QUOTE | '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:237:12: ~ ( QUOTE | '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            mQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:241:3: ( '\"' | '\\'' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:245:3: ( '0' .. '9' )
            // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:245:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | TIME_FRAME | TWO_DIGIT | YEAR | WHITE_SPACE | QUOTED_STRING )
        int alt7=121;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:70: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:76: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:82: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:88: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:94: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:100: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:106: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:112: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:118: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:124: T__41
                {
                mT__41(); 

                }
                break;
            case 21 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:130: T__42
                {
                mT__42(); 

                }
                break;
            case 22 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:136: T__43
                {
                mT__43(); 

                }
                break;
            case 23 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:142: T__44
                {
                mT__44(); 

                }
                break;
            case 24 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:148: T__45
                {
                mT__45(); 

                }
                break;
            case 25 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:154: T__46
                {
                mT__46(); 

                }
                break;
            case 26 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:160: T__47
                {
                mT__47(); 

                }
                break;
            case 27 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:166: T__48
                {
                mT__48(); 

                }
                break;
            case 28 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:172: T__49
                {
                mT__49(); 

                }
                break;
            case 29 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:178: T__50
                {
                mT__50(); 

                }
                break;
            case 30 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:184: T__51
                {
                mT__51(); 

                }
                break;
            case 31 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:190: T__52
                {
                mT__52(); 

                }
                break;
            case 32 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:196: T__53
                {
                mT__53(); 

                }
                break;
            case 33 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:202: T__54
                {
                mT__54(); 

                }
                break;
            case 34 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:208: T__55
                {
                mT__55(); 

                }
                break;
            case 35 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:214: T__56
                {
                mT__56(); 

                }
                break;
            case 36 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:220: T__57
                {
                mT__57(); 

                }
                break;
            case 37 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:226: T__58
                {
                mT__58(); 

                }
                break;
            case 38 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:232: T__59
                {
                mT__59(); 

                }
                break;
            case 39 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:238: T__60
                {
                mT__60(); 

                }
                break;
            case 40 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:244: T__61
                {
                mT__61(); 

                }
                break;
            case 41 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:250: T__62
                {
                mT__62(); 

                }
                break;
            case 42 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:256: T__63
                {
                mT__63(); 

                }
                break;
            case 43 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:262: T__64
                {
                mT__64(); 

                }
                break;
            case 44 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:268: T__65
                {
                mT__65(); 

                }
                break;
            case 45 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:274: T__66
                {
                mT__66(); 

                }
                break;
            case 46 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:280: T__67
                {
                mT__67(); 

                }
                break;
            case 47 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:286: T__68
                {
                mT__68(); 

                }
                break;
            case 48 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:292: T__69
                {
                mT__69(); 

                }
                break;
            case 49 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:298: T__70
                {
                mT__70(); 

                }
                break;
            case 50 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:304: T__71
                {
                mT__71(); 

                }
                break;
            case 51 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:310: T__72
                {
                mT__72(); 

                }
                break;
            case 52 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:316: T__73
                {
                mT__73(); 

                }
                break;
            case 53 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:322: T__74
                {
                mT__74(); 

                }
                break;
            case 54 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:328: T__75
                {
                mT__75(); 

                }
                break;
            case 55 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:334: T__76
                {
                mT__76(); 

                }
                break;
            case 56 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:340: T__77
                {
                mT__77(); 

                }
                break;
            case 57 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:346: T__78
                {
                mT__78(); 

                }
                break;
            case 58 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:352: T__79
                {
                mT__79(); 

                }
                break;
            case 59 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:358: T__80
                {
                mT__80(); 

                }
                break;
            case 60 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:364: T__81
                {
                mT__81(); 

                }
                break;
            case 61 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:370: T__82
                {
                mT__82(); 

                }
                break;
            case 62 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:376: T__83
                {
                mT__83(); 

                }
                break;
            case 63 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:382: T__84
                {
                mT__84(); 

                }
                break;
            case 64 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:388: T__85
                {
                mT__85(); 

                }
                break;
            case 65 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:394: T__86
                {
                mT__86(); 

                }
                break;
            case 66 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:400: T__87
                {
                mT__87(); 

                }
                break;
            case 67 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:406: T__88
                {
                mT__88(); 

                }
                break;
            case 68 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:412: T__89
                {
                mT__89(); 

                }
                break;
            case 69 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:418: T__90
                {
                mT__90(); 

                }
                break;
            case 70 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:424: T__91
                {
                mT__91(); 

                }
                break;
            case 71 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:430: T__92
                {
                mT__92(); 

                }
                break;
            case 72 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:436: T__93
                {
                mT__93(); 

                }
                break;
            case 73 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:442: T__94
                {
                mT__94(); 

                }
                break;
            case 74 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:448: T__95
                {
                mT__95(); 

                }
                break;
            case 75 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:454: T__96
                {
                mT__96(); 

                }
                break;
            case 76 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:460: T__97
                {
                mT__97(); 

                }
                break;
            case 77 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:466: T__98
                {
                mT__98(); 

                }
                break;
            case 78 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:472: T__99
                {
                mT__99(); 

                }
                break;
            case 79 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:478: T__100
                {
                mT__100(); 

                }
                break;
            case 80 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:485: T__101
                {
                mT__101(); 

                }
                break;
            case 81 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:492: T__102
                {
                mT__102(); 

                }
                break;
            case 82 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:499: T__103
                {
                mT__103(); 

                }
                break;
            case 83 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:506: T__104
                {
                mT__104(); 

                }
                break;
            case 84 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:513: T__105
                {
                mT__105(); 

                }
                break;
            case 85 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:520: T__106
                {
                mT__106(); 

                }
                break;
            case 86 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:527: T__107
                {
                mT__107(); 

                }
                break;
            case 87 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:534: T__108
                {
                mT__108(); 

                }
                break;
            case 88 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:541: T__109
                {
                mT__109(); 

                }
                break;
            case 89 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:548: T__110
                {
                mT__110(); 

                }
                break;
            case 90 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:555: T__111
                {
                mT__111(); 

                }
                break;
            case 91 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:562: T__112
                {
                mT__112(); 

                }
                break;
            case 92 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:569: T__113
                {
                mT__113(); 

                }
                break;
            case 93 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:576: T__114
                {
                mT__114(); 

                }
                break;
            case 94 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:583: T__115
                {
                mT__115(); 

                }
                break;
            case 95 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:590: T__116
                {
                mT__116(); 

                }
                break;
            case 96 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:597: T__117
                {
                mT__117(); 

                }
                break;
            case 97 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:604: T__118
                {
                mT__118(); 

                }
                break;
            case 98 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:611: T__119
                {
                mT__119(); 

                }
                break;
            case 99 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:618: T__120
                {
                mT__120(); 

                }
                break;
            case 100 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:625: T__121
                {
                mT__121(); 

                }
                break;
            case 101 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:632: T__122
                {
                mT__122(); 

                }
                break;
            case 102 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:639: T__123
                {
                mT__123(); 

                }
                break;
            case 103 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:646: T__124
                {
                mT__124(); 

                }
                break;
            case 104 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:653: T__125
                {
                mT__125(); 

                }
                break;
            case 105 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:660: T__126
                {
                mT__126(); 

                }
                break;
            case 106 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:667: T__127
                {
                mT__127(); 

                }
                break;
            case 107 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:674: T__128
                {
                mT__128(); 

                }
                break;
            case 108 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:681: T__129
                {
                mT__129(); 

                }
                break;
            case 109 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:688: T__130
                {
                mT__130(); 

                }
                break;
            case 110 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:695: T__131
                {
                mT__131(); 

                }
                break;
            case 111 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:702: T__132
                {
                mT__132(); 

                }
                break;
            case 112 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:709: T__133
                {
                mT__133(); 

                }
                break;
            case 113 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:716: T__134
                {
                mT__134(); 

                }
                break;
            case 114 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:723: T__135
                {
                mT__135(); 

                }
                break;
            case 115 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:730: T__136
                {
                mT__136(); 

                }
                break;
            case 116 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:737: T__137
                {
                mT__137(); 

                }
                break;
            case 117 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:744: TIME_FRAME
                {
                mTIME_FRAME(); 

                }
                break;
            case 118 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:755: TWO_DIGIT
                {
                mTWO_DIGIT(); 

                }
                break;
            case 119 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:765: YEAR
                {
                mYEAR(); 

                }
                break;
            case 120 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:770: WHITE_SPACE
                {
                mWHITE_SPACE(); 

                }
                break;
            case 121 :
                // /Users/joe/java_workspace/natty/bin/main/antlr3/grammar/com/nattyparse/date/Date.g:1:782: QUOTED_STRING
                {
                mQUOTED_STRING(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\2\uffff\1\51\1\uffff\1\61\5\uffff\1\66\5\uffff\1\111\1\uffff\6"+
        "\111\1\uffff\2\111\2\uffff\1\111\41\uffff\12\111\6\uffff\12\111"+
        "\1\uffff\2\111\15\uffff\1\u00a2\1\u00a4\1\u00a6\4\uffff\1\u00ad"+
        "\1\u00af\1\uffff\1\u00b1\3\uffff\1\u00b4\1\uffff\1\u00b8\3\uffff"+
        "\1\u00bc\1\u00be\15\uffff\1\u00c1\1\uffff\1\u00c4\1\u00c6\15\uffff"+
        "\1\u00c9\1\u00cb\1\u00cd\1\u00cf\10\uffff\1\u00d3\2\uffff\1\u00d6"+
        "\45\uffff\1\u00e4\33\uffff";
    static final String DFA7_eofS =
        "\u00ee\uffff";
    static final String DFA7_minS =
        "\1\11\1\143\1\155\1\145\1\141\1\uffff\1\145\1\141\2\uffff\1\155"+
        "\3\uffff\2\145\1\60\1\141\6\60\1\151\2\60\1\141\1\145\1\60\6\uffff"+
        "\1\164\2\uffff\1\162\1\147\2\uffff\1\145\1\uffff\2\145\1\162\1\156"+
        "\1\uffff\1\141\1\171\1\143\3\uffff\1\156\1\166\1\146\1\165\1\142"+
        "\1\151\1\uffff\12\60\1\uffff\1\143\1\170\1\164\1\156\1\uffff\12"+
        "\60\1\uffff\1\164\1\163\5\uffff\1\147\3\uffff\1\156\1\154\1\144"+
        "\1\uffff\1\157\1\151\1\165\1\uffff\2\162\1\154\1\163\1\143\1\uffff"+
        "\1\144\2\uffff\1\40\3\145\1\uffff\1\164\2\162\1\144\14\uffff\1\145"+
        "\2\164\1\165\1\144\14\uffff\1\150\1\165\1\145\1\171\1\156\7\uffff"+
        "\1\144\1\163\1\uffff\1\164\1\144\5\uffff\1\141\6\uffff\1\145\1\164"+
        "\4\uffff\1\156\2\uffff\1\145\4\uffff\1\164\11\uffff\1\145\1\144"+
        "\1\uffff\1\151\6\uffff\1\145\1\164\2\uffff\1\145\11\uffff\1\145"+
        "\4\uffff";
    static final String DFA7_maxS =
        "\1\171\1\167\1\165\1\167\1\157\1\uffff\2\145\2\uffff\1\155\3\uffff"+
        "\1\157\1\162\1\163\1\165\1\156\1\162\4\164\1\154\2\164\1\165\1\145"+
        "\1\71\6\uffff\1\164\2\uffff\1\162\1\147\2\uffff\1\165\1\uffff\2"+
        "\145\1\171\1\156\1\uffff\1\163\1\171\1\143\3\uffff\1\156\1\166\1"+
        "\162\1\165\1\142\1\151\1\uffff\12\164\1\uffff\1\166\1\170\1\164"+
        "\1\156\1\uffff\1\164\1\163\1\156\1\162\6\164\1\uffff\1\164\1\163"+
        "\5\uffff\1\147\3\uffff\2\156\1\145\1\uffff\1\157\1\151\1\165\1\uffff"+
        "\1\163\1\162\1\156\1\163\1\143\1\uffff\1\164\2\uffff\1\40\1\145"+
        "\1\164\1\145\1\uffff\1\164\2\162\1\144\14\uffff\1\145\2\164\1\165"+
        "\1\144\14\uffff\1\150\1\165\1\145\1\171\1\156\7\uffff\1\164\1\163"+
        "\1\uffff\1\164\1\144\5\uffff\1\142\6\uffff\1\150\1\164\4\uffff\1"+
        "\156\2\uffff\1\150\4\uffff\1\164\11\uffff\1\171\1\144\1\uffff\1"+
        "\171\6\uffff\1\150\1\164\2\uffff\1\150\11\uffff\1\150\4\uffff";
    static final String DFA7_acceptS =
        "\5\uffff\1\6\2\uffff\1\15\1\17\1\uffff\1\24\1\25\1\26\20\uffff\1"+
        "\170\1\171\1\1\1\5\1\7\1\16\1\uffff\1\2\1\20\2\uffff\1\21\1\3\1"+
        "\uffff\1\52\4\uffff\1\4\3\uffff\1\22\1\23\1\27\6\uffff\1\31\12\uffff"+
        "\1\166\4\uffff\1\33\12\uffff\1\35\2\uffff\1\166\1\37\1\41\1\43\1"+
        "\45\1\uffff\1\54\1\47\1\51\3\uffff\1\166\3\uffff\1\11\5\uffff\1"+
        "\126\1\uffff\1\10\1\165\4\uffff\1\30\4\uffff\1\53\1\167\1\55\1\57"+
        "\1\61\1\63\1\65\1\67\1\71\1\73\1\75\1\32\5\uffff\1\77\1\101\1\102"+
        "\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\113\1\115\5\uffff\1"+
        "\137\1\140\1\124\1\125\1\133\1\134\1\14\2\uffff\1\56\2\uffff\1\150"+
        "\1\122\1\123\1\145\1\146\1\uffff\1\143\1\144\1\50\1\74\1\141\1\142"+
        "\2\uffff\1\120\1\121\1\157\1\160\1\uffff\1\135\1\136\1\uffff\1\161"+
        "\1\162\1\163\1\164\1\uffff\1\116\1\117\1\127\1\130\1\131\1\132\1"+
        "\152\1\153\1\34\2\uffff\1\155\1\uffff\1\147\1\151\1\12\1\13\1\40"+
        "\1\64\2\uffff\1\42\1\66\1\uffff\1\60\1\112\1\114\1\154\1\156\1\76"+
        "\1\100\1\36\1\62\1\uffff\1\46\1\72\1\44\1\70";
    static final String DFA7_specialS =
        "\u00ee\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\uffff\1\37\4\uffff\1\37\4"+
            "\uffff\1\10\1\13\1\uffff\1\14\1\35\1\20\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\31\1\32\1\11\46\uffff\1\2\2\uffff\1\7\1\30\1\17"+
            "\3\uffff\1\33\1\uffff\1\15\1\4\1\16\1\1\1\12\1\uffff\1\5\1\21"+
            "\1\3\2\uffff\1\34\1\uffff\1\6",
            "\1\44\2\uffff\1\43\7\uffff\1\40\3\uffff\1\41\4\uffff\1\42",
            "\1\46\2\uffff\1\47\3\uffff\1\45\1\50",
            "\1\54\2\uffff\1\53\6\uffff\1\52\5\uffff\1\56\1\uffff\1\55",
            "\1\57\15\uffff\1\60",
            "",
            "\1\62",
            "\1\63\3\uffff\1\64",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "\1\67\3\uffff\1\70\5\uffff\1\71",
            "\1\74\3\uffff\1\72\5\uffff\1\73\2\uffff\1\75",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
            "\71\uffff\1\76",
            "\1\114\3\uffff\1\112\3\uffff\1\113\13\uffff\1\115",
            "\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130"+
            "\64\uffff\1\116",
            "\1\132\1\133\10\134\70\uffff\1\131",
            "\12\134\72\uffff\1\135",
            "\12\134\72\uffff\1\136",
            "\12\134\72\uffff\1\137",
            "\12\134\72\uffff\1\140",
            "\1\141\2\uffff\1\142",
            "\12\134\72\uffff\1\143",
            "\12\134\72\uffff\1\144",
            "\1\145\23\uffff\1\146",
            "\1\147",
            "\12\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "",
            "",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154\3\uffff\1\155\13\uffff\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161\6\uffff\1\162",
            "\1\163",
            "",
            "\1\165\21\uffff\1\164",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\173\13\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\12\u0080\72\uffff\1\177",
            "\12\u0080\72\uffff\1\u0081",
            "\12\u0080\72\uffff\1\u0082",
            "\12\u0080\72\uffff\1\u0083",
            "\12\u0080\72\uffff\1\u0084",
            "\12\u0080\72\uffff\1\u0085",
            "\12\u0080\72\uffff\1\u0086",
            "\12\u0080\72\uffff\1\u0087",
            "\12\u0080\72\uffff\1\u0088",
            "\12\u0080\72\uffff\1\u0089",
            "",
            "\1\u008a\14\uffff\1\u008c\5\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\12\u0080\72\uffff\1\u0090",
            "\12\u0080\71\uffff\1\u0091",
            "\12\u0080\64\uffff\1\u0092",
            "\12\u0080\70\uffff\1\u0093",
            "\12\u0080\72\uffff\1\u0094",
            "\12\u0080\72\uffff\1\u0095",
            "\12\u0080\72\uffff\1\u0096",
            "\12\u0080\72\uffff\1\u0097",
            "\12\u0080\72\uffff\1\u0098",
            "\12\u0080\72\uffff\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "",
            "",
            "",
            "\1\u009d",
            "\1\u009f\1\uffff\1\u009e",
            "\1\u00a0\1\165",
            "",
            "\1\u00a1",
            "\1\u00a3",
            "\1\u00a5",
            "",
            "\1\u00a8\1\u00a7",
            "\1\u00a9",
            "\1\u00aa\1\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ae",
            "",
            "\1\u00b0\17\uffff\1\165",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b6\16\uffff\1\u00b5",
            "\1\u00b7",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00ca",
            "\1\u00cc",
            "\1\u00ce",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d0\17\uffff\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d7\1\u00d8",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00da\2\uffff\1\u00d9",
            "\1\u00db",
            "",
            "",
            "",
            "",
            "\1\u00dc",
            "",
            "",
            "\1\u00de\2\uffff\1\u00dd",
            "",
            "",
            "",
            "",
            "\1\u00df",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e0\3\uffff\1\u00e1\17\uffff\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e5\17\uffff\1\u00e6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e8\2\uffff\1\u00e7",
            "\1\u00e9",
            "",
            "",
            "\1\u00eb\2\uffff\1\u00ea",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ed\2\uffff\1\u00ec",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | TIME_FRAME | TWO_DIGIT | YEAR | WHITE_SPACE | QUOTED_STRING );";
        }
    }
 

}