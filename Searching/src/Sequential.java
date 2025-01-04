import java.util.Scanner;

public class Sequential {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] data = {
            1,4,7,2,3,6,7,3,4,6,4,3,5,9,6,8,10
        };

        int bilanganYgDiCari;

        System.out.print("\n\n\nMasukan bilangan yang mau dicari: ");
        bilanganYgDiCari = Integer.parseInt(input.nextLine());

        int number = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == bilanganYgDiCari) {
                System.out.println("Ditemukan " + bilanganYgDiCari + " yang ke-" + (number + 1));
                number++;
            }
        }

        input.close();
    }
}
