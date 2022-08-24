package lecture2;

import java.util.Arrays;

public class Main {
    static int age;

    public static void main(String[] args) {
//        Human siba = new Human(20, "Siba",10000,false);
//        Human tarun = new Human(21, "tarun", 100000L,true);
//        System.out.println(siba.age+" "+siba.salary);
//        System.out.println(tarun.age+" "+tarun.salary);
        age = 10;
        Human siba = new Human(20, "Siba", 10000, false);
        Human tarun = new Human(21, "tarun", 100000L, true);
        System.out.println(Human.population);
        System.out.println(Human.population);
        Main obj = new Main();
        System.out.println(age);
        String a = Arrays.toString(new int[]{1, 2, 34});
        System.out.println(a);
        fun();
        obj.fun2();


    }

    static void fun() {
        Main obj = new Main();
        obj.greeting();
    }

    void greeting() {
        System.out.println("Hello World");
        // fun()
        //fun(); you can't use this because it requires an instance as non-static but greeting did not depend on any instance
    }

    void fun2() {
        greeting();
    }


}

