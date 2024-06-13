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
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String warna;
        System.out.println("Program Menentukan Warna Primer");
        System.out.println("===============================");

        System.out.print("Masukan Warna = ");
        warna = input.nextLine();

        switch (warna) 
        {
            case "Merah":
            case "merah":
            case "Biru":
            case "biru":
            case "Kuning":
            case "kuning":
                System.out.println(warna + " Adalah Warna Primer");
            break;

            default:
                System.out.println(warna + " Bukan Warna Primer");

        }
    }

}
