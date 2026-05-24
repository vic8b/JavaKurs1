# Zadanie domowe – Klasa `Optional`

## Część A – Tworzenie i sprawdzanie (rozgrzewka)

### Zadanie 1 – Trzy sposoby tworzenia Optional

Napisz program, w którym:

1. Tworzysz **trzy** zmienne typu `Optional<String>` — każdą innym sposobem: `of`, `ofNullable`, `empty`.
2. Dla każdej wypisz wynik `isPresent()` i `isEmpty()` w formacie:
   ```
   opt1: present=true, empty=false
   ```
3. Spróbuj wywołać `Optional.of(null)` — co się stanie? Zapisz odpowiedź w komentarzu.
4. Czym różni się `Optional.of(null)` od `Optional.ofNullable(null)`?

---

### Zadanie 2 – Metoda zwracająca `Optional`

Napisz metodę:

```java
static Optional<String> findCityByCode(String code)
```

Metoda ma obsługiwać kody: `"WA"` → Warszawa, `"KR"` → Kraków, `"GD"` → Gdańsk. Dla nieznanych kodów — pusty Optional.

W `main` wywołaj tę metodę z kodami `"WA"`, `"PO"` i `"GD"`. Dla każdego wyniku wypisz, czy miasto zostało znalezione, a jeśli tak — jakie.

> Nie używaj `get()` bez sprawdzenia. Zastanów się, dlaczego `get()` na pustym Optional to zły pomysł.

---

## Część B – Wyciąganie wartości

### Zadanie 3 – Domyślna wartość (`orElse`)

Wykorzystaj metodę `findCityByCode` z zadania 2.

Napisz metodę:

```java
static String getCityOrDefault(String code)
```

która zwraca nazwę miasta dla danego kodu, a jeśli kod jest nieznany — zwraca `"Nieznane miasto"`. Użyj `orElse`.

Przetestuj dla kodów: `"WA"`, `"XX"`, `null` (uwaga na `null` — co się stanie?).

---

### Zadanie 4 – `orElse` vs `orElseGet` — różnica

Napisz **metodę pomocniczą**, która symuluje kosztowną operację:

```java
static String generateDefault() {
    System.out.println("  >> Generuję wartość domyślną...");
    return "DOMYŚLNA";
}
```

Twoim zadaniem jest udowodnić, że:
* `orElse(generateDefault())` — wywołuje `generateDefault()` **zawsze**, nawet gdy Optional ma wartość,
* `orElseGet(() -> generateDefault())` — wywołuje `generateDefault()` **tylko** gdy Optional jest pusty.

Napisz program, który to demonstruje — utwórz jeden pełny i jeden pusty Optional, wywołaj na nich obie metody, i przeanalizuj output. Zapisz wniosek w komentarzu: kiedy używać `orElse`, a kiedy `orElseGet`?

---

### Zadanie 5 – Wymagana konfiguracja (`orElseThrow`)

Napisz klasę `AppConfig` z metodą:

```java
static String getRequired(String key)
```

Wewnątrz metody masz mapę konfiguracji:

```java
Map<String, String> config = Map.of(
    "db.url", "jdbc:mysql://localhost:3306/app",
    "db.user", "admin"
);
```

Metoda ma:
* pobrać wartość z mapy dla danego klucza,
* jeśli klucz nie istnieje — rzucić `IllegalArgumentException` z komunikatem zawierającym nazwę brakującego klucza.

Użyj `Optional.ofNullable` + `orElseThrow`.

Przetestuj: `getRequired("db.url")` (sukces) i `getRequired("db.password")` (wyjątek — obsłuż go w `try-catch`).

---

### Zadanie 6 – Reagowanie na wartość (`ifPresent`, `ifPresentOrElse`)

Masz tablicę nicków (część to `null`):

```java
String[] nicki = {"Janek", null, "Ania", null, "Kuba"};
```

Napisz program, który przechodzi po tablicy i:

1. **Wersja A** — użyj `ifPresent`, aby wypisać tylko znalezione nicki w formacie `Znaleziono: <nick>`.
2. **Wersja B** — zamień na `ifPresentOrElse`, aby dodatkowo wypisywać `Brak nicka` dla wartości `null`.

Oczekiwany output wersji B:
```
Znaleziono: Janek
Brak nicka
Znaleziono: Ania
Brak nicka
Znaleziono: Kuba
```

> Podpowiedź: `ifPresentOrElse` przyjmuje dwa argumenty — `Consumer<T>` i `Runnable`.

---

## Część C – Transformacje i filtrowanie

### Zadanie 7 – Transformacja z `map`

Napisz metodę:

```java
static Optional<String> extractLogin(Optional<String> email)
```

