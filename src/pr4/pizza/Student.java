package pr4.pizza;

public class Student extends Person implements CanHavePizza, CanHaveRetake, CanHaveParty {
    double gpa;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " is eating pizza");
    }

    @Override
    public void move() {
        System.out.println(name + " is walking");
    }

    @Override
    public void dance() {
        System.out.println(name + " is dancing");
    }

    @Override
    public void retakeExam() {
        System.out.println(name + " is retaking the exam");
    }
}
