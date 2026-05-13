package Homework.Homework_9;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

final class BankAccount {
    private int balance;

    public BankAccount(int initial) {
        this.balance = initial;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance. Balance: " + balance + ", withdrawal amount: " + amount);
        }

        this.balance -= amount;

        System.out.println(amount + " has been withdrawn from account. Current balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}
