package pr4.pizza;

public class Main {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();

        Cat cat = new Cat(1, "Siamese");
        Student student1 = new Student("Nastya", 3.69);

        delpapa.servePizza(cat);

        delpapa.servePizza(student1);

        cat.breath();
        cat.eatPizza();
        cat.move();
        student1.move();
        student1.dance();
        student1.retakeExam();

    }
}
