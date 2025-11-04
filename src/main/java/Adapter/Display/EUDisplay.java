package Adapter.Display;

import Adapter.WeatherStations.EUWeatherStation;

public class EUDisplay implements EUWeatherStation{
    public float getTemperature() {
        System.out.println("Temperature in Celsius");
        return 22; //example
    }

    public void showTemperature() {
        System.out.println("This is the temperature in Celsius");
    }
}
