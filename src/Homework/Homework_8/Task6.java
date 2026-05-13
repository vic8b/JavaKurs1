package Homework.Homework_8;

class Task6 {
    public static void main(String[] args) {
        Integer[] a = {1, null, 3};
        Integer[] b = {1, null, 3};
        Integer[] c = {1, 2, 3};


        boolean sameArrsAB = ArrayUtils.arraysEqual(a, b);
        System.out.println("Same arrays result: " + sameArrsAB);

        boolean sameArrsAC = ArrayUtils.arraysEqual(a, c);
        System.out.println("Different arrays result: " + sameArrsAC);

        String[] a1 = {"x"};
        String[] b1 = {null};

        boolean sameArrsA1B1 = ArrayUtils.arraysEqual(a1, b1);
        System.out.println("X and null arrays result: " + sameArrsA1B1);

        System.out.println("arraysEqual(null, null): " + ArrayUtils.arraysEqual(null, null));
    }
}
