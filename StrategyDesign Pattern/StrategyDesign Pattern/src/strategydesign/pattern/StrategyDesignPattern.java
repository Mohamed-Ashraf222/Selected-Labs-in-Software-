/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategydesign.pattern;

/**
 *
 * @author asmaa
 */
public class StrategyDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(25.0, 62, "Sunny");

        WeatherDisplayContext displayContext = new WeatherDisplayContext();

        System.out.println("Strategy 1: Tabular Display");
        displayContext.setStrategy(new TabularDisplay());
        displayContext.displayWeather(weatherData);

        System.out.println();

        System.out.println("Strategy 2: Graphical Display");
        displayContext.setStrategy(new GraphicalDisplay());
        displayContext.displayWeather(weatherData);

        System.out.println();

        System.out.println("Strategy 3: Textual Display");
        displayContext.setStrategy(new TextualDisplay());
        displayContext.displayWeather(weatherData);
    }
    
}
