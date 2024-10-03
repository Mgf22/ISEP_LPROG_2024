// Generated from C:/Users/Mateus Fernandes/Desktop/ISEP/LPROG/jobs4u.app1/src/main/java/JobRequirements/JobRequirementsGrammar.g4 by ANTLR 4.13.1
package JobRequirements;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JobRequirementsGrammarParser}.
 */
public interface JobRequirementsGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JobRequirementsGrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JobRequirementsGrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(JobRequirementsGrammarParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(JobRequirementsGrammarParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#experienceEntry}.
	 * @param ctx the parse tree
	 */
	void enterExperienceEntry(JobRequirementsGrammarParser.ExperienceEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#experienceEntry}.
	 * @param ctx the parse tree
	 */
	void exitExperienceEntry(JobRequirementsGrammarParser.ExperienceEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#degreeEntry}.
	 * @param ctx the parse tree
	 */
	void enterDegreeEntry(JobRequirementsGrammarParser.DegreeEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#degreeEntry}.
	 * @param ctx the parse tree
	 */
	void exitDegreeEntry(JobRequirementsGrammarParser.DegreeEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#specializationNameEntry}.
	 * @param ctx the parse tree
	 */
	void enterSpecializationNameEntry(JobRequirementsGrammarParser.SpecializationNameEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#specializationNameEntry}.
	 * @param ctx the parse tree
	 */
	void exitSpecializationNameEntry(JobRequirementsGrammarParser.SpecializationNameEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#specializationNameOption}.
	 * @param ctx the parse tree
	 */
	void enterSpecializationNameOption(JobRequirementsGrammarParser.SpecializationNameOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#specializationNameOption}.
	 * @param ctx the parse tree
	 */
	void exitSpecializationNameOption(JobRequirementsGrammarParser.SpecializationNameOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#programmingLanguagesEntry}.
	 * @param ctx the parse tree
	 */
	void enterProgrammingLanguagesEntry(JobRequirementsGrammarParser.ProgrammingLanguagesEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#programmingLanguagesEntry}.
	 * @param ctx the parse tree
	 */
	void exitProgrammingLanguagesEntry(JobRequirementsGrammarParser.ProgrammingLanguagesEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#knownLanguagesEntry}.
	 * @param ctx the parse tree
	 */
	void enterKnownLanguagesEntry(JobRequirementsGrammarParser.KnownLanguagesEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#knownLanguagesEntry}.
	 * @param ctx the parse tree
	 */
	void exitKnownLanguagesEntry(JobRequirementsGrammarParser.KnownLanguagesEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#softSkillsEntry}.
	 * @param ctx the parse tree
	 */
	void enterSoftSkillsEntry(JobRequirementsGrammarParser.SoftSkillsEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#softSkillsEntry}.
	 * @param ctx the parse tree
	 */
	void exitSoftSkillsEntry(JobRequirementsGrammarParser.SoftSkillsEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#programmingLanguageList}.
	 * @param ctx the parse tree
	 */
	void enterProgrammingLanguageList(JobRequirementsGrammarParser.ProgrammingLanguageListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#programmingLanguageList}.
	 * @param ctx the parse tree
	 */
	void exitProgrammingLanguageList(JobRequirementsGrammarParser.ProgrammingLanguageListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#knownLanguageList}.
	 * @param ctx the parse tree
	 */
	void enterKnownLanguageList(JobRequirementsGrammarParser.KnownLanguageListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#knownLanguageList}.
	 * @param ctx the parse tree
	 */
	void exitKnownLanguageList(JobRequirementsGrammarParser.KnownLanguageListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobRequirementsGrammarParser#softSkillList}.
	 * @param ctx the parse tree
	 */
	void enterSoftSkillList(JobRequirementsGrammarParser.SoftSkillListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobRequirementsGrammarParser#softSkillList}.
	 * @param ctx the parse tree
	 */
	void exitSoftSkillList(JobRequirementsGrammarParser.SoftSkillListContext ctx);
}