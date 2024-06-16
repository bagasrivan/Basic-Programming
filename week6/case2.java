package week6;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int number;
        double average = 0;
        int min = 999999, max = -999999;
        String condition = "y";

        System.out.println("Program to Calculate Average, Minimum, and Maximum Values");
        
        do {
            System.out.print("Enter a number = ");
            number = input.nextInt();
            System.out.print("Do you want to continue? (y/n) = ");
            condition = input.next();
            i++;
            average += number;
            max = (number > max) ? number : max;
            min = (number < min) ? number : min;
        } while (condition.equalsIgnoreCase("y"));
        
        System.out.println("Average: " + (average / i));
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
