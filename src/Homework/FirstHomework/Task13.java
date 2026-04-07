package Homework.FirstHomework;

import java.util.Arrays;
import java.util.Random;

class Task13 {
    private static final Random RANDOM = new Random();
    private static final String[] MOVES = {"k", "p", "n"};

    static void mainLoop() {
        String playerMove = getUserChoice();
        String computerMove = getRandomComputerChoice();

        printChoices(playerMove, computerMove);
        printWhoWon(playerMove, computerMove);
    }

    private static String getUserChoice() {
        System.out.println("Kamień, papier, nożyce");
        boolean moveIsCorrect = false;
        String playerMove = "";
        while (!moveIsCorrect) {
            System.out.println("Wskaż ruch: " + Arrays.toString(MOVES));
            playerMove = Input.sc.nextLine();
            if (Arrays.asList(MOVES).contains(playerMove)) {
                moveIsCorrect = true;
            } else {
            System.out.println("Niepoprawny ruch");
            }
        }
        return playerMove;
    }

    private static String getRandomComputerChoice() {
        int randNumber = RANDOM.nextInt(MOVES.length);
        return MOVES[randNumber];
    }

    private static void printWhoWon(String playerMove, String computerMove) {
        boolean playerWin = didPlayerWin(playerMove, computerMove);
        if (playerMove.equals(computerMove)) {
            System.out.println("Remis");
        } else if (playerWin) {
            System.out.println("Wygrywa gracz");
        } else {
            System.out.println("Wygrywa komputer");
        }
    }

    private static void printChoices(String playerMove, String computerMove) {
        System.out.println("Gracz wybrał: " + playerMove
                + "\nKomputer wybrał: " + computerMove);
    }

    private static boolean didPlayerWin(String playerMove, String computerMove) {
        return playerMove.equals("k") && computerMove.equals("n")
                || (playerMove.equals("n") && computerMove.equals("p")
                || (playerMove.equals("p") && computerMove.equals("k")));
    }
}
