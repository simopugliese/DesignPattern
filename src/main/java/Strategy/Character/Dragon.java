package Strategy.Character;

import Strategy.Behavior.FireBehavior;

public class Dragon extends Character{
    public Dragon() {
        fightBehavior = new FireBehavior();
    }
    public void display() {
        System.out.println("I'm a dragon");
    }
}
