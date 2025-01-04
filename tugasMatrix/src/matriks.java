
    import java.util.Scanner;

public class matriks {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input matriks pertama:");
        int[][] matrix1 = inputData(userInput);

        System.out.println("Input matriks kedua:");
        int[][] matrix2 = inputData(userInput);

        try {
            int[][] hasil = perkalian(matrix1, matrix2);

            System.out.println("Hasil perkalian matriks:");
            for (int i = 0; i < hasil.length; i++) {
                System.out.print("|");
                for (int j = 0; j < hasil[0].length; j++) {
                    System.out.print(" " + hasil[i][j] + " ");
                }
                System.out.print("|\n");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int[][] inputData(Scanner userInput) {
        System.out.print("Masukkan jumlah baris: ");
        int baris = userInput.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = userInput.nextInt();

        int[][] matriks = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan nilai dari (" + i + "," + j + "): ");
                matriks[i][j] = userInput.nextInt();
            }
        }
        return matriks;
    }

    public static int[][] perkalian(int[][] matrix1, int[][] matrix2) {
        int baris1 = matrix1.length;
        int kolom1 = matrix1[0].length;
        int baris2 = matrix2.length;
        int kolom2 = matrix2[0].length;

        if (kolom1 != baris2) {
            throw new IllegalArgumentException("Jumlah kolom matriks pertama harus sama dengan jumlah baris matriks kedua.");
        }

        int[][] hasil = new int[baris1][kolom2];
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                hasil[i][j] = 0; // Inisialisasi elemen ke 0
                for (int k = 0; k < kolom1; k++) {
                    hasil[i][j] += matrix1[i][k] * matrix2[k][j]; // Operasi sesuai aturan perkalian matriks
                }
            }
        }
        return hasil;
    }
}

