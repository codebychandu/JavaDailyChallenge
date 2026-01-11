import java.util.Scanner;

public class palindrome_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Palindrome Program");
        System.out.print("Enter One Word: ");
        String a = sc.nextLine();

        palindrome(a);

        sc.close();
    }
    public static void palindrome(String a){
        boolean ispali = true;
        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length()- 1 -i)) {
                ispali = false;
                break;
            }
            
        }
        if (ispali) {
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }
    }
}
