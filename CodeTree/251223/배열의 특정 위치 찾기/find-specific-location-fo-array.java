import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        int even = 0;
        double triple = 0;
        
        for (int i = 1; i < nums.length + 1; i++) {
            if (i % 2 == 0) even += nums[i - 1];
            if (i % 3 == 0) triple += nums[i - 1];
        }

        triple /= 3;
        
        System.out.printf("%d %.1f", even, triple);
    }
}