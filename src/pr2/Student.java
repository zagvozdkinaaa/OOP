package pr2;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }
    public void incrementYearOfStudy() {
        yearOfStudy++;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + ", id: " + id;
    }
}
