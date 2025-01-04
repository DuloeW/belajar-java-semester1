package kuisis;

import java.util.Scanner;

public class Kuis1 {
    public static void main(String[] args) {
        double hargaJual, marginKeuntungan;
        int hargaPokok, persentaseMarginDasar;
        String kodeBarang, jenisBarang;

        Scanner userInput = new Scanner(System.in);

        System.out.println("===========BARANG YANG DIJUAL===========");
        System.out.println("Makanan Ringan");
        System.out.println("Pakaian");
        System.out.println("Alat Rumah Tangga");
        System.out.print("Masukan jenis barang            : ");
        jenisBarang = userInput.nextLine();

        System.out.print("Masukan kode barang             : ");
        kodeBarang = userInput.nextLine();

        System.out.print("Masukan persentase margin dasar : ");
        persentaseMarginDasar = userInput.nextInt();

        System.out.print("Masukan harga pokok             : ");
        hargaPokok = userInput.nextInt();

        if (jenisBarang.equalsIgnoreCase("makanan ringan")) {
            marginKeuntungan = (persentaseMarginDasar * hargaPokok / 100) + (2 * hargaPokok / 100);
        } else if (jenisBarang.equalsIgnoreCase("pakaian")) {
            marginKeuntungan = (persentaseMarginDasar * hargaPokok / 100) + (4 * hargaPokok / 100);
        } else if (jenisBarang.equalsIgnoreCase("alat rumah tangga")) {
            marginKeuntungan = (persentaseMarginDasar * hargaPokok / 100) + (6 * hargaPokok / 100);
        } else {
            System.out.println("Pilihan anda salah!!");
            userInput.close();
            return;
        }

        hargaJual = hargaPokok + marginKeuntungan;
        System.out.println("=======================================");
        System.out.println("Kode barang                       :" + kodeBarang);
        System.out.println("Jenis barang                      :" + jenisBarang);
        System.out.println("Harga Pokok                       :" + hargaPokok);
        System.out.println("Persentase margin dasar           :" + persentaseMarginDasar + "%");
        System.out.println("Persentase margin keuntunngan     :" + marginKeuntungan);
        System.out.println("Harga Jual                        :" + hargaJual);

        userInput.close();
    }
}
