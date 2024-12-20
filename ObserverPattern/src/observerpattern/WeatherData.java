/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temprature;
    private float humidity;
    private float windspeed;
    
    public WeatherData(){
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    
    @Override
    public void unregisterObserver(Observer observer){
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(temprature, humidity, windspeed);
            
        }
    }
    
    public void setWeatherData(float temprature, float humidity, float windspeed){
        this.temprature = temprature;
        this.humidity = humidity;
        this.windspeed = windspeed;
        notifyObservers(); // Notify observers after updating weather data
    }
    
}