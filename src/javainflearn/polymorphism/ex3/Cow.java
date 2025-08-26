package javainflearn.polymorphism.ex3;

public class Cow extends AbstractAnimal{
    @Override
    public void sound() {
        System.out.println(" 음머 음머");
    }

    @Override
    public void move() {
        System.out.println(" 소가 움직임");
    }
}
