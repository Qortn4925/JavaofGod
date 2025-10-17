package algoritm.leetcode.grind2;

import java.util.Arrays;

public class KClosetPointstoOrigin974 {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];

        // 처음 k개를 result에 채워 넣음
        for (int i = 0; i < k; i++) {
            result[i] = points[i];
        }

        //  현재 result 중에서 가장 멀리 있는 점 찾기
        int maxIndex = 0;
        int maxDist = distance(result[0]);
        for (int i = 1; i < k; i++) {
            int dist = distance(result[i]);
            if (dist > maxDist) {
                maxDist = dist;
                maxIndex = i;
            }
        }

        //  나머지 점들 순회하면서 갱신
        for (int i = k; i < points.length; i++) {
            int dist = distance(points[i]);
            if (dist < maxDist) {
                // 더 가까운 점이면 교체
                result[maxIndex] = points[i];

                // 새로 가장 먼 점 갱신
                maxIndex = 0;
                maxDist = distance(result[0]);
                for (int j = 1; j < k; j++) {
                    int d = distance(result[j]);
                    if (d > maxDist) {
                        maxDist = d;
                        maxIndex = j;
                    }
                }
            }
        }

        return result;
    }

    // 거리 계산
    private static int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    public int[][] kCloset2(int [][] points,int k) {

        Arrays.sort(points ,(a,b)-> {
            int distA = a[0]*a[0] +a[1]*a[1];
            int distB = b[0]*b[0] +b[1]*b[1];

            return Integer.compare(distA,distB);
        });

        return Arrays.copyOfRange(points,0,k);
    }
}
