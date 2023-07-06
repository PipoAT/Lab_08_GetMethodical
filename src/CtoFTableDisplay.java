public class CtoFTableDisplay {
    public static void main(String[] args) {

        // print out header
        SafeInput.prettyHeader("Celsius to Fahrenheit Conversion Table");
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("-------------------");

        // loop through the range -100 to 100 degrees C
        for (int celsius = -100; celsius <= 100; celsius++) {
            // get the converted temperature from CtoF
            double fahrenheit = CtoF(celsius);
            // output formatted converted temperature
            System.out.printf("%d\t\t%.2f%n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double celsius) {
        // returns the calculation/conversion, performing calculation
        return (celsius * 9 / 5) + 32;
    }
}
