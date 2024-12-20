/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asmaa
 */
public class WeatherDataFactory {
    public static final int Temperature =1;
    public static final int Humidity=2;
    public static final int WindSpeed=3;
    public static WeatherData createWeatherData(String dataType, double value, String unit) {
        switch (dataType) {
            case "Temperature":
                return new Temperature(value, unit);
            case "Humidity":
                return new Humidity(value);
            case "WindSpeed":
                return new WindSpeed(value, unit);
            default:
                throw new IllegalArgumentException("Unknown Weather Data Type: " + dataType);
        }
    
    }}
