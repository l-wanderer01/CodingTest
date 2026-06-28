import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] res = swap(n, m);

        System.out.printf("%d %d", res[0], res[1]);
    }

    private static int[] swap(int a, int b) {
        int[] arr = new int[2];
        arr[0] = b;
        arr[1] = a;

        return arr;
    }
}