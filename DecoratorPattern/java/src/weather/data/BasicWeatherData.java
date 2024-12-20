package weather.data;

public class BasicWeatherData implements WeatherData {
    private double value;
    
    public BasicWeatherData(double value) {
        this.value = value;
    }
    
    @Override
    public String getDescription() {
        return "Basic Weather Data";
    }
    
    @Override
    public double getValue() {
        return value;
    }
}