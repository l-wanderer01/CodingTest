import java.util.Scanner;
public class Main {
    static int[][] map = new int[2001][2001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt() + 1000;
        int ay1 = sc.nextInt() + 1000;
        int ax2 = sc.nextInt() + 1000;
        int ay2 = sc.nextInt() + 1000;
        int bx1 = sc.nextInt() + 1000;
        int by1 = sc.nextInt() + 1000;
        int bx2 = sc.nextInt() + 1000;
        int by2 = sc.nextInt() + 1000;
        int mx1 = sc.nextInt() + 1000;
        int my1 = sc.nextInt() + 1000;
        int mx2 = sc.nextInt() + 1000;
        int my2 = sc.nextInt() + 1000;
        
        checkBox(ax1, ay1, ax2, ay2);
        checkBox(bx1, by1, bx2, by2);
        removeCheckBox(mx1, my1, mx2, my2);

        int res = checkOverlap();

        System.out.println(res);

        // for (int i = 0; i <= 2000; i++) {
        //     for (int j = 0; j <= 2000; j++) {
        //         System.out.print(map[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }

    static void checkBox(int x1, int y1, int x2, int y2) {
        for (int i = x2; i > x1; i--) {
            for (int j = y2; j > y1; j--) {
                if (map[i][j] == 1) continue;
                map[i][j]++;
            }
        }
    }

    static void removeCheckBox(int x1, int y1, int x2, int y2) {
        for (int i = x2; i > x1; i--) {
            for (int j = y2; j > y1; j--) {
                map[i][j]--;
            }
        }
    }

    static int checkOverlap() {
        int cnt = 0;

        for (int i = 0; i <= 2000; i++) {
            for (int j = 0; j <= 2000; j++) {
                if (map[i][j] == 1) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}