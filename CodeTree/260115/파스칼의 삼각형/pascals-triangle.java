import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            arr[i][0] = 1;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                if (arr[i - 1][j] == 0) break;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}