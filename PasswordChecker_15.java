import java.util.Scanner;

public class PasswordChecker_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Password Checker!");
        // password(pass);
        
        String pass;
        do {
            System.out.println("Validate Your Password!");
            pass = sc.next();
        } while (!password(pass));
        System.out.println("Your Password is correct");



        sc.close();
    }


    public static boolean password(String pass){
        if (pass.length() > 6 && pass.charAt(0) == '0') {
            return true;
        }else{
            return false;
        }
    }
}
