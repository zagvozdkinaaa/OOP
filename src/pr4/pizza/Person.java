package pr4.pizza;

public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public void pay() {
        System.out.println(name + " is paying for pizza");
    }
}
