/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;
import java.util.Scanner;
/**
 *
 * @author Bagaskara
 */
public class Soal2 {
    public static void main(String[] args) {
            double ip, sks;
            System.out.println("Program Nilai IP");
            Scanner input = new Scanner(System.in);
        
            System.out.print("Masukan IP = ");
            ip = input.nextDouble();
            
            if (ip < 2.5)
            {
                System.out.println("Jatah SKS = 18");
            }
            
            else if (ip < 2.75)
            {
                System.out.println("Jatah SKS = 20");
            }
            else if (ip < 3)
            {
                System.out.println("Jatah SKS = 22");
            }
            else if (ip < 3.5)
            {
                System.out.println("Jatah SKS = 23");
            }    
            else if (ip < 4)
            {
                System.out.println("Jatah SKS = 24");
            }
            else 
            {
                System.err.println("Sistem Error");
            }
    }
    
}
