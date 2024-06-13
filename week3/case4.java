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
public class Soal4 {
    public static void main(String[] args) {
        int menu;
        int harga = 10000;
        int jumlahminuman;
        Scanner input = new Scanner(System.in);
        System.out.println("Toko Minuman Berkah Membahana");
        System.out.println("==============================");
        System.out.println("Pilihan Menu\n 1. Beli Minuman\n 2. Keluar");
        
        System.out.println("Pilih Menu = ");
        menu = input.nextInt();
        
        if (menu == 1)
        {
            System.out.println("Jumlah Minuman = ");
            jumlahminuman = input.nextInt();
            int totalharga = jumlahminuman*10000;
            
            if (totalharga > 50000)
            {
                int diskon = totalharga*10/100;
                int totalseluruh = totalharga-diskon;
               System.out.println("Anda Membeli Minuman Sebanyak " + jumlahminuman + " Dengan Total Harga Rp." + totalharga + " Dan Potongan Rp." + diskon + " Total Belanja Keseluruhan " + totalseluruh);
            }
            else if (totalharga > 30000)
            {
                int diskon2 = totalharga*5/100;
                int totalseluruh2 = totalharga-diskon2;
                System.out.println("Anda Membeli Minuman Sebanyak " + jumlahminuman + " Dengan Total Harga Rp." + totalharga + " Dan Potongan Rp." + diskon2 + " Total Belanja Keseluruhan " + totalseluruh2);
            }
        }
        else if(menu == 2) 
        {
            System.err.println("Anda keluar dari program ini");
        }
        else 
        {
            System.err.println("Menu Tidak Tersedia");
        }
    }
    
}
