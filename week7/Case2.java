package week7;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.println("Welcome");
        System.out.println("Please Enter a Number to Determine Prime and Fibonacci Numbers");
        System.out.print("Enter a Number = ");
        number = input.nextInt();
        
        checkPrime(number);
        checkFibonacci(number);
    }

    public static void checkPrime(int number) {
        int num = number;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is Not a Prime Number");
        }
    }

    public static void checkFibonacci(int number) {
        int a = 1;
        int b = 1;
        int fibo = a + b;
        while (fibo <= number) {
            if (fibo == number) {
                System.out.println(number + " is a Fibonacci Number");
                return;
            }
            a = b;
            b = fibo;
            fibo = a + b;
        }
        System.out.println(number + " is Not a Fibonacci Number");
    }
}
