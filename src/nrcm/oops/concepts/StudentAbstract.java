package nrcm.oops.concepts;

abstract class GraphicObject {

    // Abstract method
    abstract void draw();

    // Concrete method
    void fillColor() {
        System.out.println("Filled with blue color");
    }
}

class Rectangle extends GraphicObject {

    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Square extends GraphicObject {

    @Override
    void draw() {
        System.out.println("Drawing square");
    }
}

public class StudentAbstract {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.draw();
        r.fillColor();

        System.out.println();

        Square s = new Square();

        s.draw();
        s.fillColor();
    }
}