package middleproject;

import java.util.Scanner;

public class MiddleProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int choice, number1, number2, result;
        final double PI = 3.141592;
        float radius, circleArea;
        int base, height, side, length, width, heightBalok;
        double triangleArea;

        System.out.println("WELCOME TO MATHEMATICAL OPERATION PROGRAM");
        System.out.println("========================================");
        System.out.println("Please Login to Use This Program");

        System.out.print("Enter Username = ");
        username = input.nextLine();
        System.out.print("Enter Password = ");
        password = input.nextLine();

        if (username.equals("bagaskara ridho vandio") && password.equals("2211016310019")) {
            System.out.println("Congratulations! You have successfully logged in");
            System.out.println("Available Mathematical Operations Menu");
            System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulo \n6.Circle Operations");
            System.out.println("7.Triangle Operations \n8.Cuboid Operations \n9.Determine Number Size 1-10");
            System.out.print("Enter Your Choice = ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Welcome to Addition Program");
                    System.out.print("Enter First Number = ");
                    number1 = input.nextInt();
                    System.out.print("Enter Second Number = ");
                    number2 = input.nextInt();
                    result = number1 + number2;
                    System.out.println("Addition Result of " + number1 + " and " + number2 + " is " + result);
                    break;
                case 2:
                    System.out.println("Welcome to Subtraction Program");
                    System.out.print("Enter First Number = ");
                    number1 = input.nextInt();
                    System.out.print("Enter Second Number = ");
                    number2 = input.nextInt();
                    result = number1 - number2;
                    System.out.println("Subtraction Result of " + number1 + " and " + number2 + " is " + result);
                    break;
                case 3:
                    System.out.println("Welcome to Multiplication Program");
                    System.out.print("Enter First Number = ");
                    number1 = input.nextInt();
                    System.out.print("Enter Second Number = ");
                    number2 = input.nextInt();
                    result = number1 * number2;
                    System.out.println("Multiplication Result of " + number1 + " and " + number2 + " is " + result);
                    break;
                case 4:
                    System.out.println("Welcome to Division Program");
                    System.out.print("Enter First Number = ");
                    number1 = input.nextInt();
                    System.out.print("Enter Second Number = ");
                    number2 = input.nextInt();
                    result = number1 / number2;
                    System.out.println("Division Result of " + number1 + " and " + number2 + " is " + result);
                    break;
                case 5:
                    System.out.println("Welcome to Modulo Program");
                    System.out.print("Enter First Number = ");
                    number1 = input.nextInt();
                    System.out.print("Enter Second Number = ");
                    number2 = input.nextInt();
                    result = number1 % number2;
                    System.out.println("Modulo Result of " + number1 + " and " + number2 + " is " + result);
                    break;
                case 6:
                    System.out.println("Welcome to Circle Operations Program");
                    System.out.println("Program Choices");
                    System.out.println("1.Circle Area \n2.Circle Circumference");
                    System.out.print("Enter Your Choice = ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Circle Area Program");
                        System.out.println("====================");
                        System.out.print("Enter Radius of the Circle = ");
                        radius = input.nextFloat();
                        circleArea = (float) (PI * radius * radius);
                        System.out.println("Circle Area = " + circleArea);
                    } else if (choice == 2) {
                        System.out.println("Circle Circumference Program");
                        System.out.println("============================");
                        System.out.print("Enter Radius of the Circle = ");
                        radius = input.nextFloat();
                        circleArea = (float) (2 * PI * radius);
                        System.out.println("Circle Circumference = " + circleArea);
                    } else {
                        System.err.println("Choice Not Available");
                    }
                    break;
                case 7:
                    System.out.println("Welcome to Triangle Operations Program");
                    System.out.println("Program Choices");
                    System.out.println("1.Triangle Area \n2.Triangle Perimeter");
                    System.out.print("Enter Your Choice = ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Triangle Area Program");
                        System.out.println("=======================");
                        System.out.print("Enter Base = ");
                        base = input.nextInt();
                        System.out.print("Enter Height = ");
                        height = input.nextInt();
                        triangleArea = base * height / 2.0;
                        System.out.println("Triangle Area = " + triangleArea);
                    } else if (choice == 2) {
                        System.out.println("Triangle Perimeter Program");
                        System.out.println("===========================");
                        System.out.print("Enter Side Length = ");
                        side = input.nextInt();
                        result = 3 * side;
                        System.out.println("Triangle Perimeter = " + result);
                    } else {
                        System.err.println("Choice Not Available");
                    }
                    break;
                case 8:
                    System.out.println("Welcome to Cuboid Operations Program");
                    System.out.println("Program Choices");
                    System.out.println("1.Cuboid Surface Area \n2.Cuboid Perimeter \n3.Cuboid Volume");
                    System.out.print("Enter Your Choice = ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Cuboid Surface Area Program");
                        System.out.println("============================");
                        System.out.print("Enter Length = ");
                        length = input.nextInt();
                        System.out.print("Enter Width = ");
                        width = input.nextInt();
                        System.out.print("Enter Height = ");
                        heightBalok = input.nextInt();
                        result = 2 * (length * width + length * heightBalok + width * heightBalok);
                        System.out.println("Cuboid Surface Area = " + result);
                    } else if (choice == 2) {
                        System.out.println("Cuboid Perimeter Program");
                        System.out.println("=========================");
                        System.out.print("Enter Length = ");
                        length = input.nextInt();
                        System.out.print("Enter Width = ");
                        width = input.nextInt();
                        System.out.print("Enter Height = ");
                        heightBalok = input.nextInt();
                        result = 4 * (length + width + heightBalok);
                        System.out.println("Cuboid Perimeter = " + result);
                    } else if (choice == 3) {
                        System.out.println("Cuboid Volume Program");
                        System.out.println("======================");
                        System.out.print("Enter Length = ");
                        length = input.nextInt();
                        System.out.print("Enter Width = ");
                        width = input.nextInt();
                        System.out.print("Enter Height = ");
                        heightBalok = input.nextInt();
                        result = length * width * heightBalok;
                        System.out.println("Cuboid Volume = " + result);
                    } else {
                        System.err.println("Choice Not Available");
                    }
                    break;
                case 9:
                    System.out.println("Welcome to Determine Number Size Program");
                    System.out.println("=======================================");
                    System.out.print("Enter Number = ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            System.out.println(choice + " < 5");
                            break;
                        case 5:
                            System.out.println(choice + " = 5");
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            System.out.println(choice + " > 5");
                            break;
                        default:
                            System.err.println("Please Enter Numbers from 1 to 10");
                            break;
                    }
                    break;
            }
        } else {
            System.err.println("Sorry, Incorrect Username or Password!");
        }
    }
}
