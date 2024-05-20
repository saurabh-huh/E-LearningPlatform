package oops.eLearningPlateform;

public class PercentageGrading implements GradingSystem {
    @Override
    public String getGrade(double score,double maxScore){
        double percentage = (score/maxScore)*100;
        return percentage + "%";
    }
}
