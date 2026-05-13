# Zadanie domowe – Lekcja 12: Wyjątki w Javie


## Zadanie 1: Walidator hasła (unchecked)

**Treść:** Napisz klasę `PasswordValidator` z metodą statyczną `validate(String pwd)`, która:

* rzuca `IllegalArgumentException`, gdy `pwd == null` lub długość `< 8`,
* rzuca `IllegalArgumentException`, gdy brak co najmniej jednej cyfry,
* w komunikacie podaje powód (np. `length<8`, `no digit`).

**Szkielet:**

```java
public final class PasswordValidator {
    private PasswordValidator() {}

    public static void validate(String pwd) {
        // TODO: walidacja wg opisu; rzucaj IllegalArgumentException z jasnym komunikatem
    }
}
```

---

## Zadanie 2: Parser liczby dodatniej (chaining, unchecked)

**Treść:** Napisz `NumberParser.parsePositiveInt(String s)`:

* użyj `Integer.parseInt(s)`,
* jeśli `NumberFormatException` → rzuć własny **unchecked** z komunikatem `Invalid number: '<s>'` i **ustaw cause**,
* jeśli liczba ≤ 0 → rzuć `IllegalArgumentException("non-positive: " + value)`.

**Szkielet:**

```java
class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String msg, Throwable cause) { super(msg, cause); }
}

final class NumberParser {
    static int parsePositiveInt(String s) {
        // TODO: parsowanie, obsługa NFE -> wrap w InvalidNumberException z cause
        return 0;
    }
}
```

---

## Zadanie 3: Konto i wyjątek checked (`throws`)

**Treść:** Zaprojektuj prostą klasę `BankAccount`:

* Pole `balance` (int, grosze lub jednostki – jak wolisz).
* Metoda `withdraw(int amount) throws InsufficientFundsException` – gdy `amount > balance`, rzuć **checked** `InsufficientFundsException` z kontekstem (`balance`, `amount`).
* W metodzie demonstracyjnej (`main`) obsłuż wyjątek w `catch` i dodaj blok `finally` wypisujący np. `Koniec transakcji`.

**Szkielet:**

```java
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) { super(msg); }
}

final class BankAccount {
    private int balance;
    public BankAccount(int initial) { this.balance = initial; }

    public void withdraw(int amount) throws InsufficientFundsException {
        // TODO: gdy amount > balance -> throw new InsufficientFundsException(...)
        // w p.p. zmniejsz balance
    }
}
```

---

## Zadanie 4: Try‑with‑resources + suppressed (bez I/O)

**Treść:** Utwórz sztuczny zasób `DummyResource` implementujący `AutoCloseable`:

* `work()` rzuca `RuntimeException("primary")`,
* `close()` rzuca `RuntimeException("close")`.

W klasie `SuppressedShowcase.run()` użyj TWR:

* złap wyjątek i wypisz jego treść oraz elementy `e.getSuppressed()` (powinien być dokładnie 1: „close”).

**Szkielet:**

```java
final class DummyResource implements AutoCloseable {
    void work() { /* TODO: throw new RuntimeException("primary"); */ }
    @Override public void close() { /* TODO: throw new RuntimeException("close"); */ }
}

final class SuppressedShowcase {
    static void run() {
        try (DummyResource r = new DummyResource()) {
            r.work();
        } catch (RuntimeException e) {
            // TODO: wypisz e oraz e.getSuppressed()
        }
    }
}
```

---

## Zadanie 5: Multi‑catch i decyzja o reakcji

**Cel:** Umiejętność łączenia pokrewnych wyjątków.

**Treść:** Napisz metodę `processCommand(String cmd)`:

* dla `"ARG"` rzuć `IllegalArgumentException("bad arg")`,
* dla `"STATE"` rzuć `IllegalStateException("bad state")`,
* w metodzie `demo()` wywołuj `processCommand` z różnymi wartościami i użyj **multi‑catch**:
  `catch (IllegalArgumentException | IllegalStateException e) { /* wspólna reakcja */ }`.

**Szkielet:**

```java
final class CommandProcessor {
    static void processCommand(String cmd) {
        // TODO: warunki i rzucanie wyjątków
    }
    static void demo() {
        // TODO: wywołania + multi-catch
    }
}
```