package coba.gpt.soal.dua;

public class Pasien {
    private String nama;
    private String keluhan;

    public Pasien(String nama, String keluhan) {
        this.nama = nama;
        this.keluhan = keluhan;
    }

    public String getNama() {
        return nama;
    }


    public String getKeluhan() {
        return keluhan;
    }

    public void printData() {
        System.out.println(nama + " - " + keluhan);
    }


}
