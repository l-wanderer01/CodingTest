import java.util.*;

public class Main {

    static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sqrtSum(N);

        System.out.printf("%d", res);
    }

    private static int sqrtSum(int N) {
        if (N == 0) return 0;
        int num = N % 10;
        res += (int) Math.pow(num, 2);
        return sqrtSum(N / 10);
    }
}