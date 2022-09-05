
public class Main {
    public static int fun(int x) {
        if (x > 100) {
            return x - 10;
        } else {
            return fun(fun(x + 11));
        }
    }

    public static void main(String[] args) {
        int x = fun(99);
        System.out.println(x);

    }

}

