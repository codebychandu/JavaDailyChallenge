public class Car_13 {

    String Carname;

    float fuelInLiter;

    boolean isEnginOn;

    int year;

    public void Name(String n) {

        System.out.println("Your Car Name is: " + n);

    }

    public boolean isEnginOn() {

        isEnginOn = true;

        if (isEnginOn) {

            System.out.println("Engin is on");

        }

        return false;

    }

    public void drive() {

        if (fuelInLiter > 0) {

            if (isEnginOn) {

                System.out.println("Car is Driving");

                fuelInLiter--;

            }

            else {

                System.out.println("Your Car Engin is not On");

            }

        } else {

            System.out.println("Fill the fuel: ");

            fuelLevel(fuelInLiter);

        }

    }

    public void fuelLevel(float fuel) {

        fuelInLiter += fuel;

        System.out.println("Your car fuel is: " + fuelInLiter + "L");

    }

    public void carTime(int sec) {

        try {

            System.out.println("Car will stop after: " + sec + "S");

            Thread.sleep(sec * 1000);

            System.out.println("fuel finished Car Stoped! ");

        } catch (InterruptedException e) {

            System.out.print("Time Interputed");

        }

    }

}