import java.util.*;
class a2
{
  public static void main(String[] args) {
    String item;
    int quan;
    double price;
    char currency='$';
    float total;

    Scanner sc=new Scanner(System.in);

    System.out.print("What item would you like to buy ? ");
    item=sc.nextLine();
    System.out.print("What is the price for each item ? ");
    price=sc.nextFloat();
    System.out.print("How many would you like to buy ? ");
    quan=sc.nextInt();
    total=(float)(price*quan);
    System.out.print("The total bill for " + quan + " " + item + "/s " + "would be : " +currency  + total);
  }
}