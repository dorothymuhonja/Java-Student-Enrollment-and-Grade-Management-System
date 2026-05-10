import java.util.*;

public class Student {
    private String name, id;
    private Map<Course, Double> grades = new HashMap<>();
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {return id;}
    public String getName() {return name;}
    public List<Course> getEnrolledCourses() {return enrolledCourses;}

    public void enroll(Course course) {
        if (!enrolledCourses.contains(course)) enrolledCourses.add(course);
    }

    public void setGrade(Course course, double grade) {
        if (enrolledCourses.contains(course)) grades.put(course, grade);
    }

    public Map<Course, Double> getGrades() {return grades;}

}    
