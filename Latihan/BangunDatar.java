package Pertemuan_10.Praktikum6;

public abstract class BangunDatar {
    String warna;

    public BangunDatar(String warna) {
        this.warna = warna;
    }

    public abstract void gambar();
    public abstract float luas ();
}
