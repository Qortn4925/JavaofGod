package javainflearn.polymorphism.ex6;

public class Chicken extends AbstractAnimal implements  Fly{
    @Override
    public void sound() {
        System.out.println("치킨 울다");
    }

    @Override
    public void fly() {
        System.out.println("치킨 날다");
    }
}
