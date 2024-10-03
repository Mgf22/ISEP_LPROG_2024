import Interview.Interview;
import JobRequirements.JobRequirements;
import org.jobRequirement.*;
import org.interview.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        JobOpeningMethods jobOpeningMethods = new JobOpeningMethods();
        ArrayList<JobRequirement> jobRequirements = jobOpeningMethods.getJobRequirements();
        ArrayList<InterviewModel> interviewModels = jobOpeningMethods.getInterviewModels();
        int count = 3;
        String validateOption;
        while (count != 0) {
            System.out.println("Username: ");
            String username = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();
            Role roleValid = UserMethods.Login(username, password);
            while (roleValid != null) {
                switch (roleValid) {
                    case Operator:
                        int menuOption = 0;
                        System.out.println("Operator Menu\n1. Create txt file with Job Requirements\n2. Upload txt file with candidate answers and validate them\n0. Exit");
                        menuOption = scanner.nextInt();
                        scanner.nextLine();
                        while (menuOption != 0) {
                            switch (menuOption) {
                                case 1:
                                    OperatorMethods.CreatetxWithRequirementsJobOpening(jobRequirements);
                                    menuOption = 0;
                                    break;
                                case 2:
                                    try {
                                        JobRequirements jobApplication = jobOpeningMethods.evaluateJobRequirements();
                                        if (jobApplication != null){
                                            jobOpeningMethods.validateJobRequirements(jobApplication);
                                        }
                                        menuOption = 0;
                                    }catch (IOException ex){}
                                    break;
                            }
                        }
                        break;
                    case CustomerManager:
                        System.out.println("Customer Manager Menu\n1. Create txt file with Interview Model\n2. Upload txt file with candidate answers and validate them\n0. Exit");
                        menuOption = scanner.nextInt();
                        scanner.nextLine();
                        while (menuOption != 0) {
                            switch (menuOption) {
                                case 1:
                                    CustomerManagerMethods.CreatetxtWithInterviewModel(interviewModels);
                                    menuOption = 0;
                                    break;
                                case 2:
                                    try {
                                        Interview interview = jobOpeningMethods.evaluateInterview();
                                        if (interview != null){
                                            jobOpeningMethods.validateInterview(interview);
                                        }
                                        menuOption = 0;
                                    }catch (IOException ex){}
                                    break;
                            }
                        }
                }
                System.out.println("Do you want to execute more options? (Y/N)");
                validateOption = scanner.nextLine();
                if (validateOption.equalsIgnoreCase("n")) {
                    System.out.println("Ending program");
                    System.exit(0);
                }
            }
            count--;
            System.out.println("Invalid login... " + count + " tries left");
        }
    }
}
