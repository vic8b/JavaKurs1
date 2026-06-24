package Homework.Homework_14.Task4.BankAccount;

import java.util.concurrent.atomic.AtomicReference;

public class BankAccountAtomic {
    private record Snapshot(long balanceGr, long version) {}

    private final Long id; //numer konta
    private final AtomicReference<Snapshot> state;

    public BankAccountAtomic(Long id, long initialPln) {
        this.id = id;
        this.state = new AtomicReference<>(new Snapshot(initialPln * 100, 0));
    }

    public void deposit(long amountGr) {
        state.updateAndGet(s -> new Snapshot(s.balanceGr + amountGr, s.version + 1));
    }

    /** Próbuje wypłacić amount. Zwraca true gdy się udało, false gdy brak środków. */
    public boolean tryWithdraw(long amountGr) {
        // Ręczna pętla CAS – chcemy wiedzieć, czy CAS się "udał z odjęciem"
        while (true) {
            Snapshot current = state.get();
            if (current.balanceGr() < amountGr) return false; // brak środków
            Snapshot next = new Snapshot(current.balanceGr() - amountGr, current.version() + 1);
            if (state.compareAndSet(current, next)) return true; // sukces
            // ktoś nas wyprzedził – pętla próbuje ponownie
        }
    }

    public long getBalanceGr() {
        return state.get().balanceGr();
    }

    public Long getId() {
        return id;
    }
    // Uwaga: to ćwiczenie pokazuje, że CAS+walidacja jest trudniejsza
    // niż się wydaje. Dla "if/else" często wolimy synchronized lub Lock.
}