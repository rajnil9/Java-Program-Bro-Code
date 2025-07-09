import java.util.*;
class Hangman
{
  public static void main(String[] args) {
    
    String word="pizza";

    Scanner sc=new Scanner(System.in);
    ArrayList<Character> wordState= new ArrayList<>();
    int wrongguess=0;

    for(int i=0;i<word.length();i++)
    {
      wordState.add('_');
    }
    
    System.out.println("************************");
    System.out.println("Welcome to Java Hangman!");
    System.out.println("************************");

   while(wrongguess<6)
   {
    System.out.println(HangmanArt(wrongguess));
      
    System.out.print("Word: ");

    for(char c: wordState)
    {
      System.out.print(c+ "  ");
    }
    System.out.println();

    System.out.print("Guess a character: ");
    char Guess=sc.next().toLowerCase().charAt(0);

    if(word.indexOf(Guess)>=0)
    {
      
    System.out.println("Correct Guess");
    for(int i=0;i<word.length();i++)
    {
      if(word.charAt(i)==Guess)
      wordState.set(i,Guess);

    }

    if(!wordState.contains('_'))
    {
      System.out.println(HangmanArt(wrongguess));
      System.out.println("YOU WIN!");
      System.out.println("The word was: "+ word);
      break;
    }


    }
    else
    {
    wrongguess++;
    System.out.println("Wrong Guess");
     }

     if(wrongguess>=6)
     {
      System.out.println(HangmanArt(wrongguess));
      System.out.println("Game Over! YOU LOSE!");
      System.out.println("Correct word is: " + word );
     }

   }
    sc.close();
  }


  static String HangmanArt(int wrongguess)
  {
    return switch(wrongguess)
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
       case 3-> """
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
      case 6-> """
                    o
                   /|\\
                   / \\
          """;
       
       default -> "";
    };
  }

  
}