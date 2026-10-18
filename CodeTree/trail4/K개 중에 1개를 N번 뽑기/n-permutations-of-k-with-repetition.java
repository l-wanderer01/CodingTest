// 중복 순열 문제
import java.util.*;

public class Main {
    static int K, N;
    // static boolean[] isSelected; (중복 허용이기에 selected 관리 필요없음)
    static int[] res;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt(); // 숫자의 개수
        N = sc.nextInt(); // 순열 길이
        
        res = new int[N];
        // isSelected = new boolean[K+1];
        permutation(0);
    }

    static void permutation(int cnt) {

        if (cnt == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= K; i++) {
            // if (isSelected[i]) continue;
            // 중복되지 않은 수 선택
            // isSelected[i] = true;
            res[cnt] = i;
            // 다음 자리 수 뽑기
            permutation(cnt+1);
            // isSelected[i] = false;
            // res는 백업 안해도 된다. why? cnt값이 안바뀌니까 자동으로 res[cnt]가 덮어써지기 때문!
        }
    }
}