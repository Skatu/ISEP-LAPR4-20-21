// Generated from C:/lei20_21_s4_2di_02/base.core/src/main/java/eapli/base/antlr/formulario\ValidacaoForm.g4 by ANTLR 4.9.1
package eapli.base.antlr.formulario;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValidacaoFormLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, NUM=19, OPERADOR_BOOL=20, MUL_DIV=21, SOMA_SUB=22, ATRIBUTO=23, 
		STRING=24, WS=25, ERR_CHAR=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "NUM", "OPERADOR_BOOL", "MUL_DIV", "SOMA_SUB", "ATRIBUTO", "STRING", 
			"WS", "ERR_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'form'", "'{'", "'}'", "';'", "'->'", "'AND'", "'OR'", "'['", 
			"']'", "'isEmpty'", "'('", "')'", "'isNotEmpty'", "'match'", "','", "'notMatch'", 
			"'str'", "'length'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NUM", "OPERADOR_BOOL", "MUL_DIV", 
			"SOMA_SUB", "ATRIBUTO", "STRING", "WS", "ERR_CHAR"
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


	public ValidacaoFormLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ValidacaoForm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\5\24\u0085\n\24\3\24\6\24\u0088\n\24\r"+
		"\24\16\24\u0089\3\24\3\24\6\24\u008e\n\24\r\24\16\24\u008f\5\24\u0092"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u009b\n\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\7\30\u00a3\n\30\f\30\16\30\u00a6\13\30\3\31\3\31\3\31"+
		"\3\31\7\31\u00ac\n\31\f\31\16\31\u00af\13\31\3\31\3\31\3\32\6\32\u00b4"+
		"\n\32\r\32\16\32\u00b5\3\32\3\32\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\3\2\t\3\2\62;\5\2\'\',,\61\61\4\2-"+
		"-//\4\2C\\c|\5\2\62;C\\c|\5\2\f\f\17\17$$\5\2\13\f\17\17\"\"\2\u00c5\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5<\3\2\2\2\7>\3\2"+
		"\2\2\t@\3\2\2\2\13B\3\2\2\2\rE\3\2\2\2\17I\3\2\2\2\21L\3\2\2\2\23N\3\2"+
		"\2\2\25P\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35g\3\2\2\2\37m"+
		"\3\2\2\2!o\3\2\2\2#x\3\2\2\2%|\3\2\2\2\'\u0084\3\2\2\2)\u009a\3\2\2\2"+
		"+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a7\3\2\2\2\63\u00b3"+
		"\3\2\2\2\65\u00b9\3\2\2\2\678\7h\2\289\7q\2\29:\7t\2\2:;\7o\2\2;\4\3\2"+
		"\2\2<=\7}\2\2=\6\3\2\2\2>?\7\177\2\2?\b\3\2\2\2@A\7=\2\2A\n\3\2\2\2BC"+
		"\7/\2\2CD\7@\2\2D\f\3\2\2\2EF\7C\2\2FG\7P\2\2GH\7F\2\2H\16\3\2\2\2IJ\7"+
		"Q\2\2JK\7T\2\2K\20\3\2\2\2LM\7]\2\2M\22\3\2\2\2NO\7_\2\2O\24\3\2\2\2P"+
		"Q\7k\2\2QR\7u\2\2RS\7G\2\2ST\7o\2\2TU\7r\2\2UV\7v\2\2VW\7{\2\2W\26\3\2"+
		"\2\2XY\7*\2\2Y\30\3\2\2\2Z[\7+\2\2[\32\3\2\2\2\\]\7k\2\2]^\7u\2\2^_\7"+
		"P\2\2_`\7q\2\2`a\7v\2\2ab\7G\2\2bc\7o\2\2cd\7r\2\2de\7v\2\2ef\7{\2\2f"+
		"\34\3\2\2\2gh\7o\2\2hi\7c\2\2ij\7v\2\2jk\7e\2\2kl\7j\2\2l\36\3\2\2\2m"+
		"n\7.\2\2n \3\2\2\2op\7p\2\2pq\7q\2\2qr\7v\2\2rs\7O\2\2st\7c\2\2tu\7v\2"+
		"\2uv\7e\2\2vw\7j\2\2w\"\3\2\2\2xy\7u\2\2yz\7v\2\2z{\7t\2\2{$\3\2\2\2|"+
		"}\7n\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080\u0081\7v\2\2\u0081"+
		"\u0082\7j\2\2\u0082&\3\2\2\2\u0083\u0085\7/\2\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\t\2\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0091\3\2\2\2\u008b\u008d\7\60\2\2\u008c\u008e\t\2\2\2\u008d\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u0092\3\2\2\2\u0092(\3\2\2\2"+
		"\u0093\u009b\4>@\2\u0094\u0095\7>\2\2\u0095\u009b\7?\2\2\u0096\u0097\7"+
		"@\2\2\u0097\u009b\7?\2\2\u0098\u0099\7>\2\2\u0099\u009b\7@\2\2\u009a\u0093"+
		"\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"*\3\2\2\2\u009c\u009d\t\3\2\2\u009d,\3\2\2\2\u009e\u009f\t\4\2\2\u009f"+
		".\3\2\2\2\u00a0\u00a4\t\5\2\2\u00a1\u00a3\t\6\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\60"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ad\7$\2\2\u00a8\u00ac\n\7\2\2\u00a9"+
		"\u00aa\7$\2\2\u00aa\u00ac\7$\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2"+
		"\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1\62\3\2\2\2\u00b2"+
		"\u00b4\t\b\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\32\2\2\u00b8"+
		"\64\3\2\2\2\u00b9\u00ba\13\2\2\2\u00ba\66\3\2\2\2\f\2\u0084\u0089\u008f"+
		"\u0091\u009a\u00a4\u00ab\u00ad\u00b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}