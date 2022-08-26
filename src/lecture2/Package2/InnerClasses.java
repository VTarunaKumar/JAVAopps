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
<<<<<<
    <HEAD
            String name;

    public InnerClasses(String name) {
        this.name = name;
    }

    public String toString() {
        return "Hello" + name;
    }

    static class InClass {

=======

        static class InClass {
>>>>>>>github/master
            String name;

            public InClass(String name) {
                this.name = name;
<<<<<<<HEAD


            }

            public static void main(String[] args) {
                InnerClasses a = new InnerClasses("Siba");
=======
            }

            public static void main(String[] args) {
                InClass a = new InClass("Siba");
>>>>>>>github / master
                InClass b = new InClass("Tarun");
//        OutClass c = new OutClass("Okky");
                System.out.println(a.name);
                System.out.println(b.name);
<<<<<<<HEAD
                System.out.println(a);
=======
>>>>>>>github / master


            }


        }

}
