package week3;

import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        int price = 10000;
        int quantityOfDrinks;

        System.out.println("Berkah Membahana Drink Shop");
        System.out.println("==============================");
        System.out.println("Menu Options\n 1. Buy Drinks\n 2. Exit");

        System.out.print("Select Menu = ");
        menu = input.nextInt();

        if (menu == 1) {
            System.out.print("Quantity of Drinks = ");
            quantityOfDrinks = input.nextInt();
            int totalPrice = quantityOfDrinks * price;

            if (totalPrice > 50000) {
                int discount = totalPrice * 10 / 100;
                int finalTotal = totalPrice - discount;
                System.out.println("You bought " + quantityOfDrinks + " drinks with a total price of Rp." + totalPrice
                        + " and a discount of Rp." + discount + ". Your total payment is Rp." + finalTotal);
            } else if (totalPrice > 30000) {
                int discount2 = totalPrice * 5 / 100;
                int finalTotal2 = totalPrice - discount2;
                System.out.println("You bought " + quantityOfDrinks + " drinks with a total price of Rp." + totalPrice
                        + " and a discount of Rp." + discount2 + ". Your total payment is Rp." + finalTotal2);
            } else {
                System.out.println("You bought " + quantityOfDrinks + " drinks with a total price of Rp." + totalPrice);
            }
        } else if (menu == 2) {
            System.err.println("You have exited the program");
        } else {
            System.err.println("Menu Not Available");
        }
    }
}
