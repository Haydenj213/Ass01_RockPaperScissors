import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

               String playerAMove = "";
               String playerBMove = "";
               String trash1 = "";
               String trash2= "";
               String choice = "";
               boolean done1 = false;
               boolean done2 = false;
               boolean done3 = false;
    do {

        do {
            System.out.println("Hello! Welcome to Rock, Scissors! Player A, please type in your move as either R or r (Rock), P or p (Paper), or S or s (Scissors)");
            if (in.hasNextLine()) {
                playerAMove = in.nextLine();
            } else {
                playerAMove = "";
            }

            if (playerAMove.equalsIgnoreCase("R") || playerAMove.equalsIgnoreCase("P") || playerAMove.equalsIgnoreCase("S")) {
                done1 = true;
            } else {
                trash1 = playerAMove;
                System.out.println("\nPlayer A, You input " + trash1 + " as your move");
                System.out.println("Please try selecting a different move.");
            }

        } while (!done1);

        do {
            System.out.println("Player B please type in your move as either R or r (Rock), P or p (Paper), or S or s (Scissors)");
            if (in.hasNextLine()) {
                playerBMove = in.nextLine();
            } else {
                playerBMove = "";
            }

            if (playerBMove.equalsIgnoreCase("R") || playerBMove.equalsIgnoreCase("P") || playerBMove.equalsIgnoreCase("S")) {
                done2 = true;
            } else {
                trash2 = playerBMove;
                System.out.println("\nPlayer B, You input " + trash2 + " as your move");
                System.out.println("Please try selecting a different move.");
            }

        } while (!done2);

        if (playerAMove.equalsIgnoreCase(playerBMove)) {
            System.out.println("The game is a tie!");
        } else if ((playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("S")) ||
            playerAMove.equalsIgnoreCase("P") && playerBMove.equalsIgnoreCase("R") ||
        playerAMove.equalsIgnoreCase("S") && playerBMove.equalsIgnoreCase("P")) {
            System.out.println("Player A Wins.");
        } else {
            System.out.println("Player B Wins.");
            }

        System.out.println("Rock breaks Scissors, \n" +
                            "Paper covers Rock, \n" +
                             "Scissors cuts Paper\n");

        System.out.println("Would you like to play Rock, Paper, Scissors Again? (Y/N)");
            choice = in.nextLine();

        if (choice.equalsIgnoreCase("N")) {
            done3 = true;
            System.out.println("Thank you for playing.");
        } else {
            System.out.println("Let's play again.");
        }

        } while(!done3);
    }
}