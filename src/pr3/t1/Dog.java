package pr3.t1;

public class Dog extends Animal {
    private String name;
    private String breed;

    public Dog(String name,  String breed, int age, double weight) {
        super("Canine", age, weight);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is barking");
    }

    public void play() {
        System.out.println(name + " is playing with its tail");
    }

    public void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }

    public void showInfo() {
        System.out.print("Base Info: ");
        super.displayInfo();
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Breed: " + breed);
    }
}
