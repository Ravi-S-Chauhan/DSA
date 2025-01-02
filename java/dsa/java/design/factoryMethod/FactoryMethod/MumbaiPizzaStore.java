package dsa.java.design.factoryMethod.FactoryMethod;

public class MumbaiPizzaStore extends PizzaStore{
    public Pizza createPizza(String style){
        Pizza pizza;
        if (style.equals("MumbaiCheese")){
            pizza = new MumbaiCheesePizza();
        } else {
            pizza = new MumbaiHotPizza();
        }
        return pizza;
    }
}
