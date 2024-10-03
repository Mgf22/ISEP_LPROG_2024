grammar interviewGrammar;

file: (entry | COMMENT | WS)+ EOF;

entry
    : springFrameworkQuestion
    | wifiDescriptionQuestion
    | databaseQuestion
    | frontEndTechnologiesQuestion
    | byteInBitsQuestion
    | windowsKeysPriceQuestion
    | windowsReleaseDateQuestion
    | workStartTimeQuestion
    | lprogRatingQuestion
    ;

springFrameworkQuestion
    : 'Spring Framework:' SPRING_FRAMEWORK
    ;

wifiDescriptionQuestion
    : 'WIFI Designation:' wifi_description
    ;

databaseQuestion
    : 'Types of databases:' FREE_TEXT
    ;

frontEndTechnologiesQuestion
    : '2 most used frontend technologies:' multipleAnswer
    ;

byteInBitsQuestion
    : 'Byte in bits:' BYTE
    ;

windowsKeysPriceQuestion
    : 'Windows keys:' WINDOWS_KEYS
    ;

windowsReleaseDateQuestion
    : 'Windows release date:' DATE
    ;

workStartTimeQuestion
    : 'Hour to start working:' TIME
    ;

lprogRatingQuestion
    : 'LPROG work:' LPROG
    ;

wifi_description
    :FREE_TEXT(FREE_TEXT)*
    ;

multipleAnswer
    : FREE_TEXT(','FREE_TEXT)*
    ;

SPRING_FRAMEWORK: 'V' | 'F';
BYTE: [0-9]+;
WINDOWS_KEYS: DECIMAL;
DATE: DAY'/'MONTH'/'YEAR;
TIME: HOURS':'MINUTES;
LPROG: [1-5]'/5';

FREE_TEXT: [a-zA-Z]+;
SPACE: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;
DECIMAL: DIGIT+ ('.' DIGIT*)?;
DIGIT: [0-9];
DAY: DIGIT DIGIT;
MONTH: DIGIT DIGIT;
YEAR: DIGIT DIGIT DIGIT DIGIT;
HOURS: DIGIT DIGIT;
MINUTES: DIGIT DIGIT;
