import java.util.Scanner;

public class GasPerGallons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven or -1 to quit: ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip is %.2f%n", mpg);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.print("Enter miles driven or -1 to quit: ");
            miles = input.nextInt();
        }

        if (totalGallons != 0) {
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon is %.2f%n", combinedMPG);
        } else {
            System.out.println("No data entered.");
        }

        input.close();
    }
}
