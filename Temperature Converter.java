import java.util.*;
class a5
{
  public static void main(String[] args) {
    double temp;
    String unit;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter temperature: ");
    temp=sc.nextDouble();
    System.out.print("Enter Unit (C or F): ");
    unit=sc.next();
    unit=unit.toUpperCase();
    double newtemp= (unit.equals("C")) ? ((temp-32)*5/9) : ((temp*9/5)+32);
    System.out.printf("New Tempertaure is : %.2f°%s" , newtemp , unit );
    sc.close();
  }
  
}


