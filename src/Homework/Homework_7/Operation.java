package Homework.Homework_7;

enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public int calculate(int a, int b) {
        return switch (this) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> a / b;
        };
    }
}
