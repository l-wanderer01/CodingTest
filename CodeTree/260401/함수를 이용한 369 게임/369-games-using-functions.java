import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (i % 3 == 0 || has369(i)) cnt++;
        }

        System.out.printf("%d", cnt);
    }

    private static boolean has369(int n) {
        if (n == 0) return false;
        
        int digit = n % 10;
        if (digit % 3 == 0 && digit != 0) {
            return true;
        }

        return has369(n / 10);
    }
}