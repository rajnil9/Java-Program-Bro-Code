// Package declaration, indicating the folder structure for organization
package Java_Hangman_Game;

// Importing necessary classes
import java.io.BufferedReader;         // For reading files efficiently
import java.io.FileNotFoundException;  // Exception for missing files
import java.io.FileReader;             // For reading files
import java.io.IOException;            // Exception for input/output errors
import java.util.*;                    // For using Scanner, ArrayList, HashSet, Random

// Declaring the class game1 (Java file should be named game1.java for this)
class game1
{

    // Main method where program execution starts
    public static void main(String[] args)
    {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // File path to the words.txt file inside the Java_Hangman_Game folder
        String filepath = "Java_Hangman_Game\\words.txt";

        // ArrayList to store the words read from the file
        ArrayList<String> words = new ArrayList<>();

        // Reading words from the file and adding them to the words ArrayList
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath)))
        {
            String line; // To store each line from the file temporarily

            // Reading each line until the end of the file
            while ((line = reader.readLine()) != null)
            {
                // Adding the trimmed lowercase word to the words list if it is not empty
                if (!line.trim().isEmpty())
                {
                    words.add(line.trim().toLowerCase());
                }
            }
        }
        catch (FileNotFoundException e)
        {
            // Error message if the file is not found
            System.out.println("File Not Found: " + filepath);
            return; // Exit the program
        }
        catch (IOException e)
        {
            // Error message if there is an error while reading the file
            System.out.println("Something went wrong while reading the file.");
            return; // Exit the program
        }

        // Checking if the words list is empty
        if (words.isEmpty())
        {
            System.out.println("Word list is empty. Please check your words.txt file.");
            return; // Exit the program
        }

        // Creating Random object for selecting a random word
        Random rand = new Random();

        // Selecting a random word from the words list
        String word = words.get(rand.nextInt(words.size()));

        // ArrayList to maintain the current state of the guessed word
        ArrayList<Character> wordState = new ArrayList<>();

        // HashSet to store guessed letters to avoid duplicate guesses
        HashSet<Character> guessedLetters = new HashSet<>();

        // Counter for the number of wrong guesses
        int wrongguess = 0;

        // Initializing the wordState with underscores for each letter in the word
        for (int i = 0; i < word.length(); i++)
        {
            wordState.add('_');
        }

        // Displaying the game welcome message
        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        // Main game loop runs until the user has less than 6 wrong guesses
        while (wrongguess < 6)
        {
            // Displaying the Hangman ASCII art based on the number of wrong guesses
            System.out.println(HangmanArt(wrongguess));

            // Displaying the current state of the word with spaces
            System.out.print("Word: ");
            for (char c : wordState)
            {
                System.out.print(c + " ");
            }
            System.out.println(); // Moving to the next line

            // Prompting the user to guess a character
            System.out.print("Guess a character: ");
            String input = sc.next().toLowerCase(); // Taking user input and converting to lowercase

            // Checking if the user entered an empty input
            if (input.isEmpty())
            {
                System.out.println("Please enter a character.");
                continue; // Skip to the next iteration
            }

            // Taking the first character of the input as the guessed character
            char Guess = input.charAt(0);

            // Checking if the character has already been guessed
            if (guessedLetters.contains(Guess))
            {
                System.out.println("You already guessed that letter. Try another.");
                continue; // Skip to the next iteration
            }

            // Adding the guessed character to the set of guessed letters
            guessedLetters.add(Guess);

            // Checking if the guessed character is present in the word
            if (word.indexOf(Guess) >= 0)
            {
                System.out.println("Correct Guess!");

                // Updating the wordState with the correctly guessed character
                for (int i = 0; i < word.length(); i++)
                {
                    if (word.charAt(i) == Guess)
                    {
                        wordState.set(i, Guess);
                    }
                }

                // Checking if the user has guessed the entire word
                if (!wordState.contains('_'))
                {
                    System.out.println(HangmanArt(wrongguess)); // Display final Hangman art
                    System.out.println("YOU WIN!"); // Display win message
                    System.out.println("The word was: " + word); // Display the correct word
                    return; // Exit the program
                }
            }
            else
            {
                // Incrementing the wrong guess counter if the guess was incorrect
                wrongguess++;
                System.out.println("Wrong Guess!");
            }
        }

        // Executed when the user has used all 6 wrong guesses
        System.out.println(HangmanArt(wrongguess)); // Display final Hangman art
        System.out.println("Game Over! YOU LOSE!"); // Display lose message
        System.out.println("The correct word was: " + word); // Display the correct word

        // Closing the Scanner object
        sc.close();
    }

    // Method to return ASCII art based on the number of wrong guesses
    static String HangmanArt(int wrongguess)
    {
        return switch (wrongguess)
        {
            case 0 -> """
                    
                    
                    """;
            case 1 -> """
                    o
                    
                    """;
            case 2 -> """
                    o
                    |
                    
                    """;
            case 3 -> """
                    o
                   /|
                    
                    """;
            case 4 -> """
                    o
                   /|\\
                    
                    """;
            case 5 -> """
                    o
                   /|\\
                   /
                    """;
            case 6 -> """
                    o
                   /|\\
                   / \\
                    """;
            default -> ""; // Default empty string
        };
    }
}
