package Homework.Homework_14.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter threads number:");
        int numberOfThreads = sc.nextInt();
        sc.nextLine();

        List<MyThread> threads = new ArrayList<>();

        for (int i = 0; i < (numberOfThreads); i++) {
            threads.add(new MyThread(i + 1));
            threads.get(i).start();
        }

        for (MyThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("All threads stopped working");
    }
}
