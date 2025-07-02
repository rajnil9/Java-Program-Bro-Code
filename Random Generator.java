import java.util.Random;
class a3
{
  public static void main(String[] args) {
    int n,n1;
    boolean f;
    double d,d1;
    Random sc=new Random();
    System.out.println("1st number can be anything , 2nd will be b/w a range :");
    n=sc.nextInt(); // any random number b/w the range of integer
    n1=sc.nextInt(1,7); // 1st number is inclusive , 2nd is exclusive .
    System.out.println("1st number: " + n + "  , 2nd number: " + n1);
    
  System.out.println("1st decimal b/w to 0 to 1 , 2nd will be b/w a range :");
  d=sc.nextDouble();//any decimal number between 0 to 1
  d1=sc.nextDouble(1.67,100.898456); //1st number is inclusive , 2nd is exclusive .
  System.out.println("1st  decimal number: " + d + "  , 2nd decimal number: " + d1);

  System.out.println("Toss of a coin:");
  f=sc.nextBoolean();//either true or false
  if(f)
    System.out.println("It is Heads");
  else
  System.out.println("It is tails");
  }
}
  




  
