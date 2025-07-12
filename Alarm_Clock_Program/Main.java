package Alarm_Clock_Program;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
// ALARM CLOCK PROGRAM
/**
 * Main class for the Alarm Clock Program.
 * Handles user input for alarm time and starts the AlarmClock thread.
 */
public class Main {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Formatter to parse time in HH:mm:ss format
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Variable to store user-provided alarm time
        LocalTime alarmTime = null;

        // File path for the alarm sound (Xylophone.wav)
        String filepath = "Alarm_Clock_Program\\Xylophone.wav";

        // Loop until the user enters a valid time
        while (alarmTime == null) {
            try {
                System.out.print("Enter time in HH:MM:SS -> ");
                String inputTime = sc.nextLine();

                // Parse the input string into LocalTime
                alarmTime = LocalTime.parse(inputTime, f);

                System.out.println("Alarm Time set for: " + alarmTime);
            } catch (DateTimeParseException e) {
                // Inform the user of invalid input and prompt again
                System.out.println("Invalid Input. Use HH:MM:SS format");
            }
        }

        // Create an AlarmClock object with alarmTime, sound file, and Scanner
        AlarmClock ac = new AlarmClock(alarmTime, filepath, sc);

        // Create a Thread with the AlarmClock object
        Thread th = new Thread(ac);

        // Start the alarm clock thread
        th.start();
    }
}
