import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        int[][] arr = new int[N][M];

        // 짝수열: 증가, num 시작, 홀수열: 감소, num + N 시작
        int num = 0;
        for (int i = 0; i < M; i++) {
            int start = i % 2 == 0 ? num : num + N;
            int mul = i % 2 == 0 ? 1 : -1;
            for (int j = 0; j < N; j++) {
                arr[j][i] = num + j * mul;
                if (j == N - 1) {
                    if (i % 2 == 0) {
                        num += j + N;
                    }
                    else {
                        num += 1;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}