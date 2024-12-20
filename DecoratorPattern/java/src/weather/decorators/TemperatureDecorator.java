package weather.decorators;

import weather.data.WeatherData;
import weather.data.WeatherDecorator;

public class TemperatureDecorator extends WeatherDecorator {
    public TemperatureDecorator(WeatherData weatherData) {
        super(weatherData);
    }
    
    @Override
    public String getDescription() {
        return weatherData.getDescription() + ", Temperature";
    }
    
    @Override
    public double getValue() {
        return weatherData.getValue();
    }
    
    public String getFormattedTemperature() {
        return String.format("%.1f°C", getValue());
    }
}