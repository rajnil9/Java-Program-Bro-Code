import java.util.*;
class bank
{
    //  BANKING PROGRAM 
  static Scanner sc=new Scanner(System.in); // Declaring Scanner class outside main method so that any other can access it

  public static void main(String[] args)
   {
    double balance=0.0;
    boolean f=true;
    int choice;

    while(f)
    {
      System.out.println("****************");
      System.out.println("BANKING PROGRAM:");
      System.out.println("****************");
      System.out.println("1. Show Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.println("****************");

      System.out.print("Enter your choice: ");
      choice=sc.nextInt();

      switch (choice) // using enhanced switch case for choices 
       {
        case 1 -> balanceshow(balance); // calling method
        case 2 -> balance += deposit(); // calling deposit function and adding deposited amount to main balance
        case 3 -> balance -= withdraw(balance); // calling withdraw function and deducting it from main balance
        case 4 -> f=false; // terminating while case when we want to exit 
        default -> System.out.println("Invalid Input");
      }
     

    } // END OF WHILE LOOP
     
  } // END OF MAIN METHOD

  static void balanceshow(double balance)
  {
    System.out.println("****************");
    System.out.printf("$%.2f\n" , balance); // print balance as present in bank

  } 
  static double deposit()
  {
    System.out.print("Enter amount to be deposited: ");
    double amount=sc.nextDouble(); // to enter deposited amount
    if(amount<0)
    { 
      System.out.println("Deposited amount cannot be negative");
      return 0;
    }
    else
    return amount;
    
  }
  static double withdraw(double balance)
  {
    System.out.print("Enter amount to be withdrawn: ");
    double w=sc.nextInt(); // to enter withdrawn amount 
    if(w>balance){
    System.out.println("Insufficient Funds");
    return 0;
    }
    else if(w<0)
   {
      System.out.println("Withdrawn amount cannot be negative");
      return 0;
      }
      else
      return w;
    
  }
} // END OF CLASS

  
