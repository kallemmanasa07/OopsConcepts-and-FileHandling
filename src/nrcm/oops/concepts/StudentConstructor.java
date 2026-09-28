package nrcm.oops.concepts;

class Student1 {

    String rollno;
    String name;
    String gender;
    int year;

    Student1() {
        rollno = "23X01A05G0";
        name = "Manasa";
        gender = "Female";
        year = 4;
    }

    void printStudentDetails() {

        System.out.println("Roll No = " + rollno);
        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Year = " + year);
    }
}

public class StudentConstructor {

    public static void main(String[] args) {

        Student1 s1 = new Student1();

        s1.printStudentDetails();
    }
}