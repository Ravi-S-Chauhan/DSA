package dsa.java.design.factoryMethod.FactoryMethod;

public class NycPizzaStore extends PizzaStore{

    public Pizza createPizza(String style){
        Pizza pizza;
        if (style.equals("cheese")){
            pizza = new NycCheesePizza();
        } else {
            pizza = new NycHotPizza();
        }
        return pizza;
    }
}
