package lab2.t3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts = new Vector<>();

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                accounts.remove(acc);
                break;
            }
            }
    }

    public void update() {
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void getAccounts() {
        for (Account acc : accounts) {
            acc.print();
        }
    }
}
