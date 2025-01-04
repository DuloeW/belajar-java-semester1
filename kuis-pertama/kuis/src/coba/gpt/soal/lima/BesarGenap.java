package coba.gpt.soal.lima;

import java.util.Scanner;

public class BesarGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] bilangan;
        int bilanganTerbesar;
        int banyakBilangan;
        int nilaiBilangan;


        System.out.print("Berapa banyak bilangan: ");
        banyakBilangan = Integer.parseInt(input.nextLine());

        bilangan = new int[banyakBilangan];

        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Nilai dari bilanga yang ke-" + (i+1) + " : ");
            nilaiBilangan = Integer.parseInt(input.nextLine());
            bilangan[i] = nilaiBilangan;
        }

        bilanganTerbesar = bilanganTerbesar(bilangan);

        if(bilanganGenapOrGanjil(bilanganTerbesar)) {
            System.out.println("Bilangan " + bilanganTerbesar + " adalah bilangan yang terbesar");
            System.out.println("Bilangan " + bilanganTerbesar + " adalah bilangan Genap");
        }

    }

    static int bilanganTerbesar(int[] bilangan) {
        int terbesar = bilangan[0];
        for (int i = 0; i < bilangan.length - 1; i++) {
            if(terbesar < bilangan[i]) {
                terbesar = bilangan[i];
            }
        }
        return terbesar;
    }

    static boolean bilanganGenapOrGanjil(int angka) {
        return angka % 2 == 0;
    }
}
