package javaapplication21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SingletonPattern {
    private static Connection connection = null;

    private SingletonPattern() {
    }

    public static synchronized Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:weather.db");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}

class UserPreferencesManager {
    private static UserPreferencesManager instance;
    private String temperatureUnit = "Celsius"; 
    private String windSpeedUnit = "km/h"; 

    private UserPreferencesManager() { }

    public static synchronized UserPreferencesManager getInstance() {
        if (instance == null) {
            instance = new UserPreferencesManager();
        }
        return instance;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    public String getWindSpeedUnit() {
        return windSpeedUnit;
    }

    public void setWindSpeedUnit(String windSpeedUnit) {
        this.windSpeedUnit = windSpeedUnit;
    }
}

class WeatherDataFetcher {
    private static final String GET_WEATHER_QUERY = "SELECT * FROM weather_data WHERE city = ?";

    public static void fetchWeatherData(String city) {
        try (Connection connection = SingletonPattern.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(GET_WEATHER_QUERY);
            statement.setString(1, city); 
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String temperature = resultSet.getString("temperature");
                String humidity = resultSet.getString("humidity");
                String windSpeed = resultSet.getString("wind_speed");

                
                System.out.println("Weather data for " + city + ":");
                System.out.println("Temperature: " + temperature + " " + UserPreferencesManager.getInstance().getTemperatureUnit());
                System.out.println("Humidity: " + humidity + "%");
                System.out.println("Wind Speed: " + windSpeed + " " + UserPreferencesManager.getInstance().getWindSpeedUnit());
            } else {
                System.out.println("No weather data found for " + city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        UserPreferencesManager.getInstance().setTemperatureUnit("Fahrenheit");
        UserPreferencesManager.getInstance().setWindSpeedUnit("mph");

        WeatherDataFetcher.fetchWeatherData("Cairo");
        WeatherDataFetcher.fetchWeatherData("Alexandria");
    }
}