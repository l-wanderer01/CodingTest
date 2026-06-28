import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        double avg = 0;

        int N = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        String std = sc.next();

        for (int i = 0; i < N; i++) {
            if (arr[i].charAt(0) == std.charAt(0)) {
                cnt++;
                avg += arr[i].length();
            }
        }

        avg /= cnt;

        System.out.printf("%d %.2f", cnt, avg);
    }
}