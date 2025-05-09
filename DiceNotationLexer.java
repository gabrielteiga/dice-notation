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
		WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DSEPARATOR", "DIGIT", "ADDOPERATOR", "MULTOPERATOR", "ADD", "SUB", "MULT", 
			"DIV", "LPAREN", "RPAREN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DSEPARATOR", "DIGIT", "ADDOPERATOR", "MULTOPERATOR", "LPAREN", 
			"RPAREN", "WS"
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
		"\u0004\u0000\u00079\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001\u001b\b\u0001\u000b\u0001\f\u0001"+
		"\u001c\u0001\u0002\u0001\u0002\u0003\u0002!\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003%\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0004\n4\b\n\u000b\n\f\n5\u0001\n\u0001\n\u0000"+
		"\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b"+
		"\u0000\r\u0000\u000f\u0000\u0011\u0005\u0013\u0006\u0015\u0007\u0001\u0000"+
		"\u0002\u0002\u0000DDdd\u0002\u0000\t\n\r\r8\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u001a\u0001\u0000\u0000"+
		"\u0000\u0005 \u0001\u0000\u0000\u0000\u0007$\u0001\u0000\u0000\u0000\t"+
		"&\u0001\u0000\u0000\u0000\u000b(\u0001\u0000\u0000\u0000\r*\u0001\u0000"+
		"\u0000\u0000\u000f,\u0001\u0000\u0000\u0000\u0011.\u0001\u0000\u0000\u0000"+
		"\u00130\u0001\u0000\u0000\u0000\u00153\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0007\u0000\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001b"+
		"\u000209\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u0004\u0001\u0000\u0000\u0000\u001e!\u0003\t\u0004"+
		"\u0000\u001f!\u0003\u000b\u0005\u0000 \u001e\u0001\u0000\u0000\u0000 "+
		"\u001f\u0001\u0000\u0000\u0000!\u0006\u0001\u0000\u0000\u0000\"%\u0003"+
		"\r\u0006\u0000#%\u0003\u000f\u0007\u0000$\"\u0001\u0000\u0000\u0000$#"+
		"\u0001\u0000\u0000\u0000%\b\u0001\u0000\u0000\u0000&\'\u0005+\u0000\u0000"+
		"\'\n\u0001\u0000\u0000\u0000()\u0005-\u0000\u0000)\f\u0001\u0000\u0000"+
		"\u0000*+\u0005*\u0000\u0000+\u000e\u0001\u0000\u0000\u0000,-\u0005/\u0000"+
		"\u0000-\u0010\u0001\u0000\u0000\u0000./\u0005(\u0000\u0000/\u0012\u0001"+
		"\u0000\u0000\u000001\u0005)\u0000\u00001\u0014\u0001\u0000\u0000\u0000"+
		"24\u0007\u0001\u0000\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000078\u0006\n\u0000\u00008\u0016\u0001\u0000\u0000\u0000\u0005"+
		"\u0000\u001c $5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}