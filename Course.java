public class Course {
    private String code, name;
    private int maxCapacity, currentEnrolled = 0;
    private static int totalGlobalEnrollments = 0;

    public Course(String code, String name, int maxCapacity) {
        this.code = code;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public String getCode() {return code;}
    public String getName() {return name;}

    public boolean enrollIfPossible() {
        if (currentEnrolled < maxCapacity) {
            currentEnrolled++;
            totalGlobalEnrollments++;
            return true;
        }
        return false;
    }

    public static int getTotalGlobalEnrollments() {return totalGlobalEnrollments;}
    
}
