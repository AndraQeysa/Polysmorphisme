package Latihan;

public class TestLine {

    public static void main(String[] args) {
        Line garis = new Line(2, 4, 6, 3);
        System.out.println(garis.getLength());
        System.out.println(garis.isGreater(garis, garis));
        System.out.println(garis.isLess(garis, garis));
        System.out.println(garis.isEqual(garis, garis));

    }
}
