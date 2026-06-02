package Homework.Homework_13;

import Homework.Homework_13.generator.HoldingGenerator;
import Homework.Homework_13.model.*;
import Homework.Homework_13.model.Currency;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercises {

    private static final List<Holding> holdings = new HoldingGenerator().generate();

    public static void main(String[] args) {
        System.out.println("getHoldingsWhereAreCompanies()");
        System.out.println(getHoldingsWhereAreCompanies());
        System.out.println();

        System.out.println("getHoldingNames()");
        System.out.println(getHoldingNames());
        System.out.println();

        System.out.println("getHoldingNamesAsString()");
        System.out.println(getHoldingNamesAsString());
        System.out.println();

        System.out.println("getCompaniesAmount()");
        System.out.println(getCompaniesAmount());
        System.out.println();

        System.out.println("getAllUserAmount()");
        System.out.println(getAllUserAmount());
        System.out.println();

        System.out.println("getAllCompaniesNamesAsLinkedList()");
        System.out.println(getAllCompaniesNamesAsLinkedList());
        System.out.println();

        System.out.println("getUsersForPredicate(user -> user.getAge() > 17)");
        System.out.println(getUsersForPredicate(user -> user.getAge() > 17));
        System.out.println();

        System.out.println("executeForEachCompany(company -> System.out.println(company.getName()))");
        executeForEachCompany(company -> System.out.println(company.getName()));
        System.out.println();

        System.out.println("getRichestWoman()");
        System.out.println(getRichestWoman().map(richestWoman -> richestWoman.getFirstName() + " " + richestWoman.getLastName()));
        System.out.println();

        System.out.println("getFirstNCompany(2)");
        System.out.println(getFirstNCompany(2));
        System.out.println();

        System.out.println("getHoldingNamesAsString()");
        System.out.println(getHoldingNamesAsString());
        System.out.println();

        System.out.println("getUserPerCompany()");
        System.out.println(getUserPerCompany());
        System.out.println();

        System.out.println("getUser()");
        System.out.println(getUser(user -> user.getAge() > 17).getFirstName());
        try {
            System.out.println(getUser(user -> user.getAge() > 100).getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("user age over 100 test: " + e);
        }

        System.out.println("createAccountsMap()");
        System.out.println(createAccountsMap());
        System.out.println();

        System.out.println("getUserNames()");
        System.out.println(getUserNames());
        System.out.println();

        System.out.println("showAllUser()");
        showAllUser();
        System.out.println();

        System.out.println("getCurenciesSet()");
        System.out.println(getCurenciesSet());
        System.out.println();
    }

    /**
     * Napisz metodę, która zwróci liczbę holdingów, w których jest przynajmniej jedna firma.
     */
    public static long getHoldingsWhereAreCompanies() {
        return holdings.stream()
                .filter(holding -> !holding.getCompanies().isEmpty())
                .count();
    }

    /**
     * Napisz metodę, która zwróci nazwy wszystkich holdingów pisane z wielkiej litery w formie listy.
     */
    public static List<String> getHoldingNames() {
        return holdings.stream()
                .map(holding -> holding.getName().toUpperCase())
                .toList();
    }

    /**
     * Zwraca nazwy wszystkich holdingów sklejone w jeden string i posortowane.
     * String ma postać: (Coca-Cola, Nestle, Pepsico)
     */
    public static String getHoldingNamesAsString() {
        return holdings.stream()
                .sorted(Comparator.comparing(Holding::getName))
                .map(Holding::getName)
                .collect(Collectors.joining(", ", "(", ")"));
    }

    /**
     * Zwraca liczbę firm we wszystkich holdingach.
     */
    public static long getCompaniesAmount() {
        return holdings.stream()
                .mapToLong(holding -> holding.getCompanies().size())
                .sum();
    }

    /**
     * Zwraca liczbę wszystkich pracowników we wszystkich firmach.
     */
    public static long getAllUserAmount() {
        return getCompanyStream()
                .mapToLong(company -> company.getUsers().size())
                .sum();
    }

    /**
     * Zwraca listę wszystkich firm jako listę, której implementacja to LinkedList. Obiektów nie przepisujemy
     * po zakończeniu działania strumienia.
     */
    public static LinkedList<String> getAllCompaniesNamesAsLinkedList() {
        return getCompanyStream()
                .map(Company::getName)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Przelicza kwotę na rachunku na złotówki za pomocą kursu określonego w enum Currency.
     */
    public static BigDecimal getAccountAmountInPLN(Account account) {
        return account
                .getAmount()
                .multiply(BigDecimal.valueOf(account.getCurrency().rate))
                .round(new MathContext(4, RoundingMode.HALF_UP));
    }

    /**
     * Zwraca imiona użytkowników w formie zbioru, którzy spełniają podany warunek.
     */
    public static Set<String> getUsersForPredicate(final Predicate<User> userPredicate) {
        return getUserStream()
                .filter(userPredicate)
                .map(User::getFirstName)
                .collect(Collectors.toSet());
    }

    /**
     * Dla każdej firmy uruchamia przekazaną metodę.
     */
    public static void executeForEachCompany(Consumer<Company> consumer) {
        getCompanyStream()
                .forEach(consumer);
    }

    /**
     * Wyszukuje najbogatsza kobietę i zwraca ją. Metoda musi uzwględniać to że rachunki są w różnych walutach.
     */
    //pomoc w rozwiązaniu problemu w zadaniu: https://stackoverflow.com/a/55052733/9360524
    public static Optional<User> getRichestWoman() {
        return getUserStream()
                .filter(user -> user.getSex() == Sex.WOMAN)
                .max(Comparator.comparing(Exercises::getUserAmountInPLN));
    }

    private static BigDecimal getUserAmountInPLN(final User user) {
        return user.getAccounts().stream()
                .map(Exercises::getAccountAmountInPLN)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Zwraca nazwy pierwszych N firm. Kolejność nie ma znaczenia.
     */
    private static Set<String> getFirstNCompany(final int n) {
        return getCompanyStream()
                .limit(n)
                .map(Company::getName)
                .collect(Collectors.toSet());
    }

    /**
     * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników.
     */
    public static Map<String, List<User>> getUserPerCompany() {
        return getCompanyStream()
                .collect(Collectors.toMap(Company::getName, Company::getUsers));
    }

    /**
     * Zwraca pierwszego z brzegu użytkownika dla podanego warunku. W przypadku kiedy nie znajdzie użytkownika, wyrzuca
     * wyjątek IllegalArgumentException.
     */
    public static User getUser(final Predicate<User> predicate) {
        return getUserStream()
                .filter(predicate)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    /**
     * Zwraca mapę rachunków, gdzie kluczem jest numer rachunku, a wartością ten rachunek.
     */
    public static Map<String, Account> createAccountsMap() {
        return getAccountStream()
                .collect(Collectors.toMap(Account::getNumber, account -> account));
    }

    /**
     * Zwraca listę wszystkich imion w postaci Stringa, gdzie imiona oddzielone są spacją i nie zawierają powtórzeń.
     */
    public static String getUserNames() {
        return getUserStream()
                .map(User::getFirstName)
                .distinct()
                .collect(Collectors.joining(" "));
    }

    /**
     * Metoda wypisuje na ekranie wszystkich użytkowników (imię, nazwisko) posortowanych od z do a.
     * Zosia Psikuta, Zenon Kucowski, Zenek Jawowy ... Alfred Pasibrzuch, Adam Wojcik
     */
    public static void showAllUser() {
        getUserStream()
                .sorted(Comparator.comparing(User::getFirstName).reversed())
                .forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));
    }

    /**
     * Zwraca zbiór walut w jakich są rachunki.
     */
    public static Set<Currency> getCurenciesSet() {
        return getAccountStream()
                .map(Account::getCurrency)
                .collect(Collectors.toSet());
    }

    /**
     * Zwraca strumień wszystkich firm.
     */
    private static Stream<Company> getCompanyStream() {
        return holdings.stream()
                .flatMap(holding -> holding.getCompanies().stream());
    }

    /**
     * Tworzy strumień użytkowników.
     */
    private static Stream<User> getUserStream() {
        return getCompanyStream()
                .flatMap(company -> company.getUsers().stream());
    }

    /**
     * Tworzy strumień rachunków.
     */
    private static Stream<Account> getAccountStream() {
        return getUserStream()
                .flatMap(user -> user.getAccounts().stream());
    }

}
