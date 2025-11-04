package Strategy.Character;

import Strategy.Behavior.FightBehavior;

public abstract class Character{
    FightBehavior fightBehavior;
    // more
    public void Character() {
    }
    public void performFight() {
        fightBehavior.fight();
    }
    public abstract void display();
    public void move() {
        System.out.println("I'm moving!");
    }

    //con i setter possiamo settare dinamicamente i fight behavior
    public void setFightBehavior(FightBehavior fightBehavior) {
        this.fightBehavior = fightBehavior;
    }
}
