package coba.jb3;

import java.util.ArrayList;
import java.util.Scanner;

public class Coba3 {
    public static void main(String[] args) {
        int bilangan, banyakBilangan, hasil = 0;
        ArrayList<Integer> bilArr = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa Bilangan : ");
        banyakBilangan = input.nextInt();

        for (int i = 1; i <= banyakBilangan; i++) {
            System.out.print("Masukan bilangan ke-" + i + ", : ");
            bilangan = input.nextInt();
            if (bilangan % 2 == 0) {
                hasil = hasil + bilangan;
                bilArr.add(bilangan);
            }
        }

        for (int i = 0; i < bilArr.size(); i++) {
            if (i == bilArr.size() - 1) {
                System.out.print(bilArr.get(i));
            } else {
                System.out.print(bilArr.get(i) + " + ");
            }
        }
        System.out.print(" = " + hasil);
        input.close();
    }
}
