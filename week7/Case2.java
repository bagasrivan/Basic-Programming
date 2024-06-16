/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;
import java.util.Scanner;
/**
 *
 * @author Bagaskara
 */
public class Soal2 {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang");
        System.out.println("Masukan Angka Untuk Menentukan Bilangan Prima dan Fibonacci");
        System.out.print("Masukan Angka = ");
        angka = input.nextInt();
        prima(angka);
        fibonacci(angka);
    }
    public static void prima (int angka) {
        int num = angka;
        boolean kondisi = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                kondisi = true;
                break;
            }
        }
        if (!kondisi) {
            System.out.println(angka + " Adalah Bilangan Prima");
        } else {
            System.out.println(angka + " Bukan Bilangan Prima");
        }
    }
    
    public static void fibonacci (int angka) {
        int a = 1;
        int b = 1;
        int fibo = a + b;
        while (fibo <= angka) {
            if (fibo == angka) {
                System.out.println(angka + " Adalah Bilangan Fibonacci");
                return;
            }
            a = b;
            b = fibo;
            fibo = a + b;
        }
        System.out.println(angka + " Bukan Bilangan Fibbonaci");
    }
}