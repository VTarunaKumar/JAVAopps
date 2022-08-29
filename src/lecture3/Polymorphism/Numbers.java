package lecture3.Polymorphism;

public class Numbers {
    public static void main(String[] args) {
        Numbers a = new Numbers();
        System.out.println(a.sum(1, 2, 3));

    }

    double sum(double a, double b, double c) {

        double sum = a + b + c;

        return sum;
    }

    int sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
}
