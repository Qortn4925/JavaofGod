package javainflearn.polymorphism.ex5;

public class Cat implements  InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("고양이 냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 움직임");
    }
}
