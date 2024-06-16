/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Soal1 {
    public static void main(String[] args) {
        int menu, a = 1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Selamat Datang, Pilihan Menu : ");
            System.out.println("1.Bilangan Positif, Negatif, Nol \n2.Bilangan Ganjil, Genap \n3.Input Ulang Angka");
            System.out.print("Masukan Pilihan Menu = ");
            menu = input.nextInt();

            if (menu == 1) {
                pnn();
                System.out.println("=========");
            } else if (menu == 2) {
                gg();
                System.out.println("=========");
            } else if (menu == 3) {
                System.out.println("Silahkan Input Kembali Pilihan");
                System.out.println("1.Bilangan Positif, Negatif, Nol \n2.Bilangan Ganjil, Genap \n3.Input Ulang Angka");
                System.out.print("Masukan Pilihan Menu = ");
                menu = input.nextInt();

                if (menu == 1) {
                    pnn();
                    System.out.println("=========");
                } else if (menu == 2) {
                    gg();
                    System.out.println("=========");
                }
            } else if (menu == 4) {
                System.out.println("Program Berhenti");
                a++;
            } else {
                System.err.println("Pilihan Tidak Tersedia, Silahkan Masukan Pilihan Dengan Benar");
            }

        } while (a < 2);
    }

    public static void pnn() {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Di Program Bilangan Positif, Negatif, dan Nol ");
        System.out.print("Masukan Angka = ");
        int angka = input.nextInt();

        if (angka != 0) {
            if (angka > 0) {
                System.out.println(angka + " Adalah Bilangan Positif");
            } else if (angka < 0) {
                System.out.println(angka + " Adalah Bilangan Negatif");
            }
        } else {
            System.out.println(angka + " Adalah Nol");
        }
    }

    public static void gg() {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Di Program Bilangan Ganjil dan Genap");
        System.out.print("Masukan Angka = ");
        int angka = input.nextInt();

        if (angka != 0) {
            if (angka % 2 == 0) {
                System.out.println(angka + " Adalah Bilangan Genap");
            } else {
                System.out.println(angka + " Adalah Bilangan Ganjil");
            }
        } else {
            System.out.println(angka + " Adalah NOL, Bukan Ganjil dan Genap");
        }
    }
}