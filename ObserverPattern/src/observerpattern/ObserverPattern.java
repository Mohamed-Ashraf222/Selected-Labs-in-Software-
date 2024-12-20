
package observerpattern;

public class ObserverPattern {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDislay currentDisplay = new CurrentConditionDislay();
        WeatherAlerts weatherAlerts = new WeatherAlerts();
        
        
        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(weatherAlerts);
        
        weatherData.setWeatherData(30.5f, 65.0f, 15.0f); // Updates temperature, humidity, and wind speed
        weatherData.setWeatherData(42.0f, 50.0f, 120.0f); // Triggers alerts
        

    }
    
    
}
