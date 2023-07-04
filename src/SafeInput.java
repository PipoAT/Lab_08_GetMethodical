import java.util.Scanner;

public class SafeInput {

    // Part A getNonZeroLenString
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop until it isn't
        do {
            System.out.print("\n"+prompt+": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }

    // Part B getInt
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt for the user
     * @return a String response that is not zero length
     */
    public static int getInt(Scanner pipe, String prompt) {
        int num = 0; // initialize variable that will return the int value
        boolean validInput; // initialize variable that sets input flag as T/F

        do {
            validInput = true;
            System.out.print("\n"+prompt+": "); // show prompt

            if (pipe.hasNextInt()) { // checks if the input is an int
                num = pipe.nextInt(); // if yes, read the int
            } else {
                String trash = pipe.next(); // Read and discard non-integer input
                System.out.println("You have input value of: " + trash);
                System.out.println("Invalid input. Please enter an integer.");
                validInput = false;
            }

            pipe.nextLine();
        } while (!validInput);

        return num;
    }

    // Part C getDouble
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt for the user
     * @return a String response that is not zero length
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double num = 0; // initialize variable that will return the int value
        boolean validInput; // initialize variable that sets input flag as T/F

        do {
            validInput = true;
            System.out.print("\n"+prompt+": "); // show prompt

            if (pipe.hasNextDouble()) { // checks if the input is an int
                num = pipe.nextDouble(); // if yes, read the int
            } else {
                String trash = pipe.next(); // Read and discard non-integer input
                System.out.println("You have input value of: " + trash);
                System.out.println("Invalid input. Please enter an double.");
                validInput = false;
            }

            pipe.nextLine(); // Clear the newline character from the input buffer
        } while (!validInput);

        return num;
    }

    // Part D getRangedInt
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt for the user
     * @param low for lower limit of integer
     * @param high for upper limit of integer
     * @return a String response that is not zero length
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int rangedInt = 0; // initialize variable that returns ranged int
        boolean validInput = false; // initialize variable that sets input flag as T/F

        do {
            System.out.print(prompt);
            if (pipe.hasNextInt()) { // checks if input is an integer
                rangedInt = pipe.nextInt();
                pipe.nextLine(); // Clear the newline character from the input buffer

                if (rangedInt >= low && rangedInt <= high) { // checks if it is within the stated bounds of high/low
                    validInput = true;
                } else { // output value is int but out of the specified range
                    System.out.println("You input the value: " + rangedInt);
                    System.out.println("Input out of range. Please try again.");
                }
            } else {
                String trash = pipe.nextLine(); // Read and discard the non-integer input
                System.out.println("You have input value of: " + trash);
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } while (!validInput);

        return rangedInt;
    }

    // Part E getRangedDouble
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt for the user
     * @param low for lower limit of double
     * @param high for upper limit of double
     * @return a String response that is not zero length
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double rangedDouble = 0; // initialize variable that returns ranged double
        boolean validInput = false; // initialize variable that sets input flag as T/F

        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble()) { // checks if input is a double
                rangedDouble = pipe.nextDouble();
                pipe.nextLine(); // Clear the newline character from the input buffer

                if (rangedDouble >= low && rangedDouble <= high) { // checks if it is within the stated bounds of high/low
                    validInput = true;
                } else { // output value is double but out of the specified range
                    System.out.println("You input the value: " + rangedDouble);
                    System.out.println("Input out of range. Please try again.");
                }
            } else {
                String trash = pipe.nextLine(); // Read and discard the non-double input
                System.out.println("You have input value of: " + trash);
                System.out.println("Invalid input. Please enter a valid double.");
            }
        } while (!validInput);

        return rangedDouble;
    }
}
