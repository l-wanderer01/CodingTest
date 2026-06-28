import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        while(cnt < Q) {
            int query = sc.nextInt();
            
            // 1 일때
            if (query == 1) {
                int a = sc.nextInt() - 1;
                System.out.println(arr[a]);
            }
            // 2 일떄
            else if (query == 2) {
                int b = sc.nextInt();
                int idx = 0;
                
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == b) {
                        idx = i + 1;
                        break;
                    }
                }

                System.out.println(idx);
            }
            // 3 일때
            else {
                int s = sc.nextInt() - 1, e = sc.nextInt() - 1;
                for (int i = s; i <= e; i++) {
                    System.out.printf("%d ", arr[i]);
                }
                System.out.println();
            }

            cnt++;
        }
    }
}