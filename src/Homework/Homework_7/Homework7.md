# Zadania domowe – Enum jako typ wyliczeniowy

1. **Prosty enum – dni tygodnia**
    - Utwórz `enum DayOfWeek` z wartościami: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
    - W `main` przypisz zmiennej dowolny dzień i wypisz go.

2. **Enum i pętla**
    - Użyj pętli `for-each` do wypisania wszystkich dni tygodnia z `DayOfWeek.values()`.

3. **Porównywanie enum**
    - Utwórz dwie zmienne typu `DayOfWeek`.
    - Porównaj je operatorem `==` i wypisz wynik.

4. **Enum w switch**
    - Wykorzystaj `switch` na `DayOfWeek`, aby wypisać komunikat:  
      `Początek tygodnia`, `Środek tygodnia`, `Weekend`.

5. **Enum z metodą**
    - Dodaj w `DayOfWeek` metodę `isWeekend()`, która zwraca `true` dla SATURDAY i SUNDAY.
    - W `main` sprawdź działanie dla kilku dni.

6. **Enum z polem i konstruktorem**
    - Utwórz `enum Month` z wartościami od JANUARY do DECEMBER.
    - Dodaj pole `days` (int) oraz konstruktor ustawiający liczbę dni w miesiącu (nie uwzględniaj lat przestępnych).
    - Dodaj metodę `getDays()`.
    - Wypisz wszystkie miesiące i ich liczbę dni.

7. **Enum i metoda toString**
    - W `Month` nadpisz metodę `toString()`, aby zwracała napis w formacie:  
      `NAZWA (days: X)`.

8. **Enum – porządkowanie**
    - Wypisz wszystkie wartości `Month` wraz z ich `ordinal()`.
    - Pokaż, jak można porównać kolejność miesięcy metodą `compareTo()`.

9. **Enum z kilkoma polami**
    - Dodaj w `Month` drugie pole: `isHolidaySeason` (boolean).
    - Wypisz wszystkie miesiące wraz z informacją, które są wakacyjne.

10. **Enum w klasie – osoba i dzień wolny**
    - Utwórz klasę `Person` z polami `name` (String) i `dayOff` (DayOfWeek).
    - Dodaj metodę `showDayOff()`.
    - W `main` utwórz kilka osób i wypisz, jaki mają dzień wolny.

11. **Enum w tablicy**
    - Utwórz tablicę przechowującą kilka wartości `Month`.
    - Wypisz je w pętli i sprawdź, ile łącznie mają dni.

12. **Enum – waluta**
    - Utwórz `enum Currency` z wartościami PLN, USD, EUR.
    - Dodaj pole `symbol` (String), np. "zł", "$", "€".
    - Dodaj metodę `getSymbol()`.
    - W `main` wypisz wszystkie waluty i ich symbole.

13. **Enum w kalkulatorze**
    - Utwórz `enum Operation` z wartościami ADD, SUBTRACT, MULTIPLY, DIVIDE.
    - Dodaj metodę `calculate(int a, int b)` wykonującą działanie.
    - W `main` przetestuj wszystkie operacje.

14. **Enum – status zamówienia**
    - Utwórz `enum OrderStatus` z wartościami: NEW, PROCESSING, SHIPPED, DELIVERED, CANCELED.
    - Dodaj metodę `isActive()`, która zwraca `true` dla statusów poza CANCELED i DELIVERED.
    - W `main` przetestuj dla kilku statusów.

15. **Enum i konstruktory przeciążone**
    - Utwórz `enum Planet` z polami `mass` i `radius`.
    - Dodaj konstruktor ustawiający oba pola.
    - Dodaj metodę `getDensity()`, która oblicza gęstość.
    - Wypisz dane wszystkich planet.

16. **Enum jako singleton**
    - Utwórz `enum Logger` z jedną wartością `INSTANCE`.
    - Dodaj metodę `log(String msg)`, która wypisuje komunikat na konsoli.
    - W `main` użyj `Logger.INSTANCE.log("test")`.

17. **Enum i switch – menu**
    - Utwórz `enum MenuOption` z wartościami: START, STOP, EXIT.
    - W `main` obsłuż wybór użytkownika (switch na `MenuOption`).

18. **Enum i tablica obiektów**
    - Utwórz klasę `Product` z polami `name` i `category` (enum `Category`).
    - Enum `Category` powinien mieć wartości: FOOD, ELECTRONICS, CLOTHING.
    - W `main` utwórz tablicę produktów i wypisz ich dane.

19. **Enum z metodą abstrakcyjną**
    - Utwórz `enum Calculation` z wartościami ADD, SUBTRACT, MULTIPLY, DIVIDE.
    - Zdefiniuj w nim metodę abstrakcyjną `calculate(int a, int b)` i zaimplementuj ją w każdej wartości.
    - W `main` wykonaj wszystkie działania.

20. **Enum i equals vs ==**
    - Utwórz dwie zmienne wskazujące na ten sam element `enum`.
    - Porównaj je operatorem `==` oraz metodą `equals()`.
    - Wypisz wyniki, aby pokazać, że w przypadku `enum` działają tak samo.