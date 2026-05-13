# Zadania domowe – Java, typy generyczne

## Zadanie 1) `Pair<T,U>` — podstawy generyków

**Cel:** zaprojektować prostą, niemutowalną parę wartości z pełną semantyką równości.

### Treść

Zaimplementuj klasę:

```java
public final class Pair<T, U> {
  private final T first;
  private final U second;

  private Pair(T first, U second) { /* ... */ }

  public static <T, U> Pair<T, U> of(T first, U second) { /* ... */ }

  public T first() { /* ... */ }
  public U second() { /* ... */ }

  @Override public boolean equals(Object o) { /* zgodne z kontraktem */ }
  @Override public int hashCode() { /* zgodne z equals */ }
  @Override public String toString() { /* np. "Pair[first=..., second=...]" */ }
}
```

### Wymagania i wskazówki

* Klasa **niemutowalna**: tylko pola `final`, brak setterów.
* `equals` porównuje pary element-po-elemencie; poprawnie obsługuje `null`.
* `hashCode` spójny z `equals`.
* `toString` czytelne (format dowolny, ale stabilny).

### Przypadki do przetestowania
1. **Równość i hashCode**

    * *Dane:* `p1 = Pair.of(1, "a")`, `p2 = Pair.of(1, "a")`, `p3 = Pair.of(1, "b")`.
    * *Czynność:* porównaj `p1` z `p2` i `p3`; porównaj `p1.hashCode()` z `p2.hashCode()`.
    * *Oczekiwany wynik:* `p1.equals(p2)` → `true`, `p1.equals(p3)` → `false`, hashCode `p1 == p2`.
2. **Obsługa `null`**

    * *Dane:* `p = Pair.of(null, "x")`.
    * *Czynność:* sprawdź `p.first()` oraz reprezentację tekstową.
    * *Oczekiwany wynik:* `p.first()` → `null`; `toString()` zawiera `x` i nie zgłasza wyjątków.
3. **Niemutowalność**

    * *Dane:* utwórz `Pair.of("A", "B")`.
    * *Czynność:* spróbuj znaleźć settery / zmienić pola.
    * *Oczekiwany wynik:* brak setterów; pola `final` – wartości niezmienne.

---

## Zadanie 2) `swap` dla tablic

**Cel:** metoda generyczna operująca na tablicy dowolnego typu referencyjnego.

### Treść

Zaimplementuj:

```java
public final class ArrayUtils {
  private ArrayUtils() {}
  public static <T> void swap(T[] arr, int i, int j) {
    // walidacja indeksów i podmiana
  }
}
```

### Wymagania i wskazówki

* `arr` nie może być `null` (jeśli jest — `NullPointerException`).
* Indeksy spoza zakresu: rzuć `IndexOutOfBoundsException`.
* Jeżeli `i == j` — brak zmian (no-op).
* Działa dla `String[]`, `Integer[]`, własnych typów referencyjnych.

### Przypadki do przetestowania
1. **Przestawienie elementów**

    * *Dane:* `a = ["A", "B", "C"]`, wywołaj `swap(a, 0, 2)`.
    * *Oczekiwany wynik:* `a` staje się `["C", "B", "A"]`.
2. **Walidacja indeksów**

    * *Dane:* `nums = [1,2,3]`, wywołaj `swap(nums, -1, 0)` oraz `swap(nums, 0, 3)`.
    * *Oczekiwany wynik:* zgłoszony `IndexOutOfBoundsException` w obu przypadkach.
3. **No-op**

    * *Dane:* `x = ["X", "Y"]`, wywołaj `swap(x, 1, 1)`.
    * *Oczekiwany wynik:* tablica bez zmian – `["X", "Y"]`.

---

## Zadanie 3) `Stats<T extends Number>` na tablicy

**Cel:** ograniczenia typu (`extends Number`) i proste obliczenia numeryczne.

### Treść

Zaimplementuj klasę opisującą statystyki dla tablicy `T[]`:

```java
public final class Stats<T extends Number> {
  private final T[] data;
  public Stats(T[] data) { /* przechowaj referencję lub kopię */ }
  public double mean() { /* średnia arytmetyczna */ }
  public double variance() { /* wariancja populacyjna */ }
  public boolean hasSameMean(Stats<?> other, double eps) { /* |m1-m2| <= eps */ }
}
```

### Wymagania i wskazówki

* Pusta tablica → `IllegalArgumentException` w `mean()`/`variance()` lub już w konstruktorze (wybierz i udokumentuj).
* Do obliczeń używaj `doubleValue()`.
* **Wariant:** stosujemy **wariancję populacyjną**: $Var(X) = \frac{1}{n}\sum (x_i - \bar{x})^2$.

### Przypadki do przetestowania
1. **Średnia i wariancja (Integer)**

    * *Dane:* `a = [1, 2, 3, 4]`.
    * *Oczekiwany wynik:* `mean()` = `2.5`; `variance()` = `1.25` (wariancja populacyjna).
2. **Porównanie średnich z tolerancją**

    * *Dane:* `x = [2.0, 2.0]`, `y = [2.001, 1.999]`, `eps = 0.01`.
    * *Oczekiwany wynik:* `hasSameMean(x, y, eps)` → `true`.
3. **Pusta tablica**

    * *Dane:* `[]`.
    * *Oczekiwany wynik:* jasno zdefiniowany wyjątek (`IllegalArgumentException`) z opisem.

---

## Zadanie 4) `minMax(T[] arr)` bez kolekcji

**Cel:** praca z `Comparable` i typową sygnaturą ograniczenia.

### Treść

