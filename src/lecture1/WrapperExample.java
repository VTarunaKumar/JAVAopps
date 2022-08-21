package lecture1;

public class WrapperExample {
    public static void main(String[] args) {

//        Integer b = new Integer(20);
//        Integer b= 20;
//        System.out.println(b);
//        final int soa = 4;
        //  soa = 5 (error)

        Student obj;
        obj = new Student(12);
        for (int i = 0; i < 999999999; i++) {
            obj = new Student(24);
        }


    }

    static class Student {
        int age;

        Student(int age) {
            System.out.println("Object is been created");
            this.age = 12;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }

    static class Employee {

        int age;

        Employee() {
            age = 30;
        }

    }
}

