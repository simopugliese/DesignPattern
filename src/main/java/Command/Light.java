package Command;

public class Light {
    String descrizione;

    public Light(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void on(){
        System.out.println("Accesa luce: " + descrizione);
    }

    public void off(){
        System.out.println("Spenta luce: " + descrizione);
    }
}
