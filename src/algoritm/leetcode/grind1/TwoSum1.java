package algoritm.leetcode.grind1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
//음, target 을 충족시키는 index 두개를 찾아서  배열에 집어넣은후 반환하라.
    //1 번 for 문 두개 돌려서 ,  a+b가 target 인지 확인, 반환
    //2번  정렬해서 , target 보다 크다면 , 스킵, 횟수 줄이기 ,
    // 1번 풀이
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++) {
            for( int j =0; j<nums.length; j++) {
                 if(i==j) continue;
                 else if(i+j==target)  return new int[]{i,j};
            }
        }

        return new int[] {1,2};
    }
    // 조금 개선하기, 1번식의 문제는, 같은행위의 반복, + 필요 없는 범위의 탐색이 있다.
    // ex target 보다 num[i] 가 크다면 더이상 검사해볼 필요가 없기에 인덱스를 정해둘 필요가 있따.
    public int[] twoSum2(int[] nums, int target) {

        Arrays.sort(nums);
        int maxIndex=0;
        for(int i =0; i <nums.length; i++) {
            if(nums[i]>=target)  {
                maxIndex=i;
                break;
            }
        }
            for( int i =0; i<=maxIndex; i++){
                for(int j =0; j<=maxIndex;j++){
                    if(i==j) continue;
                    else if(i+j==target)  return new int[]{i,j};
                }
            }

        return new int[] {1,2};
    }
    // 하지만, 1,2도 결국 o(n^2)를 극복하진 못했다.
    public int[] twoSum3(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++) {
             map.put(nums[i],i);
        }

        for( int i =0; i<nums.length; i++) {
            int b= target-nums[i];
            Integer id2 = map.get(b);
            if(id2!=0) return new int[] {i,id2};
        }

        return new int[] {1,2};
    }
}

