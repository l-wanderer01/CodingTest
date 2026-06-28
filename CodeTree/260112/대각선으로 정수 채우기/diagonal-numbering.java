import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        int num = 1, count = 0; // count: 현재 행과 열의 합

        int[][] arr = new int[N][M];
        
        while(count <= N + M - 2) {
            int row = count >= M ? count - M + 1 : 0;
            // col이 M-1(최대 인덱스)을 넘지 않도록 row를 1 더 키워줘야 함
            int col = count - row;
            while(row >= 0 && col >= 0 && row < N && col < M){
                arr[row++][col--] = num++;
            }
            count++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }        
    }
}