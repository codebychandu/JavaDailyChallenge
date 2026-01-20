
import java.util.Scanner;

public class guessNumber_17 {
    public static void main(String[] args) {
        guessNumber();
        
        
    }
    
    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        int num =(int) (Math.random() * 100);
        System.out.println(num);
        int gues;
        do{
            System.out.println("Guess one number");
            gues = sc.nextInt();
            if (num>gues) {
                System.out.println("Number is Higer then "+ gues);
            }else{
                System.out.println("Number is Lower than: "+ gues);
            }
            
        }while(num != gues);
        System.out.println("Hurry! Correct Number is : " + num);
        // return num;
        sc.close();
    }
    
}