Metoda ma:
* wyciągnąć z adresu email część przed `@` (login),
* zamienić login na wielkie litery,
* jeśli Optional jest pusty — zwrócić pusty Optional.

Użyj **dwóch** wywołań `map` (łańcuchowo).

Przetestuj:
* `extractLogin(Optional.of("jan.kowalski@example.com"))` → `Optional[JAN.KOWALSKI]`
* `extractLogin(Optional.empty())` → `Optional.empty`

---

### Zadanie 8 – `flatMap` — spłaszczanie Optional - nieobowiazkowe

Masz klasę:

```java
class User {
    private String name;
    private String email; // może być null

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
```

Utwórz trzech użytkowników:
* `"Ala"` z emailem `"ala@mail.com"`,
* `"Bob"` bez emaila (`null`),
* trzeci — jako `Optional.empty()` (brak użytkownika).

Napisz metodę:

```java
static String getUserEmail(Optional<User> user)
```

która zwraca email użytkownika lub `"brak emaila"`.

**Wymaganie:** użyj `flatMap` (nie `map`). Zastanów się: dlaczego `map` dałoby tutaj `Optional<Optional<String>>` zamiast `Optional<String>`?

---

### Zadanie 9 – Filtrowanie z `filter`

Napisz metodę:

```java
static String describeGrade(Optional<Integer> grade)
```

Metoda ma:
* zachować ocenę **tylko jeśli >= 4** (użyj `filter`),
* zamienić ją na tekst `"Dobra ocena: <X>"` (użyj `map`),
* jeśli ocena nie przeszła filtra lub Optional był pusty — zwrócić `"Pominięto"`.

Przetestuj na liście:

```java
List<Optional<Integer>> oceny = List.of(
    Optional.of(5), Optional.of(3), Optional.empty(),
    Optional.of(4), Optional.of(2), Optional.of(5)
);
```

Oczekiwany output:
```
Dobra ocena: 5
Pominięto
Pominięto
Dobra ocena: 4
Pominięto
Dobra ocena: 5
```

---

### Zadanie 10 – Łańcuch alternatyw (`or`)

Masz trzy metody symulujące źródła danych. Każde źródło „zna" inny klucz:

```java
static Optional<String> findInCache(String key) {
    // zwraca wartość tylko dla klucza "A"
}

static Optional<String> findInDatabase(String key) {
    // zwraca wartość tylko dla klucza "B"
}

static Optional<String> findDefault(String key) {
    // zawsze zwraca wartość domyślną
}
```

Każda metoda powinna wypisać na konsolę, że została wywołana (np. `"Szukam w cache..."`).

Napisz metodę:

```java
static String findValue(String key)
```

która łączy te trzy źródła metodą `or` — najpierw szuka w cache, potem w bazie, na końcu bierze wartość domyślną.

Przetestuj dla kluczy `"A"`, `"B"`, `"C"` i przeanalizuj: **które metody się wykonały w każdym przypadku?** Dlaczego `or` jest leniwe?

> `or` (Java 9+) przyjmuje `Supplier<Optional<T>>`.

---

## Część D – Zadanie praktyczne

### Zadanie 11 – Mini-repozytorium użytkowników

Połącz wszystkie poznane metody w jednym programie.

**Dane wejściowe:**

```java
class User {
    private int id;
    private String name;
    private int age;
    // konstruktor, gettery, toString — napisz sam
}
```

```java
class UserRepository {
    private final List<User> users = List.of(
        new User(1, "Anna", 25),
        new User(2, "Bartek", 17),
        new User(3, "Celina", 30),
        new User(4, "Dawid", 15)
    );

    Optional<User> findById(int id) {
        // TODO: wyszukaj użytkownika po id
        // zwróć Optional.of(user) lub Optional.empty()
    }
}
```

**Twoje zadanie:**

Napisz metodę:

```java
static String getAdultNameById(UserRepository repo, int id)
```

która w **jednym łańcuchu Optional** (bez `if`-ów!):

1. Znajduje użytkownika po `id`,
2. **Filtruje** — zostawia tylko pełnoletnich (age >= 18),
3. **Mapuje** — wyciąga imię i zamienia na wielkie litery,
4. **Rzuca wyjątek**, jeśli nie znaleziono pełnoletniego użytkownika.

Przetestuj w `main` dla:
* `id = 1` → oczekiwany wynik: `ANNA`
* `id = 3` → oczekiwany wynik: `CELINA`
* `id = 2` → wyjątek (Bartek ma 17 lat)
* `id = 99` → wyjątek (użytkownik nie istnieje)

Obsłuż wyjątki w `try-catch` i wypisz komunikaty błędów.

> Podpowiedź: cały łańcuch to `findById` → `filter` → `map` → `orElseThrow`.
