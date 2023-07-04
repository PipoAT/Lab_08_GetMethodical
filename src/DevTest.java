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

    // Part C getInt test code
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double doubleNumber = 0;
        doubleNumber = SafeInput.getDouble(in, "Enter an double");
        System.out.println("\nYou entered double: " + doubleNumber);
    }

}