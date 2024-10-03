package JobRequirements;

import lombok.Getter;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@Getter
public class JobRequirements {
    private int numberOfYears;
    private String degree;
    private String specialization;
    private String programmingLanguages;
    private String knownLanguages;
    private String softSkills;

    private JobRequirementsVisitor visitor = new JobRequirementsVisitor();

    public JobRequirements(ParseTree tree) {
        extractInfo(tree);
    }

    private void extractInfo(ParseTree tree) {
        if (tree == null) {
            return;
        }

        if (tree instanceof JobRequirementsGrammarParser.ExperienceEntryContext) {
            numberOfYears = (Integer) visitor.visit(tree);
        } else if (tree instanceof JobRequirementsGrammarParser.DegreeEntryContext) {
            degree = (String) visitor.visit(tree);
        } else if (tree instanceof JobRequirementsGrammarParser.SpecializationNameEntryContext) {
            specialization = (String) visitor.visit(tree);
        } else if (tree instanceof JobRequirementsGrammarParser.ProgrammingLanguagesEntryContext) {
            programmingLanguages = (String) visitor.visit(tree);
        } else if (tree instanceof JobRequirementsGrammarParser.KnownLanguagesEntryContext) {
            knownLanguages = (String) visitor.visit(tree);
        } else if (tree instanceof JobRequirementsGrammarParser.SoftSkillsEntryContext) {
            softSkills = (String) visitor.visit(tree);
        }

        for (
                int i = 0; i < tree.getChildCount(); i++) {
            extractInfo(tree.getChild(i));
        }
    }
}