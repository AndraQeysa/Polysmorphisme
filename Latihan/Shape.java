public class Shape {
    // private member variable
    private String color;
    // Constructor
    public Shape (String color) {
        this.color = color;
    }

    @Override
    public  String toString() {
        return "Shape[color=" + color +"]";
    }

    //All shapes must have a method called getArea().
    public double getArea() {
        // we need to ruturn some value to compile the program.
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}