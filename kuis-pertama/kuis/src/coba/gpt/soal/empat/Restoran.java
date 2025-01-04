package coba.gpt.soal.empat;

import java.util.ArrayList;
import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaMenu, namaPelanggan;
        Double harga, totalHarga;
        int porsi, menu;
        ArrayList<PesananAktif> pesananAktif = new ArrayList<>();
        ArrayList<MenuResto> listMenu = new ArrayList<>();

        do {
            displayMenu();
            System.out.print("Pilih menu: ");
            menu = Integer.parseInt(input.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("Masukan nama menu: ");
                    namaMenu = input.nextLine();
                    System.out.print("Masukan harga: ");
                    harga = Double.parseDouble(input.nextLine());
                    MenuResto menuBaru = new MenuResto(namaMenu, harga);
                    listMenu.add(menuBaru);
                    System.out.println("Menu berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("Daftar Menu:");
                    if (listMenu.isEmpty()) {
                        System.out.println("Menu belum di masukan!!");
                    } else {
                        int i = 1;
                        for (MenuResto menuResto : listMenu) {
                            System.out.print(i + ". ");
                            menuResto.getData();
                            i++;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nama pelanggan: ");
                    namaPelanggan = input.nextLine();
                    System.out.print("Masukkan nama menu: ");
                    namaMenu = input.nextLine();
                    System.out.print("Masukkan jumlah porsi: ");
                    porsi = Integer.parseInt(input.nextLine());

                    MenuResto menuPesanan = null;
                    for (MenuResto menuResto : listMenu) {
                        if (menuResto.getNama().equalsIgnoreCase(namaMenu)) {
                            menuPesanan = menuResto;
                            break;
                        }
                    }

                    if (menuPesanan == null) {
                        System.out.println("Menu tidak ditemukan!");
                    } else {
                        boolean pelangganDitemukan = false;
                        totalHarga = menuPesanan.getHarga() * porsi;

                        for (PesananAktif pesanan : pesananAktif) {
                            if (pesanan.getPembeli().getNama().equalsIgnoreCase(namaPelanggan)) {
                                pesanan.tambahPesanan(namaMenu, porsi, menuPesanan.getHarga());
                                pelangganDitemukan = true;
                                break;
                            }
                        }

                        if (!pelangganDitemukan) {
                            Pembeli pembeliBaru = new Pembeli(namaPelanggan);
                            PesananAktif pesananBaru = new PesananAktif(pembeliBaru);
                            pesananBaru.tambahPesanan(namaMenu, porsi, menuPesanan.getHarga());
                            pesananAktif.add(pesananBaru);
                        }

                        System.out.println("Pesanan berhasil ditambahkan! Total harga: Rp" + totalHarga);
                        break;
                    }
                case 4:
                    System.out.println("Daftar pesanan aktif: ");
                    if (pesananAktif.isEmpty()) {
                        System.out.println("Belum ada pesanan!");
                    } else {
                        int j = 1;
                        for (PesananAktif pesanan : pesananAktif) {
                            System.out.print(j + ". ");
                            System.out.println(pesanan.getPembeli().getNama());
                            for (PesananMenu menuPesanann : pesanan.getDaftarPesanan()) {
                                System.out.println(
                                        "   " + menuPesanann.getNamaMenu() + "( " + menuPesanann.getPorsi() + " )"
                                                + " - "
                                                + menuPesanann.getTotalHarga());
                            }
                            j++;
                        }
                    }
                    break;
                case 5:
                    if (pesananAktif.isEmpty()) {
                        System.out.println("Belum ada pesanan!");
                    } else {
                        System.out.print("Masukan nama pelanggan yang selesai: ");
                        namaPelanggan = input.nextLine();
                        boolean pelangganDitemukan = false;

                        for (int index = 0; index < pesananAktif.size(); index++) {
                            if (pesananAktif.get(index).getPembeli().getNama().equalsIgnoreCase(namaPelanggan)) {
                                pesananAktif.remove(index);
                                System.out.println("Pesanan atas nama " + namaPelanggan + " berhasil diselesaikan.");
                                pelangganDitemukan = true;
                                break;
                            }
                        }

                        if (!pelangganDitemukan) {
                            System.out.println("Pesanan atas nama " + namaPelanggan + " tidak ditemukan.");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    break;
                default:
                    System.out.println(menu + ", tidak ada di menu pilihan!");
                    break;
            }

        } while (menu != 6);
    }

    static void displayMenu() {
        System.out.println("\n=== Sistem Pemesanan Restoran ===");
        System.out.println("1. Tambah Menu");
        System.out.println("2. Lihat Menu");
        System.out.println("3. Pesan Makanan");
        System.out.println("4. Lihat Pesanan Aktif");
        System.out.println("5. Selesaikan Pesanan");
        System.out.println("6. Keluar\n");
    }
}
