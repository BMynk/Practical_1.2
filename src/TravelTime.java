import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance to Alice campus (in km): ");
        double distance = input.nextDouble();

        System.out.print("Enter the speed of the cab (in km/h): ");
        double speed = input.nextDouble();

        if (speed <= 0) {
            System.out.println("Speed must be greater than 0.");
        } else {
            double time = distance / speed;
            System.out.printf("The travel time is %.2f hours.%n", time);
        }

        input.close();
    }
}