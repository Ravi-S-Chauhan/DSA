package dsa.java.design.factoryMethod.FactoryMethod;

public abstract class Pizza {
    String name;
    String sauce;
    String crust;

    public void cook(){
        System.out.println("cooking.."+name+" with "+sauce+" "+crust);
    }

    public void cut(){
        System.out.println("cutting..");
    }

    public void box(){
        System.out.println("packing..");
    }
}
