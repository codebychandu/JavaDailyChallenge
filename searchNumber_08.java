import Array.Main;
import java.util.*;
public class searchNumber_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] newarr = Main.input2DArray(sc);

        boolean result = findArray(newarr, sc);
        if (result) {
            System.out.println("Your number is found");
        }else{
            System.out.println("Your Number is not found");
        }
    }
    public static boolean findArray(int[][] newarr,Scanner sc){
        System.out.println("Enter one number you want to find: ");
        int x = sc.nextInt();
        
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[i].length; j++) {
                if (newarr[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
}
