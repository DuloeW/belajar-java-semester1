package coba.jb3;

import java.util.Scanner;

public class Coba2 {
    public static void main(String[] args) {
        int banyakDeret, pecahan = 1;
        String symbol = " - ";
        Scanner input = new Scanner(System.in);

        // 1 – 1/3 + 1/5 – 1/7 + 1/9 ± .... ± 1/N

        System.out.print("Masukan banyaknya deret: ");
        banyakDeret = input.nextInt();

        if (banyakDeret == 1) {
            System.out.println("1");
        } else {
            System.out.print("1" + symbol);
            for (int i = 1; i <= banyakDeret; i++) {

                pecahan = pecahan + 2;

                if (symbol.equals(" - ")) {
                    symbol = " + ";
                } else {
                    symbol = " - ";
                }

                if (i == banyakDeret) {
                    symbol = "";
                }

                System.out.print("1/" + pecahan + symbol);


            }
        }

        input.close();
    }
}
