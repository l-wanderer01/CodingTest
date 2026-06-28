import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = calc(N);

        System.out.println(result);
    }

    private static int calc(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        return sum / 10;
    }
}