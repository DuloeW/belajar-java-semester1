package coba.gpt.soal.tiga;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        String judul, pengarang;
        int menu;
        Scanner input = new Scanner(System.in);

        do {
            displayMenu();
            System.out.print("Pilih menu: ");
            menu = Integer.parseInt(input.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("Masukkan judul: ");
                    judul = input.nextLine();
                    System.out.print("Masukkan pengarang: ");
                    pengarang = input.nextLine();

                    Buku buku = new Buku(judul, pengarang);
                    buku.setDipinjam(false);
                    daftarBuku.add(buku);
                    break;
                case 2:
                    if (daftarBuku.isEmpty()) {
                        System.out.println("Belum ada buku yang ditambahkan.");
                        break;

                    }
                    displayListBuku(daftarBuku);
                    break;
                case 3:
                    if (daftarBuku.isEmpty()) {
                        System.out.println("Belum ada buku yang ditambahkan.");
                    } else {
                        System.out.println("Daftar Buku:");
                        displayListBuku(daftarBuku);
                        System.out.print("Pilih buku yang akan dipinjam(judul buku): ");
                        judul = input.nextLine();

                        for (Buku b : daftarBuku) {
                            if (b.getJudul().equalsIgnoreCase(judul)) {
                                if (b.getDipinjam()) {
                                    System.out.println("Buku sudah dipinjam.");
                                } else {
                                    System.out.println("Buku berhasil dipinjam.");
                                    b.setDipinjam(true);
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    if (daftarBuku.isEmpty()) {
                        System.out.println("Belum ada buku yang ditambahkan.");
                    } else {
                        System.out.println("Daftar Buku:");
                        displayListBuku(daftarBuku);
                        System.out.print("Pilih buku yang akan dikembalikan(judul buku): ");
                        judul = input.nextLine();

                        for (Buku b : daftarBuku) {
                            if (b.getJudul().equalsIgnoreCase(judul)) {
                                if (b.getDipinjam()) {
                                    System.out.println("Buku berhasil dikembalikan.");
                                    b.setDipinjam(false);
                                } else {
                                    System.out.println("Buku belum dipinjam.");
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    input.close();
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
                    input.close();
                    break;
            }

        } while (menu != 5);

    }

    static void displayMenu() {
        System.out.println("=== Sistem Perpustakaan Digital ===");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Lihat Semua Buku");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Keluar");
    }

    static void displayListBuku(ArrayList<Buku> daftarBuku) {
        System.out.println("Daftar Buku:");
        int i = 1;
        for (Buku b : daftarBuku) {
            System.out.print(i + ". ");
            b.getData();
            i++;
        }
    }
}
