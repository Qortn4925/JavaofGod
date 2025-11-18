package algoritm.leetcode.grind2;

import java.util.HashMap;
import java.util.Map;

public class RandSomeNote383 {
        // b 에 문자를 한 번씩 이용해서 a  를  구성 해 내자 .
    //  문자를 구성하기 위해선,  똑같은 알파벳과 , 동일 순서 를 가져야 한다.
    // 이문제에선 순서를 통해 구현해 내는건 원하지 않으니, 구성만 같으면 된다.
    // b 의 구성 요소가  a 를 만들 수 있는 구성요소를 가지고 있다면  ok!
    //1 .  배열 로 알파벳 갯수 받아서 ,  각 번호에 갯수를 저장 ,
    //2.  Map  key, values,  같으니까  특정 요소의 갯수를 파악하기엔 이만한게 없다.
    class Solution {
        // Map 을 통해  구성요소가 , 같거나 만흥면 ㅇㅋ
        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> map = new HashMap<>();
            for( Character a : magazine.toCharArray()) {
                map.put(a,map.getOrDefault(a,0)+1);
            }

            for( Character b : ransomNote.toCharArray()) {
                if (!map.containsKey(b) || map.get(b) == 0) return false;
                map.put(b, map.get(b) - 1);
            }
            return true;
        }
    }

}
