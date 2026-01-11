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
    public static int[] output(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static int[][] input2DArray(Scanner sc){
        System.out.println("Enter the Row Size");
        int row = sc.nextInt();
        System.out.println("Enter the Column Size: ");
        int column = sc.nextInt();
        int[][] newarr = new int[row][column];
        for (int i = 0; i < newarr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " row value");
            for (int j = 0; j < newarr.length; j++) {
                newarr[i][j] = sc.nextInt();
            }
        }
        return newarr;
    }

    public static void output2DArray(int[][] newarr){
        System.out.println("This is Your Array: ");
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[i].length; j++) {
                System.out.print(newarr[i][j]);
            }
            System.out.println();
        }
    }
}
