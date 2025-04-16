import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input current population and growth rate
        System.out.print("Enter current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.0105 for 1.05%): ");
        double growthRate = input.nextDouble();

        double doublePopulation = population * 2;
        int yearDoubled = -1;

        System.out.printf("%-5s %-25s %-25s%n", "Year", "Estimated Population", "Annual Increase");

        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            population += increase;

            System.out.printf("%-5d %-25.0f %-25.0f%n", year, population, increase);

            if (yearDoubled == -1 && population >= doublePopulation) {
                yearDoubled = year;
            }
        }

        if (yearDoubled != -1) {
            System.out.println("\nPopulation will double in year: " + yearDoubled);
        } else {
            System.out.println("\nPopulation will not double within 75 years at this rate.");
        }
    }
}