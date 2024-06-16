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
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menentukan Umur User");
        System.out.println("========");
        String nama;
        int tahun;
        System.out.print("Masukan Nama Anda = ");
        nama = input.next();
        System.out.print("Masukan Tahun Lahir Anda = ");
        tahun = input.nextInt();
        int umur = 2022 - tahun;
        System.out.println(bio(nama, umur));

    }

    public static String bio(String nama, int umur) {
        return "Umur " + nama + " Adalah " + umur + " Tahun";
    }
}