package week6;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstValue, secondValue;
        
        System.out.println("Multiplication Table Program");

        System.out.print("Enter the first value = ");
        firstValue = input.nextInt();
        System.out.print("Enter the second value: ");
        secondValue = input.nextInt();
        System.out.println("\nMultiplication Table of " + firstValue + " and " + secondValue);

        System.out.println("\nx \t | \t1 \t2");

        System.out.println("==========================");

        while (firstValue <= secondValue) {
            int product1 = firstValue * 1;
            int product2 = firstValue * 2;

            System.out.println(firstValue + "\t | \t" + product1 + " \t" + product2);
            firstValue++;
        }
    }
}
