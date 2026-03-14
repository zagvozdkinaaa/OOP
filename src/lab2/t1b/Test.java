package lab2.t1b;

public class Test {
    public static void main(String[] args) {
        DVD dvd = new DVD("Дьявол носит Prada", "Дэвид Френкель", 109, "18+", "Комедия");

        dvd.setPublicationYear(2006);
        System.out.println(dvd.toString());

        System.out.println(dvd.getOverdueFine());
    }
}
