import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // initialize scanner for user input

        int favoriteInt = SafeInput.getInt(scanner, "Enter your favorite integer"); // call getInt for user fav int
        System.out.println("Your favorite integer: " + favoriteInt); // output result of fav int from user

        double favoriteDouble = SafeInput.getDouble(scanner, "Enter your favorite double"); // call getDouble for user fav double
        System.out.println("Your favorite double: " + favoriteDouble); // output result of fav double

        scanner.close();
    }
}
