package javainflearn.polymorphism.car1;

public class Driver {
    private  Car car;


    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.println("운전 시작");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
        System.out.println("운전 종료 ");
    }
}
