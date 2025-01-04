package coba.gpt.soal.empat;

import java.util.ArrayList;

public class Pembeli {
    private ArrayList<MenuResto> pesanan = new ArrayList<>();
    private String nama;

    public Pembeli(String nama) {
        this.nama = nama;
    }

    public void setPesanan(MenuResto menu) {
        pesanan.add(menu);
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<MenuResto> getPesanan() {
        return pesanan;
    }

}
