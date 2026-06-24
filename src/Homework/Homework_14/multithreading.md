# Przed rozpoczęciem

Zanim zaczniesz, przeczytaj arykuly!!!!!!

https://www.geeksforgeeks.org/java/java-multithreading-tutorial/
https://www.digitalocean.com/community/tutorials/multithreading-in-java
https://medium.com/@rohitpatil3898/concurrent-collection-in-java-1c97ad28fed2
https://www.baeldung.com/java-synchronized-collections
https://www.baeldung.com/java-executor-service-tutorial
https://www.baeldung.com/java-completablefuture
---

# Zadanie 1 – Prosty licznik wątków (podstawy `Thread` / `Runnable`)

## Opis

Napisz program, który:

* Tworzy **N** wątków (np. **5**).
* Każdy wątek:

    * wypisuje swój numer (np. „Wątek 1”, „Wątek 2”, …),
    * wykonuje pętlę od **1** do **10** i wypisuje kolejne liczby z krótkim opóźnieniem (np. `Thread.sleep(100)`).
* Po uruchomieniu wszystkich wątków, **główny wątek** czeka, aż wszystkie się zakończą, a następnie wypisuje: **„Wszystkie wątki zakończyły działanie.”**

## Wymagania techniczne

* Utwórz własną klasę implementującą `Runnable` lub dziedziczącą po `Thread`.
* Użyj `join()`, żeby poczekać na zakończenie wątków.
* Zadbaj, aby numery wątków się nie myliły (np. przekaż numer w konstruktorze).

### Dodatkowe wyzwanie (opcjonalnie)

* Dodaj wspólną zmienną statyczną (np. licznik uruchomionych wątków) i bez synchronizacji zobacz, jak potrafi się „rozjechać”.
* Potem popraw to przy użyciu `synchronized` lub `AtomicInteger`.

---

# Zadanie 2 – Liczenie sumy tablicy w wielu wątkach (synchronizacja / współdzielone dane)

## Opis

Masz dużą tablicę `int[]` o długości np. **1_000_000**, wypełnioną losowymi wartościami. Napisz program, który:

* Dzieli tablicę na **K** fragmentów (np. **4** lub **8**).
* Każdy fragment jest przetwarzany przez osobny wątek, który:

    * oblicza częściową sumę swojego fragmentu,
    * zapisuje wynik w bezpieczny sposób (np. do wspólnej zmiennej lub osobnej struktury).
* Po zakończeniu wszystkich wątków program:

    * oblicza **całkowitą sumę** na podstawie wyników częściowych,
    * wypisuje sumę i **porównuje** ją z sumą policzoną **jednowątkowo** (w zwykłej pętli) – żeby sprawdzić poprawność.

## Wymagania techniczne

* Wątki mogą zapisywać:

    * do tablicy wyników `long[] partialSums`, gdzie każdy wątek ma swój indeks (wtedy **nie musisz** synchronizować zapisu), **lub**
    * do jednego współdzielonego licznika z użyciem `synchronized` lub `AtomicLong`.
* Główny wątek czeka na wszystkie wątki (`join()`).
* Na końcu porównaj wynik równoległy z wynikiem sekwencyjnym.

### Dodatkowe wyzwania (opcjonalnie)

* Zmierz czas liczenia w wersji: **jednowątkowej**, **wielowątkowej**, i porównaj (dla małych tablic wielowątkowo może być wolniej – ciekawa obserwacja).

---

# Zadanie 3 – `ExecutorService` + silnia albo `2^n` z użyciem `long` / `BigInteger`

## Cel

Poznanie `ExecutorService`, puli wątków, `Callable`, `Future` + pracy na dużych liczbach (`long` / `BigInteger`).

## Opis ogólny

Symulujemy system, który przetwarza zestaw zadań obliczeniowych w tle z użyciem puli wątków.

## Szczegółowy opis

Masz listę liczb całkowitych, np. `List<Integer>` z wartościami od **1** do **20** (lub więcej). Dla każdej liczby **n** tworzysz zadanie (`Callable`), które:

* albo oblicza **silnię** `n!`,
* albo oblicza wartość **`2^n`**,
* śpi losową ilość czasu (np. **100–500 ms**), aby zasymulować różny czas przetwarzania,
* zwraca wynik jako: `long`, jeśli zakres jest mały (np. **max n = 20** dla silni), lub jako `BigInteger`, jeśli chcesz obsłużyć większe **n** bez przepełnienia.

Użyj `ExecutorService` z `Executors.newFixedThreadPool(K)` (np. **4 wątki**), aby:

* dla każdej liczby utworzyć zadanie `Callable<BigInteger>` (albo `Callable<Long>`),
* przekazać je do executora (np. `submit()` lub `invokeAll()`),
* otrzymać listę `Future<BigInteger>` / `Future<Long>`,
* odczytać wyniki metodą `get()`.

