package Facade;

public class Amplificatore {
    String descrizione;

    public Amplificatore(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void amplificatoreOn(){
        System.out.println("Acceso amplificatore: " + descrizione);
    }

    public void amplificatoreOff(){
        System.out.println("Spento amplificatore: " + descrizione);
    }
}
