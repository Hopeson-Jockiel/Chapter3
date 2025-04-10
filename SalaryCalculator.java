import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours worked (-1 to quit): ");
        double hours = input.nextDouble();

        while (hours != -1) {
            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double pay = (hours <= 40) ? hours * rate : 40 * rate + (hours - 40) * rate * 1.5;
            System.out.printf("Gross pay: $%.2f%n%n", pay);

            System.out.print("Enter hours worked (-1 to quit): ");
            hours = input.nextDouble();
        }

        System.out.println("Salary calculation ended.");
        input.close();
    }
}
