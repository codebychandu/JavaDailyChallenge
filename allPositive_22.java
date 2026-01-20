import java.util.Scanner;
import Array.Main;

public class allPositive_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Main.input(sc);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                continue;
            } else {
                sum += arr[j];
            }
        }
        System.out.println("Sum is: " + sum);


        sc.close();
    }
}
