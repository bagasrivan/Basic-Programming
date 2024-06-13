/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi;
        System.out.println("Program Balok");
        System.out.println("==========================");

        System.out.println("1. Keliling Balok \n2. Luas Balok \n3. Volume Balok");

        System.out.print("Masukan Pilihan Anda = ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Keliling Balok");
                System.out.print("Masukan Panjang = ");
                panjang = input.nextInt();
                System.out.print("Masukan Lebar = ");
                lebar = input.nextInt();
                System.out.print("Masukan Tinggi = ");
                tinggi = input.nextInt();
                int keliling = 4 * (panjang + lebar + tinggi);
                System.out.println("Keliling Balok = " + keliling);
                break;
            case 2:
                System.out.println("Luas Balok");
                System.out.print("Masukan Panjang = ");
                panjang = input.nextInt();
                System.out.print("Masukan Lebar = ");
                lebar = input.nextInt();
                System.out.print("Masukan Tinggi = ");
                tinggi = input.nextInt();
                int luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
                System.out.println("Luas Balok = " + luas);
                break;
            case 3:
                System.out.println("Volume Balok");
                System.out.print("Masukan Panjang = ");
                panjang = input.nextInt();
                System.out.print("Masukan Lebar = ");
                lebar = input.nextInt();
                System.out.print("Masukan Tinggi = ");
                tinggi = input.nextInt();
                int volume = panjang * lebar * tinggi;
                System.out.println("Volume Balok = " + volume);
                break;
            default:
                System.err.println("Pilihan Tidak Tersedia");
        }

    }

}
