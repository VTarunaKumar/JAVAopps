package lecture1;

public class Opps2 {
    public static void main(String[] args) {
        //call an empty constructor from other
        Student s1 = new Student(1, "Tarun", 99);
//        System.out.println(s1.name);
//        System.out.println(s1.roll);
//        System.out.println(s1.marks);
//       s1.changeName();
//        System.out.println(s1.name);

//        Student s2 = new Student();
//        System.out.println(s2.name);

        Student random = new Student(s1);
        System.out.println(random.name);


    }

    static class Student {
        int roll;
        String name;
        float marks;

        Student(int rollp, String namep, float marksp) {
            this.roll = rollp;
            this.marks = marksp;
            this.name = "Siba";
        }

        Student() {
            this.roll = 2;
            this.marks = 98;
            this.name = "Papu";
        }

        Student(Student random) {
            name = random.name;
            marks = random.marks;
            roll = random.roll;

        }

        void changeName() {
            this.name = "Siba";
        }


    }


}
