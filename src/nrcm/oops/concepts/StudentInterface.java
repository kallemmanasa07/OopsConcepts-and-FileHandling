package nrcm.oops.concepts;

interface Speaker {

    void speak();
}

class Politician implements Speaker {

    @Override
    public void speak() {
        System.out.println("Politician speaks about politics");
    }
}

class Priest implements Speaker {

    @Override
    public void speak() {
        System.out.println("Priest speaks about moral values");
    }
}

class Lecturer implements Speaker {

    @Override
    public void speak() {
        System.out.println("Lecturer speaks about education");
    }
}

public class StudentInterface {

    public static void main(String[] args) {

        Politician p = new Politician();
        p.speak();

        Priest pr = new Priest();
        pr.speak();

        Lecturer l = new Lecturer();
        l.speak();
    }
}