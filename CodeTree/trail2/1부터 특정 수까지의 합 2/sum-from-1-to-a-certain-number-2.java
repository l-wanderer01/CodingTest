import java.util.*;

public class Main {

    static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sum(N);
        
        System.out.printf("%d", res);
    }

    private static void sum(int N) {
        if (N == 0) return;
        res += N;
        sum(N - 1);
    }
}