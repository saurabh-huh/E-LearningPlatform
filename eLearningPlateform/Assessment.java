package oops.eLearningPlateform;

import java.util.UUID;

public abstract class Assessment {
    String Id;
    Course course;
    String title;
    String description;
    double maxScore;

    public Assessment( Course course, String title, String description, double maxScore) {
        this.Id = UUID.randomUUID().toString();
        this.course = course;
        this.title = title;
        this.description = description;
        this.maxScore = maxScore;
    }

    public String getId() {
        return Id;
    }

    public Course getCourse() {
        return course;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public abstract void create();
    public abstract void grade(Student student, double score);
    public abstract void review(Student student);
}
