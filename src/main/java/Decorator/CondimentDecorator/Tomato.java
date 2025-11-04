package Decorator.CondimentDecorator;

import Decorator.Pizza.Pizza;

public class Tomato extends CondimentDecorator {
    Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() +
                ", Tomato";
    }

    public double cost() {
        return pizza.cost() + .20;
    }
}
