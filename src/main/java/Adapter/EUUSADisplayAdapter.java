package Adapter;

import Adapter.WeatherStations.*;
import Adapter.Display.*;

public class EUUSADisplayAdapter implements EUWeatherStation {
    USADisplay newStation;

    public EUUSADisplayAdapter(USADisplay newStation) {
        this.newStation = newStation;
    }

    public float getTemperature() {
        return ((newStation.getTemperatureFar()-32)*5/9);
    }

    public void showTemperature() {
        System.out.println("This is the temperature " + (newStation.getTemperatureFar()-32)*5/9);
    }
}
