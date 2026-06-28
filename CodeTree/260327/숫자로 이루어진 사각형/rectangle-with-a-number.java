import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num = 1;
        for (int i = 0; i < N; i++) {
            num = printline(N, num);
        }
    }

    private static int printline(int N, int num) {
        for (int i = 0; i < N; i++) {
            if (num % 10 == 0) num = 1;
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        return num;
    }
}