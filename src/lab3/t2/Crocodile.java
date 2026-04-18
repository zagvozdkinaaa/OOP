package lab3.t2;

public class Crocodile implements Swimmable {
    @Override
    public  void move() {
        System.out.println("Crocodile is moving");
    }
    @Override
    public void swim() {
        System.out.println("Crocodile is swimming");
    }
}
