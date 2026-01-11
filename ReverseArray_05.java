import Array.Main;
import java.util.Scanner;
public class ReverseArray_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Reverse Array");
        int[] newarr = Main.input(sc);
        Reverse(newarr);
        System.out.println("Reverse Array");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
        sc.close();
    }

    public static void Reverse(int[] newarr){
        for (int i = 0; i < newarr.length / 2; i++) {
            int swap = newarr[i];
            newarr[i] = newarr[(newarr.length - 1) - i];
            newarr[(newarr.length - 1) - i] = swap;

        }
    }
    
}
