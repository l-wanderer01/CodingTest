import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 0; // 0 위치를 저장
        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            if (num == 0) break;
            else {
                nums[i] = num;
                idx++;
            }
        }

        int sum = 0; // 합계 계산

        for (int i = idx - 3; i < idx; i++) {
            sum += nums[i];
        }

        System.out.printf("%d", sum);
    }
}