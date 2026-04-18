package pr4.pizza;

public class Cat extends Animal implements CanHavePizza, Movable {
    String breed;

    public Cat(int id, String breed) {
        super(id);
        this.breed = breed;
    }

    @Override
    public void eatPizza() {
        System.out.println("Cat is eating pizza");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving");
    }
}
