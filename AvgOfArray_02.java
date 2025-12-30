import java.util.Scanner;

public class AvgOfArray_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        float b = 0;
        for (int j = 0; j < arr.length; j++) {
            b = (b + arr[j]) ;

        }
        System.out.println(b / arr.length);
        

        sc.close();
    }

}
