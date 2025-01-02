package dsa.java.design.factoryMethod.SimpleFactory;

public class pizzaTest {
    public static void main(String[] args){
        PizzaFactory pf1 = new PizzaFactory();
        Pizza p1 = new PizzaCreator(pf1).createPizza("MumbaiPizza");
    }
}
