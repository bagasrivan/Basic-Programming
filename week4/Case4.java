package week4;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of Days in a Month");
        System.out.println("======================");
        System.out.print("Enter the Month = ");
        String month = input.nextLine();

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Number of Days in " + month + " is 31");
                break;
            case "february":
                System.out.println("Number of Days in " + month + " is 28");
                break;
            case "march":
                System.out.println("Number of Days in " + month + " is 31");
                break;
            case "april":
                System.out.println("Number of Days in " + month + " is 30");
                break;
            case "may":
                System.out.println("Number of Days in " + month + " is 31");
                break;
            case "june":
                System.out.println("Number of Days in " + month + " is 30");
                break;
            case "july":
                System.out.println("Number of Days in " + month + " is 31");
                break;
            case "august":
                System.out.println("Number of Days in " + month + " is 31");
                break;
            case "september":
                System.out.println("Number of Days in " + month + " is 30");
                break;
            case "october":
                System.out.println("Number of Days in " + month + " is 31");
                break;
            case "november":
                System.out.println("Number of Days in " + month + " is 30");
                break;
            case "december":
                System.out.println("Number of Days in " + month + " is 31");
                break;
            default:
                System.err.println("Invalid Month");
                break;
        }
    }
}
