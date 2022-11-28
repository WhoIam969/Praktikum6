package Pertemuan_10.Praktikum6;

public class Persegi extends BangunDatar{
    float Panjang;
    float lebar;

    public Persegi (String warna, float Panjang, float lebar) {
        super(warna);
        this.Panjang = Panjang;
        this.lebar = lebar;
    }

    @Override
    public void gambar() {
        System.out.println("Drawing Persegi"); 
    }

    @Override
    public float luas() {
        return Panjang * lebar;
    }
    
}
