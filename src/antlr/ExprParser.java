// Generated from Expr.g4 by ANTLR 4.8

	package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BEGM=10, ENDM=11, SEP=12, ID=13, NUM=14, INT=15, FLOAT=16, STRING=17, 
		BOOL=18, TYPE=19, ADD_NODE=20, ADD_EDGE=21, MOD_NODE=22, BASIC_TYPE=23, 
		COMMENT=24, WHITE_SPACE=25, END=26, MUL=27, DIV=28, ADD=29, SUB=30, GEQ=31, 
		SEQ=32, EQU=33;
	public static final int
		RULE_prog = 0, RULE_variableDecl = 1, RULE_expr = 2, RULE_map = 3, RULE_tuples = 4, 
		RULE_tuple = 5, RULE_gml = 6, RULE_graph = 7, RULE_node = 8, RULE_edge = 9, 
		RULE_point = 10, RULE_operation = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "variableDecl", "expr", "map", "tuples", "tuple", "gml", "graph", 
			"node", "edge", "point", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'!'", "'('", "')'", "'graph('", "'node('", "'edge('", 
			"'point('", "'['", "']'", "','", null, null, null, null, null, null, 
			null, "'ADDNODE'", "'ADDEDGE'", "'MODIFYNODE'", null, null, null, "';'", 
			"'*'", "'/'", "'+'", "'-'", null, null, "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "BEGM", "ENDM", 
			"SEP", "ID", "NUM", "INT", "FLOAT", "STRING", "BOOL", "TYPE", "ADD_NODE", 
			"ADD_EDGE", "MOD_NODE", "BASIC_TYPE", "COMMENT", "WHITE_SPACE", "END", 
			"MUL", "DIV", "ADD", "SUB", "GEQ", "SEQ", "EQU"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(27);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(24);
					variableDecl();
					}
					break;
				case 2:
					{
					setState(25);
					expr(0);
					}
					break;
				case 3:
					{
					setState(26);
					operation();
					}
					break;
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BEGM) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL) | (1L << ADD_NODE) | (1L << ADD_EDGE) | (1L << MOD_NODE) | (1L << SUB))) != 0) );
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

	public static class VariableDeclContext extends ParserRuleContext {
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
	 
		public VariableDeclContext() { }
		public void copyFrom(VariableDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationContext extends VariableDeclContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public TerminalNode END() { return getToken(ExprParser.END, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDeclarationContext(VariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDecl);
		int _la;
		try {
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ID);
			setState(34);
			match(T__0);
			setState(35);
			match(TYPE);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(36);
				match(T__1);
				setState(37);
				expr(0);
				}
			}

			setState(40);
			match(END);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueFalseContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(ExprParser.BOOL, 0); }
		public TrueFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTrueFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTrueFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTrueFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapStructureContext extends ExprContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public MapStructureContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMapStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMapStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMapStructure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanBinaryContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GEQ() { return getToken(ExprParser.GEQ, 0); }
		public TerminalNode SEQ() { return getToken(ExprParser.SEQ, 0); }
		public TerminalNode EQU() { return getToken(ExprParser.EQU, 0); }
		public BooleanBinaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleanBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBooleanBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBooleanBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GraphElementContext extends ExprContext {
		public GmlContext gml() {
			return getRuleContext(GmlContext.class,0);
		}
		public GraphElementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGraphElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGraphElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGraphElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ExprContext {
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(43);
				match(SUB);
				setState(44);
				expr(12);
				}
				break;
			case T__2:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(T__2);
				setState(46);
				expr(10);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(ID);
				}
				break;
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(NUM);
				}
				break;
			case BOOL:
				{
				_localctx = new TrueFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(BOOL);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(STRING);
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				{
				_localctx = new GraphElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				gml();
				}
				break;
			case BEGM:
				{
				_localctx = new MapStructureContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				map();
				}
				break;
			case T__3:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(T__3);
				setState(54);
				expr(0);
				setState(55);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanBinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(60);
						((BooleanBinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GEQ) | (1L << SEQ) | (1L << EQU))) != 0)) ) {
							((BooleanBinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(63);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(66);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public TerminalNode BEGM() { return getToken(ExprParser.BEGM, 0); }
		public TerminalNode ENDM() { return getToken(ExprParser.ENDM, 0); }
		public TuplesContext tuples() {
			return getRuleContext(TuplesContext.class,0);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(BEGM);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(74);
				tuples();
				}
			}

			setState(77);
			match(ENDM);
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

	public static class TuplesContext extends ParserRuleContext {
		public List<TupleContext> tuple() {
			return getRuleContexts(TupleContext.class);
		}
		public TupleContext tuple(int i) {
			return getRuleContext(TupleContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(ExprParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ExprParser.SEP, i);
		}
		public TuplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTuples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTuples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTuples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplesContext tuples() throws RecognitionException {
		TuplesContext _localctx = new TuplesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tuples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			tuple();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(80);
				match(SEP);
				setState(81);
				tuple();
				}
				}
				setState(86);
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

	public static class TupleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TerminalNode SEP() { return getToken(ExprParser.SEP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__3);
			setState(88);
			match(STRING);
			setState(89);
			match(SEP);
			setState(90);
			expr(0);
			setState(91);
			match(T__4);
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

	public static class GmlContext extends ParserRuleContext {
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public EdgeContext edge() {
			return getRuleContext(EdgeContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public GmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GmlContext gml() throws RecognitionException {
		GmlContext _localctx = new GmlContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gml);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				graph();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				node();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				edge();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				point();
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

	public static class GraphContext extends ParserRuleContext {
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
	 
		public GraphContext() { }
		public void copyFrom(GraphContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GraphDeclarationContext extends GraphContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEP() { return getToken(ExprParser.SEP, 0); }
		public GraphDeclarationContext(GraphContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGraphDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGraphDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGraphDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_graph);
		try {
			_localctx = new GraphDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__5);
			setState(100);
			expr(0);
			setState(101);
			match(SEP);
			setState(102);
			expr(0);
			setState(103);
			match(T__4);
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

	public static class NodeContext extends ParserRuleContext {
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	 
		public NodeContext() { }
		public void copyFrom(NodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NodeDeclarationContext extends NodeContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(ExprParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ExprParser.SEP, i);
		}
		public NodeDeclarationContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNodeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNodeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNodeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_node);
		try {
			_localctx = new NodeDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			setState(106);
			expr(0);
			setState(107);
			match(SEP);
			setState(108);
			expr(0);
			setState(109);
			match(SEP);
			setState(110);
			expr(0);
			setState(111);
			match(T__4);
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

	public static class EdgeContext extends ParserRuleContext {
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
	 
		public EdgeContext() { }
		public void copyFrom(EdgeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EdgeDeclarationContext extends EdgeContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEP() { return getToken(ExprParser.SEP, 0); }
		public EdgeDeclarationContext(EdgeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEdgeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEdgeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEdgeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_edge);
		try {
			_localctx = new EdgeDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__7);
			setState(114);
			expr(0);
			setState(115);
			match(SEP);
			setState(116);
			expr(0);
			setState(117);
			match(T__4);
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

	public static class PointContext extends ParserRuleContext {
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
	 
		public PointContext() { }
		public void copyFrom(PointContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PointDeclarationContext extends PointContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(ExprParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ExprParser.SEP, i);
		}
		public PointDeclarationContext(PointContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPointDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPointDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPointDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_point);
		int _la;
		try {
			_localctx = new PointDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__8);
			setState(120);
			expr(0);
			setState(121);
			match(SEP);
			setState(122);
			expr(0);
			setState(123);
			match(SEP);
			setState(124);
			expr(0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(125);
				match(SEP);
				setState(126);
				expr(0);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(127);
					match(SEP);
					setState(128);
					expr(0);
					setState(129);
					match(SEP);
					setState(130);
					expr(0);
					setState(131);
					match(SEP);
					setState(132);
					expr(0);
					}
				}

				}
			}

			setState(138);
			match(T__4);
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

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EdgeModificatioContext extends OperationContext {
		public TerminalNode MOD_NODE() { return getToken(ExprParser.MOD_NODE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(ExprParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ExprParser.SEP, i);
		}
		public TerminalNode END() { return getToken(ExprParser.END, 0); }
		public EdgeModificatioContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEdgeModificatio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEdgeModificatio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEdgeModificatio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EdgeAdditionContext extends OperationContext {
		public TerminalNode ADD_EDGE() { return getToken(ExprParser.ADD_EDGE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEP() { return getToken(ExprParser.SEP, 0); }
		public TerminalNode END() { return getToken(ExprParser.END, 0); }
		public EdgeAdditionContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEdgeAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEdgeAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEdgeAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NodeAdditionContext extends OperationContext {
		public TerminalNode ADD_NODE() { return getToken(ExprParser.ADD_NODE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(ExprParser.END, 0); }
		public NodeAdditionContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNodeAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNodeAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNodeAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operation);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_NODE:
				_localctx = new NodeAdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(ADD_NODE);
				setState(141);
				match(T__3);
				setState(142);
				expr(0);
				setState(143);
				match(T__4);
				setState(144);
				match(END);
				}
				break;
			case ADD_EDGE:
				_localctx = new EdgeAdditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(ADD_EDGE);
				setState(147);
				match(T__3);
				setState(148);
				expr(0);
				setState(149);
				match(SEP);
				setState(150);
				expr(0);
				setState(151);
				match(T__4);
				setState(152);
				match(END);
				}
				break;
			case MOD_NODE:
				_localctx = new EdgeModificatioContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(MOD_NODE);
				setState(155);
				match(T__3);
				setState(156);
				expr(0);
				setState(157);
				match(SEP);
				setState(158);
				expr(0);
				setState(159);
				match(SEP);
				setState(160);
				expr(0);
				setState(161);
				match(SEP);
				setState(162);
				expr(0);
				setState(163);
				match(T__4);
				setState(164);
				match(END);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\5\3)\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"G\n\4\f\4\16\4J\13\4\3\5\3\5\5\5N\n\5\3\5\3\5\3\6\3\6\3\6\7\6U\n\6\f\6"+
		"\16\6X\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bd\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0089\n\f\5\f\u008b\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00a9\n\r\3\r\2\3\6\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2!#\3\2\35"+
		"\36\3\2\37 \2\u00b6\2\35\3\2\2\2\4#\3\2\2\2\6;\3\2\2\2\bK\3\2\2\2\nQ\3"+
		"\2\2\2\fY\3\2\2\2\16c\3\2\2\2\20e\3\2\2\2\22k\3\2\2\2\24s\3\2\2\2\26y"+
		"\3\2\2\2\30\u00a8\3\2\2\2\32\36\5\4\3\2\33\36\5\6\4\2\34\36\5\30\r\2\35"+
		"\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37"+
		" \3\2\2\2 !\3\2\2\2!\"\7\2\2\3\"\3\3\2\2\2#$\7\17\2\2$%\7\3\2\2%(\7\25"+
		"\2\2&\'\7\4\2\2\')\5\6\4\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\34\2\2+\5"+
		"\3\2\2\2,-\b\4\1\2-.\7 \2\2.<\5\6\4\16/\60\7\5\2\2\60<\5\6\4\f\61<\7\17"+
		"\2\2\62<\7\20\2\2\63<\7\24\2\2\64<\7\23\2\2\65<\5\16\b\2\66<\5\b\5\2\67"+
		"8\7\6\2\289\5\6\4\29:\7\7\2\2:<\3\2\2\2;,\3\2\2\2;/\3\2\2\2;\61\3\2\2"+
		"\2;\62\3\2\2\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2"+
		"\2\2<H\3\2\2\2=>\f\r\2\2>?\t\2\2\2?G\5\6\4\16@A\f\13\2\2AB\t\3\2\2BG\5"+
		"\6\4\fCD\f\n\2\2DE\t\4\2\2EG\5\6\4\13F=\3\2\2\2F@\3\2\2\2FC\3\2\2\2GJ"+
		"\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\7\3\2\2\2JH\3\2\2\2KM\7\f\2\2LN\5\n\6\2"+
		"ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\r\2\2P\t\3\2\2\2QV\5\f\7\2RS\7\16\2"+
		"\2SU\5\f\7\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2"+
		"\2\2YZ\7\6\2\2Z[\7\23\2\2[\\\7\16\2\2\\]\5\6\4\2]^\7\7\2\2^\r\3\2\2\2"+
		"_d\5\20\t\2`d\5\22\n\2ad\5\24\13\2bd\5\26\f\2c_\3\2\2\2c`\3\2\2\2ca\3"+
		"\2\2\2cb\3\2\2\2d\17\3\2\2\2ef\7\b\2\2fg\5\6\4\2gh\7\16\2\2hi\5\6\4\2"+
		"ij\7\7\2\2j\21\3\2\2\2kl\7\t\2\2lm\5\6\4\2mn\7\16\2\2no\5\6\4\2op\7\16"+
		"\2\2pq\5\6\4\2qr\7\7\2\2r\23\3\2\2\2st\7\n\2\2tu\5\6\4\2uv\7\16\2\2vw"+
		"\5\6\4\2wx\7\7\2\2x\25\3\2\2\2yz\7\13\2\2z{\5\6\4\2{|\7\16\2\2|}\5\6\4"+
		"\2}~\7\16\2\2~\u008a\5\6\4\2\177\u0080\7\16\2\2\u0080\u0088\5\6\4\2\u0081"+
		"\u0082\7\16\2\2\u0082\u0083\5\6\4\2\u0083\u0084\7\16\2\2\u0084\u0085\5"+
		"\6\4\2\u0085\u0086\7\16\2\2\u0086\u0087\5\6\4\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0081\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\177\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\7\2\2\u008d\27"+
		"\3\2\2\2\u008e\u008f\7\26\2\2\u008f\u0090\7\6\2\2\u0090\u0091\5\6\4\2"+
		"\u0091\u0092\7\7\2\2\u0092\u0093\7\34\2\2\u0093\u00a9\3\2\2\2\u0094\u0095"+
		"\7\27\2\2\u0095\u0096\7\6\2\2\u0096\u0097\5\6\4\2\u0097\u0098\7\16\2\2"+
		"\u0098\u0099\5\6\4\2\u0099\u009a\7\7\2\2\u009a\u009b\7\34\2\2\u009b\u00a9"+
		"\3\2\2\2\u009c\u009d\7\30\2\2\u009d\u009e\7\6\2\2\u009e\u009f\5\6\4\2"+
		"\u009f\u00a0\7\16\2\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3"+
		"\5\6\4\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5\6\4\2\u00a5\u00a6\7\7\2\2"+
		"\u00a6\u00a7\7\34\2\2\u00a7\u00a9\3\2\2\2\u00a8\u008e\3\2\2\2\u00a8\u0094"+
		"\3\2\2\2\u00a8\u009c\3\2\2\2\u00a9\31\3\2\2\2\16\35\37(;FHMVc\u0088\u008a"+
		"\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}