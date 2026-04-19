package Homework.Homework_7;

enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    public boolean isActive() {
        switch (this) {
            case DELIVERED, CANCELLED -> {
                return false;
            }
            default ->  {
                return true;
            }
        }
    }
}
