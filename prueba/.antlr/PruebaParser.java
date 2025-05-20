// Generated from c:/Users/Ema/prueba/Prueba.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PruebaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USUARIO=1, VERDADERO=2, FALSO=3, IGUAL=4, SEMI=5, LPAREN=6, RPAREN=7, 
		NUMERO=8, STRING=9, ID=10, WS=11;
	public static final int
		RULE_programa = 0, RULE_usuario = 1, RULE_atributo = 2, RULE_valor = 3, 
		RULE_numero = 4, RULE_cadena = 5, RULE_booleano = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "usuario", "atributo", "valor", "numero", "cadena", "booleano"
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

	@Override
	public String getGrammarFileName() { return "Prueba.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PruebaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PruebaParser.EOF, 0); }
		public List<UsuarioContext> usuario() {
			return getRuleContexts(UsuarioContext.class);
		}
		public UsuarioContext usuario(int i) {
			return getRuleContext(UsuarioContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USUARIO) {
				{
				{
				setState(14);
				usuario();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
	public static class UsuarioContext extends ParserRuleContext {
		public TerminalNode USUARIO() { return getToken(PruebaParser.USUARIO, 0); }
		public TerminalNode ID() { return getToken(PruebaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PruebaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PruebaParser.RPAREN, 0); }
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public UsuarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usuario; }
	}

	public final UsuarioContext usuario() throws RecognitionException {
		UsuarioContext _localctx = new UsuarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_usuario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(USUARIO);
			setState(23);
			match(ID);
			setState(24);
			match(LPAREN);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(25);
				atributo();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(RPAREN);
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
	public static class AtributoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PruebaParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(PruebaParser.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PruebaParser.SEMI, 0); }
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ID);
			setState(34);
			match(IGUAL);
			setState(35);
			valor();
			setState(36);
			match(SEMI);
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
	public static class ValorContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valor);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				numero();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				cadena();
				}
				break;
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				booleano();
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
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(PruebaParser.NUMERO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(NUMERO);
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
	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PruebaParser.STRING, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(STRING);
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
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode VERDADERO() { return getToken(PruebaParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(PruebaParser.FALSO, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==VERDADERO || _la==FALSO) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u000b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001"+
		"\f\u0001\u001e\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003*\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u0000\u0001\u0001\u0000\u0002\u0003.\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000"+
		"\u0000\u0006)\u0001\u0000\u0000\u0000\b+\u0001\u0000\u0000\u0000\n-\u0001"+
		"\u0000\u0000\u0000\f/\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002"+
		"\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000"+
		"\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\n\u0000"+
		"\u0000\u0018\u001c\u0005\u0006\u0000\u0000\u0019\u001b\u0003\u0004\u0002"+
		"\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000"+
		"\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000"+
		"\u0000\u001f \u0005\u0007\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!"+
		"\"\u0005\n\u0000\u0000\"#\u0005\u0004\u0000\u0000#$\u0003\u0006\u0003"+
		"\u0000$%\u0005\u0005\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&*\u0003"+
		"\b\u0004\u0000\'*\u0003\n\u0005\u0000(*\u0003\f\u0006\u0000)&\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0007"+
		"\u0001\u0000\u0000\u0000+,\u0005\b\u0000\u0000,\t\u0001\u0000\u0000\u0000"+
		"-.\u0005\t\u0000\u0000.\u000b\u0001\u0000\u0000\u0000/0\u0007\u0000\u0000"+
		"\u00000\r\u0001\u0000\u0000\u0000\u0003\u0011\u001c)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}