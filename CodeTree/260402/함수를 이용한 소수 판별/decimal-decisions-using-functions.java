import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = 0;

        for (int i = A; i <= B; i++) {
            if (isPrime(i)) result += i;
        }

        System.out.printf("%d", result);
    }

    // 소수판별법
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) { // 2부터 n-1까지 나눠지는 수가 있는지 확인
            if (n % i == 0) return false;
        }
        return true;
    }
}