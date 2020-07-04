// Generated from Expr.g4 by ANTLR 4.8

	package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"BEGM", "ENDM", "SEP", "ID", "NUM", "INT", "FLOAT", "DIGIT", "STRING", 
			"ESC", "BOOL", "TYPE", "ADD_NODE", "ADD_EDGE", "MOD_NODE", "BASIC_TYPE", 
			"COMMENT", "WHITE_SPACE", "END", "MUL", "DIV", "ADD", "SUB", "GEQ", "SEQ", 
			"EQU"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0133\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16"+
		"v\n\16\f\16\16\16y\13\16\3\17\3\17\5\17}\n\17\3\20\5\20\u0080\n\20\3\20"+
		"\3\20\3\20\7\20\u0085\n\20\f\20\16\20\u0088\13\20\5\20\u008a\n\20\3\21"+
		"\5\21\u008d\n\21\3\21\6\21\u0090\n\21\r\21\16\21\u0091\3\21\3\21\7\21"+
		"\u0096\n\21\f\21\16\21\u0099\13\21\3\21\5\21\u009c\n\21\3\21\3\21\6\21"+
		"\u00a0\n\21\r\21\16\21\u00a1\5\21\u00a4\n\21\3\22\3\22\3\23\3\23\3\23"+
		"\7\23\u00ab\n\23\f\23\16\23\u00ae\13\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\5\24\u00b6\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c1"+
		"\n\25\3\26\3\26\3\26\5\26\u00c6\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u010b\n\32\3\33\3\33\3\33\3\33\7\33\u0111\n"+
		"\33\f\33\16\33\u0114\13\33\3\33\3\33\3\34\6\34\u0119\n\34\r\34\16\34\u011a"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\5\"\u012b"+
		"\n\"\3#\3#\5#\u012f\n#\3$\3$\3$\3\u00ac\2%\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\23\'\2)\24+\25"+
		"-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#\3\2\b\3\2c|"+
		"\6\2\62;C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u014c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2"+
		"\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17Z\3\2\2\2\21`\3\2\2\2"+
		"\23f\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35|\3\2\2"+
		"\2\37\177\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00b5"+
		"\3\2\2\2)\u00c0\3\2\2\2+\u00c2\3\2\2\2-\u00c7\3\2\2\2/\u00cf\3\2\2\2\61"+
		"\u00d7\3\2\2\2\63\u010a\3\2\2\2\65\u010c\3\2\2\2\67\u0118\3\2\2\29\u011e"+
		"\3\2\2\2;\u0120\3\2\2\2=\u0122\3\2\2\2?\u0124\3\2\2\2A\u0126\3\2\2\2C"+
		"\u0128\3\2\2\2E\u012c\3\2\2\2G\u0130\3\2\2\2IJ\7<\2\2J\4\3\2\2\2KL\7?"+
		"\2\2L\6\3\2\2\2MN\7#\2\2N\b\3\2\2\2OP\7*\2\2P\n\3\2\2\2QR\7+\2\2R\f\3"+
		"\2\2\2ST\7i\2\2TU\7t\2\2UV\7c\2\2VW\7r\2\2WX\7j\2\2XY\7*\2\2Y\16\3\2\2"+
		"\2Z[\7p\2\2[\\\7q\2\2\\]\7f\2\2]^\7g\2\2^_\7*\2\2_\20\3\2\2\2`a\7g\2\2"+
		"ab\7f\2\2bc\7i\2\2cd\7g\2\2de\7*\2\2e\22\3\2\2\2fg\7r\2\2gh\7q\2\2hi\7"+
		"k\2\2ij\7p\2\2jk\7v\2\2kl\7*\2\2l\24\3\2\2\2mn\7]\2\2n\26\3\2\2\2op\7"+
		"_\2\2p\30\3\2\2\2qr\7.\2\2r\32\3\2\2\2sw\t\2\2\2tv\t\3\2\2ut\3\2\2\2v"+
		"y\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\34\3\2\2\2yw\3\2\2\2z}\5\37\20\2{}\5!\21"+
		"\2|z\3\2\2\2|{\3\2\2\2}\36\3\2\2\2~\u0080\7/\2\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0089\3\2\2\2\u0081\u008a\7\62\2\2\u0082\u0086\t\4\2\2"+
		"\u0083\u0085\5#\22\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u008a \3\2\2\2\u008b\u008d\7/\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\5#"+
		"\22\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\7\60\2\2\u0094\u0096\5"+
		"#\22\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u00a4\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\7/"+
		"\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\7\60\2\2\u009e\u00a0\5#\22\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u008c\3\2\2\2\u00a3\u009b\3\2\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\t\5\2\2"+
		"\u00a6$\3\2\2\2\u00a7\u00ac\7$\2\2\u00a8\u00ab\5\'\24\2\u00a9\u00ab\13"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b0\7$\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7^\2\2\u00b2\u00b6"+
		"\7$\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b6\7^\2\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7w\2\2\u00ba\u00c1\7g\2\2\u00bb\u00bc\7H\2\2\u00bc\u00bd\7c\2\2"+
		"\u00bd\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c1\7g\2\2\u00c0\u00b7"+
		"\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c1*\3\2\2\2\u00c2\u00c5\5\63\32\2\u00c3"+
		"\u00c4\7]\2\2\u00c4\u00c6\7_\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2"+
		"\2\u00c6,\3\2\2\2\u00c7\u00c8\7C\2\2\u00c8\u00c9\7F\2\2\u00c9\u00ca\7"+
		"F\2\2\u00ca\u00cb\7P\2\2\u00cb\u00cc\7Q\2\2\u00cc\u00cd\7F\2\2\u00cd\u00ce"+
		"\7G\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7C\2\2\u00d0\u00d1\7F\2\2\u00d1\u00d2"+
		"\7F\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7F\2\2\u00d4\u00d5\7I\2\2\u00d5"+
		"\u00d6\7G\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7O\2\2\u00d8\u00d9\7Q\2\2\u00d9"+
		"\u00da\7F\2\2\u00da\u00db\7K\2\2\u00db\u00dc\7H\2\2\u00dc\u00dd\7[\2\2"+
		"\u00dd\u00de\7P\2\2\u00de\u00df\7Q\2\2\u00df\u00e0\7F\2\2\u00e0\u00e1"+
		"\7G\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7K\2\2\u00e3\u00e4\7P\2\2\u00e4\u010b"+
		"\7V\2\2\u00e5\u00e6\7H\2\2\u00e6\u00e7\7N\2\2\u00e7\u00e8\7Q\2\2\u00e8"+
		"\u00e9\7C\2\2\u00e9\u010b\7V\2\2\u00ea\u00eb\7X\2\2\u00eb\u00ec\7Q\2\2"+
		"\u00ec\u00ed\7K\2\2\u00ed\u010b\7F\2\2\u00ee\u00ef\7D\2\2\u00ef\u00f0"+
		"\7Q\2\2\u00f0\u00f1\7Q\2\2\u00f1\u010b\7N\2\2\u00f2\u00f3\7I\2\2\u00f3"+
		"\u00f4\7T\2\2\u00f4\u00f5\7C\2\2\u00f5\u00f6\7R\2\2\u00f6\u010b\7J\2\2"+
		"\u00f7\u00f8\7P\2\2\u00f8\u00f9\7Q\2\2\u00f9\u00fa\7F\2\2\u00fa\u010b"+
		"\7G\2\2\u00fb\u00fc\7G\2\2\u00fc\u00fd\7F\2\2\u00fd\u00fe\7I\2\2\u00fe"+
		"\u010b\7G\2\2\u00ff\u0100\7R\2\2\u0100\u0101\7Q\2\2\u0101\u0102\7K\2\2"+
		"\u0102\u0103\7P\2\2\u0103\u010b\7V\2\2\u0104\u0105\7U\2\2\u0105\u0106"+
		"\7V\2\2\u0106\u0107\7T\2\2\u0107\u0108\7K\2\2\u0108\u0109\7P\2\2\u0109"+
		"\u010b\7I\2\2\u010a\u00e2\3\2\2\2\u010a\u00e5\3\2\2\2\u010a\u00ea\3\2"+
		"\2\2\u010a\u00ee\3\2\2\2\u010a\u00f2\3\2\2\2\u010a\u00f7\3\2\2\2\u010a"+
		"\u00fb\3\2\2\2\u010a\u00ff\3\2\2\2\u010a\u0104\3\2\2\2\u010b\64\3\2\2"+
		"\2\u010c\u010d\7/\2\2\u010d\u010e\7/\2\2\u010e\u0112\3\2\2\2\u010f\u0111"+
		"\n\6\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\b\33"+
		"\2\2\u0116\66\3\2\2\2\u0117\u0119\t\7\2\2\u0118\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\b\34\2\2\u011d8\3\2\2\2\u011e\u011f\7=\2\2\u011f:\3\2\2\2\u0120"+
		"\u0121\7,\2\2\u0121<\3\2\2\2\u0122\u0123\7\61\2\2\u0123>\3\2\2\2\u0124"+
		"\u0125\7-\2\2\u0125@\3\2\2\2\u0126\u0127\7/\2\2\u0127B\3\2\2\2\u0128\u012a"+
		"\7@\2\2\u0129\u012b\7?\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"D\3\2\2\2\u012c\u012e\7>\2\2\u012d\u012f\7?\2\2\u012e\u012d\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012fF\3\2\2\2\u0130\u0131\7?\2\2\u0131\u0132\7?\2\2\u0132"+
		"H\3\2\2\2\30\2w|\177\u0086\u0089\u008c\u0091\u0097\u009b\u00a1\u00a3\u00aa"+
		"\u00ac\u00b5\u00c0\u00c5\u010a\u0112\u011a\u012a\u012e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}