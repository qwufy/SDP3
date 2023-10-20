import java.util.Scanner;

// Main class to demonstrate the Adapter pattern
public class TemperatureAdapterDemo {
    public static void main(String[] args) {
        // Create an object of CelsiusTemperatureConverter
        CelsiusTemperatureConverter celsiusConverter = new CelsiusTemperatureConverter();

        // Take user input for temperature in Celsius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temperatureInCelsius = scanner.nextDouble();

        // Use CelsiusTemperatureConverter directly
        double convertedTemperatureCelsius = celsiusConverter.convert(temperatureInCelsius);
        System.out.println("Temperature in Celsius: " + convertedTemperatureCelsius);

        // Use the FahrenheitTemperatureAdapter to convert Celsius to Fahrenheit
        FahrenheitTemperatureAdapter adapter = new FahrenheitTemperatureAdapter(celsiusConverter);
        double temperatureInFahrenheit = adapter.convert(temperatureInCelsius);
        System.out.println("Temperature in Fahrenheit: " + temperatureInFahrenheit);
    }
}
