package coba.gpt.soal.satu;

import java.util.ArrayList;
import java.util.Scanner;

public class InventarisToko {
    public static void main(String[] args) {
        ArrayList<Integer> stokBarang = new ArrayList<>();
        ArrayList<Integer> barangTersedia = new ArrayList<>();
        ArrayList<Integer> indexBarangKosong = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int jumlahBarang, jumlahStok, totalStok = 0;

        System.out.print("Ada berapa barang: ");
        jumlahBarang = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= jumlahBarang; ++i) {
            System.out.print("Stok barang ke-" + i + ": ");
            jumlahStok = Integer.parseInt(input.nextLine());
            stokBarang.add(jumlahStok);
        }

        for (int i = 0; i < stokBarang.size(); i++) {
            if (stokBarang.get(i) == 0) {
                indexBarangKosong.add(i);
            } else {
                barangTersedia.add(stokBarang.get(i));
                totalStok += stokBarang.get(i);
            }
        }

        System.out.println("Stok Barang: " + stokBarang);

        System.out.println("Stok Barang yang tersedia: " + barangTersedia);

        System.out.println("Total stok: " + totalStok);

        System.out.println("Barang yang kosong ada di indeks: " + indexBarangKosong);
    }
}
