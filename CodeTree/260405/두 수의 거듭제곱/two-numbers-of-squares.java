import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = square(a, b);

        System.out.printf("%d", result);
    }

    private static int square(int a, int b) {
        int total = a;
        
        for (int i = 2; i <= b; i++) {
            total *= a;
        }

        return total;
    }
}