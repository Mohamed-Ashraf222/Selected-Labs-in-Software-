
package observerpattern;

public class WeatherAlerts implements Observer {
    
    @Override
    public void update(float temprature, float humidity, float windspeed){
        if(temprature > 40){
            System.out.println("Heatwave Alert!");
        }else if (windspeed > 100){
            System.out.println("Storm Alert!");
        }
    }
}
