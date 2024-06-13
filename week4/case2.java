package week4;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println("Question:");
        System.out.println("1. What is the result of 3 + 5? ");
        System.out.println("A. 7 \nB. 8 \nC. 9 \nD. 6 \nE. 10");
        System.out.print("Your Answer = ");
        answer = input.nextLine();

        switch (answer.toUpperCase()) {
            case "A":
            case "C":
            case "D":
            case "E":
                System.out.println("Your answer is incorrect");
                break;
            case "B":
                System.out.println("Your answer is correct");
                break;
            default:
                System.err.println("Invalid answer choice");
        }
    }
}
