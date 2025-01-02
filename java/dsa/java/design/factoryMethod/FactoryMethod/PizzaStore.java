package dsa.java.design.factoryMethod.FactoryMethod;

public abstract class PizzaStore {

    public Pizza orderPizza(String style){
        Pizza pizza = createPizza(style);

        pizza.cook();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String style);
}
