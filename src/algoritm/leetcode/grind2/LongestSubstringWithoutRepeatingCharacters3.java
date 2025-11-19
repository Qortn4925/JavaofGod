package algoritm.leetcode.grind2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LongestSubstringWithoutRepeatingCharacters3 {
    //  중복 검사와 > 일반적으로 map 을 이용해 
    // 최장거리 검사   이 문제는 결국 문자열의 어느 지점 부터 어느 지점까지 의 길이를 가진 걸 반환 할것인가,
    // 문제였다,  String 의  인덱스를 기억하기 위해  두개의 변수를 만들고, 점을 찾아가는 right, 변수와,  문자열의 시작지점을
    // 기억할 left 를 이용해 해결
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int longestLength = 0;
            int left =0;

            for (int right= 0; right <s.length(); right++) {
                char c = s.charAt(right);

                if( !map.containsKey(c) || map.get(c)>=left) {
                    left= map.get(c) +1;
                }
                map.put(c,right);
               longestLength= Math.max(longestLength,right-left+1);
            }
            return  longestLength;
        }
    }

}
