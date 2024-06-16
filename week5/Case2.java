package week5;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, number;

        System.out.print("Enter the number of stars: ");
        number = input.nextInt();

        for (a = number; a >= 0; a--) {
            for (b = number; b > a; b--) {
                System.out.print(" ");
            }
            for (c = 1; c <= b; c++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for (a = 0; a <= number; a++) {
            for (b = number; b > a; b--) {
                System.out.print(" ");
            }
            for (c = 1; c <= b; c++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
