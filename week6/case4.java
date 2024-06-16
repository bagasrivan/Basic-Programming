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
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int menu;
        int i = 0;
        String nama = null, uname = null, pass = null;

        System.out.println("Selamat Datang, Silahkan Masuk Ke Akun Anda");
        System.out.println("Silahkan Pilih Menu : ");
        System.out.println("1.Daftar \n2.Login");
        System.out.print("Pilihan Menu Anda = ");
        menu = input.nextInt();

        do {
            if (menu == 1) {
                System.out.println("Silahkan Lengkapi Data Dibawah Untuk Mendaftar");
                System.out.print("Masukan Nama = ");
                nama = input2.next();

                System.out.print("Masukan Username = ");
                uname = input2.next();

                System.out.print("Masukan Password = ");
                pass = input2.next();

                if (nama.equals("bagaskararidhovandio") && (uname.equals("bagasgaming311") && (pass.equals("2211016310019")))) {
                    System.out.println("Maaf, Akun Tersebut Sudah Terdaftar");
                } else {
                    System.out.println("Terimakasih Sudah Mendaftar, Silahkan Login Kembali");
                }

            } else if (menu == 2) {
                System.out.println("Silahkan Masukan Username Dan Password");
                System.out.print("Masukan Username = ");
                uname = input2.next();
                System.out.print("Masukan Password = ");
                pass = input2.next();
                i++;

                if (uname.equals("bagasgaming31") && (pass.equals("2211016310019"))) {
                    System.out.println("bagaskara ridho vandio Dengan NIM " + pass + " Login Sukses");
                    i++;
                } else {
                    System.err.println("Anda Belum Mendaftar, Silahkan Daftar Dahulu");
                }
            }
        } while (menu < 1);
    }
}