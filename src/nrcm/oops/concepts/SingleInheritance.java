package nrcm.oops.concepts;

class Person {

    String name = "Manasa";

    void displayName() {
        System.out.println("Name = " + name);
    }
}

class Student5 extends Person {

    void study() {
        System.out.println("Student is studying");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Student5 s = new Student5();

        s.displayName();  // Parent class method
        s.study();        // Child class method
    }
}
