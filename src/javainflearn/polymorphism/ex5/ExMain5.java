
package javainflearn.polymorphism.ex5;

import javainflearn.polymorphism.ex5.Cat;
import javainflearn.polymorphism.ex5.Cow;
import javainflearn.polymorphism.ex5.Dog;

public class ExMain5 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


        InterfaceAnimal[] animals = {dog, cat, cow};

        for (InterfaceAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("소리 시작");
        animal.sound();
        System.out.println("소리 끝");
    }

    static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("움직임 시작");
        animal.move();
        System.out.println("움직임 끝");
    }
    }

