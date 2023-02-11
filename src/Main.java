public class Main {
    public static void main(String[] args) {
        // Directions:
        /*
        A program that starts with a credit card balance of $5000 and
        then calculates the interest at a rate of 17%.  Assume the user
        does not make any payments.  Display the interest due after
        one month and again after two months.
         */

        final double INTEREST_RATE = 0.17; // stores rate of interest

        double initialBalance;   // stores "user input"

        double interest1Month;   //stores interest after 1 month
        double interest2Month;   //stores interest after 2 months

        // prompt user for initial balance:
        System.out.println("Enter your current credit card balance:");
        double initalBalance = 5000;           // simulate user input
        System.out.println("You entered: $" + initalBalance); // clarifies test runs

        // calculate:
        interest1Month = initalBalance * INTEREST_RATE;
        interest2Month = interest1Month * 2;

        // output both interest amounts:
        System.out.println("With an interest rate of " + INTEREST_RATE * 100 + "%, your interest amount " +
                "after one month will be $" + interest1Month + ".\n" +
                "After two months, your interest amount will be $" + interest2Month + ".");

        //end

    }
}