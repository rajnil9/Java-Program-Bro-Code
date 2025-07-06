import java.util.*;
import java.util.Random;

class Slot {

   // SLOT MACHINE GAME 
  public static void main(String[] args) throws InterruptedException {

    Scanner sc = new Scanner(System.in);  // Scanner for user input
    int balance = 100;  // Initial balance
    int bet = 0;        // Player's bet for each spin
    String row[];       // Stores the symbols spun
    int pay = 0;        // Payout for the round
    String play;        // Player's choice to continue or stop

    // Welcome message
    System.out.println("***************************");
    System.out.println("   Welcome to Java Slot   ");
    System.out.println("Symbols : 🍉 🍒 🌻 ⭐ 🏀");
    System.out.println("***************************");

    // Main game loop: runs while balance is positive
    while (balance > 0) {
      System.out.println("Current balance: $" + balance);

      // Prompt user to place a bet
      System.out.print("Place your bet: ");
      bet = sc.nextInt();
      sc.nextLine(); // Clear the newline from input buffer

      // Validate bet amount
      if (bet > balance) {
        System.out.println("INSUFFICIENT AMOUNT");
        continue; // Skip this round and prompt again
      } else if (bet < 0) {
        System.out.println("Bet must be greater than 0");
        continue; // Skip this round and prompt again
      } else {
        balance -= bet; // Deduct bet from balance
      }

      // Simulate spinning animation
      System.out.print("Spinning");
      for (int i = 0; i < 6; i++) {
        Thread.sleep(200); // Pause for 200 milliseconds
        System.out.print(".");
      }
      System.out.println();

      // Spin the slot machine and get symbols
      row = spinrow();
      printrow(row); // Display the spun symbols

      // Calculate payout based on spin result
      pay = payout(row, bet);

      // Update balance and show result
      if (pay > 0) {
        System.out.println("You Won!");
        balance += pay;
        System.out.println("New balance is: " +balance);
      } else {
        System.out.println("You lose");
        System.out.println("New balance is: " +balance);
      }

      // Ask the player if they want to continue
      System.out.print("Do you want to play again (Y/N): ");
      play = sc.nextLine().toUpperCase();
      if (!play.equals("Y"))
        break; // Exit loop if player chooses not to continue
    }

    // Final balance output
    System.out.print("Game over. Your final balance is: $" + balance);
  }

  // Generates a row of 3 random symbols
  static String[] spinrow() {
    Random sc1 = new Random();
    String symbols[] = {"🍉", "🍒", "🌻", "⭐", "🏀"};
    String row[] = new String[3];

    for (int i = 0; i < 3; i++) {
      row[i] = symbols[sc1.nextInt(0, 5)]; // Randomly pick a symbol
    }
    return row;
  }

  // Prints the spun row with decoration
  static void printrow(String row[]) {
    System.out.println("********************");
    System.out.println(" " + String.join(" | ", row));
    System.out.println("********************");
  }

  // Calculates payout if all symbols match
  static int payout(String row[], int bet) {
    if ((row[0].equals(row[1])) && (row[1].equals(row[2]))) {
      // Return payout multiplier based on matching symbol
      return switch (row[0]) {
        case "🍉" -> bet * 3;
        case "🍒" -> bet * 4;
        case "🌻" -> bet * 5;
        case "⭐" -> bet * 10;
        case "🏀" -> bet * 15;
        default -> 0;
      };
    }
    return 0; // No payout if symbols don’t match
  }
}
