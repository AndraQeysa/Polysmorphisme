public class TestShape {
    public static void main (String[] args) {
        Shape blanc = new Rectangle ("white", 4, 5);
        System.out.println(blanc);
        System.out.println("Area is " +blanc.getArea());

        Shape noir = new Triangle("black", 4, 5);
        System.out.println(noir);
        System.out.println("Area is " +noir.getArea());
    }
}