package oops.eLearningPlateform;

public class ProgressTracker {
    Student student;
    Course course;
    int completedModules;
    double currentGrade;

    public ProgressTracker(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.completedModules = 0;
        this.currentGrade = 0.0;
    }

    public void updateProgress(int modulesCompleted, double grade) {
        this.completedModules += modulesCompleted;
        this.currentGrade = grade;
    }

    public void generateReport() {
        System.out.println("Progress Report for " + student.getName());
        System.out.println("Course: " + course.getTitle());
        System.out.println("Completed Modules: " + completedModules);
        System.out.println("Current Grade: " + currentGrade);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getCompletedModules() {
        return completedModules;
    }

    public void setCompletedModules(int completedModules) {
        this.completedModules = completedModules;
    }

    public double getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(double currentGrade) {
        this.currentGrade = currentGrade;
    }
}

