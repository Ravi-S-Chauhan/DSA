package dsa.java.design.StrategyPattern;

public class RubberDuck{
    public static void main(String[] args){
        Fly fly = new unFlyable();
        Quack quack = new noQuack();
        Duck rubber = new Duck(fly,quack);
        rubber.fly();
        rubber.quack();

        fly = new flyable();
        quack = new canQuack();
        Duck white = new Duck(fly,quack);
        white.fly();
        white.quack();
    }
}
