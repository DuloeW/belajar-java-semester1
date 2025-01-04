package coba.jb3;

import java.util.Scanner;

public class Coba5 {
    public static void main(String[] var0) {
        int a, n, hasil = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("\n\nProgram Pangkat\n");
        System.out.print("Masukan nilai a: ");
        a = Integer.parseInt(input.nextLine());
        
        System.out.print("Masukan nilai n: ");
        n = Integer.parseInt(input.nextLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            hasil *= a;
            sb.append(a);
            if (i < n) {
                sb.append(" x ");
            }
        }
        sb.append(" = ").append(hasil);
        
        System.out.println(sb.toString());

        input.close();
    }
}
