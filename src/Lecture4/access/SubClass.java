package Lecture4.access;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass x = new SubClass(12121, "TAr");
        System.out.println(x.num);
    }
}
