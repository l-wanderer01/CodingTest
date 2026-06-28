import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int res = 0;

        for (int i = A; i <= B; i++) {
            // 소수이면서 자릿수의 합이 짝수인 경우 카운트
            if (isPrime(i) && isDigitSumEven(i)) {
                res++;
            }
        }

        System.out.println(res);
    }

    // 소수 판별 함수
    private static boolean isPrime(int n) {
        if (n < 2) return false; // 1은 소수가 아님
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 모든 자릿수의 합이 짝수인지 판별하는 함수
    private static boolean isDigitSumEven(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // 마지막 자릿수를 더함
            n /= 10;       // 마지막 자릿수를 제거
        }
        return sum % 2 == 0;
    }
}