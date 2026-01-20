import java.util.Scanner;

public class Driver_13 {

    public static void main(String[] args) {

        Car_13 mycar = new Car_13();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Car Name: ");

        String n = sc.nextLine();

        mycar.Name(n);

        mycar.isEnginOn();

        System.out.print("Enter the fuel: ");

        int fuel = sc.nextInt();

        mycar.fuelLevel(fuel);

        mycar.drive();

        mycar.carTime(fuel);

        sc.close();

    }

}
