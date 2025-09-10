package algoritm.strategy.dq07;

import java.util.Arrays;

public class MatrixPower {
    // 행렬 곱셈 (n x n)
    public static long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] result = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // 단위 행렬 생성
    public static long[][] identity(int n) {
        long[][] I = new long[n][n];
        for (int i = 0; i < n; i++) {
            I[i][i] = 1;
        }
        return I;
    }

    // 분할 정복 거듭제곱
    public static long[][] power(long[][] A, long exp) {
        int n = A.length;
        if (exp == 0) return identity(n);  // A^0 = I
        if (exp == 1) return A;

        long[][] half = power(A, exp / 2);
        long[][] result = multiply(half, half);

        if (exp % 2 == 1) {
            result = multiply(result, A);
        }
        return result;
    }

    // 디버깅용 출력
    public static void printMatrix(long[][] M) {
        for (long[] row : M) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    // 실행 예시
    public static void main(String[] args) {
        long[][] A = {
                {1, 1},
                {1, 0}
        };

        long exp = 10; // A^10
        long[][] result = power(A, exp);

        System.out.println("A^" + exp + " =");
        printMatrix(result);
    }
}
