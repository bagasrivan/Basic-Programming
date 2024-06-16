package week1;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Name = ");
        String name = input.nextLine();

        System.out.print("Input NIM = ");
        String NIM = input.nextLine();

        System.out.println("Halo, Saya " + name + " dengan NIM " + NIM + " dari program studi Ilmu Komputer. Salam Kenal.");
    }
}
