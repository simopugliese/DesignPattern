package Strategy;

import Strategy.Character.Character;
import Strategy.Character.Dragon;
import Strategy.Character.King;

public class Simulator{
    public static void main(String[] args) {
        Strategy.Character.Character lion= new King();
        lion.display();
        lion.performFight();
        lion.move();
        //move() potrebbe stampare un messaggio personalizzato fornendo un'implementazione nella classe King

        Character dragon = new Dragon();
        dragon.display();
        dragon.performFight();
        dragon.move();
        //move() potrebbe stampare un messaggio personalizzato fornendo un'implementazione nella classe Dragon

    }
}
