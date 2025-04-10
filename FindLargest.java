/* Initialize counter to 1
Initialize largest to the smallest possible integer (or 0)
While counter <= 10:
    Prompt user to enter a number
    Input number
    If number > largest:
        Set largest to number
    Increment counter
Print the largest number */

import java.util.Scanner;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;

        System.out.print("Enter integer #1: ");
        number = input.nextInt();
        largest = number; // use first input to initialize

        counter++; // we've already processed the first number

        while (counter <= 10) {
            System.out.printf("Enter integer #%d: ", counter);
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.printf("The largest number is: %d%n", largest);
        input.close();
    }
}
