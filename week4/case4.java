/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah Hari Pada Bulan");
        System.out.println("======================");
        System.out.print("Masukan Bulan = ");
        String bulan = input.nextLine();

        switch (bulan) {
            case "Januari":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 31");
                break;
            case "Februari":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 28");
                break;
            case "Maret":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 31");
            break;
            case "April":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 30");
            break;
            case "Mei":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 31");
            break;
            case "Juni":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 30");
            break;
            case "Juli":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 31");
            break;
            case "Agustus":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 31");
            break;
            case "September":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 30");
            break;
            case "Oktober":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 31");
            break;
            case "November":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 30");
            break;
            case "Desember":
                System.out.println("Jumlah Hari Pada Bulan " + bulan + " Adalah 31");
            break;

            default:
                System.err.println("Invalid Month");
        }
    }

}
