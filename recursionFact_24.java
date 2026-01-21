import java.util.Scanner;

public class recursionFact_24 {

    public static int factWithRecu(int num){
        if (num <= 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return num * factWithRecu(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Factorial With Recursion Program");
        System.out.println("Enter One Number");
        int num = sc.nextInt();
        int fact = factWithRecu(num);
        System.out.println("This is Your Factorioal: "+ fact);


        sc.close();
    }
}
