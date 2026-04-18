package pr4.device;

public class Main {
    public static void main(String[] args) {
        iPhone phone = new iPhone("iPhone 15", 256);

        phone.sell();
        phone.plugIn();
    }
}
