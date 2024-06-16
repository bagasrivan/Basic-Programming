/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int angka;
        double rataRata = 0;
        int min = 999999, max = -999999;
        String kondisi = "y";

        System.out.println("Program Menghitung Rata-Rata Dan Nilai Terkecil Terbesar");
        do {
            System.out.print("Masukkan Angka = ");
            angka = input.nextInt();
            System.out.print("Ingin Dilanjutkan? (y/n) = ");
            kondisi = input.next();
            i++;
            rataRata = angka + rataRata;
            max = (angka > max) ? angka : max;
            min = (angka < min) ? angka : min;
        } while (kondisi.equalsIgnoreCase("y"));
        System.out.println("Rata-rata : " + (double) (rataRata / i));
        System.out.println("Nilai Terkecil : " + min);
        System.out.println("Nilai Terbesar : " + max);
    }
}