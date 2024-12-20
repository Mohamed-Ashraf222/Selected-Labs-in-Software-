/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

public class CurrentConditionDislay implements Observer {
    private float temprature;
    private float humidity;
    
    @Override
    public void update(float temprature, float humidity, float windspeed){
        this.temprature = temprature;
        this.humidity = humidity;
        display();
        
    }
    
    public void display(){
        System.out.println("Current Condition: " + temprature + "°C and " + humidity + "% humidity.");
    }
    
}
