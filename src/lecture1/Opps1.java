package lecture1;

import java.util.Arrays;

public class Opps1 {
    public static void main(String[] args) {
        Student siba = new Student("Sibaaaa", 11, 90.2f);
//        System.out.println(siba.rollNo);
//        System.out.println(siba.name);
//        System.out.println(siba.marks);
//        siba = new Student();
//        siba.rollNo = 1;
//        siba.marks = 99;
//        siba.name = "Tarun Kumar";
//        siba.Greeting();
//        siba.changeName("Tarun");
//        System.out.println(siba.rollNo);
//        System.out.println(siba.name);
//        System.out.println(siba.marks);
//        Student tarun = new Student("Tarun Kumar Rao", 2, 90);
//        System.out.println(tarun.rollNo);
//        System.out.println(tarun.name);
//        System.out.println(tarun.marks);

//        Student random = new Student(siba);
//        System.out.println(random.name);



    }


    static class Student {

        int rollNo;
        String name;
        float marks;

        //we need  a way to add the values of the above properties object by object
        // Student() we need one word to access an object
        void Greeting() {
            System.out.println("Hello i am " + name);
        }

        void changeName(String newName) {
            System.out.println(this.name);
            this.name = newName;
            System.out.println(this.name);
        }
        // Student siba = new Student()
        //Here this will replac with siba
        Student() {
            this.name = "Siba";
            this.rollNo = 1;
            this.marks = 99;
        }

        //Construction Overloading (Polymorphism)
        Student(String p_name, int p_rollNo, float p_marks) {
            name = p_name;
            rollNo = p_rollNo;
            marks = p_marks;

        }
        Student(Student other){

            this.name = other.name;
            this.marks = other.marks;
            this.rollNo = other.rollNo;



        }
    }
}


