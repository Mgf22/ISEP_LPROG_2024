package Interview;

import lombok.Getter;
import org.antlr.v4.runtime.tree.ParseTree;

@Getter
public class Interview {
    private String springFramework;
    private String wifiDescription;
    private String database;
    private String frontEndTechnologies;
    private Integer byteInBits;
    private Double windowsKeysPrice;
    private String windowsReleaseDate;
    private String workStartTime;
    private String lprogRating;

    private InterviewVisitor visitor = new InterviewVisitor();

    public Interview(ParseTree tree) {
        extractInfo(tree);
    }

    private void extractInfo(ParseTree tree) {
        if (tree == null) {
            return;
        }

        if (tree instanceof interviewGrammarParser.SpringFrameworkQuestionContext) {
            springFramework = (String) visitor.visit(tree);
        } else if (tree instanceof interviewGrammarParser.WifiDescriptionQuestionContext) {
            wifiDescription = (String) visitor.visit(tree);
        } else if (tree instanceof interviewGrammarParser.DatabaseQuestionContext) {
            database = (String) visitor.visit(tree);
        } else if (tree instanceof interviewGrammarParser.FrontEndTechnologiesQuestionContext) {
            frontEndTechnologies = (String) visitor.visit(tree);
        } else if (tree instanceof interviewGrammarParser.ByteInBitsQuestionContext) {
            byteInBits = (Integer) visitor.visit(tree);
        } else if (tree instanceof interviewGrammarParser.WindowsKeysPriceQuestionContext) {
            windowsKeysPrice = (Double) visitor.visit(tree);
        } else if (tree instanceof interviewGrammarParser.WindowsReleaseDateQuestionContext) {
            windowsReleaseDate = (String) visitor.visit(tree);
        } else if (tree instanceof interviewGrammarParser.WorkStartTimeQuestionContext) {
            workStartTime = (String) visitor.visit(tree);
        } else if (tree instanceof interviewGrammarParser.LprogRatingQuestionContext) {
            lprogRating = (String) visitor.visit(tree);
        }

        for (int i = 0; i < tree.getChildCount(); i++) {
            extractInfo(tree.getChild(i));
        }
    }
}