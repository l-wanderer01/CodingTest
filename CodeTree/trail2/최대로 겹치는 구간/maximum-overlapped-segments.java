import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] start = new int[N];
        int[] end = new int[N];

        for (int i = 0; i < N; i++) {
            start[i] = sc.nextInt()+100;
            end[i] = sc.nextInt()+100;
        }

        int[] lines = new int[201];
        for (int i = 0; i < N; i++) {
            for (int j = start[i]; j < end[i]; j++) { // 끝점은 선분이 아니기에 제외시킨다!
                lines[j]++;
            }
        }

        Arrays.sort(lines);

        System.out.println(lines[200]);
    }
}