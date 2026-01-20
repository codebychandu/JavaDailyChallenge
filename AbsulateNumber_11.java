import java.util.Scanner;

public class AbsulateNumber_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One Number: ");
        int num = sc.nextInt();
        int result = num >= 0 ?num: -num;
        System.out.println("Absolute Number is: " + result);


        sc.close();
    }
    
}
