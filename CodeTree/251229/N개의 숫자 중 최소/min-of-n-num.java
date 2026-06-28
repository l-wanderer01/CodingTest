import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int min = sc.nextInt(), cnt = 1;

        for (int i = 1; i < N; i++) {
            int num = sc.nextInt();
            if (min > num) {
                cnt = 1;
                min = num;
            }
            else if (min == num) {
                cnt++;
            }
        }

        System.out.printf("%d %d", min, cnt);
    }
}