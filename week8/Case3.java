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
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, r, n, sn, sn2;
        System.out.println("Program Menghitung Deret Geometri");
        System.out.println("=============================");
        System.out.print("Masukan a = ");
        a = input.nextInt();
        System.out.print("Masukan r = ");
        r = input.nextInt();
        System.out.print("Masukan n = ");
        n = input.nextInt();

        sn = (int) (a * (Math.pow(r, n) - 1)) / (r - 1);
        sn2 = (int) (a * (1 - (Math.pow(r, n)))) / (1 - r);

        if (r > 1) {
            System.out.println(geo(n, sn));
        } else if (r < 1) {
            System.out.println(metri(n, sn2));
        }
    }

    public static String geo(int n, int sn) {
        return "Jumlah " + n + " Suku Pertama Barisan Geometri Tersebut Adalah " + sn;
    }

    public static String metri(int n, int sn2) {
        return "Jumlah " + n + " Suku Pertama Barisan Geometri Tersebut Adalah " + sn2;
    }
}