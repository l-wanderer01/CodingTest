import java.util.*;

public class Main {

    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        countRes(N);

        System.out.printf("%d", res);
    }

    private static void countRes(int N) {
        if (N == 1) return;

        res += 1;
        if (N % 2 == 0) countRes(N / 2);
        else {
            countRes(N / 3);
        }
    }
}