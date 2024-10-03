// Generated from C:/Users/Mateus Fernandes/Desktop/ISEP/LPROG/jobs4u.app1/src/main/java/Interview/interviewGrammar.g4 by ANTLR 4.13.1
package Interview;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link interviewGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface interviewGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(interviewGrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(interviewGrammarParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#springFrameworkQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpringFrameworkQuestion(interviewGrammarParser.SpringFrameworkQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#wifiDescriptionQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWifiDescriptionQuestion(interviewGrammarParser.WifiDescriptionQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#databaseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseQuestion(interviewGrammarParser.DatabaseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#frontEndTechnologiesQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrontEndTechnologiesQuestion(interviewGrammarParser.FrontEndTechnologiesQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#byteInBitsQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteInBitsQuestion(interviewGrammarParser.ByteInBitsQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#windowsKeysPriceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowsKeysPriceQuestion(interviewGrammarParser.WindowsKeysPriceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#windowsReleaseDateQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowsReleaseDateQuestion(interviewGrammarParser.WindowsReleaseDateQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#workStartTimeQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkStartTimeQuestion(interviewGrammarParser.WorkStartTimeQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#lprogRatingQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLprogRatingQuestion(interviewGrammarParser.LprogRatingQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#wifi_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWifi_description(interviewGrammarParser.Wifi_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link interviewGrammarParser#multipleAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleAnswer(interviewGrammarParser.MultipleAnswerContext ctx);
}