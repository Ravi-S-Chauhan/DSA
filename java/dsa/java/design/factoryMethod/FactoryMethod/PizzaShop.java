package dsa.java.design.factoryMethod.FactoryMethod;

public class PizzaShop {
    public static void main(String[] args){
        PizzaStore mum = new MumbaiPizzaStore();
        Pizza mumbaiCheese = mum.orderPizza("MumbaiCheese");
        PizzaStore nyc = new NycPizzaStore();
        Pizza nycHot = nyc.orderPizza("hotPizza");
    }
}
