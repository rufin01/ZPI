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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, NUM=16, INT=17, 
		FLOAT=18, STRING=19, BOOL=20, TYPE=21, BASIC_TYPE=22, COMMENT=23, WHITE_SPACE=24, 
		END=25, MUL=26, DIV=27, ADD=28, SUB=29, GEQ=30, SEQ=31, EQU=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "ID", "NUM", "INT", "FLOAT", 
			"DIGIT", "STRING", "ESC", "BOOL", "TYPE", "BASIC_TYPE", "COMMENT", "WHITE_SPACE", 
			"END", "MUL", "DIV", "ADD", "SUB", "GEQ", "SEQ", "EQU"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'('", "')'", "','", "'!'", "'return'", "'{'", "'}'", 
			"'if'", "'then'", "'else'", "'while'", "'do'", null, null, null, null, 
			null, null, null, null, null, null, "';'", "'*'", "'/'", "'+'", "'-'", 
			null, null, "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "NUM", "INT", "FLOAT", "STRING", "BOOL", "TYPE", 
			"BASIC_TYPE", "COMMENT", "WHITE_SPACE", "END", "MUL", "DIV", "ADD", "SUB", 
			"GEQ", "SEQ", "EQU"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\7\20w\n\20\f\20\16\20z\13\20\3\21\3\21\5\21~\n\21\3\22\5\22"+
		"\u0081\n\22\3\22\3\22\3\22\7\22\u0086\n\22\f\22\16\22\u0089\13\22\5\22"+
		"\u008b\n\22\3\23\5\23\u008e\n\23\3\23\6\23\u0091\n\23\r\23\16\23\u0092"+
		"\3\23\3\23\7\23\u0097\n\23\f\23\16\23\u009a\13\23\3\23\5\23\u009d\n\23"+
		"\3\23\3\23\6\23\u00a1\n\23\r\23\16\23\u00a2\5\23\u00a5\n\23\3\24\3\24"+
		"\3\25\3\25\3\25\7\25\u00ac\n\25\f\25\16\25\u00af\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\5\26\u00b7\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00c2\n\27\3\30\3\30\3\30\5\30\u00c7\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f1\n\31\3\32\3\32"+
		"\3\32\3\32\7\32\u00f7\n\32\f\32\16\32\u00fa\13\32\3\32\3\32\3\33\6\33"+
		"\u00ff\n\33\r\33\16\33\u0100\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\5!\u0111\n!\3\"\3\"\5\"\u0115\n\"\3#\3#\3#\3\u00ad"+
		"\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\2)\25+\2-\26/\27\61\30\63\31\65\32\67\339\34;"+
		"\35=\36?\37A C!E\"\3\2\b\3\2c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u0132\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17"+
		"S\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27a\3\2\2\2\31f\3\2\2\2"+
		"\33k\3\2\2\2\35q\3\2\2\2\37t\3\2\2\2!}\3\2\2\2#\u0080\3\2\2\2%\u00a4\3"+
		"\2\2\2\'\u00a6\3\2\2\2)\u00a8\3\2\2\2+\u00b6\3\2\2\2-\u00c1\3\2\2\2/\u00c3"+
		"\3\2\2\2\61\u00f0\3\2\2\2\63\u00f2\3\2\2\2\65\u00fe\3\2\2\2\67\u0104\3"+
		"\2\2\29\u0106\3\2\2\2;\u0108\3\2\2\2=\u010a\3\2\2\2?\u010c\3\2\2\2A\u010e"+
		"\3\2\2\2C\u0112\3\2\2\2E\u0116\3\2\2\2GH\7<\2\2H\4\3\2\2\2IJ\7?\2\2J\6"+
		"\3\2\2\2KL\7*\2\2L\b\3\2\2\2MN\7+\2\2N\n\3\2\2\2OP\7.\2\2P\f\3\2\2\2Q"+
		"R\7#\2\2R\16\3\2\2\2ST\7t\2\2TU\7g\2\2UV\7v\2\2VW\7w\2\2WX\7t\2\2XY\7"+
		"p\2\2Y\20\3\2\2\2Z[\7}\2\2[\22\3\2\2\2\\]\7\177\2\2]\24\3\2\2\2^_\7k\2"+
		"\2_`\7h\2\2`\26\3\2\2\2ab\7v\2\2bc\7j\2\2cd\7g\2\2de\7p\2\2e\30\3\2\2"+
		"\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\32\3\2\2\2kl\7y\2\2lm\7j\2\2m"+
		"n\7k\2\2no\7n\2\2op\7g\2\2p\34\3\2\2\2qr\7f\2\2rs\7q\2\2s\36\3\2\2\2t"+
		"x\t\2\2\2uw\t\3\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y \3\2\2\2"+
		"zx\3\2\2\2{~\5#\22\2|~\5%\23\2}{\3\2\2\2}|\3\2\2\2~\"\3\2\2\2\177\u0081"+
		"\7/\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008a\3\2\2\2\u0082"+
		"\u008b\7\62\2\2\u0083\u0087\t\4\2\2\u0084\u0086\5\'\24\2\u0085\u0084\3"+
		"\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u0083\3\2"+
		"\2\2\u008b$\3\2\2\2\u008c\u008e\7/\2\2\u008d\u008c\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091\5\'\24\2\u0090\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0098\7\60\2\2\u0095\u0097\5\'\24\2\u0096\u0095\3\2\2\2"+
		"\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a5"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7/\2\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7\60\2\2\u009f\u00a1\5"+
		"\'\24\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u008d\3\2\2\2\u00a4\u009c\3\2"+
		"\2\2\u00a5&\3\2\2\2\u00a6\u00a7\t\5\2\2\u00a7(\3\2\2\2\u00a8\u00ad\7$"+
		"\2\2\u00a9\u00ac\5+\26\2\u00aa\u00ac\13\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1"+
		"*\3\2\2\2\u00b2\u00b3\7^\2\2\u00b3\u00b7\7$\2\2\u00b4\u00b5\7^\2\2\u00b5"+
		"\u00b7\7^\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7,\3\2\2\2\u00b8"+
		"\u00b9\7V\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7w\2\2\u00bb\u00c2\7g\2\2"+
		"\u00bc\u00bd\7H\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\u00c2\7g\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2"+
		".\3\2\2\2\u00c3\u00c6\5\61\31\2\u00c4\u00c5\7]\2\2\u00c5\u00c7\7_\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\60\3\2\2\2\u00c8\u00c9"+
		"\7K\2\2\u00c9\u00ca\7P\2\2\u00ca\u00f1\7V\2\2\u00cb\u00cc\7H\2\2\u00cc"+
		"\u00cd\7N\2\2\u00cd\u00ce\7Q\2\2\u00ce\u00cf\7C\2\2\u00cf\u00f1\7V\2\2"+
		"\u00d0\u00d1\7X\2\2\u00d1\u00d2\7Q\2\2\u00d2\u00d3\7K\2\2\u00d3\u00f1"+
		"\7F\2\2\u00d4\u00d5\7D\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00d7\7Q\2\2\u00d7"+
		"\u00f1\7N\2\2\u00d8\u00d9\7I\2\2\u00d9\u00da\7T\2\2\u00da\u00db\7C\2\2"+
		"\u00db\u00dc\7R\2\2\u00dc\u00f1\7J\2\2\u00dd\u00de\7P\2\2\u00de\u00df"+
		"\7Q\2\2\u00df\u00e0\7F\2\2\u00e0\u00f1\7G\2\2\u00e1\u00e2\7G\2\2\u00e2"+
		"\u00e3\7F\2\2\u00e3\u00e4\7I\2\2\u00e4\u00f1\7G\2\2\u00e5\u00e6\7R\2\2"+
		"\u00e6\u00e7\7Q\2\2\u00e7\u00e8\7K\2\2\u00e8\u00e9\7P\2\2\u00e9\u00f1"+
		"\7V\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7V\2\2\u00ec\u00ed\7T\2\2\u00ed"+
		"\u00ee\7K\2\2\u00ee\u00ef\7P\2\2\u00ef\u00f1\7I\2\2\u00f0\u00c8\3\2\2"+
		"\2\u00f0\u00cb\3\2\2\2\u00f0\u00d0\3\2\2\2\u00f0\u00d4\3\2\2\2\u00f0\u00d8"+
		"\3\2\2\2\u00f0\u00dd\3\2\2\2\u00f0\u00e1\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0"+
		"\u00ea\3\2\2\2\u00f1\62\3\2\2\2\u00f2\u00f3\7/\2\2\u00f3\u00f4\7/\2\2"+
		"\u00f4\u00f8\3\2\2\2\u00f5\u00f7\n\6\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\b\32\2\2\u00fc\64\3\2\2\2\u00fd\u00ff\t\7\2"+
		"\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b\33\2\2\u0103\66\3\2\2\2\u0104"+
		"\u0105\7=\2\2\u01058\3\2\2\2\u0106\u0107\7,\2\2\u0107:\3\2\2\2\u0108\u0109"+
		"\7\61\2\2\u0109<\3\2\2\2\u010a\u010b\7-\2\2\u010b>\3\2\2\2\u010c\u010d"+
		"\7/\2\2\u010d@\3\2\2\2\u010e\u0110\7@\2\2\u010f\u0111\7?\2\2\u0110\u010f"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111B\3\2\2\2\u0112\u0114\7>\2\2\u0113\u0115"+
		"\7?\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115D\3\2\2\2\u0116\u0117"+
		"\7?\2\2\u0117\u0118\7?\2\2\u0118F\3\2\2\2\30\2x}\u0080\u0087\u008a\u008d"+
		"\u0092\u0098\u009c\u00a2\u00a4\u00ab\u00ad\u00b6\u00c1\u00c6\u00f0\u00f8"+
		"\u0100\u0110\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}