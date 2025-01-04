package coba.gpt.soal.empat;

import java.util.ArrayList;

public class PesananAktif {
    private Pembeli pembeli;
    private ArrayList<PesananMenu> daftarPesanan;

    public PesananAktif(Pembeli pembeli){
        this.pembeli = pembeli;
        this.daftarPesanan = new ArrayList<>();
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public ArrayList<PesananMenu> getDaftarPesanan() {
        return daftarPesanan;
    }

    public void tambahPesanan(String namaMenu, int porsi, double harga) {
        for(PesananMenu pesanan : daftarPesanan) {
            if(pesanan.getNamaMenu().equalsIgnoreCase(namaMenu)) {
                pesanan.tambahPorsi(porsi, harga);
                return;
            }
        }

        daftarPesanan.add(new PesananMenu(namaMenu, porsi, harga * porsi));
    }
}
