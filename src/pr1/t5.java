package pr1;

public class t5 {
    public static void main(String[] args) {
        double balance = 1000.0;
        double interest = 5.0;

        double newBalance = balance + balance * interest / 100;

        System.out.println("Initial balance: " + balance);
        System.out.println("Interest rate: " + interest + "%");
        System.out.println("New balance: " + newBalance);
    }
}