package trabalho.antlr.dice.lexer;

// Generated from DiceNotationLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DiceNotationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DSEPARATOR=1, DIGIT=2, ADDOPERATOR=3, MULTOPERATOR=4, LPAREN=5, RPAREN=6, 
		WS=7, AUTH=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DSEPARATOR", "DIGIT", "ADDOPERATOR", "MULTOPERATOR", "ADD", "SUB", "MULT", 
			"DIV", "LPAREN", "RPAREN", "WS", "AUTH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'", null, "'YXV0aGVudGljYXRlZA=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DSEPARATOR", "DIGIT", "ADDOPERATOR", "MULTOPERATOR", "LPAREN", 
			"RPAREN", "WS", "AUTH"
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


	public DiceNotationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DiceNotationLexer.g4"; }

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
		"\u0004\u0000\bP\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001d\b\u0001"+
		"\u000b\u0001\f\u0001\u001e\u0001\u0002\u0001\u0002\u0003\u0002#\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\n6\b\n\u000b\n\f\n7\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b\u0000\r\u0000\u000f"+
		"\u0000\u0011\u0005\u0013\u0006\u0015\u0007\u0017\b\u0001\u0000\u0002\u0002"+
		"\u0000DDdd\u0002\u0000\t\n\r\rO\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003"+
		"\u001c\u0001\u0000\u0000\u0000\u0005\"\u0001\u0000\u0000\u0000\u0007&"+
		"\u0001\u0000\u0000\u0000\t(\u0001\u0000\u0000\u0000\u000b*\u0001\u0000"+
		"\u0000\u0000\r,\u0001\u0000\u0000\u0000\u000f.\u0001\u0000\u0000\u0000"+
		"\u00110\u0001\u0000\u0000\u0000\u00132\u0001\u0000\u0000\u0000\u00155"+
		"\u0001\u0000\u0000\u0000\u0017;\u0001\u0000\u0000\u0000\u0019\u001a\u0007"+
		"\u0000\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000\u001b\u001d\u0002"+
		"09\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f\u0004\u0001\u0000\u0000\u0000 #\u0003\t\u0004\u0000!#\u0003"+
		"\u000b\u0005\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000"+
		"#\u0006\u0001\u0000\u0000\u0000$\'\u0003\r\u0006\u0000%\'\u0003\u000f"+
		"\u0007\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\b\u0001"+
		"\u0000\u0000\u0000()\u0005+\u0000\u0000)\n\u0001\u0000\u0000\u0000*+\u0005"+
		"-\u0000\u0000+\f\u0001\u0000\u0000\u0000,-\u0005*\u0000\u0000-\u000e\u0001"+
		"\u0000\u0000\u0000./\u0005/\u0000\u0000/\u0010\u0001\u0000\u0000\u0000"+
		"01\u0005(\u0000\u00001\u0012\u0001\u0000\u0000\u000023\u0005)\u0000\u0000"+
		"3\u0014\u0001\u0000\u0000\u000046\u0007\u0001\u0000\u000054\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0006\n\u0000\u0000:\u0016"+
		"\u0001\u0000\u0000\u0000;<\u0005Y\u0000\u0000<=\u0005X\u0000\u0000=>\u0005"+
		"V\u0000\u0000>?\u00050\u0000\u0000?@\u0005a\u0000\u0000@A\u0005G\u0000"+
		"\u0000AB\u0005V\u0000\u0000BC\u0005u\u0000\u0000CD\u0005d\u0000\u0000"+
		"DE\u0005G\u0000\u0000EF\u0005l\u0000\u0000FG\u0005j\u0000\u0000GH\u0005"+
		"Y\u0000\u0000HI\u0005X\u0000\u0000IJ\u0005R\u0000\u0000JK\u0005l\u0000"+
		"\u0000KL\u0005Z\u0000\u0000LM\u0005A\u0000\u0000MN\u0005=\u0000\u0000"+
		"NO\u0005=\u0000\u0000O\u0018\u0001\u0000\u0000\u0000\u0005\u0000\u001e"+
		"\"&7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}