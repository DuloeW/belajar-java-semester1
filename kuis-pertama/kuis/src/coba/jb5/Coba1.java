package coba.jb5;

import java.util.ArrayList;
import java.util.Scanner;

public class Coba1 {
    public static void main(String[] args) {
        int jumlahMahasiswa = 0;
        ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        clearScreen();
        System.out.print("Masukan jumlah mahasiswa: ");
        jumlahMahasiswa = Integer.parseInt(input.nextLine());

        for(int i = 0; i < jumlahMahasiswa; i++) {
            clearScreen();
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMahasiswa.add(Integer.parseInt(input.nextLine()));
            if(nilaiMahasiswa.get(i) < 0 || nilaiMahasiswa.get(i) > 100) {
                System.out.println("Nilai harus diantara 0 - 100");
                nilaiMahasiswa.remove(i);
                i--;
            }
        }

        clearScreen();
        System.out.println("---------------------------------------------");
        System.out.println("   No   |   Nilai Ujian   |   Index Nilai   ");
        System.out.println("---------------------------------------------");
        for(int i = 0; i < nilaiMahasiswa.size(); i++) {

            if(i > 8) {
                System.out.print("  " + (i + 1) + "    |   " + nilaiMahasiswa.get(i) + "             |   ");
            } else {
                System.out.print("   " + (i + 1) + "    |   " + nilaiMahasiswa.get(i) + "             |   ");
            }

            if(nilaiMahasiswa.get(i) >= 85) {
                System.out.println("A");
            } else if (nilaiMahasiswa.get(i) >= 70) {
                System.out.println("B");
            } else if (nilaiMahasiswa.get(i) >= 60) {
                System.out.println("C");
            } else if (nilaiMahasiswa.get(i) >= 50) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
        System.out.println("---------------------------------------------");


        input.close();

    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
