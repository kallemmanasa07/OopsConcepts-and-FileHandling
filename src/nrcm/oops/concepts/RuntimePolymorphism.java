package nrcm.oops.concepts;

class Animall {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dogg extends Animall {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animall {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Animall a;

        a = new Dogg();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
