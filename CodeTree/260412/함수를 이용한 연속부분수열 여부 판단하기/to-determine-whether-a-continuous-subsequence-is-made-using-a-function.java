import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1_length = sc.nextInt();
        int n2_length = sc.nextInt();

        int[] n1 = create(n1_length, sc);
        int[] n2 = create(n2_length, sc);

        String res = check(n1, n2);

        System.out.printf("%s", res);

        sc.close();
    }

    private static int[] create(int n, Scanner sc) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    private static String check(int[] n1, int[] n2) {
        for (int i = 0; i <= n1.length - n2.length; i++) {
            boolean isSame = true;
            for (int j = 0; j < n2.length; j++) {
                if (n1[i + j] != n2[j]) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) return "Yes";
        }
        return "No";
    }
}