package week2;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a = ");
        double a = input.nextDouble();

        System.out.print("Enter value for b = ");
        double b = input.nextDouble();

        String condition = a > b ? "True" : "False";

        System.out.println("Is a > b? " + condition);
    }
}
