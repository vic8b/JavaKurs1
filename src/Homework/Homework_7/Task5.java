package Homework.Homework_7;

class Task5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            sb.append("Day: ")
                    .append(dayOfWeek)
                    .append("; isWeekend() result: ")
                    .append(DayOfWeek.isWeekend(dayOfWeek));
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
