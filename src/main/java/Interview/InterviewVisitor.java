package Interview;

public class InterviewVisitor extends interviewGrammarBaseVisitor {
    @Override
    public String visitSpringFrameworkQuestion(interviewGrammarParser.SpringFrameworkQuestionContext ctx) {
        return ctx.SPRING_FRAMEWORK().getText();
    }
    @Override
    public String visitWifiDescriptionQuestion(interviewGrammarParser.WifiDescriptionQuestionContext ctx) {
        return ctx.wifi_description().getText();
    }
    @Override
    public String visitDatabaseQuestion(interviewGrammarParser.DatabaseQuestionContext ctx) {
        return ctx.FREE_TEXT().getText();
    }
    @Override
    public String visitFrontEndTechnologiesQuestion(interviewGrammarParser.FrontEndTechnologiesQuestionContext ctx) {
        return ctx.multipleAnswer().getText();
    }
    @Override
    public Integer visitByteInBitsQuestion(interviewGrammarParser.ByteInBitsQuestionContext ctx) {
        return Integer.parseInt(ctx.BYTE().getText());
    }
    @Override
    public Double visitWindowsKeysPriceQuestion(interviewGrammarParser.WindowsKeysPriceQuestionContext ctx) {
        return Double.parseDouble(ctx.WINDOWS_KEYS().getText());
    }
    @Override
    public String visitWindowsReleaseDateQuestion(interviewGrammarParser.WindowsReleaseDateQuestionContext ctx) {
        return ctx.DATE().getText();
    }
    @Override
    public String visitWorkStartTimeQuestion(interviewGrammarParser.WorkStartTimeQuestionContext ctx) {
        return ctx.TIME().getText();
    }
    @Override
    public String visitLprogRatingQuestion(interviewGrammarParser.LprogRatingQuestionContext ctx) {
        return ctx.LPROG().getText();
    }
}
