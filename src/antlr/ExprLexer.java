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
		T__9=10, T__10=11, T__11=12, BEGM=13, ENDM=14, SEP=15, ID=16, NUM=17, 
		INT=18, FLOAT=19, STRING=20, BOOL=21, TYPE=22, BASIC_TYPE=23, COMMENT=24, 
		WHITE_SPACE=25, END=26, MUL=27, DIV=28, ADD=29, SUB=30, GEQ=31, SEQ=32, 
		EQU=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "BEGM", "ENDM", "SEP", "ID", "NUM", "INT", 
			"FLOAT", "DIGIT", "STRING", "ESC", "BOOL", "TYPE", "BASIC_TYPE", "COMMENT", 
			"WHITE_SPACE", "END", "MUL", "DIV", "ADD", "SUB", "GEQ", "SEQ", "EQU"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'!'", "'('", "')'", "'graph('", "'node('", "'edge('", 
			"'point('", "'ADDNODE('", "'ADDEDGE('", "'MODIFYNODE('", "'['", "']'", 
			"','", null, null, null, null, null, null, null, null, null, null, "';'", 
			"'*'", "'/'", "'+'", "'-'", null, null, "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BEGM", "ENDM", "SEP", "ID", "NUM", "INT", "FLOAT", "STRING", "BOOL", 
			"TYPE", "BASIC_TYPE", "COMMENT", "WHITE_SPACE", "END", "MUL", "DIV", 
			"ADD", "SUB", "GEQ", "SEQ", "EQU"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0136\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21\u0094"+
		"\n\21\f\21\16\21\u0097\13\21\3\22\3\22\5\22\u009b\n\22\3\23\5\23\u009e"+
		"\n\23\3\23\3\23\3\23\7\23\u00a3\n\23\f\23\16\23\u00a6\13\23\5\23\u00a8"+
		"\n\23\3\24\5\24\u00ab\n\24\3\24\6\24\u00ae\n\24\r\24\16\24\u00af\3\24"+
		"\3\24\7\24\u00b4\n\24\f\24\16\24\u00b7\13\24\3\24\5\24\u00ba\n\24\3\24"+
		"\3\24\6\24\u00be\n\24\r\24\16\24\u00bf\5\24\u00c2\n\24\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u00c9\n\26\f\26\16\26\u00cc\13\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u00d4\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00df\n\30\3\31\3\31\3\31\5\31\u00e4\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u010e\n\32\3\33\3\33\3\33"+
		"\3\33\7\33\u0114\n\33\f\33\16\33\u0117\13\33\3\33\3\33\3\34\6\34\u011c"+
		"\n\34\r\34\16\34\u011d\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3"+
		"!\3!\3\"\3\"\5\"\u012e\n\"\3#\3#\5#\u0132\n#\3$\3$\3$\3\u00ca\2%\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\2+\26-\2/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37"+
		"A C!E\"G#\3\2\b\3\2c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2"+
		"\13\f\17\17\"\"\2\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2"+
		"\17Z\3\2\2\2\21`\3\2\2\2\23f\3\2\2\2\25m\3\2\2\2\27v\3\2\2\2\31\177\3"+
		"\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u0091\3\2\2"+
		"\2#\u009a\3\2\2\2%\u009d\3\2\2\2\'\u00c1\3\2\2\2)\u00c3\3\2\2\2+\u00c5"+
		"\3\2\2\2-\u00d3\3\2\2\2/\u00de\3\2\2\2\61\u00e0\3\2\2\2\63\u010d\3\2\2"+
		"\2\65\u010f\3\2\2\2\67\u011b\3\2\2\29\u0121\3\2\2\2;\u0123\3\2\2\2=\u0125"+
		"\3\2\2\2?\u0127\3\2\2\2A\u0129\3\2\2\2C\u012b\3\2\2\2E\u012f\3\2\2\2G"+
		"\u0133\3\2\2\2IJ\7<\2\2J\4\3\2\2\2KL\7?\2\2L\6\3\2\2\2MN\7#\2\2N\b\3\2"+
		"\2\2OP\7*\2\2P\n\3\2\2\2QR\7+\2\2R\f\3\2\2\2ST\7i\2\2TU\7t\2\2UV\7c\2"+
		"\2VW\7r\2\2WX\7j\2\2XY\7*\2\2Y\16\3\2\2\2Z[\7p\2\2[\\\7q\2\2\\]\7f\2\2"+
		"]^\7g\2\2^_\7*\2\2_\20\3\2\2\2`a\7g\2\2ab\7f\2\2bc\7i\2\2cd\7g\2\2de\7"+
		"*\2\2e\22\3\2\2\2fg\7r\2\2gh\7q\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2kl\7*\2"+
		"\2l\24\3\2\2\2mn\7C\2\2no\7F\2\2op\7F\2\2pq\7P\2\2qr\7Q\2\2rs\7F\2\2s"+
		"t\7G\2\2tu\7*\2\2u\26\3\2\2\2vw\7C\2\2wx\7F\2\2xy\7F\2\2yz\7G\2\2z{\7"+
		"F\2\2{|\7I\2\2|}\7G\2\2}~\7*\2\2~\30\3\2\2\2\177\u0080\7O\2\2\u0080\u0081"+
		"\7Q\2\2\u0081\u0082\7F\2\2\u0082\u0083\7K\2\2\u0083\u0084\7H\2\2\u0084"+
		"\u0085\7[\2\2\u0085\u0086\7P\2\2\u0086\u0087\7Q\2\2\u0087\u0088\7F\2\2"+
		"\u0088\u0089\7G\2\2\u0089\u008a\7*\2\2\u008a\32\3\2\2\2\u008b\u008c\7"+
		"]\2\2\u008c\34\3\2\2\2\u008d\u008e\7_\2\2\u008e\36\3\2\2\2\u008f\u0090"+
		"\7.\2\2\u0090 \3\2\2\2\u0091\u0095\t\2\2\2\u0092\u0094\t\3\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009b\5%\23\2\u0099\u009b\5\'\24"+
		"\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b$\3\2\2\2\u009c\u009e"+
		"\7/\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a7\3\2\2\2\u009f"+
		"\u00a8\7\62\2\2\u00a0\u00a4\t\4\2\2\u00a1\u00a3\5)\25\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2"+
		"\2\2\u00a8&\3\2\2\2\u00a9\u00ab\7/\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00ae\5)\25\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b5\7\60\2\2\u00b2\u00b4\5)\25\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c2\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\7/\2\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\7\60\2\2\u00bc\u00be\5"+
		")\25\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00aa\3\2\2\2\u00c1\u00b9\3\2"+
		"\2\2\u00c2(\3\2\2\2\u00c3\u00c4\t\5\2\2\u00c4*\3\2\2\2\u00c5\u00ca\7$"+
		"\2\2\u00c6\u00c9\5-\27\2\u00c7\u00c9\13\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce"+
		",\3\2\2\2\u00cf\u00d0\7^\2\2\u00d0\u00d4\7$\2\2\u00d1\u00d2\7^\2\2\u00d2"+
		"\u00d4\7^\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4.\3\2\2\2\u00d5"+
		"\u00d6\7V\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7w\2\2\u00d8\u00df\7g\2\2"+
		"\u00d9\u00da\7H\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\u00df\7g\2\2\u00de\u00d5\3\2\2\2\u00de\u00d9\3\2\2\2\u00df"+
		"\60\3\2\2\2\u00e0\u00e3\5\63\32\2\u00e1\u00e2\7]\2\2\u00e2\u00e4\7_\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\62\3\2\2\2\u00e5\u00e6"+
		"\7K\2\2\u00e6\u00e7\7P\2\2\u00e7\u010e\7V\2\2\u00e8\u00e9\7H\2\2\u00e9"+
		"\u00ea\7N\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7C\2\2\u00ec\u010e\7V\2\2"+
		"\u00ed\u00ee\7X\2\2\u00ee\u00ef\7Q\2\2\u00ef\u00f0\7K\2\2\u00f0\u010e"+
		"\7F\2\2\u00f1\u00f2\7D\2\2\u00f2\u00f3\7Q\2\2\u00f3\u00f4\7Q\2\2\u00f4"+
		"\u010e\7N\2\2\u00f5\u00f6\7I\2\2\u00f6\u00f7\7T\2\2\u00f7\u00f8\7C\2\2"+
		"\u00f8\u00f9\7R\2\2\u00f9\u010e\7J\2\2\u00fa\u00fb\7P\2\2\u00fb\u00fc"+
		"\7Q\2\2\u00fc\u00fd\7F\2\2\u00fd\u010e\7G\2\2\u00fe\u00ff\7G\2\2\u00ff"+
		"\u0100\7F\2\2\u0100\u0101\7I\2\2\u0101\u010e\7G\2\2\u0102\u0103\7R\2\2"+
		"\u0103\u0104\7Q\2\2\u0104\u0105\7K\2\2\u0105\u0106\7P\2\2\u0106\u010e"+
		"\7V\2\2\u0107\u0108\7U\2\2\u0108\u0109\7V\2\2\u0109\u010a\7T\2\2\u010a"+
		"\u010b\7K\2\2\u010b\u010c\7P\2\2\u010c\u010e\7I\2\2\u010d\u00e5\3\2\2"+
		"\2\u010d\u00e8\3\2\2\2\u010d\u00ed\3\2\2\2\u010d\u00f1\3\2\2\2\u010d\u00f5"+
		"\3\2\2\2\u010d\u00fa\3\2\2\2\u010d\u00fe\3\2\2\2\u010d\u0102\3\2\2\2\u010d"+
		"\u0107\3\2\2\2\u010e\64\3\2\2\2\u010f\u0110\7/\2\2\u0110\u0111\7/\2\2"+
		"\u0111\u0115\3\2\2\2\u0112\u0114\n\6\2\2\u0113\u0112\3\2\2\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0119\b\33\2\2\u0119\66\3\2\2\2\u011a\u011c\t\7\2"+
		"\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\34\2\2\u01208\3\2\2\2\u0121"+
		"\u0122\7=\2\2\u0122:\3\2\2\2\u0123\u0124\7,\2\2\u0124<\3\2\2\2\u0125\u0126"+
		"\7\61\2\2\u0126>\3\2\2\2\u0127\u0128\7-\2\2\u0128@\3\2\2\2\u0129\u012a"+
		"\7/\2\2\u012aB\3\2\2\2\u012b\u012d\7@\2\2\u012c\u012e\7?\2\2\u012d\u012c"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012eD\3\2\2\2\u012f\u0131\7>\2\2\u0130\u0132"+
		"\7?\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132F\3\2\2\2\u0133\u0134"+
		"\7?\2\2\u0134\u0135\7?\2\2\u0135H\3\2\2\2\30\2\u0095\u009a\u009d\u00a4"+
		"\u00a7\u00aa\u00af\u00b5\u00b9\u00bf\u00c1\u00c8\u00ca\u00d3\u00de\u00e3"+
		"\u010d\u0115\u011d\u012d\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}