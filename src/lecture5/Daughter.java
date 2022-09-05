package lecture5;

public class Daughter extends Parents {
    Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("HomeMaker");
    }

    @Override
    void partner() {
        System.out.println("Yesss");

    }
}
