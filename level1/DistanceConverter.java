import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion factors
        double feetToYards = 1.0 / 3;
        double yardsToMiles = 1.0 / 1760;

        // Convert distance to yards and miles
        double distanceInYards = distanceInFeet * feetToYards;
        double distanceInMiles = distanceInYards * yardsToMiles;

        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles for the given " + distanceInFeet + " feet.");
    }
}
