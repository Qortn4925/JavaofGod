package algoritm.leetcode.grind3;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    //O(n^2)
    public int[] productExceptSelf(int[] nums) {
        int [] answer= new int[nums.length];

        for(int i =0; i<nums.length; i++) {
            for(int j=0; j<nums.length;j++) {
                if(i!=j) {
                    answer[i] = nums[j] * answer[i];
                    answer[i] = nums[j] * answer[i];
                }
            }
        }
    return  answer;
    }
    // O(N)
    public int[] productExceptSelf2(int[] nums) {
        int [] left= new int[nums.length];
        int [] right= new int[nums.length];
        int [] answer= new int[nums.length];

         left[0]=1;
         right[nums.length-1]=1;

        // left 구하기
        for(int i=1; i<nums.length; i++) {
            left[i]=left[i-1]*nums[i-1];
        }

        for(int j=nums.length-2; j>-1; j--){
            right[j] = right[j + 1] * nums[j+1];
            System.out.println("left"+left[j]);
            System.out.println("right"+right[j]);
            answer[j]=left[j]*right[j];
        }
        return answer;

    }


}
