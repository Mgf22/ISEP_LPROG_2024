import org.interview.*;
import org.jobRequirement.*;

import java.util.ArrayList;

public class JobOpening {
    ArrayList<JobRequirement> jobRequirements;
    InterviewModel interviewModel;

    public JobOpening(InterviewModel interviewModel) {
        this.interviewModel = interviewModel;
    }

    public JobOpening(ArrayList<JobRequirement> jobRequirements){
        this.jobRequirements = jobRequirements;
    }

}
