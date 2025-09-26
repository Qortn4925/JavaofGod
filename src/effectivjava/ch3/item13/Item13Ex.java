package effectivjava.ch3.item13;

import effectivjava.ch2.item7.Stack;
import effectivjava.ch3.item10.PhoneNumber;

public class Item13Ex {
    public static void main(String[] args) {

        PhoneNumber phoneNumber = new PhoneNumber(123, 123, 134);

        PhoneNumber clone = phoneNumber.clone();
        System.out.println("clone.hashCode() = " + clone.hashCode());
        System.out.println("clone.hashCode() = " + clone.toString());
        System.out.println("clone.hashCode() = " + clone.getClass());

        System.out.println("phoneNumber = " + phoneNumber.hashCode());
        System.out.println("phoneNumber = " + phoneNumber.toString());
        System.out.println("phoneNumber = " + phoneNumber.getClass());


        Stack stack = new Stack();
        stack.push(1);
        Stack clone1 = stack.clone();
        stack.pop();

        System.out.println("clone1.hashCode() = " + clone1.hashCode());
        System.out.println("clone1.hashCode() = " + clone1.toString());

        System.out.println("stack.hashCode() = " + stack.hashCode());
        System.out.println("stack.hashCode() = " + stack.toString());
    }
}
