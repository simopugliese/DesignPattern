package Facade;

public class Luce {
    String descrizione;

    public Luce(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void accendiLuce(){
        System.out.println("Luce accesa: " + descrizione);
    }

    public void spegniLuce(){
        System.out.println("Luce spenta: " + descrizione);
    }
}
