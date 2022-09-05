package lecture5;

public class Son extends Parents {
    Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("Noooo");

    }
}
