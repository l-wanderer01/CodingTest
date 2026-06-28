import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        rec(N);
        // up(N);
    }

    private static void rec(int N) {
        if (N == 0) return;
        System.out.printf("%d ", N);
        rec(N - 1);
        System.out.printf("%d ", N);
    }
}