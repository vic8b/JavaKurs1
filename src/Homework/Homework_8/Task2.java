package Homework.Homework_8;

import java.util.Arrays;

class Task2 {
    public static void main(String[] args) {
        String[] a = {"A", "B", "C"};

        //swapping elements
        ArrayUtils.swap(a, 0, 2);

        System.out.println(Arrays.toString(a));

        //validating indexes
        Integer[] nums = {1, 2, 3};
        //IndexOutOfBoundsException: index i out of bounds
//        ArrayUtils.swap(nums, -1, 0);
        //IndexOutOfBoundsException: index j out of bounds
//        ArrayUtils.swap(nums, 0, 3);

        String[] x = {"X", "Y"};
        ArrayUtils.swap(x, 1, 1);
        System.out.println(Arrays.toString(x));
    }
}
