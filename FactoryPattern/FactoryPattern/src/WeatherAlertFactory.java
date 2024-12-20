/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asmaa
 */
public class WeatherAlertFactory {
    public static final int StormAlert =1;
    public static final int SnowAlert =2;
    public static final int HeatwaveAlert=3;
    public static WeatherAlert createWeatherAlert(String alertType) {
        switch (alertType) {
            case "Storm":
                return new StormAlert();
            case "Snow":
                return new SnowAlert();
            case "Heatwave":
                return new HeatwaveAlert();
            default:
                throw new IllegalArgumentException("Unknown Alert Type: " + alertType);
        }
    }
}
