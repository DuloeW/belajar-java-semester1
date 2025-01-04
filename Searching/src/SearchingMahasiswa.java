import java.util.Scanner;

public class SearchingMahasiswa {
    public static void main(String[] args) {
        final String AWALNIM = "2415354";

        Scanner input = new Scanner(System.in);
        int banyakData, nilai;
        String nama, nim, key;
        boolean ditemukan = false;

        String[] listNamaMahasiswa;
        String[] listNim;
        int[] listNilai;

        System.out.print("Berapa banyak data: ");
        banyakData = Integer.parseInt(input.nextLine());
        listNim = new String[banyakData];
        listNilai = new int[banyakData];
        listNamaMahasiswa = new String[banyakData];

        for(int i = 0; i < banyakData; i++) {
            System.out.println("\n");
            System.out.print("Nim mahasiswa ke-" + (i+1) + " : " + AWALNIM );
            nim = input.nextLine();

            System.out.print("Nama mahasiswa ke-" + (i+1) + " : ");
            nama = input.nextLine();

            System.out.print("Nilai Pemrograman Mahasisw ke-" + (i+1) + " : ");
            nilai = Integer.parseInt(input.nextLine());

            listNim[i] = AWALNIM.concat(nim);
            listNamaMahasiswa[i] = nama;
            listNilai[i] = nilai;
        }

        System.out.print("\nNama Mahasiswa yang dicari: ");
        key = input.nextLine();

        for (int i = 0; i < listNamaMahasiswa.length; i++) {
            if(listNamaMahasiswa[i].equalsIgnoreCase(key)) {
                System.out.println("\n\n==========================");
                System.out.println("NIM: " + listNim[i]);
                System.out.println("Nama: " + listNamaMahasiswa[i]);
                System.out.println("Nilai: " + listNilai[i]);
                System.out.println("Berada pada indek data ke-" + (i+1));
                ditemukan = true;
            }
        }

        if(!ditemukan) {
            System.out.println("Data tidak ditemukan!");
        }

        input.close();
    }
}
