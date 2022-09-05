package lecture5;

public abstract class Parents {
    static int age;

    Parents(int age) {
        Parents.age = age;
    }

    abstract void career();

    abstract void partner();
}
