package oops.eLearningPlateform;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Course {
    String Id;
    String title;
    String description;
    Instructor instructor;
    List<Student> studentList;
    List<String> content;

    public Course(String title, String description, Instructor instructor) {
        this.Id = UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.instructor = instructor;
        this.studentList = new ArrayList<>();
        this.content = new ArrayList<>();
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public void addContent(String content) {
        this.content.add(content);
    }

    public void removeContent(String content) {
        this.content.remove(content);
    }

}
