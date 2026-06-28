import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int len = 0, cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            len += str.length();

            if (str.charAt(0) == 'a') {
                cnt++;
            }
        }

        System.out.printf("%d %d", len, cnt);
    }
}