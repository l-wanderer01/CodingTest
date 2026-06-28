import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] remainder = new int[10];

        while (A > 1) {
            remainder[A % B] += 1;
            A /= B;
        }

        int sum = 0; // 나머지들이 등장한 횟수를 제곱한 합
        for (int i = 0; i < remainder.length; i++) {
            sum += Math.pow(remainder[i], 2);
        }

        System.out.printf("%d", sum);
    }
}