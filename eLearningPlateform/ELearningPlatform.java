package oops.eLearningPlateform;

public class ELearningPlatform {
    public static void main(String[] args) {
        StudentManagement studentManagement =new StudentManagement();
        // Create an instructor
        Instructor instructor = new Instructor("Praveen", "Computer Science");

        // Create a course
        Course course = new Course( "Introduction to Programming", "Learn the basics of programming", instructor);
        instructor.addCourse(course);

        // Create a student
        Student student = new Student( "Saurabh");

        // Enroll the student in the course
        studentManagement.addCourse(course,student);
        course.addStudent(student);

        // Create assessments
        Assessment quiz = new QuizAssessment( course, "Quiz 1", "Basic programming quiz", 100);
        Assessment assignment = new Assignment(course, "Assignment 1", "First programming assignment", 100);
        Assessment exam = new ExamAssessment( course, "Midterm Exam", "Midterm programming exam", 100);

        // Simulate grading
        quiz.grade(student, 85);
        assignment.grade(student, 90);
        exam.grade(student, 80);

        // Track progress
        ProgressTracker tracker = new ProgressTracker(student, course);
        tracker.updateProgress(5, (85 + 90 + 80) / 3.0);
        tracker.generateReport();
    }
}
