package week7;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, a = 1;
        
        do {
            System.out.println("Welcome, Menu Options: ");
            System.out.println("1. Positive, Negative, Zero Numbers \n2. Odd, Even Numbers \n3. Re-enter Choice");
            System.out.print("Enter Menu Choice = ");
            menu = input.nextInt();

            if (menu == 1) {
                pnz();
                System.out.println("=========");
            } else if (menu == 2) {
                oe();
                System.out.println("=========");
            } else if (menu == 3) {
                System.out.println("Please Re-enter Your Choice");
                System.out.println("1. Positive, Negative, Zero Numbers \n2. Odd, Even Numbers \n3. Re-enter Choice");
                System.out.print("Enter Menu Choice = ");
                menu = input.nextInt();

                if (menu == 1) {
                    pnz();
                    System.out.println("=========");
                } else if (menu == 2) {
                    oe();
                    System.out.println("=========");
                }
            } else if (menu == 4) {
                System.out.println("Program Stopped");
                a++;
            } else {
                System.err.println("Invalid Choice, Please Enter a Valid Option");
            }

        } while (a < 2);
    }

    public static void pnz() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Positive, Negative, and Zero Number Program");
        System.out.print("Enter a Number = ");
        int number = input.nextInt();

        if (number != 0) {
            if (number > 0) {
                System.out.println(number + " is a Positive Number");
            } else {
                System.out.println(number + " is a Negative Number");
            }
        } else {
            System.out.println(number + " is Zero");
        }
    }

    public static void oe() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Odd and Even Number Program");
        System.out.print("Enter a Number = ");
        int number = input.nextInt();

        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is an Even Number");
            } else {
                System.out.println(number + " is an Odd Number");
            }
        } else {
            System.out.println(number + " is ZERO, Neither Odd Nor Even");
        }
    }
}
