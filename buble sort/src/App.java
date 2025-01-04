import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nMasukan berapa data: ");
        int data = Integer.parseInt(input.nextLine());
        int[] a = new int[data];
        int n = a.length;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukan data ke-" + (i + 1) + ": ");
            a[i] = Integer.parseInt(input.nextLine());
        }

        bubbleSort(a, n);
        input.close();
    }

    static void bubbleSort(int[] arr, int n) {
        int i, j, temp; 
        boolean swapped;
        System.out.print("\nArray sebelum sorting: " + Arrays.toString(arr) + "\n");
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
            System.out.print("Pengurutan ke-" + (i + 1) + ": " + Arrays.toString(arr) + "\n");
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
