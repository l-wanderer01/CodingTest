import java.util.*;

public class Main {
    static int[] stacks;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int K = sc.nextInt(); // 명령이 총 불러지는 횟수
        stacks = new int[N+1];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt(); // A부터
            int B = sc.nextInt(); // B까지
            stack(A, B);
        }
        Arrays.sort(stacks);
        System.out.println(stacks[N]);
    }

    public static void stack(int A, int B) {
        for (int i = A; i <= B; i++) {
            stacks[i]++;
        }
    }
}