// Generated from c:/Users/Ema/prueba/Prueba.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PruebaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USUARIO=1, VERDADERO=2, FALSO=3, IGUAL=4, SEMI=5, LPAREN=6, RPAREN=7, 
		NUMERO=8, STRING=9, ID=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"USUARIO", "VERDADERO", "FALSO", "IGUAL", "SEMI", "LPAREN", "RPAREN", 
			"NUMERO", "STRING", "LETRA", "DIGITO", "SIMBOLO", "ESPACIO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'usuario'", "'verdadero'", "'falso'", "'='", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USUARIO", "VERDADERO", "FALSO", "IGUAL", "SEMI", "LPAREN", "RPAREN", 
			"NUMERO", "STRING", "ID", "WS"
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


	public PruebaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Prueba.g4"; }

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
		"\u0004\u0000\u000bg\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007A\b\u0007\u000b\u0007\f\u0007"+
		"B\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bJ\b\b\n\b\f\bM\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\\\b\r\n\r\f\r_\t\r\u0001\u000e"+
		"\u0004\u000eb\b\u000e\u000b\u000e\f\u000ec\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\u0000\u0015\u0000\u0017\u0000\u0019"+
		"\u0000\u001b\n\u001d\u000b\u0001\u0000\u0004\u0001\u000009\u0002\u0000"+
		"AZaz\u0006\u0000!!\'\',,..:;??\u0003\u0000\t\n\f\r  j\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000"+
		"\u00051\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t9\u0001"+
		"\u0000\u0000\u0000\u000b;\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000"+
		"\u0000\u000f@\u0001\u0000\u0000\u0000\u0011D\u0001\u0000\u0000\u0000\u0013"+
		"P\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017T\u0001"+
		"\u0000\u0000\u0000\u0019V\u0001\u0000\u0000\u0000\u001bX\u0001\u0000\u0000"+
		"\u0000\u001da\u0001\u0000\u0000\u0000\u001f \u0005u\u0000\u0000 !\u0005"+
		"s\u0000\u0000!\"\u0005u\u0000\u0000\"#\u0005a\u0000\u0000#$\u0005r\u0000"+
		"\u0000$%\u0005i\u0000\u0000%&\u0005o\u0000\u0000&\u0002\u0001\u0000\u0000"+
		"\u0000\'(\u0005v\u0000\u0000()\u0005e\u0000\u0000)*\u0005r\u0000\u0000"+
		"*+\u0005d\u0000\u0000+,\u0005a\u0000\u0000,-\u0005d\u0000\u0000-.\u0005"+
		"e\u0000\u0000./\u0005r\u0000\u0000/0\u0005o\u0000\u00000\u0004\u0001\u0000"+
		"\u0000\u000012\u0005f\u0000\u000023\u0005a\u0000\u000034\u0005l\u0000"+
		"\u000045\u0005s\u0000\u000056\u0005o\u0000\u00006\u0006\u0001\u0000\u0000"+
		"\u000078\u0005=\u0000\u00008\b\u0001\u0000\u0000\u00009:\u0005;\u0000"+
		"\u0000:\n\u0001\u0000\u0000\u0000;<\u0005(\u0000\u0000<\f\u0001\u0000"+
		"\u0000\u0000=>\u0005)\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?A\u0007"+
		"\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0010\u0001\u0000"+
		"\u0000\u0000DK\u0005\'\u0000\u0000EJ\u0003\u0013\t\u0000FJ\u0003\u0015"+
		"\n\u0000GJ\u0003\u0019\f\u0000HJ\u0003\u0017\u000b\u0000IE\u0001\u0000"+
		"\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NO\u0005\'\u0000\u0000O\u0012\u0001\u0000\u0000\u0000PQ\u0007\u0001"+
		"\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000"+
		"S\u0016\u0001\u0000\u0000\u0000TU\u0007\u0002\u0000\u0000U\u0018\u0001"+
		"\u0000\u0000\u0000VW\u0005 \u0000\u0000W\u001a\u0001\u0000\u0000\u0000"+
		"X]\u0003\u0013\t\u0000Y\\\u0003\u0013\t\u0000Z\\\u0003\u0015\n\u0000["+
		"Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u001c\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0007\u0003\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0006\u000e"+
		"\u0000\u0000f\u001e\u0001\u0000\u0000\u0000\u0007\u0000BIK[]c\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}