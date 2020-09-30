// Generated from d:\Pessoal\XTPlusPlusANTLR\XTPlusPlusANTLR\src\main\java\antlr4\XTPlusPlusGrammar.g4 by ANTLR 4.8
package antlr4.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XTPlusPlusGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXTO=1, ESPACO=2, NOVA_LINHA=3, COMENTARIO=4, DEC=5, ALG=6, INIB=7, FIMB=8, 
		LER=9, ESC=10, SE=11, ENT=12, ENQ=13, ARM=14, INT=15, REA=16, EM=17, FIM=18, 
		MAIS=19, MENOS=20, MULT=21, DIV=22, IGUAL=23, MENOR=24, MENOR_IGUAL=25, 
		MAIOR=26, MAIOR_IGUAL=27, DIFERENTE=28, E=29, OU=30, ABRIR_PARENTESES=31, 
		FECHAR_PARENTESES=32, CERQUILHA=33, DOIS_PONTOS=34, NUM_INTEIRO=35, NUM_REAL=36, 
		V=37, DIGITO=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TEXTO", "ESPACO", "NOVA_LINHA", "COMENTARIO", "DEC", "ALG", "INIB", 
			"FIMB", "LER", "ESC", "SE", "ENT", "ENQ", "ARM", "INT", "REA", "EM", 
			"FIM", "MAIS", "MENOS", "MULT", "DIV", "IGUAL", "MENOR", "MENOR_IGUAL", 
			"MAIOR", "MAIOR_IGUAL", "DIFERENTE", "E", "OU", "ABRIR_PARENTESES", "FECHAR_PARENTESES", 
			"CERQUILHA", "DOIS_PONTOS", "NUM_INTEIRO", "NUM_REAL", "V", "LETRA", 
			"DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'DECLARACAO'", "'ALGORITMO'", "'INIB'", 
			"'FIMB'", "'LER'", "'ESCREVER'", "'SE'", "'ENTAO'", "'ENQUANTO'", "'ARMAZENAR'", 
			"'INTEIRO'", "'REAL'", "'EM'", "'FIM'", "'+'", "'-'", "'*'", "'/'", "'='", 
			"'<'", "'<='", "'>'", "'>='", "'<>'", "'E'", "'OU'", "'('", "')'", "'#'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXTO", "ESPACO", "NOVA_LINHA", "COMENTARIO", "DEC", "ALG", "INIB", 
			"FIMB", "LER", "ESC", "SE", "ENT", "ENQ", "ARM", "INT", "REA", "EM", 
			"FIM", "MAIS", "MENOS", "MULT", "DIV", "IGUAL", "MENOR", "MENOR_IGUAL", 
			"MAIOR", "MAIOR_IGUAL", "DIFERENTE", "E", "OU", "ABRIR_PARENTESES", "FECHAR_PARENTESES", 
			"CERQUILHA", "DOIS_PONTOS", "NUM_INTEIRO", "NUM_REAL", "V", "DIGITO"
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


	public XTPlusPlusGrammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XTPlusPlusGrammar.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			TEXTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			DEC_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			ALG_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			INIB_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			FIMB_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			LER_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			ESC_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			SE_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			ENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			ENQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			ARM_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			REA_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			EM_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			FIM_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			MAIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			MENOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			MULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			DIV_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			IGUAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			MENOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			MENOR_IGUAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			MAIOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			MAIOR_IGUAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			DIFERENTE_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			E_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			OU_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			ABRIR_PARENTESES_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			FECHAR_PARENTESES_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			CERQUILHA_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			DOIS_PONTOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			NUM_INTEIRO_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			NUM_REAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			V_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEXTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.print("[C,"+getText()+"]");
			break;
		}
	}
	private void DEC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.print("[DEC,"+getText()+"]");
			break;
		}
	}
	private void ALG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.print("[ALG,"+getText()+"]");
			break;
		}
	}
	private void INIB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.print("[INIB,"+getText()+"]");
			break;
		}
	}
	private void FIMB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.print("[FIMB,"+getText()+"]");
			break;
		}
	}
	private void LER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.print("[LER,"+getText()+"]");
			break;
		}
	}
	private void ESC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.print("[ESC,"+getText()+"]");
			break;
		}
	}
	private void SE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.print("[SE,"+getText()+"]");
			break;
		}
	}
	private void ENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.print("[ENT,"+getText()+"]");
			break;
		}
	}
	private void ENQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.print("[ENQ,"+getText()+"]");
			break;
		}
	}
	private void ARM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.print("[ARM,"+getText()+"]");
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			System.out.print("[INT,"+getText()+"]");
			break;
		}
	}
	private void REA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			System.out.print("[REA,"+getText()+"]");
			break;
		}
	}
	private void EM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			System.out.print("[EM,"+getText()+"]");
			break;
		}
	}
	private void FIM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			System.out.print("[FIM,"+getText()+"]");
			break;
		}
	}
	private void MAIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			System.out.print("[OA,"+getText()+"]");
			break;
		}
	}
	private void MENOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			System.out.print("[OA,"+getText()+"]");
			break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			System.out.print("[OA,"+getText()+"]");
			break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			System.out.print("[OA,"+getText()+"]");
			break;
		}
	}
	private void IGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			System.out.print("[OR,"+getText()+"]");
			break;
		}
	}
	private void MENOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			System.out.print("[OR,"+getText()+"]");
			break;
		}
	}
	private void MENOR_IGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			System.out.print("[OR,"+getText()+"]");
			break;
		}
	}
	private void MAIOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			System.out.print("[OR,"+getText()+"]");
			break;
		}
	}
	private void MAIOR_IGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			System.out.print("[OR,"+getText()+"]");
			break;
		}
	}
	private void DIFERENTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			System.out.print("[OR,"+getText()+"]");
			break;
		}
	}
	private void E_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			System.out.print("[OB,"+getText()+"]");
			break;
		}
	}
	private void OU_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			System.out.print("[OB,"+getText()+"]");
			break;
		}
	}
	private void ABRIR_PARENTESES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			System.out.print("[Ap,"+getText()+"]");
			break;
		}
	}
	private void FECHAR_PARENTESES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:
			System.out.print("[Fp,"+getText()+"]");
			break;
		}
	}
	private void CERQUILHA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:
			System.out.print("[D,"+getText()+"]");
			break;
		}
	}
	private void DOIS_PONTOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:
			System.out.print("[D,"+getText()+"]");
			break;
		}
	}
	private void NUM_INTEIRO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:
			System.out.print("[Ni,"+getText()+"]");
			break;
		}
	}
	private void NUM_REAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			System.out.print("[Nd,"+getText()+"]");
			break;
		}
	}
	private void V_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			System.out.print("[V,"+getText()+"]");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0146\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\7\2T\n\2\f\2"+
		"\16\2W\13\2\3\2\3\2\3\2\3\3\6\3]\n\3\r\3\16\3^\3\3\3\3\3\4\3\4\5\4e\n"+
		"\4\3\4\5\4h\n\4\3\4\3\4\3\5\3\5\7\5n\n\5\f\5\16\5q\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\6$\u0126\n$\r$\16$\u0127\3$\3$\3%\6%\u012d"+
		"\n%\r%\16%\u012e\3%\3%\6%\u0133\n%\r%\16%\u0134\3%\3%\3&\3&\3&\7&\u013c"+
		"\n&\f&\16&\u013f\13&\3&\3&\3\'\3\'\3(\3(\3U\2)\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2"+
		"O(\3\2\5\4\2\13\13\"\"\4\2\f\f\17\17\4\2C\\c|\2\u014e\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5\\\3\2\2\2\7g\3\2\2\2\tk\3\2\2\2\13t\3"+
		"\2\2\2\r\u0081\3\2\2\2\17\u008d\3\2\2\2\21\u0094\3\2\2\2\23\u009b\3\2"+
		"\2\2\25\u00a1\3\2\2\2\27\u00ac\3\2\2\2\31\u00b1\3\2\2\2\33\u00b9\3\2\2"+
		"\2\35\u00c4\3\2\2\2\37\u00d0\3\2\2\2!\u00da\3\2\2\2#\u00e1\3\2\2\2%\u00e6"+
		"\3\2\2\2\'\u00ec\3\2\2\2)\u00ef\3\2\2\2+\u00f2\3\2\2\2-\u00f5\3\2\2\2"+
		"/\u00f8\3\2\2\2\61\u00fb\3\2\2\2\63\u00fe\3\2\2\2\65\u0103\3\2\2\2\67"+
		"\u0106\3\2\2\29\u010b\3\2\2\2;\u0110\3\2\2\2=\u0113\3\2\2\2?\u0118\3\2"+
		"\2\2A\u011b\3\2\2\2C\u011e\3\2\2\2E\u0121\3\2\2\2G\u0125\3\2\2\2I\u012c"+
		"\3\2\2\2K\u0138\3\2\2\2M\u0142\3\2\2\2O\u0144\3\2\2\2QU\7$\2\2RT\13\2"+
		"\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7$"+
		"\2\2YZ\b\2\2\2Z\4\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_"+
		"\3\2\2\2_`\3\2\2\2`a\b\3\3\2a\6\3\2\2\2bd\7\17\2\2ce\7\f\2\2dc\3\2\2\2"+
		"de\3\2\2\2eh\3\2\2\2fh\7\f\2\2gb\3\2\2\2gf\3\2\2\2hi\3\2\2\2ij\b\4\3\2"+
		"j\b\3\2\2\2ko\7&\2\2ln\n\3\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"pr\3\2\2\2qo\3\2\2\2rs\b\5\3\2s\n\3\2\2\2tu\7F\2\2uv\7G\2\2vw\7E\2\2w"+
		"x\7N\2\2xy\7C\2\2yz\7T\2\2z{\7C\2\2{|\7E\2\2|}\7C\2\2}~\7Q\2\2~\177\3"+
		"\2\2\2\177\u0080\b\6\4\2\u0080\f\3\2\2\2\u0081\u0082\7C\2\2\u0082\u0083"+
		"\7N\2\2\u0083\u0084\7I\2\2\u0084\u0085\7Q\2\2\u0085\u0086\7T\2\2\u0086"+
		"\u0087\7K\2\2\u0087\u0088\7V\2\2\u0088\u0089\7O\2\2\u0089\u008a\7Q\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008c\b\7\5\2\u008c\16\3\2\2\2\u008d\u008e"+
		"\7K\2\2\u008e\u008f\7P\2\2\u008f\u0090\7K\2\2\u0090\u0091\7D\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\b\b\6\2\u0093\20\3\2\2\2\u0094\u0095\7H\2\2"+
		"\u0095\u0096\7K\2\2\u0096\u0097\7O\2\2\u0097\u0098\7D\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009a\b\t\7\2\u009a\22\3\2\2\2\u009b\u009c\7N\2\2\u009c"+
		"\u009d\7G\2\2\u009d\u009e\7T\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\n\b"+
		"\2\u00a0\24\3\2\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7U\2\2\u00a3\u00a4"+
		"\7E\2\2\u00a4\u00a5\7T\2\2\u00a5\u00a6\7G\2\2\u00a6\u00a7\7X\2\2\u00a7"+
		"\u00a8\7G\2\2\u00a8\u00a9\7T\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\13"+
		"\t\2\u00ab\26\3\2\2\2\u00ac\u00ad\7U\2\2\u00ad\u00ae\7G\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\b\f\n\2\u00b0\30\3\2\2\2\u00b1\u00b2\7G\2\2\u00b2"+
		"\u00b3\7P\2\2\u00b3\u00b4\7V\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6\7Q\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\r\13\2\u00b8\32\3\2\2\2\u00b9\u00ba"+
		"\7G\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7S\2\2\u00bc\u00bd\7W\2\2\u00bd"+
		"\u00be\7C\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0\7V\2\2\u00c0\u00c1\7Q\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\16\f\2\u00c3\34\3\2\2\2\u00c4\u00c5"+
		"\7C\2\2\u00c5\u00c6\7T\2\2\u00c6\u00c7\7O\2\2\u00c7\u00c8\7C\2\2\u00c8"+
		"\u00c9\7\\\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7P\2\2\u00cb\u00cc\7C\2"+
		"\2\u00cc\u00cd\7T\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\17\r\2\u00cf\36"+
		"\3\2\2\2\u00d0\u00d1\7K\2\2\u00d1\u00d2\7P\2\2\u00d2\u00d3\7V\2\2\u00d3"+
		"\u00d4\7G\2\2\u00d4\u00d5\7K\2\2\u00d5\u00d6\7T\2\2\u00d6\u00d7\7Q\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\20\16\2\u00d9 \3\2\2\2\u00da\u00db"+
		"\7T\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de\7N\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\b\21\17\2\u00e0\"\3\2\2\2\u00e1\u00e2\7G\2"+
		"\2\u00e2\u00e3\7O\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\22\20\2\u00e5"+
		"$\3\2\2\2\u00e6\u00e7\7H\2\2\u00e7\u00e8\7K\2\2\u00e8\u00e9\7O\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\b\23\21\2\u00eb&\3\2\2\2\u00ec\u00ed\7-\2\2"+
		"\u00ed\u00ee\b\24\22\2\u00ee(\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f1\b"+
		"\25\23\2\u00f1*\3\2\2\2\u00f2\u00f3\7,\2\2\u00f3\u00f4\b\26\24\2\u00f4"+
		",\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\b\27\25\2\u00f7.\3\2\2\2\u00f8"+
		"\u00f9\7?\2\2\u00f9\u00fa\b\30\26\2\u00fa\60\3\2\2\2\u00fb\u00fc\7>\2"+
		"\2\u00fc\u00fd\b\31\27\2\u00fd\62\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\u0100"+
		"\7?\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b\32\30\2\u0102\64\3\2\2\2\u0103"+
		"\u0104\7@\2\2\u0104\u0105\b\33\31\2\u0105\66\3\2\2\2\u0106\u0107\7@\2"+
		"\2\u0107\u0108\7?\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b\34\32\2\u010a"+
		"8\3\2\2\2\u010b\u010c\7>\2\2\u010c\u010d\7@\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\b\35\33\2\u010f:\3\2\2\2\u0110\u0111\7G\2\2\u0111\u0112\b\36\34"+
		"\2\u0112<\3\2\2\2\u0113\u0114\7Q\2\2\u0114\u0115\7W\2\2\u0115\u0116\3"+
		"\2\2\2\u0116\u0117\b\37\35\2\u0117>\3\2\2\2\u0118\u0119\7*\2\2\u0119\u011a"+
		"\b \36\2\u011a@\3\2\2\2\u011b\u011c\7+\2\2\u011c\u011d\b!\37\2\u011dB"+
		"\3\2\2\2\u011e\u011f\7%\2\2\u011f\u0120\b\" \2\u0120D\3\2\2\2\u0121\u0122"+
		"\7<\2\2\u0122\u0123\b#!\2\u0123F\3\2\2\2\u0124\u0126\5O(\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\b$\"\2\u012aH\3\2\2\2\u012b\u012d\5O(\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7.\2\2\u0131\u0133\5O(\2\u0132\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\b%#\2\u0137J\3\2\2\2\u0138\u013d\5M\'\2\u0139"+
		"\u013c\5M\'\2\u013a\u013c\5O(\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2"+
		"\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\b&$\2\u0141L\3\2\2\2\u0142\u0143"+
		"\t\4\2\2\u0143N\3\2\2\2\u0144\u0145\4\62;\2\u0145P\3\2\2\2\r\2U^dgo\u0127"+
		"\u012e\u0134\u013b\u013d%\3\2\2\b\2\2\3\6\3\3\7\4\3\b\5\3\t\6\3\n\7\3"+
		"\13\b\3\f\t\3\r\n\3\16\13\3\17\f\3\20\r\3\21\16\3\22\17\3\23\20\3\24\21"+
		"\3\25\22\3\26\23\3\27\24\3\30\25\3\31\26\3\32\27\3\33\30\3\34\31\3\35"+
		"\32\3\36\33\3\37\34\3 \35\3!\36\3\"\37\3# \3$!\3%\"\3&#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}