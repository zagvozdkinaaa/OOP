package lab3.t1;

public class Bird implements Flyable {
    private int id;

    public Bird(int id) {
        this.id = id;
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
