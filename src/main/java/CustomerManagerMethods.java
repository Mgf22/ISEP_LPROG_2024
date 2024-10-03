import org.interview.InterviewModel;
import org.interview.InterviewQuestion;
import org.jobRequirement.JobRequirement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagerMethods {
    public static Scanner scanner = new Scanner(System.in);

    public static void CreatetxtWithInterviewModel(ArrayList<InterviewModel> interviewModels) {
        int optionChosen = -1;
        JobOpening jobOpening;
        try {
            FileWriter interviewWriter = new FileWriter("jobOpeningWithInterview.txt");
            int option = 0;
            System.out.println("Interview questions menu: ");
            for (InterviewModel interviewModel : interviewModels) {
                System.out.println(option + 1 + ". " + interviewModel.name);
                option++;
            }
            System.out.println("0. Exit\nInput an option: ");
            optionChosen = scanner.nextInt();
            scanner.nextLine();
            if (optionChosen != 0) {
                InterviewModel chosenModel = interviewModels.get(optionChosen - 1);
                jobOpening = new JobOpening(chosenModel);
                char[] charArray = {'a', 'b', 'c', 'd'};
                int optionArray = 0;
                for (InterviewQuestion interviewQuestion : jobOpening.interviewModel.questions) {
                    interviewWriter.write("#"+interviewQuestion.question + "\n");
                    if (interviewQuestion.options != null) {
                        for (String questionOption : interviewQuestion.options) {
                            interviewWriter.write("#"+charArray[optionArray] + ". " + questionOption + "\n");
                            optionArray++;
                        }
                    }
                    interviewWriter.write(interviewQuestion.name + ":" + "\n");
                    interviewWriter.write("\n");
                    optionArray = 0;
                }
                interviewWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
