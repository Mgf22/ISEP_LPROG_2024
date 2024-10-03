// Generated from C:/Users/Mateus Fernandes/Desktop/ISEP/LPROG/jobs4u.app1/src/main/java/JobRequirements/JobRequirementsGrammar.g4 by ANTLR 4.13.1
package JobRequirements;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JobRequirementsGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JobRequirementsGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(JobRequirementsGrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(JobRequirementsGrammarParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#experienceEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExperienceEntry(JobRequirementsGrammarParser.ExperienceEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#degreeEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegreeEntry(JobRequirementsGrammarParser.DegreeEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#specializationNameEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecializationNameEntry(JobRequirementsGrammarParser.SpecializationNameEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#specializationNameOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecializationNameOption(JobRequirementsGrammarParser.SpecializationNameOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#programmingLanguagesEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgrammingLanguagesEntry(JobRequirementsGrammarParser.ProgrammingLanguagesEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#knownLanguagesEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownLanguagesEntry(JobRequirementsGrammarParser.KnownLanguagesEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#softSkillsEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftSkillsEntry(JobRequirementsGrammarParser.SoftSkillsEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#programmingLanguageList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgrammingLanguageList(JobRequirementsGrammarParser.ProgrammingLanguageListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#knownLanguageList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownLanguageList(JobRequirementsGrammarParser.KnownLanguageListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobRequirementsGrammarParser#softSkillList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftSkillList(JobRequirementsGrammarParser.SoftSkillListContext ctx);
}