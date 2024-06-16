package week4;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color;

        System.out.println("Primary Color Determination Program");
        System.out.println("===============================");

        System.out.print("Enter a Color = ");
        color = input.nextLine();

        switch (color.toLowerCase()) {
            case "red":
            case "blue":
            case "yellow":
                System.out.println(color + " is a Primary Color");
                break;
            default:
                System.out.println(color + " is not a Primary Color");
                break;
        }
    }
}
