package coba.jb3;

import java.util.Scanner;

public class Coba7 {
    public static void main(String[] args) {
        String sandi = "";
        int kesempatan = 3;
        Scanner input = new Scanner(System.in);

        clearScreen();
        System.out.println("\n\n==== Program Login ====");
        System.out.print("Register terlebih dahulu! ");

        sandi = register(input, sandi);


        System.out.println("=======================================");
        System.out.println("Login terlebih dahulu, sebelum membuka situs ini! ");
        do {
            if (login(input, sandi)) {
                break;
            } else {
                kesempatan--;
                System.out.println("Kesempatan login tersisa: " + kesempatan);
                if (kesempatan == 0) {
                    System.out.println("Akses ditolak!");
                    break;
                }
            }
        } while (true);
    }

    static boolean login(Scanner input, String sandi) {
        System.out.println("\n\n==== Login ====");
        System.out.print("Masukkan password: ");
        sandi = input.nextLine();
        if (sandi.equals(sandi)) {
            System.out.println("Berhasil login");
            return true;
        } else {
            System.out.println("Gagal login");
            return false;
        }
    }

    static String register(Scanner input, String sandi) {
        System.out.println("\n\n==== Register ====");
        System.out.print("Masukan password: ");
        sandi = input.nextLine();

        System.out.println("Password berhasil diubah!");
        return sandi;
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
