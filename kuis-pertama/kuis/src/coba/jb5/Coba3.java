package coba.jb5;

import java.util.ArrayList;
import java.util.Scanner;

public class Coba3 {
    public static void main(String[] args) {
        int jumlahBarang = 0;
        ArrayList<Integer> hargaJualAwal = new ArrayList<>();
        ArrayList<Integer> hargaJualDiskon = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("\n\n\nAda Berapa Barang : ");
        jumlahBarang = Integer.parseInt(input.nextLine());

        for(int i = 1; i <= jumlahBarang; ++i) {
            System.out.print("Masukan harga barang yang ke-" + i + " : ");
            hargaJualAwal.add(Integer.parseInt(input.nextLine()));
        }

        System.out.println("=================================");
        System.out.println("Harga Barang setelah diskon");
        for (int i = 0; i < hargaJualAwal.size(); i++) {
            int harga = hargaJualAwal.get(i);
            harga = harga - (harga * 15 / 100);
            hargaJualDiskon.add(harga);
        }
        
        int j = 1;
        for(int harga: hargaJualDiskon) {
            System.out.println("Harga barang yang ke-" + j + " : " + harga);
            j++;
        }

        input.close();

        // for(int harga : hargaJual) {
        //     harga = harga * 15 / 100;
        //     hargaJual.add(harga);
        // }

    }
}
