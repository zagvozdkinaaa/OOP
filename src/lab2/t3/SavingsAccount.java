package lab2.t3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int a, double rate) {
        super(a);
        interestRate = rate;
    }
    public void addInterest() {
        double interest = this.getBalance() * interestRate;
        deposit(interest);
    }
}
