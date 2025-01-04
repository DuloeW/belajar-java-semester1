package coba.gpt.soal.tiga;

public class Buku {
    private String judul;
    private String pengarang;
    private boolean dipinjam;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.dipinjam = true;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public boolean getDipinjam() {
        return dipinjam;
    }

    public String getDipinjamString() {
        return dipinjam ? "Dipinjam" : "Tersedia";
    }

    public void setDipinjam(boolean status) {
        this.dipinjam = status;
    }

    public void getData() {
        System.out.println(judul + " - " + pengarang + "  (" + getDipinjamString() + ")");
    }


}
