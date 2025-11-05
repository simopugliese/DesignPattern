package Facade;

import java.util.List;

public class Simulator {
    public static void main(String[] args) {
        //con facade è molto breve
        //in questa implementazione si passano liste di luci, liste di amplificatori e liste di tende
        Facade facade = new Facade(
                List.of( new Luce("sala"), new Luce("divano")),
                List.of(new Amplificatore("amplificatore soffitto")),
                List.of(new Tenda("tenda finestra"), new Tenda("porta")));
        //si chiama il metodo desiderato sulla facciata
        facade.watchMovie();
        //se cambiano le esigenze basta modificare Facade e il Simulator continuerà a funzionare



        //senza facade sarebbe molto più lungo:
        Luce luceSala = new Luce("sala");
        Luce luceDivano = new Luce("divano");
        Amplificatore amplificatoreSala = new Amplificatore("amplificatore sala");
        Tenda tendaSala = new Tenda("sala");
        Tenda tendaSala2 = new Tenda("sala 2");

        luceSala.spegniLuce();
        luceDivano.spegniLuce();
        amplificatoreSala.amplificatoreOn();
        tendaSala.chiudiTenda();
        tendaSala2.chiudiTenda();
        // e per modificare qualcosa dovremmo rileggere molto codice
    }
}
