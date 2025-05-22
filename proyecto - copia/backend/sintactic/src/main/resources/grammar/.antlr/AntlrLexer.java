// Generated from c:/Users/velas/Desktop/proyecto - copia/backend/sintactic/src/main/resources/grammar/Antlr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, LP=2, RP=3, PLUS=4, MINUS=5, MULT=6, DIV=7, POW=8, NUMBER=9, ID=10, 
		WS=11, COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQ", "LP", "RP", "PLUS", "MINUS", "MULT", "DIV", "POW", "NUMBER", "ID", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "LP", "RP", "PLUS", "MINUS", "MULT", "DIV", "POW", "NUMBER", 
			"ID", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Antlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\fP\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0004\b,\b\b\u000b\b\f\b-\u0001\b\u0001\b\u0004\b2\b\b\u000b"+
		"\b\f\b3\u0003\b6\b\b\u0001\t\u0001\t\u0005\t:\b\t\n\t\f\t=\t\t\u0001\n"+
		"\u0004\n@\b\n\u000b\n\f\nA\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000bJ\b\u000b\n\u000b\f\u000bM\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0001\u0000\u0005\u0001\u000009\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\rU\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000"+
		"\u0000\u0003\u001c\u0001\u0000\u0000\u0000\u0005\u001e\u0001\u0000\u0000"+
		"\u0000\u0007 \u0001\u0000\u0000\u0000\t\"\u0001\u0000\u0000\u0000\u000b"+
		"$\u0001\u0000\u0000\u0000\r&\u0001\u0000\u0000\u0000\u000f(\u0001\u0000"+
		"\u0000\u0000\u0011+\u0001\u0000\u0000\u0000\u00137\u0001\u0000\u0000\u0000"+
		"\u0015?\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005=\u0000\u0000\u001a\u001b\u0005=\u0000\u0000\u001b\u0002\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0005(\u0000\u0000\u001d\u0004\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005)\u0000\u0000\u001f\u0006\u0001\u0000\u0000\u0000"+
		" !\u0005+\u0000\u0000!\b\u0001\u0000\u0000\u0000\"#\u0005-\u0000\u0000"+
		"#\n\u0001\u0000\u0000\u0000$%\u0005*\u0000\u0000%\f\u0001\u0000\u0000"+
		"\u0000&\'\u0005/\u0000\u0000\'\u000e\u0001\u0000\u0000\u0000()\u0005^"+
		"\u0000\u0000)\u0010\u0001\u0000\u0000\u0000*,\u0007\u0000\u0000\u0000"+
		"+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.5\u0001\u0000\u0000\u0000/1\u0005.\u0000"+
		"\u000002\u0007\u0000\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001"+
		"\u0000\u0000\u00005/\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6\u0012\u0001\u0000\u0000\u00007;\u0007\u0001\u0000\u00008:\u0007\u0002"+
		"\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0014\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>@\u0007\u0003\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0006\n\u0000\u0000D\u0016"+
		"\u0001\u0000\u0000\u0000EF\u0005/\u0000\u0000FG\u0005/\u0000\u0000GK\u0001"+
		"\u0000\u0000\u0000HJ\b\u0004\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0006\u000b\u0000"+
		"\u0000O\u0018\u0001\u0000\u0000\u0000\u0007\u0000-35;AK\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}