import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key;
        int[] data = {
            10,30,50,60,70,20,40,90,100
        };

        
        System.out.print("Masukan angka yang ingin dicari: ");
        key = Integer.parseInt(input.nextLine());

        
        bubleSort(data);
        int indexNilaiDitemukan = binarySearch(data, key);
        System.out.println(Arrays.toString(data));
        System.out.println("Elemen ditemukan pada index: " + indexNilaiDitemukan);

    }

    static void bubleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + ( right - left ) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
