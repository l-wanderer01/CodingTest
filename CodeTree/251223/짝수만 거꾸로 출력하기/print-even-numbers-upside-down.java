import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] nums = new int[N];
        int idx = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                nums[idx] = num;
                idx++;
            }
        }

        for (int i = idx - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}