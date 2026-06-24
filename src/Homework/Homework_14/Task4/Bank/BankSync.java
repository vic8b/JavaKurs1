package Homework.Homework_14.Task4.Bank;

import Homework.Homework_14.Task4.BankAccount.BankAccountSync;

import java.util.concurrent.ConcurrentHashMap;

public class BankSync {
    private final ConcurrentHashMap<Long, BankAccountSync> accounts = new ConcurrentHashMap<>();

    public void openAccount(long id, long initialAmountGr) {
        accounts.putIfAbsent(id, new BankAccountSync(id, initialAmountGr));
    }

    // wskazówka -> blokowanie kont w porządku rosnącym po id

    public void transfer(long fromId, long toId, long amountGr) {
        if (fromId == toId) return;

        BankAccountSync a = accounts.get(fromId);
        BankAccountSync b = accounts.get(toId);

        if (a == null || b == null) throw new IllegalArgumentException("One or both of the accounts does not exist");

        // Klucz: zawsze blokujemy locki w tej samej kolejności
        BankAccountSync first = a.getId() < b.getId() ? a : b;
        BankAccountSync second = a.getId() < b.getId() ? b : a;

        synchronized (first) {
            synchronized (second) {
                //reentrant
                a.withdraw(amountGr);
                b.deposit(amountGr);
            }
        }
    }

    public long totalBalanceGr() {
        return accounts
                .values()
                .stream()
                .mapToLong(BankAccountSync::getBalanceGr)
                .sum();
    }

    public ConcurrentHashMap<Long, BankAccountSync> getAccounts() {
        return accounts;
    }
}
