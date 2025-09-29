package algoritm.leetcode.grind1;

public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // 배열이 전부 음수일 수 있으므로 이렇게 시작
        int tempSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // 이전 부분합이 음수면 현재 원소부터 새로 시작
            if (tempSum < 0) { tempSum = nums[i]; }
            else {
                tempSum += nums[i];
            }

            if(tempSum>maxSum){
                maxSum=tempSum;
            }

            // 현재까지의 최대합 갱신
        }
        return maxSum;
    }
}