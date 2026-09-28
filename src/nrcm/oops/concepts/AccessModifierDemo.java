package nrcm.oops.concepts;

class Student3 {

    private String name = "Manasa";
    int age = 20;                    // default
    protected String branch = "CSE";
    public String college = "NRCM";

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Branch = " + branch);
        System.out.println("College = " + college);
    }
}

public class AccessModifierDemo {

    public static void main(String[] args) {

        Student3 s = new Student3();

        s.display();

        // System.out.println(s.name); // private - Error

        System.out.println(s.age);       // default
        System.out.println(s.branch);    // protected
        System.out.println(s.college);   // public
    }
}