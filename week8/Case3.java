package week8;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, r, n, sn, sn2;
        
        System.out.println("Geometric Series Calculation Program");
        System.out.println("=============================");
        
        System.out.print("Enter a = ");
        a = input.nextInt();
        System.out.print("Enter r = ");
        r = input.nextInt();
        System.out.print("Enter n = ");
        n = input.nextInt();

        sn = (int) (a * (Math.pow(r, n) - 1)) / (r - 1);
        sn2 = (int) (a * (1 - (Math.pow(r, n)))) / (1 - r);

        if (r > 1) {
            System.out.println(geo(n, sn));
        } else if (r < 1) {
            System.out.println(metri(n, sn2));
        }
    }

    public static String geo(int n, int sn) {
        return "Sum of the First " + n + " Terms of the Geometric Sequence is " + sn;
    }

    public static String metri(int n, int sn2) {
        return "Sum of the First " + n + " Terms of the Geometric Sequence is " + sn2;
    }
}
