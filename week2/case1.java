/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
import java.util.Scanner;
/**
 *
 * @author Bagaskara
 */
public class Soal1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    double volume;
    
    
    System.out.print("Masukan Panjang = ");
    double p = input.nextDouble();
        System.out.print("Masukan Lebar = ");
        double l = input.nextDouble();
            System.out.print("Masukan Tinggi = ");
            double t = input.nextDouble();
            
            volume=p*l*t;
            
            System.out.println("Volume Balok=" + volume);
    }
    
}
