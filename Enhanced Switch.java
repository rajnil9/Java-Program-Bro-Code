import java.util.*;
class a6
{ 
  //Enhanced switch using arrow operator ->
  public static void main(String[] args) {
    String day;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the day: ");
    day=sc.nextLine();
    switch(day) 
    {
      case "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday"  -> // using of arrow operator
       System.out.println("It is a weekday"); // A java 14 feature that reduces redundancy 
      case "Saturday" , "Sunday" ->
       System.out.println("It is a weekend");
      default ->  // For invalid input 
      System.out.println("It is not a day");

    }
    sc.close();
    

  }
}