package week4;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width, height;

        System.out.println("Cuboid Program");
        System.out.println("==========================");
        System.out.println("1. Cuboid Perimeter \n2. Cuboid Surface Area \n3. Cuboid Volume");

        System.out.print("Enter Your Choice = ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Cuboid Perimeter");
                System.out.print("Enter Length = ");
                length = input.nextInt();
                System.out.print("Enter Width = ");
                width = input.nextInt();
                System.out.print("Enter Height = ");
                height = input.nextInt();
                int perimeter = 4 * (length + width + height);
                System.out.println("Cuboid Perimeter = " + perimeter);
                break;
            case 2:
                System.out.println("Cuboid Surface Area");
                System.out.print("Enter Length = ");
                length = input.nextInt();
                System.out.print("Enter Width = ");
                width = input.nextInt();
                System.out.print("Enter Height = ");
                height = input.nextInt();
                int surfaceArea = 2 * (length * width + length * height + width * height);
                System.out.println("Cuboid Surface Area = " + surfaceArea);
                break;
            case 3:
                System.out.println("Cuboid Volume");
                System.out.print("Enter Length = ");
                length = input.nextInt();
                System.out.print("Enter Width = ");
                width = input.nextInt();
                System.out.print("Enter Height = ");
                height = input.nextInt();
                int volume = length * width * height;
                System.out.println("Cuboid Volume = " + volume);
                break;
            default:
                System.err.println("Choice Not Available");
                break;
        }
    }
}
