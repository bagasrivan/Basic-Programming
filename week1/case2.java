package week1;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Name = ");
        String nama = input.nextLine();

        System.out.print("Input NIM = ");
        String NIM = input.nextLine();

        System.out.println("Halo, Saya " + nama + " dengan NIM " + NIM + " dari program studi Ilmu Komputer. Salam Kenal.");
    }
}
