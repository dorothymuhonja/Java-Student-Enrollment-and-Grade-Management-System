import java.util.Scanner;


public class AdminInterface {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) { 
           System.out.println("--- University Enrollment System ---");
           System.out.println("1. Add Course\n2. Add Student\n3. Enroll\n4. Grade\n5. GPA\n6. Exit");
           System.out.print("Enter Number: ");
            String choice = sc.nextLine();

            if (choice.equals("6")) break;

            try {
                switch (choice) {
                    case "1":
                        String courseCode = prompt("Code");
                        String courseName = prompt("Name");
                        int cap = Integer.parseInt(prompt("Capacity"));
                        CourseManagement.addCourse(courseCode, courseName, cap);
                        System.out.println("Course " + courseName + " (Code: " + courseCode  + ") added successfully.");

                        break;

                    case "2":
                        String studentName = prompt("Name");
                        String studentId = prompt("ID");
                        CourseManagement.addStudent(studentName, studentId);
                        System.out.println("Student " + studentName + " (ID: " + studentId + ") added successfully.");
                       

                        break;

                    case "3":
                        Student s3 = CourseManagement.findStudent(prompt("Student ID"));
                        Course c3 = CourseManagement.findCourse(prompt("Course Code"));
                        CourseManagement.enroll(s3, c3);

                        break;

                    case "4":
                        Student s = CourseManagement.findStudent(prompt("Student ID"));
                        Course c = CourseManagement.findCourse(prompt("Course Code"));

                        if (s != null && c != null) {
                            double grade = Double.parseDouble(prompt("Grade"));
                            s.setGrade(c, grade);
                            System.out.println("Grade " + grade + " set for " + s.getName() + " in " + c.getName() + ".");

                        } else {
                            System.out.println("Student or Course not found.");
                        }

                        
                        break;

                    case "5":
                        Student stu = CourseManagement.findStudent(prompt("Student ID"));
                        if (stu != null) {
                            System.out.println("Student Name: " + stu.getName());
                            System.out.println("Overall GPA: " + CourseManagement.calculateGPA(stu));
                        }

                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input!");

            }
        }
    }

    private static String prompt(String field) {
        System.out.print("Enter " + field + ": ");
        return sc.nextLine();
    }
    
}
