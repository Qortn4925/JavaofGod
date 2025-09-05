package collections.consumer;


@FunctionalInterface
public interface CustomInterface<T> {

    T myCall();

    default void printDefault() {
        System.out.println("CustomInterface.printDefault");
    }

    static  void printStatic() {
        System.out.println("CustomInterface.printStatic");
    }


}
