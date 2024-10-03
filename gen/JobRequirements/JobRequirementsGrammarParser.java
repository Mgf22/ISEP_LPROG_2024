// Generated from C:/Users/Mateus Fernandes/Desktop/ISEP/LPROG/jobs4u.app1/src/main/java/JobRequirements/JobRequirementsGrammar.g4 by ANTLR 4.13.1
package JobRequirements;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JobRequirementsGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DEGREE=8, PROGRAMMING_LANGUAGE=9, 
		LANGUAGE=10, COMPUTER_ENGINEER=11, COMPUTER_SCIENCE=12, WEB_DEVELOPMENT=13, 
		SOFTSKILL=14, EXPERIENCEYEARS=15, Comment=16, WS=17;
	public static final int
		RULE_file = 0, RULE_entry = 1, RULE_experienceEntry = 2, RULE_degreeEntry = 3, 
		RULE_specializationNameEntry = 4, RULE_specializationNameOption = 5, RULE_programmingLanguagesEntry = 6, 
		RULE_knownLanguagesEntry = 7, RULE_softSkillsEntry = 8, RULE_programmingLanguageList = 9, 
		RULE_knownLanguageList = 10, RULE_softSkillList = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "entry", "experienceEntry", "degreeEntry", "specializationNameEntry", 
			"specializationNameOption", "programmingLanguagesEntry", "knownLanguagesEntry", 
			"softSkillsEntry", "programmingLanguageList", "knownLanguageList", "softSkillList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Experience-years:'", "'Academic-degree:'", "'Specialization:'", 
			"'Programming-Languages:'", "'Known-languages:'", "'Soft-Skills:'", "','", 
			null, null, null, "'Computer engineer'", "'Computer science'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DEGREE", "PROGRAMMING_LANGUAGE", 
			"LANGUAGE", "COMPUTER_ENGINEER", "COMPUTER_SCIENCE", "WEB_DEVELOPMENT", 
			"SOFTSKILL", "EXPERIENCEYEARS", "Comment", "WS"
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
	public String getGrammarFileName() { return "JobRequirementsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JobRequirementsGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JobRequirementsGrammarParser.EOF, 0); }
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public List<TerminalNode> Comment() { return getTokens(JobRequirementsGrammarParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(JobRequirementsGrammarParser.Comment, i);
		}
		public List<TerminalNode> WS() { return getTokens(JobRequirementsGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JobRequirementsGrammarParser.WS, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitFile(this);
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
					{
					setState(24);
					entry();
					}
					break;
				case Comment:
					{
					setState(25);
					match(Comment);
					}
					break;
				case WS:
					{
					setState(26);
					match(WS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 196734L) != 0) );
			setState(31);
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
		public ExperienceEntryContext experienceEntry() {
			return getRuleContext(ExperienceEntryContext.class,0);
		}
		public DegreeEntryContext degreeEntry() {
			return getRuleContext(DegreeEntryContext.class,0);
		}
		public SpecializationNameEntryContext specializationNameEntry() {
			return getRuleContext(SpecializationNameEntryContext.class,0);
		}
		public ProgrammingLanguagesEntryContext programmingLanguagesEntry() {
			return getRuleContext(ProgrammingLanguagesEntryContext.class,0);
		}
		public KnownLanguagesEntryContext knownLanguagesEntry() {
			return getRuleContext(KnownLanguagesEntryContext.class,0);
		}
		public SoftSkillsEntryContext softSkillsEntry() {
			return getRuleContext(SoftSkillsEntryContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				experienceEntry();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				degreeEntry();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				specializationNameEntry();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				programmingLanguagesEntry();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				knownLanguagesEntry();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				softSkillsEntry();
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
	public static class ExperienceEntryContext extends ParserRuleContext {
		public TerminalNode EXPERIENCEYEARS() { return getToken(JobRequirementsGrammarParser.EXPERIENCEYEARS, 0); }
		public ExperienceEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experienceEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterExperienceEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitExperienceEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitExperienceEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExperienceEntryContext experienceEntry() throws RecognitionException {
		ExperienceEntryContext _localctx = new ExperienceEntryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_experienceEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(EXPERIENCEYEARS);
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
	public static class DegreeEntryContext extends ParserRuleContext {
		public TerminalNode DEGREE() { return getToken(JobRequirementsGrammarParser.DEGREE, 0); }
		public DegreeEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degreeEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterDegreeEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitDegreeEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitDegreeEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DegreeEntryContext degreeEntry() throws RecognitionException {
		DegreeEntryContext _localctx = new DegreeEntryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_degreeEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__1);
			setState(45);
			match(DEGREE);
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
	public static class SpecializationNameEntryContext extends ParserRuleContext {
		public SpecializationNameOptionContext specializationNameOption() {
			return getRuleContext(SpecializationNameOptionContext.class,0);
		}
		public SpecializationNameEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specializationNameEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterSpecializationNameEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitSpecializationNameEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitSpecializationNameEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecializationNameEntryContext specializationNameEntry() throws RecognitionException {
		SpecializationNameEntryContext _localctx = new SpecializationNameEntryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_specializationNameEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__2);
			setState(48);
			specializationNameOption();
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
	public static class SpecializationNameOptionContext extends ParserRuleContext {
		public TerminalNode COMPUTER_ENGINEER() { return getToken(JobRequirementsGrammarParser.COMPUTER_ENGINEER, 0); }
		public TerminalNode COMPUTER_SCIENCE() { return getToken(JobRequirementsGrammarParser.COMPUTER_SCIENCE, 0); }
		public TerminalNode WEB_DEVELOPMENT() { return getToken(JobRequirementsGrammarParser.WEB_DEVELOPMENT, 0); }
		public SpecializationNameOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specializationNameOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterSpecializationNameOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitSpecializationNameOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitSpecializationNameOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecializationNameOptionContext specializationNameOption() throws RecognitionException {
		SpecializationNameOptionContext _localctx = new SpecializationNameOptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specializationNameOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ProgrammingLanguagesEntryContext extends ParserRuleContext {
		public ProgrammingLanguageListContext programmingLanguageList() {
			return getRuleContext(ProgrammingLanguageListContext.class,0);
		}
		public ProgrammingLanguagesEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programmingLanguagesEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterProgrammingLanguagesEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitProgrammingLanguagesEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitProgrammingLanguagesEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammingLanguagesEntryContext programmingLanguagesEntry() throws RecognitionException {
		ProgrammingLanguagesEntryContext _localctx = new ProgrammingLanguagesEntryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_programmingLanguagesEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__3);
			setState(53);
			programmingLanguageList();
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
	public static class KnownLanguagesEntryContext extends ParserRuleContext {
		public KnownLanguageListContext knownLanguageList() {
			return getRuleContext(KnownLanguageListContext.class,0);
		}
		public KnownLanguagesEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownLanguagesEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterKnownLanguagesEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitKnownLanguagesEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitKnownLanguagesEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownLanguagesEntryContext knownLanguagesEntry() throws RecognitionException {
		KnownLanguagesEntryContext _localctx = new KnownLanguagesEntryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_knownLanguagesEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__4);
			setState(56);
			knownLanguageList();
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
	public static class SoftSkillsEntryContext extends ParserRuleContext {
		public SoftSkillListContext softSkillList() {
			return getRuleContext(SoftSkillListContext.class,0);
		}
		public SoftSkillsEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softSkillsEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterSoftSkillsEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitSoftSkillsEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitSoftSkillsEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftSkillsEntryContext softSkillsEntry() throws RecognitionException {
		SoftSkillsEntryContext _localctx = new SoftSkillsEntryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_softSkillsEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__5);
			setState(59);
			softSkillList();
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
	public static class ProgrammingLanguageListContext extends ParserRuleContext {
		public List<TerminalNode> PROGRAMMING_LANGUAGE() { return getTokens(JobRequirementsGrammarParser.PROGRAMMING_LANGUAGE); }
		public TerminalNode PROGRAMMING_LANGUAGE(int i) {
			return getToken(JobRequirementsGrammarParser.PROGRAMMING_LANGUAGE, i);
		}
		public ProgrammingLanguageListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programmingLanguageList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterProgrammingLanguageList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitProgrammingLanguageList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitProgrammingLanguageList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammingLanguageListContext programmingLanguageList() throws RecognitionException {
		ProgrammingLanguageListContext _localctx = new ProgrammingLanguageListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_programmingLanguageList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(PROGRAMMING_LANGUAGE);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(62);
				match(T__6);
				setState(63);
				match(PROGRAMMING_LANGUAGE);
				}
				}
				setState(68);
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
	public static class KnownLanguageListContext extends ParserRuleContext {
		public List<TerminalNode> LANGUAGE() { return getTokens(JobRequirementsGrammarParser.LANGUAGE); }
		public TerminalNode LANGUAGE(int i) {
			return getToken(JobRequirementsGrammarParser.LANGUAGE, i);
		}
		public KnownLanguageListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownLanguageList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterKnownLanguageList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitKnownLanguageList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitKnownLanguageList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownLanguageListContext knownLanguageList() throws RecognitionException {
		KnownLanguageListContext _localctx = new KnownLanguageListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_knownLanguageList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LANGUAGE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(70);
				match(T__6);
				setState(71);
				match(LANGUAGE);
				}
				}
				setState(76);
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
	public static class SoftSkillListContext extends ParserRuleContext {
		public List<TerminalNode> SOFTSKILL() { return getTokens(JobRequirementsGrammarParser.SOFTSKILL); }
		public TerminalNode SOFTSKILL(int i) {
			return getToken(JobRequirementsGrammarParser.SOFTSKILL, i);
		}
		public SoftSkillListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softSkillList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).enterSoftSkillList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobRequirementsGrammarListener ) ((JobRequirementsGrammarListener)listener).exitSoftSkillList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobRequirementsGrammarVisitor ) return ((JobRequirementsGrammarVisitor<? extends T>)visitor).visitSoftSkillList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftSkillListContext softSkillList() throws RecognitionException {
		SoftSkillListContext _localctx = new SoftSkillListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_softSkillList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SOFTSKILL);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(78);
				match(T__6);
				setState(79);
				match(SOFTSKILL);
				}
				}
				setState(84);
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
		"\u0004\u0001\u0011V\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f"+
		"\u0000\u001d\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\tA\b\t\n\t\f\tD\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\nI\b\n\n\n\f\nL\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000bQ\b\u000b\n\u000b\f\u000bT\t\u000b\u0001\u000b\u0000\u0000\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001"+
		"\u0000\u000b\rT\u0000\u001b\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000"+
		"\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000"+
		"\b/\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\f4\u0001\u0000"+
		"\u0000\u0000\u000e7\u0001\u0000\u0000\u0000\u0010:\u0001\u0000\u0000\u0000"+
		"\u0012=\u0001\u0000\u0000\u0000\u0014E\u0001\u0000\u0000\u0000\u0016M"+
		"\u0001\u0000\u0000\u0000\u0018\u001c\u0003\u0002\u0001\u0000\u0019\u001c"+
		"\u0005\u0010\u0000\u0000\u001a\u001c\u0005\u0011\u0000\u0000\u001b\u0018"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000"+
		"\u0000\u0000!(\u0003\u0004\u0002\u0000\"(\u0003\u0006\u0003\u0000#(\u0003"+
		"\b\u0004\u0000$(\u0003\f\u0006\u0000%(\u0003\u000e\u0007\u0000&(\u0003"+
		"\u0010\b\u0000\'!\u0001\u0000\u0000\u0000\'\"\u0001\u0000\u0000\u0000"+
		"\'#\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000"+
		")*\u0005\u0001\u0000\u0000*+\u0005\u000f\u0000\u0000+\u0005\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0002\u0000\u0000-.\u0005\b\u0000\u0000.\u0007\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0003\u0000\u000001\u0003\n\u0005\u00001\t"+
		"\u0001\u0000\u0000\u000023\u0007\u0000\u0000\u00003\u000b\u0001\u0000"+
		"\u0000\u000045\u0005\u0004\u0000\u000056\u0003\u0012\t\u00006\r\u0001"+
		"\u0000\u0000\u000078\u0005\u0005\u0000\u000089\u0003\u0014\n\u00009\u000f"+
		"\u0001\u0000\u0000\u0000:;\u0005\u0006\u0000\u0000;<\u0003\u0016\u000b"+
		"\u0000<\u0011\u0001\u0000\u0000\u0000=B\u0005\t\u0000\u0000>?\u0005\u0007"+
		"\u0000\u0000?A\u0005\t\u0000\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0013"+
		"\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EJ\u0005\n\u0000\u0000"+
		"FG\u0005\u0007\u0000\u0000GI\u0005\n\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000K\u0015\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MR\u0005"+
		"\u000e\u0000\u0000NO\u0005\u0007\u0000\u0000OQ\u0005\u000e\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000S\u0017\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000\u0006\u001b\u001d\'BJR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}