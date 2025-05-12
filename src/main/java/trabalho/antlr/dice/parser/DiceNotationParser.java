package trabalho.antlr.dice.parser;

// Generated from DiceNotationParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import trabalho.antlr.dice.parser.listener.DiceNotationParserListener;
import trabalho.antlr.dice.parser.visitor.DiceNotationParserVisitor;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DiceNotationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DSEPARATOR=1, DIGIT=2, ADDOPERATOR=3, MULTOPERATOR=4, LPAREN=5, RPAREN=6, 
		WS=7, AUTH=8;
	public static final int
		RULE_file_ = 0, RULE_notation = 1, RULE_addOp = 2, RULE_multOp = 3, RULE_operand = 4, 
		RULE_dice = 5, RULE_number = 6, RULE_authentication = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_", "notation", "addOp", "multOp", "operand", "dice", "number", 
			"authentication"
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

	@Override
	public String getGrammarFileName() { return "DiceNotationParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiceNotationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_Context extends ParserRuleContext {
		public NotationContext notation() {
			return getRuleContext(NotationContext.class,0);
		}
		public AuthenticationContext authentication() {
			return getRuleContext(AuthenticationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DiceNotationParser.EOF, 0); }
		public File_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener) ((DiceNotationParserListener)listener).enterFile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).exitFile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceNotationParserVisitor ) return ((DiceNotationParserVisitor<? extends T>)visitor).visitFile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_Context file_() throws RecognitionException {
		File_Context _localctx = new File_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			notation();
			setState(17);
			authentication();
			setState(18);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotationContext extends ParserRuleContext {
		public DiceContext dice() {
			return getRuleContext(DiceContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public NotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).enterNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).exitNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceNotationParserVisitor<? extends T>) return ((DiceNotationParserVisitor<? extends T>)visitor).visitNotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotationContext notation() throws RecognitionException {
		NotationContext _localctx = new NotationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_notation);
		try {
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				dice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				addOp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddOpContext extends ParserRuleContext {
		public List<MultOpContext> multOp() {
			return getRuleContexts(MultOpContext.class);
		}
		public MultOpContext multOp(int i) {
			return getRuleContext(MultOpContext.class,i);
		}
		public List<TerminalNode> ADDOPERATOR() { return getTokens(DiceNotationParser.ADDOPERATOR); }
		public TerminalNode ADDOPERATOR(int i) {
			return getToken(DiceNotationParser.ADDOPERATOR, i);
		}
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceNotationParserVisitor ) return ((DiceNotationParserVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			multOp();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDOPERATOR) {
				{
				{
				setState(26);
				match(ADDOPERATOR);
				setState(27);
				multOp();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultOpContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> MULTOPERATOR() { return getTokens(DiceNotationParser.MULTOPERATOR); }
		public TerminalNode MULTOPERATOR(int i) {
			return getToken(DiceNotationParser.MULTOPERATOR, i);
		}
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceNotationParserVisitor ) return ((DiceNotationParserVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			operand();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTOPERATOR) {
				{
				{
				setState(34);
				match(MULTOPERATOR);
				setState(35);
				operand();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public DiceContext dice() {
			return getRuleContext(DiceContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DiceNotationParser.LPAREN, 0); }
		public NotationContext notation() {
			return getRuleContext(NotationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DiceNotationParser.RPAREN, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceNotationParserVisitor ) return ((DiceNotationParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operand);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				dice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(LPAREN);
				setState(44);
				notation();
				setState(45);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiceContext extends ParserRuleContext {
		public TerminalNode DSEPARATOR() { return getToken(DiceNotationParser.DSEPARATOR, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(DiceNotationParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiceNotationParser.DIGIT, i);
		}
		public TerminalNode ADDOPERATOR() { return getToken(DiceNotationParser.ADDOPERATOR, 0); }
		public DiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).enterDice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).exitDice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceNotationParserVisitor ) return ((DiceNotationParserVisitor<? extends T>)visitor).visitDice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiceContext dice() throws RecognitionException {
		DiceContext _localctx = new DiceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADDOPERATOR) {
				{
				setState(49);
				match(ADDOPERATOR);
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(52);
				match(DIGIT);
				}
			}

			setState(55);
			match(DSEPARATOR);
			setState(56);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(DiceNotationParser.DIGIT, 0); }
		public TerminalNode ADDOPERATOR() { return getToken(DiceNotationParser.ADDOPERATOR, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceNotationParserVisitor ) return ((DiceNotationParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADDOPERATOR) {
				{
				setState(58);
				match(ADDOPERATOR);
				}
			}

			setState(61);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AuthenticationContext extends ParserRuleContext {
		public TerminalNode AUTH() { return getToken(DiceNotationParser.AUTH, 0); }
		public AuthenticationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authentication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).enterAuthentication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationParserListener ) ((DiceNotationParserListener)listener).exitAuthentication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceNotationParserVisitor ) return ((DiceNotationParserVisitor<? extends T>)visitor).visitAuthentication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthenticationContext authentication() throws RecognitionException {
		AuthenticationContext _localctx = new AuthenticationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_authentication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(AUTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\bB\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u001d\b\u0002\n\u0002\f\u0002 \t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003%\b\u0003\n\u0003\f\u0003(\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"0\b\u0004\u0001\u0005\u0003\u00053\b\u0005\u0001\u0005\u0003\u00056\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006<\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000"+
		"\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000B\u0000\u0010"+
		"\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0019"+
		"\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b/\u0001\u0000"+
		"\u0000\u0000\n2\u0001\u0000\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e"+
		"?\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0012"+
		"\u0003\u000e\u0007\u0000\u0012\u0013\u0005\u0000\u0000\u0001\u0013\u0001"+
		"\u0001\u0000\u0000\u0000\u0014\u0018\u0003\n\u0005\u0000\u0015\u0018\u0003"+
		"\f\u0006\u0000\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0014\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001e\u0003\u0006"+
		"\u0003\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u001d\u0003\u0006"+
		"\u0003\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f\u0005\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		"!&\u0003\b\u0004\u0000\"#\u0005\u0004\u0000\u0000#%\u0003\b\u0004\u0000"+
		"$\"\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000)0\u0003\n\u0005\u0000*0\u0003\f\u0006\u0000+,\u0005"+
		"\u0005\u0000\u0000,-\u0003\u0002\u0001\u0000-.\u0005\u0006\u0000\u0000"+
		".0\u0001\u0000\u0000\u0000/)\u0001\u0000\u0000\u0000/*\u0001\u0000\u0000"+
		"\u0000/+\u0001\u0000\u0000\u00000\t\u0001\u0000\u0000\u000013\u0005\u0003"+
		"\u0000\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001"+
		"\u0000\u0000\u000046\u0005\u0002\u0000\u000054\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005\u0001\u0000"+
		"\u000089\u0005\u0002\u0000\u00009\u000b\u0001\u0000\u0000\u0000:<\u0005"+
		"\u0003\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=>\u0005\u0002\u0000\u0000>\r\u0001\u0000\u0000"+
		"\u0000?@\u0005\b\u0000\u0000@\u000f\u0001\u0000\u0000\u0000\u0007\u0017"+
		"\u001e&/25;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}