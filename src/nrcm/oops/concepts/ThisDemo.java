package nrcm.oops.concepts;
class Studenttt {

    String name;
    int age;

    Studenttt(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

public class ThisDemo {

    public static void main(String[] args) {

        Studenttt s = new Studenttt("Manasa", 20);

        s.display();
    }
}