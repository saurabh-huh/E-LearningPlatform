package oops.eLearningPlateform;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Instructor {
    String Id;
    String name;
    String expertise;
    List<Course> courseList;

    public Instructor(String name, String expertise) {
        this.Id = UUID.randomUUID().toString();
        this.name = name;
        this.expertise = expertise;
        this.courseList = new ArrayList<>();
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

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public void manageCourseContent(Course course, String content) {
        if (courseList.contains(course)) {
            course.addContent(content);
        }
    }
}
