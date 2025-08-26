package javainflearn.polymorphism.ex2;

public class Ex2Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

//        cat.sound();
//        cow.sound();
//        dog.sound();

        Animal []
                animal = {cat, cow, dog};
        for (Animal animal1 : animal) {
            soundAnimal(animal1);
        }
    }
        // 업 캐스팅  <   Animal animal = (Animal) cat, cow, dog, <<  유지 보수 하기 훨씬 용이해짐 
//     민약   업캐스팅 된 인스턴의 오버라이딩 된 메소드에 접근한 결과가 , 부모의 메소드가 실행된다면 , 이런 코드를 짜는것이 불가능함.
    public static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 테스트 끝");
    }
}
