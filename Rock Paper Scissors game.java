import java.util.*;
import java.util.Random;

class rps {
            // ROCK, PAPER, SCISSORS GAME!
    public static void main(String[] args) {
        Random sc1 = new Random(); // Create Random object for computer choice
        String value[] = {"rock", "paper", "scissors"}; // Possible choices
        String mychoice;
        String Computerchoice = "";
        String play = "no";

        System.out.println("***********************************************");
        System.out.println("WELCOME TO ROCK, PAPER, SCISSORS GAME! LET'S PLAY!");
        System.out.println("***********************************************");

        do {
            Scanner sc = new Scanner(System.in); // Scanner to take user input

            System.out.print("Enter your choice from rock, paper, scissors: ");
            mychoice = sc.nextLine().toLowerCase(); // Take input and convert to lowercase

            // Validate user input
            if ((!mychoice.equalsIgnoreCase("rock")) &&
                (!mychoice.equalsIgnoreCase("paper")) &&
                (!mychoice.equalsIgnoreCase("scissors"))) {
                System.out.println("INVALID CHOICE");
                continue; // Ask again if input is invalid
            }

            Computerchoice = value[sc1.nextInt(0, 3)]; // Randomly pick computer's choice
            System.out.println("Computer's Choice: " + Computerchoice);

            // Check if it's a tie
            if (mychoice.equals(Computerchoice)) {
                System.out.println("It's a tie");
            }
            // Check if the user wins
            else if ((mychoice.equals("rock") && (Computerchoice.equals("scissor"))) ||
                     (mychoice.equals("paper") && (Computerchoice.equals("rock"))) ||
                     (mychoice.equals("scissor") && (Computerchoice.equals("paper")))) {
                System.out.println("You Win!");
            }
            // Otherwise, the user loses
            else {
                System.out.println("You lose!");
            }

            System.out.print("PLAY AGAIN (yes/no): ");
            play = sc.nextLine().toLowerCase(); // Ask user if they want to play again

        } while (play.equals("yes")); // Continue the loop if user enters "yes"

        System.out.println("THANKS FOR PLAYING!");
    }
}
