package lecture2;

//this is demo to show initialization of static variable
public class StaticInitialize {
    static int a = 4;
    static int b;

    static {
        System.out.println("Okkkkkk");
        b = a * 10;

    }

    int c;

    public static void main(String[] args) {
        StaticInitialize obj = new StaticInitialize();
        System.out.println(b);
        StaticInitialize.b = b + 1;
        System.out.println(b);
        StaticInitialize obj2 = new StaticInitialize();


    }


}
