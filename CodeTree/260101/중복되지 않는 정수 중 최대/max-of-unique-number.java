import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[1001];

        int max = -1;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            arr[num] = arr[num] == 0 ? 1 : -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) max = i;
        }

        System.out.printf("%d", max);
    }
}