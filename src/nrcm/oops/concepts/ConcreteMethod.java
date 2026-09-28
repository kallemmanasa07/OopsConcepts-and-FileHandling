package nrcm.oops.concepts;


abstract class Studentttt {

    // Abstract method
    abstract void study();

    // Concrete method
    void attendClass() {
        System.out.println("Student attends class");
    }
}

class Manasa extends Studentttt {

    @Override
    void study() {
        System.out.println("Manasa studies Java");
    }
}

public class ConcreteMethod {

    public static void main(String[] args) {

        Manasa m = new Manasa();

        m.study();
        m.attendClass();
    }
}