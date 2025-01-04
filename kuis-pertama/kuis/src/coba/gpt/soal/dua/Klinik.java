package coba.gpt.soal.dua;

import java.util.ArrayList;
import java.util.Scanner;

public class Klinik {
    public static void main(String[] args) {
        String nama;
        String keluhan;
        ArrayList<Pasien> antrian = new ArrayList<>();
        int nomerPilihan;
        Scanner input = new Scanner(System.in);

        do {
            displayMenu();
            System.out.print("Pilih menu: ");
            nomerPilihan = Integer.parseInt(input.nextLine());

            switch (nomerPilihan) {
                case 1:
                    System.out.print("Masukan nama pasien: ");
                    nama = input.nextLine();
                    System.out.print("Masukan keluhan pasien: ");
                    keluhan = input.nextLine();
                    Pasien pasien = new Pasien(nama, keluhan);
                    antrian.add(pasien);
                    break;
                case 2:
                    System.out.println("Daftar antrian: ");
                    if (antrian.isEmpty()) {
                        System.out.println("Anrian kosong!!");
                        break;
                    }
                    for(int i = 0; i < antrian.size(); ++i)  {
                        System.out.print((i + 1) + ".");
                        antrian.get(i).printData();
                    }
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Anrian kosong!!");
                        break;
                    }
                    System.out.println("Pasien berikutnya: " + antrian.get(0).getNama());
                    antrian.remove(0);
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
            
        } while (nomerPilihan != 4);
    }

    public static void displayMenu() {
        System.out.println("\n\n=== Sistem Antrian Klinik ===");
        System.out.println("1. Tambah Pasien  ");
        System.out.println("2. Lihat Antrian  ");
        System.out.println("3. Panggil Pasien  ");
        System.out.println("4. Keluar  \n\n");
    }
}
