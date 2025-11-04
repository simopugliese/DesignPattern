package Adapter.Display;

import Adapter.WeatherStations.USAWeatherStation;

public class USADisplay implements USAWeatherStation{
    public float getTemperatureFar()
    {
        System.out.println("Temperature in Fahrenheit");
        return 76; //example
    }
    public void showTemperature() {
        System.out.println("This is the temperature in Fahrenheit");
    }
}