package week6;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        int i = 1;

        System.out.println("Welcome to the Continue Program");

        do {
            System.out.println("Menu Options: ");
            System.out.println("1. Continue \n2. Stop");
            System.out.print("Menu Choice = ");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.println("Continue\n===========");
            } else if (menu == 2) {
                System.out.println("You have exited the program");
                i++;
            } else {
                System.err.println("Invalid Choice");
                i++;
            }
        } while (i < 2);
    }
}
