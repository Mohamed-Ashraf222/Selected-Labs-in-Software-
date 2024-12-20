

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author asmaa
 */
public class FactoryPattern {

   
    public static void main(String[] args) {
         WeatherData temperatureData = WeatherDataFactory.createWeatherData("Temperature", 22.5, "Celsius");
         WeatherData humidityData = WeatherDataFactory.createWeatherData("Humidity", 55, null);
         WeatherData windSpeedData = WeatherDataFactory.createWeatherData("WindSpeed", 12.8, "km/h");
         System.out.println(temperatureData.displayData());
         System.out.println(humidityData.displayData());
         System.out.println(windSpeedData.displayData());
         
         WeatherAlert stormAlert = WeatherAlertFactory.createWeatherAlert("Storm");
         WeatherAlert snowAlert = WeatherAlertFactory.createWeatherAlert("Snow");
         WeatherAlert heatwaveAlert = WeatherAlertFactory.createWeatherAlert("Heatwave");
         System.out.println(stormAlert.generateAlert());
         System.out.println(snowAlert.generateAlert());
         System.out.println(heatwaveAlert.generateAlert());
    }
    
}
