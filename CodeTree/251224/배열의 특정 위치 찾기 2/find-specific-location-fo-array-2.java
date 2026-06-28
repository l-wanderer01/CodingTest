import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int odd = 0, even = 0;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                even += sc.nextInt();
            }
            else {
                odd += sc.nextInt();
            }
        }

        int sum = Math.abs(odd - even);
        System.out.printf("%d", sum);
    }
}