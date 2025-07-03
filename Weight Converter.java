import java.util.*;
class a4
{
     //WEIGHT CONVERTER PROGRAM
  public static void main(String[] args) {
    int choice;
    double w,nw;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your choice: "); // to enter choice 
    choice=sc.nextInt();
    System.out.print("Enter weight: ");
    w=sc.nextDouble();
    switch(choice) // Using Switch Case
    {
      case 1:
      System.out.println("1 , Entered weight is in lbs: " + w);
      nw=w*0.453592; // convert weight from lbs to kg
      System.out.printf("New weight in kg is: %.2f" , nw);
      break;
      case 2:
      System.out.println("2 , Entered weight is in kg: " + w);
      nw=w*2.20462; // convert weight from kg to lbs
      System.out.printf("New weight in lbs is: %.2f" , nw);
      break;
      default:
      System.out.println("Wrong choice"); // For invalid choice 
      break;
  
    }
      sc.close();
  }
}