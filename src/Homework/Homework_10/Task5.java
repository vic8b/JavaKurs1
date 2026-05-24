package Homework.Homework_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

class Task5 {
    public static void main(String[] args) {
        // list has to be mutable
        List<Integer> nums = new ArrayList<>(List.of(3, -1, 7, -5, 10, 0));

        UnaryOperator<List<Integer>> removeNegatives = list -> {
            list.removeIf(integer -> integer < 0);
            return list;
        };

        BinaryOperator<Integer> maxOp = Integer::max;

        System.out.println("Original list: " + nums);
        removeNegatives.apply(nums);
        System.out.println("List without negatives: " + nums);

        int max = nums.getFirst();
        for (int i = 1; i < nums.size(); i++) {
            max = maxOp.apply(max, nums.get(i));
        }

        System.out.println("Max value from list: " + max);
    }
}
