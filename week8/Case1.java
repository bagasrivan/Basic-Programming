package week8;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int birthYear;
        
        System.out.println("Program to Determine User Age");
        System.out.println("========");
       
        System.out.print("Enter Your Name = ");
        name = input.next();
        System.out.print("Enter Your Birth Year = ");
        birthYear = input.nextInt();
        
        int age = 2022 - birthYear;
        System.out.println(bio(name, age));
    }

    public static String bio(String name, int age) {
        return name + " is " + age + " years old";
    }
}
