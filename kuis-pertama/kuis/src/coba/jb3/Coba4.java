package coba.jb3;

import java.util.Scanner;

public class Coba4 {
    public static void main(String[] args) {
        int mahasiswa, matkul;
        double rataRata, nilai, hasil = 0;
        String nama;

        Scanner input = new Scanner(System.in);

        System.out.print("\nBerapa mahasiswa : ");
        mahasiswa = Integer.parseInt(input.nextLine());
        
        System.out.print("Berapa mata kuliah : ");
        matkul = Integer.parseInt(input.nextLine());

        for(int i = 1; i <= mahasiswa; i++) {
            System.out.println("=============================");
            System.out.print("Nama mahasiswa ke-" + i + " : ");
            nama = input.nextLine();
            for(int j = 1; j <= matkul; j++) {
                System.out.print("Nilai matkul ke-" + j + " : ");
                nilai = Double.parseDouble(input.nextLine());
                hasil = hasil + nilai;
            }
            rataRata = hasil / matkul;
            System.out.println("Rata - rata " + nama + " : " + rataRata);
            hasil = 0;
        }

        input.close();
    }
}
