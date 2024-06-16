package week2;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double volume;

        System.out.print("Enter Length = ");
        double length = input.nextDouble();
        System.out.print("Enter Width = ");
        double width = input.nextDouble();
        System.out.print("Enter Height = ");
        double height = input.nextDouble();

        volume = length * width * height;

        System.out.println("Volume of the Cuboid = " + volume);
    }
}
