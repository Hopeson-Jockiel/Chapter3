import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0;

        System.out.print("Enter item value sold (-1 to quit): ");
        double item = input.nextDouble();

        while (item != -1) {
            totalSales += item;

            System.out.print("Enter item value sold (-1 to quit): ");
            item = input.nextDouble();
        }

        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Total earnings: $%.2f%n", earnings);

        input.close();
    }
}
