package Decorator.CondimentDecorator;

import Decorator.Pizza.Pizza;

public abstract class CondimentDecorator extends Pizza {
    Pizza pizza;
    public abstract String getDescription();
}
