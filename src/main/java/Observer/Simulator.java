package Observer;

import Observer.Observer.WeatherStation;
import Observer.Subject.WeatherData;

public class Simulator {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); //subject

        WeatherStation weatherStation = new WeatherStation(); //observer
        weatherData.registerObserver(weatherStation); //registro l'observer sul subject


        //un cambiamento sul subject invocherà l'update sugli observer
        weatherData.setMeasurements(25,20,2);
    }
}
