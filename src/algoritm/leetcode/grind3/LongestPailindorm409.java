package algoritm.leetcode.grind3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestPailindorm409 {
    //예시를 작성해보면 결국 ,짝수들의 합에 +최대치의 홀수 값을 더한게 , 제일큰 값이다.
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character ch:s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean hasOdd= false;

        for(int count: map.values()){
            if(count%2==0){
                length+=count;
            }else{
                length+=(count-1);
                hasOdd=true;
            }
        }

        return hasOdd?length+1:length;

    }
}
