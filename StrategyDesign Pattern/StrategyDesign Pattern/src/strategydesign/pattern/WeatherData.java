/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategydesign.pattern;

/**
 *
 * @author asmaa
 */
public class Main {
static class WeatherData {
    private double temperature;
        private int humidity;
        private String forecast;

        public WeatherData(double temperature, int humidity, String forecast) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.forecast = forecast;
        }
        public double getTemperature() {
            return temperature;
        }

        public int getHumidity() {
            return humidity;
        }

        public String getForecast() {
            return forecast;
        }
}}
