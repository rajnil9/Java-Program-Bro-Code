import java.util.*;
import java.util.Random; //importing random package 
class a7
{
  
  public static void main(String[] args) 
  {
    // RANDOM NUMBER GUESSING GAME

    int guess;
    int attempt=0,min=1,max=100;
    Random ob=new Random();
    int rnum=ob.nextInt(min , max+1); // To store randome number generated
    Scanner sc=new Scanner(System.in);
    System.out.print("Number guessing Game: ");
    System.out.println("Guess a number between 1-100");

    do //using do-while operator
    {
      System.out.print("Enter a guess: ");
      guess=sc.nextInt(); // enter the number 
      attempt++; // to count number of attempts taken
      
      if(guess<rnum) // to give hint to user that entered number is lower than random number generated
      System.out.println("Number is too low, Try again!");
      else if(guess>rnum)  // to give hint to user that entered number is higher than random number generated
      System.out.println("Number is too high, Try again!");
      else
      {
      System.out.println("CORRECT , The number was: " + guess); // print when guessed number is found 
      System.out.print("Number of attempts: " + attempt); // print number of attempts taken
      }

    }while(guess!=rnum); // loop conidition 
     sc.close();

  }
}