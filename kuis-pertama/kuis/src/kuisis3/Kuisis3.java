package kuisis3;

import java.util.Scanner;

public class Kuisis3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namaProduk;
        String[] kodeProduk;
        int[] jumlahProduk;
        int pilihanMenu = 0;
        boolean ulang = true;

        System.out.println("Ada Berapa Produk: ");
        int banyakData = Integer.parseInt(input.nextLine());
        namaProduk = new String[banyakData];
        kodeProduk = new String[banyakData];
        jumlahProduk = new int[banyakData];

        while (ulang) {
            switch (inputMenu(input, pilihanMenu)) {
                case 1:
                    inputDataProduk(input, namaProduk, kodeProduk, jumlahProduk, banyakData);
                    break;
                case 2:
                    tampilkanDataProduk(namaProduk, kodeProduk, jumlahProduk);
                    break;
                case 3:
                    ulang = false;
                    break;
                default:
                    System.out.println("Input salah cuy! Hanya 1-3 saja!");
                    break;
            }
        }
    }

    static void inputDataProduk(Scanner input, String[] namaProduk, String[] kodeProduk, int[] jumlahProduk,
            int banyakData) {
        for (int i = 0; i < banyakData; i++) {
            System.out.print("\nNama produk ke-" + (i + 1) + " : ");
            namaProduk[i] = input.nextLine();
            System.out.print("Kode produk ke-" + (i + 1) + " : ");
            kodeProduk[i] = input.nextLine();
            System.out.print("Jumlah produk ke-" + (i + 1) + ": ");
            jumlahProduk[i] = Integer.parseInt(input.nextLine());
        }
    }

    static void mengurutkanDataProduk(String[] namaProduk, String[] kodeProduk, int[] jumlahProduk) {
        for (int i = 0; i < jumlahProduk.length - 1; i++) {
            for (int j = 0; j < jumlahProduk.length - i - 1; j++) {
                if (jumlahProduk[j] > jumlahProduk[j + 1]) {
                    int tempJumlah = jumlahProduk[j];
                    jumlahProduk[j] = jumlahProduk[j + 1];
                    jumlahProduk[j + 1] = tempJumlah;

                    String tempNama = namaProduk[j];
                    namaProduk[j] = namaProduk[j + 1];
                    namaProduk[j + 1] = tempNama;

                    String tempKode = kodeProduk[j];
                    kodeProduk[j] = kodeProduk[j + 1];
                    kodeProduk[j + 1] = tempKode;
                }
            }
        }
    }

    static void tampilkanDataProduk(String[] namaProduk, String[] kodeProduk, int[] jumlahProduk) {
        mengurutkanDataProduk(namaProduk, kodeProduk, jumlahProduk);
        for (int i = 0; i < jumlahProduk.length; i++) {
            System.out.println("\nNama produk ke-" + (i + 1) + " : " + namaProduk[i]);
            System.out.println("Kode produk ke-" + (i + 1) + " : " + kodeProduk[i]);
            System.out.println("Jumlah produk ke-" + (i + 1) + " : " + jumlahProduk[i]);
        }
    }

    static void tampilkanMenu() {
        System.out.println("================================");
        System.out.println("1. Input Data");
        System.out.println("2. Mengurutkan dan Menampilkan Data");
        System.out.println("3. Keluar Program");
        System.out.println("================================");
    }

    static int inputMenu(Scanner input, int pilihanMenu) {
        tampilkanMenu();
        System.out.print("Pilih menu yang mana(1-3): ");
        pilihanMenu = Integer.parseInt(input.nextLine());
        return pilihanMenu;
    }

    
}
