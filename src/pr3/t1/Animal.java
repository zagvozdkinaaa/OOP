package pr3.t1;

public abstract class Animal {
    private String species;
    private int age;
    private double weight;

    public Animal(String species, int age, double weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
