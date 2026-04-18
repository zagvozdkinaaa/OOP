package lab2.t5;

public abstract class Animal implements Comparable<Animal>, Cloneable, Groomable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    @Override
    public void clean() {
        System.out.println("The animal is being cleaned");
    }

    @Override
    public void maintainHealth() {
        System.out.println("The animal's health is being maintained");
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
