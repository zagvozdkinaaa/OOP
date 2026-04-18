package lab2.t5;

import java.util.Objects;

public abstract class Person implements Comparable<Person>, Cloneable, PetCaretaker{
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal getPet() { return pet; }
    public String getName() {
        return name;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() { this.pet = null; }

    public boolean hasPet() { return pet != null; }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {
        if (!this.hasPet()) {
            System.out.println(name + " does not have a pet to leave.");
            return;
        }

        if (caretaker instanceof PhDStudent && this.pet instanceof Dog) {
            System.out.println("Error! PhD Students are too busy to take a dog.");
            return;
        }

        System.out.println(name + " leaves " + pet.getName() + " with " + caretaker.getName());
        caretaker.assignPet(this.pet);
        this.removePet();
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker.hasPet()) {
            this.assignPet(caretaker.getPet());
            caretaker.removePet();
            System.out.println(name + " has his/her pet back.");
        }
    }

    @Override
    public String toString() {
        return name + " (" + getOccupation() + "), Pet: " + (hasPet() ? pet : "None");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(pet, person.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pet);
    }

    @Override
    public void feedPet(Animal pet) {
        System.out.println(this.name + " is feeding " + pet.getName());
    }

    @Override
    public void talkToPet(Animal pet) {
        System.out.println(this.name + " is talking to " + pet.getName());
    }

    @Override
    public void playWithPet(Animal pet) {
        System.out.println(this.name + " is playing with " + pet.getName());
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        if (this.pet != null) {
            cloned.pet = (Animal) this.pet.clone();
        }
        return cloned;
    }
}
