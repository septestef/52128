grammar Schedule;

schedule
    : time_field (WS+ time_field)*
    ;

time_field
    : value
    | range
    | step
    | wildcard
    | list
    | predefined
    ;

value
    : number
    ;

range
    : number '-' number ('/' number)?
    ;

step
    : (wildcard | range | value) '/' number
    ;

wildcard
    : '*'
    ;

list
    : item (',' item)*
    ;

item
    : value
    | range
    ;

predefined
    : '@yearly'
    | '@monthly'
    | '@weekly'
    | '@daily'
    | '@hourly'
    | '@reboot'
    ;

number
    : DIGIT+
    ;

DIGIT : [0-9];

// Ignorar espacios
WS : [ \t\r\n]+ -> skip ;

// Tokens individuales si necesitas analizarlos en tabla de tokens
STAR        : '*';
DASH        : '-';
SLASH       : '/';
COMMA       : ',';
AT          : '@';
COLON      : ':';
SEMICOLON  : ';';
LPAREN     : '(';
RPAREN     : ')';
// Comentarios
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
