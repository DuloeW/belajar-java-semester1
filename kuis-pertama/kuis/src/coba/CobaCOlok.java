package coba;

import java.util.Scanner;

public class CobaCOlok {

    static double hargaApel(Scanner input) {
        System.out.print("Masukan berapa apel: ");
        return Integer.parseInt(input.nextLine()) * 10000;
    }

    static double hargaJeruk(Scanner input) {
        System.out.print("Masukan berapa jeruk: ");
        return Integer.parseInt(input.nextLine()) * 8000;
    }

    static double hargaMangga(Scanner input) {
        System.out.print("Masukan berapa mangga: ");
        return Integer.parseInt(input.nextLine()) * 12000;
    }

    static double hitungTotal(double apel, double jeruk, double mangga) {
        return apel + jeruk + mangga;
    }

    static double hitungDiscount10(double buah) {
        return buah * 10 / 100;
    }

    static double hitungDiscount15(double buah) {
        return buah * 15 / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double apel = 0, jeruk = 0, mangga = 0, total = 0, discount = 0;

        apel = hargaApel(input);
        jeruk = hargaJeruk(input);
        mangga = hargaMangga(input);

        total = hitungTotal(apel, jeruk, mangga);
        if (total > 300000) {
            discount = hitungDiscount15(total);
        } else {
            discount = hitungDiscount10(total);
        }

        System.out.println("Harga Barang Sebelum discount: " + total);
        System.out.println("Mendapatkan discount : " + discount);
        System.out.println("Harga Barang Sesudah discount: " + (total - discount));

    }
}
