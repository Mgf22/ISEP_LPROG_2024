package JobRequirements;

public class JobRequirementsVisitor extends JobRequirementsGrammarBaseVisitor<Object> {
    @Override
    public Integer visitExperienceEntry(JobRequirementsGrammarParser.ExperienceEntryContext ctx) {
        return Integer.parseInt(ctx.EXPERIENCEYEARS().getText());
    }

    @Override
    public String visitDegreeEntry(JobRequirementsGrammarParser.DegreeEntryContext ctx) {
        return ctx.DEGREE().getText();
    }

    @Override
    public String visitSpecializationNameEntry(JobRequirementsGrammarParser.SpecializationNameEntryContext ctx) {
        return ctx.specializationNameOption().getText();
    }

    @Override
    public String visitProgrammingLanguagesEntry(JobRequirementsGrammarParser.ProgrammingLanguagesEntryContext ctx) {
        return ctx.programmingLanguageList().getText();
    }

    @Override
    public String visitKnownLanguagesEntry(JobRequirementsGrammarParser.KnownLanguagesEntryContext ctx) {
        return ctx.knownLanguageList().getText();
    }

    @Override
    public String visitSoftSkillsEntry(JobRequirementsGrammarParser.SoftSkillsEntryContext ctx) {
        return ctx.softSkillList().getText();
    }
}