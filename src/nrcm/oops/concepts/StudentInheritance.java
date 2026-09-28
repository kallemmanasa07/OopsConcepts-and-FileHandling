package nrcm.oops.concepts;


class Demo1 {

    void f1() {
        System.out.println("This is Demo1 f1()");
    }
}

class Demo2 extends Demo1 {

    void f2() {
        System.out.println("This is Demo2 f2()");
    }
}

public class StudentInheritance {

    public static void main(String[] args) {

        Demo2 d = new Demo2();

        d.f1();   // inherited from Demo1
        d.f2();   // Demo2's own method
    }
}