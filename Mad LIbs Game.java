import java.util.*;
class a3
{
  // MAD LIBS GAME
  public static void main(String[] args) 
  {
String adj1,noun,adj2,verb,adj3; //Declaration

Scanner sc=new Scanner(System.in); //Scanner Class


//Input statements and user input
System.out.print("Enter an adjective(description) : ");
adj1=sc.nextLine();
System.out.print("Enter a noun(animal or person) : ");
noun=sc.nextLine();
System.out.print("Enter an adjective(description) : ");
adj2=sc.nextLine();
System.out.print("Enter a verb ending with -ing(action): ");
verb=sc.nextLine();
System.out.print("Enter an adjective(description) : ");
adj3=sc.nextLine();

//Output Statements
System.out.println("\nToday I went to a " + adj1 + " zoo.");
System.out.println("In an exihibit , I saw" + noun + ".");
System.out.println(noun + "was " + adj2 + " and " + verb + "!");
System.out.println("I was " + adj3 + "!");


  }
}