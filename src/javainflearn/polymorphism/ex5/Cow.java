package javainflearn.polymorphism.ex5;

public class Cow implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("소 음머");
    }

    @Override
    public void move() {
        System.out.println("소 움직임");
    }
}
