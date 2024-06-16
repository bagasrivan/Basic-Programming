package week8;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0, radius = 0, height = 0;
        boolean isInputProvided = false;
        
        System.out.println("Cylinder Program");
        System.out.println("=============");

        do {
            System.out.println("Menu Options");
            System.out.println("1. Input Radius \n2. Input Height \n3. Calculate Circle Area \n4. Calculate Cylinder Surface Area (Rectangle) \n5. Calculate Cylinder Surface Area \n6. Exit");
            System.out.print("Enter Menu Option = ");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.println("Please Input Radius");
                System.out.print("Enter Radius Value = ");
                radius = input.nextInt();
                System.out.println("Input Successful \n========");
                isInputProvided = true;
            } else if (menu == 2) {
                System.out.println("Please Input Height");
                System.out.print("Enter Height Value = ");
                height = input.nextInt();
                System.out.println("Input Successful \n========");
                isInputProvided = true;
            } else if (menu == 3) {
                if (isInputProvided) {
                    calculateCircleArea(radius);
                } else {
                    System.out.println("You Have Not Input Radius or Height");
                    System.out.println("===============================");
                }
            } else if (menu == 4) {
                if (isInputProvided) {
                    calculateCylinderSurfaceArea(radius, height);
                } else {
                    System.out.println("You Have Not Input Radius or Height");
                    System.out.println("===============================");
                }
            } else if (menu == 5) {
                if (isInputProvided) {
                    calculateTotalSurfaceArea(radius, height);
                } else {
                    System.out.println("You Have Not Input Radius or Height");
                    System.out.println("===============================");
                }
            } else if (menu == 6) {
                System.out.println("You Have Exited the Program. Thank You!");
            } else {
                System.err.println("Invalid Choice, Please Enter a Valid Option");
                System.out.println("==================================================");
            }
        } while (menu != 6);
    }

    public static double calculateCircleArea(double radius) {
        final double PI = 3.14;
        double circleArea = PI * radius * radius;
        System.out.println("Circle Area = " + circleArea);
        System.out.println("============================");
        return circleArea;
    }

    public static double calculateCylinderSurfaceArea(double radius, double height) {
        final double PI = 3.14;
        double cylinderSurfaceArea = PI * radius * radius * height;
        System.out.println("Cylinder Surface Area = " + cylinderSurfaceArea);
        System.out.println("====================================");
        return cylinderSurfaceArea;
    }

    public static double calculateTotalSurfaceArea(double radius, double height) {
        double totalSurfaceArea = 2 * (calculateCircleArea(radius) + (calculateCylinderSurfaceArea(radius, height)));
        System.out.println("Total Cylinder Surface Area = " + totalSurfaceArea);
        System.out.println("==========================================");
        return totalSurfaceArea;
    }
}
