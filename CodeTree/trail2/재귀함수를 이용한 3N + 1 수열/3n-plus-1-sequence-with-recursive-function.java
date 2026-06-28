import java.util.*;

public class Main {

    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        calc(N);

        System.out.printf("%d", cnt);
    }

    private static int calc(int n) {
        if (n == 1) return 0;
        cnt += 1;
        if (n % 2 == 0) return calc(n / 2);
        else return calc(n * 3 + 1);
    }
}