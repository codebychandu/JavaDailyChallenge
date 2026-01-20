public class Course_12 {
    String courseName;
    String[] Students;
    int enrolledStudent;
    static int maxCapacity = 5;

    Course_12(String courseName) {
        this.courseName = courseName;
        this.enrolledStudent = 0;
        this.Students = new String[maxCapacity];
    }

    void setMaxCapicity(int capacity) {
        if (capacity > 0) {
            maxCapacity = capacity;
            System.out.println("Capicity Seted Successfully!");
        } else {
            System.out.print("Enter the Valid Number");
        }
    }

    void enrollStudent(String studentName) {
        if (enrolledStudent <= maxCapacity) {
            Students[enrolledStudent] = studentName;
            enrolledStudent++;
        } else {
            System.out.print("No Seates avilable! ");
        }
    }

    void unenrollStudent(String studentName) {
        int count = 0;
        for (int i = 0; i < enrolledStudent; i++) {
            if (!Students[i].equalsIgnoreCase(studentName)) {
                count++;
            }
        }
        if (count == enrolledStudent) {
            System.out.println(studentName + " is not enrolled.");
            return;
        }
        String[] newStudents = new String[maxCapacity];
        int index = 0;
        for (int i = 0; i < enrolledStudent; i++) {
            if (!Students[i].equalsIgnoreCase(studentName)) {
                newStudents[index] = Students[i];
                index++;
            }
        }
        Students = newStudents;
        enrolledStudent = count;
        System.out.println(studentName + " has been unenrolled successfully.");
    }

    void displayStudent() {
        System.out.println("this is enrolled Student List: \n");
        for (int i = 0; i < enrolledStudent; i++) {
            System.out.println((i + 1) + ". " + Students[i]);
        }
    }
}