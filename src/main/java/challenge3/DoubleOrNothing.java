package challenge3;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

    private static int startPoints = 10;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int current = startPoints;
    private boolean isStillPlaying = true;

    public void playGame() {
        printWelcome();
        askUserToContinue();

        while (isStillPlaying) {
            printTryToDouble();

            if (tryDouble()) {
                doubleCurrent();
                printCongrats();
                askUserToContinue();
            } else {
                printLost();
                return;
            }
        }

        printWalkawayMessage();

    }

    private void printWelcome() {
        System.out.println("Let's play Double or Nothing. " + "You have " + startPoints + " points at the beginning of the game.\n");
    }

    protected void askUserToContinue() {
        System.out.println("Would you like to continue playing and try to double your points?\n" + "Enter YES to continue.");
        isStillPlaying = scanner
                .nextLine()
                .toUpperCase()
                .equals("YES");
    }

    protected boolean getIsStillPlaying() {
        return isStillPlaying;
    }

    private void printTryToDouble() {
        System.out.println("Let's try to double it !");
    }

    private boolean tryDouble() {
        return this.random.nextInt(2) == 0;
    }

    private void doubleCurrent() {
        current = current * 2;
    }

    private void printCongrats() {
        System.out.println("Congratulations! you now have " + current + " points.\n");
    }

    private void printLost() {
        System.out.println("You have lost. No points for you.\n");
    }

    private void printWalkawayMessage(){
        System.out.println("Goodbye! you finish with " + current + " points.\n");
    }
}
