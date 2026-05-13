package Homework.Homework_8;

class Task5 {
    public static void main(String[] args) {
        System.out.println("first task");
        String[] s = {null, "a", null, "b", "a"};

        int test1 = ArrayUtils.indexOf(s, null);
        System.out.println("index of null: " + test1);

        int test2 = ArrayUtils.lastIndexOf(s, null);
        System.out.println("last index of null: " + test2);

        int test3 = ArrayUtils.indexOf(s, "a");
        System.out.println("index of \"a\": " + test3);

        int test4 = ArrayUtils.lastIndexOf(s, "a");
        System.out.println("last index of \"a\": " + test4);

        System.out.println();
        System.out.println("second task");
        String[] s2 = {"x", "y"};

        int notFoundTest = ArrayUtils.indexOf(s2, "zzz");
        System.out.println("index of element not in arr: " + notFoundTest);
    }
}
