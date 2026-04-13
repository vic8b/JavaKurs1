# Zadania domowe – Metody (parametry, wartości zwracane, rekurencja)

1. **Proste powitanie**
    - Napisz metodę `powitaj(String imie)`, która nie zwraca wartości i wypisuje w konsoli: `Witaj, IMIĘ!`.
    - Wywołaj ją kilka razy z różnymi imionami.

2. **Dodawanie liczb**
    - Napisz metodę `mult(int a, int b)`, która zwraca mnozenie dwóch liczb całkowitych.
    - W `main` wczytaj dwie liczby, wywołaj metodę i wypisz zwrócony wynik.

3. **Porównanie liczb**
    - Napisz metodę `max(int a, int b)`, która zwraca większą liczbę.
    - Wynik przypisz do zmiennej w `main` i wypisz w konsoli.

4. **Parzystość liczby**
    - Napisz metodę `czyParzysta(int liczba)`, która zwraca `true` jeśli liczba jest parzysta.
    - W `main` wczytaj liczbę, wywołaj metodę i w zależności od wyniku wypisz komunikat.

5. **Średnia trzech liczb**
    - Napisz metodę `srednia(double a, double b, double c)`, która zwraca średnią z trzech liczb.
    - W `main` wypisz wynik z dokładnością do dwóch miejsc po przecinku.

6. **Kategoria wiekowa**
    - Napisz metodę `kategoriaWiekowa(int wiek)`, która zwraca napis:  
      `Dziecko` (< 12), `Nastolatek` (12–17), `Dorosły` (18–64), `Senior` (>= 65).
    - Wywołaj metodę w `main` po wczytaniu wieku od użytkownika.

7. **Zasięg zmiennych**
    - W `main` utwórz zmienną `x` z wartością 5.
    - Napisz metodę `zmienX(int x)`, która przypisuje do parametru inną wartość i wypisuje ją w konsoli.
    - Wywołaj metodę i następnie wypisz `x` w `main`, aby pokazać różnicę.

8. **Silnia iteracyjnie**
    - Napisz metodę `silniaIter(int n)`, która zwraca silnię liczby `n` obliczoną w pętli.
    - Wywołaj ją w `main` dla kilku liczb.

9. **Silnia rekurencyjnie**
    - Napisz metodę `silniaRek(int n)`, która zwraca silnię liczby `n` obliczoną rekurencyjnie.
    - Przetestuj działanie i porównaj wyniki z wersją iteracyjną.

10. **Suma elementów tablicy**
    - Napisz metodę `sumaTablicy(int[] tab)`, która zwraca sumę elementów tablicy.
    - W `main` utwórz tablicę, wywołaj metodę i wypisz wynik.

11. **Największy element tablicy**
    - Napisz metodę `maxTablicy(int[] tab)`, która zwraca największą wartość w tablicy.
    - Przetestuj dla różnych danych.

12. **Czy liczba jest pierwsza**
    - Napisz metodę `czyPierwsza(int n)`, która zwraca `true` jeśli liczba jest pierwsza.
    - W `main` wypisz odpowiedni komunikat w zależności od wyniku.

13. **Odwrotna kolejność w tablicy**
    - Napisz metodę `odwrocTablice(int[] tab)`, która zwraca nową tablicę z odwróconą kolejnością elementów.
    - W `main` wypisz tablicę przed i po odwróceniu.

14. **Merge tablicy**
    - Napisz metodę `merge(int[] tab1, int[] tab2)`, która zwraca nową tablicę z elementami obu tablic.
    - W `main` wypisz zmergowana tablicę.

15. **Suma cyfr liczby – iteracyjnie**
    - Napisz metodę `sumaCyfrIter(int n)`, która zwraca sumę cyfr liczby całkowitej dodatniej w pętli.
    - Przetestuj na kilku liczbach.

16. **Suma cyfr liczby – rekurencyjnie**
    - Napisz metodę `sumaCyfrRek(int n)`, która robi to samo co w poprzednim zadaniu, ale używa rekurencji.

17. **NWD dwóch liczb – iteracyjnie**
    - Napisz metodę `nwdIter(int a, int b)`, która zwraca największy wspólny dzielnik dwóch liczb obliczony iteracyjnie.

18. **NWD dwóch liczb – rekurencyjnie**
    - Napisz metodę `nwdRek(int a, int b)`, która zwraca NWD obliczony rekurencyjnie metodą Euklidesa.

19. **Menu kalkulatora**
    - Napisz metodę `menu()` wyświetlającą opcje: `1 – Dodawanie`, `2 – Odejmowanie`, `3 – Mnożenie`, `0 – Wyjście`.
    - Napisz osobne metody dla każdej operacji (`dodaj`, `odejmij`, `pomnoz`).
    - W `main` obsłuż wybór użytkownika w pętli i wykonaj wybraną metodę.