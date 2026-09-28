package nrcm.oops.concepts;

class Student4 {

    String name;
    int age;
    String branch;

    // Constructor 1 - No arguments
    Student4() {
        name = "Manasa";
        age = 21;
        branch = "CSE";
    }

    // Constructor 2 - Two arguments
    Student4(String name, int age) {
        this.name = name;
        this.age = age;
        branch = "CSE";
    }

    // Constructor 3 - Three arguments
    Student4(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Branch = " + branch);
        System.out.println();
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Student4 s1 = new Student4();
        Student4 s2 = new Student4("Manasa", 20);
        Student4 s3 = new Student4("Manasa", 20, "CSE");

        s1.display();
        s2.display();
        s3.display();
    }
}
