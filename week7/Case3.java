package week7;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        multiples();
    }

    public static void multiples() {
        Scanner input = new Scanner(System.in);
        String answer;
        
        do {
            System.out.print("Enter the Multiple Number = ");
            int multiple = input.nextInt();
            System.out.print("Enter the Range for the Multiple = ");
            int range = input.nextInt();

            for (int x = multiple; x <= range; x += multiple) {
                System.out.println(x + " ");
            }
            System.out.print("Do You Want to Repeat the Program Y/N? = ");
            answer = input.next();
        } while (answer.equalsIgnoreCase("Y"));
    }
}
