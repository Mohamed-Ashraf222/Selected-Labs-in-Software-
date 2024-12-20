/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategydesign.pattern;

/**
 *
 * @author asmaa
 */
public class WeatherDisplayContext {
    private WeatherDisplayStrategy strategy;

        public void setStrategy(WeatherDisplayStrategy strategy) {
            this.strategy = strategy;
        }

        public void displayWeather(WeatherData weatherData) {
            if (strategy == null) {
                throw new IllegalStateException("Display strategy is not set!");
            }
            strategy.displayWeatherData(weatherData);
        }
    
}
