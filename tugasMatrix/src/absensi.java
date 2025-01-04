public class absensi {
    public static void main(String[] args) {

        String[][] jadwalPiket = new String[5][3];

        String[] namaMahasiswa = {
                "bayu", "arya", "ari", "prima", "banu", "fajar", "panjul", "deana", "rion", "ning", "juniarta", "teja",
                "budi", "sentana", "restu"
        };

        int index = 0;
        for (int i = 0; i < jadwalPiket.length; i++) {
            for (int j = 0; j < jadwalPiket[0].length; j++) {
                jadwalPiket[i][j] = namaMahasiswa[index];
                index += 1;
            }
        }

        for (int j = 0; j < jadwalPiket.length; j++) {
            System.out.println("");
            getNamaHari(j);
            for (int j2 = 0; j2 < jadwalPiket[0].length; j2++) {
                System.out.println("  -" + jadwalPiket[j][j2]);
            }
            System.out.println("");
        }

    }

    static void getNamaHari(int index) {
        switch (index) {
            case 0:
                System.out.println("Senin");
                break;
            case 1:
                System.out.println("Selasa");
                break;
            case 2:
                System.out.println("Rabu");
                break;
            case 3:
                System.out.println("Kamis");
                break;
            case 4:
                System.out.println("Jumat");
                break;
            default:
                break;
        }
    }
}
