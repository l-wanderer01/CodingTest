import java.util.Scanner;
public class Main {
    static int[] line;
    // 시작 지점 : 1000
    static int idx;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        line = new int[2001];
        
        idx = 1000;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);
            move(num, dir);
        }

        int res = 0; // 2번 이상 지나간 영역의 개수
        for (int idx = 0; idx < 2001; idx++) {
            if (line[idx] > 1) {
                // System.out.println(idx + ": " + line[idx]);
                res++;
            }
            // if (cnt > 1) res++;

        }

        System.out.println(res);
    }

    static void move(int num, char dir) {
        if (dir == 'L') {
            for (int i = idx-1; i >= idx-num; i--) {
                line[i]++;
            }
            // System.out.println("dir == 'L' : " + (idx-num));
            idx -= num;
            // System.out.println(idx);
        }
        if (dir == 'R') {
            for (int i = idx; i < idx+num; i++) {
                line[i]++;
            }
            idx += num;
            // System.out.println(idx);
        }

    }
}