import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() - 1;

        int num = sc.nextInt();

        int max = isMax(n, num, sc);

        System.out.printf("%d", max);
    }

    private static int isMax(int n, int num, Scanner sc) {
        if (n == 0) return num;

        int tmp = sc.nextInt();

        if (num < tmp) return isMax(n - 1, tmp, sc);
        else return isMax(n - 1, num, sc);
    }
}