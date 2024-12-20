/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asmaa
 */
public class Humidity extends WeatherData {
    private double value;

    public Humidity(double value) {
        this.value = value;
    }

    @Override
    public String displayData() {
        return "Humidity: " + value + "%";
    } 
    
}
