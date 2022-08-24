package lecture2.Package2;
//class OutClass{
//    static String Oname;
//    public OutClass(String oname) {
//        Oname = oname;
//    }
//}
//class InClass {
//    public InClass(String name) {
//        InClass.name = name;
//    }
//
//    static String name;

//}


public class InnerClasses {
    String name;

    public InnerClasses(String name) {
        this.name = name;
    }

    public String toString() {
        return "Hello" + name;
    }

    static class InClass {

        String name;

        public InClass(String name) {
            this.name = name;


        }

        public static void main(String[] args) {
            InnerClasses a = new InnerClasses("Siba");
            InClass b = new InClass("Tarun");
//        OutClass c = new OutClass("Okky");
            System.out.println(a.name);
            System.out.println(b.name);
            System.out.println(a);


        }


    }

}
