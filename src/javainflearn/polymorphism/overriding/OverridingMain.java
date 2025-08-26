package javainflearn.polymorphism.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child > Child");
        System.out.println("Child. value" + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("Parent > Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();

        Parent upParent = new Child();
        System.out.println("Parent > Child");
        System.out.println("upParent.value = " + upParent.value);
        upParent.method();
        //  Parent,  parent
    }
}
