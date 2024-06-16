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
public class Soal4 {
    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Selamat Datang");
            System.out.println("Menu : \n1.Input Radius dan Panjang Sisi \n2.Hitung Luas dan Keliling Lingkaran \n3.Hitung Luas dan Keliling Segitiga Sama Kaki \n4.Hitung Panjang L \n5.Keluar");
            System.out.print("Masukan Pilihan = ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                input();
                System.out.println("====");
            } else if (pilihan == 2) {
                lingkaran();
                System.out.println("====");
            } else if (pilihan == 3) {
                segitiga();
                System.out.println("====");
            } else if (pilihan == 4) {

            } else if (pilihan == 5) {
                System.out.println("Anda Keluar Dari Program, Terimakasih");
            } else {
                System.err.println("Pilihan Tidak Tersedia, Masukan Pilihan Yang Benar!!");
            }

        } while (pilihan != 5);

    }

    public static void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Input Nilai Radius dan Panjang Sisi");
        System.out.print("Masukan Nilai Radius = ");
        int radius = input.nextInt();
        System.out.print("Masukan Panjang Sisi = ");
        int sisi = input.nextInt();
    }

    public static void lingkaran() {
        final double phi = 3.14;
        int r;
        double hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Di Program Lingkaran");
        System.out.println("Menu : \n1.Luas Lingkaran \n2.Keliling Lingkaran");
        System.out.print("Masukan Pilihan Menu = ");
        int menu = input.nextInt();

        if (menu == 1) {
            System.out.println("Program Menghitung Luas Lingkaran");
            System.out.print("Masukan Jari-Jari = ");
            r = input.nextInt();
            hasil = phi * r * r;
            System.out.println("Luas Lingkaran Adalah = " + hasil);
        } else if (menu == 2) {
            System.out.println("Program Menghitung Keliling Lingkaran");
            System.out.print("Masukan Jari-Jari = ");
            r = input.nextInt();
            hasil = 2 * phi * r;
            System.out.println("Keliling Lingkaran Adalah = " + hasil);
        } else {
            System.err.println("Pilihan Tidak Tersedia");
        }
    }

    public static void segitiga() {
        int a, t, s;
        double hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Di Program Segitiga Sama Kaki");
        System.out.println("Menu : \n1.Luas Segitiga Sama Kaki \n2.Keliling Segitiga Sama Kaki");
        System.out.print("Masukan Pilihan Menu = ");
        int menu = input.nextInt();

        if (menu == 1) {
            System.out.println("Program Menghitung Luas Segitiga Sama Kaki");
            System.out.print("Masukan Alas = ");
            a = input.nextInt();
            System.out.print("Masukan Tinggi = ");
            t = input.nextInt();
            hasil = a * t / 2;
            System.out.println("Luas Segitiga Adalah = " + hasil);
        } else if (menu == 2) {
            System.out.println("Program Menghitung Keliling Segitiga Sama Kaki");
            System.out.print("Masukan Alas = ");
            a = input.nextInt();
            System.out.print("Masukan Sisi Yang Sama = ");
            s = input.nextInt();
            hasil = (2 * s) + a;
            System.out.println("Keliling Segitiga Adalah = " + hasil);
        } else {
            System.err.println("Pilihan Tidak Tersedia");
        }
    }
}