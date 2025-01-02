package dsa.java.design.factoryMethod.SimpleFactory;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    void prepare(){
        System.out.println(name);
        System.out.println(sauce);
        System.out.println(dough);
    }
}
