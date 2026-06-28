import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[10];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            arr[n] += 1;
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}