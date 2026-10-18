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
                res++;
            }
        }

        System.out.println(res);
    }

    static void move(int num, char dir) {
        int start = idx;
        int end = idx;

        // L일 때, 시작정점을 왼쪽으로 이동, R일 때, 끝 정점을 오른쪽으로 이동
        if (dir == 'L') {
            start = idx - num;
        }
        else {
            end = idx + num;
        }
        // 이동 칸 개수 누적합
        for (int i = start; i < end; i++) {
            line[i]++;
        }
        // L이면 idx를 num만큼 왼쪽으로 이동, R이면 idx를 num 만큼 오른쪽으로 이동
        if (dir == 'L') {
            idx -= num;
        }
        else {
            idx += num;
        }
    }
}