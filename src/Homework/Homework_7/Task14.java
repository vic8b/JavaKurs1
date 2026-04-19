package Homework.Homework_7;

class Task14 {
    public static void main(String[] args) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.println("Order status: " + orderStatus + ", isActive: " + orderStatus.isActive());
        }
    }
}
