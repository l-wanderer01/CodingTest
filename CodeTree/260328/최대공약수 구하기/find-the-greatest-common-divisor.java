import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = gcd(n, m);

        System.out.printf("%d", result);
    }

    private static int gcd(int n, int m) {
        int max = n > m ? n : m;
        int min = n > m ? m : n;

        int tmp = max - min;
        if (tmp == 0) return max;
        else {
            max = tmp > min ? tmp : min;
            min = tmp > min ? min : tmp;
            return gcd(max, min);
        }
    }
}