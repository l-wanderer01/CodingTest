import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        int[][] arr = new int[N][N];

        int num = 1;
        for (int i = 0; i < M; i++) {
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;
            
            arr[row][col] = num;
            num++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}