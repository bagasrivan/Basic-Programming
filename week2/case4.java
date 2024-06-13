/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
/**
 *
 * @author Bagaskara
 */
public class Soal4 {
    public static void main(String[] args) {
        final double PI = 3.141592;
        double r = 23.12;
        double luas = PI*r*r;
        int bilanganBulat = (int) luas;
        
        System.out.println("Luas Lingkaran= " + bilanganBulat);
    }
    
}
