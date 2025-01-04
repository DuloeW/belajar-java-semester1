import java.util.Scanner;

public class MatriksGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        int[][] matrix1;
        int[][] matrix2;
        int[][] hasil;
        int ordo;

        while (true) {
            displayMenu();
            System.out.print("Pilih menu: ");
            menu = Integer.parseInt(input.nextLine());

            if (menu < 1 || menu > 2) {
                System.out.println("Menu tidak ada!!");
                continue;
            }

            System.out.print("Masukan matrix ordo berapa: ");
            ordo = Integer.parseInt(input.nextLine());

            System.out.println("Masukan nilai matrix 1 : ");
            matrix1 = inputMatrix(input, ordo);
            displayMatrix(matrix1);

            System.out.println("Masukan nilai matrix 2 : ");
            matrix2 = inputMatrix(input, ordo);
            displayMatrix(matrix2);

            if (menu == 1) {
                hasil = calculateMatrix(matrix1, matrix2, true);
                System.out.println("\nHasil Matrix :");
                displayMatrix(hasil);
            } else if (menu == 2) {
                hasil = calculateMatrix(matrix1, matrix2, false);
                System.out.println("\nHasil Matrix :");
                displayMatrix(hasil);
            }
        }
    }

    static int[][] inputMatrix(Scanner input, int ordo) {
        int[][] matriks = new int[ordo][ordo];
        for (int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++) {
                System.out.print("Masukan nilai dari (" + i + ", " + j + ") = ");
                matriks[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        return matriks;
    }

    static int[][] calculateMatrix(int[][] matrix1, int[][] matrix2, boolean isAddition) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;
        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = isAddition ? matrix1[i][j] + matrix2[i][j] : matrix1[i][j] - matrix2[i][j];
            }
        }
        return hasil;
    }

    static void displayMatrix(int[][] hasil) {
        for (int[] row : hasil) {
            System.out.print("|");
            for (int value : row) {
                System.out.print(" " + value + " ");
            }
            System.out.print("|\n");
        }
    }

    static void displayMenu() {
        System.out.println("\n\n============================");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("============================");
    }
}
