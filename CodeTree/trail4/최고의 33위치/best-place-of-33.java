import java.util.Scanner;
public class Main {
    static int[][] map;
    static int N;
    static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        res = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!inRange(i, j)) continue;

                int cnt = count(i, j);
                if (cnt > res) res = cnt;
            }
        }

        System.out.println(res);
    }

    static int count(int x, int y) {
        int cnt = 0;
        for (int r = x; r < x + 3; r++) {
            for (int c = y; c < y+3; c++) {
                if (map[r][c] == 1) cnt++;
            }
        }
        return cnt;
    }

    static boolean inRange(int x, int y) {
        if (x + 3 <= N && y + 3 <= N) return true;
        return false;
    }
}

// 3x3으로 했을 때, 동전 개수의 최댓값
