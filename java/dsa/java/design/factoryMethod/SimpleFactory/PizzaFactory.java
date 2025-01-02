package dsa.java.design.factoryMethod.SimpleFactory;

public class PizzaFactory {
    public Pizza createPizza(String s){
        Pizza pizza;
        if (s.equals("MumbaiPizza")){
            pizza = new MumbaiPizza();
        } else {
            pizza = new blrPizza();
        }
        return pizza;
    }
}
