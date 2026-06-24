package Homework.Homework_14.Task4.Exception;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Long id, long balanceGr, long amountGr) {
        super("Insufficient balance for account: " + id + "\nBalance: " + balanceGr + ", requested: " + amountGr);
    }
}
