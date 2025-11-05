package Facade;

import java.util.List;

public class Facade {
    List<Luce> lights;
    List<Amplificatore> amplificatori;
    List<Tenda> tende;

    public Facade(List<Luce> lights, List<Amplificatore> amplificatori, List<Tenda> tende) {
        this.lights = lights;
        this.amplificatori = amplificatori;
        this.tende = tende;
    }

    public void watchMovie(){
        lights.forEach(Luce::spegniLuce);
        amplificatori.forEach(Amplificatore::amplificatoreOn);
        tende.forEach(Tenda::chiudiTenda);
    }
}
