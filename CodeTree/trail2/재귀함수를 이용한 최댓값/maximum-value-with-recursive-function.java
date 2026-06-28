import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = findMax(n, sc);

        System.out.printf("%d", max);
    }

    private static int findMax(int n, Scanner sc) {
        if (n == 1) return sc.nextInt();

        int current = sc.nextInt();
        int max = findMax(n - 1, sc);

        return Math.max(current, max);
    }
}