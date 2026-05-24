package Homework.Homework_11;

import java.util.List;
import java.util.Optional;

class Task9 {
    public static void main(String[] args) {
        List<Optional<Integer>> oceny = List.of(
                Optional.of(5), Optional.of(3), Optional.empty(),
                Optional.of(4), Optional.of(2), Optional.of(5)
        );

        for (Optional<Integer> grade : oceny) {
            System.out.println(describeGrade(grade));
        }
    }

    static String describeGrade(Optional<Integer> grade) {
        return grade.filter(g -> g >= 4)
                .map(g -> "Good grade: " + g)
                .orElse("Grade skipped");
    }
}
