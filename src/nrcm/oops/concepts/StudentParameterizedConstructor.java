package nrcm.oops.concepts;

class Student2 {

    String rollno;
    String name;
    String gender;
    int year;

    Student2(String rollno, String name, String gender, int year) {

        this.rollno = rollno;
        this.name = name;
        this.gender = gender;
        this.year = year;
    }

    void printStudentDetails() {

        System.out.println("Roll No = " + rollno);
        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Year = " + year);
    }
}

public class StudentParameterizedConstructor {

    public static void main(String[] args) {

        Student2 s1 = new Student2(
            "23X01A05G0",
            "Manasa",
            "Female",
            4
        );

        s1.printStudentDetails();
    }
}
