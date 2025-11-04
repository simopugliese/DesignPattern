package Decorator;

import Decorator.Pizza.*;
import Decorator.CondimentDecorator.*;

public class PizzaRest{
    public static void main(String[] args) {
        Pizza pizza = new Italian();
        System.out.println(pizza.getDescription() + " euro" + pizza.cost());

        Pizza pizza2 = new Italian();
        pizza2 = new Mozzarella(pizza2);
        pizza2 = new Mozzarella(pizza2);
        pizza2 = new Tomato(pizza2);

        System.out.println(pizza2.getDescription() + " euro" + pizza2.cost());
    }
}
