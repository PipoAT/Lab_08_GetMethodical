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

            pipe.nextLine();
        } while (!validInput);

        return num;
    }
}
