package coba;

import java.util.ArrayList;
import java.util.Scanner;

public class CobaLanjutanDataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nMasukan Jumlah Data Mahasiswa: ");
        int jmlhMahasiswa = Integer.parseInt(input.nextLine());

        String[] listNamaMahasiswa = new String[jmlhMahasiswa];
        int[] listUmurMahasiswa = new int[jmlhMahasiswa];
        
        inputDataMahasiswa(listNamaMahasiswa, listUmurMahasiswa, input);
        outputDataMahasiswa(listNamaMahasiswa, listUmurMahasiswa);

    }

    static Mahasiwa inputData(Scanner input, int nomer) {
        System.out.print("Input Nama Mahasiswa ke-" + nomer + " : ");
        String nama = input.nextLine();
        System.out.print("Input Umur Mahasiswa ke-" + nomer + " : ");
        int umur = Integer.parseInt(input.nextLine());
        System.out.println("");
        return new Mahasiwa(nama, umur);
    }

    static void outputData(ArrayList<Mahasiwa> listMahasiswa) {
        int i = 1;
        for (Mahasiwa mahasiwa : listMahasiswa) {
            System.out.println("Nama mahasiswa ke-" + i + ": " + mahasiwa.getNama());
            System.out.println("Umur mahasiswa ke-" + i + ": " + mahasiwa.getUmur());
            System.out.println("");
            i++;
        }
    }

    static void inputDataMahasiswa(String[] listNam, int[] listUm, Scanner input) {
        for (int i = 0; i < listUm.length; i++) {
            System.out.print("Input Nama Mahasiswa ke-" + (i+1) + " : ");
            listNam[i] = input.nextLine();
            System.out.print("Input Umur Mahasiswa ke-" + (i+1) + " : ");
            listUm[i] = Integer.parseInt(input.nextLine());
            System.out.println("");
        }
    }

    static void outputDataMahasiswa(String[] listNam, int[] listUm) {
        for (int i = 0; i < listUm.length; i++) {
            System.out.println("Nama mahasiswa ke-" + (i+1) + ": " + listNam[i]);
            System.out.println("Umur mahasiswa ke-" + (i+1) + ": " + listUm[i]);
            System.out.println("");
        }
    }
}
