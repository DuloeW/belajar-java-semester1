import java.util.Scanner;

public class HakAkses {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan username: ");
        String username = userInput.nextLine();

        System.out.print("Masukan password: ");
        String password = userInput.nextLine();

        System.out.print("Masukan umur: ");
        String umur = userInput.nextLine();

        checkAccess(userInput, username, password, umur);
    }

    private static void checkAccess(Scanner userInput, String username, String password, String umur) {
        if(username.equals("Eddy") && password.equals("tidak ada")) {
            System.out.println("Anda berhak menggunakan aplikasi ini");
        } else if (username.equals("Admin") && password.equals("sama")) {
            System.out.println("Anda berhak menggunakan dan menghapus aplikasi ini");
        } else {
            System.out.println("Anda tidak berhak menggunakan aplikasi ini");
            userInput.close();
            return;
        }
        System.out.println("Umur anda adalah " + umur);
        userInput.close();
    }

}