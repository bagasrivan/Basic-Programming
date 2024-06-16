package week3;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        int totalShopping, totalItems, cashback;

        System.out.println("Today's Shopping: Buy 2 Get 1 Free!!!");
        System.out.println("And there's Cashback too, *terms and conditions apply");
        Scanner input = new Scanner(System.in);
        System.out.println("===============================");

        System.out.print("Enter Total Shopping = ");
        totalShopping = input.nextInt();

        if (totalShopping % 5 == 0 && totalShopping % 2 == 0) {
            cashback = 15000 * (totalShopping / 5);
            totalItems = totalShopping + (totalShopping / 2);
        } else {
            cashback = 15000 * (totalShopping / 5);
            totalItems = totalShopping + (totalShopping / 2);
        }
        System.out.println("You bought\t" + totalShopping + "\titems with a bonus of\t" + (totalItems - totalShopping)
                + "\titems, making a total of\t" + totalItems + "\titems");
        System.out.println("You received a cashback of = " + cashback);
        System.out.println("Thank you");
        System.out.println("===================================");
    }
}
