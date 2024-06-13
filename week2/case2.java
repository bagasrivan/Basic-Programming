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
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            System.out.print("Masukan Nilai a = ");
            double a = input.nextDouble();
            
                System.out.print("Masukan Nilai b = ");
                double b = input.nextDouble();
                
                    String kondisi = a > b ? "Benar" : "Salah";
                        
                        System.out.println("Apakah a > b? " + kondisi);
    }
    
}
