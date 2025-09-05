package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class List {


    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(1,2);


        for(int a: list1) {
            System.out.println("a = " + a);
        }

        Iterator<Integer> iterator = list1.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list1.forEach((e)-> System.out.println("e = " + e)) ;


    }

}
