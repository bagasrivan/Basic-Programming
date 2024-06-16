/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTPraktikum;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class UTPraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int pilihan, angka1, angka2, hasil;
        final double PHI = 3.141592;
        float r, hasillingkaran;
        int a, t, s, p, l;
        double hasilsegitiga;

        System.out.println("SELAMAT DATANG PADA PROGRAM OPERASI MATEMATIKA");
        System.out.println("==============================================");
        System.out.println("Untuk Menggunakan Program Ini Harap Login Terlebih Dahulu");

        System.out.print("Masukan Username = ");
        username = input.nextLine();
        System.out.print("Masukan Password = ");
        password = input.nextLine();

        if (username.equals("bagaskara ridho vandio") && password.equals("2211016310019")) {
            System.out.println("Selamat! Anda Berhasil Login");
            System.out.println("Menu Program Matematika Yang Tersedia");
            System.out.println("1.Penjumlahan \n2.Pengurangan \n3.Perkalian \n4.Pembagian \n5.Sisa Bagi \n6.Operasi Pada Lingkaran");
            System.out.println("7.Operasi Pada Segitiga \n8.Operasi Pada Balok \n9.Menentukan Besar Nilai 1-10");
            System.out.print("Tentukan Pilihan Anda = ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Selamat Datang Di Program Penjumlahan");
                    System.out.print("Masukan Angka Pertama = ");
                    angka1 = input.nextInt();
                    System.out.print("Masukan Angka Kedua = ");
                    angka2 = input.nextInt();
                    hasil = angka1 + angka2;
                    System.out.println("Hasil Penjumlahan Dari " + angka1 + " Dan " + angka2 + " Adalah " + hasil);
                    break;

                case 2:
                    System.out.println("Selamat Datang Di Program Pengurangan");
                    System.out.print("Masukan Angka Pertama = ");
                    angka1 = input.nextInt();
                    System.out.print("Masukan Angka Kedua = ");
                    angka2 = input.nextInt();
                    hasil = angka1 - angka2;
                    System.out.println("Hasil Pengurangan Dari " + angka1 + " Dan " + angka2 + " Adalah " + hasil);
                    break;

                case 3:
                    System.out.println("Selamat Datang Di Program Perkalian");
                    System.out.print("Masukan Angka Pertama = ");
                    angka1 = input.nextInt();
                    System.out.print("Masukan Angka Kedua = ");
                    angka2 = input.nextInt();
                    hasil = angka1 * angka2;
                    System.out.println("Hasil Perkalian Dari " + angka1 + " Dan " + angka2 + " Adalah " + hasil);
                    break;

                case 4:
                    System.out.println("Selamat Datang Di Program Pembagian");
                    System.out.print("Masukan Angka Pertama = ");
                    angka1 = input.nextInt();
                    System.out.print("Masukan Angka Kedua = ");
                    angka2 = input.nextInt();
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian Dari " + angka1 + " Dan " + angka2 + " Adalah " + hasil);
                    break;

                case 5:
                    System.out.println("Selamat Datang Di Program Sisa Bagi");
                    System.out.print("Masukan Angka Pertama = ");
                    angka1 = input.nextInt();
                    System.out.print("Masukan Angka Kedua = ");
                    angka2 = input.nextInt();
                    hasil = angka1 % angka2;
                    System.out.println("Sisa Bagi Dari " + angka1 + " Dan " + angka2 + " Adalah " + hasil);
                    break;

                case 6:
                    System.out.println("Selamat Datang Di Program Operasi Pada Lingkaran");
                    System.out.println("Pilihan Program");
                    System.out.println("1.Luas Lingkaran \n2.Keliling Lingkaran");
                    System.out.print("Masukan Pilihan = ");
                    pilihan = input.nextInt();

                    if (pilihan == 1) {
                        System.out.println("Program Luas Lingkaran");
                        System.out.println("======================");
                        System.out.print("Masukan Jari-Jari Lingkaran = ");
                        r = input.nextFloat();
                        hasillingkaran = (float) (PHI * r * r);
                        System.out.println("Luas Lingkaran = " + hasillingkaran);
                    } else if (pilihan == 2) {
                        System.out.println("Program Keliling Lingkaran");
                        System.out.println("==========================");
                        System.out.print("Masukan Jari-Jari Lingkaran = ");
                        r = input.nextFloat();
                        hasillingkaran = (float) (2 * PHI * r);
                        System.out.println("Keliling Lingkaran = " + hasillingkaran);
                    } else {
                        System.err.println("Pilihan Tidak Tersedia");
                    }
                    break;

                case 7:
                    System.out.println("Selamat Datang Di Program Operasi Pada Segitiga");
                    System.out.println("Pilihan Program");
                    System.out.println("1.Luas Segitiga \n2.Keliling Segitiga");
                    System.out.print("Masukan Pilihan = ");
                    pilihan = input.nextInt();

                    if (pilihan == 1) {
                        System.out.println("Program Luas Segitiga");
                        System.out.println("=====================");
                        System.out.print("Masukan Alas = ");
                        a = input.nextInt();
                        System.out.print("Masukan Tinggi = ");
                        t = input.nextInt();
                        hasilsegitiga = a * t / 2;
                        System.out.println("Luas Segitiga = " + hasilsegitiga);
                    } else if (pilihan == 2) {
                        System.out.println("Program Keliling Segitiga");
                        System.out.println("=========================");
                        System.out.print("Masukan Sisi = ");
                        s = input.nextInt();
                        hasil = 3 * s;
                        System.out.println("Keliling Segitiga = " + hasil);
                    } else {
                        System.err.println("Pilihan Tidak Tersedia");
                    }
                    break;

                case 8:
                    System.out.println("Selamat Datang Di Program Operasi Pada Balok");
                    System.out.println("Pilihan Program");
                    System.out.println("1.Luas Balok \n2.Keliling Balok \n3.Volume Balok");
                    System.out.print("Masukan Pilihan = ");
                    pilihan = input.nextInt();

                    if (pilihan == 1) {
                        System.out.println("Program Luas Balok");
                        System.out.println("==================");
                        System.out.print("Masukan Panjang = ");
                        p = input.nextInt();
                        System.out.print("Masukan Lebar = ");
                        l = input.nextInt();
                        System.out.print("Masukan Tinggi = ");
                        t = input.nextInt();
                        hasil = 2 * (p * l + p * t + l * t);
                        System.out.println("Luas Balok = " + hasil);
                    } else if (pilihan == 2) {
                        System.out.println("Program Keliling Balok");
                        System.out.println("======================");
                        System.out.print("Masukan Panjang = ");
                        p = input.nextInt();
                        System.out.print("Masukan Lebar = ");
                        l = input.nextInt();
                        System.out.print("Masukan Tinggi = ");
                        t = input.nextInt();
                        hasil = 4 * (p + l + t);
                        System.out.println("Keliling Balok = " + hasil);
                    } else if (pilihan == 3) {
                        System.out.println("Program Volume Balok");
                        System.out.println("====================");
                        System.out.print("Masukan Panjang = ");
                        p = input.nextInt();
                        System.out.print("Masukan Lebar = ");
                        l = input.nextInt();
                        System.out.print("Masukan Tinggi = ");
                        t = input.nextInt();
                        hasil = p * l * t;
                        System.out.println("Volume Balok = " + hasil);
                    } else {
                        System.err.println("Pilihan Tidak Tersedia");
                    }
                    break;

                case 9:
                    System.out.println("Selamat Datang Di Program Menentukan Besar Nilai");
                    System.out.println("================================================");
                    System.out.print("Masukan Angka = ");
                    pilihan = input.nextInt();

                    switch (pilihan) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            System.out.println(pilihan + " < 5");
                            break;
                        case 5:
                            System.out.println(pilihan + " = 5");
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            System.out.println(pilihan + " > 5");
                            break;
                        default:
                            System.err.println("Silahkan Masukan Angka 1-10");
                    }
                    break;
            }
        } else {
            System.err.println("Maaf, Username Atau Password Anda Salah!");
        }
    }
}