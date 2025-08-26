package javainflearn.polymorphism.ex3;

public class AbstractMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


        AbstractAnimal[] animals = {dog, cat, cow};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    static void soundAnimal(AbstractAnimal animal) {
        System.out.println("소리 시작");
        animal.sound();
        System.out.println("소리 끝");
    }

    static void moveAnimal(AbstractAnimal animal) {
        System.out.println("움직임 시작");
        animal.move();
        System.out.println("움직임 끝");
    }
}
