package lecture3;

import Lecture4.access.A;

class B extends A {

    public B(int num, String name) {
        super(num, name);
    }
}

class SubSub extends C {

    public SubSub(int num, String name) {
        super(num, name);
    }
}

class C extends B {
    public C(int num, String name) {

        super(num, name);
    }

    public static void main(String[] args) {
        SubSub a = new SubSub(1, "erw");
        System.out.println(a instanceof B);
    }
}

