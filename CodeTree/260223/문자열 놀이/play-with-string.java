import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int Q = sc.nextInt();
        char[] arr = S.toCharArray();

        for (int i = 0; i < Q; i++) { // Q번 반복
            int option = sc.nextInt();
            if (option == 1) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                char tmp = arr[a];

                arr[a] = arr[b];
                arr[b] = tmp;
            }
            else {
                String x = sc.next();
                String y = sc.next();

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == x.charAt(0)) {
                        arr[j] = y.charAt(0);
                    }
                }
            }
            System.out.println(String.valueOf(arr));
        }
    }
}