Zaimplementuj funkcję:

```java
public final class MinMax {
  private MinMax() {}
  public static <T extends Comparable<? super T>> Pair<T,T> minMax(T[] arr) {
    // zwróć parę (min, max); pusta tablica → IllegalArgumentException
  }
}
```

### Wymagania i wskazówki

* Tablica nie może być `null` ani pusta.
* Elementy nie mogą być `null` (udokumentuj i ewentualnie waliduj).
* Złożoność: O(n). Jedno przejście tablicy.

### Przypadki do przetestowania
1. **Ciąg znaków (porządek naturalny)**

    * *Dane:* `s = ["aa", "b", "ccc"]`.
    * *Oczekiwany wynik:* `minMax(s)` → `(min="b", max="ccc")`.
2. **Liczby całkowite**

    * *Dane:* `a = [5, 5, -1, 10, 10]`.
    * *Oczekiwany wynik:* `(min=-1, max=10)`.
3. **Pojedynczy element**

    * *Dane:* `x = [42]`.
    * *Oczekiwany wynik:* `(min=42, max=42)`.
4. **Elementy `null` (jeśli zabronione)**

    * *Dane:* `arr = [1, null, 2]`.
    * *Oczekiwany wynik:* zgłoszony wyjątek z jasnym komunikatem.

---

## Zadanie 5) `indexOf` / `lastIndexOf` z obsługą `null`

**Cel:** liniowe wyszukiwanie z uwzględnieniem `null`.

### Treść

Dodaj do `ArrayUtils`:

```java
public static <T> int indexOf(T[] arr, T value) {
  // pierwszy indeks wystąpienia; brak → -1
}
public static <T> int lastIndexOf(T[] arr, T value) {
  // ostatni indeks wystąpienia; brak → -1
}
```

### Wymagania i wskazówki

* Jeśli `value == null`, porównuj przez `arr[i] == null`.
* Jeśli `value != null`, porównuj `value.equals(arr[i])`.
* `arr == null` → `NullPointerException` (udokumentuj).

### Przypadki do przetestowania
1. **Wystąpienia z `null` i duplikatami**

    * *Dane:* `s = [null, "a", null, "b", "a"]`.
    * *Oczekiwany wynik:* `indexOf(null)` → `0`; `lastIndexOf(null)` → `2`; `indexOf("a")` → `1`; `lastIndexOf("a")` → `4`.
2. **Brak elementu**

    * *Dane:* `s = ["x", "y"]`.
    * *Oczekiwany wynik:* `indexOf("zzz")` → `-1`.

---

## Zadanie 6) `arraysEqual(T[] a, T[] b)` (płytkie)

**Cel:** napisać odpowiednik `Arrays.equals` dla tablic referencyjnych.

### Treść

W `ArrayUtils` zaimplementuj:

```java
public static <T> boolean arraysEqual(T[] a, T[] b) {
  // true jeśli: ten sam rozmiar i każdy element pary a[i] oraz b[i] jest równy (== dla null, equals dla nie-null)
}
```

### Wymagania i wskazówki

* Obie mogą być `null`: wtedy **tylko** `a == null && b == null` → `true`.
* Jeśli długości różne → `false`.
* Porównuj element po elemencie; obsłuż `null`.

### Przypadki do przetestowania
1. **Równe tablice z `null`**

    * *Dane:* `a = [1, null, 3]`, `b = [1, null, 3]`.
    * *Oczekiwany wynik:* `true`.
2. **Różne tablice**

    * *Dane:* `a = [1, null, 3]`, `c = [1, 2, 3]`.
    * *Oczekiwany wynik:* `false`.
3. **Obsługa `null` wejściowego**

    * *Dane:* `a = ["x"]`, `b = null`.
    * *Oczekiwany wynik:* `false`; natomiast `arraysEqual(null, null)` → `true`.

---

## Zadanie 6) `Triple<T,U,V>` — trójka wartości

**Cel:** rozszerzyć koncepcję pary do trzech wartości; utrwalić `equals/hashCode` dla wielu pól.

### Treść

Zaimplementuj klasę:

```java
public final class Triple<T, U, V> {
  private final T first;  private final U second;  private final V third;
  private Triple(T first, U second, V third) { /* ... */ }
  public static <T,U,V> Triple<T,U,V> of(T first, U second, V third) { /* ... */ }

  public T first() { /* ... */ }
  public U second() { /* ... */ }
  public V third() { /* ... */ }

  @Override public boolean equals(Object o) { /* porównanie 3 pól */ }
  @Override public int hashCode() { /* spójny z equals */ }
  @Override public String toString() { /* np. "Triple[first=..., second=..., third=...]" */ }
}
```

### Wymagania i wskazówki

* Klasa niemutowalna.
* `equals` i `hashCode` uwzględniają wszystkie trzy pola; poprawna obsługa `null`.

### Przypadki do przetestowania
1. **Równość**

    * *Dane:* `t1 = Triple.of("id", 42, true)`, `t2 = Triple.of("id", 42, true)`, `t3 = Triple.of("id", 43, true)`.
    * *Oczekiwany wynik:* `t1.equals(t2)` → `true`; `t1.equals(t3)` → `false`.
2. **Akcesory**

    * *Dane:* `t = Triple.of("id", 42, true)`.
    * *Oczekiwany wynik:* `t.first()` → `"id"`; `t.second()` → `42`; `t.third()` → `true`.
3. **`toString`**

    * *Dane:* `t = Triple.of("A", "B", "C")`.
    * *Oczekiwany wynik:* Czytelny napis zawierający trzy wartości (format dowolny, ale stabilny).

---