package lecture3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Circle();
        Circle circle = new Circle();
        Square square = new Square();
//        shape.area();
//        circle.area();
        Shapes.Greeting();
    }
}
