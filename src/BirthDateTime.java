import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // initialize scanner for user inputs

        // Input year of birth ranging from 1950 to 2015
        int year = SafeInput.getRangedInt(scanner, "Enter the year of birth (1950-2015): ", 1950, 2015);

        // Input month of birth ranged 1 - 12
        int month = SafeInput.getRangedInt(scanner, "Enter the month of birth (1-12): ", 1, 12);

        // Input day based on the month
        int day;
        switch (month) {
            case 2: // February, including leap year cases
                day = SafeInput.getRangedInt(scanner, "Enter the day of birth (1-29): ", 1, 29);
                break;
            case 4: // April, 30 days
            case 6: // June, 30 days
            case 9: // September, 30 days
            case 11: // November, 30 days
                day = SafeInput.getRangedInt(scanner, "Enter the day of birth (1-30): ", 1, 30);
                break;
            default: // All other months at 31 days
                day = SafeInput.getRangedInt(scanner, "Enter the day of birth (1-31): ", 1, 31);
                break;
        }

        // Input hour of which birth occurs
        int hours = SafeInput.getRangedInt(scanner, "Enter the hour of the day in which birth occurred (1-24): ", 1, 24);

        // Input minute within the hour of which birth occurs
        int minutes = SafeInput.getRangedInt(scanner, "Enter the minute within the hour in which birth occurred (1-59): ", 1, 59);

        // Display the birthdate and time
        System.out.printf("Date and time of birth: %02d-%02d-%04d %02d:%02d\n", day, month, year, hours, minutes);
    }
}
