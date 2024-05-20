package oops.eLearningPlateform;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Student {
    String Id;
    String name;
    Map<Course,Double> grades;
    public Student( String name) {
        this.Id = UUID.randomUUID().toString();
        this.name = name;
        this.grades = new HashMap<>();
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void viewGrades() {
        for (Map.Entry<Course, Double> entry : grades.entrySet()) {
            System.out.println("Course: " + entry.getKey().getTitle() + " Grade: " + entry.getValue());
        }
    }

    public void participateInAssessment(Assessment assessment) {
        // Implementation of participating in an assessment
    }


}
