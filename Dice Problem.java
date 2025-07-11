import java.util.*;
import java.util.Random;
class Dice
{
  public static void main(String[] args) throws InterruptedException
   {
    int nd;
    int choice;
    int total=0;
    int roll;
    Random sc1=new Random(); // Creatin object for randome value of dice
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of dices: ");
    nd=sc.nextInt();
    if(nd>0)
    {
     for(int i=1;i<=nd;i++)
     {
      roll=sc1.nextInt(1,7); // to store random value of dice
      printdie(roll); // calling function to print dice
      Thread.sleep(300);
      total+=roll; // storing total value of dice

     }
     
    }
    else
    {
      System.out.println("Number of dices can't be less then 0");
    }
    System.out.println("Total value: " +total );

    sc.close();
  } // END OF MAIN 
  
  static void printdie(int roll)
  {
       String die1 = """
                +-------+
                |       |
                |   o   |
                |       |
                +-------+
                """;
        String die2 = """
                +-------+
                | o     |
                |       |
                |     o |
                +-------+
                """;
        String die3 = """
                +-------+
                | o     |
                |   o   |
                |     o |
                +-------+
                """;
        String die4 = """
                +-------+
                | o   o |
                |       |
                | o   o |
                +-------+
                """;
        String die5 = """
                +-------+
                | o   o |
                |   o   |
                | o   o |
                +-------+
                """;
        String die6 = """
                +-------+
                | o   o |
                | o   o |
                | o   o |
                +-------+
                """;
  
   switch(roll) //using enhanced switch to print die as value we have got 
  {
     case 1->System.out.println(die1);
     case 2->System.out.println(die2);
     case 3->System.out.println(die3);
     case 4->System.out.println(die4);
     case 5->System.out.println(die5);
     case 6->System.out.println(die6); 
      
  } 
   } // END OF FUNCTION
}