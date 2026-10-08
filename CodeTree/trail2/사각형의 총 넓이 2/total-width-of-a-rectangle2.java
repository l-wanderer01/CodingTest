import java.util.Scanner;
public class Main {
    static boolean[][] map;
    static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        map = new boolean[200][200];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            int height = x2 - x1;
            int weight = y2 - y1;

            // 색종이 칠하기
            for (int r = x1; r < x1+height; r++) {
                for (int c = y1; c < y1+weight; c++) {
                    if (map[r][c]) continue;
                    map[r][c] = true;
                }
            }
        }
        
        calcMap();

        System.out.println(res);
    }

    static void calcMap() {
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (map[i][j]) res++;
            }
        }
    }
}