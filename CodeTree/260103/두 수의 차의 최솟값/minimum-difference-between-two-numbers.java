import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int answer = Integer.MAX_VALUE;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 1; i < N; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < answer) answer = diff;
        }

        System.out.printf("%d", answer);
    }
}