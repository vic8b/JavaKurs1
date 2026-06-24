package Homework.Homework_14.Task1;

class MyThread extends Thread {
    private final int threadNumber;

    MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
        setName("Thread " + threadNumber);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started...");

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " counter: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(getName() + " ending...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
