package coba;

import java.util.Scanner;

public class CobaDataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int jumlahMhs;

        System.out.print("Berapa mahasiswa: ");
        jumlahMhs = Integer.parseInt(input.nextLine());
        String[] mahasiswa = new String[jumlahMhs]; 
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Nama mahasiswa ke-" + (i+1) + " : ");
            nama = input.nextLine();
            if(nama.equalsIgnoreCase("stop")) break;
            mahasiswa[i] = nama;
        }

        System.out.println("Daftar Mahasiswa: ");
        for (String namMah : mahasiswa) {
            System.out.println(namMah);
        }

        input.close();
    }
}
