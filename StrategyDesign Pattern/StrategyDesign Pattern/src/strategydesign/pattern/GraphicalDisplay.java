/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategydesign.pattern;

/**
 *
 * @author asmaa
 */
public class GraphicalDisplay implements WeatherDisplayStrategy{
    public void displayWeatherData(WeatherData weatherData) {
            System.out.println("Weather data in graphical format:");
            System.out.println("[Temperature]: " + weatherData.getTemperature() + "°C -> ██████████");
            System.out.println("[Humidity]: " + weatherData.getHumidity() + "% -> ███████");
            System.out.println("[Forecast]: " + weatherData.getForecast());
        }
    
}
