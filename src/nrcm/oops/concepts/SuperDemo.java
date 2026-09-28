package nrcm.oops.concepts;
class Parent {

    int x = 100;
}

class Child extends Parent {

    int x = 200;

    void display() {

        System.out.println("Child x = " + x);
        System.out.println("Parent x = " + super.x);
    }
}

public class SuperDemo {

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}