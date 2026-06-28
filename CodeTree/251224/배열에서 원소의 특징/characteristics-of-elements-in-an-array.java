import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int[] nums = new int[10];

        int answer = 0;

        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] % 3 == 0) {
                answer = nums[i - 1];
                break;
            }
        }

        System.out.printf("%d", answer);
    }
}