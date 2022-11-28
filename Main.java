package Pertemuan_10;

public class Main {
    public static void main(String[] args) {
        // membuat objek Shape dari class Rectangle
        Shape rect = new Rectangle(100, 200);
        // membuat objek Shape dari class Circle
        Shape circ = new Circle(50);
        /* memanggil method draw */
        rect.draw();
        circ.draw();
        System.out.println("Luas Lingkaran: " + circ.getAreas());
        System.out.println("Luas Persegi: " + rect.getAreas());
    }
}
    
