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
public class Soal3 {
    public static void main(String[] args) {
        int belanja, jumlahitem, cashback;
        
        System.out.println("Belanja Hari Ini Beli 2 Gratis 1!!!");
        System.out.println("Dan Ada Cashback Juga, *syarat dan ketentuan berlaku");
        Scanner input = new Scanner(System.in);
        System.out.println("===============================");
        
        System.out.println("Masukan Total Belanja = ");
        belanja = input.nextInt();
        
        if (belanja % 5 == 0 && belanja % 2 == 0) 
        {
            cashback = 15000 * (belanja / 5);
            jumlahitem = belanja + (belanja / 2);
        } 
        
        else {cashback = 15000 * (belanja / 5);
        jumlahitem = belanja + (belanja / 2);
        }
        System.out.println("Anda Membeli\t" + belanja + "\tItem Dengan Bonus  Sebanyak\t" +(jumlahitem-belanja) + "\tItem, Total Item Yang Anda Dapatkan Sebanyak\t" + jumlahitem + "\tItem");
        System.out.println("Anda Mendapat Cashback = " + cashback);
        System.out.println("Terimakasih");
        System.out.println("===================================");
    }
    
}
