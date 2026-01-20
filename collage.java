import java.util.Scanner;

public class collage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome In Collage");

        System.out.println("Enter One number to set course Capacity");

        int limit = sc.nextInt();

        sc.nextLine();

        Course_12 co = new Course_12("java Program");

        co.setMaxCapicity(limit);

        System.out.println("How many Student you want to enroll: ");

        int count = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < count; i++) {

            System.out.print("Enter the " + (i + 1) + " Student Name: ");

            String name = sc.nextLine();

            co.enrollStudent(name);

        }

        co.displayStudent();

        co.unenrollStudent("ali");

        sc.close();

    }

}