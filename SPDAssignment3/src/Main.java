// Define the interface for the TemperatureConverter
interface TemperatureConverter {
    double convert(double temperature);
}

// CelsiusTemperatureConverter is a class that works with temperatures in Celsius
class CelsiusTemperatureConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return temperature;
    }
}

// FahrenheitTemperatureAdapter is our adapter class that allows working with temperatures in Fahrenheit
class FahrenheitTemperatureAdapter implements TemperatureConverter {
    private CelsiusTemperatureConverter celsiusTemperatureConverter;

    // Constructor that takes a CelsiusTemperatureConverter object
    public FahrenheitTemperatureAdapter(CelsiusTemperatureConverter celsiusTemperatureConverter) {
        this.celsiusTemperatureConverter = celsiusTemperatureConverter;
    }

    // Implementation of the convert method that converts Celsius to Fahrenheit
    @Override
    public double convert(double temperature) {
        // Conversion formula from Celsius to Fahrenheit
        return (temperature * 9 / 5) + 32;
    }
}

