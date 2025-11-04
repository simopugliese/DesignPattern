package Factory;

import Factory.IngredientFactory.NaplesPizzaIngredientFactory;
import Factory.IngredientFactory.PizzaIngredientFactory;
import Factory.Pizza.CheesePizza;
import Factory.Pizza.Pizza;
import Factory.PizzaStore.NaplesPizzaStore;
import Factory.PizzaStore.PizzaStore;

public class Simulator {
    public static void main(String[] args) {
        PizzaStore naplesPizzaStore = new NaplesPizzaStore();
        PizzaIngredientFactory naplesIngredientFactory = new NaplesPizzaIngredientFactory();
        Pizza pizza = new CheesePizza(naplesIngredientFactory);
    }
}
