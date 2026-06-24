package Homework.Homework_14.Task4.BankAccount;

import Homework.Homework_14.Task4.Exception.InsufficientFundsException;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLock {
    private final Long id; //numer konta
    private long balanceGr; // w groszach; uniknięcie błędów zaokrąglenia

    public final ReentrantLock lock = new ReentrantLock();

    public BankAccountLock(Long id, long initialPln) {
        this.id = id;
        this.balanceGr = initialPln * 100;
    }

    public void deposit(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("Amount must be positive");

        balanceGr += amountGr;
    }

    public void withdraw(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (balanceGr < amountGr) throw new InsufficientFundsException(id, balanceGr, amountGr);

        balanceGr -= amountGr;
    }

    public long getBalanceGr() {
        lock.lock();
        try {
            return balanceGr;
        } finally {
            lock.unlock();
        }
    }

    public Long getId() {
        return id;
    }
}
