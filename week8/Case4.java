package week8;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.println("Fibonacci Number Calculation Program");
        System.out.print("Input n = ");
        n = input.nextInt();
        
        System.out.println("Fibonacci number at position " + n + " is = " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
