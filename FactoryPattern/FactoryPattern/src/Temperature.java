/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asmaa
 */
public class Temperature extends WeatherData{
    private double value;
    private String unit;

    public Temperature(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public String displayData() {
        return "Temperature: " + value + "° " + unit;
    }
}
