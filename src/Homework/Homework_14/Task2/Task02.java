package Homework.Homework_14.Task2;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

class Task02 {
    public static void main(String[] args) {
        int[] numbers = new int[1_000_000];

        AtomicLong atomicCounter = new AtomicLong(0);

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for how many fragments tab should be divided to: ");
        int k = sc.nextInt();
        sc.nextLine();

        Thread[] threads = new Thread[k];
        int fragmentSize = numbers.length / k;

        long parallelStart = System.nanoTime();

        for (int i = 0; i < k; i++) {
            int start = i * fragmentSize;
            int end;

            if (i == k - 1) {
                end = numbers.length;
            } else {
                end = start + fragmentSize;
            }

            threads[i] = new Thread(() -> {
                long localSum = 0;

                for (int j = start; j < end; j++) {
                    localSum += numbers[j];
                }

                atomicCounter.addAndGet(localSum);
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long elapsedParallelTime = System.nanoTime() - parallelStart;

        long singleCounter = 0;
        long singleStart = System.nanoTime();

        for (int number : numbers) {
            singleCounter += number;
        }

        long elapsedSingleTime = System.nanoTime() - singleStart;

        System.out.println("Parallel sum: " + atomicCounter.get());
        System.out.println("Parallel operations elapsed time: " + (elapsedParallelTime / 1_000_000) + " ms");
        System.out.println("Single thread sum: " + singleCounter);
        System.out.println("Single operations elapsed time: " + (elapsedSingleTime / 1_000_000) + " ms");
    }
}
