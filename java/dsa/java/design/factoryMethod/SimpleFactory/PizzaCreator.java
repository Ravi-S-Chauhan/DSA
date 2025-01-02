package dsa.java.design.factoryMethod.SimpleFactory;

public class PizzaCreator extends Pizza{
    PizzaFactory pf;
    public PizzaCreator(PizzaFactory pf){
        this.pf = pf;
    }

    public Pizza createPizza(String s){
        Pizza pz = pf.createPizza(s);
        pz.prepare();
        return pz;
    }


}
