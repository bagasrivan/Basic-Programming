package week7;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Welcome");
            System.out.println("Menu: \n1. Input Radius and Side Length \n2. Calculate Area and Circumference of Circle \n3. Calculate Area and Perimeter of Isosceles Triangle \n4. Calculate Length L \n5. Exit");
            System.out.print("Enter Your Choice = ");
            choice = input.nextInt();

            if (choice == 1) {
                inputValues();
                System.out.println("====");
            } else if (choice == 2) {
                circle();
                System.out.println("====");
            } else if (choice == 3) {
                triangle();
                System.out.println("====");
            } else if (choice == 4) {
                calculateLengthL();
                System.out.println("====");
            } else if (choice == 5) {
                System.out.println("You have exited the program. Thank you!");
            } else {
                System.err.println("Invalid choice, please enter a valid option!!");
            }
        } while (choice != 5);
    }

    public static void inputValues() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Input Radius and Side Length Values");
        System.out.print("Enter Radius = ");
        int radius = input.nextInt();
        System.out.print("Enter Side Length = ");
        int side = input.nextInt();
    }

    public static void circle() {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14;
        int r;
        double result;
        
        System.out.println("Welcome to the Circle Program");
        System.out.println("Menu: \n1. Circle Area \n2. Circle Circumference");
        System.out.print("Enter Menu Choice = ");
        int menu = input.nextInt();

        if (menu == 1) {
            System.out.println("Program to Calculate Circle Area");
            System.out.print("Enter Radius = ");
            r = input.nextInt();
            result = pi * r * r;
            System.out.println("Circle Area = " + result);
        } else if (menu == 2) {
            System.out.println("Program to Calculate Circle Circumference");
            System.out.print("Enter Radius = ");
            r = input.nextInt();
            result = 2 * pi * r;
            System.out.println("Circle Circumference = " + result);
        } else {
            System.err.println("Invalid choice");
        }
    }

    public static void triangle() {
        Scanner input = new Scanner(System.in);
        int base, height, side;
        double result;
        
        System.out.println("Welcome to the Isosceles Triangle Program");
        System.out.println("Menu: \n1. Isosceles Triangle Area \n2. Isosceles Triangle Perimeter");
        System.out.print("Enter Menu Choice = ");
        int menu = input.nextInt();

        if (menu == 1) {
            System.out.println("Program to Calculate Isosceles Triangle Area");
            System.out.print("Enter Base = ");
            base = input.nextInt();
            System.out.print("Enter Height = ");
            height = input.nextInt();
            result = base * height / 2.0;
            System.out.println("Triangle Area = " + result);
        } else if (menu == 2) {
            System.out.println("Program to Calculate Isosceles Triangle Perimeter");
            System.out.print("Enter Base = ");
            base = input.nextInt();
            System.out.print("Enter Equal Side Length = ");
            side = input.nextInt();
            result = (2 * side) + base;
            System.out.println("Triangle Perimeter = " + result);
        } else {
            System.err.println("Invalid choice");
        }
    }

    public static void calculateLengthL() {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        
        System.out.println("Calculate Length L");
        System.out.print("Enter Length a = ");
        a = input.nextDouble();
        System.out.print("Enter Length b = ");
        b = input.nextDouble();
        System.out.print("Enter Length c = ");
        c = input.nextDouble();
        double L = a + b + c;
        System.out.println("The total length L is = " + L);
    }
}
