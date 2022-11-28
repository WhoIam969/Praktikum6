package Pertemuan_10.Praktikum6;

public class Main {
    public static void main(String[] args) {
        // membuat objek BangunDatar dari class Lingkaran
        BangunDatar linkaran = new Lingkaran("Merah",4);
        // membuat objek BangunDatar dari class Segitiga
        BangunDatar segitiga = new Segitiga("Kuning",4,6);
        // membuat objek BangunDatar dari class Persegi
        BangunDatar persegi = new Persegi("Hijau", 6, 3);
        /* memanggil method Gambar */
        linkaran.gambar();
        segitiga.gambar();
        persegi.gambar();
        System.out.println("Luas Lingkaran: " + linkaran.luas());
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Luas Persegi: " + persegi.luas());



        
    }
}
