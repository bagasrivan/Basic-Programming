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
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiPertama, nilaiKedua;
        System.out.println("Program Tabel Perkalian");

        System.out.print("Masukan Nilai Pertama = ");
        nilaiPertama = input.nextInt();
        System.out.print("Masukan Nilai Kedua: ");
        nilaiKedua = input.nextInt();
        System.out.println("\nTabel Perkalian " + nilaiPertama + " Dan " + nilaiKedua);

        System.out.println("\nx \t | \t1 \t2");

        System.out.println("==========================");

        while (nilaiPertama <= nilaiKedua) {
            int hasilKali1 = nilaiPertama * 1;
            int hasilKali2 = nilaiPertama * 2;

            System.out.println(nilaiPertama + "\t | \t" + hasilKali1 + " \t" + hasilKali2);
            nilaiPertama++;
        }
    }
}