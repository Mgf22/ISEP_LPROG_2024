grammar JobRequirementsGrammar;

file: (entry | Comment | WS)+ EOF;

entry
    : experienceEntry
    | degreeEntry
    | specializationNameEntry
    | programmingLanguagesEntry
    | knownLanguagesEntry
    | softSkillsEntry
    ;

experienceEntry
    : 'Experience-years:' EXPERIENCEYEARS
    ;

degreeEntry
    : 'Academic-degree:' DEGREE
    ;
    
specializationNameEntry
    : 'Specialization:' specializationNameOption
    ;

specializationNameOption
    :FREE_TEXT(FREE_TEXT)*
    ;

programmingLanguagesEntry
    : 'Programming-Languages:' programmingLanguageList
    ;

knownLanguagesEntry
    : 'Known-languages:' knownLanguageList
    ;

softSkillsEntry
    : 'Soft-Skills:' softSkillList
    ;

programmingLanguageList
    : FREE_TEXT(','FREE_TEXT)*
    ;

knownLanguageList
    : FREE_TEXT(','FREE_TEXT)*
    ;

softSkillList
    : FREE_TEXT(','FREE_TEXT)*
    ;

DEGREE: 'None' | 'Bachelor' | 'Master' | 'PhD';
FREE_TEXT: [a-zA-Z]+;
EXPERIENCEYEARS: [0-9]+;

Comment: '#' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;
