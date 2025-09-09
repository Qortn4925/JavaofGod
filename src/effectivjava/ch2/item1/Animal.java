package effectivjava.ch2.item1;

public interface Animal {
    void speak();
}


class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("멍멍");
    }
}

class Cat implements  Animal{

    @Override
    public void speak() {
        System.out.println("냐옹");
    }
}

class AnimalFactory  {

    public static Animal getAnimal(String type) {
        if("dog".equalsIgnoreCase(type)) {
            return  new Dog();
        }else if("cat".equalsIgnoreCase(type)){
            return new Cat();
        }
        throw new IllegalArgumentException("Unknown type");
    }


}

class AnimalFactoryExample {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("dog");
        Animal a2 = AnimalFactory.getAnimal("cat");
        a1.speak();
        a2.speak();
    }
}

