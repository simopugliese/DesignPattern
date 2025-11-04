package Adapter;

import Adapter.Display.*;
import Adapter.WeatherStations.*;

public class Simulator {
    public static void main(String[] args) {
        EUDisplay euDisplay = new EUDisplay();
        USADisplay usaDisplay = new USADisplay();

        //EUUSADisplayAdapter implementa EUWeatherStation e ha come parametro USADisplay
        EUWeatherStation wStation = new EUUSADisplayAdapter(usaDisplay);

        test(wStation);
    }
    static void test(EUWeatherStation euW) {
        euW.getTemperature(); //ritorna il float con la temperatura, in questo caso ignorato
        euW.showTemperature();
    }
}
