import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        int num = 1;

        for (int col = N - 1; col >= 0; col--) {
            if ((N - 1 - col) % 2 == 0) {
                for (int row = N - 1; row >= 0; row--) {
                    arr[col][row] = num++;
                }
            }
            else {
                for (int row = 0; row < N; row++) {
                    arr[col][row] = num++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", arr[j][i]);
            }
            System.out.println();
        }
    }
}