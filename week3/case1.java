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
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int angka;
            System.out.print("Masukan Angka = ");
                angka = input.nextInt();
            if (angka != 0){
                if (angka % 10 == 0)
                {
                    System.out.println("Benar");
                }
                else if (angka == 0)
                {
                    System.out.println("Salah");
                }
               
            }
            else 
            {
                System.out.println("Salah");
            }
    }
    
}
