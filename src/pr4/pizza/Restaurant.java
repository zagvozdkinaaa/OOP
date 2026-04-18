package pr4.pizza;

public class Restaurant {
    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();

        if (eater instanceof Person) {
            Person p = (Person) eater;
            p.pay();
        } else {
            System.out.println("No payment needed");
        }
        return true;
    }
}
