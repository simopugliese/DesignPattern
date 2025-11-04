package Factory;

import Factory.Pizza.Pizza;
import Factory.PizzaStore.NaplesPizzaStore;
import Factory.PizzaStore.PizzaStore;

public class Simulator {
    public static void main(String[] args) {
        // 1. Factory Method in azione:
        // Creiamo la "fabbrica" (il punto vendita) per lo stile Napoletano.
        PizzaStore naplesStore = new NaplesPizzaStore(); // Concrete Creator

        // --- ORDINE 1: Cheese Pizza ---
        System.out.println("--- Ordine per una Cheese Pizza Napoletana ---");

        // orderPizza() è il Template Method che chiama internamente createPizza().
        Pizza cheesePizza = naplesStore.orderPizza("cheese");

        System.out.println("Ordine completato: " + cheesePizza.getName()); // Naples Style Cheese Pizza

        System.out.println("\n-----------------------------------------------\n");

        // --- ORDINE 2: Clam Pizza ---
        System.out.println("--- Ordine per una Clam Pizza Napoletana ---");

        // La logica di Abstract Factory (NaplesPizzaIngredientFactory) viene usata
        // nella fase di prepare() per selezionare FreshClams, ThinCrustDough, ecc.
        Pizza clamPizza = naplesStore.orderPizza("clam");

        System.out.println("Ordine completato: " + clamPizza.getName()); // Naples Style Clam Pizza
    }
}