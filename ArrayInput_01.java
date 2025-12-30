import java.util.Scanner;

public class ArrayInput_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        
        System.out.println("Enter the Total Array number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("You Enter Array number is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }





        sc.close();
    }
}
