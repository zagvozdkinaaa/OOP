package lab2.t5;

public class Student extends Person {
    private String major;
    private double gpa;

    public Student(String name, int age, String major, double gpa) {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public String getOccupation() {
        return "Student majoring in " + major + " (GPA: " + gpa + ")";
    }
}
