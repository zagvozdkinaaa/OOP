package lab2.t1c;

public class Test {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Apple", 840000, "Macbook Pro 14", 8, "MacOS");
        Laptop laptop2 = new Laptop("Asus", 400000, "Vivobook 15", 16, "Windows");
        Laptop laptop3 = new Laptop("Apple", 840000, "Macbook Pro 14", 8, "MacOS");

        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptop1.equals(laptop3));
        System.out.println(laptop1.toString());
        System.out.println(laptop2.toString());
        System.out.println(laptop3.toString());
        System.out.println(laptop1.hashCode());
        System.out.println(laptop2.hashCode());
        System.out.println(laptop3.hashCode());
    }
}
