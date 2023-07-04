import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // initialize scanner
        String firstName = ""; // set variables for first/last name of username
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); // call getNonZeroLenString for first name
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name"); // call getNonZeroLenString for last name
        System.out.println("\nYour full name is: " + firstName + " " + lastName); // output the results
    }
}
