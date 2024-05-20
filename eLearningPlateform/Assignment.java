package oops.eLearningPlateform;

public class Assignment extends Assessment{
    public Assignment( Course course, String title, String description, double maxScore) {
        super(course,title,description,maxScore);
    }
    @Override
    public void create() {

    }

    @Override
    public void grade(Student student, double score) {

    }

    @Override
    public void review(Student student) {

    }
}
