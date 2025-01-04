package coba.jb3;

import java.util.Scanner;

public class Coba6 {
    public static void main(String[] args) {
        int n, hasil = 1;
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan nilai n: ");
        n = Integer.parseInt(input.nextLine());

        StringBuilder sb = new StringBuilder();
        sb.append(n).append("!").append(" = ");
        for(int i = 1; i <= n; ++i) {
            hasil *= i;
            sb.append(i);
            if (i < n) {
                sb.append(" x ");
            }
        }
        sb.append(" = ").append(hasil);

        System.out.println(sb.toString());
        input.close();
    }
}
