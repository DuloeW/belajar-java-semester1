package coba.jb5;

import java.util.ArrayList;
import java.util.Scanner;

public class Coba2 {
    public static void main(String[] args) {
        String kata;
        boolean isPalindrom = true;
        ArrayList<Character> kataArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("\n\n\nMasukan kata: ");
        kata = input.nextLine();

        for(int i = 0; i < kata.length(); ++i) {
            kataArray.add(kata.toCharArray()[i]);
        }

        for(int j = 0; j < kataArray.size(); ++j) {
            System.out.println(kataArray.get(j) + "   " + kataArray.get(kata.length() - 1 - j));
            if(!(kataArray.get(j) == kataArray.get(kata.length() - 1 - j))) {
                isPalindrom = false;
            }
        }

        if(!isPalindrom) {
            System.out.println("NOT PALINDROM");
            System.exit(0);
        }

        System.out.println("PALINDROM");

        input.close();
        
    }
}
