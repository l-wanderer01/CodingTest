import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int res = 0;

        for (int i = A; i <= B; i++) {
            if (isPerfectNumber(i)) res++;
        }

        System.out.printf("%d", res);
    }

    private static boolean isPerfectNumber(int n) {
        if (n % 2 != 0 && n % 10 != 5 && (n % 3 != 0 || n % 9 == 0)) return true;
        else return false;
    }
}