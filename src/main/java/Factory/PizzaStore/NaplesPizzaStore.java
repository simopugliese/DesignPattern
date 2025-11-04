package Factory.PizzaStore;

import Factory.IngredientFactory.NaplesPizzaIngredientFactory;
import Factory.IngredientFactory.PizzaIngredientFactory;
import Factory.Pizza.CheesePizza;
import Factory.Pizza.ClamPizza;
import Factory.Pizza.Pizza;

public class NaplesPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NaplesPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Naples Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName(" Naples Style Clam Pizza");
        }
        return pizza;
    }
}