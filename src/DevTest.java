import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DevTest {

    // Part A getNonZeroLenString test code
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String firstName = "";
//        String lastName = "";
//        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
//        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
//        System.out.println("\nYour full name is: " + firstName + " " + lastName);
//    }

    // Part B getInt test code
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int intNumber = 0;
//        intNumber = SafeInput.getInt(in, "Enter an integer");
//        System.out.println("\nYou entered integer: " + intNumber);
//    }

    // Part C getDouble test code
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        double doubleNumber = 0;
//        doubleNumber = SafeInput.getDouble(in, "Enter an double");
//        System.out.println("\nYou entered double: " + doubleNumber);
//    }

    // Part D getRangedInt test code
//    public static void main(String[] args) {
//        Scanner pipe = new Scanner(System.in);
//        int low = 1;
//        int high = 10;
//        int userInput = SafeInput.getRangedInt(pipe, "Enter a number between " + low + " - " + high + ": ", low, high);
//        System.out.println("User input: " + userInput);
//        pipe.close();
//    }

    // Part E getRangedInt test code
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        double low = 3.2;
        double high = 3.5;
        double userInput = SafeInput.getRangedDouble(pipe, "Enter a number between " + low + " - " + high + ": ", low, high);
        System.out.println("User input: " + userInput);
        pipe.close();
    }

}