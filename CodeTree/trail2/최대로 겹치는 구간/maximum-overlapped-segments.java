import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] start = new int[N];
        int[] end = new int[N];
        boolean[] s = new boolean[201];
        boolean[] e = new boolean[201];

        for (int i = 0; i < N; i++) {
            start[i] = sc.nextInt()+100;
            s[start[i]] = true;
            end[i] = sc.nextInt()+100;
            e[end[i]] = true;
        }

        int[] lines = new int[201];
        for (int i = 0; i < N; i++) {
            for (int j = start[i]; j < end[i]; j++) {
                lines[j]++;
            }
        }

        // for (int i = 0; i <= 200; i++) {
        //     if (s[i] && e[i]) {
        //         lines[i]--;
        //     }
        // }

        Arrays.sort(lines);

        System.out.println(lines[200]);
    }
}