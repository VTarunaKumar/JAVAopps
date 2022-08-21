package lecture1;

public class Opps3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = s1;

    }

}

class Student {
    int roll;
    String name;
    float marks;

    Student() {
        this.roll = 1;
        name = "Tarun";
        marks = 44.5f;

    }
}


