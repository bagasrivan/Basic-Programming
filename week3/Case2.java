package week3;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gpa, credits;

        System.out.println("GPA Credit Program");

        System.out.print("Enter GPA = ");
        gpa = input.nextDouble();

        if (gpa < 2.5) {
            System.out.println("Credit Allocation = 18");
        } else if (gpa < 2.75) {
            System.out.println("Credit Allocation = 20");
        } else if (gpa < 3) {
            System.out.println("Credit Allocation = 22");
        } else if (gpa < 3.5) {
            System.out.println("Credit Allocation = 23");
        } else if (gpa <= 4) { 
            System.out.println("Credit Allocation = 24");
        } else {
            System.err.println("System Error");
        }
    }
}
