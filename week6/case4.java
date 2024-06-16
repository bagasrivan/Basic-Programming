package week6;

import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int menu;
        int i = 0;
        String name = null, username = null, password = null;

        System.out.println("Welcome, Please Log In to Your Account");
        System.out.println("Please Choose a Menu Option: ");
        System.out.println("1. Register \n2. Login");
        System.out.print("Your Menu Choice = ");
        menu = input.nextInt();

        do {
            if (menu == 1) {
                System.out.println("Please Complete the Following Information to Register");
                System.out.print("Enter Name = ");
                name = input2.next();

                System.out.print("Enter Username = ");
                username = input2.next();

                System.out.print("Enter Password = ");
                password = input2.next();

                if (name.equals("bagaskararidhovandio") && (username.equals("bagasgaming311") && (password.equals("2211016310019")))) {
                    System.out.println("Sorry, That Account Is Already Registered");
                } else {
                    System.out.println("Thank You for Registering, Please Log In Again");
                }

            } else if (menu == 2) {
                System.out.println("Please Enter Your Username and Password");
                System.out.print("Enter Username = ");
                username = input2.next();
                System.out.print("Enter Password = ");
                password = input2.next();
                i++;

                if (username.equals("bagasgaming31") && (password.equals("2211016310019"))) {
                    System.out.println("bagaskara ridho vandio with NIM " + password + " Login Successful");
                    i++;
                } else {
                    System.err.println("You Have Not Registered, Please Register First");
                }
            }
        } while (menu < 1);
    }
}
