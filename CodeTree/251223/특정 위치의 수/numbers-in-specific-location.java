import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = nums[2] + nums[4] + nums[9];

        System.out.printf("%d", sum);
        
    }
}