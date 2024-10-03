import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import JobRequirements.JobRequirements;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.interview.*;
import org.jobRequirement.*;
import Interview.Interview;
import JobRequirements.JobRequirementsGrammarParser;
import JobRequirements.JobRequirementsGrammarLexer;
import Interview.interviewGrammarParser;
import Interview.interviewGrammarLexer;

public class JobOpeningMethods {
    public ArrayList<JobRequirement> getJobRequirements() {
        JobRequirementMethods jobRequirementMethods = new JobRequirementMethods();
        return jobRequirementMethods.CreateJobRequirements();
    }

    public ArrayList<InterviewModel> getInterviewModels() {
        InterviewMethods interviewMethods = new InterviewMethods();
        return interviewMethods.CreateInterviewModel();
    }

    public static JobRequirements evaluateJobRequirements() throws IOException {
        CharStream input = CharStreams.fromFileName("jobOpeningWithRequirements.txt");

        Lexer lexer = new JobRequirementsGrammarLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new CustomErrorListener());

        JobRequirementsGrammarParser parser = new JobRequirementsGrammarParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomErrorListener());

        ParseTree tree = null;
        try {
            tree = parser.file();
        } catch (RuntimeException e) {
            System.out.println("One or more fields are invalid.");
            return null;
        }
        return new JobRequirements(tree);
    }

    public static Interview evaluateInterview() throws IOException {
        CharStream input = CharStreams.fromFileName("jobOpeningWithInterview.txt");

        Lexer lexer = new interviewGrammarLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new CustomErrorListener());

        interviewGrammarParser parser = new interviewGrammarParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomErrorListener());

        ParseTree tree = null;
        try {
            tree = parser.file();
        } catch (RuntimeException e) {
            System.out.println("One or more fields are invalid.");
            return null;
        }
        return new Interview(tree);
    }

    public void validateJobRequirements(JobRequirements application) {
        List<String> requirementsNotMet = new ArrayList<>();
        int count = 0;
        if (application.getNumberOfYears() > 2){
            count++;
        }
        else {
            requirementsNotMet.add("Does not meet the requirement Experience Years");
        }
        if (application.getDegree().contains("Bachelor") || application.getDegree().contains("Master") || application.getDegree().contains("PhD")){
            count++;
        }else {
            requirementsNotMet.add("Does not meet the requirement Academic Degree");
        }
        if (application.getSpecialization().contains("ComputerEngineer") || application.getSpecialization().contains("ComputerScience")){
            count++;
        }
        else {
            requirementsNotMet.add("Does not meet the requirement Specialization");
        }
        if (application.getProgrammingLanguages().contains("Java") && application.getProgrammingLanguages().contains("Angular")){
            count++;
        }
        else {
            requirementsNotMet.add("Does not meet the requirement Programming Languages");
        }
        if (application.getKnownLanguages().contains("English")){
            count++;
        }
        else {
            requirementsNotMet.add("Does not meet the requirement Known Languages");
        }
        if (application.getSoftSkills().contains("Criativity")){
            count++;
        }
        else {
            requirementsNotMet.add("Does not meet the requirement Soft Skills");
        }
        if (count == 6){
            System.out.println("Approved: Meets all the requirements");
        }
        else {
            System.out.println("Rejected: Doesn't meet all the requirements\nList of requirements not met:");
            for (String requirement: requirementsNotMet){
                System.out.println(requirement);
            }
        }
    }

    public static void validateInterview(Interview interview) {
        int score = 0;
        if (interview.getSpringFramework().equals("V")) {
            score += 10;
        }
        else {
            System.out.println("Wrong answer... The correct answer is V");
        }
        if (interview.getWifiDescription().equalsIgnoreCase("WirelessFidelity")) {
            score += 10;
        }
        else {
            System.out.println("Wrong answer... WIFI stands for Wireless Fidelity");
        }
        if (interview.getDatabase().equals("d")) {
            score += 10;
        }
        else {
            System.out.println("Wrong answer... The correct answer is 4- IntelliJ IDEA");
        }
        if (interview.getFrontEndTechnologies().contains("a") && interview.getFrontEndTechnologies().contains("b")) {
            score += 10;
        } else if (interview.getFrontEndTechnologies().contains("a")) {
            score += 5;
        } else if ((interview.getFrontEndTechnologies().contains("b"))) {
            score += 5;
        }
        else {
            System.out.println("Wrong answer... The correct answer is 1- React and 2- Angular");
        }
        if (interview.getByteInBits() == 8) {
            score += 10;
        }
        else {
            System.out.println("Wrong answer... The correct answer is 8");
        }
        if (interview.getWindowsKeysPrice() == 7.45) {
            score += 10;
        }
        else {
            System.out.println("Wrong answer... The correct answer is 7.45");
        }
        if (interview.getWindowsReleaseDate().equals("20/11/1985")) {
            score += 20;
        }
        else {
            System.out.println("Wrong answer... The correct answer is 20/11/1985");
        }
        if (interview.getWorkStartTime().equals("09:00")) {
            score += 10;
        }
        else {
            System.out.println("Wrong answer... The correct answer is 09:00");
        }
        if (interview.getLprogRating().equals("5/5")) {
            score += 10;
        }else {
            System.out.println("Wrong answer... The correct answer is 5/5");
        }
        if (score>50){
            System.out.println("Interview approved! Your score is "+score);
        }
        else {
            System.out.println("Interview not approved... Your score is "+score);
        }
    }
}