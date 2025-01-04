package coba.gpt.soal.empat;

public class PesananMenu {
    private String namaMenu;
    private int porsi;
    private double totalHarga;

    public PesananMenu(String namaMenu, int porsi, double totalHarga) {
        this.namaMenu = namaMenu;
        this.porsi = porsi;
        this.totalHarga = totalHarga;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public int getPorsi() {
        return porsi;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void tambahPorsi(int jumlah, double harga) {
        this.porsi += jumlah;
        this.totalHarga += harga * jumlah;
    }
}
