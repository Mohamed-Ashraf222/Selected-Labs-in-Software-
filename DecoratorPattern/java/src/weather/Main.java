package weather;

import weather.data.WeatherData;
import weather.data.BasicWeatherData;
import weather.decorators.TemperatureDecorator;

public class Main {
    public static void main(String[] args) {
        // Create basic weather data
        WeatherData weatherData = new BasicWeatherData(23.5);
        
        // Decorate it with temperature formatting
        TemperatureDecorator tempData = new TemperatureDecorator(weatherData);
        
        // Print results
        System.out.println("Description: " + tempData.getDescription());
        System.out.println("Temperature: " + tempData.getFormattedTemperature());
    }
}