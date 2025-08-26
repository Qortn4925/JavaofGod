package javainflearn.polymorphism.ex1;

public class Ex1Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        cat.sound();
        cow.sound();
        dog.sound();

    }
}
