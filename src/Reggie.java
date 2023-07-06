import java.util.Scanner; // import scanner for user input

public class Reggie {
    public static void main(String[] args) {
        // initialize scanner for user input
        Scanner scanner = new Scanner(System.in);
        // ask user for ssn and output ssn if user inputs correctly
        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (XXX-XX-XXXX): ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);
        // ask user for M number and output if user inputs correctly
        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number (MXXXXX): ", "^(M|m)\\d{5}$");
        System.out.println("M number: " + mNumber);
        // ask user for menu choice and output if user inputs correctly
        String menuChoice = SafeInput.getRegExString(scanner, "Enter a menu choice (O, S, V, or Q): ", "^[OoSsVvQq]$");
        System.out.println("Menu choice: " + menuChoice);
        // close the scanner to stop allowing user inputs
        scanner.close();
    }
}
