package lecture2;

public class Human {


    static long population;
    int age;
    String name;
    long salary;
    boolean married;

    static void message() {
        System.out.println("Heloooo");
//
    }

    public Human(int age, String name, long salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

}
