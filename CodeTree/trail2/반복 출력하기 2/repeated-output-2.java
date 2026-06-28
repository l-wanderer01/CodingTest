import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        print(N);
    }

    private static void print(int N) {
        if (N == 0) return;
        print(N - 1);
        System.out.println("HelloWorld");
    }
}