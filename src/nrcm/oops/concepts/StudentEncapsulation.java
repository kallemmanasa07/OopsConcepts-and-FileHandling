package nrcm.oops.concepts;

class Studentt {

    private String rollno;
    private String name;
    private String gender;
    private int year;

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class StudentEncapsulation {

    public static void main(String[] args) {

        Studentt s = new Studentt();

        s.setRollno("23X01A05G0");
        s.setName("Manasa");
        s.setGender("Female");
        s.setYear(4);

        System.out.println("Roll No = " + s.getRollno());
        System.out.println("Name = " + s.getName());
        System.out.println("Gender = " + s.getGender());
        System.out.println("Year = " + s.getYear());
    }
}