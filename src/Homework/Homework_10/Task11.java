package Homework.Homework_10;

class Task11 {
    public static void main(String[] args) {
        StringFormatter upperCaseFormatter = String::toUpperCase;
        StringFormatter prefixFormatter = s -> ">>> " + s;
        StringFormatter reverseFormatter = s -> new StringBuilder(s).reverse().toString();

        String testText = "test text";

        System.out.println("Test text: " + testText);
        System.out.println("upperCaseFormatter: " + applyFormat(testText, upperCaseFormatter));
        System.out.println("prefixFormatter: " + applyFormat(testText, prefixFormatter));
        System.out.println("reverseFormatter: " + applyFormat(testText, reverseFormatter));
    }

    static String applyFormat(String text, StringFormatter formatter) {
        return formatter.format(text);
    }

    @FunctionalInterface
    interface StringFormatter {
        String format(String input);
    }
}
