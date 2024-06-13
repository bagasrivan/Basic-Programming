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
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        double r;    
        double hasil;
        
            System.out.print("Masukan Nilai 1 = ");
            double nilai1 = input.nextDouble();
               
                System.out.print("Masukan Nilai 2 = ");
                double nilai2 = input.nextDouble();
                
                    System.out.print("Masukan Nilai 3 = ");
                    double nilai3 = input.nextDouble();
                    
                    r = nilai1+nilai2+nilai3;
                    hasil = r/3;
                        
                        System.out.println("Rata-Rata= " + hasil);
    }
    
}
