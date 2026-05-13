package Homework.Homework_8;

class Task1 {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = Pair.of(1, "a");
        Pair<Integer, String> p2 = Pair.of(1, "a");
        Pair<Integer, String> p3 = Pair.of(1, "b");

        // equality, hashcode
        boolean p1P2Comparison = p1.equals(p2);
        boolean p1P3Comparison = p1.equals(p3);
        System.out.println("P1 and P2 comparison: " + p1P2Comparison);
        System.out.println("P1 and P3 comparison: " + p1P3Comparison);

        boolean p1P2HashCode = (p1.hashCode() == p2.hashCode());
        System.out.println("P1 and P2 hashcode comparison: " + p1P2HashCode);

        //null handling
        Pair<Object, String> p = Pair.of(null, "x");

        Object firstMethod = p.first();
        System.out.println("p.first() toString: " + firstMethod);

        String secondMethod = p.second();
        System.out.println("p.second() toString: " + secondMethod);

        //immutability
        Pair<String, String> stringStringPair = Pair.of("A", "B");

        //can't set value or change fields; final fields
    }
}
