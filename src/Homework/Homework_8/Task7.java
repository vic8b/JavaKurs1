package Homework.Homework_8;

class Task7 {
    public static void main(String[] args) {
        Triple<String, Integer, Boolean> t1 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t2 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t3 = Triple.of("id", 43, true);

        System.out.println("t1 equals t2: " + t1.equals(t2));
        System.out.println("t1 equals t3: " + t1.equals(t3));

        Triple<String, Integer, Boolean> t = Triple.of("id", 42, true);
        System.out.println("t first: " + t.first());
        System.out.println("t second: " + t.second());
        System.out.println("t third: " + t.third());

        System.out.println("toString: " + t);
    }
}
