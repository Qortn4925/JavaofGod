package effectivjava.ch2.item7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class item7Ex {

    public static void main(String[] args) {
        Stack stack = new Stack();

        for(int i =0; i<10; i++) {
            stack.push(i+"");
        }

//         . pop 해서 사용처가 끝난 객체는 참조를 날려야 하는데 아직 참조중
        for(int i =0; i<10; i++) {
            Object result =stack.pop();
            System.out.println("stack. pop ="+  result);
        }

        for (int i = 0; i < stack.elements.length; i++) {
            System.out.println("elements[" + i + "] = " + stack.elements[i]);
        }


        /*
        Map<Integer, String> map = new HashMap<>();
        Integer key1 =1000;
        Integer key2 = 2000;

        map.put(key1, "test a");
        map.put(key2, "test b");

        key1 =null;
        System.gc();
        map.entrySet().stream().forEach(el -> System.out.println(el));

        Map<Integer, String> weakHashMap = new WeakHashMap<>();

        Integer key3 =1000;
        Integer key4 = 2000;

        weakHashMap.put(key3, "test a");
        weakHashMap.put(key4, "test b");

        key3=null;

        System.gc();
        weakHashMap.entrySet().stream().forEach(el -> System.out.println(el));

         */
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap(1000, 0.75f, true) {
            private final static int MAX = 10;

            protected boolean removerEldesteEntry(Map.Entry<Integer, Integer> eldest) {
                return size() >= MAX;
            }
        };
        for( int i =0; i< 20; i++) {
            linkedHashMap.put(i,i);
        }
        for(Map.Entry<Integer,Integer>string : linkedHashMap.entrySet()){
            System.out.println("string = " + string);
        }

    }
}
