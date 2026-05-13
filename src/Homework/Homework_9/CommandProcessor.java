package Homework.Homework_9;

final class CommandProcessor {
    static void processCommand(String cmd) {
        if (cmd.equals("ARG")) {
            throw new IllegalArgumentException("bad arg");
        } else if (cmd.equals("STATE")) {
            throw new IllegalStateException("bad state");
        }

        System.out.println("Command: " + cmd);
    }
    static void demo() {
        String[] commands = {"ARG", "STATE", "cmd"};

        for (String command : commands) {
            try {
                System.out.println("Command to process: " + command);
                System.out.println("Result:");
                processCommand(command);
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
