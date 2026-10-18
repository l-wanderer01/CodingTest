import java.util.*;

public class Main {
    static int K, N;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt(); // 숫자의 개수
        N = sc.nextInt(); // 순열 길이
        
        permutation(0, new int[N], new boolean[N]);
    }

    static void permutation(int cnt, int[] res, boolean[] isSelected) {

        if (cnt == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= K; i++) {
            isSelected[cnt] = true;
            res[cnt] = i;
            permutation(cnt+1, res, isSelected);
            isSelected[cnt] = false;
            // res는 백업 안해도 된다. why? cnt값이 안바뀌니까 자동으로 res[cnt]가 덮어써지기 때문!
        }
    }
}