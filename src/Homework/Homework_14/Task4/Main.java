package Homework.Homework_14.Task4;

import Homework.Homework_14.Task4.Bank.BankAtomic;
import Homework.Homework_14.Task4.Bank.BankLock;
import Homework.Homework_14.Task4.Bank.BankSync;
import Homework.Homework_14.Task4.Exception.InsufficientFundsException;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        BankSync bank = new BankSync();
//        BankLock bank = new BankLock();
//        BankAtomic bank = new BankAtomic();

        for (long i = 1; i <= 10; i++) bank.openAccount(i, 1000);

        ExecutorService pool = Executors.newFixedThreadPool(8);
        Random rng = new Random(42);

        CompletableFuture<?>[] futures = new CompletableFuture<?>[1000];
        for (int i = 0; i < 1000; i++) {
            long from = 1 + rng.nextInt(10);
            long to;
            do {
                to = 1 + rng.nextInt(10);
            } while (to == from);
            long amountGr = (100 + rng.nextInt(401)) * 100L;
            final long fromF = from, toF = to, amountF = amountGr;
            futures[i] = CompletableFuture.runAsync(() -> {
                try {
                    bank.transfer(fromF, toF, amountF);
                } catch (InsufficientFundsException e) { /* OK – niewystarczające środki */ }
            }, pool);
        }

        CompletableFuture.allOf(futures).join();

        bank
                .getAccounts()
                .values()
                .forEach(account ->
                        System.out.println("Account ID: " + account.getId() + ", balance in gr: " + (account.getBalanceGr())));

        long total = bank.totalBalanceGr();
        System.out.println("Suma sald: " + total + " gr (powinno: " + (10 * 1000 * 100L) + ")");
        if (total != 10 * 1000 * 100L) {
            throw new AssertionError("NIEZMIENNIK ZŁAMANY – jest race condition!");
        }

        pool.shutdown();
    }
}