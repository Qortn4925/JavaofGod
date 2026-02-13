package algoritm.leetcode.grind3;

public class ClimbingStairs70 {

    //C(n) = C(n-1) + C(n-2)  ,  보다 한칸 낮은 지점에서 한칸 가서 가는 경우,  보다 두칸 낮은 지점에서 두칸 가는경우,
    public int climbStairs(int n) {
        if (n <= 1) return 1;

        int[] distance = new int[n + 1];
        distance[0] = 1;
        distance[1] = 1;

        for (int i = 2; i <= n; i++) {
            distance[i] = distance[i - 1] + distance[i - 2];
        }

        return distance[n];
    }
}
