package Alarm_Clock_Program;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * AlarmClock class implementing Runnable to allow running on a separate thread.
 * It waits until the alarm time is reached and then plays a WAV sound file as the alarm.
 */
public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;  // User-set alarm time
    private final String filepath;      // Path to the WAV file for alarm
    private final Scanner sc;           // Scanner for user input to stop alarm

    // Constructor to initialize alarm time, file path, and Scanner
    AlarmClock(LocalTime alarmTime, String fp, Scanner sc) {
        this.alarmTime = alarmTime;
        this.filepath = fp;
        this.sc = sc;
    }

    @Override
    public void run() {
        // Loop until the current time reaches or passes the alarm time
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000); // wait for 1 second

                // Get the current time
                LocalTime now = LocalTime.now();

                // Print the current time in HH:MM:SS format on the same line using carriage return
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        // Notify user that the alarm has triggered
        System.out.println("\n*ALARM NOISES*");

        // Play the alarm sound
        playsound();
    }

    /**
     * Method to play the WAV sound file as the alarm sound.
     * Uses javax.sound.sampled API to play the sound.
     */
    private void playsound() {
        File audiofile = new File(filepath); // Create a File object for the audio file

        try (AudioInputStream as = AudioSystem.getAudioInputStream(audiofile)) {
            Clip clip = AudioSystem.getClip(); // Obtain a Clip to play the audio
            clip.open(as);                     // Open the audio input stream
            clip.start();                      // Start playing the sound

            // Prompt user to press Enter to stop the alarm
            System.out.print("Press *Enter* to stop the alarm: ");
            sc.nextLine(); // Wait for user input to stop the alarm

            clip.stop();   // Stop the sound
            sc.close();    // Close the scanner after alarm is stopped

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        } catch (IOException e) {
            System.out.println("Error reading audio file");
        }
    }
}
