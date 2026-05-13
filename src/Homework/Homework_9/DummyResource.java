package Homework.Homework_9;

final class DummyResource implements AutoCloseable {
    void work() {
        throw new RuntimeException("primary");
    }

    @Override public void close() {
        throw new RuntimeException("close");
    }
}

final class SuppressedShowcase {
    static void run() {
        try (DummyResource r = new DummyResource()) {
            r.work();
        } catch (RuntimeException e) {
            int counter = 0;

            System.out.println("Exception: " + e);

            for (Throwable suppressed : e.getSuppressed()) {
                counter++;
                System.out.println("Supressed: " + suppressed);
            }

            System.out.println("Supressed counter: " + counter);
        }
    }
}