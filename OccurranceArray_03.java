
import Array.Main;
import java.util.Scanner;
public class OccurranceArray_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome Occurrance of Array ");
        int[] numarr = Main.input(sc);
        System.out.println("Enter the number you want to find: ");
        int x = sc.nextInt();
        System.out.print("your number is: ");
        int add = 0;
        for (int i = 0; i < numarr.length; i++) {
            if (numarr[i] == x) {
                add++;
            }
        }
        System.out.println(add);

    }
}
