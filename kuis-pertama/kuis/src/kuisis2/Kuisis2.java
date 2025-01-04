package kuisis2;

import java.util.Scanner;

public class Kuisis2 {
    public static void main(String[] args) {
        final int gStaf = 2000;
        final int gSupervisor = 5000;
        final int gManager = 10000;
        final int gLemStaf = 4000;
        final int gLemSupervisor = 8000;
        final int gLemManager = 15000;
        double upahHarian = 0,
                upahDasarHarian = 0,
                upahPerjam = 0,
                upahLembur = 0,
                jumlahJamKerja = 0,
                jamLembur = 0,
                upahNormal = 0;
        String nama, nomerKaryawan, jabatan, kondisi;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("==========================================");
            System.out.print("Masukan Nama: ");
            nama = input.nextLine();

            System.out.print("Masukan Nomer: ");
            nomerKaryawan = input.nextLine();

            System.out.print("Masukan Jabatan: ");
            jabatan = input.nextLine();

            System.out.print("Masukan Upah Dasar Harian: ");
            upahDasarHarian = Double.parseDouble(input.nextLine());

            System.out.print("Masukan Jumlah Jam Kerja: ");
            jumlahJamKerja = Double.parseDouble(input.nextLine());

            if (jabatan.equalsIgnoreCase("staf")) {
                upahNormal = gStaf;
                upahLembur = gLemStaf;
            } else if (jabatan.equalsIgnoreCase("supervisor")) {
                upahNormal = gSupervisor;
                upahLembur = gLemSupervisor;
            } else if (jabatan.equalsIgnoreCase("manager")) {
                upahNormal = gManager;
                upahLembur = gLemManager;
            } else {
                System.out.println("==========================================");
                System.out.println("Jabatan kamu salah!!");
                return;
            }

            if (jumlahJamKerja > 8) {
                upahPerjam = upahNormal * 8;
                jamLembur = jumlahJamKerja - 8;
                upahLembur *= jamLembur;
            } else {
                upahPerjam = upahNormal * jumlahJamKerja;
            }

            upahHarian = upahDasarHarian + upahPerjam + upahLembur;

            System.out.println("==========================================");
            System.out.println("Nama: " + nama);
            System.out.println("Nomer: " + nomerKaryawan);
            System.out.println("Upah Dasar Harian: " + upahDasarHarian);
            System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
            System.out.println("Jabatan: " + jabatan);
            System.out.println("Jam Lembur: " + jamLembur);
            System.out.println("Upah Perjam: " + upahPerjam);
            System.out.println("Upah Lembur: " + upahLembur);
            System.out.println("Upah Harian karyawan: " + upahHarian);
            System.out.println("==========================================");

            System.out.print("Keluar?(y/n)");
            kondisi = input.nextLine();
            if (kondisi.equalsIgnoreCase("y")) {
                input.close();
                System.exit(0);
            }
        }
    }
}
