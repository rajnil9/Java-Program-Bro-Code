// Importing necessary classes for file handling
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Importing audio system classes for playing WAV files
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// Importing Scanner for user input
import java.util.*;

// Defining the main class
class music {
    // Main method, starting point of the program
    public static void main(String[] args) throws LineUnavailableException {
        
        // Creating a Scanner object 'sc' to read user input
        Scanner sc = new Scanner(System.in);

        // Displaying available music options to the user
        System.out.println("Music Available:");
        System.out.println("1. Skyfall");
        System.out.println("2. Starman");

        // Prompting the user to enter which music to play be played
        System.out.print("Enter music number to be played: ");
        String s = sc.nextLine().trim(); // Reading user input, removing extra spaces

        // Constructing the file path for the selected music
        String filepath = "Music Player\\" + s + ".wav";

        // Creating a File object with the specified filepath
        File file = new File(filepath);

        // Check if the file actually exists before trying to play
        if (!file.exists()) {
            System.out.println("File not found ");
            System.out.println("Please check the file name and try again.");
            System.out.println("Bye! Thanks for using the music player.");
            sc.close(); // Closing the scanner before exiting
            return; // Exit the program
        }

        // Using try-with-resources to automatically close AudioInputStream
        try (
            AudioInputStream audio = AudioSystem.getAudioInputStream(file) // AudioInputStream for reading audio data from the file
        ) {
            // Obtaining a Clip object to play back audio
            Clip c = AudioSystem.getClip();

            // Opening the clip with the audio input stream
            c.open(audio);

            // Variable to store user input commands for controlling playback
            String response = "";

            // Loop continues until user enters "Q" to quit
            while (!response.equals("Q")) {

                // Displaying available playback options to the user
                System.out.println("*********");
                System.out.println("P: PLAY");
                System.out.println("S: STOP");
                System.out.println("R: RESET");
                System.out.println("Q: QUIT");
                System.out.print("Enter your choice: ");

                // Reading the user's choice and converting it to uppercase for consistency
                response = sc.next().toUpperCase();

                // Handling different user commands using switch
                switch (response) {
                    case "P" -> c.start(); // Play or resume the audio
                    case "S" -> c.stop();  // Stop the audio playback
                    case "R" -> c.setMicrosecondPosition(0); // Reset audio to the beginning
                    case "Q" -> c.close(); // Close the clip and prepare to quit
                    default -> System.out.println("INVALID CHOICE, try again."); // Handle invalid input
                }
            }
        }
        // Importing necessary classes for file handling
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Importing audio system classes for playing WAV files
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// Importing Scanner for user input
import java.util.*;

// Defining the main class
class music {
    // Main method, starting point of the program
    public static void main(String[] args) throws LineUnavailableException {
        
        // Creating a Scanner object 'sc' to read user input
        Scanner sc = new Scanner(System.in);

        // Displaying available music options to the user
        System.out.println("Music Available:");
        System.out.println("1. Interstellar");
        System.out.println("2. Starman");

        // Prompting the user to enter which music to play
        System.out.println("Enter music to be played (name exactly as shown): ");
        String s = sc.nextLine().trim(); // Reading user input, removing extra spaces

        // Constructing the file path for the selected music
        String filepath = "Music Player\\" + s + ".wav";

        // Creating a File object with the specified filepath
        File file = new File(filepath);

        // Check if the file actually exists before trying to play
        if (!file.exists()) {
            System.out.println("File not found: " + filepath);
            System.out.println("Please check the file name and try again.");
            System.out.println("Bye! Thanks for using the music player.");
            sc.close(); // Closing the scanner before exiting
            return; // Exit the program
        }

        // Using try-with-resources to automatically close AudioInputStream
        try (
            AudioInputStream audio = AudioSystem.getAudioInputStream(file) // AudioInputStream for reading audio data from the file
        ) {
            // Obtaining a Clip object to play back audio
            Clip c = AudioSystem.getClip();

            // Opening the clip with the audio input stream
            c.open(audio);

            // Variable to store user input commands for controlling playback
            String response = "";

            // Loop continues until user enters "Q" to quit
            while (!response.equals("Q")) {

                // Displaying available playback options to the user
                System.out.println("*********");
                System.out.println("P: PLAY");
                System.out.println("S: STOP");
                System.out.println("R: RESET");
                System.out.println("Q: QUIT");
                System.out.print("Enter your choice: ");

                // Reading the user's choice and converting it to uppercase for consistency
                response = sc.next().toUpperCase();

                // Handling different user commands using switch
                switch (response) {
                    case "P" -> c.start(); // Play or resume the audio
                    case "S" -> c.stop();  // Stop the audio playback
                    case "R" -> c.setMicrosecondPosition(0); // Reset audio to the beginning
                    case "Q" -> c.close(); // Close the clip and prepare to quit
                    default -> System.out.println("INVALID CHOICE, try again."); // Handle invalid input
                }
            }
        }
// Importing necessary classes for file handling
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Importing audio system classes for playing WAV files
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// Importing Scanner for user input
import java.util.*;

// Defining the main class
class music {
    // Main method, starting point of the program
    public static void main(String[] args) throws LineUnavailableException {
        
        // Creating a Scanner object 'sc' to read user input
        Scanner sc = new Scanner(System.in);

        // Displaying available music options to the user
        System.out.println("Music Available:");
        System.out.println("1. Interstellar");
        System.out.println("2. Starman");

        // Prompting the user to enter which music to play
        System.out.println("Enter music to be played (name exactly as shown): ");
        String s = sc.nextLine().trim(); // Reading user input, removing extra spaces

        // Constructing the file path for the selected music
        String filepath = "Music Player\\" + s + ".wav";

        // Creating a File object with the specified filepath
        File file = new File(filepath);

        // Check if the file actually exists before trying to play
        if (!file.exists()) {
            System.out.println("File not found: " + filepath);
            System.out.println("Please check the file name and try again.");
            System.out.println("Bye! Thanks for using the music player.");
            sc.close(); // Closing the scanner before exiting
            return; // Exit the program
        }

        // Using try-with-resources to automatically close AudioInputStream
        try (
            AudioInputStream audio = AudioSystem.getAudioInputStream(file) // AudioInputStream for reading audio data from the file
        ) {
            // Obtaining a Clip object to play back audio
            Clip c = AudioSystem.getClip();

            // Opening the clip with the audio input stream
            c.open(audio);

            // Variable to store user input commands for controlling playback
            String response = "";

            // Loop continues until user enters "Q" to quit
            while (!response.equals("Q")) {

                // Displaying available playback options to the user
                System.out.println("*********");
                System.out.println("P: PLAY");
                System.out.println("S: STOP");
                System.out.println("R: RESET");
                System.out.println("Q: QUIT");
                System.out.print("Enter your choice: ");

                // Reading the user's choice and converting it to uppercase for consistency
                response = sc.next().toUpperCase();

                // Handling different user commands using switch
                switch (response) {
                    case "P" -> c.start(); // Play or resume the audio
                    case "S" -> c.stop();  // Stop the audio playback
                    case "R" -> c.setMicrosecondPosition(0); // Reset audio to the beginning
                    case "Q" -> c.close(); // Close the clip and prepare to quit
                    default -> System.out.println("INVALID CHOICE, try again."); // Handle invalid input
                }
            }
        }
        // Handling the case when the file format is not supported
        catch (UnsupportedAudioFileException e) {
            System.out.println("The selected file format is not supported.");
        }
        // Handling the case when the audio system resources are unavailable
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resources.");
        }
        // Handling general I/O exceptions
        catch (IOException e) {
            System.out.println("An error occurred while handling the audio file.");
        }
        // This block always executes, displaying a goodbye message
        finally {
            System.out.println("Bye! Thanks for playing.");
            sc.close(); // Closing the scanner before the program ends
        }
    }
}
