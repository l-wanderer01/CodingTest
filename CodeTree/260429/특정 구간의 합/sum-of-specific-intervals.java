import java.util.*;

public class Main {

    static ArrayList<Integer> A = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        for (int i = 0; i < M; i++) {
            int a1 = sc.nextInt() - 1;
            int a2 = sc.nextInt() - 1;
            int res = sum(a1, a2);
            System.out.println(res);
        }
    }

    private static int sum(int a1, int a2) {
        int res = 0;
        for (int i = a1; i <= a2; i++) {
            res += A.get(i);
        }
        return res;
    }
}