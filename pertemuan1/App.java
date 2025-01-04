import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nama, umur, alamat;
        Scanner userInput = new Scanner(System.in);


        System.out.print("Masukan nama anda: ");
        nama = userInput.nextLine();

        System.out.print("Masukan umur anda: ");
        umur = userInput.nextLine();

        System.out.print("Masukan alamat anda : ");
        alamat = userInput.nextLine();

        System.out.println("=============================================================");
        System.out.printf("Nama kamu %s, umur kamu %s, kamu berasal dari %s \n", nama, umur, alamat);
        System.out.println("=============================================================");
        userInput.close();
    }
}