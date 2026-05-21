import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mul = A * B * C;

        int res = calcNum(mul);

        System.out.printf("%d", res);
    }

    private static int calcNum(int N) {
        if (N == 0) return 0;
        
        return N % 10 + calcNum(N/10);
    }
}