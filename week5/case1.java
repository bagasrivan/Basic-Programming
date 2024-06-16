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
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 999999, max = -9999999;
        int totalAngka, angka;
        int nilaiAwal = 0;

        System.out.print("Masukan Angka = ");
        totalAngka = input.nextInt();

        for (int j = 0; j < totalAngka; j++) {
            System.out.print("Masukan Input Ke- " + (j + 1) + " : ");
            angka = input.nextInt();
            nilaiAwal += angka;

            if (angka > max) {
                max = angka;
            }
            if (angka < min) {
                min = angka;
            }
        }
        System.out.println("Nilai Terbesar Dari Inputan Adalah = " + max);
        System.out.println("Nilai Terkecil Dari Inputan Adalah = " + min);
        System.out.println("Nilai Rata-Rata Dari Inputan Adalah = " + (double) nilaiAwal / totalAngka);
    }
}