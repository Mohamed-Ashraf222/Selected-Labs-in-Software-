package weather.data;

public abstract class WeatherDecorator implements WeatherData {
    protected WeatherData weatherData;
    
    public WeatherDecorator(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
}