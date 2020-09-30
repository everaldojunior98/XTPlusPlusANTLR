lexer grammar XTPlusPlusGrammar;

//Base
TEXTO: '"' .*? '"' {System.out.print("[C,"+getText()+"]");};
ESPACO: [ \t]+ -> skip;
NOVA_LINHA: ('\r' '\n'? | '\n') -> skip;
COMENTARIO: '$' ~ [\r\n]* -> skip;

//KeyWords
DEC: 'DECLARACAO' {System.out.print("[DEC,"+getText()+"]");};
ALG: 'ALGORITMO' {System.out.print("[ALG,"+getText()+"]");};
INIB: 'INIB' {System.out.print("[INIB,"+getText()+"]");};
FIMB: 'FIMB' {System.out.print("[FIMB,"+getText()+"]");};
LER: 'LER' {System.out.print("[LER,"+getText()+"]");};
ESC: 'ESCREVER' {System.out.print("[ESC,"+getText()+"]");};
SE: 'SE' {System.out.print("[SE,"+getText()+"]");};
ENT: 'ENTAO' {System.out.print("[ENT,"+getText()+"]");};
ENQ: 'ENQUANTO' {System.out.print("[ENQ,"+getText()+"]");};
ARM: 'ARMAZENAR' {System.out.print("[ARM,"+getText()+"]");};
INT: 'INTEIRO' {System.out.print("[INT,"+getText()+"]");};
REA: 'REAL' {System.out.print("[REA,"+getText()+"]");};
EM: 'EM' {System.out.print("[EM,"+getText()+"]");};
FIM: 'FIM' {System.out.print("[FIM,"+getText()+"]");};

//Arithmetic operators
MAIS: '+' {System.out.print("[OA,"+getText()+"]");};
MENOS: '-' {System.out.print("[OA,"+getText()+"]");};
MULT: '*' {System.out.print("[OA,"+getText()+"]");};
DIV: '/' {System.out.print("[OA,"+getText()+"]");};

//Relational operators
IGUAL: '=' {System.out.print("[OR,"+getText()+"]");};
MENOR: '<' {System.out.print("[OR,"+getText()+"]");};
MENOR_IGUAL: '<=' {System.out.print("[OR,"+getText()+"]");};
MAIOR: '>' {System.out.print("[OR,"+getText()+"]");};
MAIOR_IGUAL: '>=' {System.out.print("[OR,"+getText()+"]");};
DIFERENTE: '<>' {System.out.print("[OR,"+getText()+"]");};

//Logical operators
E: 'E' {System.out.print("[OB,"+getText()+"]");};
OU: 'OU' {System.out.print("[OB,"+getText()+"]");};

//Parentheses
ABRIR_PARENTESES: '(' {System.out.print("[Ap,"+getText()+"]");};
FECHAR_PARENTESES: ')' {System.out.print("[Fp,"+getText()+"]");};

//Delimiter
CERQUILHA: '#' {System.out.print("[D,"+getText()+"]");};
DOIS_PONTOS: ':' {System.out.print("[D,"+getText()+"]");};

//Numbers
NUM_INTEIRO: DIGITO+ {System.out.print("[Ni,"+getText()+"]");};
NUM_REAL: DIGITO+ ',' DIGITO+ {System.out.print("[Nd,"+getText()+"]");};

//Outputs
V: LETRA (LETRA | DIGITO)* {System.out.print("[V,"+getText()+"]");};

fragment
LETRA: 'a' ..'z' | 'A' ..'Z';
DIGITO: '0' ..'9';