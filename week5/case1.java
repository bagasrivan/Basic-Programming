package week5;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 999999, max = -9999999;
        int totalNumbers, number;
        int initialValue = 0;

        System.out.print("Enter the number of inputs: ");
        totalNumbers = input.nextInt();

        for (int j = 0; j < totalNumbers; j++) {
            System.out.print("Enter Input " + (j + 1) + ": ");
            number = input.nextInt();
            initialValue += number;

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("The largest value from the inputs is: " + max);
        System.out.println("The smallest value from the inputs is: " + min);
        System.out.println("The average value from the inputs is: " + (double) initialValue / totalNumbers);
    }
}
