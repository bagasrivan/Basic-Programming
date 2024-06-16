/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, angka;

        System.out.print("Masukan Jumlah Bintang = ");
        angka = input.nextInt();

        for (a = angka; a >= 0; a--) {
            for (b = angka; b > a; b--) {
                System.out.print(" ");
            }
            for (c = 1; c <= b; c++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for (a = 0; a <= angka; a++) {
            for (b = angka; b > a; b--) {
                System.out.print(" ");
            }
            for (c = 1; c <= b; c++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}