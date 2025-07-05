import java.util.*;
class quiz
{
     // QUIZ GAME
public static void main(String[] args)
 {
  String q[]={ "Q. What is the function of router?" ,
               "Q. What part of Computer is considered its brain?",
               "Q. Who is termed as Father of Computers?",
               "Q. In which year Facebook was launched?",
               "Q. What was the first progamming language"} ; // Storing questions in SDA 
  
  String ops[][]={{"1. Storing files" , "2. Encripting data" , "3. Controlling Internet traffic" , "4. Clearing memory"},
                  {"1. CPU" , "2. Hard Drive" , "3. RAM" , "4. GPU"},
                  {"1. Steve Jobs" , "2. Mark Zuckerberg" , "3. Bill Gates" , "4. Charles Babbage"},
                  {"1. 2000" , "2. 2004" , "3. 2008" , "4. 2012"},
                  {"1. C" , "2. COBOL" , "3. Fortran" , "4. Assembly"}}; // Storing options for each question in DDA

  int ans[]={3 , 1 , 4 , 2 , 3}; // to store correct answers
  int guess;
  int total = 0;

  Scanner sc=new Scanner(System.in);
   
   System.out.println("*********************");
   System.out.println("WELCOME TO JAVA QUIZ");
    System.out.println("********************");
  for(int i=0;i<q.length;i++)
  {
    System.out.println(q[i]); // to print question in a seq.manner
    for(String option : ops[i]) // to store options in a seq.manner for each question using enhanced for loop
   {
    System.out.println(option);
   }
   System.out.print("Enter your guess: ");
   guess=sc.nextInt(); 
   if(guess==ans[i]) // checking options for each question
   {
     System.out.println("*******");
    System.out.println("CORRECT");
    System.out.println("********");
    total+=1; // counting total correct answers
   }
   else
   {
    System.out.println("*******");
    System.out.println(" WRONG ");
    System.out.println("********");
   }
   }
   System.out.println("Total score is: " + total+"/"+q.length);

   sc.close();
  }
}