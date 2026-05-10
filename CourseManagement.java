import java.util.*;



public class CourseManagement {

   private static List<Course> courses = new ArrayList<>();
   private static List<Student> students = new ArrayList<>();
   
   public static void addCourse(String code, String name, int cap) {
        courses.add(new Course(code, name, cap));
   }

   public static void addStudent(String name, String id) {
        students.add(new Student(name, id));
   }

   public static Course findCourse(String code) {
        return courses.stream().filter(c -> c.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
   }

   public static Student findStudent(String id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
   }

   public static void enroll(Student s, Course c) {
        if (s != null && c != null && c.enrollIfPossible()) {
            s.enroll(c);
            System.out.println("Student " + s.getName() + " successfully enrolled in the " + c.getName() + " course.");
        } else {
            System.out.println("Enrollment failed: Course full or invalid data.");

        }
   }

   private static double gradeToGPA(double grade) {
     if (grade >= 90) return 4.0;
     else if (grade >= 80) return 3.5;
     else if (grade >= 70) return 3.0;
     else if (grade >= 60) return 2.5;
     else if (grade >= 50) return 2.0;
     else if (grade >= 40) return 1.5;
     else return 1.0;
   }

   public static double calculateGPA(Student s) {
        return s.getGrades().values().stream().mapToDouble(g -> gradeToGPA(g)).average().orElse(0.0);
   }
}
