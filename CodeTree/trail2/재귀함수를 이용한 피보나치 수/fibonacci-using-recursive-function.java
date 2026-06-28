import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int res = fib(N);

        System.out.printf("%d", res);
    }

    private static int fib(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        return fib(n - 1) + fib(n - 2);
    }
}