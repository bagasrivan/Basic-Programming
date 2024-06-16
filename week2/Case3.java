package week2;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum;
        double average;

        System.out.print("Enter Value 1 = ");
        double value1 = input.nextDouble();

        System.out.print("Enter Value 2 = ");
        double value2 = input.nextDouble();

        System.out.print("Enter Value 3 = ");
        double value3 = input.nextDouble();

        sum = value1 + value2 + value3;
        average = sum / 3;

        System.out.println("Average = " + average);
    }
}
