package javainflearn.polymorphism.ex6;

public class Ex6Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(cat);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }

    private static void flyAnimal(Fly flyAnimal) {
        System.out.println("동물 날기 테스트 시작");
        flyAnimal.fly();
        System.out.println("동물 날기 테스트 끝");
    }
}
