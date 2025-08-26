package javainflearn.polymorphism.ex3;

public class Dog  extends AbstractAnimal{


    @Override
    public void sound() {
        System.out.println("멍멍ㄴ");
    }

    @Override
    public void move() {
        System.out.println(" 강아지 움직임");
    }
}
