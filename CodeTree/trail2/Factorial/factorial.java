import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int res = factorial(N);

        System.out.printf("%d", res);
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }
}