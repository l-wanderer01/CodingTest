import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        func1(N);
        System.out.println();
        func2(N);
    }

    private static void func1(int N) {
        if (N == 0) return;
        
        func1(N - 1);
        System.out.printf("%d ", N);
    }

    private static int func2(int N) {
        System.out.printf("%d ", N);
        if (N == 1) return 1;
        return func2(N - 1);
    }
}