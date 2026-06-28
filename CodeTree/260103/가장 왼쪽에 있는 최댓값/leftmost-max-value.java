import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int idx = arr.length, max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        while(idx >= 1) {
            max = 0;
            int tmp = 0;
            for (int i = 0; i < idx; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    tmp = i + 1;
                }
            }
            idx = tmp; // 최댓값 위치 index
            System.out.printf("%d ", idx);
            idx -= 1; // 최댓값 제외
        }
    }
}