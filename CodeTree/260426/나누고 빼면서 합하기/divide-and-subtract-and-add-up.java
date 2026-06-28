import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];

        for(int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        int res = 0;

        while(M != 1) {
            res += A[M-1];
            if (M % 2 == 1) M = minus(M);
            else M = mod(M);
        }

        res += A[0];
        System.out.printf("%d", res);
    }

    private static int minus(int i) {
        return i-1;
    }

    private static int mod(int i) {
        return i/2;
    }
}