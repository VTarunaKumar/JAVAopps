package lecture3;

public class BoxColor extends BoxWeight {
//    public BoxColor(double l, double h, double w, double weight, String color) {
//        super(l, h, w, weight);
//        this.color = color;
//    }

    String color;

    BoxColor() {
        this.color = "Red";

    }

    public BoxColor(double l, double h, double w, double weight, String cname) {
        super(l, h, w, weight);
        this.color = cname;
    }

    public static void main(String[] args) {
        BoxColor col = new BoxColor(1.2, 3.4, 3.3, 3.3, "Blue");
        System.out.println(col.color);
    }
}
