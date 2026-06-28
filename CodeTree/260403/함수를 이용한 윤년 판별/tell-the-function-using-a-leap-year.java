import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        System.out.println(isYoonnyeon(y));
    }

    private static boolean isYoonnyeon(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0 && n % 400 != 0) return false;
            return true;
        }
        return false;
    }
}