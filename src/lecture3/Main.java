package lecture3;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(1.0);
//        Box box2 = new Box(box);
//        System.out.println(box.h+" "+box.w+" "+box.l);
//        System.out.println(box2.l);
        Box b1 = new Box();
        BoxWeight b2 = new BoxWeight(1.2, 3.3, 4.5, 1);
        Box box3 = new BoxWeight(1, 2, 3, 4);

        System.out.println(box3.h + " " + box3.w + " " + box3.l);
        // System.out.println(box4.weight);  not possible


    }
}
