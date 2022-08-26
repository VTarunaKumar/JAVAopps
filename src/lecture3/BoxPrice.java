package lecture3;

public class BoxPrice extends BoxWeight {
    int price;

    BoxPrice(double l, double h, double w, double weight, int price) {
        super(l, h, w, weight);
        this.price = price;

    }

    BoxPrice() {
        super();
        this.price = -1;

    }
}