## Po zebraniu wszystkich wyników

* wypisz w konsoli pary w stylu: `n -> wynik` (np. `5 -> 120` albo `10 -> 1024`),
* zamknij executor (`shutdown()`).

## Sugestia co do typu

* Jeśli chcesz mieć prościej, ale z ograniczeniami zakresu → użyj `long`.
* Jeśli chcesz mieć poprawnie dla dużych **n** → użyj `BigInteger` (polecane przy silni).

---

# Zadanie 4 – PD-10: Symulacja banku wielowątkowego (`synchronized` + `Lock` + `AtomicReference`)

## Cel

Zbudować realistyczny symulator banku, w którym:

* wiele wątków równolegle wykonuje **wpłaty, wypłaty i przelewy**,
* synchronizacja jest zapewniona różnymi mechanizmami: `synchronized`, `ReentrantLock`, `AtomicReference`,
* przy 1000 losowych transakcji **suma sald wszystkich kont musi być stała** (niezmiennik bankowy),
* w systemie **nie wystąpi deadlock** – mimo blokowania dwóch kont przy przelewie.

## Wymagania funkcjonalne

### 1. Klasa `BankAccount`

* `final Long id` – numer konta,
* `private long balance` w **groszach** (`long`, NIE `double` – zapobiegamy błędom zaokrąglenia!),
* metody `deposit(long amount)` i `withdraw(long amount)` zsynchronizowane przez `synchronized` (na `this`),
* metoda `getBalance()` zsynchronizowana,
* `withdraw` rzuca `InsufficientFundsException` (własny `RuntimeException`) jeśli `amount > balance`.

```java
public class BankAccount {
    private final Long id;
    private long balanceGr; // w groszach

    public BankAccount(Long id, long initialPln) {
        this.id = id;
        this.balanceGr = initialPln * 100;
    }

    public synchronized void deposit(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException();
        balanceGr += amountGr;
    }

    public synchronized void withdraw(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException();
        if (balanceGr < amountGr) throw new InsufficientFundsException(id, balanceGr, amountGr);
        balanceGr -= amountGr;
    }

    public synchronized long getBalanceGr() { return balanceGr; }
    public Long getId() { return id; }
}
```

### 2. Klasa `Bank`

* `ConcurrentHashMap<Long, BankAccount> accounts`,
* metoda `transfer(long fromId, long toId, long amountGr)` – atomowy przelew **bez deadlock-a**:

  Wskazówka antydeadlockowa: **zawsze blokuj konta w porządku rosnącym `id`**.

```java
public void transfer(long fromId, long toId, long amountGr) {
    if (fromId == toId) return;

    BankAccount a = accounts.get(fromId);
    BankAccount b = accounts.get(toId);
    if (a == null || b == null) throw new IllegalArgumentException();

    // Klucz: zawsze blokujemy locki w tej samej kolejności
    BankAccount first  = a.getId() < b.getId() ? a : b;
    BankAccount second = a.getId() < b.getId() ? b : a;

    synchronized (first) {
        synchronized (second) {
            a.withdraw(amountGr);
            b.deposit(amountGr);
        }
    }
}
```

> **Uwaga**: blokujemy obiekty `BankAccount` jako monitory zewnętrzne (`synchronized (first)`), więc wewnętrzne `synchronized` w `deposit`/`withdraw` jest reentrant – nie blokuje siebie samego.

* metoda `totalBalance()` – sumuje wszystkie salda. Aby uniknąć niespójności (gdy ktoś transferuje w trakcie), użyj **`stream` na zsynchronizowanej kopii** lub poczekaj na zakończenie wszystkich operacji.

### 3. Wersja alternatywna – `ReentrantLock`

Dodaj klasę `BankAccountLock` używającą `ReentrantLock` zamiast `synchronized`. Wykorzystaj `tryLock(timeout)` w `transfer`, aby uniknąć deadlock-a niezależnie od kolejności blokowania:

```java
public boolean transfer(long fromId, long toId, long amountGr) throws InterruptedException {
    BankAccountLock from = accounts.get(fromId);
    BankAccountLock to   = accounts.get(toId);

    long deadline = System.currentTimeMillis() + 1000;
    while (System.currentTimeMillis() < deadline) {
        if (from.lock.tryLock(50, TimeUnit.MILLISECONDS)) {
            try {
                if (to.lock.tryLock(50, TimeUnit.MILLISECONDS)) {
                    try {
                        from.withdraw(amountGr);
                        to.deposit(amountGr);
                        return true;
                    } finally { to.lock.unlock(); }
                }
            } finally { from.lock.unlock(); }
        }
        Thread.sleep(1); // backoff
    }
    return false; // deadlock unikamy – po prostu rezygnujemy
}
```

### 4. Wersja z `AtomicReference` – snapshot stanu

