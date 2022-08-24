package lecture3;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(Double side) {
        this.w = side;
        this.h = side;
        this.l = side;

    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.l = old.h;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the Box");
    }


}

