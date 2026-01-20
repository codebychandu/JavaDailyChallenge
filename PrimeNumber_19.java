import java.util.Scanner;

public class PrimeNumber_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One Number: ");
        int num = sc.nextInt();
        
        if (!isPrime(num)) {
            System.out.println("Your number is Prime");
        }else{
            System.out.println("Your Number Is Not Prime");
        }

        sc.close();

    }
    public static boolean isPrime(int num){
        if (num < 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return true;
            }
        }   
        return false; 
    }
}
