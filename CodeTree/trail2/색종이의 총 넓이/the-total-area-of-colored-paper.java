import java.util.Scanner;
public class Main {
    static boolean[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new boolean[200][200];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt()+100;
            int y = sc.nextInt()+100;
            fillExtent(x, y);
        }

        int extent = calcExtent();

        System.out.println(extent);
    }

    static void fillExtent(int x, int y) {
        for (int i = x; i < x+8; i++) {
            for (int j = y; j < y+8; j++) {
                if (map[i][j]) continue;
                map[i][j] = true;
            }
        }
    }

    static int calcExtent() {
        int res = 0;

        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (map[i][j]) res++;
            }
        }

        return res;
    }
}

// 가 8, 세 8, 넓 64 * N
// 좌측 하단 꼭지점
// 핵심 -> 겹치는걸 어케 처리할거냐
// 200x200 배열

// -100, -100 -> 0, 0
// 100, 100 -> 200, 200

// 색칠 함수
// static boolean[][] map = new boolean[200][200];

// static void calcExtent(int x, int y) {
//     for (int i = x; i < x+8; i++) {
//         for (int j = y; j < y+8; j++) {
//             if (map[i][j]) continue;
//             map[i][j] = true;
//         }
//     }
// }