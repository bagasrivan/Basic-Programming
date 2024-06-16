/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Soal4 {
    public static void main(String[] args) {
        long totalBilangan, nilaiAwal, selisih, fibonacci;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Banyak Bilangan Yang Ingin Ditampilkan = ");
        totalBilangan = input.nextInt();

        nilaiAwal = 1;
        selisih = 0;
        fibonacci = 1;

        for (int i = 1; i <= totalBilangan; i++) {
            System.out.print(selisih + ", ");
            fibonacci = nilaiAwal + selisih;
            nilaiAwal = selisih;
            selisih = fibonacci;
        }
    }
}