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
public class Soal3 {
    public static void main(String[] args) {
        kelipatan();
    }

    public static void kelipatan() {
        String answer;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Masukan Kelipatan Angka = ");
            int kelipatan = input.nextInt();
            System.out.print("Masukan Rentang Kelipatan Angka = ");
            int rentang = input.nextInt();

            for (int x = kelipatan; x <= rentang; x += kelipatan) {
                System.out.println(x + " ");
            }
            System.out.print("Apakah Anda Ingin Mengulang Program Y/N? = ");
            answer = input.next();
        } while (answer.equalsIgnoreCase("Y"));

    }
}
