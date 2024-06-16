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
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0, r = 0, t = 0;
        boolean cp = false;
        System.out.println("Program Tabung");
        System.out.println("=============");

        do {
            System.out.println("Pilihan Menu");
            System.out.println("1.Input Jari-Jari \n2.Input Tinggi \n3.Hitung Luas Lingkaran \n4.Hitung Luas Selimut Tabung (Persegi) \n5.Hitung Luas Permukaan Tabung \n6.Keluar");
            System.out.print("Masukan Pilihan Menu = ");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.println("Silahkan Input Jari-Jari");
                System.out.print("Masukan Nilai Jari-Jari = ");
                r = input.nextInt();
                System.out.println("Input Berhasil \n========");
                cp = true;
            } else if (menu == 2) {
                System.out.println("Silahkan Input Tinggi");
                System.out.print("Masukan Nilai Tinggi = ");
                t = input.nextInt();
                System.out.println("Input Berhasil \n========");
                cp = true;
            } else if (menu == 3) {
                if (cp == true) {
                    luasLing(r);
                } else {
                    System.out.println("Anda Belum Input Jari-Jari Atau Tinggi");
                    System.out.println("===============================");
                }
            } else if (menu == 4) {
                if (cp == true) {
                    luasSelBung(r, t);
                } else {
                    System.out.println("Anda Belum Input Jari-Jari Atau Tinggi");
                    System.out.println("===============================");
                }
            } else if (menu == 5) {
                if (cp == true) {
                    luasPerBung(r, t);
                } else {
                    System.out.println("Anda Belum Input Jari-Jari Atau Tinggi");
                    System.out.println("===============================");
                }
            } else if (menu == 6) {
                System.out.println("Anda Telah Keluar Dari Program, Terimakasih");
            } else {
                System.err.println("Pilihan Tidak Tersedia, Silahkan Masukan Pilihan Dengan Benar");
                System.out.println("==================================================");
            }

        } while (menu != 6);
    }

    public static double luasLing(double r) {
        final double Phi = 3.14;
        double luasLingkaran = Phi * r * r;
        System.out.println("Luas Lingkaran = " + luasLingkaran);
        System.out.println("============================");
        return luasLingkaran;
    }

    public static double luasSelBung(double r, double t) {
        final double Phi = 3.14;
        double luasSelimutTabung = Phi * r * r * t;
        System.out.println("Luas Selimut Tabung = " + luasSelimutTabung);
        System.out.println("====================================");
        return luasSelimutTabung;
    }

    public static double luasPerBung(double r, double t) {
        double luasPermukaanTabung = 2 * (luasLing(r) + (luasSelBung(r, t)));
        System.out.println("Luas Permukaan Tabung = " + luasPermukaanTabung);
        System.out.println("==========================================");
        return luasPermukaanTabung;
    }
}