package oops.eLearningPlateform;

public class LatterGrading implements GradingSystem {
    @Override
    public String getGrade(double score,double maxScore){
        int per = (int)(score/maxScore)*10;
        return switch (per) {
            case 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 5 -> "D";
            default -> "f";
        };
    }
}
