package pr3.t1;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever", 5, 20.3);

        myDog.makeSound();
        myDog.showInfo();
        myDog.play();
        myDog.play("a tennis ball");
    }

}