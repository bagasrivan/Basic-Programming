/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAPraktikum;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class UAPraktikum {
    public static void main(String[] args) {
        login();
        menuUtama();
    }

    public static void login() {
        Scanner input = new Scanner(System.in);
        int choose, i = 0;
        String uname, pass;
        boolean cp = false;
        System.out.println("Selamat Datang Di Warung Makan Vandio");
        System.out.println("Silahkan Daftar Atau Login Terlebih Dahulu");
        do {
            System.out.println("1.Daftar \n2.Login");
            System.out.print("Masukan Pilihan = ");
            choose = input.nextInt();

            if (choose == 1) {
                System.out.println("Silahkan Daftar");
                System.out.print("Masukan Uname = ");
                uname = input.next();
                System.out.print("Masukan Password = ");
                pass = input.next();
                cp = true;
                if (uname.equals("vandio") && pass.equals("2211016310019")) {
                    System.out.println("Terimakasih Sudah Mendaftar, Silahkan Login");
                    System.out.println("====");
                    i = 1;
                }
            } else if (choose == 2) {
                System.out.println("Silahkan Login");
                System.out.print("Masukan Uname = ");
                uname = input.next();
                System.out.print("Masukan Password = ");
                pass = input.next();
                if (cp == true) {
                    if (uname.equals("vandio") && pass.equals("2211016310019")) {
                        System.out.println("Login Berhasil");
                        i = 2;
                        System.out.println("====");
                    } else {
                        System.out.println("Username Atau Password Yang Anda Masukan Salah");
                        i = 1;
                        System.out.println("====");
                    }
                    break;
                } else {
                    System.out.println("Anda Belum Mendaftar, Silahkan Daftar Terlebih Dahulu");
                    System.out.println("====");
                    i = 1;
                }
            }
        } while (i == 2 || i == 1);
    }

    public static void menuUtama() {
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Selamat Datang Di Warung Vandio");
            System.out.println("1.Tampilkan Menu \n2.Keluar");
            System.out.print("Masukan Pilihan = ");
            choose = input.nextInt();
            if (choose == 1) {
                menu();
                break;
            } else if (choose == 2) {
                System.out.println("Anda Keluar Dari Program, Terimakasih");
                System.out.println("====");
            }
        } while (choose != 2);
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int menu, jumlah = 0, harga = 0, tambah, pilihan, a = 0, k = 0;
        do {
            System.out.println("====");
            System.out.println("Pilihan Menu : ");
            System.out.println("1.Bakso Rp.15000");
            System.out.println("2.Mie Ayam Rp.12000");
            System.out.println("3.Teh Es Rp.5000");
            System.out.println("4.Air Putih Rp.3000");
            System.out.print("Masukan Menu Yang Anda Pilih = ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Anda Memesan Bakso");
                    System.out.print("Masukan Jumlah = ");
                    jumlah = input.nextInt();
                    a = 15000;
                    harga = harga + harga(jumlah, a);
                    System.out.println("Total Harga Yang Harus Anda Bayar = Rp." + harga);
                    break;
                case 2:
                    System.out.println("Anda Memesan Mie Ayam");
                    System.out.print("Masukan Jumlah = ");
                    jumlah = input.nextInt();
                    a = 12000;
                    harga = harga + harga(jumlah, a);
                    System.out.println("Total Harga Yang Harus Anda Bayar = Rp." + harga);
                    break;
                case 3:
                    System.out.println("Anda Memesan Teh Es");
                    System.out.print("Masukan Jumlah = ");
                    jumlah = input.nextInt();
                    a = 5000;
                    harga = harga + harga(jumlah, a);
                    System.out.println("Total Harga Yang Harus Anda Bayar = Rp." + harga);
                    break;
                case 4:
                    System.out.println("Anda Memesan Air Putih");
                    System.out.print("Masukan Jumlah = ");
                    jumlah = input.nextInt();
                    a = 3000;
                    harga = harga + harga(jumlah, a);
                    System.out.println("Total Harga Yang Harus Anda Bayar = Rp." + harga);
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia, Harap Masukan Menu Yang Tersedia");
                    System.out.println("====");
                    break;
            }
            System.out.println("====");
            System.out.println("Apakah Anda Ingin Membeli Lagi?");
            System.out.println("1.Ya \n2.Tidak");
            System.out.print("Masukan Pilihan = ");
            int j = input.nextInt();
            if (j == 1) {
                k = 1;
            } else {
                k = 2;
            }
        } while (k == 1);
        System.out.println("Total Harga Yang Harus Anda Bayar = Rp." + harga);
        System.out.println("Terimakasih");
    }

    public static int harga(int jumlah, int a) {
        int harga = jumlah * a;
        return harga;
    }
}
