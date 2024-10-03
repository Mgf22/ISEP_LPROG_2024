import org.interview.InterviewModel;
import org.interview.InterviewQuestion;
import org.jobRequirement.JobRequirement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OperatorMethods {
    public static Scanner scanner = new Scanner(System.in);

    public static void CreatetxWithRequirementsJobOpening(ArrayList<JobRequirement> jobRequirements) {
        int optionChosen = -1;
        ArrayList<JobRequirement> jobRequirementsJobApp = new ArrayList<>();
        JobOpening jobOpening;
        try {
            FileWriter jobRequirementWriter = new FileWriter("jobOpeningWithRequirements.txt");
            System.out.println("Job Requirements menu:");
            for (int i = 0; i < jobRequirements.size(); i++) {
                System.out.println((i + 1) + ". " + jobRequirements.get(i).name);
            }
            System.out.println("0. Exit");
            System.out.println();

            System.out.println("Input an option: ");
            optionChosen = scanner.nextInt();
            scanner.nextLine();

            while (optionChosen != 0) {
                if (optionChosen > 0 && optionChosen <= jobRequirements.size()) {
                    JobRequirement chosenRequirement = jobRequirements.get(optionChosen - 1);
                    if (!jobRequirementsJobApp.contains(chosenRequirement)) {
                        jobRequirementsJobApp.add(chosenRequirement);
                        System.out.println(chosenRequirement.name + " added.");
                    } else {
                        System.out.println(chosenRequirement.name + " is already in the list.");
                    }
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
                System.out.println("Input a new option (0 to exit):");
                optionChosen = scanner.nextInt();
                scanner.nextLine();
            }
            jobOpening = new JobOpening(jobRequirementsJobApp);
            for (JobRequirement jobRequirement : jobOpening.jobRequirements) {
                jobRequirementWriter.write("#"+jobRequirement.question + "\n");
                jobRequirementWriter.write(jobRequirement.name + ":\n");
                jobRequirementWriter.write(jobRequirement.response + "\n");
            }
            jobRequirementWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
