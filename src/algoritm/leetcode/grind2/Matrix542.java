package algoritm.leetcode.grind2;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix542 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] result = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Step 1: 0인 위치를 큐에 넣고 방문 표시
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        // Step 2: 4방향 이동 정의 (상, 하, 좌, 우)
        int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        // Step 3: BFS 시작
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];

            // 4방향으로 퍼지기
            for (int[] dir : dirs) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                // 범위 안이고, 아직 방문 안 했다면
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY]) {
                    result[newX][newY] = result[x][y] + 1;
                    visited[newX][newY] = true;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }

        return result;
    }
}