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
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        int i = 1;

        System.out.println("Selamat Datang Pada Program Lanjut");

        do {
            System.out.println("Pilihan Menu :");
            System.out.println("1.Lanjut \n2.Berhenti");
            System.out.print("Pilihan Menu = ");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.println("Lanjut\n===========");
            } else if (menu == 2) {
                System.out.println("Anda Keluar Dari Program");
                i++;
            } else {
                System.err.println("Pilihan Tidak Tersedia");
                i++;
            }

        } while (i < 2);
    }
}