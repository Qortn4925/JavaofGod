package algoritm.leetcode.grind1;

import java.util.HashMap;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        //문자라는건 알파벳으로 구성되어 있다.
        // 알파벳의 구성이 동일하다면.  같다라고 만들 수 있다고 봐야한다
        // 그렇다면 알파벳 구성을 파악하기 제일 좋은 방법은 무엇일까?
        // 정답은,  hashTable
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
         for(char alphabet : s.toCharArray()){
            map.put(alphabet,map.getOrDefault(alphabet,0)+1);
         }
        for(char alphabet : t.toCharArray()){
            tmap.put(alphabet,tmap.getOrDefault(alphabet,0)+1);
        }
        for(char alphabet: s.toCharArray()) {
             if( !map.get(alphabet).equals(tmap.get(alphabet)) ) return  false;
        }

        return  true;
    }
}