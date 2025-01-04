package coba.jb3;

import java.util.Scanner;

public class Coba1 {
    public static void main(String[] args) {
        int anakAyam;
        Scanner user = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah anak ayam : ");
        anakAyam = user.nextInt();


        System.out.println("Anak Ayam Turun" + anakAyam);
        for (int i = anakAyam; i > 0; i--) {
            System.err.printf("Anak ayam turun %d, ", i);
            if(i != 1) {
                System.err.printf("mati satu tinggal %d\n",i-1);
            } else {
                System.out.println("mati satu tinggal induknya");
            }
        }

        user.close();
    }
}
