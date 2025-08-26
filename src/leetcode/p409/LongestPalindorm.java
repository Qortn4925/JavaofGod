package leetcode.p409;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindorm {
    public int longestPalindrome(String s) {
        // 대칭일라면   홀수 개 인게 하나만 있어야 함
        //   그리고 갯수를 맞춰야 하니까 ,
        // 다 짝수개면 , 스트링 길이 만큼 리턴
        // 홀수개 ,   짝수개 가 하나 일떄 까지 뺴야하는데 , 홀수 개 만큼 카운트하면 되겠다

        Map<Character, Integer> map = new HashMap<>();
        int oddCount=0;
        for (Character ch: s.toCharArray()){
             map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // 이제 짝수개 홀수 갯수 카운트 ,
        for (Integer value : map.values()) {
            if (value % 2 != 0) { // 홀수인지 확인
                oddCount++;
            }
        }

        if(oddCount==0){
            return  s.length();
        }else{
            return  s.length()-oddCount +1;
        }
    }
}

