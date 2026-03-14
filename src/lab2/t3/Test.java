package lab2.t3;

public class Test {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        SavingsAccount saveAcc = new SavingsAccount(1, 0.1);
        CheckingAccount checkAcc = new CheckingAccount(2);

        myBank.openAccount(saveAcc);
        myBank.openAccount(checkAcc);

        saveAcc.deposit(20000);

        checkAcc.deposit(500);
        checkAcc.withdraw(100);
        checkAcc.deposit(300);
        checkAcc.withdraw(50);
        checkAcc.deposit(100);

        myBank.getAccounts();

        myBank.update();

        myBank.getAccounts();

        myBank.closeAccount(1);
        myBank.getAccounts();
    }
}
