import java.util.Scanner;

public class MatriksGenap {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("menu");
            System.out.println("1. input data");
            System.out.println("2. keluar program");
            System.out.print("pilih menu : ");
            menu = Integer.parseInt(userInput.nextLine());

            if (menu == 1) {
                int[][] matrix1 = inputData(userInput);
                int[][] matrix2 = inputData(userInput);
                int[][] hasil = perkalian(matrix1, matrix2);
                output(hasil);

            }

        } while (menu != 2);
        System.out.println("anda telah keluar program");

    }

    public static int[][] inputData(Scanner userInput) {
        System.out.print("masukkan jumlah baris :");
        int baris = Integer.parseInt(userInput.nextLine());
        System.out.print("masukkan jumlah kolom :");
        int kolom = Integer.parseInt(userInput.nextLine());

        int[][] matriks = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("masukkan nilai dari (" + i + "," + j + ")");
                matriks[i][j] = userInput.nextInt();
                userInput.nextLine();
            }
        }
        return matriks;
    }

    static int[][] perkalian(int[][] matrix1, int[][] matrix2) {
        int baris1 = matrix1.length;
        int kolom1 = matrix1[0].length;
        int baris2 = matrix2.length;
        int kolom2 = matrix2[0].length;

        if (kolom1 != baris2) {
            throw new IllegalArgumentException(
                    "Jumlah kolom matriks pertama harus sama dengan jumlah baris matriks kedua.");
        }

        int[][] hasil = new int[baris1][kolom2];
        for (int i = 0; i < baris1; i++) { // baris
            for (int j = 0; j < kolom2; j++) { // kolom
                for (int k = 0; k < kolom1; k++) {
                    hasil[i][j] = matrix1[i][k] * matrix2[k][j] + hasil[i][j];
                }
            }
        }
        return hasil;
    }

    static void output(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("|\n");
        }
    }
}
