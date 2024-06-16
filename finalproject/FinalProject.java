package finalproject;

import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        login();
        mainMenu();
    }

    public static void login() {
        Scanner input = new Scanner(System.in);
        int choose, i = 0;
        String username, password;
        boolean isRegistered = false;
        
        System.out.println("Welcome to Vandio Restaurant");
        System.out.println("Please Register or Login First");
        
        do {
            System.out.println("1.Register \n2.Login");
            System.out.print("Enter Your Choice = ");
            choose = input.nextInt();

            if (choose == 1) {
                System.out.println("Please Register");
                System.out.print("Enter Username = ");
                username = input.next();
                System.out.print("Enter Password = ");
                password = input.next();
                isRegistered = true;
                if (username.equals("vandio") && password.equals("2211016310019")) {
                    System.out.println("Thank You for Registering, Please Login");
                    System.out.println("====");
                    i = 1;
                }
            } else if (choose == 2) {
                System.out.println("Please Login");
                System.out.print("Enter Username = ");
                username = input.next();
                System.out.print("Enter Password = ");
                password = input.next();
                if (isRegistered) {
                    if (username.equals("vandio") && password.equals("2211016310019")) {
                        System.out.println("Login Successful");
                        i = 2;
                        System.out.println("====");
                    } else {
                        System.out.println("Invalid Username or Password");
                        i = 1;
                        System.out.println("====");
                    }
                    break;
                } else {
                    System.out.println("You Have Not Registered Yet, Please Register First");
                    System.out.println("====");
                    i = 1;
                }
            }
        } while (i == 2 || i == 1);
    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        int choose;
        
        do {
            System.out.println("Welcome to Vandio Restaurant");
            System.out.println("1.Show Menu \n2.Exit");
            System.out.print("Enter Your Choice = ");
            choose = input.nextInt();
            if (choose == 1) {
                showMenu();
                break;
            } else if (choose == 2) {
                System.out.println("Exiting the Program, Thank You");
                System.out.println("====");
            }
        } while (choose != 2);
    }

    public static void showMenu() {
        Scanner input = new Scanner(System.in);
        int menu, quantity = 0, price = 0, addMore, choice, itemPrice = 0, k = 0;
        
        do {
            System.out.println("====");
            System.out.println("Menu Options : ");
            System.out.println("1.Meatball Rp.15000");
            System.out.println("2.Chicken Noodle Rp.12000");
            System.out.println("3.Iced Tea Rp.5000");
            System.out.println("4.Water Rp.3000");
            System.out.print("Enter Your Menu Choice = ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("You Ordered Meatball");
                    System.out.print("Enter Quantity = ");
                    quantity = input.nextInt();
                    itemPrice = 15000;
                    price = price + calculatePrice(quantity, itemPrice);
                    System.out.println("Total Amount Due = Rp." + price);
                    break;
                case 2:
                    System.out.println("You Ordered Chicken Noodle");
                    System.out.print("Enter Quantity = ");
                    quantity = input.nextInt();
                    itemPrice = 12000;
                    price = price + calculatePrice(quantity, itemPrice);
                    System.out.println("Total Amount Due = Rp." + price);
                    break;
                case 3:
                    System.out.println("You Ordered Iced Tea");
                    System.out.print("Enter Quantity = ");
                    quantity = input.nextInt();
                    itemPrice = 5000;
                    price = price + calculatePrice(quantity, itemPrice);
                    System.out.println("Total Amount Due = Rp." + price);
                    break;
                case 4:
                    System.out.println("You Ordered Water");
                    System.out.print("Enter Quantity = ");
                    quantity = input.nextInt();
                    itemPrice = 3000;
                    price = price + calculatePrice(quantity, itemPrice);
                    System.out.println("Total Amount Due = Rp." + price);
                    break;
                default:
                    System.out.println("Option Not Available, Please Enter Available Menu");
                    System.out.println("====");
                    break;
            }
            System.out.println("====");
            System.out.println("Would You Like to Buy More?");
            System.out.println("1.Yes \n2.No");
            System.out.print("Enter Your Choice = ");
            int j = input.nextInt();
            
            if (j == 1) {
                k = 1;
            } else {
                k = 2;
            }
        } while (k == 1);
        
        System.out.println("Total Amount Due = Rp." + price);
        System.out.println("Thank You");
    }

    public static int calculatePrice(int quantity, int itemPrice) {
        int totalPrice = quantity * itemPrice;
        return totalPrice;
    }
}
