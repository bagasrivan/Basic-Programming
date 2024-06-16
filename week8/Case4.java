/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Program Menghitung Bilangan Fibbonaci");
        System.out.print("Input n = ");
        n = input.nextInt();
        System.out.println("Bilangan Fibbonaci ke-" + n + " Adalah = " + fibbo(n));
    }

    public static int fibbo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibbo(n - 1) + fibbo(n - 2);
    }
}