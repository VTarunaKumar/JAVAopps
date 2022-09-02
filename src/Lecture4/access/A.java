package Lecture4.access;

public class A {
    final int num = 10;
    String name;
    int[] arr;
    private int x = 10;

    public A(int num, String name) {
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
