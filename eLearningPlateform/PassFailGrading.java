package oops.eLearningPlateform;

public class PassFailGrading implements GradingSystem{
    public String getGrade(double score,double maxScore){
        double per = (score/maxScore)*100;
        if(per < 50)
            return "Fail";
        return "Pass";
    }

}
