package Facade;

public class Tenda {
    String descrizione;

    public Tenda(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void apriTenda(){
        System.out.println("Tenda aperta: " + descrizione);
    }

    public void chiudiTenda(){
        System.out.println("Tenda chiusa: " + descrizione);
    }
}
