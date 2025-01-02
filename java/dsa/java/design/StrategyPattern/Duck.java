package dsa.java.design.StrategyPattern;

public class Duck {

    Fly fly;
    Quack quack;
    public Duck(Fly fly, Quack quack){
        this.fly = fly;
        this.quack = quack;
    }
    public void fly(){
        fly.duckFly();
    }
    public void quack(){
        quack.quackable();
    }

}
