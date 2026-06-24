package Homework.Homework_14.Task3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many numbers in the list?: ");
        int howManyNumbers = sc.nextInt();
        sc.nextLine();

        List<Integer> numbers = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= howManyNumbers; i++) {
            numbers.add(i);
        }

        List<Future<BigInteger>> futuresList = new ArrayList<>();

        for (Integer taskId : numbers) {
            Callable<BigInteger> task = () -> {
                BigInteger result = factorial(taskId);
                try {
                    Thread.sleep(random.nextInt(100, 400));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                return result;
            };

            Future<BigInteger> factorial = executorService.submit(task);

            futuresList.add(factorial);
        }

        for (int i = 0; i < howManyNumbers; i++) {
            try {
                System.out.println("Factorial of " + numbers.get(i) + " -> " + futuresList.get(i).get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
