import java.util.Scanner;

public class recursionPalindrome_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is The Recursion Palindrom Program");
        System.out.println("Enter One word: ");
        String word = sc.next();
        if (Palindrom.PalindromWithRecursion(word)) {
            System.out.println("Your Number is Palindrome");
        }
        else{
            System.out.println("Your Number is not a Palindrom");
        }


        sc.close();

    }
}

class  Palindrom {

    public static boolean PalindromWithRecursion(String word){
    
    if (word.length() <= 1) {
        return true;
    }
    if (word.charAt(0) == word.charAt(word.length() - 1)) {
        return PalindromWithRecursion(word.substring(1, word.length()-1));
    }
    return false;
}
    
}
