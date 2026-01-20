import java.util.Scanner;

public class TernoryOperator_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is Ternory Operator");
        System.out.println("Enter Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        int greaterNumber = a > b ? a : b;
        System.out.println(greaterNumber + " is your greater number: ");

        sc.close();
    }
    
}
