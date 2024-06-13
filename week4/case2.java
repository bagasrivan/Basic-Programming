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
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawaban;
        System.out.println("Soal :");
        System.out.println("1. Hasil Dari 3 + 5 Adalah = ");
        System.out.println("A. 7 \nB. 8 \nC. 9 \nD. 6 \nE. 10");
        System.out.print("Jawaban Anda = ");
        jawaban = input.nextLine();

        switch (jawaban) 
        {
            case "A":
            case "a":
            case "C":
            case "c":
            case "D":
            case "d":
            case "E":
            case "e":
                System.out.println("Jawaban Anda Salah");
                break;
            case "B":
            case "b":
                System.out.println("Jawaban Anda Benar");
                break;
            default:
                System.err.println("Pilihan Jawaban Tidak Tersedia");
        }
    }
}
