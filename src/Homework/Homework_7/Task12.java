package Homework.Homework_7;

class Task12 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (Currency currency : Currency.values()) {
            sb.append("Currency: ")
                    .append(currency)
                    .append("; symbol: ")
                    .append(currency.getSymbol());

            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
