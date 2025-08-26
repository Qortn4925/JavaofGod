package javainflearn.polymorphism.ex6;

public class Bird extends  AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("새 울다");
    }

    @Override
    public void fly() {
        System.out.println("날다");
    }
}
