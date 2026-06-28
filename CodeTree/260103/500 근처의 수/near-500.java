import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num > 500) {
                max = max > num ? num : max;
            }
            else {
                min = min < num ? num : min;
            }
        }

        System.out.printf("%d %d", min, max);
    }
}