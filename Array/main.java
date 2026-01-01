package Array;

import java.util.Scanner;

public class Main {

    public static int[] input(Scanner sc){
        System.out.println("Enter The Size of Array: ");
        int a = sc.nextInt(); 
        int[] arr = new int[a];
        System.out.println("Enter the " + a+ " Number: ");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }
}
