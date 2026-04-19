package Homework.Homework_7;

class Task6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (Month month : Month.values()) {
            sb.append("Month: ")
                    .append(month)
                    .append("; Days in a month: ")
                    .append(month.getDays());
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
