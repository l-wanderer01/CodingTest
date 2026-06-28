import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1 = mkarr(arr1, sc);
        arr2 = mkarr(arr2, sc);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.print("No");
                break;
            }
            cnt++;
        }

        if (cnt == n) System.out.print("Yes");
    }

    private static int[] mkarr(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}