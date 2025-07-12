package AlarmClockProgram;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlarmClock implements Runnable 
{
  private final LocalTime alarmTime;
  private final String filepath;
  private final Scanner sc;

  AlarmClock(LocalTime alarmTime , String fp, Scanner sc)
  {
    this.alarmTime=alarmTime;
    this.filepath=fp;
    this.sc=sc;
  }

  @Override
  public void run() {
    
    while(LocalTime.now().isBefore(alarmTime))
    {
        try
        {
          Thread.sleep(1000);

          LocalTime now= LocalTime.now();
          System.out.printf("\r%02d:02d:02d\n" , now.getHour(), now.getMinute(), now.getSecond());
        } 
        catch(InterruptedException e)
        {
            System.out.println("Thread was interrupted");
        }
    }

    System.out.println("\n*ALARM NOISES*");
    playsound();

    
  }


private void playsound()
{
  File audiofile=new File(filepath);
  


  try(AudioInputStream as=AudioSystem.getAudioInputStream(audiofile)){
    Clip clip=AudioSystem.getClip();
    clip.open(as);
    clip.start();

  }

  catch(UnsupportedAudioFileException e)
  {
    System.out.println("Audio file format is not supported");
  }

  catch(LineUnavailableException e)
  {
    System.out.println("Audio is unavailable");
  }
 
  catch(IOException e)
  {
    System.out.println("Errror reading audio file");
  }


}
}


