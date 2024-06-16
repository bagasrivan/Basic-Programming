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
public class Soal3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 6 == 0) {
                System.out.println(i + " Kelipatan 3 dan 6");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Kelipatan 3 dan 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " Kelipatan 3");
            } else if (i % 6 == 0) {
                System.out.println(i + " Kelipatan 6");
            } else if (i % 5 == 0) {
                System.out.println(i + " Kelipatatn 5");
            } else {
                System.out.println(i + " Bukan Kelipatan 3, 6, dan 5");
            }
        }
    }
}