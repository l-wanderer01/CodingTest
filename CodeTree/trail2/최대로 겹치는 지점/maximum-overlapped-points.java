import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        int sMin = 100;
        int eMax = 0;

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            if (start[i] < sMin) sMin = start[i];
            end[i] = sc.nextInt();
            if (end[i] > eMax) eMax = end[i];
        }

        int res = 0;

        for (int i = sMin; i <= eMax; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (start[j] <= i && end[j] >= i) {
                    // System.out.println("start[j] <= i && end[j] >= i");
                    cnt++;
                }
            }
            if (cnt > res) {
                res = cnt;
                // System.out.println("cnt > res");
            }
        }

        System.out.println(res);
    }
}