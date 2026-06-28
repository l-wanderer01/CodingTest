import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int res = calc(N);

        System.out.printf("%d", res);
    }

    private static int calc(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;

        return n + calc(n - 2);
    }
};