Dodaj klasę `BankAccountAtomic`, w której saldo jest przechowywane w niemutowalnym snapshocie:

```java
public class BankAccountAtomic {
    private record Snapshot(long balanceGr, long version) {}
    private final AtomicReference<Snapshot> state;

    public BankAccountAtomic(long initialPln) {
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

    public long balanceGr() { return state.get().balanceGr(); }
    // Uwaga: to ćwiczenie pokazuje, że CAS+walidacja jest trudniejsza
    // niż się wydaje. Dla "if/else" często wolimy synchronized lub Lock.
}
```

Cel: zobaczyć, że **`AtomicReference` z niemutowalnym stanem** jest eleganckie, ale dla operacji warunkowych (typu „wypłać jeśli stać”) **synchronized/Lock** są naturalniejsze.

### 5. Symulacja (main)

* utwórz **10 kont** z saldem startowym **1000 PLN** każde,
* wyślij **1000 losowych przelewów** (od jednego losowego konta do drugiego losowego, kwota 100–500 PLN) przez `CompletableFuture.allOf` z własną pulą wątków (`Executors.newFixedThreadPool(8)`),
* po zakończeniu wszystkich transferów:
    * wypisz salda każdego konta,
    * sprawdź niezmiennik: **suma sald** == `10 * 1000 PLN`. Jeśli się nie zgadza – test **niezdany** (gdzieś jest race).

```java
public static void main(String[] args) {
    Bank bank = new Bank();
    for (long i = 1; i <= 10; i++) bank.openAccount(i, 1000);

    ExecutorService pool = Executors.newFixedThreadPool(8);
    Random rng = new Random(42);

    CompletableFuture<?>[] futures = new CompletableFuture<?>[1000];
    for (int i = 0; i < 1000; i++) {
        long from = 1 + rng.nextInt(10);
        long to;
        do { to = 1 + rng.nextInt(10); } while (to == from);
        long amountGr = (100 + rng.nextInt(401)) * 100L;
        final long fromF = from, toF = to, amountF = amountGr;
        futures[i] = CompletableFuture.runAsync(() -> {
            try { bank.transfer(fromF, toF, amountF); }
            catch (InsufficientFundsException e) { /* OK – niewystarczające środki */ }
        }, pool);
    }

    CompletableFuture.allOf(futures).join();

    long total = bank.totalBalanceGr();
    System.out.println("Suma sald: " + total + " gr (powinno: " + (10 * 1000 * 100L) + ")");
    if (total != 10 * 1000 * 100L) {
        throw new AssertionError("NIEZMIENNIK ZŁAMANY – jest race condition!");
    }

    pool.shutdown();
}
```

### 6. Bonus – dziennik transakcji przez `BlockingQueue`

Dodaj `LinkedBlockingQueue<TransactionLog>` jako dziennik. Osobny wątek-konsument pobiera wpisy i zapisuje do pliku `transactions.log`. Po zakończeniu symulacji wrzuć **poison pill** żeby wątek-konsument zakończył.

## Wymagania techniczne

* Trzy implementacje: `BankSync` (synchronized), `BankLock` (ReentrantLock), `BankAtomic` (AtomicReference).
* Każda implementacja powinna **przejść niezmiennik** sumy sald.
* Użyj `CompletableFuture.allOf` (nie ręcznie `join` na każdym `Thread`).
* Pamiętaj o `shutdown()` puli.

## Pytania kontrolne

1. Dlaczego trzymamy saldo w **groszach** (`long`), a nie w PLN (`double`)?
2. Dlaczego blokujemy konta w `transfer` w **porządku rosnącego `id`**, a nie w kolejności `from`, `to`?
3. Dlaczego `synchronized` na `BankAccount.deposit/withdraw` **nie wystarcza** do bezpiecznego przelewu (musimy zablokować całe `transfer`)?
4. Co stałoby się, gdybyśmy użyli `AtomicLong` jako saldo i prosto `getAndAdd(-amount)` w wypłacie? (Podpowiedź: brak walidacji „czy stać”.)
5. W wersji z `ReentrantLock.tryLock(timeout)` – co dzieje się, gdy nie udało się uzyskać locka? Jak system się zachowuje? Czy to jest deadlock?

## Co ocenia prowadzący

* Niezmiennik sumy sald **zachowany**.
* Brak `deadlock` – test biegnie do końca.
* Wszystkie trzy mechanizmy (`synchronized`, `Lock`, `Atomic`) zaimplementowane.
* Czysty kod: właściwy `try-finally` z `unlock()`, brak `null` w `Optional`, brak `Thread.sleep` magic numbers.

## Git workflow

* branch: `feature/bank-multithreaded`
* commit per mechanizm (`BankSync`, `BankLock`, `BankAtomic`)
* PR → code review (najlepiej w parze) → merge do `main`.
