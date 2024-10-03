// Generated from C:/Users/Mateus Fernandes/Desktop/ISEP/LPROG/jobs4u.app1/src/main/java/Interview/interviewGrammar.g4 by ANTLR 4.13.1
package Interview;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class interviewGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SPRING_FRAMEWORK=11, BYTE=12, WINDOWS_KEYS=13, DATE=14, TIME=15, 
		LPROG=16, FREE_TEXT=17, SPACE=18, COMMENT=19, WS=20, DECIMAL=21, DIGIT=22, 
		DAY=23, MONTH=24, YEAR=25, HOURS=26, MINUTES=27;
	public static final int
		RULE_file = 0, RULE_entry = 1, RULE_springFrameworkQuestion = 2, RULE_wifiDescriptionQuestion = 3, 
		RULE_databaseQuestion = 4, RULE_frontEndTechnologiesQuestion = 5, RULE_byteInBitsQuestion = 6, 
		RULE_windowsKeysPriceQuestion = 7, RULE_windowsReleaseDateQuestion = 8, 
		RULE_workStartTimeQuestion = 9, RULE_lprogRatingQuestion = 10, RULE_wifi_description = 11, 
		RULE_multipleAnswer = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "entry", "springFrameworkQuestion", "wifiDescriptionQuestion", 
			"databaseQuestion", "frontEndTechnologiesQuestion", "byteInBitsQuestion", 
			"windowsKeysPriceQuestion", "windowsReleaseDateQuestion", "workStartTimeQuestion", 
			"lprogRatingQuestion", "wifi_description", "multipleAnswer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Spring Framework:'", "'WIFI Designation:'", "'Types of databases:'", 
			"'2 most used frontend technologies:'", "'Byte in bits:'", "'Windows keys:'", 
			"'Windows release date:'", "'Hour to start working:'", "'LPROG work:'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SPRING_FRAMEWORK", 
			"BYTE", "WINDOWS_KEYS", "DATE", "TIME", "LPROG", "FREE_TEXT", "SPACE", 
			"COMMENT", "WS", "DECIMAL", "DIGIT", "DAY", "MONTH", "YEAR", "HOURS", 
			"MINUTES"
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
	public String getGrammarFileName() { return "interviewGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public interviewGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(interviewGrammarParser.EOF, 0); }
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(interviewGrammarParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(interviewGrammarParser.COMMENT, i);
		}
		public List<TerminalNode> WS() { return getTokens(interviewGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(interviewGrammarParser.WS, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
					{
					setState(26);
					entry();
					}
					break;
				case COMMENT:
					{
					setState(27);
					match(COMMENT);
					}
					break;
				case WS:
					{
					setState(28);
					match(WS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1573886L) != 0) );
			setState(33);
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
	public static class EntryContext extends ParserRuleContext {
		public SpringFrameworkQuestionContext springFrameworkQuestion() {
			return getRuleContext(SpringFrameworkQuestionContext.class,0);
		}
		public WifiDescriptionQuestionContext wifiDescriptionQuestion() {
			return getRuleContext(WifiDescriptionQuestionContext.class,0);
		}
		public DatabaseQuestionContext databaseQuestion() {
			return getRuleContext(DatabaseQuestionContext.class,0);
		}
		public FrontEndTechnologiesQuestionContext frontEndTechnologiesQuestion() {
			return getRuleContext(FrontEndTechnologiesQuestionContext.class,0);
		}
		public ByteInBitsQuestionContext byteInBitsQuestion() {
			return getRuleContext(ByteInBitsQuestionContext.class,0);
		}
		public WindowsKeysPriceQuestionContext windowsKeysPriceQuestion() {
			return getRuleContext(WindowsKeysPriceQuestionContext.class,0);
		}
		public WindowsReleaseDateQuestionContext windowsReleaseDateQuestion() {
			return getRuleContext(WindowsReleaseDateQuestionContext.class,0);
		}
		public WorkStartTimeQuestionContext workStartTimeQuestion() {
			return getRuleContext(WorkStartTimeQuestionContext.class,0);
		}
		public LprogRatingQuestionContext lprogRatingQuestion() {
			return getRuleContext(LprogRatingQuestionContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				springFrameworkQuestion();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				wifiDescriptionQuestion();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				databaseQuestion();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				frontEndTechnologiesQuestion();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				byteInBitsQuestion();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				windowsKeysPriceQuestion();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				windowsReleaseDateQuestion();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(42);
				workStartTimeQuestion();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(43);
				lprogRatingQuestion();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SpringFrameworkQuestionContext extends ParserRuleContext {
		public TerminalNode SPRING_FRAMEWORK() { return getToken(interviewGrammarParser.SPRING_FRAMEWORK, 0); }
		public SpringFrameworkQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springFrameworkQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterSpringFrameworkQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitSpringFrameworkQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitSpringFrameworkQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpringFrameworkQuestionContext springFrameworkQuestion() throws RecognitionException {
		SpringFrameworkQuestionContext _localctx = new SpringFrameworkQuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_springFrameworkQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			match(SPRING_FRAMEWORK);
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
	public static class WifiDescriptionQuestionContext extends ParserRuleContext {
		public Wifi_descriptionContext wifi_description() {
			return getRuleContext(Wifi_descriptionContext.class,0);
		}
		public WifiDescriptionQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wifiDescriptionQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterWifiDescriptionQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitWifiDescriptionQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitWifiDescriptionQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WifiDescriptionQuestionContext wifiDescriptionQuestion() throws RecognitionException {
		WifiDescriptionQuestionContext _localctx = new WifiDescriptionQuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_wifiDescriptionQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__1);
			setState(50);
			wifi_description();
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
	public static class DatabaseQuestionContext extends ParserRuleContext {
		public TerminalNode FREE_TEXT() { return getToken(interviewGrammarParser.FREE_TEXT, 0); }
		public DatabaseQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterDatabaseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitDatabaseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitDatabaseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseQuestionContext databaseQuestion() throws RecognitionException {
		DatabaseQuestionContext _localctx = new DatabaseQuestionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_databaseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__2);
			setState(53);
			match(FREE_TEXT);
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
	public static class FrontEndTechnologiesQuestionContext extends ParserRuleContext {
		public MultipleAnswerContext multipleAnswer() {
			return getRuleContext(MultipleAnswerContext.class,0);
		}
		public FrontEndTechnologiesQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frontEndTechnologiesQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterFrontEndTechnologiesQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitFrontEndTechnologiesQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitFrontEndTechnologiesQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrontEndTechnologiesQuestionContext frontEndTechnologiesQuestion() throws RecognitionException {
		FrontEndTechnologiesQuestionContext _localctx = new FrontEndTechnologiesQuestionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_frontEndTechnologiesQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__3);
			setState(56);
			multipleAnswer();
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
	public static class ByteInBitsQuestionContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(interviewGrammarParser.BYTE, 0); }
		public ByteInBitsQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteInBitsQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterByteInBitsQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitByteInBitsQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitByteInBitsQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteInBitsQuestionContext byteInBitsQuestion() throws RecognitionException {
		ByteInBitsQuestionContext _localctx = new ByteInBitsQuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_byteInBitsQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__4);
			setState(59);
			match(BYTE);
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
	public static class WindowsKeysPriceQuestionContext extends ParserRuleContext {
		public TerminalNode WINDOWS_KEYS() { return getToken(interviewGrammarParser.WINDOWS_KEYS, 0); }
		public WindowsKeysPriceQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowsKeysPriceQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterWindowsKeysPriceQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitWindowsKeysPriceQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitWindowsKeysPriceQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsKeysPriceQuestionContext windowsKeysPriceQuestion() throws RecognitionException {
		WindowsKeysPriceQuestionContext _localctx = new WindowsKeysPriceQuestionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_windowsKeysPriceQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__5);
			setState(62);
			match(WINDOWS_KEYS);
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
	public static class WindowsReleaseDateQuestionContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(interviewGrammarParser.DATE, 0); }
		public WindowsReleaseDateQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowsReleaseDateQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterWindowsReleaseDateQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitWindowsReleaseDateQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitWindowsReleaseDateQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsReleaseDateQuestionContext windowsReleaseDateQuestion() throws RecognitionException {
		WindowsReleaseDateQuestionContext _localctx = new WindowsReleaseDateQuestionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_windowsReleaseDateQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__6);
			setState(65);
			match(DATE);
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
	public static class WorkStartTimeQuestionContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(interviewGrammarParser.TIME, 0); }
		public WorkStartTimeQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workStartTimeQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterWorkStartTimeQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitWorkStartTimeQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitWorkStartTimeQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorkStartTimeQuestionContext workStartTimeQuestion() throws RecognitionException {
		WorkStartTimeQuestionContext _localctx = new WorkStartTimeQuestionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_workStartTimeQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__7);
			setState(68);
			match(TIME);
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
	public static class LprogRatingQuestionContext extends ParserRuleContext {
		public TerminalNode LPROG() { return getToken(interviewGrammarParser.LPROG, 0); }
		public LprogRatingQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lprogRatingQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterLprogRatingQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitLprogRatingQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitLprogRatingQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LprogRatingQuestionContext lprogRatingQuestion() throws RecognitionException {
		LprogRatingQuestionContext _localctx = new LprogRatingQuestionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lprogRatingQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__8);
			setState(71);
			match(LPROG);
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
	public static class Wifi_descriptionContext extends ParserRuleContext {
		public List<TerminalNode> FREE_TEXT() { return getTokens(interviewGrammarParser.FREE_TEXT); }
		public TerminalNode FREE_TEXT(int i) {
			return getToken(interviewGrammarParser.FREE_TEXT, i);
		}
		public Wifi_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wifi_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterWifi_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitWifi_description(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitWifi_description(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wifi_descriptionContext wifi_description() throws RecognitionException {
		Wifi_descriptionContext _localctx = new Wifi_descriptionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_wifi_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FREE_TEXT);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FREE_TEXT) {
				{
				{
				setState(74);
				match(FREE_TEXT);
				}
				}
				setState(79);
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
	public static class MultipleAnswerContext extends ParserRuleContext {
		public List<TerminalNode> FREE_TEXT() { return getTokens(interviewGrammarParser.FREE_TEXT); }
		public TerminalNode FREE_TEXT(int i) {
			return getToken(interviewGrammarParser.FREE_TEXT, i);
		}
		public MultipleAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).enterMultipleAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interviewGrammarListener ) ((interviewGrammarListener)listener).exitMultipleAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interviewGrammarVisitor ) return ((interviewGrammarVisitor<? extends T>)visitor).visitMultipleAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleAnswerContext multipleAnswer() throws RecognitionException {
		MultipleAnswerContext _localctx = new MultipleAnswerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multipleAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(FREE_TEXT);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(81);
				match(T__9);
				setState(82);
				match(FREE_TEXT);
				}
				}
				setState(87);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001bY\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001e\b\u0000"+
		"\u000b\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"L\b\u000b\n\u000b\f\u000bO\t\u000b\u0001\f\u0001\f\u0001\f\u0005\fT\b"+
		"\f\n\f\f\fW\t\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0000X\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0002,\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u0006"+
		"1\u0001\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000"+
		"\u0000\f:\u0001\u0000\u0000\u0000\u000e=\u0001\u0000\u0000\u0000\u0010"+
		"@\u0001\u0000\u0000\u0000\u0012C\u0001\u0000\u0000\u0000\u0014F\u0001"+
		"\u0000\u0000\u0000\u0016I\u0001\u0000\u0000\u0000\u0018P\u0001\u0000\u0000"+
		"\u0000\u001a\u001e\u0003\u0002\u0001\u0000\u001b\u001e\u0005\u0013\u0000"+
		"\u0000\u001c\u001e\u0005\u0014\u0000\u0000\u001d\u001a\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005"+
		"\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#-\u0003\u0004\u0002"+
		"\u0000$-\u0003\u0006\u0003\u0000%-\u0003\b\u0004\u0000&-\u0003\n\u0005"+
		"\u0000\'-\u0003\f\u0006\u0000(-\u0003\u000e\u0007\u0000)-\u0003\u0010"+
		"\b\u0000*-\u0003\u0012\t\u0000+-\u0003\u0014\n\u0000,#\u0001\u0000\u0000"+
		"\u0000,$\u0001\u0000\u0000\u0000,%\u0001\u0000\u0000\u0000,&\u0001\u0000"+
		"\u0000\u0000,\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000,)\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000"+
		"-\u0003\u0001\u0000\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0005\u000b"+
		"\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u0000"+
		"23\u0003\u0016\u000b\u00003\u0007\u0001\u0000\u0000\u000045\u0005\u0003"+
		"\u0000\u000056\u0005\u0011\u0000\u00006\t\u0001\u0000\u0000\u000078\u0005"+
		"\u0004\u0000\u000089\u0003\u0018\f\u00009\u000b\u0001\u0000\u0000\u0000"+
		":;\u0005\u0005\u0000\u0000;<\u0005\f\u0000\u0000<\r\u0001\u0000\u0000"+
		"\u0000=>\u0005\u0006\u0000\u0000>?\u0005\r\u0000\u0000?\u000f\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0007\u0000\u0000AB\u0005\u000e\u0000\u0000B\u0011"+
		"\u0001\u0000\u0000\u0000CD\u0005\b\u0000\u0000DE\u0005\u000f\u0000\u0000"+
		"E\u0013\u0001\u0000\u0000\u0000FG\u0005\t\u0000\u0000GH\u0005\u0010\u0000"+
		"\u0000H\u0015\u0001\u0000\u0000\u0000IM\u0005\u0011\u0000\u0000JL\u0005"+
		"\u0011\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0017\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PU\u0005\u0011\u0000\u0000QR\u0005"+
		"\n\u0000\u0000RT\u0005\u0011\u0000\u0000SQ\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\u0019\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000\u0005\u001d"+
		"\u001f,MU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}