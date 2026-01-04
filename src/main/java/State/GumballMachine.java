package State;

public class GumballMachine {
    // Tutti i possibili stati della macchina
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    // Variabile di istanza per lo stato corrente
    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    // Metodi delegati allo stato corrente
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        // Dispense è un metodo interno che viene chiamato dopo che la manovella è stata girata
        state.dispense();
    }

    // Metodi di utilità per cambiare stato e gestire le gomme
    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }

    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    // Getters per gli stati
    public State getState() { return state; }
    public State getSoldOutState() { return soldOutState; }
    public State getNoQuarterState() { return noQuarterState; }
    public State getHasQuarterState() { return hasQuarterState; }
    public State getSoldState() { return soldState; }

    @Override
    public String toString() {
        return "\nInvetario: " + count + " gumball" + (count != 1 ? "s" : "") + "\n" +
                "Stato attuale: " + state + "\n";
    }
}