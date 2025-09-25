package effectivjava.ch3.item11;

import effectivjava.ch3.item10.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class Item11Ex {

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "제니");

        System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
    }
}
