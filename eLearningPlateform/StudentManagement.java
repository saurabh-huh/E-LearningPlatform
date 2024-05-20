package oops.eLearningPlateform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement {
    List<Student> studentList;
    Map<Student, List<Course>> enrolledCourseList ;
    public StudentManagement(){
        this.studentList = new ArrayList<>();
        this.enrolledCourseList = new HashMap<>();
    }

    public void removeCourse(Course course,Student student){
        enrolledCourseList.get(student).remove(course);
    }

    public void addCourse(Course course,Student student){
        enrolledCourseList.getOrDefault(student,enrolledCourseList.put(student,new ArrayList<>())).add(course);
    }

    public void removeStudent(Student student){
        String studentId = student.getId();
        studentList.remove(student);
    }
    public void addStudent(Student student){
        studentList.add(student);
    }

}
