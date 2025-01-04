package coba.gpt.soal.empat;

public class MenuResto {
    private String nama;
    private double harga;

    public MenuResto(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void getData() {
        System.out.println(nama + " - " + harga);
    }
}