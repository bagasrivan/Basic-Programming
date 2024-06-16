package week5;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalNumbers, initialValue, difference, fibonacci;
        System.out.print("Enter the number of Fibonacci terms to display: ");
        totalNumbers = input.nextInt();

        initialValue = 1;
        difference = 0;
        fibonacci = 1;

        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print(difference + ", ");
            fibonacci = initialValue + difference;
            initialValue = difference;
            difference = fibonacci;
        }
    }
}
