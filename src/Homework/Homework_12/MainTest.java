package Homework.Homework_12;

class MainTest {
    public static void main(String[] args) {
        TwoKeyMap<String, String, Integer> grades = new NestedTwoKeyHashMap<>();
        grades.put("Alice", "Math", 5);
        grades.put("Alice", "CS", 4);
        grades.put("Andrew", "Math", 3);

        testSizeAndIfEmpty(grades);

        testPut(grades);

        testPutNull(grades);

        testGet(grades);

        testRemove(grades);

        testContains(grades);

        testSize(grades);

        TwoKeyMap<String, String, Integer> gradesEmpty = new NestedTwoKeyHashMap<>();
        testIsEmpty(grades, gradesEmpty);

        testEntrySet(grades);

        testKeySet(grades);

        testValues(grades);

        TwoKeyMap<String, String, Integer> gradesOther = new NestedTwoKeyHashMap<>();
        gradesOther.put("Test", "TestSubject", 5);
        gradesOther.put("Test2", "TestSubject2", 4);
        testPutAll(grades, gradesOther);

        TwoKeyMap<String, String, Integer> gradesToClear = new NestedTwoKeyHashMap<>();
        gradesToClear.put("Test", "TestSubject", 5);
        testClear(gradesToClear);

        testRow(grades);

        testColumn(grades);

        iteratorTest(grades);
    }

    private static void iteratorTest(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("iterator test");

        for (TwoKeyMap.Entry<String, String, Integer> record : grades) {
            System.out.println("key1: " + record.getKey1() + ", key2: " + record.getKey2() + ", value: " + record.getValue());
        }
        System.out.println();
    }

    private static void testColumn(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("column test");

        System.out.println("case Math");
        System.out.println(grades.column("Math"));
        System.out.println();
    }

    private static void testRow(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("row test");

        System.out.println("case Andrew");
        System.out.println(grades.row("Andrew"));

        System.out.println("case Alice");
        System.out.println(grades.row("Alice"));
        System.out.println();
    }

    private static void testClear(TwoKeyMap<String, String, Integer> gradesToClear) {
        System.out.println("clear test");

        System.out.println("before: " + gradesToClear);
        gradesToClear.clear();
        System.out.println("after: " + gradesToClear);
        System.out.println();
    }

    private static void testPutAll(TwoKeyMap<String, String, Integer> grades, TwoKeyMap<String, String, Integer> gradesOther) {
        System.out.println("putAll test");

        System.out.println("Grades before method: " + grades);
        System.out.println(".putAll other:");
        grades.putAll(gradesOther);
        System.out.println("Grades after method: " + grades);
        System.out.println();
    }

    private static void testValues(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("values test -> printout by for each");

        grades.values().forEach(System.out::println);
        System.out.println();
    }

    private static void testKeySet(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Key set test -> printout by for each");

        grades.keySet().forEach(System.out::println);
        System.out.println();
    }

    private static void testEntrySet(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Entry set test -> for each e.g.");

        grades.entrySet()
                .forEach(entry
                        -> System.out.println("get key1: " + entry.getKey1() + ", get key2: " + entry.getKey2() + ", get value: " + entry.getValue()));
        System.out.println();
    }

    private static void testIsEmpty(TwoKeyMap<String, String, Integer> grades, TwoKeyMap<String, String, Integer> gradesEmpty) {
        System.out.println("isEmpty test");

        System.out.println("grades is empty (not empty): " + grades.isEmpty());
        System.out.println("gradesEmpty is empty (empty): " + gradesEmpty.isEmpty());
        System.out.println();
    }

    private static void testSize(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Size test");

        System.out.println("Current map:" + grades);

        System.out.println(".size: " + grades.size());
        System.out.println();
    }

    private static void testContains(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Contains test");

        System.out.println();
        System.out.println("Contains keys test");
        System.out.println("grades.containsKeys(\"Alice\", \"Math\"): " + grades.containsKeys("Alice", "Math"));
        System.out.println("grades.containsKeys(\"John\", \"CS\"): " + grades.containsKeys("John", "CS"));
        System.out.println();

        System.out.println("Contains value test");
        System.out.println("grades.containsValue(5): " + grades.containsValue(5));
        System.out.println("grades.containsValue(2): " + grades.containsValue(2));

        System.out.println();
    }

    private static void testRemove(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Remove test");
        System.out.println("Map before changes:");
        System.out.println(grades);
        System.out.println();

        System.out.println("grades.remove(\"Jack\", \"Math\") result: " + grades.remove("Jack", "Math"));
        System.out.println("grades.remove(\"Alice\", \"CS\") result: " + grades.remove("Alice", "CS"));
        System.out.println();

        System.out.println("Map after changes:");
        System.out.println(grades);

        System.out.println("Reverting removed record:");
        grades.put("Alice", "CS", 4);
        System.out.println(grades);
        System.out.println();
    }

    private static void testGet(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Get test");
        System.out.println(grades);

        System.out.println("grades.get(\"Alice\", \"Math\"):");
        System.out.println(grades.get("Alice", "Math"));

        System.out.println("grades.get(\"Andrew\", \"Math\"):");
        System.out.println(grades.get("Andrew", "Math"));

        System.out.println("grades.get(\"Andrew\", \"CS\"):");

        Integer i = grades.get("Andrew", "CS");
        if (i == null) {
            System.out.println(".get -> null");
        } else System.out.println("not null");

        System.out.println();
    }

    private static void testPutNull(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Put null test: ");

        try {
            grades.put(null, "CS", 4);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("System.out.println(grades): " + grades);
        System.out.println();
    }

    private static void testPut(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Put test");

        grades.put("Alice", "Math", 5);
        System.out.println(grades);

        System.out.println("gradesPut (Alice, CS, 4)");
        grades.put("Alice", "CS", 4);
        System.out.println(grades);

        System.out.println("gradesPut (Andrew, Math, 3)");
        grades.put("Andrew", "Math", 3);
        System.out.println(grades);
        System.out.println();
    }

    private static void testSizeAndIfEmpty(TwoKeyMap<String, String, Integer> grades) {
        System.out.println("Test size:");
        System.out.println(".size(): " + grades.size());

        System.out.println("Test .isEmpty: ");
        System.out.println(".isEmpty(): " + grades.isEmpty());
        System.out.println();
    }
}
