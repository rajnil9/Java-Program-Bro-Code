import java.util.*; // Importing the utilities including Scanner, Timer, TimerTask

class timer // Class name
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        System.out.print("Enter the number of seconds for Countdown(must be positive): ");
        int res = sc.nextInt(); // Read countdown starting number from the user
        if(res>0)
        {
        Timer timer = new Timer(); // Create a Timer object to schedule the countdown task

        // Create a TimerTask with overridden run() method
        TimerTask t = new TimerTask()
        {
            int c = res; // Initialize countdown value with user input

            @Override
            public void run()
            {
                System.out.println(c); // Print current countdown value
                c--; // Decrement the counter

                if (c < 0) // When countdown reaches below zero
                {
                    System.out.println("HAPPY NEW YEAR!"); // Print celebration message
                    timer.cancel(); // Stop the Timer to end the program
                }
            }
        };

        // Schedule the TimerTask with:
        // - initial delay of 0 ms
        // - repeat period of 500 ms (0.5 seconds)
        timer.schedule(t, 0, 500);
         }
         else
         {
         System.out.println("Enter number of seconds for Countdown can't be nagative! Try again!");
         }
    }
    
}
