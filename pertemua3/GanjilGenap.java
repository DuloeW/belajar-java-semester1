import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka: ");
        angka = userInput.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah genap");
        } else {
            System.out.println("Angka " + angka + " adalah ganjil");
        }
        userInput.close();
    }
}
