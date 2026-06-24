package Homework.Homework_14.Task4.Bank;

import Homework.Homework_14.Task4.BankAccount.BankAccountAtomic;

import java.util.concurrent.ConcurrentHashMap;

public class BankAtomic {
    private final ConcurrentHashMap<Long, BankAccountAtomic> accounts = new ConcurrentHashMap<>();

    public void openAccount(long id, long initialAmountGr) {
        accounts.putIfAbsent(id, new BankAccountAtomic(id, initialAmountGr));
    }

    public boolean transfer(long fromId, long toId, long amountGr) {
        if (fromId == toId) return true;

        BankAccountAtomic fromAtomic = accounts.get(fromId);
        BankAccountAtomic toAtomic = accounts.get(toId);

        if (fromAtomic == null || toAtomic == null) throw new IllegalArgumentException("One or both of the accounts does not exist");

        if (!fromAtomic.tryWithdraw(amountGr)) {
            return false;
        }

        toAtomic.deposit(amountGr);

        return true;
    }

    public long totalBalanceGr() {
        return accounts
                .values()
                .stream()
                .mapToLong(BankAccountAtomic::getBalanceGr)
                .sum();
    }

    public ConcurrentHashMap<Long, BankAccountAtomic> getAccounts() {
        return accounts;
    }
}
