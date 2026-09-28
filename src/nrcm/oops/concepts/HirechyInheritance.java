package nrcm.oops.concepts;

class Demoo1 {

    void f1() {
        System.out.println("This is Demo1 f1()");
    }
}

class Demoo2 extends Demo1 {

    void f2() {
        System.out.println("This is Demo2 f2()");
    }
}

class Demoo3 extends Demoo1 {

    void f3() {
        System.out.println("This is Demo3 f3()");
    }
}

public class HirechyInheritance {

    public static void main(String[] args) {

        Demoo2 d2 = new Demoo2();

        d2.f1();
        d2.f2();

        System.out.println();

        Demoo3 d3 = new Demoo3();

        d3.f1();
        d3.f3();
    }
}
