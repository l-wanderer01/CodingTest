import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = min;

        for (int i = 1; i < 100; i++) {
            int n = sc.nextInt();
            if (n == 999 || n == -999) break;
            if (min > n) min = n;
            else if (max < n) max = n;
        }

        System.out.printf("%d %d", max, min);
    }
}