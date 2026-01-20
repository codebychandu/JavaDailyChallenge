import java.util.Scanner;

public class readInuput_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        do {
            System.out.println("Enter One Word: ");
            String word = sc.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                System.out.println("Loop Stoped! ");
                break;
            }

        } while (true);


        sc.close();

    }
}
