import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        arr = abs(arr);

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    private static int[] abs(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 0 ? arr[i] * -1 : arr[i];
        }
        return arr;
    }
}