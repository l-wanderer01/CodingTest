import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printStar(N);
    }

    private static void printStar(int N) {
        if (N == 0) return;
        
        printStar(N - 1);

        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}