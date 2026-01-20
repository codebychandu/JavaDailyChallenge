import java.util.Scanner;

public class MaxiumValue_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Number: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("This is your Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        int max = arr[0];
        for (int maxArr : arr) {
            if (maxArr > max) {
                max = maxArr;
            }
        }
        System.out.println("Max Array is: "+ max);


        sc.close();
    }
}
