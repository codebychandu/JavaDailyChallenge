
import java.util.Scanner;

import Array.Main;
public class checkSorted_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sorted Array");
        int[] newarr = Main.input(sc);
        boolean isInce = isIncreasing(newarr);
        boolean isDece = isDecresing(newarr);
        if (isInce || isDece) {
            System.out.println("Your Array is Sorted");
        }else{
            System.out.println("Your Array is not Sorted");
        }
    }

    public static boolean isIncreasing(int[] newarr){
        for (int i = 1; i < newarr.length; i++) {
            if (newarr[i] > newarr[i-1]) {
                return false;
            }
        }

        return true;
    }
    public static boolean isDecresing(int[] newarr){
        for (int i = 1; i < newarr.length; i++) {
            if (newarr[i] < newarr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
