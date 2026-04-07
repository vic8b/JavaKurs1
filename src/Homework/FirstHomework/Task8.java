package Homework.FirstHomework;

class Task8 {
    private static final String FOOD = "żywność";
    private static final String BOOKS = "książki";
    private static final String SERVICES = "usługi";
    private static final String CLOTHES = "ubrania";
    private static final String ELECTRONICS = "elektronika";
    private static final String OTHERS = "inne";

    static void mainLoop() {
        System.out.println("VAT dla danej kategorii");
        System.out.println("Podaj kategorię produktu: (" + FOOD + ", " + BOOKS + ", " + SERVICES + ", " + CLOTHES
                + ", " + ELECTRONICS + ", " + OTHERS + ")");
        String category = Input.sc.nextLine();
        vatForCategory(category);
    }

    private static void vatForCategory(String category) {
        String categoryVat = switch (category) {
            case FOOD -> "5%";
            case BOOKS -> "8%";
            case SERVICES -> "23%";
            case CLOTHES -> "23%";
            case ELECTRONICS -> "23%";
            case OTHERS -> "8%";
            default -> "brak kategorii";
        };
        System.out.println(categoryVat);
    }
}
